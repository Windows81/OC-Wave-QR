package androidx.compose.foundation.text;

import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;

@Metadata
public final class BasicTextFieldKt$TextFieldSelectionHandles$4$1 implements PointerInputEventHandler {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ TextFieldSelectionState f5574z;

    public BasicTextFieldKt$TextFieldSelectionHandles$4$1(TextFieldSelectionState textFieldSelectionState) {
        this.f5574z = textFieldSelectionState;
    }

    public final Object invoke(PointerInputScope pointerInputScope, Continuation continuation) {
        Object u0 = this.f5574z.u0(pointerInputScope, false, continuation);
        return u0 == IntrinsicsKt.f() ? u0 : Unit.f40552a;
    }
}
