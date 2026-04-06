package androidx.compose.foundation.text.input.internal.undo;

import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.foundation.text.input.TextFieldBufferKt;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.ui.text.TextRange;
import java.util.List;
import kotlin.Metadata;

@Metadata
public final class TextUndoOperationKt {
    public static final void a(TextFieldState textFieldState, TextUndoOperation textUndoOperation) {
        textFieldState.g().e().e();
        TextFieldBuffer g2 = textFieldState.g();
        g2.p(textUndoOperation.d(), textUndoOperation.d() + textUndoOperation.h().length(), textUndoOperation.f());
        TextFieldBufferKt.c(g2, TextRange.n(textUndoOperation.e()), TextRange.i(textUndoOperation.e()));
        textFieldState.t(textFieldState.l(), TextFieldBuffer.A(textFieldState.g(), 0, (TextRange) null, (List) null, 7, (Object) null), true);
    }

    public static final void b(TextFieldState textFieldState, TextUndoOperation textUndoOperation) {
        textFieldState.g().e().e();
        TextFieldBuffer g2 = textFieldState.g();
        g2.p(textUndoOperation.d(), textUndoOperation.d() + textUndoOperation.f().length(), textUndoOperation.h());
        TextFieldBufferKt.c(g2, TextRange.n(textUndoOperation.g()), TextRange.i(textUndoOperation.g()));
        textFieldState.t(textFieldState.l(), TextFieldBuffer.A(textFieldState.g(), 0, (TextRange) null, (List) null, 7, (Object) null), true);
    }
}
