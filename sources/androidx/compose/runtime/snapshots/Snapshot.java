package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.PreconditionsKt;
import androidx.compose.runtime.internal.Thread_jvmKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public abstract class Snapshot {

    /* renamed from: e  reason: collision with root package name */
    public static final Companion f15255e = new Companion((DefaultConstructorMarker) null);

    /* renamed from: f  reason: collision with root package name */
    public static final int f15256f = 8;

    /* renamed from: a  reason: collision with root package name */
    public SnapshotIdSet f15257a;

    /* renamed from: b  reason: collision with root package name */
    public long f15258b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f15259c;

    /* renamed from: d  reason: collision with root package name */
    public int f15260d;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final void j(Function2 function2) {
            synchronized (SnapshotKt.O()) {
                SnapshotKt.f15284i = CollectionsKt.w0(SnapshotKt.f15284i, function2);
                Unit unit = Unit.f40552a;
            }
        }

        public static final void l(Function1 function1) {
            synchronized (SnapshotKt.O()) {
                SnapshotKt.f15285j = CollectionsKt.w0(SnapshotKt.f15285j, function1);
                Unit unit = Unit.f40552a;
            }
            SnapshotKt.G();
        }

        public final Snapshot c() {
            return SnapshotKt.M();
        }

        public final Snapshot d() {
            return (Snapshot) SnapshotKt.f15278c.a();
        }

        public final boolean e() {
            return SnapshotKt.f15278c.a() != null;
        }

        public final Snapshot f(Snapshot snapshot) {
            if (snapshot instanceof TransparentObserverMutableSnapshot) {
                TransparentObserverMutableSnapshot transparentObserverMutableSnapshot = (TransparentObserverMutableSnapshot) snapshot;
                if (transparentObserverMutableSnapshot.X() == Thread_jvmKt.a()) {
                    transparentObserverMutableSnapshot.a0((Function1) null);
                    return snapshot;
                }
            }
            if (snapshot instanceof TransparentObserverSnapshot) {
                TransparentObserverSnapshot transparentObserverSnapshot = (TransparentObserverSnapshot) snapshot;
                if (transparentObserverSnapshot.E() == Thread_jvmKt.a()) {
                    transparentObserverSnapshot.H((Function1) null);
                    return snapshot;
                }
            }
            Snapshot J = SnapshotKt.J(snapshot, (Function1) null, false, 6, (Object) null);
            J.l();
            return J;
        }

        public final void g() {
            SnapshotKt.M().o();
        }

        public final Object h(Function1 function1, Function1 function12, Function0 function0) {
            Snapshot snapshot;
            Snapshot l2;
            if (function1 == null && function12 == null) {
                return function0.invoke();
            }
            Snapshot snapshot2 = (Snapshot) SnapshotKt.f15278c.a();
            MutableSnapshot mutableSnapshot = null;
            if (snapshot2 instanceof TransparentObserverMutableSnapshot) {
                TransparentObserverMutableSnapshot transparentObserverMutableSnapshot = (TransparentObserverMutableSnapshot) snapshot2;
                if (transparentObserverMutableSnapshot.X() == Thread_jvmKt.a()) {
                    Function1 J = transparentObserverMutableSnapshot.g();
                    Function1 k2 = transparentObserverMutableSnapshot.k();
                    try {
                        ((TransparentObserverMutableSnapshot) snapshot2).a0(SnapshotKt.Q(function1, J, false, 4, (Object) null));
                        ((TransparentObserverMutableSnapshot) snapshot2).b0(SnapshotKt.S(function12, k2));
                        return function0.invoke();
                    } finally {
                        transparentObserverMutableSnapshot.a0(J);
                        transparentObserverMutableSnapshot.b0(k2);
                    }
                }
            }
            if (snapshot2 == null || (snapshot2 instanceof MutableSnapshot)) {
                if (snapshot2 instanceof MutableSnapshot) {
                    mutableSnapshot = (MutableSnapshot) snapshot2;
                }
                snapshot = new TransparentObserverMutableSnapshot(mutableSnapshot, function1, function12, true, false);
            } else if (function1 == null) {
                return function0.invoke();
            } else {
                snapshot = snapshot2.x(function1);
            }
            try {
                l2 = snapshot.l();
                Object invoke = function0.invoke();
                snapshot.s(l2);
                snapshot.d();
                return invoke;
            } catch (Throwable th) {
                snapshot.d();
                throw th;
            }
        }

        public final ObserverHandle i(Function2 function2) {
            Object unused = SnapshotKt.F(SnapshotKt.f15276a);
            synchronized (SnapshotKt.O()) {
                SnapshotKt.f15284i = CollectionsKt.y0(SnapshotKt.f15284i, function2);
                Unit unit = Unit.f40552a;
            }
            return new b(function2);
        }

        public final ObserverHandle k(Function1 function1) {
            synchronized (SnapshotKt.O()) {
                SnapshotKt.f15285j = CollectionsKt.y0(SnapshotKt.f15285j, function1);
                Unit unit = Unit.f40552a;
            }
            SnapshotKt.G();
            return new c(function1);
        }

        public final void m(Snapshot snapshot, Snapshot snapshot2, Function1 function1) {
            if (snapshot != snapshot2) {
                snapshot2.s(snapshot);
                snapshot2.d();
            } else if (snapshot instanceof TransparentObserverMutableSnapshot) {
                ((TransparentObserverMutableSnapshot) snapshot).a0(function1);
            } else if (snapshot instanceof TransparentObserverSnapshot) {
                ((TransparentObserverSnapshot) snapshot).H(function1);
            } else {
                throw new IllegalStateException(("Non-transparent snapshot was reused: " + snapshot).toString());
            }
        }

        public final void n() {
            boolean K;
            synchronized (SnapshotKt.O()) {
                K = SnapshotKt.f15286k.K();
            }
            if (K) {
                SnapshotKt.G();
            }
        }

        public final MutableSnapshot o(Function1 function1, Function1 function12) {
            MutableSnapshot T;
            Snapshot M = SnapshotKt.M();
            MutableSnapshot mutableSnapshot = M instanceof MutableSnapshot ? (MutableSnapshot) M : null;
            if (mutableSnapshot != null && (T = mutableSnapshot.T(function1, function12)) != null) {
                return T;
            }
            throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
        }

        public final Snapshot p(Function1 function1) {
            return SnapshotKt.M().x(function1);
        }

        public Companion() {
        }
    }

    public /* synthetic */ Snapshot(long j2, SnapshotIdSet snapshotIdSet, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, snapshotIdSet);
    }

    public final void A(Snapshot snapshot) {
        if (!(SnapshotKt.f15278c.a() == this)) {
            PreconditionsKt.b("Cannot leave snapshot; " + this + " is not the current snapshot");
        }
        s(snapshot);
    }

    public final void B() {
        if (this.f15259c) {
            PreconditionsKt.a("Cannot use a disposed snapshot");
        }
    }

    public final void b() {
        synchronized (SnapshotKt.O()) {
            c();
            r();
            Unit unit = Unit.f40552a;
        }
    }

    public void c() {
        SnapshotKt.f15280e = SnapshotKt.f15280e.o(i());
    }

    public void d() {
        this.f15259c = true;
        synchronized (SnapshotKt.O()) {
            q();
            Unit unit = Unit.f40552a;
        }
    }

    public final boolean e() {
        return this.f15259c;
    }

    public SnapshotIdSet f() {
        return this.f15257a;
    }

    public abstract Function1 g();

    public abstract boolean h();

    public long i() {
        return this.f15258b;
    }

    public int j() {
        return 0;
    }

    public abstract Function1 k();

    public Snapshot l() {
        Snapshot snapshot = (Snapshot) SnapshotKt.f15278c.a();
        SnapshotKt.f15278c.b(this);
        return snapshot;
    }

    public abstract void m(Snapshot snapshot);

    public abstract void n(Snapshot snapshot);

    public abstract void o();

    public abstract void p(StateObject stateObject);

    public final void q() {
        int i2 = this.f15260d;
        if (i2 >= 0) {
            SnapshotKt.f0(i2);
            this.f15260d = -1;
        }
    }

    public void r() {
        q();
    }

    public void s(Snapshot snapshot) {
        SnapshotKt.f15278c.b(snapshot);
    }

    public final void t(boolean z2) {
        this.f15259c = z2;
    }

    public void u(SnapshotIdSet snapshotIdSet) {
        this.f15257a = snapshotIdSet;
    }

    public void v(long j2) {
        this.f15258b = j2;
    }

    public void w(int i2) {
        throw new IllegalStateException("Updating write count is not supported for this snapshot");
    }

    public abstract Snapshot x(Function1 function1);

    public final int y() {
        int i2 = this.f15260d;
        this.f15260d = -1;
        return i2;
    }

    public final Snapshot z() {
        return l();
    }

    public Snapshot(long j2, SnapshotIdSet snapshotIdSet) {
        this.f15257a = snapshotIdSet;
        this.f15258b = j2;
        this.f15260d = j2 != SnapshotKt.f15277b ? SnapshotKt.k0(j2, f()) : -1;
    }
}
