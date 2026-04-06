package androidx.compose.foundation.text;

import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.foundation.text.selection.OffsetProvider;
import kotlin.Metadata;

@Metadata
public final class BasicTextFieldKt$TextFieldSelectionHandles$3$1 implements OffsetProvider {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ TextFieldSelectionState f5573z;

    public BasicTextFieldKt$TextFieldSelectionHandles$3$1(TextFieldSelectionState textFieldSelectionState) {
        this.f5573z = textFieldSelectionState;
    }

    public final long a() {
        return this.f5573z.d0(false, true).e();
    }
}
