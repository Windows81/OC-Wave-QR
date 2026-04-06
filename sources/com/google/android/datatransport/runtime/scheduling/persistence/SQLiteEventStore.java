package com.google.android.datatransport.runtime.scheduling.persistence;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.Priority;
import com.google.android.datatransport.runtime.EncodedPayload;
import com.google.android.datatransport.runtime.EventInternal;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.firebase.transport.ClientMetrics;
import com.google.android.datatransport.runtime.firebase.transport.GlobalMetrics;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import com.google.android.datatransport.runtime.firebase.transport.LogSourceMetrics;
import com.google.android.datatransport.runtime.firebase.transport.StorageMetrics;
import com.google.android.datatransport.runtime.firebase.transport.TimeWindow;
import com.google.android.datatransport.runtime.logging.Logging;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import com.google.android.datatransport.runtime.time.Clock;
import com.google.android.datatransport.runtime.util.PriorityMapping;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import javax.inject.Provider;
import javax.inject.Singleton;

@Singleton
public class SQLiteEventStore implements EventStore, SynchronizationGuard, ClientHealthMetricsStore {
    public static final Encoding E = Encoding.b("proto");

    /* renamed from: A  reason: collision with root package name */
    public final Clock f24257A;

    /* renamed from: B  reason: collision with root package name */
    public final Clock f24258B;
    public final EventStoreConfig C;
    public final Provider D;

    /* renamed from: z  reason: collision with root package name */
    public final SchemaManager f24259z;

    public interface Function<T, U> {
        Object apply(Object obj);
    }

    public static class Metadata {

        /* renamed from: a  reason: collision with root package name */
        public final String f24260a;

        /* renamed from: b  reason: collision with root package name */
        public final String f24261b;

        public Metadata(String str, String str2) {
            this.f24260a = str;
            this.f24261b = str2;
        }
    }

    public interface Producer<T> {
        Object a();
    }

    public SQLiteEventStore(Clock clock, Clock clock2, EventStoreConfig eventStoreConfig, SchemaManager schemaManager, Provider provider) {
        this.f24259z = schemaManager;
        this.f24257A = clock;
        this.f24258B = clock2;
        this.C = eventStoreConfig;
        this.D = provider;
    }

    public static /* synthetic */ List F1(SQLiteDatabase sQLiteDatabase) {
        return (List) c2(sQLiteDatabase.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), new z());
    }

    public static /* synthetic */ List G1(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            arrayList.add(TransportContext.a().b(cursor.getString(1)).d(PriorityMapping.b(cursor.getInt(2))).c(W1(cursor.getString(3))).a());
        }
        return arrayList;
    }

    public static /* synthetic */ Object L1(Map map, Cursor cursor) {
        while (cursor.moveToNext()) {
            long j2 = cursor.getLong(0);
            Set set = (Set) map.get(Long.valueOf(j2));
            if (set == null) {
                set = new HashSet();
                map.put(Long.valueOf(j2), set);
            }
            set.add(new Metadata(cursor.getString(1), cursor.getString(2)));
        }
        return null;
    }

    public static /* synthetic */ byte[] N1(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (cursor.moveToNext()) {
            byte[] blob = cursor.getBlob(0);
            arrayList.add(blob);
            i2 += blob.length;
        }
        byte[] bArr = new byte[i2];
        int i3 = 0;
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            byte[] bArr2 = (byte[]) arrayList.get(i4);
            System.arraycopy(bArr2, 0, bArr, i3, bArr2.length);
            i3 += bArr2.length;
        }
        return bArr;
    }

    public static /* synthetic */ Boolean Q1(Cursor cursor) {
        return Boolean.valueOf(cursor.getCount() > 0);
    }

    public static /* synthetic */ Object R1(String str, LogEventDropped.Reason reason, long j2, SQLiteDatabase sQLiteDatabase) {
        if (!((Boolean) c2(sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(reason.i())}), new n())).booleanValue()) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("log_source", str);
            contentValues.put("reason", Integer.valueOf(reason.i()));
            contentValues.put("events_dropped_count", Long.valueOf(j2));
            sQLiteDatabase.insert("log_event_dropped", (String) null, contentValues);
        } else {
            sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j2 + " WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(reason.i())});
        }
        return null;
    }

    public static /* synthetic */ Object S1(long j2, TransportContext transportContext, SQLiteDatabase sQLiteDatabase) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(j2));
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{transportContext.b(), String.valueOf(PriorityMapping.a(transportContext.d()))}) < 1) {
            contentValues.put("backend_name", transportContext.b());
            contentValues.put("priority", Integer.valueOf(PriorityMapping.a(transportContext.d())));
            sQLiteDatabase.insert("transport_contexts", (String) null, contentValues);
        }
        return null;
    }

    public static /* synthetic */ Object U0(Throwable th) {
        throw new SynchronizationException("Timed out while trying to acquire the lock.", th);
    }

    public static /* synthetic */ SQLiteDatabase W0(Throwable th) {
        throw new SynchronizationException("Timed out while trying to open db.", th);
    }

    public static byte[] W1(String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 0);
    }

    public static Encoding a2(String str) {
        return str == null ? E : Encoding.b(str);
    }

    public static /* synthetic */ Long b1(Cursor cursor) {
        if (cursor.moveToNext()) {
            return Long.valueOf(cursor.getLong(0));
        }
        return 0L;
    }

    public static String b2(Iterable iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(((PersistedEvent) it.next()).c());
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    public static Object c2(Cursor cursor, Function function) {
        try {
            return function.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    public static /* synthetic */ TimeWindow q1(long j2, SQLiteDatabase sQLiteDatabase) {
        return (TimeWindow) c2(sQLiteDatabase.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]), new s(j2));
    }

    public static /* synthetic */ Long w1(Cursor cursor) {
        if (!cursor.moveToNext()) {
            return null;
        }
        return Long.valueOf(cursor.getLong(0));
    }

    public final Long A0(SQLiteDatabase sQLiteDatabase, TransportContext transportContext) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(new String[]{transportContext.b(), String.valueOf(PriorityMapping.a(transportContext.d()))}));
        if (transportContext.c() != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(transportContext.c(), 0));
        } else {
            sb.append(" and extras is null");
        }
        return (Long) c2(sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), (String) null, (String) null, (String) null), new C0389c());
    }

    public Object E0(Function function) {
        SQLiteDatabase n0 = n0();
        n0.beginTransaction();
        try {
            Object apply = function.apply(n0);
            n0.setTransactionSuccessful();
            return apply;
        } finally {
            n0.endTransaction();
        }
    }

    public final /* synthetic */ Boolean E1(TransportContext transportContext, SQLiteDatabase sQLiteDatabase) {
        Long A0 = A0(sQLiteDatabase, transportContext);
        return A0 == null ? Boolean.FALSE : (Boolean) c2(n0().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{A0.toString()}), new j());
    }

    public final boolean G0() {
        return s0() * t0() >= this.C.f();
    }

    public final List H0(List list, Map map) {
        ListIterator listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            PersistedEvent persistedEvent = (PersistedEvent) listIterator.next();
            if (map.containsKey(Long.valueOf(persistedEvent.c()))) {
                EventInternal.Builder p2 = persistedEvent.b().p();
                for (Metadata metadata : (Set) map.get(Long.valueOf(persistedEvent.c()))) {
                    p2.c(metadata.f24260a, metadata.f24261b);
                }
                listIterator.set(PersistedEvent.a(persistedEvent.c(), persistedEvent.d(), p2.d()));
            }
        }
        return list;
    }

    public final /* synthetic */ List H1(TransportContext transportContext, SQLiteDatabase sQLiteDatabase) {
        List U1 = U1(sQLiteDatabase, transportContext, this.C.d());
        for (Priority priority : Priority.values()) {
            if (priority != transportContext.d()) {
                int d2 = this.C.d() - U1.size();
                if (d2 <= 0) {
                    break;
                }
                U1.addAll(U1(sQLiteDatabase, transportContext.f(priority), d2));
            }
        }
        return H0(U1, V1(sQLiteDatabase, U1));
    }

    public final /* synthetic */ ClientMetrics I1(Map map, ClientMetrics.Builder builder, Cursor cursor) {
        while (cursor.moveToNext()) {
            String string = cursor.getString(0);
            LogEventDropped.Reason e0 = e0(cursor.getInt(1));
            long j2 = cursor.getLong(2);
            if (!map.containsKey(string)) {
                map.put(string, new ArrayList());
            }
            ((List) map.get(string)).add(LogEventDropped.c().c(e0).b(j2).a());
        }
        X1(builder, map);
        return builder.e(w0()).d(o0()).c((String) this.D.get()).b();
    }

    public final /* synthetic */ Object J0(Cursor cursor) {
        while (cursor.moveToNext()) {
            int i2 = cursor.getInt(0);
            d((long) i2, LogEventDropped.Reason.MESSAGE_TOO_OLD, cursor.getString(1));
        }
        return null;
    }

    public final /* synthetic */ ClientMetrics J1(String str, Map map, ClientMetrics.Builder builder, SQLiteDatabase sQLiteDatabase) {
        return (ClientMetrics) c2(sQLiteDatabase.rawQuery(str, new String[0]), new p(this, map, builder));
    }

    public final /* synthetic */ Object K1(List list, TransportContext transportContext, Cursor cursor) {
        while (cursor.moveToNext()) {
            boolean z2 = false;
            long j2 = cursor.getLong(0);
            if (cursor.getInt(7) != 0) {
                z2 = true;
            }
            EventInternal.Builder o2 = EventInternal.a().n(cursor.getString(1)).i(cursor.getLong(2)).o(cursor.getLong(3));
            if (z2) {
                o2.h(new EncodedPayload(a2(cursor.getString(4)), cursor.getBlob(5)));
            } else {
                o2.h(new EncodedPayload(a2(cursor.getString(4)), Y1(j2)));
            }
            if (!cursor.isNull(6)) {
                o2.g(Integer.valueOf(cursor.getInt(6)));
            }
            if (!cursor.isNull(8)) {
                o2.l(Integer.valueOf(cursor.getInt(8)));
            }
            if (!cursor.isNull(9)) {
                o2.m(cursor.getString(9));
            }
            if (!cursor.isNull(10)) {
                o2.j(cursor.getBlob(10));
            }
            if (!cursor.isNull(11)) {
                o2.k(cursor.getBlob(11));
            }
            list.add(PersistedEvent.a(j2, transportContext, o2.d()));
        }
        return null;
    }

    public int L() {
        return ((Integer) E0(new y(this, this.f24257A.a() - this.C.c()))).intValue();
    }

    public final /* synthetic */ Integer L0(long j2, SQLiteDatabase sQLiteDatabase) {
        String[] strArr = {String.valueOf(j2)};
        c2(sQLiteDatabase.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr), new C0394h(this));
        return Integer.valueOf(sQLiteDatabase.delete("events", "timestamp_ms < ?", strArr));
    }

    public final /* synthetic */ Long M1(EventInternal eventInternal, TransportContext transportContext, SQLiteDatabase sQLiteDatabase) {
        if (G0()) {
            d(1, LogEventDropped.Reason.CACHE_FULL, eventInternal.n());
            return -1L;
        }
        long g0 = g0(sQLiteDatabase, transportContext);
        int e2 = this.C.e();
        byte[] a2 = eventInternal.e().a();
        boolean z2 = a2.length <= e2;
        ContentValues contentValues = new ContentValues();
        contentValues.put("context_id", Long.valueOf(g0));
        contentValues.put("transport_name", eventInternal.n());
        contentValues.put("timestamp_ms", Long.valueOf(eventInternal.f()));
        contentValues.put("uptime_ms", Long.valueOf(eventInternal.o()));
        contentValues.put("payload_encoding", eventInternal.e().b().a());
        contentValues.put("code", eventInternal.d());
        contentValues.put("num_attempts", 0);
        contentValues.put("inline", Boolean.valueOf(z2));
        contentValues.put("payload", z2 ? a2 : new byte[0]);
        contentValues.put("product_id", eventInternal.l());
        contentValues.put("pseudonymous_id", eventInternal.m());
        contentValues.put("experiment_ids_clear_blob", eventInternal.g());
        contentValues.put("experiment_ids_encrypted_blob", eventInternal.h());
        long insert = sQLiteDatabase.insert("events", (String) null, contentValues);
        if (!z2) {
            int ceil = (int) Math.ceil(((double) a2.length) / ((double) e2));
            for (int i2 = 1; i2 <= ceil; i2++) {
                byte[] copyOfRange = Arrays.copyOfRange(a2, (i2 - 1) * e2, Math.min(i2 * e2, a2.length));
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("event_id", Long.valueOf(insert));
                contentValues2.put("sequence_num", Integer.valueOf(i2));
                contentValues2.put("bytes", copyOfRange);
                sQLiteDatabase.insert("event_payloads", (String) null, contentValues2);
            }
        }
        for (Map.Entry entry : eventInternal.k().entrySet()) {
            ContentValues contentValues3 = new ContentValues();
            contentValues3.put("event_id", Long.valueOf(insert));
            contentValues3.put("name", (String) entry.getKey());
            contentValues3.put("value", (String) entry.getValue());
            sQLiteDatabase.insert("event_metadata", (String) null, contentValues3);
        }
        return Long.valueOf(insert);
    }

    public final /* synthetic */ Object O1(Cursor cursor) {
        while (cursor.moveToNext()) {
            int i2 = cursor.getInt(0);
            d((long) i2, LogEventDropped.Reason.MAX_RETRIES_REACHED, cursor.getString(1));
        }
        return null;
    }

    public void P(Iterable iterable) {
        if (iterable.iterator().hasNext()) {
            n0().compileStatement("DELETE FROM events WHERE _id in " + b2(iterable)).execute();
        }
    }

    public final /* synthetic */ Object P1(String str, String str2, SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.compileStatement(str).execute();
        c2(sQLiteDatabase.rawQuery(str2, (String[]) null), new k(this));
        sQLiteDatabase.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
        return null;
    }

    public final /* synthetic */ Object T1(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.compileStatement("DELETE FROM log_event_dropped").execute();
        sQLiteDatabase.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + this.f24257A.a()).execute();
        return null;
    }

    public final List U1(SQLiteDatabase sQLiteDatabase, TransportContext transportContext, int i2) {
        ArrayList arrayList = new ArrayList();
        Long A0 = A0(sQLiteDatabase, transportContext);
        if (A0 == null) {
            return arrayList;
        }
        c2(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline", "product_id", "pseudonymous_id", "experiment_ids_clear_blob", "experiment_ids_encrypted_blob"}, "context_id = ?", new String[]{A0.toString()}, (String) null, (String) null, (String) null, String.valueOf(i2)), new m(this, arrayList, transportContext));
        return arrayList;
    }

    public final Map V1(SQLiteDatabase sQLiteDatabase, List list) {
        HashMap hashMap = new HashMap();
        StringBuilder sb = new StringBuilder("event_id IN (");
        for (int i2 = 0; i2 < list.size(); i2++) {
            sb.append(((PersistedEvent) list.get(i2)).c());
            if (i2 < list.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(')');
        c2(sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb.toString(), (String[]) null, (String) null, (String) null, (String) null), new o(hashMap));
        return hashMap;
    }

    public final void X1(ClientMetrics.Builder builder, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            builder.a(LogSourceMetrics.c().c((String) entry.getKey()).b((List) entry.getValue()).a());
        }
    }

    public final byte[] Y1(long j2) {
        return (byte[]) c2(n0().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j2)}, (String) null, (String) null, "sequence_num"), new q());
    }

    public final Object Z1(Producer producer, Function function) {
        long a2 = this.f24258B.a();
        while (true) {
            try {
                return producer.a();
            } catch (SQLiteDatabaseLockedException e2) {
                if (this.f24258B.a() >= ((long) this.C.b()) + a2) {
                    return function.apply(e2);
                }
                SystemClock.sleep(50);
            }
        }
    }

    public void a() {
        E0(new C0392f(this));
    }

    public Iterable a0(TransportContext transportContext) {
        return (Iterable) E0(new C0388b(this, transportContext));
    }

    public Object b(SynchronizationGuard.CriticalSection criticalSection) {
        SQLiteDatabase n0 = n0();
        f0(n0);
        try {
            Object D2 = criticalSection.D();
            n0.setTransactionSuccessful();
            return D2;
        } finally {
            n0.endTransaction();
        }
    }

    public ClientMetrics c() {
        return (ClientMetrics) E0(new i(this, "SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new HashMap(), ClientMetrics.e()));
    }

    public void close() {
        this.f24259z.close();
    }

    public void d(long j2, LogEventDropped.Reason reason, String str) {
        E0(new C0393g(str, reason, j2));
    }

    public final LogEventDropped.Reason e0(int i2) {
        LogEventDropped.Reason reason = LogEventDropped.Reason.REASON_UNKNOWN;
        if (i2 == reason.i()) {
            return reason;
        }
        LogEventDropped.Reason reason2 = LogEventDropped.Reason.MESSAGE_TOO_OLD;
        if (i2 == reason2.i()) {
            return reason2;
        }
        LogEventDropped.Reason reason3 = LogEventDropped.Reason.CACHE_FULL;
        if (i2 == reason3.i()) {
            return reason3;
        }
        LogEventDropped.Reason reason4 = LogEventDropped.Reason.PAYLOAD_TOO_BIG;
        if (i2 == reason4.i()) {
            return reason4;
        }
        LogEventDropped.Reason reason5 = LogEventDropped.Reason.MAX_RETRIES_REACHED;
        if (i2 == reason5.i()) {
            return reason5;
        }
        LogEventDropped.Reason reason6 = LogEventDropped.Reason.INVALID_PAYLOD;
        if (i2 == reason6.i()) {
            return reason6;
        }
        LogEventDropped.Reason reason7 = LogEventDropped.Reason.SERVER_ERROR;
        if (i2 == reason7.i()) {
            return reason7;
        }
        Logging.a("SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", Integer.valueOf(i2));
        return reason;
    }

    public final void f0(SQLiteDatabase sQLiteDatabase) {
        Z1(new C0387a(sQLiteDatabase), new l());
    }

    public final long g0(SQLiteDatabase sQLiteDatabase, TransportContext transportContext) {
        Long A0 = A0(sQLiteDatabase, transportContext);
        if (A0 != null) {
            return A0.longValue();
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("backend_name", transportContext.b());
        contentValues.put("priority", Integer.valueOf(PriorityMapping.a(transportContext.d())));
        contentValues.put("next_request_ms", 0);
        if (transportContext.c() != null) {
            contentValues.put("extras", Base64.encodeToString(transportContext.c(), 0));
        }
        return sQLiteDatabase.insert("transport_contexts", (String) null, contentValues);
    }

    public PersistedEvent g1(TransportContext transportContext, EventInternal eventInternal) {
        Logging.b("SQLiteEventStore", "Storing event with priority=%s, name=%s for destination %s", transportContext.d(), eventInternal.n(), transportContext.b());
        long longValue = ((Long) E0(new x(this, eventInternal, transportContext))).longValue();
        if (longValue < 1) {
            return null;
        }
        return PersistedEvent.a(longValue, transportContext, eventInternal);
    }

    public void j0(TransportContext transportContext, long j2) {
        E0(new C0391e(j2, transportContext));
    }

    public long m0() {
        return s0() * t0();
    }

    public SQLiteDatabase n0() {
        SchemaManager schemaManager = this.f24259z;
        Objects.requireNonNull(schemaManager);
        return (SQLiteDatabase) Z1(new t(schemaManager), new u());
    }

    public long n1(TransportContext transportContext) {
        return ((Long) c2(n0().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{transportContext.b(), String.valueOf(PriorityMapping.a(transportContext.d()))}), new w())).longValue();
    }

    public final GlobalMetrics o0() {
        return GlobalMetrics.b().b(StorageMetrics.c().b(m0()).c(EventStoreConfig.f24252a.f()).a()).a();
    }

    public Iterable p0() {
        return (Iterable) E0(new v());
    }

    public final long s0() {
        return n0().compileStatement("PRAGMA page_count").simpleQueryForLong();
    }

    public boolean s1(TransportContext transportContext) {
        return ((Boolean) E0(new C0390d(this, transportContext))).booleanValue();
    }

    public final long t0() {
        return n0().compileStatement("PRAGMA page_size").simpleQueryForLong();
    }

    public void u1(Iterable iterable) {
        if (iterable.iterator().hasNext()) {
            E0(new A(this, "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + b2(iterable), "SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name"));
        }
    }

    public final TimeWindow w0() {
        return (TimeWindow) E0(new r(this.f24257A.a()));
    }
}
