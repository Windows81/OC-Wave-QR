package io.realm.internal;

import io.realm.FrozenPendingRow;
import io.realm.RealmChangeListener;
import io.realm.RealmFieldType;
import io.realm.internal.core.NativeRealmAny;
import java.lang.ref.WeakReference;
import java.util.Date;
import java.util.UUID;
import org.bson.types.Decimal128;
import org.bson.types.ObjectId;

public class PendingRow implements Row {

    /* renamed from: A  reason: collision with root package name */
    public OsResults f40215A;

    /* renamed from: B  reason: collision with root package name */
    public RealmChangeListener f40216B;
    public WeakReference C;
    public boolean D;

    /* renamed from: z  reason: collision with root package name */
    public OsSharedRealm f40217z;

    /* renamed from: io.realm.internal.PendingRow$1  reason: invalid class name */
    class AnonymousClass1 implements RealmChangeListener<PendingRow> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ PendingRow f40218a;

        /* renamed from: b */
        public void a(PendingRow pendingRow) {
            this.f40218a.e();
        }
    }

    public interface FrontEnd {
        void a(Row row);
    }

    public OsMap A(long j2) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    public OsSet B(long j2, RealmFieldType realmFieldType) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    public NativeRealmAny C(long j2) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    public boolean D(long j2) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    public byte[] E(long j2) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    public void F() {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    public double G(long j2) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    public float H(long j2) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    public String I(long j2) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    public OsList M(long j2, RealmFieldType realmFieldType) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    public OsMap N(long j2, RealmFieldType realmFieldType) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    public RealmFieldType Q(long j2) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    public Row R(OsSharedRealm osSharedRealm) {
        return FrozenPendingRow.INSTANCE;
    }

    public long S() {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    public final void b() {
        this.f40215A.r(this, this.f40216B);
        this.f40215A = null;
        this.f40216B = null;
        this.f40217z.removePendingRow(this);
    }

    public void c() {
        if (this.f40215A != null) {
            e();
            return;
        }
        throw new IllegalStateException("The query has been executed. This 'PendingRow' is not valid anymore.");
    }

    public boolean d() {
        return false;
    }

    public final void e() {
        WeakReference weakReference = this.C;
        if (weakReference != null) {
            FrontEnd frontEnd = (FrontEnd) weakReference.get();
            if (frontEnd == null) {
                b();
            } else if (this.f40215A.o()) {
                UncheckedRow i2 = this.f40215A.i();
                b();
                if (i2 != null) {
                    if (this.D) {
                        i2 = CheckedRow.g(i2);
                    }
                    frontEnd.a(i2);
                    return;
                }
                frontEnd.a(InvalidRow.INSTANCE);
            } else {
                b();
            }
        } else {
            throw new IllegalStateException("The 'frontEnd' has not been set.");
        }
    }

    public Decimal128 f(long j2) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    public String[] getColumnNames() {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    public void h(long j2, String str) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    public boolean isLoaded() {
        return false;
    }

    public Table j() {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    public void k(long j2, boolean z2) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    public OsSet l(long j2) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    public ObjectId m(long j2) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    public UUID n(long j2) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    public boolean o(long j2) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    public long p(long j2) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    public OsList r(long j2) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    public void t(long j2, long j3) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    public Date x(long j2) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    public boolean y(long j2) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    public long z(String str) {
        throw new IllegalStateException("The pending query has not been executed.");
    }
}
