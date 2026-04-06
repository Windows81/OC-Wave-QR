package androidx.compose.ui.input.key;

import android.view.KeyEvent;
import kotlin.Metadata;

@Metadata
public final class KeyEvent_androidKt {
    public static final long a(KeyEvent keyEvent) {
        return Key_androidKt.a(keyEvent.getKeyCode());
    }

    public static final int b(KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        return action != 0 ? action != 1 ? KeyEventType.f16777b.c() : KeyEventType.f16777b.b() : KeyEventType.f16777b.a();
    }

    public static final int c(KeyEvent keyEvent) {
        return keyEvent.getUnicodeChar();
    }

    public static final boolean d(KeyEvent keyEvent) {
        return keyEvent.isAltPressed();
    }

    public static final boolean e(KeyEvent keyEvent) {
        return keyEvent.isCtrlPressed();
    }

    public static final boolean f(KeyEvent keyEvent) {
        return keyEvent.isShiftPressed();
    }
}
