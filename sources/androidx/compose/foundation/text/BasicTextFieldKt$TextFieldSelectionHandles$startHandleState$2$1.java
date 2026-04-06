package androidx.compose.foundation.text;

import androidx.compose.foundation.text.input.internal.selection.TextFieldHandleState;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class BasicTextFieldKt$TextFieldSelectionHandles$startHandleState$2$1 extends Lambda implements Function0<TextFieldHandleState> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ TextFieldSelectionState f5578z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BasicTextFieldKt$TextFieldSelectionHandles$startHandleState$2$1(TextFieldSelectionState textFieldSelectionState) {
        super(0);
        this.f5578z = textFieldSelectionState;
    }

    /* renamed from: b */
    public final TextFieldHandleState invoke() {
        return this.f5578z.d0(true, false);
    }
}
