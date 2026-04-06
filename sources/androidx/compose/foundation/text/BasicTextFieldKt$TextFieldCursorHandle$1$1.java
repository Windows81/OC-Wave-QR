package androidx.compose.foundation.text;

import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.foundation.text.selection.OffsetProvider;
import kotlin.Metadata;

@Metadata
public final class BasicTextFieldKt$TextFieldCursorHandle$1$1 implements OffsetProvider {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ TextFieldSelectionState f5566z;

    public BasicTextFieldKt$TextFieldCursorHandle$1$1(TextFieldSelectionState textFieldSelectionState) {
        this.f5566z = textFieldSelectionState;
    }

    public final long a() {
        return this.f5566z.V(true).e();
    }
}
