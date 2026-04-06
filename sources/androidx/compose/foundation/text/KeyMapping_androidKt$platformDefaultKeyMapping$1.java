package androidx.compose.foundation.text;

import android.view.KeyEvent;
import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import kotlin.Metadata;

@Metadata
public final class KeyMapping_androidKt$platformDefaultKeyMapping$1 implements KeyMapping {
    public KeyCommand a(KeyEvent keyEvent) {
        KeyCommand keyCommand = null;
        if (KeyEvent_androidKt.f(keyEvent) && KeyEvent_androidKt.d(keyEvent)) {
            long a2 = KeyEvent_androidKt.a(keyEvent);
            MappedKeys mappedKeys = MappedKeys.f5830a;
            if (Key.r(a2, mappedKeys.i())) {
                keyCommand = KeyCommand.SELECT_LINE_LEFT;
            } else if (Key.r(a2, mappedKeys.j())) {
                keyCommand = KeyCommand.SELECT_LINE_RIGHT;
            } else if (Key.r(a2, mappedKeys.k())) {
                keyCommand = KeyCommand.SELECT_HOME;
            } else if (Key.r(a2, mappedKeys.h())) {
                keyCommand = KeyCommand.SELECT_END;
            }
        } else if (KeyEvent_androidKt.d(keyEvent)) {
            long a3 = KeyEvent_androidKt.a(keyEvent);
            MappedKeys mappedKeys2 = MappedKeys.f5830a;
            if (Key.r(a3, mappedKeys2.i())) {
                keyCommand = KeyCommand.LINE_LEFT;
            } else if (Key.r(a3, mappedKeys2.j())) {
                keyCommand = KeyCommand.LINE_RIGHT;
            } else if (Key.r(a3, mappedKeys2.k())) {
                keyCommand = KeyCommand.HOME;
            } else if (Key.r(a3, mappedKeys2.h())) {
                keyCommand = KeyCommand.END;
            }
        }
        return keyCommand == null ? KeyMappingKt.b().a(keyEvent) : keyCommand;
    }
}
