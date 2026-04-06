package androidx.compose.foundation.text;

import android.view.KeyEvent;
import kotlin.Metadata;

@Metadata
public interface KeyMapping {
    KeyCommand a(KeyEvent keyEvent);
}
