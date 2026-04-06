package androidx.compose.foundation.text.input.internal;

import android.view.KeyEvent;
import android.view.View;
import kotlin.Metadata;

@Metadata
class ComposeInputMethodManagerImplApi24 extends ComposeInputMethodManagerImplApi21 {
    public ComposeInputMethodManagerImplApi24(View view) {
        super(view);
    }

    public void sendKeyEvent(KeyEvent keyEvent) {
        i().dispatchKeyEventFromInputMethod(e(), keyEvent);
    }
}
