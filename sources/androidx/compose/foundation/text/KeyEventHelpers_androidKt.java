package androidx.compose.foundation.text;

import android.view.KeyEvent;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import kotlin.Metadata;

@Metadata
public final class KeyEventHelpers_androidKt {
    public static final boolean a(KeyEvent keyEvent) {
        return keyEvent.getKeyCode() == 4 && KeyEventType.f(KeyEvent_androidKt.b(keyEvent), KeyEventType.f16777b.b());
    }

    public static final void b() {
    }
}
