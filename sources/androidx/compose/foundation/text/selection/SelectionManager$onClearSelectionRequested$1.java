package androidx.compose.foundation.text.selection;

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
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

@Metadata
public final class SelectionManager$onClearSelectionRequested$1 implements PointerInputEventHandler {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function0 f6911A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ SelectionManager f6912z;

    @Metadata
    @DebugMetadata(c = "androidx.compose.foundation.text.selection.SelectionManager$onClearSelectionRequested$1$1", f = "SelectionManager.kt", l = {754, 760}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.text.selection.SelectionManager$onClearSelectionRequested$1$1  reason: invalid class name */
    public static final class AnonymousClass1 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {

        /* renamed from: B  reason: collision with root package name */
        public int f6913B;
        public /* synthetic */ Object C;

        public final Continuation s(Object obj, Continuation continuation) {
            AnonymousClass1 r0 = new AnonymousClass1(selectionManager, function0, continuation);
            r0.C = obj;
            return r0;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v11, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: androidx.compose.ui.input.pointer.AwaitPointerEventScope} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object x(java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r1 = r10.f6913B
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L_0x0022
                if (r1 == r3) goto L_0x001a
                if (r1 != r2) goto L_0x0012
                kotlin.ResultKt.b(r11)
                goto L_0x004b
            L_0x0012:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L_0x001a:
                java.lang.Object r1 = r10.C
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
                kotlin.ResultKt.b(r11)
                goto L_0x003b
            L_0x0022:
                kotlin.ResultKt.b(r11)
                java.lang.Object r11 = r10.C
                r1 = r11
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
                r10.C = r1
                r10.f6913B = r3
                r5 = 0
                r6 = 0
                r8 = 2
                r9 = 0
                r4 = r1
                r7 = r10
                java.lang.Object r11 = androidx.compose.foundation.gestures.TapGestureDetectorKt.h(r4, r5, r6, r7, r8, r9)
                if (r11 != r0) goto L_0x003b
                return r0
            L_0x003b:
                androidx.compose.ui.input.pointer.PointerInputChange r11 = (androidx.compose.ui.input.pointer.PointerInputChange) r11
                androidx.compose.ui.input.pointer.PointerEventPass r3 = androidx.compose.ui.input.pointer.PointerEventPass.Initial
                r4 = 0
                r10.C = r4
                r10.f6913B = r2
                java.lang.Object r11 = androidx.compose.foundation.gestures.DragGestureDetectorKt.b(r1, r11, r3, r10)
                if (r11 != r0) goto L_0x004b
                return r0
            L_0x004b:
                java.lang.Boolean r11 = (java.lang.Boolean) r11
                boolean r11 = r11.booleanValue()
                if (r11 != 0) goto L_0x0060
                androidx.compose.foundation.text.selection.SelectionManager r11 = r1
                boolean r11 = r11.J()
                if (r11 != 0) goto L_0x0060
                kotlin.jvm.functions.Function0 r11 = r2
                r11.invoke()
            L_0x0060:
                kotlin.Unit r11 = kotlin.Unit.f40552a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.SelectionManager$onClearSelectionRequested$1.AnonymousClass1.x(java.lang.Object):java.lang.Object");
        }

        /* renamed from: z */
        public final Object m(AwaitPointerEventScope awaitPointerEventScope, Continuation continuation) {
            return ((AnonymousClass1) s(awaitPointerEventScope, continuation)).x(Unit.f40552a);
        }
    }

    public SelectionManager$onClearSelectionRequested$1(SelectionManager selectionManager, Function0 function0) {
        this.f6912z = selectionManager;
        this.f6911A = function0;
    }

    public final Object invoke(PointerInputScope pointerInputScope, Continuation continuation) {
        final SelectionManager selectionManager = this.f6912z;
        final Function0 function0 = this.f6911A;
        Object e2 = ForEachGestureKt.e(pointerInputScope, new AnonymousClass1((Continuation) null), continuation);
        return e2 == IntrinsicsKt.f() ? e2 : Unit.f40552a;
    }
}
