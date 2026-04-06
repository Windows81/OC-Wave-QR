package androidx.compose.foundation.text.handwriting;

import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;

@Metadata
public final class StylusHandwritingNode$suspendingPointerInputModifierNode$1 implements PointerInputEventHandler {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ StylusHandwritingNode f6050z;

    @Metadata
    @DebugMetadata(c = "androidx.compose.foundation.text.handwriting.StylusHandwritingNode$suspendingPointerInputModifierNode$1$1", f = "StylusHandwriting.kt", l = {105, 133, 171}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.text.handwriting.StylusHandwritingNode$suspendingPointerInputModifierNode$1$1  reason: invalid class name */
    public static final class AnonymousClass1 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {

        /* renamed from: B  reason: collision with root package name */
        public Object f6051B;
        public Object C;
        public int D;
        public /* synthetic */ Object E;

        public final Continuation s(Object obj, Continuation continuation) {
            AnonymousClass1 r0 = new AnonymousClass1(stylusHandwritingNode, continuation);
            r0.E = obj;
            return r0;
        }

        /* JADX WARNING: Removed duplicated region for block: B:36:0x00f5 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:39:0x0106  */
        /* JADX WARNING: Removed duplicated region for block: B:54:0x0156  */
        /* JADX WARNING: Removed duplicated region for block: B:55:0x0158  */
        /* JADX WARNING: Removed duplicated region for block: B:58:0x0176  */
        /* JADX WARNING: Removed duplicated region for block: B:60:0x0179  */
        /* JADX WARNING: Removed duplicated region for block: B:66:0x01a6 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:69:0x01b7  */
        /* JADX WARNING: Removed duplicated region for block: B:79:0x01e1  */
        /* JADX WARNING: Removed duplicated region for block: B:81:0x01e4  */
        /* JADX WARNING: Removed duplicated region for block: B:82:0x01e8  */
        /* JADX WARNING: Removed duplicated region for block: B:83:0x0132 A[SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:88:0x01dc A[SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object x(java.lang.Object r18) {
            /*
                r17 = this;
                r0 = r17
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r2 = r0.D
                r3 = 3
                r4 = 2
                r6 = 1
                if (r2 == 0) goto L_0x0048
                if (r2 == r6) goto L_0x003e
                if (r2 == r4) goto L_0x002b
                if (r2 != r3) goto L_0x0023
                java.lang.Object r2 = r0.f6051B
                androidx.compose.ui.input.pointer.PointerInputChange r2 = (androidx.compose.ui.input.pointer.PointerInputChange) r2
                java.lang.Object r4 = r0.E
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r4 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r4
                kotlin.ResultKt.b(r18)
                r5 = r18
                r7 = 0
                goto L_0x01a7
            L_0x0023:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L_0x002b:
                java.lang.Object r2 = r0.C
                androidx.compose.ui.input.pointer.PointerEventPass r2 = (androidx.compose.ui.input.pointer.PointerEventPass) r2
                java.lang.Object r6 = r0.f6051B
                androidx.compose.ui.input.pointer.PointerInputChange r6 = (androidx.compose.ui.input.pointer.PointerInputChange) r6
                java.lang.Object r8 = r0.E
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r8 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r8
                kotlin.ResultKt.b(r18)
                r9 = r18
                goto L_0x00f6
            L_0x003e:
                java.lang.Object r2 = r0.E
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r2 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r2
                kotlin.ResultKt.b(r18)
                r8 = r18
                goto L_0x005c
            L_0x0048:
                kotlin.ResultKt.b(r18)
                java.lang.Object r2 = r0.E
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r2 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r2
                androidx.compose.ui.input.pointer.PointerEventPass r8 = androidx.compose.ui.input.pointer.PointerEventPass.Initial
                r0.E = r2
                r0.D = r6
                java.lang.Object r8 = androidx.compose.foundation.gestures.TapGestureDetectorKt.e(r2, r6, r8, r0)
                if (r8 != r1) goto L_0x005c
                return r1
            L_0x005c:
                androidx.compose.ui.input.pointer.PointerInputChange r8 = (androidx.compose.ui.input.pointer.PointerInputChange) r8
                int r9 = r8.n()
                androidx.compose.ui.input.pointer.PointerType$Companion r10 = androidx.compose.ui.input.pointer.PointerType.f16933b
                int r11 = r10.c()
                boolean r9 = androidx.compose.ui.input.pointer.PointerType.h(r9, r11)
                if (r9 != 0) goto L_0x0080
                int r9 = r8.n()
                int r10 = r10.a()
                boolean r9 = androidx.compose.ui.input.pointer.PointerType.h(r9, r10)
                if (r9 == 0) goto L_0x007d
                goto L_0x0080
            L_0x007d:
                kotlin.Unit r1 = kotlin.Unit.f40552a
                return r1
            L_0x0080:
                long r9 = r8.h()
                r11 = 32
                long r9 = r9 >> r11
                int r9 = (int) r9
                float r9 = java.lang.Float.intBitsToFloat(r9)
                r10 = 0
                int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
                if (r9 < 0) goto L_0x00d0
                long r12 = r8.h()
                long r12 = r12 >> r11
                int r9 = (int) r12
                float r9 = java.lang.Float.intBitsToFloat(r9)
                long r12 = r2.a()
                long r11 = r12 >> r11
                int r11 = (int) r11
                float r11 = (float) r11
                int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
                if (r9 >= 0) goto L_0x00d0
                long r11 = r8.h()
                r13 = 4294967295(0xffffffff, double:2.1219957905E-314)
                long r11 = r11 & r13
                int r9 = (int) r11
                float r9 = java.lang.Float.intBitsToFloat(r9)
                int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
                if (r9 < 0) goto L_0x00d0
                long r9 = r8.h()
                long r9 = r9 & r13
                int r9 = (int) r9
                float r9 = java.lang.Float.intBitsToFloat(r9)
                long r10 = r2.a()
                long r10 = r10 & r13
                int r10 = (int) r10
                float r10 = (float) r10
                int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
                if (r9 >= 0) goto L_0x00d0
                goto L_0x00d1
            L_0x00d0:
                r6 = 0
            L_0x00d1:
                androidx.compose.foundation.text.handwriting.StylusHandwritingNode r9 = r1
                boolean r9 = r9.Q
                if (r9 != 0) goto L_0x00df
                if (r6 == 0) goto L_0x00dc
                goto L_0x00df
            L_0x00dc:
                androidx.compose.ui.input.pointer.PointerEventPass r6 = androidx.compose.ui.input.pointer.PointerEventPass.Main
                goto L_0x00e1
            L_0x00df:
                androidx.compose.ui.input.pointer.PointerEventPass r6 = androidx.compose.ui.input.pointer.PointerEventPass.Initial
            L_0x00e1:
                r16 = r8
                r8 = r2
                r2 = r6
                r6 = r16
            L_0x00e7:
                r0.E = r8
                r0.f6051B = r6
                r0.C = r2
                r0.D = r4
                java.lang.Object r9 = r8.k0(r2, r0)
                if (r9 != r1) goto L_0x00f6
                return r1
            L_0x00f6:
                androidx.compose.ui.input.pointer.PointerEvent r9 = (androidx.compose.ui.input.pointer.PointerEvent) r9
                java.util.List r10 = r9.c()
                r11 = r10
                java.util.Collection r11 = (java.util.Collection) r11
                int r11 = r11.size()
                r12 = 0
            L_0x0104:
                if (r12 >= r11) goto L_0x0132
                java.lang.Object r13 = r10.get(r12)
                r14 = r13
                androidx.compose.ui.input.pointer.PointerInputChange r14 = (androidx.compose.ui.input.pointer.PointerInputChange) r14
                boolean r15 = r14.p()
                if (r15 != 0) goto L_0x012a
                long r4 = r14.f()
                r18 = r8
                long r7 = r6.f()
                boolean r4 = androidx.compose.ui.input.pointer.PointerId.c(r4, r7)
                if (r4 == 0) goto L_0x012c
                boolean r4 = r14.i()
                if (r4 == 0) goto L_0x012c
                goto L_0x0135
            L_0x012a:
                r18 = r8
            L_0x012c:
                int r12 = r12 + 1
                r8 = r18
                r4 = 2
                goto L_0x0104
            L_0x0132:
                r18 = r8
                r13 = 0
            L_0x0135:
                androidx.compose.ui.input.pointer.PointerInputChange r13 = (androidx.compose.ui.input.pointer.PointerInputChange) r13
                if (r13 != 0) goto L_0x013a
                goto L_0x0156
            L_0x013a:
                long r4 = r13.o()
                long r7 = r6.o()
                long r4 = r4 - r7
                androidx.compose.ui.platform.ViewConfiguration r7 = r18.getViewConfiguration()
                long r7 = r7.c()
                int r4 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
                if (r4 < 0) goto L_0x0150
                goto L_0x0156
            L_0x0150:
                boolean r4 = androidx.compose.foundation.gestures.TapGestureDetector_androidKt.b(r9)
                if (r4 == 0) goto L_0x0158
            L_0x0156:
                r13 = 0
                goto L_0x0174
            L_0x0158:
                long r4 = r13.h()
                long r7 = r6.h()
                long r4 = androidx.compose.ui.geometry.Offset.p(r4, r7)
                float r4 = androidx.compose.ui.geometry.Offset.k(r4)
                androidx.compose.ui.platform.ViewConfiguration r5 = r18.getViewConfiguration()
                float r5 = r5.d()
                int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
                if (r4 <= 0) goto L_0x01e8
            L_0x0174:
                if (r13 != 0) goto L_0x0179
                kotlin.Unit r1 = kotlin.Unit.f40552a
                return r1
            L_0x0179:
                androidx.compose.foundation.text.handwriting.StylusHandwritingNode r2 = r1
                boolean r2 = r2.Q
                if (r2 != 0) goto L_0x0186
                androidx.compose.foundation.text.handwriting.StylusHandwritingNode r2 = r1
                androidx.compose.ui.focus.FocusRequesterModifierNodeKt.c(r2)
            L_0x0186:
                androidx.compose.foundation.text.handwriting.StylusHandwritingNode r2 = r1
                kotlin.jvm.functions.Function0 r2 = r2.g3()
                r2.invoke()
                r13.a()
                r4 = r18
                r2 = r6
            L_0x0195:
                androidx.compose.ui.input.pointer.PointerEventPass r5 = androidx.compose.ui.input.pointer.PointerEventPass.Initial
                r0.E = r4
                r0.f6051B = r2
                r7 = 0
                r0.C = r7
                r0.D = r3
                java.lang.Object r5 = r4.k0(r5, r0)
                if (r5 != r1) goto L_0x01a7
                return r1
            L_0x01a7:
                androidx.compose.ui.input.pointer.PointerEvent r5 = (androidx.compose.ui.input.pointer.PointerEvent) r5
                java.util.List r5 = r5.c()
                r6 = r5
                java.util.Collection r6 = (java.util.Collection) r6
                int r6 = r6.size()
                r8 = 0
            L_0x01b5:
                if (r8 >= r6) goto L_0x01dc
                java.lang.Object r9 = r5.get(r8)
                r10 = r9
                androidx.compose.ui.input.pointer.PointerInputChange r10 = (androidx.compose.ui.input.pointer.PointerInputChange) r10
                boolean r11 = r10.p()
                if (r11 != 0) goto L_0x01d9
                long r11 = r10.f()
                long r13 = r2.f()
                boolean r11 = androidx.compose.ui.input.pointer.PointerId.c(r11, r13)
                if (r11 == 0) goto L_0x01d9
                boolean r10 = r10.i()
                if (r10 == 0) goto L_0x01d9
                goto L_0x01dd
            L_0x01d9:
                int r8 = r8 + 1
                goto L_0x01b5
            L_0x01dc:
                r9 = r7
            L_0x01dd:
                androidx.compose.ui.input.pointer.PointerInputChange r9 = (androidx.compose.ui.input.pointer.PointerInputChange) r9
                if (r9 != 0) goto L_0x01e4
                kotlin.Unit r1 = kotlin.Unit.f40552a
                return r1
            L_0x01e4:
                r9.a()
                goto L_0x0195
            L_0x01e8:
                r8 = r18
                r4 = 2
                goto L_0x00e7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.handwriting.StylusHandwritingNode$suspendingPointerInputModifierNode$1.AnonymousClass1.x(java.lang.Object):java.lang.Object");
        }

        /* renamed from: z */
        public final Object m(AwaitPointerEventScope awaitPointerEventScope, Continuation continuation) {
            return ((AnonymousClass1) s(awaitPointerEventScope, continuation)).x(Unit.f40552a);
        }
    }

    public StylusHandwritingNode$suspendingPointerInputModifierNode$1(StylusHandwritingNode stylusHandwritingNode) {
        this.f6050z = stylusHandwritingNode;
    }

    public final Object invoke(PointerInputScope pointerInputScope, Continuation continuation) {
        final StylusHandwritingNode stylusHandwritingNode = this.f6050z;
        Object e2 = ForEachGestureKt.e(pointerInputScope, new AnonymousClass1((Continuation) null), continuation);
        return e2 == IntrinsicsKt.f() ? e2 : Unit.f40552a;
    }
}
