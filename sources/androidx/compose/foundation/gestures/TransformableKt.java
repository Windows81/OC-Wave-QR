package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.PointerInputScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.coroutines.channels.Channel;

@Metadata
public final class TransformableKt {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: androidx.compose.foundation.gestures.ScrollConfig} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x009c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object e(androidx.compose.ui.input.pointer.AwaitPointerEventScope r5, androidx.compose.foundation.gestures.ScrollConfig r6, kotlin.coroutines.Continuation r7) {
        /*
            boolean r0 = r7 instanceof androidx.compose.foundation.gestures.TransformableKt$awaitCtrlMouseScrollOrNull$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            androidx.compose.foundation.gestures.TransformableKt$awaitCtrlMouseScrollOrNull$1 r0 = (androidx.compose.foundation.gestures.TransformableKt$awaitCtrlMouseScrollOrNull$1) r0
            int r1 = r0.F
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.F = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.foundation.gestures.TransformableKt$awaitCtrlMouseScrollOrNull$1 r0 = new androidx.compose.foundation.gestures.TransformableKt$awaitCtrlMouseScrollOrNull$1
            r0.<init>(r7)
        L_0x0018:
            java.lang.Object r7 = r0.E
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.F
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r4) goto L_0x0033
            java.lang.Object r5 = r0.D
            r6 = r5
            androidx.compose.foundation.gestures.ScrollConfig r6 = (androidx.compose.foundation.gestures.ScrollConfig) r6
            java.lang.Object r5 = r0.C
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r5 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r5
            kotlin.ResultKt.b(r7)
            goto L_0x004b
        L_0x0033:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x003b:
            kotlin.ResultKt.b(r7)
            r0.C = r5
            r0.D = r6
            r0.F = r4
            java.lang.Object r7 = androidx.compose.ui.input.pointer.AwaitPointerEventScope.P0(r5, r3, r0, r4, r3)
            if (r7 != r1) goto L_0x004b
            return r1
        L_0x004b:
            androidx.compose.ui.input.pointer.PointerEvent r7 = (androidx.compose.ui.input.pointer.PointerEvent) r7
            int r0 = r7.f()
            boolean r0 = androidx.compose.ui.input.pointer.PointerEvent_androidKt.b(r0)
            if (r0 == 0) goto L_0x009c
            int r0 = r7.h()
            androidx.compose.ui.input.pointer.PointerEventType$Companion r1 = androidx.compose.ui.input.pointer.PointerEventType.f16852b
            int r1 = r1.f()
            boolean r0 = androidx.compose.ui.input.pointer.PointerEventType.j(r0, r1)
            if (r0 != 0) goto L_0x0068
            goto L_0x009c
        L_0x0068:
            long r0 = r5.a()
            long r5 = r6.c(r5, r7, r0)
            androidx.compose.ui.geometry.Offset$Companion r0 = androidx.compose.ui.geometry.Offset.f15855b
            long r0 = r0.c()
            boolean r0 = androidx.compose.ui.geometry.Offset.j(r5, r0)
            if (r0 == 0) goto L_0x007d
            return r3
        L_0x007d:
            java.util.List r7 = r7.c()
            r0 = r7
            java.util.Collection r0 = (java.util.Collection) r0
            int r0 = r0.size()
            r1 = 0
        L_0x0089:
            if (r1 >= r0) goto L_0x0097
            java.lang.Object r2 = r7.get(r1)
            androidx.compose.ui.input.pointer.PointerInputChange r2 = (androidx.compose.ui.input.pointer.PointerInputChange) r2
            r2.a()
            int r1 = r1 + 1
            goto L_0x0089
        L_0x0097:
            androidx.compose.ui.geometry.Offset r5 = androidx.compose.ui.geometry.Offset.d(r5)
            return r5
        L_0x009c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TransformableKt.e(androidx.compose.ui.input.pointer.AwaitPointerEventScope, androidx.compose.foundation.gestures.ScrollConfig, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0050 A[RETURN] */
    public static final java.lang.Object f(androidx.compose.ui.input.pointer.AwaitPointerEventScope r5, androidx.compose.foundation.gestures.ScrollConfig r6, kotlin.coroutines.Continuation r7) {
        /*
            boolean r0 = r7 instanceof androidx.compose.foundation.gestures.TransformableKt$awaitFirstCtrlMouseScroll$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            androidx.compose.foundation.gestures.TransformableKt$awaitFirstCtrlMouseScroll$1 r0 = (androidx.compose.foundation.gestures.TransformableKt$awaitFirstCtrlMouseScroll$1) r0
            int r1 = r0.F
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.F = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.foundation.gestures.TransformableKt$awaitFirstCtrlMouseScroll$1 r0 = new androidx.compose.foundation.gestures.TransformableKt$awaitFirstCtrlMouseScroll$1
            r0.<init>(r7)
        L_0x0018:
            java.lang.Object r7 = r0.E
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.F
            r3 = 1
            if (r2 == 0) goto L_0x003c
            if (r2 != r3) goto L_0x0034
            java.lang.Object r5 = r0.D
            androidx.compose.foundation.gestures.ScrollConfig r5 = (androidx.compose.foundation.gestures.ScrollConfig) r5
            java.lang.Object r6 = r0.C
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r6 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r6
            kotlin.ResultKt.b(r7)
            r4 = r6
            r6 = r5
            r5 = r4
            goto L_0x004c
        L_0x0034:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x003c:
            kotlin.ResultKt.b(r7)
        L_0x003f:
            r0.C = r5
            r0.D = r6
            r0.F = r3
            java.lang.Object r7 = e(r5, r6, r0)
            if (r7 != r1) goto L_0x004c
            return r1
        L_0x004c:
            androidx.compose.ui.geometry.Offset r7 = (androidx.compose.ui.geometry.Offset) r7
            if (r7 == 0) goto L_0x003f
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TransformableKt.f(androidx.compose.ui.input.pointer.AwaitPointerEventScope, androidx.compose.foundation.gestures.ScrollConfig, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:61:0x01f4, code lost:
        if (((java.lang.Boolean) r13.invoke(androidx.compose.ui.geometry.Offset.d(r1))).booleanValue() != false) goto L_0x0202;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x02a6, code lost:
        if (r5 != 0) goto L_0x02ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x02a8, code lost:
        r2 = true;
     */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x02ad A[EDGE_INSN: B:102:0x02ad->B:85:0x02ad ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x02dd A[EDGE_INSN: B:104:0x02dd->B:94:0x02dd ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x014a  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x01af  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x01b1  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x021e  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x023e  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x027b  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x029a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x02c0  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0147 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object g(androidx.compose.ui.input.pointer.AwaitPointerEventScope r29, boolean r30, kotlinx.coroutines.channels.Channel r31, kotlin.jvm.functions.Function1 r32, kotlin.coroutines.Continuation r33) {
        /*
            r0 = r33
            boolean r1 = r0 instanceof androidx.compose.foundation.gestures.TransformableKt$detectZoom$1
            if (r1 == 0) goto L_0x0015
            r1 = r0
            androidx.compose.foundation.gestures.TransformableKt$detectZoom$1 r1 = (androidx.compose.foundation.gestures.TransformableKt$detectZoom$1) r1
            int r2 = r1.P
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0015
            int r2 = r2 - r3
            r1.P = r2
            goto L_0x001a
        L_0x0015:
            androidx.compose.foundation.gestures.TransformableKt$detectZoom$1 r1 = new androidx.compose.foundation.gestures.TransformableKt$detectZoom$1
            r1.<init>(r0)
        L_0x001a:
            java.lang.Object r0 = r1.O
            java.lang.Object r8 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r1.P
            r10 = 3
            r11 = 2
            r14 = 1
            if (r2 == 0) goto L_0x00b2
            if (r2 == r14) goto L_0x008e
            if (r2 == r11) goto L_0x0066
            if (r2 != r10) goto L_0x005e
            int r2 = r1.N
            int r3 = r1.M
            float r4 = r1.J
            int r5 = r1.L
            long r6 = r1.K
            float r15 = r1.I
            float r10 = r1.H
            boolean r11 = r1.G
            java.lang.Object r14 = r1.F
            androidx.compose.ui.input.pointer.PointerEvent r14 = (androidx.compose.ui.input.pointer.PointerEvent) r14
            java.lang.Object r13 = r1.E
            kotlin.jvm.functions.Function1 r13 = (kotlin.jvm.functions.Function1) r13
            java.lang.Object r9 = r1.D
            kotlinx.coroutines.channels.Channel r9 = (kotlinx.coroutines.channels.Channel) r9
            java.lang.Object r12 = r1.C
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r12 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r12
            kotlin.ResultKt.b(r0)
            r19 = r11
            r17 = 0
            r18 = 1065353216(0x3f800000, float:1.0)
            r11 = r10
            r10 = r9
            r9 = r15
            r15 = r2
            r2 = r0
            r0 = 3
            goto L_0x0287
        L_0x005e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0066:
            int r2 = r1.M
            float r3 = r1.J
            int r4 = r1.L
            long r5 = r1.K
            float r7 = r1.I
            float r9 = r1.H
            boolean r10 = r1.G
            java.lang.Object r11 = r1.E
            kotlin.jvm.functions.Function1 r11 = (kotlin.jvm.functions.Function1) r11
            java.lang.Object r12 = r1.D
            kotlinx.coroutines.channels.Channel r12 = (kotlinx.coroutines.channels.Channel) r12
            java.lang.Object r13 = r1.C
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r13 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r13
            kotlin.ResultKt.b(r0)
            r14 = r10
            r10 = 2
            r28 = r11
            r11 = r9
            r9 = r12
            r12 = r13
            r13 = r28
            goto L_0x0123
        L_0x008e:
            int r2 = r1.M
            float r3 = r1.J
            int r4 = r1.L
            long r5 = r1.K
            float r7 = r1.I
            float r9 = r1.H
            boolean r10 = r1.G
            java.lang.Object r11 = r1.E
            kotlin.jvm.functions.Function1 r11 = (kotlin.jvm.functions.Function1) r11
            java.lang.Object r12 = r1.D
            kotlinx.coroutines.channels.Channel r12 = (kotlinx.coroutines.channels.Channel) r12
            java.lang.Object r13 = r1.C
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r13 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r13
            kotlin.ResultKt.b(r0)
            r14 = r10
            r28 = r13
            r13 = r11
            r11 = r28
            goto L_0x00fb
        L_0x00b2:
            kotlin.ResultKt.b(r0)
            androidx.compose.ui.geometry.Offset$Companion r0 = androidx.compose.ui.geometry.Offset.f15855b
            long r9 = r0.c()
            androidx.compose.ui.platform.ViewConfiguration r0 = r29.getViewConfiguration()
            float r0 = r0.g()
            r11 = r29
            r1.C = r11
            r12 = r31
            r1.D = r12
            r13 = r32
            r1.E = r13
            r14 = r30
            r1.G = r14
            r2 = 0
            r1.H = r2
            r2 = 1065353216(0x3f800000, float:1.0)
            r1.I = r2
            r1.K = r9
            r2 = 0
            r1.L = r2
            r1.J = r0
            r1.M = r2
            r2 = 1
            r1.P = r2
            r3 = 0
            r4 = 0
            r6 = 2
            r7 = 0
            r2 = r29
            r5 = r1
            java.lang.Object r2 = androidx.compose.foundation.gestures.TapGestureDetectorKt.f(r2, r3, r4, r5, r6, r7)
            if (r2 != r8) goto L_0x00f4
            return r8
        L_0x00f4:
            r3 = r0
            r5 = r9
            r2 = 0
            r4 = 0
            r7 = 1065353216(0x3f800000, float:1.0)
            r9 = 0
        L_0x00fb:
            r1.C = r11
            r1.D = r12
            r1.E = r13
            r0 = 0
            r1.F = r0
            r1.G = r14
            r1.H = r9
            r1.I = r7
            r1.K = r5
            r1.L = r4
            r1.J = r3
            r1.M = r2
            r10 = 2
            r1.P = r10
            r15 = 1
            java.lang.Object r0 = androidx.compose.ui.input.pointer.AwaitPointerEventScope.P0(r11, r0, r1, r15, r0)
            if (r0 != r8) goto L_0x011d
            return r8
        L_0x011d:
            r28 = r11
            r11 = r9
            r9 = r12
            r12 = r28
        L_0x0123:
            androidx.compose.ui.input.pointer.PointerEvent r0 = (androidx.compose.ui.input.pointer.PointerEvent) r0
            java.util.List r15 = r0.c()
            r16 = r15
            java.util.Collection r16 = (java.util.Collection) r16
            int r10 = r16.size()
            r30 = r2
            r2 = 0
        L_0x0134:
            if (r2 >= r10) goto L_0x0147
            java.lang.Object r16 = r15.get(r2)
            androidx.compose.ui.input.pointer.PointerInputChange r16 = (androidx.compose.ui.input.pointer.PointerInputChange) r16
            boolean r16 = r16.p()
            if (r16 == 0) goto L_0x0144
            r2 = 1
            goto L_0x0148
        L_0x0144:
            int r2 = r2 + 1
            goto L_0x0134
        L_0x0147:
            r2 = 0
        L_0x0148:
            if (r2 != 0) goto L_0x023e
            float r21 = androidx.compose.foundation.gestures.TransformGestureDetectorKt.f(r0)
            float r10 = androidx.compose.foundation.gestures.TransformGestureDetectorKt.e(r0)
            r15 = r1
            r31 = r2
            long r1 = androidx.compose.foundation.gestures.TransformGestureDetectorKt.d(r0)
            if (r4 != 0) goto L_0x01b9
            float r7 = r7 * r21
            float r11 = r11 + r10
            long r5 = androidx.compose.ui.geometry.Offset.q(r5, r1)
            r32 = r4
            r4 = 0
            float r16 = androidx.compose.foundation.gestures.TransformGestureDetectorKt.c(r0, r4)
            r17 = r10
            r4 = 1
            float r10 = (float) r4
            float r10 = r10 - r7
            float r10 = java.lang.Math.abs(r10)
            float r10 = r10 * r16
            r20 = 1078530011(0x40490fdb, float:3.1415927)
            float r20 = r20 * r11
            float r20 = r20 * r16
            r16 = 1127481344(0x43340000, float:180.0)
            float r20 = r20 / r16
            float r16 = java.lang.Math.abs(r20)
            float r20 = androidx.compose.ui.geometry.Offset.k(r5)
            int r10 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r10 > 0) goto L_0x01a9
            int r10 = (r16 > r3 ? 1 : (r16 == r3 ? 0 : -1))
            if (r10 > 0) goto L_0x01a9
            int r10 = (r20 > r3 ? 1 : (r20 == r3 ? 0 : -1))
            if (r10 <= 0) goto L_0x01a4
            androidx.compose.ui.geometry.Offset r10 = androidx.compose.ui.geometry.Offset.d(r1)
            java.lang.Object r10 = r13.invoke(r10)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L_0x01a4
            goto L_0x01a9
        L_0x01a4:
            r10 = r30
            r4 = r32
            goto L_0x01bf
        L_0x01a9:
            if (r14 == 0) goto L_0x01b1
            int r10 = (r16 > r3 ? 1 : (r16 == r3 ? 0 : -1))
            if (r10 >= 0) goto L_0x01b1
            r10 = r4
            goto L_0x01b2
        L_0x01b1:
            r10 = 0
        L_0x01b2:
            androidx.compose.foundation.gestures.TransformEvent$TransformStarted r4 = androidx.compose.foundation.gestures.TransformEvent.TransformStarted.f3608a
            r9.L(r4)
            r4 = 1
            goto L_0x01bf
        L_0x01b9:
            r32 = r4
            r17 = r10
            r10 = r30
        L_0x01bf:
            if (r4 == 0) goto L_0x0230
            if (r10 == 0) goto L_0x01c8
            r17 = 0
            r24 = 0
            goto L_0x01cc
        L_0x01c8:
            r24 = r17
            r17 = 0
        L_0x01cc:
            int r19 = (r24 > r17 ? 1 : (r24 == r17 ? 0 : -1))
            if (r19 != 0) goto L_0x01fc
            r18 = 1065353216(0x3f800000, float:1.0)
            int r19 = (r21 > r18 ? 1 : (r21 == r18 ? 0 : -1))
            if (r19 != 0) goto L_0x01f7
            androidx.compose.ui.geometry.Offset$Companion r19 = androidx.compose.ui.geometry.Offset.f15855b
            r30 = r4
            r26 = r5
            long r4 = r19.c()
            boolean r4 = androidx.compose.ui.geometry.Offset.j(r1, r4)
            if (r4 != 0) goto L_0x0210
            androidx.compose.ui.geometry.Offset r4 = androidx.compose.ui.geometry.Offset.d(r1)
            java.lang.Object r4 = r13.invoke(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L_0x0210
            goto L_0x0202
        L_0x01f7:
            r30 = r4
            r26 = r5
            goto L_0x0202
        L_0x01fc:
            r30 = r4
            r26 = r5
            r18 = 1065353216(0x3f800000, float:1.0)
        L_0x0202:
            androidx.compose.foundation.gestures.TransformEvent$TransformDelta r4 = new androidx.compose.foundation.gestures.TransformEvent$TransformDelta
            r25 = 0
            r20 = r4
            r22 = r1
            r20.<init>(r21, r22, r24, r25)
            r9.L(r4)
        L_0x0210:
            java.util.List r1 = r0.c()
            r2 = r1
            java.util.Collection r2 = (java.util.Collection) r2
            int r2 = r2.size()
            r4 = 0
        L_0x021c:
            if (r4 >= r2) goto L_0x0238
            java.lang.Object r5 = r1.get(r4)
            androidx.compose.ui.input.pointer.PointerInputChange r5 = (androidx.compose.ui.input.pointer.PointerInputChange) r5
            boolean r6 = androidx.compose.ui.input.pointer.PointerEventKt.j(r5)
            if (r6 == 0) goto L_0x022d
            r5.a()
        L_0x022d:
            int r4 = r4 + 1
            goto L_0x021c
        L_0x0230:
            r30 = r4
            r26 = r5
            r17 = 0
            r18 = 1065353216(0x3f800000, float:1.0)
        L_0x0238:
            r5 = r30
            r1 = r7
            r6 = r26
            goto L_0x0252
        L_0x023e:
            r15 = r1
            r31 = r2
            r32 = r4
            r17 = 0
            r18 = 1065353216(0x3f800000, float:1.0)
            androidx.compose.foundation.gestures.TransformEvent$TransformStopped r1 = androidx.compose.foundation.gestures.TransformEvent.TransformStopped.f3609a
            r9.L(r1)
            r10 = r30
            r1 = r7
            r6 = r5
            r5 = r32
        L_0x0252:
            androidx.compose.ui.input.pointer.PointerEventPass r2 = androidx.compose.ui.input.pointer.PointerEventPass.Final
            r4 = r15
            r4.C = r12
            r4.D = r9
            r4.E = r13
            r4.F = r0
            r4.G = r14
            r4.H = r11
            r4.I = r1
            r4.K = r6
            r4.L = r5
            r4.J = r3
            r4.M = r10
            r15 = r31
            r4.N = r15
            r30 = r0
            r0 = 3
            r4.P = r0
            java.lang.Object r2 = r12.k0(r2, r4)
            if (r2 != r8) goto L_0x027b
            return r8
        L_0x027b:
            r19 = r14
            r14 = r30
            r28 = r9
            r9 = r1
            r1 = r4
            r4 = r3
            r3 = r10
            r10 = r28
        L_0x0287:
            androidx.compose.ui.input.pointer.PointerEvent r2 = (androidx.compose.ui.input.pointer.PointerEvent) r2
            java.util.List r2 = r2.c()
            r20 = r2
            java.util.Collection r20 = (java.util.Collection) r20
            int r0 = r20.size()
            r30 = r1
            r1 = 0
        L_0x0298:
            if (r1 >= r0) goto L_0x02ad
            java.lang.Object r20 = r2.get(r1)
            androidx.compose.ui.input.pointer.PointerInputChange r20 = (androidx.compose.ui.input.pointer.PointerInputChange) r20
            boolean r20 = r20.p()
            if (r20 == 0) goto L_0x02aa
            if (r5 != 0) goto L_0x02ad
            r2 = 1
            goto L_0x02ae
        L_0x02aa:
            int r1 = r1 + 1
            goto L_0x0298
        L_0x02ad:
            r2 = 0
        L_0x02ae:
            if (r15 != 0) goto L_0x02dd
            if (r2 != 0) goto L_0x02dd
            java.util.List r0 = r14.c()
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            int r1 = r1.size()
            r2 = 0
        L_0x02be:
            if (r2 >= r1) goto L_0x02dd
            java.lang.Object r14 = r0.get(r2)
            androidx.compose.ui.input.pointer.PointerInputChange r14 = (androidx.compose.ui.input.pointer.PointerInputChange) r14
            boolean r14 = r14.i()
            if (r14 == 0) goto L_0x02da
            r1 = r30
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r7 = r9
            r9 = r11
            r11 = r12
            r14 = r19
            r12 = r10
            goto L_0x00fb
        L_0x02da:
            int r2 = r2 + 1
            goto L_0x02be
        L_0x02dd:
            kotlin.Unit r0 = kotlin.Unit.f40552a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TransformableKt.g(androidx.compose.ui.input.pointer.AwaitPointerEventScope, boolean, kotlinx.coroutines.channels.Channel, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final Object h(PointerInputScope pointerInputScope, Channel channel, ScrollConfig scrollConfig, Continuation continuation) {
        Object M0 = pointerInputScope.M0(new TransformableKt$detectZoomByCtrlMouseScroll$2(continuation.f(), scrollConfig, channel, (Continuation) null), continuation);
        return M0 == IntrinsicsKt.f() ? M0 : Unit.f40552a;
    }
}
