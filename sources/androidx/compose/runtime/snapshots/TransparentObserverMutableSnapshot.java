package androidx.compose.runtime.snapshots;

import androidx.collection.MutableScatterSet;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata
public final class TransparentObserverMutableSnapshot extends MutableSnapshot {

    /* renamed from: s  reason: collision with root package name */
    public final MutableSnapshot f15355s;

    /* renamed from: t  reason: collision with root package name */
    public final boolean f15356t;

    /* renamed from: u  reason: collision with root package name */
    public final boolean f15357u;

    /* renamed from: v  reason: collision with root package name */
    public Function1 f15358v;

    /* renamed from: w  reason: collision with root package name */
    public Function1 f15359w;

    /* renamed from: x  reason: collision with root package name */
    public final long f15360x;

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000c, code lost:
        r0 = r7.g();
     */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public TransparentObserverMutableSnapshot(androidx.compose.runtime.snapshots.MutableSnapshot r7, kotlin.jvm.functions.Function1 r8, kotlin.jvm.functions.Function1 r9, boolean r10, boolean r11) {
        /*
            r6 = this;
            long r1 = androidx.compose.runtime.snapshots.SnapshotKt.f15277b
            androidx.compose.runtime.snapshots.SnapshotIdSet$Companion r0 = androidx.compose.runtime.snapshots.SnapshotIdSet.D
            androidx.compose.runtime.snapshots.SnapshotIdSet r3 = r0.a()
            if (r7 == 0) goto L_0x0012
            kotlin.jvm.functions.Function1 r0 = r7.g()
            if (r0 != 0) goto L_0x001a
        L_0x0012:
            androidx.compose.runtime.snapshots.GlobalSnapshot r0 = androidx.compose.runtime.snapshots.SnapshotKt.f15286k
            kotlin.jvm.functions.Function1 r0 = r0.g()
        L_0x001a:
            kotlin.jvm.functions.Function1 r4 = androidx.compose.runtime.snapshots.SnapshotKt.P(r8, r0, r10)
            if (r7 == 0) goto L_0x0026
            kotlin.jvm.functions.Function1 r8 = r7.k()
            if (r8 != 0) goto L_0x002e
        L_0x0026:
            androidx.compose.runtime.snapshots.GlobalSnapshot r8 = androidx.compose.runtime.snapshots.SnapshotKt.f15286k
            kotlin.jvm.functions.Function1 r8 = r8.k()
        L_0x002e:
            kotlin.jvm.functions.Function1 r5 = androidx.compose.runtime.snapshots.SnapshotKt.S(r9, r8)
            r0 = r6
            r0.<init>(r1, r3, r4, r5)
            r6.f15355s = r7
            r6.f15356t = r10
            r6.f15357u = r11
            kotlin.jvm.functions.Function1 r7 = super.g()
            r6.f15358v = r7
            kotlin.jvm.functions.Function1 r7 = super.k()
            r6.f15359w = r7
            long r7 = androidx.compose.runtime.internal.Thread_jvmKt.a()
            r6.f15360x = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.TransparentObserverMutableSnapshot.<init>(androidx.compose.runtime.snapshots.MutableSnapshot, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, boolean, boolean):void");
    }

    public SnapshotApplyResult E() {
        return W().E();
    }

    public MutableScatterSet G() {
        return W().G();
    }

    /* renamed from: J */
    public Function1 g() {
        return this.f15358v;
    }

    public void S(MutableScatterSet mutableScatterSet) {
        SnapshotStateMapKt.b();
        throw new KotlinNothingValueException();
    }

    public MutableSnapshot T(Function1 function1, Function1 function12) {
        Function1 Q = SnapshotKt.Q(function1, g(), false, 4, (Object) null);
        Function1 r2 = SnapshotKt.S(function12, k());
        return !this.f15356t ? new TransparentObserverMutableSnapshot(W().T((Function1) null, r2), Q, r2, false, true) : W().T(Q, r2);
    }

    public final MutableSnapshot W() {
        MutableSnapshot mutableSnapshot = this.f15355s;
        return mutableSnapshot == null ? SnapshotKt.f15286k : mutableSnapshot;
    }

    public final long X() {
        return this.f15360x;
    }

    /* renamed from: Y */
    public Void m(Snapshot snapshot) {
        SnapshotStateMapKt.b();
        throw new KotlinNothingValueException();
    }

    /* renamed from: Z */
    public Void n(Snapshot snapshot) {
        SnapshotStateMapKt.b();
        throw new KotlinNothingValueException();
    }

    public void a0(Function1 function1) {
        this.f15358v = function1;
    }

    public void b0(Function1 function1) {
        this.f15359w = function1;
    }

    public void d() {
        MutableSnapshot mutableSnapshot;
        t(true);
        if (this.f15357u && (mutableSnapshot = this.f15355s) != null) {
            mutableSnapshot.d();
        }
    }

    public SnapshotIdSet f() {
        return W().f();
    }

    public boolean h() {
        return W().h();
    }

    public long i() {
        return W().i();
    }

    public int j() {
        return W().j();
    }

    public Function1 k() {
        return this.f15359w;
    }

    public void o() {
        W().o();
    }

    public void p(StateObject stateObject) {
        W().p(stateObject);
    }

    public void u(SnapshotIdSet snapshotIdSet) {
        SnapshotStateMapKt.b();
        throw new KotlinNothingValueException();
    }

    public void v(long j2) {
        SnapshotStateMapKt.b();
        throw new KotlinNothingValueException();
    }

    public void w(int i2) {
        W().w(i2);
    }

    public Snapshot x(Function1 function1) {
        Function1 Q = SnapshotKt.Q(function1, g(), false, 4, (Object) null);
        return !this.f15356t ? SnapshotKt.I(W().x((Function1) null), Q, true) : W().x(Q);
    }
}
