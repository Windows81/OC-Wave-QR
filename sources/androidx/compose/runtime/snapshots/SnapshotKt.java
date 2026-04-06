package androidx.compose.runtime.snapshots;

import androidx.collection.MutableScatterSet;
import androidx.compose.runtime.collection.ScatterSetWrapperKt;
import androidx.compose.runtime.internal.AtomicInt;
import androidx.compose.runtime.internal.SnapshotThreadLocal;
import androidx.compose.runtime.internal.WeakReference;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotIdSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class SnapshotKt {

    /* renamed from: a  reason: collision with root package name */
    public static final Function1 f15276a = new e();

    /* renamed from: b  reason: collision with root package name */
    public static final long f15277b = 0;

    /* renamed from: c  reason: collision with root package name */
    public static final SnapshotThreadLocal f15278c = new SnapshotThreadLocal();

    /* renamed from: d  reason: collision with root package name */
    public static final Object f15279d = new Object();

    /* renamed from: e  reason: collision with root package name */
    public static SnapshotIdSet f15280e;

    /* renamed from: f  reason: collision with root package name */
    public static long f15281f;

    /* renamed from: g  reason: collision with root package name */
    public static final SnapshotDoubleIndexHeap f15282g = new SnapshotDoubleIndexHeap();

    /* renamed from: h  reason: collision with root package name */
    public static final SnapshotWeakSet f15283h = new SnapshotWeakSet();

    /* renamed from: i  reason: collision with root package name */
    public static List f15284i = CollectionsKt.m();

    /* renamed from: j  reason: collision with root package name */
    public static List f15285j = CollectionsKt.m();

    /* renamed from: k  reason: collision with root package name */
    public static final GlobalSnapshot f15286k;

    /* renamed from: l  reason: collision with root package name */
    public static final Snapshot f15287l;

    /* renamed from: m  reason: collision with root package name */
    public static AtomicInt f15288m = new AtomicInt(0);

    static {
        SnapshotIdSet.Companion companion = SnapshotIdSet.D;
        f15280e = companion.a();
        long j2 = (long) 1;
        f15281f = SnapshotId_jvmKt.c(1) + j2;
        long j3 = f15281f;
        f15281f = j2 + j3;
        GlobalSnapshot globalSnapshot = new GlobalSnapshot(j3, companion.a());
        f15280e = f15280e.u(globalSnapshot.i());
        f15286k = globalSnapshot;
        f15287l = globalSnapshot;
    }

    public static final SnapshotIdSet E(SnapshotIdSet snapshotIdSet, long j2, long j3) {
        while (Intrinsics.l(j2, j3) < 0) {
            snapshotIdSet = snapshotIdSet.u(j2);
            j2 += (long) 1;
        }
        return snapshotIdSet;
    }

    public static final Object F(Function1 function1) {
        MutableScatterSet G;
        Object h0;
        GlobalSnapshot globalSnapshot = f15286k;
        synchronized (O()) {
            try {
                G = globalSnapshot.G();
                if (G != null) {
                    f15288m.a(1);
                }
                h0 = h0(globalSnapshot, function1);
            } finally {
            }
        }
        if (G != null) {
            try {
                List list = f15284i;
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((Function2) list.get(i2)).m(ScatterSetWrapperKt.a(G), globalSnapshot);
                }
            } finally {
                f15288m.a(-1);
            }
        }
        synchronized (O()) {
            try {
                H();
                if (G != null) {
                    Object[] objArr = G.f1967b;
                    long[] jArr = G.f1966a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i3 = 0;
                        while (true) {
                            long j2 = jArr[i3];
                            if ((((~j2) << 7) & j2 & -9187201950435737472L) != -9187201950435737472L) {
                                int i4 = 8 - ((~(i3 - length)) >>> 31);
                                for (int i5 = 0; i5 < i4; i5++) {
                                    if ((255 & j2) < 128) {
                                        b0((StateObject) objArr[(i3 << 3) + i5]);
                                    }
                                    j2 >>= 8;
                                }
                                if (i4 != 8) {
                                    break;
                                }
                            }
                            if (i3 == length) {
                                break;
                            }
                            i3++;
                        }
                    }
                    Unit unit = Unit.f40552a;
                }
            } finally {
            }
        }
        return h0;
    }

    public static final void G() {
        F(f15276a);
    }

    public static final void H() {
        SnapshotWeakSet snapshotWeakSet = f15283h;
        int e2 = snapshotWeakSet.e();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            Object obj = null;
            if (i2 >= e2) {
                break;
            }
            WeakReference weakReference = snapshotWeakSet.f()[i2];
            if (weakReference != null) {
                obj = weakReference.get();
            }
            if (obj != null && a0((StateObject) obj)) {
                if (i3 != i2) {
                    snapshotWeakSet.f()[i3] = weakReference;
                    snapshotWeakSet.d()[i3] = snapshotWeakSet.d()[i2];
                }
                i3++;
            }
            i2++;
        }
        for (int i4 = i3; i4 < e2; i4++) {
            snapshotWeakSet.f()[i4] = null;
            snapshotWeakSet.d()[i4] = 0;
        }
        if (i3 != e2) {
            snapshotWeakSet.g(i3);
        }
    }

    public static final Snapshot I(Snapshot snapshot, Function1 function1, boolean z2) {
        boolean z3 = snapshot instanceof MutableSnapshot;
        if (!z3 && snapshot != null) {
            return new TransparentObserverSnapshot(snapshot, function1, false, z2);
        }
        return new TransparentObserverMutableSnapshot(z3 ? (MutableSnapshot) snapshot : null, function1, (Function1) null, false, z2);
    }

    public static /* synthetic */ Snapshot J(Snapshot snapshot, Function1 function1, boolean z2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            function1 = null;
        }
        if ((i2 & 4) != 0) {
            z2 = false;
        }
        return I(snapshot, function1, z2);
    }

    public static final StateRecord K(StateRecord stateRecord) {
        StateRecord d0;
        Snapshot.Companion companion = Snapshot.f15255e;
        Snapshot c2 = companion.c();
        StateRecord d02 = d0(stateRecord, c2.i(), c2.f());
        if (d02 != null) {
            return d02;
        }
        synchronized (O()) {
            Snapshot c3 = companion.c();
            d0 = d0(stateRecord, c3.i(), c3.f());
        }
        if (d0 != null) {
            return d0;
        }
        c0();
        throw new KotlinNothingValueException();
    }

    public static final StateRecord L(StateRecord stateRecord, Snapshot snapshot) {
        StateRecord d0;
        StateRecord d02 = d0(stateRecord, snapshot.i(), snapshot.f());
        if (d02 != null) {
            return d02;
        }
        synchronized (O()) {
            d0 = d0(stateRecord, snapshot.i(), snapshot.f());
        }
        if (d0 != null) {
            return d0;
        }
        c0();
        throw new KotlinNothingValueException();
    }

    public static final Snapshot M() {
        Snapshot snapshot = (Snapshot) f15278c.a();
        return snapshot == null ? f15286k : snapshot;
    }

    public static final Unit N(SnapshotIdSet snapshotIdSet) {
        return Unit.f40552a;
    }

    public static final Object O() {
        return f15279d;
    }

    public static final Function1 P(Function1 function1, Function1 function12, boolean z2) {
        if (!z2) {
            function12 = null;
        }
        return (function1 == null || function12 == null || function1 == function12) ? function1 == null ? function12 : function1 : new d(function1, function12);
    }

    public static /* synthetic */ Function1 Q(Function1 function1, Function1 function12, boolean z2, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z2 = true;
        }
        return P(function1, function12, z2);
    }

    public static final Unit R(Function1 function1, Function1 function12, Object obj) {
        function1.invoke(obj);
        function12.invoke(obj);
        return Unit.f40552a;
    }

    public static final Function1 S(Function1 function1, Function1 function12) {
        return (function1 == null || function12 == null || function1 == function12) ? function1 == null ? function12 : function1 : new f(function1, function12);
    }

    public static final Unit T(Function1 function1, Function1 function12, Object obj) {
        function1.invoke(obj);
        function12.invoke(obj);
        return Unit.f40552a;
    }

    public static final StateRecord U(StateRecord stateRecord, StateObject stateObject) {
        StateRecord l0 = l0(stateObject);
        if (l0 != null) {
            l0.i(Long.MAX_VALUE);
            return l0;
        }
        StateRecord e2 = stateRecord.e(Long.MAX_VALUE);
        e2.h(stateObject.h());
        Intrinsics.g(e2, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.newOverwritableRecordLocked");
        stateObject.g(e2);
        Intrinsics.g(e2, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.newOverwritableRecordLocked");
        return e2;
    }

    public static final StateRecord V(StateRecord stateRecord, StateObject stateObject, Snapshot snapshot) {
        StateRecord W;
        synchronized (O()) {
            W = W(stateRecord, stateObject, snapshot);
        }
        return W;
    }

    public static final StateRecord W(StateRecord stateRecord, StateObject stateObject, Snapshot snapshot) {
        StateRecord U = U(stateRecord, stateObject);
        U.c(stateRecord);
        U.i(snapshot.i());
        return U;
    }

    public static final void X(Snapshot snapshot, StateObject stateObject) {
        snapshot.w(snapshot.j() + 1);
        Function1 k2 = snapshot.k();
        if (k2 != null) {
            k2.invoke(stateObject);
        }
    }

    public static final Map Y(long j2, MutableSnapshot mutableSnapshot, SnapshotIdSet snapshotIdSet) {
        SnapshotIdSet snapshotIdSet2;
        long[] jArr;
        HashMap hashMap;
        long[] jArr2;
        HashMap hashMap2;
        SnapshotIdSet snapshotIdSet3;
        long j3 = j2;
        MutableScatterSet G = mutableSnapshot.G();
        HashMap hashMap3 = null;
        if (G == null) {
            return null;
        }
        SnapshotIdSet s2 = mutableSnapshot.f().u(mutableSnapshot.i()).s(mutableSnapshot.H());
        Object[] objArr = G.f1967b;
        long[] jArr3 = G.f1966a;
        int length = jArr3.length - 2;
        if (length >= 0) {
            HashMap hashMap4 = null;
            int i2 = 0;
            while (true) {
                long j4 = jArr3[i2];
                if ((((~j4) << 7) & j4 & -9187201950435737472L) != -9187201950435737472L) {
                    int i3 = 8;
                    int i4 = 8 - ((~(i2 - length)) >>> 31);
                    int i5 = 0;
                    while (i5 < i4) {
                        if ((255 & j4) < 128) {
                            StateObject stateObject = (StateObject) objArr[(i2 << 3) + i5];
                            StateRecord h2 = stateObject.h();
                            StateRecord d0 = d0(h2, j3, snapshotIdSet);
                            if (d0 == null) {
                                jArr2 = jArr3;
                            } else {
                                jArr2 = jArr3;
                                StateRecord d02 = d0(h2, j3, s2);
                                if (d02 != null && !Intrinsics.d(d0, d02)) {
                                    snapshotIdSet3 = s2;
                                    StateRecord d03 = d0(h2, mutableSnapshot.i(), mutableSnapshot.f());
                                    if (d03 != null) {
                                        StateRecord i6 = stateObject.i(d02, d0, d03);
                                        if (i6 == null) {
                                            return null;
                                        }
                                        if (hashMap4 == null) {
                                            hashMap4 = new HashMap();
                                        }
                                        hashMap4.put(d0, i6);
                                        hashMap4 = hashMap4;
                                        hashMap2 = null;
                                    } else {
                                        c0();
                                        throw new KotlinNothingValueException();
                                    }
                                }
                            }
                            snapshotIdSet3 = s2;
                            hashMap2 = null;
                        } else {
                            SnapshotIdSet snapshotIdSet4 = snapshotIdSet;
                            jArr2 = jArr3;
                            hashMap2 = hashMap3;
                            snapshotIdSet3 = s2;
                        }
                        j4 >>= 8;
                        i5++;
                        hashMap3 = hashMap2;
                        i3 = 8;
                        jArr3 = jArr2;
                        s2 = snapshotIdSet3;
                        j3 = j2;
                    }
                    jArr = jArr3;
                    hashMap = hashMap3;
                    snapshotIdSet2 = s2;
                    int i7 = i3;
                    SnapshotIdSet snapshotIdSet5 = snapshotIdSet;
                    if (i4 != i7) {
                        return hashMap4;
                    }
                } else {
                    SnapshotIdSet snapshotIdSet6 = snapshotIdSet;
                    jArr = jArr3;
                    hashMap = hashMap3;
                    snapshotIdSet2 = s2;
                }
                if (i2 == length) {
                    hashMap3 = hashMap4;
                    break;
                }
                i2++;
                hashMap3 = hashMap;
                jArr3 = jArr;
                s2 = snapshotIdSet2;
                j3 = j2;
            }
        }
        return hashMap3;
    }

    public static final StateRecord Z(StateRecord stateRecord, StateObject stateObject, Snapshot snapshot, StateRecord stateRecord2) {
        StateRecord U;
        if (snapshot.h()) {
            snapshot.p(stateObject);
        }
        long i2 = snapshot.i();
        if (stateRecord2.g() == i2) {
            return stateRecord2;
        }
        synchronized (O()) {
            U = U(stateRecord, stateObject);
        }
        U.i(i2);
        if (stateRecord2.g() != SnapshotId_jvmKt.c(1)) {
            snapshot.p(stateObject);
        }
        return U;
    }

    public static final boolean a0(StateObject stateObject) {
        StateRecord stateRecord;
        long e2 = f15282g.e(f15281f);
        StateRecord stateRecord2 = null;
        StateRecord stateRecord3 = null;
        int i2 = 0;
        for (StateRecord h2 = stateObject.h(); h2 != null; h2 = h2.f()) {
            long g2 = h2.g();
            if (g2 != f15277b) {
                if (Intrinsics.l(g2, e2) >= 0) {
                    i2++;
                } else if (stateRecord2 == null) {
                    i2++;
                    stateRecord2 = h2;
                } else {
                    if (Intrinsics.l(h2.g(), stateRecord2.g()) < 0) {
                        stateRecord = stateRecord2;
                        stateRecord2 = h2;
                    } else {
                        stateRecord = h2;
                    }
                    if (stateRecord3 == null) {
                        stateRecord3 = stateObject.h();
                        StateRecord stateRecord4 = stateRecord3;
                        while (true) {
                            if (stateRecord3 == null) {
                                stateRecord3 = stateRecord4;
                                break;
                            } else if (Intrinsics.l(stateRecord3.g(), e2) >= 0) {
                                break;
                            } else {
                                if (Intrinsics.l(stateRecord4.g(), stateRecord3.g()) < 0) {
                                    stateRecord4 = stateRecord3;
                                }
                                stateRecord3 = stateRecord3.f();
                            }
                        }
                    }
                    stateRecord2.i(f15277b);
                    stateRecord2.c(stateRecord3);
                    stateRecord2 = stateRecord;
                }
            }
        }
        return i2 > 1;
    }

    public static final void b0(StateObject stateObject) {
        if (a0(stateObject)) {
            f15283h.a(stateObject);
        }
    }

    public static final Void c0() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
    }

    public static final StateRecord d0(StateRecord stateRecord, long j2, SnapshotIdSet snapshotIdSet) {
        StateRecord stateRecord2 = null;
        while (stateRecord != null) {
            if (n0(stateRecord, j2, snapshotIdSet) && (stateRecord2 == null || Intrinsics.l(stateRecord2.g(), stateRecord.g()) < 0)) {
                stateRecord2 = stateRecord;
            }
            stateRecord = stateRecord.f();
        }
        if (stateRecord2 != null) {
            return stateRecord2;
        }
        return null;
    }

    public static final StateRecord e0(StateRecord stateRecord, StateObject stateObject) {
        StateRecord d0;
        Snapshot.Companion companion = Snapshot.f15255e;
        Snapshot c2 = companion.c();
        Function1 g2 = c2.g();
        if (g2 != null) {
            g2.invoke(stateObject);
        }
        StateRecord d02 = d0(stateRecord, c2.i(), c2.f());
        if (d02 != null) {
            return d02;
        }
        synchronized (O()) {
            Snapshot c3 = companion.c();
            StateRecord h2 = stateObject.h();
            Intrinsics.g(h2, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.readable");
            d0 = d0(h2, c3.i(), c3.f());
            if (d0 == null) {
                c0();
                throw new KotlinNothingValueException();
            }
        }
        return d0;
    }

    public static final void f0(int i2) {
        f15282g.f(i2);
    }

    public static final Void g0() {
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    public static final Object h0(GlobalSnapshot globalSnapshot, Function1 function1) {
        long i2 = globalSnapshot.i();
        Object invoke = function1.invoke(f15280e.o(i2));
        long j2 = f15281f;
        f15281f = ((long) 1) + j2;
        f15280e = f15280e.o(i2);
        globalSnapshot.v(j2);
        globalSnapshot.u(f15280e);
        globalSnapshot.w(0);
        globalSnapshot.S((MutableScatterSet) null);
        globalSnapshot.q();
        f15280e = f15280e.u(j2);
        return invoke;
    }

    public static final Snapshot i0(Function1 function1) {
        return (Snapshot) F(new g(function1));
    }

    public static final Snapshot j0(Function1 function1, SnapshotIdSet snapshotIdSet) {
        Snapshot snapshot = (Snapshot) function1.invoke(snapshotIdSet);
        synchronized (O()) {
            f15280e = f15280e.u(snapshot.i());
            Unit unit = Unit.f40552a;
        }
        return snapshot;
    }

    public static final int k0(long j2, SnapshotIdSet snapshotIdSet) {
        int a2;
        long q2 = snapshotIdSet.q(j2);
        synchronized (O()) {
            a2 = f15282g.a(q2);
        }
        return a2;
    }

    public static final StateRecord l0(StateObject stateObject) {
        long e2 = f15282g.e(f15281f) - ((long) 1);
        SnapshotIdSet a2 = SnapshotIdSet.D.a();
        StateRecord stateRecord = null;
        for (StateRecord h2 = stateObject.h(); h2 != null; h2 = h2.f()) {
            if (h2.g() == f15277b) {
                return h2;
            }
            if (n0(h2, e2, a2)) {
                if (stateRecord != null) {
                    return Intrinsics.l(h2.g(), stateRecord.g()) < 0 ? h2 : stateRecord;
                }
                stateRecord = h2;
            }
        }
        return null;
    }

    public static final boolean m0(long j2, long j3, SnapshotIdSet snapshotIdSet) {
        return j3 != f15277b && Intrinsics.l(j3, j2) <= 0 && !snapshotIdSet.p(j3);
    }

    public static final boolean n0(StateRecord stateRecord, long j2, SnapshotIdSet snapshotIdSet) {
        return m0(j2, stateRecord.g(), snapshotIdSet);
    }

    public static final void o0(Snapshot snapshot) {
        long e2;
        if (!f15280e.p(snapshot.i())) {
            StringBuilder sb = new StringBuilder();
            sb.append("Snapshot is not open: snapshotId=");
            sb.append(snapshot.i());
            sb.append(", disposed=");
            sb.append(snapshot.e());
            sb.append(", applied=");
            MutableSnapshot mutableSnapshot = snapshot instanceof MutableSnapshot ? (MutableSnapshot) snapshot : null;
            sb.append(mutableSnapshot != null ? Boolean.valueOf(mutableSnapshot.F()) : "read-only");
            sb.append(", lowestPin=");
            synchronized (O()) {
                e2 = f15282g.e(-1);
            }
            sb.append(e2);
            throw new IllegalStateException(sb.toString().toString());
        }
    }

    public static final StateRecord p0(StateRecord stateRecord, StateObject stateObject, Snapshot snapshot) {
        StateRecord d0;
        if (snapshot.h()) {
            snapshot.p(stateObject);
        }
        long i2 = snapshot.i();
        StateRecord d02 = d0(stateRecord, i2, snapshot.f());
        if (d02 == null) {
            c0();
            throw new KotlinNothingValueException();
        } else if (d02.g() == snapshot.i()) {
            return d02;
        } else {
            synchronized (O()) {
                d0 = d0(stateObject.h(), i2, snapshot.f());
                if (d0 == null) {
                    c0();
                    throw new KotlinNothingValueException();
                } else if (d0.g() != i2) {
                    d0 = W(d0, stateObject, snapshot);
                }
            }
            Intrinsics.g(d0, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.writableRecord");
            if (d02.g() != SnapshotId_jvmKt.c(1)) {
                snapshot.p(stateObject);
            }
            return d0;
        }
    }
}
