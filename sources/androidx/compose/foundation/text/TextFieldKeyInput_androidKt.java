package androidx.compose.foundation.text;

import android.view.KeyEvent;
import kotlin.Metadata;

@Metadata
public final class TextFieldKeyInput_androidKt {
    public static final boolean a(KeyEvent keyEvent) {
        return keyEvent.getAction() == 0 && !Character.isISOControl(keyEvent.getUnicodeChar());
    }
}
