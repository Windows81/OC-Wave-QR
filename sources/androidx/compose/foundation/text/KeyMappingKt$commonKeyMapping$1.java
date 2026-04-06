package androidx.compose.foundation.text;

import android.view.KeyEvent;
import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata
public final class KeyMappingKt$commonKeyMapping$1 implements KeyMapping {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Function1 f5757a;

    public KeyMappingKt$commonKeyMapping$1(Function1 function1) {
        this.f5757a = function1;
    }

    public KeyCommand a(KeyEvent keyEvent) {
        if (!((Boolean) this.f5757a.invoke(androidx.compose.ui.input.key.KeyEvent.a(keyEvent))).booleanValue() || !KeyEvent_androidKt.f(keyEvent)) {
            boolean z2 = true;
            if (((Boolean) this.f5757a.invoke(androidx.compose.ui.input.key.KeyEvent.a(keyEvent))).booleanValue()) {
                long a2 = KeyEvent_androidKt.a(keyEvent);
                MappedKeys mappedKeys = MappedKeys.f5830a;
                if (!Key.r(a2, mappedKeys.d())) {
                    z2 = Key.r(a2, mappedKeys.n());
                }
                if (z2) {
                    return KeyCommand.COPY;
                }
                if (Key.r(a2, mappedKeys.v())) {
                    return KeyCommand.PASTE;
                }
                if (Key.r(a2, mappedKeys.w())) {
                    return KeyCommand.CUT;
                }
                if (Key.r(a2, mappedKeys.a())) {
                    return KeyCommand.SELECT_ALL;
                }
                if (Key.r(a2, mappedKeys.x())) {
                    return KeyCommand.REDO;
                }
                if (Key.r(a2, mappedKeys.y())) {
                    return KeyCommand.UNDO;
                }
                return null;
            } else if (KeyEvent_androidKt.e(keyEvent)) {
                return null;
            } else {
                if (KeyEvent_androidKt.f(keyEvent)) {
                    long a3 = KeyEvent_androidKt.a(keyEvent);
                    MappedKeys mappedKeys2 = MappedKeys.f5830a;
                    if (Key.r(a3, mappedKeys2.i())) {
                        return KeyCommand.SELECT_LEFT_CHAR;
                    }
                    if (Key.r(a3, mappedKeys2.j())) {
                        return KeyCommand.SELECT_RIGHT_CHAR;
                    }
                    if (Key.r(a3, mappedKeys2.k())) {
                        return KeyCommand.SELECT_UP;
                    }
                    if (Key.r(a3, mappedKeys2.h())) {
                        return KeyCommand.SELECT_DOWN;
                    }
                    if (Key.r(a3, mappedKeys2.s())) {
                        return KeyCommand.SELECT_PAGE_UP;
                    }
                    if (Key.r(a3, mappedKeys2.r())) {
                        return KeyCommand.SELECT_PAGE_DOWN;
                    }
                    if (Key.r(a3, mappedKeys2.p())) {
                        return KeyCommand.SELECT_LINE_START;
                    }
                    if (Key.r(a3, mappedKeys2.o())) {
                        return KeyCommand.SELECT_LINE_END;
                    }
                    if (Key.r(a3, mappedKeys2.n())) {
                        return KeyCommand.PASTE;
                    }
                    return null;
                }
                long a4 = KeyEvent_androidKt.a(keyEvent);
                MappedKeys mappedKeys3 = MappedKeys.f5830a;
                if (Key.r(a4, mappedKeys3.i())) {
                    return KeyCommand.LEFT_CHAR;
                }
                if (Key.r(a4, mappedKeys3.j())) {
                    return KeyCommand.RIGHT_CHAR;
                }
                if (Key.r(a4, mappedKeys3.k())) {
                    return KeyCommand.UP;
                }
                if (Key.r(a4, mappedKeys3.h())) {
                    return KeyCommand.DOWN;
                }
                if (Key.r(a4, mappedKeys3.s())) {
                    return KeyCommand.PAGE_UP;
                }
                if (Key.r(a4, mappedKeys3.r())) {
                    return KeyCommand.PAGE_DOWN;
                }
                if (Key.r(a4, mappedKeys3.p())) {
                    return KeyCommand.LINE_START;
                }
                if (Key.r(a4, mappedKeys3.o())) {
                    return KeyCommand.LINE_END;
                }
                if (!Key.r(a4, mappedKeys3.l())) {
                    z2 = Key.r(a4, mappedKeys3.q());
                }
                if (z2) {
                    return KeyCommand.NEW_LINE;
                }
                if (Key.r(a4, mappedKeys3.c())) {
                    return KeyCommand.DELETE_PREV_CHAR;
                }
                if (Key.r(a4, mappedKeys3.g())) {
                    return KeyCommand.DELETE_NEXT_CHAR;
                }
                if (Key.r(a4, mappedKeys3.t())) {
                    return KeyCommand.PASTE;
                }
                if (Key.r(a4, mappedKeys3.f())) {
                    return KeyCommand.CUT;
                }
                if (Key.r(a4, mappedKeys3.e())) {
                    return KeyCommand.COPY;
                }
                if (Key.r(a4, mappedKeys3.u())) {
                    return KeyCommand.TAB;
                }
                return null;
            }
        } else if (Key.r(KeyEvent_androidKt.a(keyEvent), MappedKeys.f5830a.y())) {
            return KeyCommand.REDO;
        } else {
            return null;
        }
    }
}
