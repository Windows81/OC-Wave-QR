package androidx.compose.foundation.text.input.internal;

import android.view.KeyEvent;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.input.key.Key_androidKt;
import kotlin.Metadata;

@Metadata
public final class TextFieldKeyEventHandler_androidKt {
    public static final TextFieldKeyEventHandler b() {
        return new AndroidTextFieldKeyEventHandler();
    }

    public static final boolean c(KeyEvent keyEvent) {
        return (keyEvent.getFlags() & 2) == 2;
    }

    public static final boolean d(KeyEvent keyEvent, int i2) {
        return Key_androidKt.b(KeyEvent_androidKt.a(keyEvent)) == i2;
    }
}
