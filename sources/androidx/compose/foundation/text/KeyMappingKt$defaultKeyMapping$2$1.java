package androidx.compose.foundation.text;

import android.view.KeyEvent;
import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import kotlin.Metadata;

@Metadata
public final class KeyMappingKt$defaultKeyMapping$2$1 implements KeyMapping {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ KeyMapping f5758a;

    public KeyMappingKt$defaultKeyMapping$2$1(KeyMapping keyMapping) {
        this.f5758a = keyMapping;
    }

    public KeyCommand a(KeyEvent keyEvent) {
        KeyCommand keyCommand = null;
        if (KeyEvent_androidKt.f(keyEvent) && KeyEvent_androidKt.e(keyEvent)) {
            long a2 = KeyEvent_androidKt.a(keyEvent);
            MappedKeys mappedKeys = MappedKeys.f5830a;
            if (Key.r(a2, mappedKeys.i())) {
                keyCommand = KeyCommand.SELECT_LEFT_WORD;
            } else if (Key.r(a2, mappedKeys.j())) {
                keyCommand = KeyCommand.SELECT_RIGHT_WORD;
            } else if (Key.r(a2, mappedKeys.k())) {
                keyCommand = KeyCommand.SELECT_PREV_PARAGRAPH;
            } else if (Key.r(a2, mappedKeys.h())) {
                keyCommand = KeyCommand.SELECT_NEXT_PARAGRAPH;
            }
        } else if (KeyEvent_androidKt.e(keyEvent)) {
            long a3 = KeyEvent_androidKt.a(keyEvent);
            MappedKeys mappedKeys2 = MappedKeys.f5830a;
            if (Key.r(a3, mappedKeys2.i())) {
                keyCommand = KeyCommand.LEFT_WORD;
            } else if (Key.r(a3, mappedKeys2.j())) {
                keyCommand = KeyCommand.RIGHT_WORD;
            } else if (Key.r(a3, mappedKeys2.k())) {
                keyCommand = KeyCommand.PREV_PARAGRAPH;
            } else if (Key.r(a3, mappedKeys2.h())) {
                keyCommand = KeyCommand.NEXT_PARAGRAPH;
            } else if (Key.r(a3, mappedKeys2.m())) {
                keyCommand = KeyCommand.DELETE_PREV_CHAR;
            } else if (Key.r(a3, mappedKeys2.g())) {
                keyCommand = KeyCommand.DELETE_NEXT_WORD;
            } else if (Key.r(a3, mappedKeys2.c())) {
                keyCommand = KeyCommand.DELETE_PREV_WORD;
            } else if (Key.r(a3, mappedKeys2.b())) {
                keyCommand = KeyCommand.DESELECT;
            }
        } else if (KeyEvent_androidKt.f(keyEvent)) {
            long a4 = KeyEvent_androidKt.a(keyEvent);
            MappedKeys mappedKeys3 = MappedKeys.f5830a;
            if (Key.r(a4, mappedKeys3.p())) {
                keyCommand = KeyCommand.SELECT_LINE_START;
            } else if (Key.r(a4, mappedKeys3.o())) {
                keyCommand = KeyCommand.SELECT_LINE_END;
            }
        } else if (KeyEvent_androidKt.d(keyEvent)) {
            long a5 = KeyEvent_androidKt.a(keyEvent);
            MappedKeys mappedKeys4 = MappedKeys.f5830a;
            if (Key.r(a5, mappedKeys4.c())) {
                keyCommand = KeyCommand.DELETE_FROM_LINE_START;
            } else if (Key.r(a5, mappedKeys4.g())) {
                keyCommand = KeyCommand.DELETE_TO_LINE_END;
            }
        }
        return keyCommand == null ? this.f5758a.a(keyEvent) : keyCommand;
    }
}
