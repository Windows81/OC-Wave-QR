package androidx.compose.foundation.text;

import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;

@Metadata
public final class BasicTextFieldKt$TextFieldCursorHandle$2$1 implements PointerInputEventHandler {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ TextFieldSelectionState f5567z;

    public BasicTextFieldKt$TextFieldCursorHandle$2$1(TextFieldSelectionState textFieldSelectionState) {
        this.f5567z = textFieldSelectionState;
    }

    public final Object invoke(PointerInputScope pointerInputScope, Continuation continuation) {
        Object J = this.f5567z.J(pointerInputScope, continuation);
        return J == IntrinsicsKt.f() ? J : Unit.f40552a;
    }
}
