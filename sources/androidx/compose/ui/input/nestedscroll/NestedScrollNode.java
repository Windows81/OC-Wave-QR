package androidx.compose.ui.input.nestedscroll;

import androidx.compose.ui.ComposeUiFlags;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.node.TraversableNodeKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

@Metadata
public final class NestedScrollNode extends Modifier.Node implements TraversableNode, NestedScrollConnection {
    public NestedScrollConnection N;
    public NestedScrollDispatcher O;
    public NestedScrollNode P;
    public final Object Q;

    public NestedScrollNode(NestedScrollConnection nestedScrollConnection, NestedScrollDispatcher nestedScrollDispatcher) {
        this.N = nestedScrollConnection;
        this.O = nestedScrollDispatcher == null ? new NestedScrollDispatcher() : nestedScrollDispatcher;
        this.Q = "androidx.compose.ui.input.nestedscroll.NestedScrollNode";
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x007c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object H1(long r9, kotlin.coroutines.Continuation r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof androidx.compose.ui.input.nestedscroll.NestedScrollNode$onPreFling$1
            if (r0 == 0) goto L_0x0013
            r0 = r11
            androidx.compose.ui.input.nestedscroll.NestedScrollNode$onPreFling$1 r0 = (androidx.compose.ui.input.nestedscroll.NestedScrollNode$onPreFling$1) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.G = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.ui.input.nestedscroll.NestedScrollNode$onPreFling$1 r0 = new androidx.compose.ui.input.nestedscroll.NestedScrollNode$onPreFling$1
            r0.<init>(r8, r11)
        L_0x0018:
            java.lang.Object r11 = r0.E
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.G
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0040
            if (r2 == r4) goto L_0x0036
            if (r2 != r3) goto L_0x002e
            long r9 = r0.D
            kotlin.ResultKt.b(r11)
            goto L_0x007d
        L_0x002e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0036:
            long r9 = r0.D
            java.lang.Object r2 = r0.C
            androidx.compose.ui.input.nestedscroll.NestedScrollNode r2 = (androidx.compose.ui.input.nestedscroll.NestedScrollNode) r2
            kotlin.ResultKt.b(r11)
            goto L_0x0057
        L_0x0040:
            kotlin.ResultKt.b(r11)
            androidx.compose.ui.input.nestedscroll.NestedScrollConnection r11 = r8.b3()
            if (r11 == 0) goto L_0x0061
            r0.C = r8
            r0.D = r9
            r0.G = r4
            java.lang.Object r11 = r11.H1(r9, r0)
            if (r11 != r1) goto L_0x0056
            return r1
        L_0x0056:
            r2 = r8
        L_0x0057:
            androidx.compose.ui.unit.Velocity r11 = (androidx.compose.ui.unit.Velocity) r11
            long r4 = r11.o()
        L_0x005d:
            r6 = r9
            r9 = r4
            r4 = r6
            goto L_0x0069
        L_0x0061:
            androidx.compose.ui.unit.Velocity$Companion r11 = androidx.compose.ui.unit.Velocity.f19186b
            long r4 = r11.a()
            r2 = r8
            goto L_0x005d
        L_0x0069:
            androidx.compose.ui.input.nestedscroll.NestedScrollConnection r11 = r2.N
            long r4 = androidx.compose.ui.unit.Velocity.k(r4, r9)
            r2 = 0
            r0.C = r2
            r0.D = r9
            r0.G = r3
            java.lang.Object r11 = r11.H1(r4, r0)
            if (r11 != r1) goto L_0x007d
            return r1
        L_0x007d:
            androidx.compose.ui.unit.Velocity r11 = (androidx.compose.ui.unit.Velocity) r11
            long r0 = r11.o()
            long r9 = androidx.compose.ui.unit.Velocity.l(r9, r0)
            androidx.compose.ui.unit.Velocity r9 = androidx.compose.ui.unit.Velocity.b(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.nestedscroll.NestedScrollNode.H1(long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public void I2() {
        f3();
    }

    public void J2() {
        if (ComposeUiFlags.f15475c) {
            NestedScrollNode nestedScrollNode = (NestedScrollNode) NestedScrollNodeKt.b(this);
            this.P = nestedScrollNode;
            this.O.j(nestedScrollNode);
        }
        d3();
    }

    public final CoroutineScope a3() {
        CoroutineScope coroutineScope;
        NestedScrollNode c3 = c3();
        if ((c3 != null && (coroutineScope = c3.a3()) != null) || (coroutineScope = this.O.h()) != null) {
            return coroutineScope;
        }
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }

    public final NestedScrollConnection b3() {
        if (F2()) {
            return c3();
        }
        return null;
    }

    public long c2(long j2, long j3, int i2) {
        long c2 = this.N.c2(j2, j3, i2);
        NestedScrollConnection b3 = b3();
        return Offset.q(c2, b3 != null ? b3.c2(Offset.q(j2, c2), Offset.p(j3, c2), i2) : Offset.f15855b.c());
    }

    public final NestedScrollNode c3() {
        if (F2()) {
            return (NestedScrollNode) TraversableNodeKt.b(this);
        }
        return null;
    }

    public final void d3() {
        if (this.O.f() == this) {
            this.O.k((NestedScrollNode) null);
        }
    }

    public final void e3(NestedScrollDispatcher nestedScrollDispatcher) {
        d3();
        if (nestedScrollDispatcher == null) {
            this.O = new NestedScrollDispatcher();
        } else if (!Intrinsics.d(nestedScrollDispatcher, this.O)) {
            this.O = nestedScrollDispatcher;
        }
        if (F2()) {
            f3();
        }
    }

    public final void f3() {
        this.O.k(this);
        if (ComposeUiFlags.f15475c) {
            this.O.j((NestedScrollNode) null);
            this.P = null;
        }
        this.O.i(new NestedScrollNode$updateDispatcherFields$1(this));
        this.O.l(y2());
    }

    public final void g3(NestedScrollConnection nestedScrollConnection, NestedScrollDispatcher nestedScrollDispatcher) {
        this.N = nestedScrollConnection;
        e3(nestedScrollDispatcher);
    }

    public Object i0() {
        return this.Q;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object q0(long r16, long r18, kotlin.coroutines.Continuation r20) {
        /*
            r15 = this;
            r0 = r15
            r1 = r20
            boolean r2 = r1 instanceof androidx.compose.ui.input.nestedscroll.NestedScrollNode$onPostFling$1
            if (r2 == 0) goto L_0x0016
            r2 = r1
            androidx.compose.ui.input.nestedscroll.NestedScrollNode$onPostFling$1 r2 = (androidx.compose.ui.input.nestedscroll.NestedScrollNode$onPostFling$1) r2
            int r3 = r2.H
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0016
            int r3 = r3 - r4
            r2.H = r3
            goto L_0x001b
        L_0x0016:
            androidx.compose.ui.input.nestedscroll.NestedScrollNode$onPostFling$1 r2 = new androidx.compose.ui.input.nestedscroll.NestedScrollNode$onPostFling$1
            r2.<init>(r15, r1)
        L_0x001b:
            java.lang.Object r1 = r2.F
            java.lang.Object r9 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r3 = r2.H
            r10 = 2
            r4 = 1
            if (r3 == 0) goto L_0x0048
            if (r3 == r4) goto L_0x003a
            if (r3 != r10) goto L_0x0032
            long r2 = r2.D
            kotlin.ResultKt.b(r1)
            goto L_0x00a1
        L_0x0032:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x003a:
            long r3 = r2.E
            long r5 = r2.D
            java.lang.Object r7 = r2.C
            androidx.compose.ui.input.nestedscroll.NestedScrollNode r7 = (androidx.compose.ui.input.nestedscroll.NestedScrollNode) r7
            kotlin.ResultKt.b(r1)
            r13 = r3
            r11 = r5
            goto L_0x0066
        L_0x0048:
            kotlin.ResultKt.b(r1)
            androidx.compose.ui.input.nestedscroll.NestedScrollConnection r3 = r0.N
            r2.C = r0
            r11 = r16
            r2.D = r11
            r13 = r18
            r2.E = r13
            r2.H = r4
            r4 = r16
            r6 = r18
            r8 = r2
            java.lang.Object r1 = r3.q0(r4, r6, r8)
            if (r1 != r9) goto L_0x0065
            return r9
        L_0x0065:
            r7 = r0
        L_0x0066:
            androidx.compose.ui.unit.Velocity r1 = (androidx.compose.ui.unit.Velocity) r1
            long r4 = r1.o()
            boolean r1 = androidx.compose.ui.ComposeUiFlags.f15475c
            if (r1 == 0) goto L_0x007f
            boolean r1 = r7.F2()
            if (r1 == 0) goto L_0x007c
            androidx.compose.ui.input.nestedscroll.NestedScrollConnection r1 = r7.b3()
        L_0x007a:
            r3 = r1
            goto L_0x0084
        L_0x007c:
            androidx.compose.ui.input.nestedscroll.NestedScrollNode r1 = r7.P
            goto L_0x007a
        L_0x007f:
            androidx.compose.ui.input.nestedscroll.NestedScrollConnection r1 = r7.b3()
            goto L_0x007a
        L_0x0084:
            if (r3 == 0) goto L_0x00a9
            long r6 = androidx.compose.ui.unit.Velocity.l(r11, r4)
            long r11 = androidx.compose.ui.unit.Velocity.k(r13, r4)
            r1 = 0
            r2.C = r1
            r2.D = r4
            r2.H = r10
            r13 = r4
            r4 = r6
            r6 = r11
            r8 = r2
            java.lang.Object r1 = r3.q0(r4, r6, r8)
            if (r1 != r9) goto L_0x00a0
            return r9
        L_0x00a0:
            r2 = r13
        L_0x00a1:
            androidx.compose.ui.unit.Velocity r1 = (androidx.compose.ui.unit.Velocity) r1
            long r4 = r1.o()
            r13 = r2
            goto L_0x00b0
        L_0x00a9:
            r13 = r4
            androidx.compose.ui.unit.Velocity$Companion r1 = androidx.compose.ui.unit.Velocity.f19186b
            long r4 = r1.a()
        L_0x00b0:
            long r1 = androidx.compose.ui.unit.Velocity.l(r13, r4)
            androidx.compose.ui.unit.Velocity r1 = androidx.compose.ui.unit.Velocity.b(r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.nestedscroll.NestedScrollNode.q0(long, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public long t1(long j2, int i2) {
        NestedScrollConnection b3 = b3();
        long t1 = b3 != null ? b3.t1(j2, i2) : Offset.f15855b.c();
        return Offset.q(t1, this.N.t1(Offset.p(j2, t1), i2));
    }
}
