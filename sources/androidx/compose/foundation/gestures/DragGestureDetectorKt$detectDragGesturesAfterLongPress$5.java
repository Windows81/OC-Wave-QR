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
@DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$5", f = "DragGestureDetector.kt", l = {354, 355, 360}, m = "invokeSuspend")
final class DragGestureDetectorKt$detectDragGesturesAfterLongPress$5 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {

    /* renamed from: B  reason: collision with root package name */
    public int f3474B;
    public /* synthetic */ Object C;
    public final /* synthetic */ Function1 D;
    public final /* synthetic */ Function0 E;
    public final /* synthetic */ Function0 F;
    public final /* synthetic */ Function2 G;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DragGestureDetectorKt$detectDragGesturesAfterLongPress$5(Function1 function1, Function0 function0, Function0 function02, Function2 function2, Continuation continuation) {
        super(2, continuation);
        this.D = function1;
        this.E = function0;
        this.F = function02;
        this.G = function2;
    }

    public final Continuation s(Object obj, Continuation continuation) {
        DragGestureDetectorKt$detectDragGesturesAfterLongPress$5 dragGestureDetectorKt$detectDragGesturesAfterLongPress$5 = new DragGestureDetectorKt$detectDragGesturesAfterLongPress$5(this.D, this.E, this.F, this.G, continuation);
        dragGestureDetectorKt$detectDragGesturesAfterLongPress$5.C = obj;
        return dragGestureDetectorKt$detectDragGesturesAfterLongPress$5;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v16, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: androidx.compose.ui.input.pointer.AwaitPointerEventScope} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0062 A[Catch:{ CancellationException -> 0x0019 }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x008e A[Catch:{ CancellationException -> 0x0019 }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00b8 A[Catch:{ CancellationException -> 0x0019 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object x(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r1 = r11.f3474B
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L_0x0034
            if (r1 == r4) goto L_0x002c
            if (r1 == r3) goto L_0x0024
            if (r1 != r2) goto L_0x001c
            java.lang.Object r0 = r11.C
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r0 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r0
            kotlin.ResultKt.b(r12)     // Catch:{ CancellationException -> 0x0019 }
            goto L_0x0086
        L_0x0019:
            r12 = move-exception
            goto L_0x00c0
        L_0x001c:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L_0x0024:
            java.lang.Object r1 = r11.C
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
            kotlin.ResultKt.b(r12)     // Catch:{ CancellationException -> 0x0019 }
            goto L_0x005e
        L_0x002c:
            java.lang.Object r1 = r11.C
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
            kotlin.ResultKt.b(r12)     // Catch:{ CancellationException -> 0x0019 }
            goto L_0x004d
        L_0x0034:
            kotlin.ResultKt.b(r12)
            java.lang.Object r12 = r11.C
            r1 = r12
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
            r11.C = r1     // Catch:{ CancellationException -> 0x0019 }
            r11.f3474B = r4     // Catch:{ CancellationException -> 0x0019 }
            r6 = 0
            r7 = 0
            r9 = 2
            r10 = 0
            r5 = r1
            r8 = r11
            java.lang.Object r12 = androidx.compose.foundation.gestures.TapGestureDetectorKt.f(r5, r6, r7, r8, r9, r10)     // Catch:{ CancellationException -> 0x0019 }
            if (r12 != r0) goto L_0x004d
            return r0
        L_0x004d:
            androidx.compose.ui.input.pointer.PointerInputChange r12 = (androidx.compose.ui.input.pointer.PointerInputChange) r12     // Catch:{ CancellationException -> 0x0019 }
            long r4 = r12.f()     // Catch:{ CancellationException -> 0x0019 }
            r11.C = r1     // Catch:{ CancellationException -> 0x0019 }
            r11.f3474B = r3     // Catch:{ CancellationException -> 0x0019 }
            java.lang.Object r12 = androidx.compose.foundation.gestures.DragGestureDetectorKt.g(r1, r4, r11)     // Catch:{ CancellationException -> 0x0019 }
            if (r12 != r0) goto L_0x005e
            return r0
        L_0x005e:
            androidx.compose.ui.input.pointer.PointerInputChange r12 = (androidx.compose.ui.input.pointer.PointerInputChange) r12     // Catch:{ CancellationException -> 0x0019 }
            if (r12 == 0) goto L_0x00bd
            kotlin.jvm.functions.Function1 r3 = r11.D     // Catch:{ CancellationException -> 0x0019 }
            long r4 = r12.h()     // Catch:{ CancellationException -> 0x0019 }
            androidx.compose.ui.geometry.Offset r4 = androidx.compose.ui.geometry.Offset.d(r4)     // Catch:{ CancellationException -> 0x0019 }
            r3.invoke(r4)     // Catch:{ CancellationException -> 0x0019 }
            long r3 = r12.f()     // Catch:{ CancellationException -> 0x0019 }
            androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$5$1 r12 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$5$1     // Catch:{ CancellationException -> 0x0019 }
            kotlin.jvm.functions.Function2 r5 = r11.G     // Catch:{ CancellationException -> 0x0019 }
            r12.<init>(r5)     // Catch:{ CancellationException -> 0x0019 }
            r11.C = r1     // Catch:{ CancellationException -> 0x0019 }
            r11.f3474B = r2     // Catch:{ CancellationException -> 0x0019 }
            java.lang.Object r12 = androidx.compose.foundation.gestures.DragGestureDetectorKt.q(r1, r3, r12, r11)     // Catch:{ CancellationException -> 0x0019 }
            if (r12 != r0) goto L_0x0085
            return r0
        L_0x0085:
            r0 = r1
        L_0x0086:
            java.lang.Boolean r12 = (java.lang.Boolean) r12     // Catch:{ CancellationException -> 0x0019 }
            boolean r12 = r12.booleanValue()     // Catch:{ CancellationException -> 0x0019 }
            if (r12 == 0) goto L_0x00b8
            androidx.compose.ui.input.pointer.PointerEvent r12 = r0.l0()     // Catch:{ CancellationException -> 0x0019 }
            java.util.List r12 = r12.c()     // Catch:{ CancellationException -> 0x0019 }
            r0 = r12
            java.util.Collection r0 = (java.util.Collection) r0     // Catch:{ CancellationException -> 0x0019 }
            int r0 = r0.size()     // Catch:{ CancellationException -> 0x0019 }
            r1 = 0
        L_0x009e:
            if (r1 >= r0) goto L_0x00b2
            java.lang.Object r2 = r12.get(r1)     // Catch:{ CancellationException -> 0x0019 }
            androidx.compose.ui.input.pointer.PointerInputChange r2 = (androidx.compose.ui.input.pointer.PointerInputChange) r2     // Catch:{ CancellationException -> 0x0019 }
            boolean r3 = androidx.compose.ui.input.pointer.PointerEventKt.c(r2)     // Catch:{ CancellationException -> 0x0019 }
            if (r3 == 0) goto L_0x00af
            r2.a()     // Catch:{ CancellationException -> 0x0019 }
        L_0x00af:
            int r1 = r1 + 1
            goto L_0x009e
        L_0x00b2:
            kotlin.jvm.functions.Function0 r12 = r11.E     // Catch:{ CancellationException -> 0x0019 }
            r12.invoke()     // Catch:{ CancellationException -> 0x0019 }
            goto L_0x00bd
        L_0x00b8:
            kotlin.jvm.functions.Function0 r12 = r11.F     // Catch:{ CancellationException -> 0x0019 }
            r12.invoke()     // Catch:{ CancellationException -> 0x0019 }
        L_0x00bd:
            kotlin.Unit r12 = kotlin.Unit.f40552a
            return r12
        L_0x00c0:
            kotlin.jvm.functions.Function0 r0 = r11.F
            r0.invoke()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$5.x(java.lang.Object):java.lang.Object");
    }

    /* renamed from: z */
    public final Object m(AwaitPointerEventScope awaitPointerEventScope, Continuation continuation) {
        return ((DragGestureDetectorKt$detectDragGesturesAfterLongPress$5) s(awaitPointerEventScope, continuation)).x(Unit.f40552a);
    }
}
