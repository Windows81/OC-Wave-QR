package androidx.compose.foundation.text;

import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;

@Metadata
public final class BasicTextFieldKt$TextFieldSelectionHandles$2$1 implements PointerInputEventHandler {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ TextFieldSelectionState f5572z;

    public BasicTextFieldKt$TextFieldSelectionHandles$2$1(TextFieldSelectionState textFieldSelectionState) {
        this.f5572z = textFieldSelectionState;
    }

    public final Object invoke(PointerInputScope pointerInputScope, Continuation continuation) {
        Object u0 = this.f5572z.u0(pointerInputScope, true, continuation);
        return u0 == IntrinsicsKt.f() ? u0 : Unit.f40552a;
    }
}
