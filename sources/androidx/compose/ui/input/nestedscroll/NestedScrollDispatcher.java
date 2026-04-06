package androidx.compose.ui.input.nestedscroll;

import androidx.compose.ui.geometry.Offset;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.CoroutineScope;

@Metadata
public final class NestedScrollDispatcher {

    /* renamed from: a  reason: collision with root package name */
    public NestedScrollNode f16786a;

    /* renamed from: b  reason: collision with root package name */
    public NestedScrollNode f16787b;

    /* renamed from: c  reason: collision with root package name */
    public Function0 f16788c = new NestedScrollDispatcher$calculateNestedScrollScope$1(this);

    /* renamed from: d  reason: collision with root package name */
    public CoroutineScope f16789d;

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(long r8, long r10, kotlin.coroutines.Continuation r12) {
        /*
            r7 = this;
            boolean r0 = r12 instanceof androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPostFling$1
            if (r0 == 0) goto L_0x0014
            r0 = r12
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPostFling$1 r0 = (androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPostFling$1) r0
            int r1 = r0.E
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0014
            int r1 = r1 - r2
            r0.E = r1
        L_0x0012:
            r6 = r0
            goto L_0x001a
        L_0x0014:
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPostFling$1 r0 = new androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPostFling$1
            r0.<init>(r7, r12)
            goto L_0x0012
        L_0x001a:
            java.lang.Object r12 = r6.C
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r1 = r6.E
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x003a
            if (r1 == r3) goto L_0x0036
            if (r1 != r2) goto L_0x002e
            kotlin.ResultKt.b(r12)
            goto L_0x0075
        L_0x002e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0036:
            kotlin.ResultKt.b(r12)
            goto L_0x0056
        L_0x003a:
            kotlin.ResultKt.b(r12)
            androidx.compose.ui.input.nestedscroll.NestedScrollConnection r12 = r7.g()
            if (r12 != 0) goto L_0x0064
            boolean r12 = androidx.compose.ui.ComposeUiFlags.f15475c
            if (r12 == 0) goto L_0x0064
            androidx.compose.ui.input.nestedscroll.NestedScrollNode r1 = r7.f16787b
            if (r1 == 0) goto L_0x005d
            r6.E = r3
            r2 = r8
            r4 = r10
            java.lang.Object r12 = r1.q0(r2, r4, r6)
            if (r12 != r0) goto L_0x0056
            return r0
        L_0x0056:
            androidx.compose.ui.unit.Velocity r12 = (androidx.compose.ui.unit.Velocity) r12
            long r8 = r12.o()
            goto L_0x0082
        L_0x005d:
            androidx.compose.ui.unit.Velocity$Companion r8 = androidx.compose.ui.unit.Velocity.f19186b
            long r8 = r8.a()
            goto L_0x0082
        L_0x0064:
            androidx.compose.ui.input.nestedscroll.NestedScrollConnection r1 = r7.g()
            if (r1 == 0) goto L_0x007c
            r6.E = r2
            r2 = r8
            r4 = r10
            java.lang.Object r12 = r1.q0(r2, r4, r6)
            if (r12 != r0) goto L_0x0075
            return r0
        L_0x0075:
            androidx.compose.ui.unit.Velocity r12 = (androidx.compose.ui.unit.Velocity) r12
            long r8 = r12.o()
            goto L_0x0082
        L_0x007c:
            androidx.compose.ui.unit.Velocity$Companion r8 = androidx.compose.ui.unit.Velocity.f19186b
            long r8 = r8.a()
        L_0x0082:
            androidx.compose.ui.unit.Velocity r8 = androidx.compose.ui.unit.Velocity.b(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher.a(long, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final long b(long j2, long j3, int i2) {
        NestedScrollConnection g2 = g();
        return g2 != null ? g2.c2(j2, j3, i2) : Offset.f15855b.c();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object c(long r5, kotlin.coroutines.Continuation r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPreFling$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPreFling$1 r0 = (androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPreFling$1) r0
            int r1 = r0.E
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.E = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPreFling$1 r0 = new androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPreFling$1
            r0.<init>(r4, r7)
        L_0x0018:
            java.lang.Object r7 = r0.C
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.E
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            kotlin.ResultKt.b(r7)
            goto L_0x0043
        L_0x0029:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0031:
            kotlin.ResultKt.b(r7)
            androidx.compose.ui.input.nestedscroll.NestedScrollConnection r7 = r4.g()
            if (r7 == 0) goto L_0x004a
            r0.E = r3
            java.lang.Object r7 = r7.H1(r5, r0)
            if (r7 != r1) goto L_0x0043
            return r1
        L_0x0043:
            androidx.compose.ui.unit.Velocity r7 = (androidx.compose.ui.unit.Velocity) r7
            long r5 = r7.o()
            goto L_0x0050
        L_0x004a:
            androidx.compose.ui.unit.Velocity$Companion r5 = androidx.compose.ui.unit.Velocity.f19186b
            long r5 = r5.a()
        L_0x0050:
            androidx.compose.ui.unit.Velocity r5 = androidx.compose.ui.unit.Velocity.b(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher.c(long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final long d(long j2, int i2) {
        NestedScrollConnection g2 = g();
        return g2 != null ? g2.t1(j2, i2) : Offset.f15855b.c();
    }

    public final CoroutineScope e() {
        CoroutineScope coroutineScope = (CoroutineScope) this.f16788c.invoke();
        if (coroutineScope != null) {
            return coroutineScope;
        }
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }

    public final NestedScrollNode f() {
        return this.f16786a;
    }

    public final NestedScrollConnection g() {
        NestedScrollNode nestedScrollNode = this.f16786a;
        if (nestedScrollNode != null) {
            return nestedScrollNode.c3();
        }
        return null;
    }

    public final CoroutineScope h() {
        return this.f16789d;
    }

    public final void i(Function0 function0) {
        this.f16788c = function0;
    }

    public final void j(NestedScrollNode nestedScrollNode) {
        this.f16787b = nestedScrollNode;
    }

    public final void k(NestedScrollNode nestedScrollNode) {
        this.f16786a = nestedScrollNode;
    }

    public final void l(CoroutineScope coroutineScope) {
        this.f16789d = coroutineScope;
    }
}
