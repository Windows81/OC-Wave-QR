package androidx.compose.material3.pulltorefresh;

import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.ui.input.nestedscroll.NestedScrollNodeKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;

@Metadata
public final class PullToRefreshModifierNode extends DelegatingNode implements NestedScrollConnection {
    public boolean P;
    public Function0 Q;
    public boolean R;
    public PullToRefreshState S;
    public float T;
    public DelegatableNode U;
    public final MutableFloatState V;
    public final MutableFloatState W;

    public /* synthetic */ PullToRefreshModifierNode(boolean z2, Function0 function0, boolean z3, PullToRefreshState pullToRefreshState, float f2, DefaultConstructorMarker defaultConstructorMarker) {
        this(z2, function0, z3, pullToRefreshState, f2);
    }

    public final void A3(PullToRefreshState pullToRefreshState) {
        this.S = pullToRefreshState;
    }

    public final void B3(float f2) {
        this.T = f2;
    }

    public final void C3(float f2) {
        this.V.j(f2);
    }

    public boolean D2() {
        return false;
    }

    public final void D3() {
        Job unused = BuildersKt__Builders_commonKt.d(y2(), (CoroutineContext) null, (CoroutineStart) null, new PullToRefreshModifierNode$update$1(this, (Continuation) null), 3, (Object) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object H1(long r5, kotlin.coroutines.Continuation r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$onPreFling$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$onPreFling$1 r0 = (androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$onPreFling$1) r0
            int r1 = r0.F
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.F = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$onPreFling$1 r0 = new androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$onPreFling$1
            r0.<init>(r4, r7)
        L_0x0018:
            java.lang.Object r7 = r0.D
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.F
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            float r5 = r0.C
            kotlin.ResultKt.b(r7)
            goto L_0x0047
        L_0x002b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0033:
            kotlin.ResultKt.b(r7)
            float r5 = androidx.compose.ui.unit.Velocity.i(r5)
            r6 = 0
            r0.C = r6
            r0.F = r3
            java.lang.Object r7 = r4.v3(r5, r0)
            if (r7 != r1) goto L_0x0046
            return r1
        L_0x0046:
            r5 = r6
        L_0x0047:
            java.lang.Number r7 = (java.lang.Number) r7
            float r6 = r7.floatValue()
            long r5 = androidx.compose.ui.unit.VelocityKt.a(r5, r6)
            androidx.compose.ui.unit.Velocity r5 = androidx.compose.ui.unit.Velocity.b(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode.H1(long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public void I2() {
        Z2(this.U);
        Job unused = BuildersKt__Builders_commonKt.d(y2(), (CoroutineContext) null, (CoroutineStart) null, new PullToRefreshModifierNode$onAttach$1(this, (Continuation) null), 3, (Object) null);
        C3(this.P ? (float) s3() : 0.0f);
    }

    public long c2(long j2, long j3, int i2) {
        if (this.S.c()) {
            return Offset.f15855b.c();
        }
        if (!this.R) {
            return Offset.f15855b.c();
        }
        if (!NestedScrollSource.e(i2, NestedScrollSource.f16795b.b())) {
            return Offset.f15855b.c();
        }
        long n3 = n3(j3);
        Job unused = BuildersKt__Builders_commonKt.d(y2(), (CoroutineContext) null, (CoroutineStart) null, new PullToRefreshModifierNode$onPostScroll$1(this, (Continuation) null), 3, (Object) null);
        return n3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object k3(kotlin.coroutines.Continuation r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$animateToHidden$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$animateToHidden$1 r0 = (androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$animateToHidden$1) r0
            int r1 = r0.E
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.E = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$animateToHidden$1 r0 = new androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$animateToHidden$1
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.C
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.E
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            kotlin.ResultKt.b(r6)     // Catch:{ all -> 0x002a }
            goto L_0x0042
        L_0x002a:
            r6 = move-exception
            goto L_0x004b
        L_0x002c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0034:
            kotlin.ResultKt.b(r6)
            androidx.compose.material3.pulltorefresh.PullToRefreshState r6 = r5.S     // Catch:{ all -> 0x002a }
            r0.E = r3     // Catch:{ all -> 0x002a }
            java.lang.Object r6 = r6.a(r0)     // Catch:{ all -> 0x002a }
            if (r6 != r1) goto L_0x0042
            return r1
        L_0x0042:
            r5.w3(r4)
            r5.C3(r4)
            kotlin.Unit r6 = kotlin.Unit.f40552a
            return r6
        L_0x004b:
            r5.w3(r4)
            r5.C3(r4)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode.k3(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object l3(kotlin.coroutines.Continuation r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$animateToThreshold$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$animateToThreshold$1 r0 = (androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$animateToThreshold$1) r0
            int r1 = r0.E
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.E = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$animateToThreshold$1 r0 = new androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$animateToThreshold$1
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.C
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.E
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            kotlin.ResultKt.b(r5)     // Catch:{ all -> 0x0029 }
            goto L_0x0041
        L_0x0029:
            r5 = move-exception
            goto L_0x005a
        L_0x002b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0033:
            kotlin.ResultKt.b(r5)
            androidx.compose.material3.pulltorefresh.PullToRefreshState r5 = r4.S     // Catch:{ all -> 0x0029 }
            r0.E = r3     // Catch:{ all -> 0x0029 }
            java.lang.Object r5 = r5.e(r0)     // Catch:{ all -> 0x0029 }
            if (r5 != r1) goto L_0x0041
            return r1
        L_0x0041:
            boolean r5 = r4.F2()
            if (r5 == 0) goto L_0x0057
            int r5 = r4.s3()
            float r5 = (float) r5
            r4.w3(r5)
            int r5 = r4.s3()
            float r5 = (float) r5
            r4.C3(r5)
        L_0x0057:
            kotlin.Unit r5 = kotlin.Unit.f40552a
            return r5
        L_0x005a:
            boolean r0 = r4.F2()
            if (r0 == 0) goto L_0x0070
            int r0 = r4.s3()
            float r0 = (float) r0
            r4.w3(r0)
            int r0 = r4.s3()
            float r0 = (float) r0
            r4.C3(r0)
        L_0x0070:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode.l3(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final float m3() {
        if (o3() <= ((float) s3())) {
            return o3();
        }
        float n2 = RangesKt.n(Math.abs(q3()) - 1.0f, 0.0f, 2.0f);
        return ((float) s3()) + (((float) s3()) * (n2 - (((float) Math.pow((double) n2, (double) 2)) / ((float) 4))));
    }

    public final long n3(long j2) {
        float f2;
        if (this.P) {
            f2 = 0.0f;
        } else {
            float d2 = RangesKt.d(p3() + Float.intBitsToFloat((int) (j2 & 4294967295L)), 0.0f);
            f2 = d2 - p3();
            w3(d2);
            C3(m3());
        }
        return Offset.e((((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (((long) Float.floatToRawIntBits(0.0f)) << 32));
    }

    public final float o3() {
        return p3() * 0.5f;
    }

    public final float p3() {
        return this.W.c();
    }

    public final float q3() {
        return o3() / ((float) s3());
    }

    public final PullToRefreshState r3() {
        return this.S;
    }

    public final int s3() {
        return DelegatableNodeKt.k(this).P1(this.T);
    }

    public long t1(long j2, int i2) {
        return this.S.c() ? Offset.f15855b.c() : !this.R ? Offset.f15855b.c() : (!NestedScrollSource.e(i2, NestedScrollSource.f16795b.b()) || Float.intBitsToFloat((int) (4294967295L & j2)) >= 0.0f) ? Offset.f15855b.c() : n3(j2);
    }

    public final float t3() {
        return this.V.c();
    }

    public final boolean u3() {
        return this.P;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object v3(float r6, kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$onRelease$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$onRelease$1 r0 = (androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$onRelease$1) r0
            int r1 = r0.F
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.F = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$onRelease$1 r0 = new androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$onRelease$1
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.D
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.F
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            float r6 = r0.C
            kotlin.ResultKt.b(r7)
            goto L_0x006c
        L_0x002c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0034:
            kotlin.ResultKt.b(r7)
            boolean r7 = r5.P
            if (r7 == 0) goto L_0x0040
            java.lang.Float r6 = kotlin.coroutines.jvm.internal.Boxing.b(r4)
            return r6
        L_0x0040:
            float r7 = r5.o3()
            int r2 = r5.s3()
            float r2 = (float) r2
            int r7 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r7 <= 0) goto L_0x0052
            kotlin.jvm.functions.Function0 r7 = r5.Q
            r7.invoke()
        L_0x0052:
            float r7 = r5.p3()
            int r7 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r7 != 0) goto L_0x005c
        L_0x005a:
            r6 = r4
            goto L_0x0061
        L_0x005c:
            int r7 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r7 >= 0) goto L_0x0061
            goto L_0x005a
        L_0x0061:
            r0.C = r6
            r0.F = r3
            java.lang.Object r7 = r5.k3(r0)
            if (r7 != r1) goto L_0x006c
            return r1
        L_0x006c:
            r5.w3(r4)
            java.lang.Float r6 = kotlin.coroutines.jvm.internal.Boxing.b(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode.v3(float, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void w3(float f2) {
        this.W.j(f2);
    }

    public final void x3(boolean z2) {
        this.R = z2;
    }

    public final void y3(Function0 function0) {
        this.Q = function0;
    }

    public final void z3(boolean z2) {
        this.P = z2;
    }

    public PullToRefreshModifierNode(boolean z2, Function0 function0, boolean z3, PullToRefreshState pullToRefreshState, float f2) {
        this.P = z2;
        this.Q = function0;
        this.R = z3;
        this.S = pullToRefreshState;
        this.T = f2;
        this.U = NestedScrollNodeKt.c(this, (NestedScrollDispatcher) null);
        this.V = PrimitiveSnapshotStateKt.a(0.0f);
        this.W = PrimitiveSnapshotStateKt.a(0.0f);
    }
}
