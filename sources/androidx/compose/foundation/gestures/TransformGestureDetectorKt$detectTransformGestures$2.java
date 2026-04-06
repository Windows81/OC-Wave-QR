package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;

@Metadata
@DebugMetadata(c = "androidx.compose.foundation.gestures.TransformGestureDetectorKt$detectTransformGestures$2", f = "TransformGestureDetector.kt", l = {60, 62}, m = "invokeSuspend")
final class TransformGestureDetectorKt$detectTransformGestures$2 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {

    /* renamed from: B  reason: collision with root package name */
    public float f3610B;
    public float C;
    public float D;
    public long E;
    public int F;
    public int G;
    public int H;
    public /* synthetic */ Object I;
    public final /* synthetic */ boolean J;
    public final /* synthetic */ Function4 K;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TransformGestureDetectorKt$detectTransformGestures$2(boolean z2, Function4 function4, Continuation continuation) {
        super(2, continuation);
        this.J = z2;
        this.K = function4;
    }

    public final Continuation s(Object obj, Continuation continuation) {
        TransformGestureDetectorKt$detectTransformGestures$2 transformGestureDetectorKt$detectTransformGestures$2 = new TransformGestureDetectorKt$detectTransformGestures$2(this.J, this.K, continuation);
        transformGestureDetectorKt$detectTransformGestures$2.I = obj;
        return transformGestureDetectorKt$detectTransformGestures$2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v2, resolved type: androidx.compose.ui.input.pointer.AwaitPointerEventScope} */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0144, code lost:
        if (androidx.compose.ui.geometry.Offset.j(r11, androidx.compose.ui.geometry.Offset.f15855b.c()) == false) goto L_0x014e;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0183  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x018d  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0199  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x00c2 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object x(java.lang.Object r26) {
        /*
            r25 = this;
            r6 = r25
            java.lang.Object r7 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r0 = r6.H
            r8 = 1065353216(0x3f800000, float:1.0)
            r9 = 2
            r10 = 0
            r11 = 0
            r12 = 1
            if (r0 == 0) goto L_0x0047
            if (r0 == r12) goto L_0x0033
            if (r0 != r9) goto L_0x002b
            int r0 = r6.G
            float r1 = r6.D
            int r2 = r6.F
            long r3 = r6.E
            float r5 = r6.C
            float r13 = r6.f3610B
            java.lang.Object r14 = r6.I
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r14 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r14
            kotlin.ResultKt.b(r26)
            r15 = r26
            goto L_0x00a0
        L_0x002b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0033:
            int r0 = r6.G
            float r1 = r6.D
            int r2 = r6.F
            long r3 = r6.E
            float r5 = r6.C
            float r13 = r6.f3610B
            java.lang.Object r14 = r6.I
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r14 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r14
            kotlin.ResultKt.b(r26)
            goto L_0x0088
        L_0x0047:
            kotlin.ResultKt.b(r26)
            java.lang.Object r0 = r6.I
            r14 = r0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r14 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r14
            androidx.compose.ui.geometry.Offset$Companion r0 = androidx.compose.ui.geometry.Offset.f15855b
            long r4 = r0.c()
            androidx.compose.ui.platform.ViewConfiguration r0 = r14.getViewConfiguration()
            float r13 = r0.g()
            r6.I = r14
            r6.f3610B = r10
            r6.C = r8
            r6.E = r4
            r6.F = r11
            r6.D = r13
            r6.G = r11
            r6.H = r12
            r1 = 0
            r2 = 0
            r15 = 2
            r16 = 0
            r0 = r14
            r3 = r25
            r17 = r4
            r4 = r15
            r5 = r16
            java.lang.Object r0 = androidx.compose.foundation.gestures.TapGestureDetectorKt.f(r0, r1, r2, r3, r4, r5)
            if (r0 != r7) goto L_0x0081
            return r7
        L_0x0081:
            r5 = r8
            r0 = r11
            r2 = r0
            r1 = r13
            r3 = r17
            r13 = r10
        L_0x0088:
            r6.I = r14
            r6.f3610B = r13
            r6.C = r5
            r6.E = r3
            r6.F = r2
            r6.D = r1
            r6.G = r0
            r6.H = r9
            r15 = 0
            java.lang.Object r15 = androidx.compose.ui.input.pointer.AwaitPointerEventScope.P0(r14, r15, r6, r12, r15)
            if (r15 != r7) goto L_0x00a0
            return r7
        L_0x00a0:
            androidx.compose.ui.input.pointer.PointerEvent r15 = (androidx.compose.ui.input.pointer.PointerEvent) r15
            java.util.List r9 = r15.c()
            r17 = r9
            java.util.Collection r17 = (java.util.Collection) r17
            int r8 = r17.size()
            r10 = r11
        L_0x00af:
            if (r10 >= r8) goto L_0x00c2
            java.lang.Object r19 = r9.get(r10)
            androidx.compose.ui.input.pointer.PointerInputChange r19 = (androidx.compose.ui.input.pointer.PointerInputChange) r19
            boolean r19 = r19.p()
            if (r19 == 0) goto L_0x00bf
            r8 = r12
            goto L_0x00c3
        L_0x00bf:
            int r10 = r10 + 1
            goto L_0x00af
        L_0x00c2:
            r8 = r11
        L_0x00c3:
            if (r8 != 0) goto L_0x018d
            float r9 = androidx.compose.foundation.gestures.TransformGestureDetectorKt.f(r15)
            float r10 = androidx.compose.foundation.gestures.TransformGestureDetectorKt.e(r15)
            long r11 = androidx.compose.foundation.gestures.TransformGestureDetectorKt.d(r15)
            if (r2 != 0) goto L_0x011c
            float r5 = r5 * r9
            float r13 = r13 + r10
            long r3 = androidx.compose.ui.geometry.Offset.q(r3, r11)
            r26 = r0
            r0 = 0
            float r21 = androidx.compose.foundation.gestures.TransformGestureDetectorKt.c(r15, r0)
            r20 = r2
            r0 = 1
            float r2 = (float) r0
            float r2 = r2 - r5
            float r2 = java.lang.Math.abs(r2)
            float r2 = r2 * r21
            r22 = 1078530011(0x40490fdb, float:3.1415927)
            float r22 = r22 * r13
            float r22 = r22 * r21
            r21 = 1127481344(0x43340000, float:180.0)
            float r22 = r22 / r21
            float r21 = java.lang.Math.abs(r22)
            float r22 = androidx.compose.ui.geometry.Offset.k(r3)
            int r2 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r2 > 0) goto L_0x010e
            int r2 = (r21 > r1 ? 1 : (r21 == r1 ? 0 : -1))
            if (r2 > 0) goto L_0x010e
            int r2 = (r22 > r1 ? 1 : (r22 == r1 ? 0 : -1))
            if (r2 <= 0) goto L_0x010b
            goto L_0x010e
        L_0x010b:
            r2 = r26
            goto L_0x0122
        L_0x010e:
            boolean r2 = r6.J
            if (r2 == 0) goto L_0x0118
            int r2 = (r21 > r1 ? 1 : (r21 == r1 ? 0 : -1))
            if (r2 >= 0) goto L_0x0118
            r2 = r0
            goto L_0x0119
        L_0x0118:
            r2 = 0
        L_0x0119:
            r20 = r0
            goto L_0x0122
        L_0x011c:
            r26 = r0
            r20 = r2
            r0 = 1
            goto L_0x010b
        L_0x0122:
            if (r20 == 0) goto L_0x0183
            r0 = 0
            long r22 = androidx.compose.foundation.gestures.TransformGestureDetectorKt.b(r15, r0)
            if (r2 == 0) goto L_0x012c
            r10 = 0
        L_0x012c:
            r17 = 0
            int r19 = (r10 > r17 ? 1 : (r10 == r17 ? 0 : -1))
            if (r19 != 0) goto L_0x014a
            r18 = 1065353216(0x3f800000, float:1.0)
            int r19 = (r9 > r18 ? 1 : (r9 == r18 ? 0 : -1))
            if (r19 != 0) goto L_0x0147
            androidx.compose.ui.geometry.Offset$Companion r19 = androidx.compose.ui.geometry.Offset.f15855b
            r24 = r1
            long r0 = r19.c()
            boolean r0 = androidx.compose.ui.geometry.Offset.j(r11, r0)
            if (r0 != 0) goto L_0x0163
            goto L_0x014e
        L_0x0147:
            r24 = r1
            goto L_0x014e
        L_0x014a:
            r24 = r1
            r18 = 1065353216(0x3f800000, float:1.0)
        L_0x014e:
            kotlin.jvm.functions.Function4 r0 = r6.K
            androidx.compose.ui.geometry.Offset r1 = androidx.compose.ui.geometry.Offset.d(r22)
            androidx.compose.ui.geometry.Offset r11 = androidx.compose.ui.geometry.Offset.d(r11)
            java.lang.Float r9 = kotlin.coroutines.jvm.internal.Boxing.b(r9)
            java.lang.Float r10 = kotlin.coroutines.jvm.internal.Boxing.b(r10)
            r0.j(r1, r11, r9, r10)
        L_0x0163:
            java.util.List r0 = r15.c()
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            int r1 = r1.size()
            r9 = 0
        L_0x016f:
            if (r9 >= r1) goto L_0x0189
            java.lang.Object r10 = r0.get(r9)
            androidx.compose.ui.input.pointer.PointerInputChange r10 = (androidx.compose.ui.input.pointer.PointerInputChange) r10
            boolean r11 = androidx.compose.ui.input.pointer.PointerEventKt.j(r10)
            if (r11 == 0) goto L_0x0180
            r10.a()
        L_0x0180:
            int r9 = r9 + 1
            goto L_0x016f
        L_0x0183:
            r24 = r1
            r17 = 0
            r18 = 1065353216(0x3f800000, float:1.0)
        L_0x0189:
            r0 = r2
            r2 = r20
            goto L_0x0197
        L_0x018d:
            r26 = r0
            r24 = r1
            r20 = r2
            r17 = 0
            r18 = 1065353216(0x3f800000, float:1.0)
        L_0x0197:
            if (r8 != 0) goto L_0x01c1
            java.util.List r1 = r15.c()
            r8 = r1
            java.util.Collection r8 = (java.util.Collection) r8
            int r8 = r8.size()
            r9 = 0
        L_0x01a5:
            if (r9 >= r8) goto L_0x01c1
            java.lang.Object r10 = r1.get(r9)
            androidx.compose.ui.input.pointer.PointerInputChange r10 = (androidx.compose.ui.input.pointer.PointerInputChange) r10
            boolean r10 = r10.i()
            if (r10 == 0) goto L_0x01be
            r10 = r17
            r8 = r18
            r1 = r24
            r9 = 2
            r11 = 0
            r12 = 1
            goto L_0x0088
        L_0x01be:
            int r9 = r9 + 1
            goto L_0x01a5
        L_0x01c1:
            kotlin.Unit r0 = kotlin.Unit.f40552a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TransformGestureDetectorKt$detectTransformGestures$2.x(java.lang.Object):java.lang.Object");
    }

    /* renamed from: z */
    public final Object m(AwaitPointerEventScope awaitPointerEventScope, Continuation continuation) {
        return ((TransformGestureDetectorKt$detectTransformGestures$2) s(awaitPointerEventScope, continuation)).x(Unit.f40552a);
    }
}
