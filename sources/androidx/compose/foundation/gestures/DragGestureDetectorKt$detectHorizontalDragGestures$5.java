package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

@Metadata
@DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectHorizontalDragGestures$5", f = "DragGestureDetector.kt", l = {661, 664, 672}, m = "invokeSuspend")
final class DragGestureDetectorKt$detectHorizontalDragGestures$5 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {

    /* renamed from: B  reason: collision with root package name */
    public Object f3479B;
    public int C;
    public /* synthetic */ Object D;
    public final /* synthetic */ Function1 E;
    public final /* synthetic */ Function2 F;
    public final /* synthetic */ Function0 G;
    public final /* synthetic */ Function0 H;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DragGestureDetectorKt$detectHorizontalDragGestures$5(Function1 function1, Function2 function2, Function0 function0, Function0 function02, Continuation continuation) {
        super(2, continuation);
        this.E = function1;
        this.F = function2;
        this.G = function0;
        this.H = function02;
    }

    public final Continuation s(Object obj, Continuation continuation) {
        DragGestureDetectorKt$detectHorizontalDragGestures$5 dragGestureDetectorKt$detectHorizontalDragGestures$5 = new DragGestureDetectorKt$detectHorizontalDragGestures$5(this.E, this.F, this.G, this.H, continuation);
        dragGestureDetectorKt$detectHorizontalDragGestures$5.D = obj;
        return dragGestureDetectorKt$detectHorizontalDragGestures$5;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00b5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object x(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r1 = r12.C
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L_0x0032
            if (r1 == r4) goto L_0x002a
            if (r1 == r3) goto L_0x001e
            if (r1 != r2) goto L_0x0016
            kotlin.ResultKt.b(r13)
            goto L_0x00a7
        L_0x0016:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L_0x001e:
            java.lang.Object r1 = r12.f3479B
            kotlin.jvm.internal.Ref$FloatRef r1 = (kotlin.jvm.internal.Ref.FloatRef) r1
            java.lang.Object r3 = r12.D
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r3 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r3
            kotlin.ResultKt.b(r13)
            goto L_0x0072
        L_0x002a:
            java.lang.Object r1 = r12.D
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
            kotlin.ResultKt.b(r13)
            goto L_0x004d
        L_0x0032:
            kotlin.ResultKt.b(r13)
            java.lang.Object r13 = r12.D
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r13 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r13
            r12.D = r13
            r12.C = r4
            r6 = 0
            r7 = 0
            r9 = 2
            r10 = 0
            r5 = r13
            r8 = r12
            java.lang.Object r1 = androidx.compose.foundation.gestures.TapGestureDetectorKt.f(r5, r6, r7, r8, r9, r10)
            if (r1 != r0) goto L_0x004a
            return r0
        L_0x004a:
            r11 = r1
            r1 = r13
            r13 = r11
        L_0x004d:
            androidx.compose.ui.input.pointer.PointerInputChange r13 = (androidx.compose.ui.input.pointer.PointerInputChange) r13
            kotlin.jvm.internal.Ref$FloatRef r10 = new kotlin.jvm.internal.Ref$FloatRef
            r10.<init>()
            long r5 = r13.f()
            int r7 = r13.n()
            androidx.compose.foundation.gestures.DragGestureDetectorKt$detectHorizontalDragGestures$5$drag$1 r8 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$detectHorizontalDragGestures$5$drag$1
            r8.<init>(r10)
            r12.D = r1
            r12.f3479B = r10
            r12.C = r3
            r4 = r1
            r9 = r12
            java.lang.Object r13 = androidx.compose.foundation.gestures.DragGestureDetectorKt.e(r4, r5, r7, r8, r9)
            if (r13 != r0) goto L_0x0070
            return r0
        L_0x0070:
            r3 = r1
            r1 = r10
        L_0x0072:
            androidx.compose.ui.input.pointer.PointerInputChange r13 = (androidx.compose.ui.input.pointer.PointerInputChange) r13
            if (r13 == 0) goto L_0x00ba
            kotlin.jvm.functions.Function1 r4 = r12.E
            long r5 = r13.h()
            androidx.compose.ui.geometry.Offset r5 = androidx.compose.ui.geometry.Offset.d(r5)
            r4.invoke(r5)
            kotlin.jvm.functions.Function2 r4 = r12.F
            float r1 = r1.f40905z
            java.lang.Float r1 = kotlin.coroutines.jvm.internal.Boxing.b(r1)
            r4.m(r13, r1)
            long r4 = r13.f()
            androidx.compose.foundation.gestures.DragGestureDetectorKt$detectHorizontalDragGestures$5$1 r13 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$detectHorizontalDragGestures$5$1
            kotlin.jvm.functions.Function2 r1 = r12.F
            r13.<init>(r1)
            r1 = 0
            r12.D = r1
            r12.f3479B = r1
            r12.C = r2
            java.lang.Object r13 = androidx.compose.foundation.gestures.DragGestureDetectorKt.r(r3, r4, r13, r12)
            if (r13 != r0) goto L_0x00a7
            return r0
        L_0x00a7:
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 == 0) goto L_0x00b5
            kotlin.jvm.functions.Function0 r13 = r12.G
            r13.invoke()
            goto L_0x00ba
        L_0x00b5:
            kotlin.jvm.functions.Function0 r13 = r12.H
            r13.invoke()
        L_0x00ba:
            kotlin.Unit r13 = kotlin.Unit.f40552a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectHorizontalDragGestures$5.x(java.lang.Object):java.lang.Object");
    }

    /* renamed from: z */
    public final Object m(AwaitPointerEventScope awaitPointerEventScope, Continuation continuation) {
        return ((DragGestureDetectorKt$detectHorizontalDragGestures$5) s(awaitPointerEventScope, continuation)).x(Unit.f40552a);
    }
}
