package androidx.compose.foundation.text.input.internal;

import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import kotlin.Metadata;

@Metadata
class ComposeInputMethodManagerImplApi21 extends ComposeInputMethodManagerImpl {

    /* renamed from: d  reason: collision with root package name */
    public BaseInputConnection f6138d;

    public ComposeInputMethodManagerImplApi21(View view) {
        super(view);
    }

    public void sendKeyEvent(KeyEvent keyEvent) {
        BaseInputConnection baseInputConnection = this.f6138d;
        if (baseInputConnection == null) {
            baseInputConnection = new BaseInputConnection(e(), false);
            this.f6138d = baseInputConnection;
        }
        baseInputConnection.sendKeyEvent(keyEvent);
    }
}
