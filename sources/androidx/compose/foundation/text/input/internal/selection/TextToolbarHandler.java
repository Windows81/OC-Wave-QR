package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.ui.geometry.Rect;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

@Metadata
public interface TextToolbarHandler {
    Object a(TextFieldSelectionState textFieldSelectionState, Rect rect, Continuation continuation);

    void b();
}
