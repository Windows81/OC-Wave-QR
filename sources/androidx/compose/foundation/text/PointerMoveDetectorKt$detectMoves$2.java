package androidx.compose.foundation.text;

import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputScope;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata
@DebugMetadata(c = "androidx.compose.foundation.text.PointerMoveDetectorKt$detectMoves$2", f = "PointerMoveDetector.kt", l = {41}, m = "invokeSuspend")
final class PointerMoveDetectorKt$detectMoves$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int D;
    public final /* synthetic */ PointerInputScope E;
    public final /* synthetic */ PointerEventPass F;
    public final /* synthetic */ Function1 G;

    @Metadata
    @DebugMetadata(c = "androidx.compose.foundation.text.PointerMoveDetectorKt$detectMoves$2$1", f = "PointerMoveDetector.kt", l = {44}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.text.PointerMoveDetectorKt$detectMoves$2$1  reason: invalid class name */
    public static final class AnonymousClass1 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {

        /* renamed from: B  reason: collision with root package name */
        public Object f5861B;
        public int C;
        public /* synthetic */ Object D;

        public final Continuation s(Object obj, Continuation continuation) {
            AnonymousClass1 r0 = new AnonymousClass1(f3, pointerEventPass, function1, continuation);
            r0.D = obj;
            return r0;
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0055  */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x0057  */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x0061  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x0063  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x006d  */
        /* JADX WARNING: Removed duplicated region for block: B:9:0x0034  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object x(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r1 = r7.C
                r2 = 1
                if (r1 == 0) goto L_0x001f
                if (r1 != r2) goto L_0x0017
                java.lang.Object r1 = r7.f5861B
                kotlin.jvm.internal.Ref$ObjectRef r1 = (kotlin.jvm.internal.Ref.ObjectRef) r1
                java.lang.Object r3 = r7.D
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r3 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r3
                kotlin.ResultKt.b(r8)
                goto L_0x0043
            L_0x0017:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L_0x001f:
                kotlin.ResultKt.b(r8)
                java.lang.Object r8 = r7.D
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r8 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r8
                kotlin.jvm.internal.Ref$ObjectRef r1 = new kotlin.jvm.internal.Ref$ObjectRef
                r1.<init>()
                r3 = r8
            L_0x002c:
                kotlin.coroutines.CoroutineContext r8 = r8
                boolean r8 = kotlinx.coroutines.JobKt.n(r8)
                if (r8 == 0) goto L_0x00a3
                androidx.compose.ui.input.pointer.PointerEventPass r8 = r4
                r7.D = r3
                r7.f5861B = r1
                r7.C = r2
                java.lang.Object r8 = r3.k0(r8, r7)
                if (r8 != r0) goto L_0x0043
                return r0
            L_0x0043:
                androidx.compose.ui.input.pointer.PointerEvent r8 = (androidx.compose.ui.input.pointer.PointerEvent) r8
                int r4 = r8.h()
                androidx.compose.ui.input.pointer.PointerEventType$Companion r5 = androidx.compose.ui.input.pointer.PointerEventType.f16852b
                int r6 = r5.c()
                boolean r6 = androidx.compose.ui.input.pointer.PointerEventType.j(r4, r6)
                if (r6 == 0) goto L_0x0057
                r6 = r2
                goto L_0x005f
            L_0x0057:
                int r6 = r5.a()
                boolean r6 = androidx.compose.ui.input.pointer.PointerEventType.j(r4, r6)
            L_0x005f:
                if (r6 == 0) goto L_0x0063
                r4 = r2
                goto L_0x006b
            L_0x0063:
                int r5 = r5.b()
                boolean r4 = androidx.compose.ui.input.pointer.PointerEventType.j(r4, r5)
            L_0x006b:
                if (r4 == 0) goto L_0x002c
                java.util.List r8 = r8.c()
                java.lang.Object r8 = kotlin.collections.CollectionsKt.e0(r8)
                androidx.compose.ui.input.pointer.PointerInputChange r8 = (androidx.compose.ui.input.pointer.PointerInputChange) r8
                long r4 = r8.h()
                androidx.compose.ui.geometry.Offset r8 = androidx.compose.ui.geometry.Offset.d(r4)
                long r4 = r8.t()
                java.lang.Object r6 = r1.f40908z
                boolean r4 = androidx.compose.ui.geometry.Offset.i(r4, r6)
                if (r4 != 0) goto L_0x008c
                goto L_0x008d
            L_0x008c:
                r8 = 0
            L_0x008d:
                if (r8 == 0) goto L_0x002c
                kotlin.jvm.functions.Function1 r4 = r5
                long r5 = r8.t()
                androidx.compose.ui.geometry.Offset r8 = androidx.compose.ui.geometry.Offset.d(r5)
                r1.f40908z = r8
                androidx.compose.ui.geometry.Offset r8 = androidx.compose.ui.geometry.Offset.d(r5)
                r4.invoke(r8)
                goto L_0x002c
            L_0x00a3:
                kotlin.Unit r8 = kotlin.Unit.f40552a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.PointerMoveDetectorKt$detectMoves$2.AnonymousClass1.x(java.lang.Object):java.lang.Object");
        }

        /* renamed from: z */
        public final Object m(AwaitPointerEventScope awaitPointerEventScope, Continuation continuation) {
            return ((AnonymousClass1) s(awaitPointerEventScope, continuation)).x(Unit.f40552a);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PointerMoveDetectorKt$detectMoves$2(PointerInputScope pointerInputScope, PointerEventPass pointerEventPass, Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.E = pointerInputScope;
        this.F = pointerEventPass;
        this.G = function1;
    }

    /* renamed from: A */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((PointerMoveDetectorKt$detectMoves$2) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        return new PointerMoveDetectorKt$detectMoves$2(this.E, this.F, this.G, continuation);
    }

    public final Object x(Object obj) {
        Object f2 = IntrinsicsKt.f();
        int i2 = this.D;
        if (i2 == 0) {
            ResultKt.b(obj);
            final CoroutineContext f3 = f();
            PointerInputScope pointerInputScope = this.E;
            final PointerEventPass pointerEventPass = this.F;
            final Function1 function1 = this.G;
            AnonymousClass1 r3 = new AnonymousClass1((Continuation) null);
            this.D = 1;
            if (pointerInputScope.M0(r3, this) == f2) {
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
