package androidx.compose.foundation.text.input.internal;

import android.view.KeyEvent;
import android.view.inputmethod.CursorAnchorInfo;
import kotlin.Metadata;

@Metadata
public interface ComposeInputMethodManager {
    void a(int i2, int i3, int i4, int i5);

    void c();

    void d(CursorAnchorInfo cursorAnchorInfo);

    void f();

    void g();

    void h();

    void sendKeyEvent(KeyEvent keyEvent);
}
