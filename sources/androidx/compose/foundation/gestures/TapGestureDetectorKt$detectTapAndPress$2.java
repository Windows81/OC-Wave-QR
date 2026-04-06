package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerInputScope;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScope;

@Metadata
@DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2", f = "TapGestureDetector.kt", l = {247}, m = "invokeSuspend")
public final class TapGestureDetectorKt$detectTapAndPress$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int D;
    public /* synthetic */ Object E;
    public final /* synthetic */ PointerInputScope F;
    public final /* synthetic */ Function3 G;
    public final /* synthetic */ Function1 H;
    public final /* synthetic */ PressGestureScopeImpl I;

    @Metadata
    @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1", f = "TapGestureDetector.kt", l = {251, 257}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1  reason: invalid class name */
    public static final class AnonymousClass1 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {

        /* renamed from: B  reason: collision with root package name */
        public Object f3598B;
        public int C;
        public /* synthetic */ Object D;

        public final Continuation s(Object obj, Continuation continuation) {
            AnonymousClass1 r0 = new AnonymousClass1(coroutineScope, function3, function1, pressGestureScopeImpl, continuation);
            r0.D = obj;
            return r0;
        }

        /* JADX WARNING: Removed duplicated region for block: B:21:0x008e  */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x009e  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object x(java.lang.Object r13) {
            /*
                r12 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r1 = r12.C
                r2 = 2
                r3 = 1
                r4 = 0
                if (r1 == 0) goto L_0x002e
                if (r1 == r3) goto L_0x0021
                if (r1 != r2) goto L_0x0019
                java.lang.Object r0 = r12.D
                kotlinx.coroutines.Job r0 = (kotlinx.coroutines.Job) r0
                kotlin.ResultKt.b(r13)
                r6 = r0
                goto L_0x008a
            L_0x0019:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L_0x0021:
                java.lang.Object r1 = r12.f3598B
                kotlinx.coroutines.Job r1 = (kotlinx.coroutines.Job) r1
                java.lang.Object r5 = r12.D
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r5 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r5
                kotlin.ResultKt.b(r13)
                r11 = r5
                goto L_0x005d
            L_0x002e:
                kotlin.ResultKt.b(r13)
                java.lang.Object r13 = r12.D
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r13 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r13
                kotlinx.coroutines.CoroutineScope r5 = r4
                kotlinx.coroutines.CoroutineStart r7 = androidx.compose.foundation.gestures.TapGestureDetectorKt.n()
                androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$resetJob$1 r8 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$resetJob$1
                androidx.compose.foundation.gestures.PressGestureScopeImpl r1 = r7
                r8.<init>(r1, r4)
                r9 = 1
                r10 = 0
                r6 = 0
                kotlinx.coroutines.Job r1 = kotlinx.coroutines.BuildersKt__Builders_commonKt.d(r5, r6, r7, r8, r9, r10)
                r12.D = r13
                r12.f3598B = r1
                r12.C = r3
                r6 = 0
                r7 = 0
                r9 = 3
                r5 = r13
                r8 = r12
                java.lang.Object r5 = androidx.compose.foundation.gestures.TapGestureDetectorKt.f(r5, r6, r7, r8, r9, r10)
                if (r5 != r0) goto L_0x005b
                return r0
            L_0x005b:
                r11 = r13
                r13 = r5
            L_0x005d:
                androidx.compose.ui.input.pointer.PointerInputChange r13 = (androidx.compose.ui.input.pointer.PointerInputChange) r13
                r13.a()
                kotlin.jvm.functions.Function3 r5 = r5
                kotlin.jvm.functions.Function3 r6 = androidx.compose.foundation.gestures.TapGestureDetectorKt.f3596a
                if (r5 == r6) goto L_0x007c
                kotlinx.coroutines.CoroutineScope r5 = r4
                androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$1 r8 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$1
                kotlin.jvm.functions.Function3 r6 = r5
                androidx.compose.foundation.gestures.PressGestureScopeImpl r7 = r7
                r8.<init>(r6, r7, r13, r4)
                r9 = 2
                r10 = 0
                r7 = 0
                r6 = r1
                androidx.compose.foundation.gestures.TapGestureDetectorKt.r(r5, r6, r7, r8, r9, r10)
            L_0x007c:
                r12.D = r1
                r12.f3598B = r4
                r12.C = r2
                java.lang.Object r13 = androidx.compose.foundation.gestures.TapGestureDetectorKt.v(r11, r4, r12, r3, r4)
                if (r13 != r0) goto L_0x0089
                return r0
            L_0x0089:
                r6 = r1
            L_0x008a:
                androidx.compose.ui.input.pointer.PointerInputChange r13 = (androidx.compose.ui.input.pointer.PointerInputChange) r13
                if (r13 != 0) goto L_0x009e
                kotlinx.coroutines.CoroutineScope r5 = r4
                androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$2 r8 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$2
                androidx.compose.foundation.gestures.PressGestureScopeImpl r13 = r7
                r8.<init>(r13, r4)
                r9 = 2
                r10 = 0
                r7 = 0
                androidx.compose.foundation.gestures.TapGestureDetectorKt.r(r5, r6, r7, r8, r9, r10)
                goto L_0x00bf
            L_0x009e:
                r13.a()
                kotlinx.coroutines.CoroutineScope r5 = r4
                androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$3 r8 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$3
                androidx.compose.foundation.gestures.PressGestureScopeImpl r0 = r7
                r8.<init>(r0, r4)
                r9 = 2
                r10 = 0
                r7 = 0
                androidx.compose.foundation.gestures.TapGestureDetectorKt.r(r5, r6, r7, r8, r9, r10)
                kotlin.jvm.functions.Function1 r0 = r6
                if (r0 == 0) goto L_0x00bf
                long r1 = r13.h()
                androidx.compose.ui.geometry.Offset r13 = androidx.compose.ui.geometry.Offset.d(r1)
                r0.invoke(r13)
            L_0x00bf:
                kotlin.Unit r13 = kotlin.Unit.f40552a
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2.AnonymousClass1.x(java.lang.Object):java.lang.Object");
        }

        /* renamed from: z */
        public final Object m(AwaitPointerEventScope awaitPointerEventScope, Continuation continuation) {
            return ((AnonymousClass1) s(awaitPointerEventScope, continuation)).x(Unit.f40552a);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TapGestureDetectorKt$detectTapAndPress$2(PointerInputScope pointerInputScope, Function3 function3, Function1 function1, PressGestureScopeImpl pressGestureScopeImpl, Continuation continuation) {
        super(2, continuation);
        this.F = pointerInputScope;
        this.G = function3;
        this.H = function1;
        this.I = pressGestureScopeImpl;
    }

    /* renamed from: A */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((TapGestureDetectorKt$detectTapAndPress$2) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        TapGestureDetectorKt$detectTapAndPress$2 tapGestureDetectorKt$detectTapAndPress$2 = new TapGestureDetectorKt$detectTapAndPress$2(this.F, this.G, this.H, this.I, continuation);
        tapGestureDetectorKt$detectTapAndPress$2.E = obj;
        return tapGestureDetectorKt$detectTapAndPress$2;
    }

    public final Object x(Object obj) {
        Object f2 = IntrinsicsKt.f();
        int i2 = this.D;
        if (i2 == 0) {
            ResultKt.b(obj);
            final CoroutineScope coroutineScope = (CoroutineScope) this.E;
            PointerInputScope pointerInputScope = this.F;
            final Function3 function3 = this.G;
            final Function1 function1 = this.H;
            final PressGestureScopeImpl pressGestureScopeImpl = this.I;
            AnonymousClass1 r3 = new AnonymousClass1((Continuation) null);
            this.D = 1;
            if (ForEachGestureKt.e(pointerInputScope, r3, this) == f2) {
                return f2;
            }
        } else if (i2 == 1) {
            ResultKt.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.f40552a;
    }
}
