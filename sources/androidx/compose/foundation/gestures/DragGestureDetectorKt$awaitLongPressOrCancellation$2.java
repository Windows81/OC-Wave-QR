package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

@Metadata
@DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$2", f = "DragGestureDetector.kt", l = {971, 993}, m = "invokeSuspend")
public final class DragGestureDetectorKt$awaitLongPressOrCancellation$2 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {

    /* renamed from: B  reason: collision with root package name */
    public Object f3463B;
    public int C;
    public int D;
    public /* synthetic */ Object E;
    public final /* synthetic */ Ref.BooleanRef F;
    public final /* synthetic */ Ref.ObjectRef G;
    public final /* synthetic */ Ref.ObjectRef H;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DragGestureDetectorKt$awaitLongPressOrCancellation$2(Ref.BooleanRef booleanRef, Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2, Continuation continuation) {
        super(2, continuation);
        this.F = booleanRef;
        this.G = objectRef;
        this.H = objectRef2;
    }

    public final Continuation s(Object obj, Continuation continuation) {
        DragGestureDetectorKt$awaitLongPressOrCancellation$2 dragGestureDetectorKt$awaitLongPressOrCancellation$2 = new DragGestureDetectorKt$awaitLongPressOrCancellation$2(this.F, this.G, this.H, continuation);
        dragGestureDetectorKt$awaitLongPressOrCancellation$2.E = obj;
        return dragGestureDetectorKt$awaitLongPressOrCancellation$2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v20, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v21, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v22, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v23, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v27, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v28, resolved type: boolean} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0072 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00a1 A[EDGE_INSN: B:66:0x00a1->B:27:0x00a1 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00e1 A[EDGE_INSN: B:68:0x00e1->B:40:0x00e1 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object x(java.lang.Object r17) {
        /*
            r16 = this;
            r0 = r16
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.D
            r3 = 2
            r4 = 0
            r6 = 1
            if (r2 == 0) goto L_0x0036
            if (r2 == r6) goto L_0x002a
            if (r2 != r3) goto L_0x0022
            int r2 = r0.C
            java.lang.Object r7 = r0.f3463B
            androidx.compose.ui.input.pointer.PointerEvent r7 = (androidx.compose.ui.input.pointer.PointerEvent) r7
            java.lang.Object r8 = r0.E
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r8 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r8
            kotlin.ResultKt.b(r17)
            r4 = r17
            goto L_0x00c0
        L_0x0022:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x002a:
            int r2 = r0.C
            java.lang.Object r7 = r0.E
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r7 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r7
            kotlin.ResultKt.b(r17)
            r8 = r17
            goto L_0x0052
        L_0x0036:
            kotlin.ResultKt.b(r17)
            java.lang.Object r2 = r0.E
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r2 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r2
            r7 = r2
            r2 = 0
        L_0x003f:
            if (r2 != 0) goto L_0x015f
            androidx.compose.ui.input.pointer.PointerEventPass r8 = androidx.compose.ui.input.pointer.PointerEventPass.Main
            r0.E = r7
            r0.f3463B = r4
            r0.C = r2
            r0.D = r6
            java.lang.Object r8 = r7.k0(r8, r0)
            if (r8 != r1) goto L_0x0052
            return r1
        L_0x0052:
            androidx.compose.ui.input.pointer.PointerEvent r8 = (androidx.compose.ui.input.pointer.PointerEvent) r8
            java.util.List r9 = r8.c()
            r10 = r9
            java.util.Collection r10 = (java.util.Collection) r10
            int r10 = r10.size()
            r11 = 0
        L_0x0060:
            if (r11 >= r10) goto L_0x0072
            java.lang.Object r12 = r9.get(r11)
            androidx.compose.ui.input.pointer.PointerInputChange r12 = (androidx.compose.ui.input.pointer.PointerInputChange) r12
            boolean r12 = androidx.compose.ui.input.pointer.PointerEventKt.d(r12)
            if (r12 != 0) goto L_0x006f
            goto L_0x0073
        L_0x006f:
            int r11 = r11 + 1
            goto L_0x0060
        L_0x0072:
            r2 = r6
        L_0x0073:
            java.util.List r9 = r8.c()
            r10 = r9
            java.util.Collection r10 = (java.util.Collection) r10
            int r10 = r10.size()
            r11 = 0
        L_0x007f:
            if (r11 >= r10) goto L_0x00a1
            java.lang.Object r12 = r9.get(r11)
            androidx.compose.ui.input.pointer.PointerInputChange r12 = (androidx.compose.ui.input.pointer.PointerInputChange) r12
            boolean r13 = r12.p()
            if (r13 != 0) goto L_0x00a0
            long r13 = r7.a()
            long r4 = r7.I1()
            boolean r4 = androidx.compose.ui.input.pointer.PointerEventKt.f(r12, r13, r4)
            if (r4 == 0) goto L_0x009c
            goto L_0x00a0
        L_0x009c:
            int r11 = r11 + 1
            r4 = 0
            goto L_0x007f
        L_0x00a0:
            r2 = r6
        L_0x00a1:
            boolean r4 = androidx.compose.foundation.gestures.TapGestureDetector_androidKt.b(r8)
            if (r4 == 0) goto L_0x00ac
            kotlin.jvm.internal.Ref$BooleanRef r2 = r0.F
            r2.f40901z = r6
            r2 = r6
        L_0x00ac:
            androidx.compose.ui.input.pointer.PointerEventPass r4 = androidx.compose.ui.input.pointer.PointerEventPass.Final
            r0.E = r7
            r0.f3463B = r8
            r0.C = r2
            r0.D = r3
            java.lang.Object r4 = r7.k0(r4, r0)
            if (r4 != r1) goto L_0x00bd
            return r1
        L_0x00bd:
            r15 = r8
            r8 = r7
            r7 = r15
        L_0x00c0:
            androidx.compose.ui.input.pointer.PointerEvent r4 = (androidx.compose.ui.input.pointer.PointerEvent) r4
            java.util.List r4 = r4.c()
            r5 = r4
            java.util.Collection r5 = (java.util.Collection) r5
            int r5 = r5.size()
            r9 = 0
        L_0x00ce:
            if (r9 >= r5) goto L_0x00e1
            java.lang.Object r10 = r4.get(r9)
            androidx.compose.ui.input.pointer.PointerInputChange r10 = (androidx.compose.ui.input.pointer.PointerInputChange) r10
            boolean r10 = r10.p()
            if (r10 == 0) goto L_0x00de
            r2 = r6
            goto L_0x00e1
        L_0x00de:
            int r9 = r9 + 1
            goto L_0x00ce
        L_0x00e1:
            kotlin.jvm.internal.Ref$ObjectRef r4 = r0.G
            java.lang.Object r4 = r4.f40908z
            androidx.compose.ui.input.pointer.PointerInputChange r4 = (androidx.compose.ui.input.pointer.PointerInputChange) r4
            long r4 = r4.f()
            boolean r4 = androidx.compose.foundation.gestures.DragGestureDetectorKt.s(r7, r4)
            if (r4 == 0) goto L_0x0123
            java.util.List r4 = r7.c()
            r5 = r4
            java.util.Collection r5 = (java.util.Collection) r5
            int r5 = r5.size()
            r7 = 0
        L_0x00fd:
            if (r7 >= r5) goto L_0x0110
            java.lang.Object r9 = r4.get(r7)
            r10 = r9
            androidx.compose.ui.input.pointer.PointerInputChange r10 = (androidx.compose.ui.input.pointer.PointerInputChange) r10
            boolean r10 = r10.i()
            if (r10 == 0) goto L_0x010d
            goto L_0x0111
        L_0x010d:
            int r7 = r7 + 1
            goto L_0x00fd
        L_0x0110:
            r9 = 0
        L_0x0111:
            androidx.compose.ui.input.pointer.PointerInputChange r9 = (androidx.compose.ui.input.pointer.PointerInputChange) r9
            if (r9 == 0) goto L_0x011e
            kotlin.jvm.internal.Ref$ObjectRef r4 = r0.G
            r4.f40908z = r9
            kotlin.jvm.internal.Ref$ObjectRef r4 = r0.H
            r4.f40908z = r9
            goto L_0x015a
        L_0x011e:
            r2 = r6
            r7 = r8
            r4 = 0
            goto L_0x003f
        L_0x0123:
            kotlin.jvm.internal.Ref$ObjectRef r4 = r0.H
            java.util.List r5 = r7.c()
            kotlin.jvm.internal.Ref$ObjectRef r7 = r0.G
            r9 = r5
            java.util.Collection r9 = (java.util.Collection) r9
            int r9 = r9.size()
            r10 = 0
        L_0x0133:
            if (r10 >= r9) goto L_0x0157
            java.lang.Object r11 = r5.get(r10)
            r12 = r11
            androidx.compose.ui.input.pointer.PointerInputChange r12 = (androidx.compose.ui.input.pointer.PointerInputChange) r12
            long r12 = r12.f()
            java.lang.Object r14 = r7.f40908z
            androidx.compose.ui.input.pointer.PointerInputChange r14 = (androidx.compose.ui.input.pointer.PointerInputChange) r14
            r17 = r7
            long r6 = r14.f()
            boolean r6 = androidx.compose.ui.input.pointer.PointerId.c(r12, r6)
            if (r6 == 0) goto L_0x0151
            goto L_0x0158
        L_0x0151:
            int r10 = r10 + 1
            r7 = r17
            r6 = 1
            goto L_0x0133
        L_0x0157:
            r11 = 0
        L_0x0158:
            r4.f40908z = r11
        L_0x015a:
            r7 = r8
            r4 = 0
            r6 = 1
            goto L_0x003f
        L_0x015f:
            kotlin.Unit r1 = kotlin.Unit.f40552a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$2.x(java.lang.Object):java.lang.Object");
    }

    /* renamed from: z */
    public final Object m(AwaitPointerEventScope awaitPointerEventScope, Continuation continuation) {
        return ((DragGestureDetectorKt$awaitLongPressOrCancellation$2) s(awaitPointerEventScope, continuation)).x(Unit.f40552a);
    }
}
