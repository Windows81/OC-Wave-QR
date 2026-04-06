package androidx.compose.ui.platform;

import android.view.View;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

@Metadata
public interface PlatformTextInputSession {
    View r();

    Object s(PlatformTextInputMethodRequest platformTextInputMethodRequest, Continuation continuation);
}
