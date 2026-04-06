package io.realm.internal.objectstore;

import io.realm.ImportFlag;
import io.realm.MutableRealmInteger;
import io.realm.RealmAny;
import io.realm.RealmAnyNativeFunctionsImpl;
import io.realm.RealmModel;
import io.realm.internal.NativeContext;
import io.realm.internal.OsSharedRealm;
import io.realm.internal.RealmAnyNativeFunctions;
import io.realm.internal.Table;
import io.realm.internal.UncheckedRow;
import java.io.Closeable;
import java.util.Date;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import org.bson.types.Decimal128;
import org.bson.types.ObjectId;

public class OsObjectBuilder implements Closeable {
    public static ItemCallback F = new ItemCallback<RealmModel>() {
    };
    public static ItemCallback G = new ItemCallback<String>() {
    };
    public static ItemCallback H = new ItemCallback<Byte>() {
    };
    public static ItemCallback I = new ItemCallback<Short>() {
    };
    public static ItemCallback J = new ItemCallback<Integer>() {
    };
    public static ItemCallback K = new ItemCallback<Long>() {
    };
    public static ItemCallback L = new ItemCallback<Boolean>() {
    };
    public static ItemCallback M = new ItemCallback<Float>() {
    };
    public static ItemCallback N = new ItemCallback<Double>() {
    };
    public static ItemCallback O = new ItemCallback<Date>() {
    };
    public static ItemCallback P = new ItemCallback<byte[]>() {
    };
    public static ItemCallback Q = new ItemCallback<MutableRealmInteger>() {
    };
    public static ItemCallback R = new ItemCallback<Decimal128>() {
    };
    public static ItemCallback S = new ItemCallback<ObjectId>() {
    };
    public static ItemCallback T = new ItemCallback<UUID>() {
    };
    public static ItemCallback U = new ItemCallback<Map.Entry<String, Boolean>>() {
    };
    public static ItemCallback V = new ItemCallback<Map.Entry<String, String>>() {
    };
    public static ItemCallback W = new ItemCallback<Map.Entry<String, Integer>>() {
    };
    public static ItemCallback X = new ItemCallback<Map.Entry<String, Float>>() {
    };
    public static ItemCallback Y = new ItemCallback<Map.Entry<String, Long>>() {
    };
    public static ItemCallback Z = new ItemCallback<Map.Entry<String, Short>>() {
    };
    public static ItemCallback a0 = new ItemCallback<Map.Entry<String, Byte>>() {
    };
    public static ItemCallback b0 = new ItemCallback<Map.Entry<String, Double>>() {
    };
    public static ItemCallback c0 = new ItemCallback<Map.Entry<String, byte[]>>() {
    };
    public static ItemCallback d0 = new ItemCallback<Map.Entry<String, Date>>() {
    };
    public static ItemCallback e0 = new ItemCallback<Map.Entry<String, Decimal128>>() {
    };
    public static ItemCallback f0 = new ItemCallback<Map.Entry<String, ObjectId>>() {
    };
    public static ItemCallback g0 = new ItemCallback<Map.Entry<String, UUID>>() {
    };
    public static ItemCallback h0 = new ItemCallback<Map.Entry<String, RealmAny>>() {

        /* renamed from: a  reason: collision with root package name */
        public final RealmAnyNativeFunctions f40353a = new RealmAnyNativeFunctionsImpl();
    };
    public static ItemCallback i0 = new ItemCallback<RealmAny>() {

        /* renamed from: a  reason: collision with root package name */
        public final RealmAnyNativeFunctions f40354a = new RealmAnyNativeFunctionsImpl();
    };
    public static ItemCallback j0 = new ItemCallback<String>() {
    };
    public static ItemCallback k0 = new ItemCallback<Boolean>() {
    };
    public static ItemCallback l0 = new ItemCallback<Integer>() {
    };
    public static ItemCallback m0 = new ItemCallback<Long>() {
    };
    public static ItemCallback n0 = new ItemCallback<Short>() {
    };
    public static ItemCallback o0 = new ItemCallback<Byte>() {
    };
    public static ItemCallback p0 = new ItemCallback<Float>() {
    };
    public static ItemCallback q0 = new ItemCallback<Double>() {
    };
    public static ItemCallback r0 = new ItemCallback<byte[]>() {
    };
    public static ItemCallback s0 = new ItemCallback<Date>() {
    };
    public static ItemCallback t0 = new ItemCallback<Decimal128>() {
    };
    public static ItemCallback u0 = new ItemCallback<ObjectId>() {
    };
    public static ItemCallback v0 = new ItemCallback<UUID>() {
    };
    public static ItemCallback w0 = new ItemCallback<RealmAny>() {

        /* renamed from: a  reason: collision with root package name */
        public final RealmAnyNativeFunctions f40355a = new RealmAnyNativeFunctionsImpl();
    };

    /* renamed from: A  reason: collision with root package name */
    public final long f40350A;

    /* renamed from: B  reason: collision with root package name */
    public final long f40351B = nativeCreateBuilder();
    public final long C;
    public final NativeContext D;
    public final boolean E;

    /* renamed from: z  reason: collision with root package name */
    public final Table f40352z;

    public interface ItemCallback<T> {
    }

    public OsObjectBuilder(Table table, Set set) {
        OsSharedRealm n2 = table.n();
        this.f40350A = n2.getNativePtr();
        this.f40352z = table;
        table.j();
        this.C = table.getNativePtr();
        this.D = n2.context;
        this.E = set.contains(ImportFlag.CHECK_SAME_VALUES_BEFORE_SET);
    }

    private static native void nativeAddBoolean(long j2, long j3, boolean z2);

    private static native void nativeAddInteger(long j2, long j3, long j4);

    private static native void nativeAddNull(long j2, long j3);

    private static native void nativeAddString(long j2, long j3, String str);

    private static native long nativeCreateBuilder();

    private static native long nativeCreateOrUpdateTopLevelObject(long j2, long j3, long j4, boolean z2, boolean z3);

    private static native void nativeDestroyBuilder(long j2);

    public void a(long j2, Boolean bool) {
        if (bool == null) {
            nativeAddNull(this.f40351B, j2);
        } else {
            nativeAddBoolean(this.f40351B, j2, bool.booleanValue());
        }
    }

    public void b(long j2, Integer num) {
        if (num == null) {
            nativeAddNull(this.f40351B, j2);
            return;
        }
        nativeAddInteger(this.f40351B, j2, (long) num.intValue());
    }

    public void c(long j2, Long l2) {
        if (l2 == null) {
            nativeAddNull(this.f40351B, j2);
            return;
        }
        nativeAddInteger(this.f40351B, j2, l2.longValue());
    }

    public void close() {
        nativeDestroyBuilder(this.f40351B);
    }

    public void d(long j2, String str) {
        if (str == null) {
            nativeAddNull(this.f40351B, j2);
        } else {
            nativeAddString(this.f40351B, j2, str);
        }
    }

    public UncheckedRow f() {
        try {
            return new UncheckedRow(this.D, this.f40352z, nativeCreateOrUpdateTopLevelObject(this.f40350A, this.C, this.f40351B, false, false));
        } finally {
            close();
        }
    }

    public void g() {
        try {
            nativeCreateOrUpdateTopLevelObject(this.f40350A, this.C, this.f40351B, true, this.E);
        } finally {
            close();
        }
    }
}
