package androidx.compose.ui.platform;

import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import kotlin.Metadata;

@Metadata
public interface PlatformTextInputMethodRequest {
    InputConnection a(EditorInfo editorInfo);
}
