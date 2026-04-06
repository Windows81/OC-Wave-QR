package androidx.compose.foundation.text.input;

import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.Metadata;

@Metadata
public interface InputTransformation {

    /* renamed from: a  reason: collision with root package name */
    public static final Companion f6057a = Companion.f6058b;

    @Metadata
    public static final class Companion implements InputTransformation {

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ Companion f6058b = new Companion();

        public void X(TextFieldBuffer textFieldBuffer) {
        }
    }

    void W(SemanticsPropertyReceiver semanticsPropertyReceiver) {
    }

    void X(TextFieldBuffer textFieldBuffer);

    KeyboardOptions Y() {
        return null;
    }
}
