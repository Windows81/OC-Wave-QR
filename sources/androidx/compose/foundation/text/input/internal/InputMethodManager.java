package androidx.compose.foundation.text.input.internal;

import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.ExtractedText;
import kotlin.Metadata;

@Metadata
public interface InputMethodManager {
    void a(int i2, int i3, int i4, int i5);

    boolean b();

    void c();

    void d(CursorAnchorInfo cursorAnchorInfo);

    void e(int i2, ExtractedText extractedText);

    void f();
}
