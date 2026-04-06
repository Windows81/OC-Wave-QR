package androidx.compose.runtime.snapshots;

import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata
public final class TransparentObserverSnapshot extends Snapshot {

    /* renamed from: g  reason: collision with root package name */
    public final Snapshot f15361g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f15362h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f15363i;

    /* renamed from: j  reason: collision with root package name */
    public Function1 f15364j;

    /* renamed from: k  reason: collision with root package name */
    public final Function1 f15365k;

    /* renamed from: l  reason: collision with root package name */
    public final long f15366l;

    /* renamed from: m  reason: collision with root package name */
    public final Snapshot f15367m;

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0016, code lost:
        r5 = r5.g();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public TransparentObserverSnapshot(androidx.compose.runtime.snapshots.Snapshot r5, kotlin.jvm.functions.Function1 r6, boolean r7, boolean r8) {
        /*
            r4 = this;
            long r0 = androidx.compose.runtime.snapshots.SnapshotKt.f15277b
            androidx.compose.runtime.snapshots.SnapshotIdSet$Companion r2 = androidx.compose.runtime.snapshots.SnapshotIdSet.D
            androidx.compose.runtime.snapshots.SnapshotIdSet r2 = r2.a()
            r3 = 0
            r4.<init>(r0, r2, r3)
            r4.f15361g = r5
            r4.f15362h = r7
            r4.f15363i = r8
            if (r5 == 0) goto L_0x001c
            kotlin.jvm.functions.Function1 r5 = r5.g()
            if (r5 != 0) goto L_0x0024
        L_0x001c:
            androidx.compose.runtime.snapshots.GlobalSnapshot r5 = androidx.compose.runtime.snapshots.SnapshotKt.f15286k
            kotlin.jvm.functions.Function1 r5 = r5.g()
        L_0x0024:
            kotlin.jvm.functions.Function1 r5 = androidx.compose.runtime.snapshots.SnapshotKt.P(r6, r5, r7)
            r4.f15364j = r5
            long r5 = androidx.compose.runtime.internal.Thread_jvmKt.a()
            r4.f15366l = r5
            r4.f15367m = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.TransparentObserverSnapshot.<init>(androidx.compose.runtime.snapshots.Snapshot, kotlin.jvm.functions.Function1, boolean, boolean):void");
    }

    public final Snapshot C() {
        Snapshot snapshot = this.f15361g;
        return snapshot == null ? SnapshotKt.f15286k : snapshot;
    }

    /* renamed from: D */
    public Function1 g() {
        return this.f15364j;
    }

    public final long E() {
        return this.f15366l;
    }

    /* renamed from: F */
    public Void m(Snapshot snapshot) {
        SnapshotStateMapKt.b();
        throw new KotlinNothingValueException();
    }

    /* renamed from: G */
    public Void n(Snapshot snapshot) {
        SnapshotStateMapKt.b();
        throw new KotlinNothingValueException();
    }

    public void H(Function1 function1) {
        this.f15364j = function1;
    }

    public void d() {
        Snapshot snapshot;
        t(true);
        if (this.f15363i && (snapshot = this.f15361g) != null) {
            snapshot.d();
        }
    }

    public SnapshotIdSet f() {
        return C().f();
    }

    public boolean h() {
        return C().h();
    }

    public long i() {
        return C().i();
    }

    public Function1 k() {
        return this.f15365k;
    }

    public void o() {
        C().o();
    }

    public void p(StateObject stateObject) {
        C().p(stateObject);
    }

    public Snapshot x(Function1 function1) {
        Function1 Q = SnapshotKt.Q(function1, g(), false, 4, (Object) null);
        return !this.f15362h ? SnapshotKt.I(C().x((Function1) null), Q, true) : C().x(Q);
    }
}
