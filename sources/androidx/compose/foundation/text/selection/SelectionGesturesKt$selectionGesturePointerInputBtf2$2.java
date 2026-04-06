package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;

@Metadata
@DebugMetadata(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt$selectionGesturePointerInputBtf2$2", f = "SelectionGestures.kt", l = {209, 217, 220, 221}, m = "invokeSuspend")
public final class SelectionGesturesKt$selectionGesturePointerInputBtf2$2 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {

    /* renamed from: B  reason: collision with root package name */
    public int f6833B;
    public /* synthetic */ Object C;
    public final /* synthetic */ ClicksCounter D;
    public final /* synthetic */ MouseSelectionObserver E;
    public final /* synthetic */ TextDragObserver F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SelectionGesturesKt$selectionGesturePointerInputBtf2$2(ClicksCounter clicksCounter, MouseSelectionObserver mouseSelectionObserver, TextDragObserver textDragObserver, Continuation continuation) {
        super(2, continuation);
        this.D = clicksCounter;
        this.E = mouseSelectionObserver;
        this.F = textDragObserver;
    }

    public final Continuation s(Object obj, Continuation continuation) {
        SelectionGesturesKt$selectionGesturePointerInputBtf2$2 selectionGesturesKt$selectionGesturePointerInputBtf2$2 = new SelectionGesturesKt$selectionGesturePointerInputBtf2$2(this.D, this.E, this.F, continuation);
        selectionGesturesKt$selectionGesturePointerInputBtf2$2.C = obj;
        return selectionGesturesKt$selectionGesturePointerInputBtf2$2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: androidx.compose.ui.input.pointer.AwaitPointerEventScope} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object x(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r1 = r12.f6833B
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L_0x002a
            if (r1 == r5) goto L_0x0022
            if (r1 == r4) goto L_0x001d
            if (r1 == r3) goto L_0x001d
            if (r1 != r2) goto L_0x0015
            goto L_0x001d
        L_0x0015:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L_0x001d:
            kotlin.ResultKt.b(r13)
            goto L_0x00a6
        L_0x0022:
            java.lang.Object r1 = r12.C
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
            kotlin.ResultKt.b(r13)
            goto L_0x003d
        L_0x002a:
            kotlin.ResultKt.b(r13)
            java.lang.Object r13 = r12.C
            r1 = r13
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
            r12.C = r1
            r12.f6833B = r5
            java.lang.Object r13 = androidx.compose.foundation.text.selection.SelectionGesturesKt.h(r1, r12)
            if (r13 != r0) goto L_0x003d
            return r0
        L_0x003d:
            androidx.compose.ui.input.pointer.PointerEvent r13 = (androidx.compose.ui.input.pointer.PointerEvent) r13
            androidx.compose.foundation.text.selection.ClicksCounter r6 = r12.D
            r6.d(r13)
            boolean r6 = androidx.compose.foundation.text.selection.SelectionGesturesKt.j(r13)
            r7 = 0
            if (r6 == 0) goto L_0x0082
            int r8 = r13.b()
            boolean r8 = androidx.compose.ui.input.pointer.PointerEvent_androidKt.c(r8)
            if (r8 == 0) goto L_0x0082
            java.util.List r8 = r13.c()
            r9 = r8
            java.util.Collection r9 = (java.util.Collection) r9
            int r9 = r9.size()
            r10 = 0
        L_0x0061:
            if (r10 >= r9) goto L_0x0073
            java.lang.Object r11 = r8.get(r10)
            androidx.compose.ui.input.pointer.PointerInputChange r11 = (androidx.compose.ui.input.pointer.PointerInputChange) r11
            boolean r11 = r11.p()
            if (r11 == 0) goto L_0x0070
            goto L_0x0082
        L_0x0070:
            int r10 = r10 + 1
            goto L_0x0061
        L_0x0073:
            androidx.compose.foundation.text.selection.MouseSelectionObserver r2 = r12.E
            androidx.compose.foundation.text.selection.ClicksCounter r3 = r12.D
            r12.C = r7
            r12.f6833B = r4
            java.lang.Object r13 = androidx.compose.foundation.text.selection.SelectionGesturesKt.l(r1, r2, r3, r13, r12)
            if (r13 != r0) goto L_0x00a6
            return r0
        L_0x0082:
            if (r6 != 0) goto L_0x00a6
            androidx.compose.foundation.text.selection.ClicksCounter r4 = r12.D
            int r4 = r4.a()
            if (r4 != r5) goto L_0x0099
            androidx.compose.foundation.text.TextDragObserver r2 = r12.F
            r12.C = r7
            r12.f6833B = r3
            java.lang.Object r13 = androidx.compose.foundation.text.selection.SelectionGesturesKt.p(r1, r2, r13, r12)
            if (r13 != r0) goto L_0x00a6
            return r0
        L_0x0099:
            androidx.compose.foundation.text.TextDragObserver r3 = r12.F
            r12.C = r7
            r12.f6833B = r2
            java.lang.Object r13 = androidx.compose.foundation.text.selection.SelectionGesturesKt.q(r1, r3, r13, r12)
            if (r13 != r0) goto L_0x00a6
            return r0
        L_0x00a6:
            kotlin.Unit r13 = kotlin.Unit.f40552a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.SelectionGesturesKt$selectionGesturePointerInputBtf2$2.x(java.lang.Object):java.lang.Object");
    }

    /* renamed from: z */
    public final Object m(AwaitPointerEventScope awaitPointerEventScope, Continuation continuation) {
        return ((SelectionGesturesKt$selectionGesturePointerInputBtf2$2) s(awaitPointerEventScope, continuation)).x(Unit.f40552a);
    }
}
