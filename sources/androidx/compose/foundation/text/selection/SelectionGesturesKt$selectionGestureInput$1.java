package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.foundation.text.TextDragObserver;
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
public final class SelectionGesturesKt$selectionGestureInput$1 implements PointerInputEventHandler {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ TextDragObserver f6830A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ MouseSelectionObserver f6831z;

    @Metadata
    @DebugMetadata(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt$selectionGestureInput$1$1", f = "SelectionGestures.kt", l = {107, 113, 115}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.text.selection.SelectionGesturesKt$selectionGestureInput$1$1  reason: invalid class name */
    public static final class AnonymousClass1 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {

        /* renamed from: B  reason: collision with root package name */
        public int f6832B;
        public /* synthetic */ Object C;

        public final Continuation s(Object obj, Continuation continuation) {
            AnonymousClass1 r0 = new AnonymousClass1(mouseSelectionObserver, clicksCounter, textDragObserver, continuation);
            r0.C = obj;
            return r0;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v6, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: androidx.compose.ui.input.pointer.AwaitPointerEventScope} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object x(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r1 = r9.f6832B
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L_0x0026
                if (r1 == r4) goto L_0x001e
                if (r1 == r3) goto L_0x001a
                if (r1 != r2) goto L_0x0012
                goto L_0x001a
            L_0x0012:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L_0x001a:
                kotlin.ResultKt.b(r10)
                goto L_0x008c
            L_0x001e:
                java.lang.Object r1 = r9.C
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
                kotlin.ResultKt.b(r10)
                goto L_0x0039
            L_0x0026:
                kotlin.ResultKt.b(r10)
                java.lang.Object r10 = r9.C
                r1 = r10
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
                r9.C = r1
                r9.f6832B = r4
                java.lang.Object r10 = androidx.compose.foundation.text.selection.SelectionGesturesKt.h(r1, r9)
                if (r10 != r0) goto L_0x0039
                return r0
            L_0x0039:
                androidx.compose.ui.input.pointer.PointerEvent r10 = (androidx.compose.ui.input.pointer.PointerEvent) r10
                boolean r4 = androidx.compose.foundation.text.selection.SelectionGesturesKt.j(r10)
                r5 = 0
                if (r4 == 0) goto L_0x0079
                int r4 = r10.b()
                boolean r4 = androidx.compose.ui.input.pointer.PointerEvent_androidKt.c(r4)
                if (r4 == 0) goto L_0x0079
                java.util.List r4 = r10.c()
                r6 = r4
                java.util.Collection r6 = (java.util.Collection) r6
                int r6 = r6.size()
                r7 = 0
            L_0x0058:
                if (r7 >= r6) goto L_0x006a
                java.lang.Object r8 = r4.get(r7)
                androidx.compose.ui.input.pointer.PointerInputChange r8 = (androidx.compose.ui.input.pointer.PointerInputChange) r8
                boolean r8 = r8.p()
                if (r8 == 0) goto L_0x0067
                goto L_0x0079
            L_0x0067:
                int r7 = r7 + 1
                goto L_0x0058
            L_0x006a:
                androidx.compose.foundation.text.selection.MouseSelectionObserver r2 = r2
                androidx.compose.foundation.text.selection.ClicksCounter r4 = r0
                r9.C = r5
                r9.f6832B = r3
                java.lang.Object r10 = androidx.compose.foundation.text.selection.SelectionGesturesKt.k(r1, r2, r4, r10, r9)
                if (r10 != r0) goto L_0x008c
                return r0
            L_0x0079:
                boolean r3 = androidx.compose.foundation.text.selection.SelectionGesturesKt.j(r10)
                if (r3 != 0) goto L_0x008c
                androidx.compose.foundation.text.TextDragObserver r3 = r3
                r9.C = r5
                r9.f6832B = r2
                java.lang.Object r10 = androidx.compose.foundation.text.selection.SelectionGesturesKt.o(r1, r3, r10, r9)
                if (r10 != r0) goto L_0x008c
                return r0
            L_0x008c:
                kotlin.Unit r10 = kotlin.Unit.f40552a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.SelectionGesturesKt$selectionGestureInput$1.AnonymousClass1.x(java.lang.Object):java.lang.Object");
        }

        /* renamed from: z */
        public final Object m(AwaitPointerEventScope awaitPointerEventScope, Continuation continuation) {
            return ((AnonymousClass1) s(awaitPointerEventScope, continuation)).x(Unit.f40552a);
        }
    }

    public SelectionGesturesKt$selectionGestureInput$1(MouseSelectionObserver mouseSelectionObserver, TextDragObserver textDragObserver) {
        this.f6831z = mouseSelectionObserver;
        this.f6830A = textDragObserver;
    }

    public final Object invoke(PointerInputScope pointerInputScope, Continuation continuation) {
        final ClicksCounter clicksCounter = new ClicksCounter(pointerInputScope.getViewConfiguration());
        final MouseSelectionObserver mouseSelectionObserver = this.f6831z;
        final TextDragObserver textDragObserver = this.f6830A;
        Object e2 = ForEachGestureKt.e(pointerInputScope, new AnonymousClass1((Continuation) null), continuation);
        return e2 == IntrinsicsKt.f() ? e2 : Unit.f40552a;
    }
}
