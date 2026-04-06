package androidx.compose.foundation.text.input.internal;

import android.view.InputDevice;
import android.view.KeyEvent;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

@Metadata
public final class AndroidTextFieldKeyEventHandler extends TextFieldKeyEventHandler {
    public boolean b(KeyEvent keyEvent, TransformedTextFieldState transformedTextFieldState, TextLayoutState textLayoutState, TextFieldSelectionState textFieldSelectionState, Function1 function1, boolean z2, boolean z3, Function0 function0) {
        if (KeyEventType.f(KeyEvent_androidKt.b(keyEvent), KeyEventType.f16777b.a()) && keyEvent.isFromSource(257) && !TextFieldKeyEventHandler_androidKt.c(keyEvent)) {
            textFieldSelectionState.y0(false);
        }
        return super.b(keyEvent, transformedTextFieldState, textLayoutState, textFieldSelectionState, function1, z2, z3, function0);
    }

    public boolean c(KeyEvent keyEvent, TransformedTextFieldState transformedTextFieldState, TextFieldSelectionState textFieldSelectionState, FocusManager focusManager, SoftwareKeyboardController softwareKeyboardController) {
        if (super.c(keyEvent, transformedTextFieldState, textFieldSelectionState, focusManager, softwareKeyboardController)) {
            return true;
        }
        InputDevice device = keyEvent.getDevice();
        if (device != null && device.supportsSource(513) && !device.isVirtual() && KeyEventType.f(KeyEvent_androidKt.b(keyEvent), KeyEventType.f16777b.a()) && keyEvent.getSource() != 257) {
            if (TextFieldKeyEventHandler_androidKt.d(keyEvent, 19)) {
                return focusManager.p(FocusDirection.f15729b.h());
            }
            if (TextFieldKeyEventHandler_androidKt.d(keyEvent, 20)) {
                return focusManager.p(FocusDirection.f15729b.a());
            }
            if (TextFieldKeyEventHandler_androidKt.d(keyEvent, 21)) {
                return focusManager.p(FocusDirection.f15729b.d());
            }
            if (TextFieldKeyEventHandler_androidKt.d(keyEvent, 22)) {
                return focusManager.p(FocusDirection.f15729b.g());
            }
            if (TextFieldKeyEventHandler_androidKt.d(keyEvent, 23)) {
                softwareKeyboardController.b();
                return true;
            }
        }
        return false;
    }
}
