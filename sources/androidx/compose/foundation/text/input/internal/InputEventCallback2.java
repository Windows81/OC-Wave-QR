package androidx.compose.foundation.text.input.internal;

import android.view.KeyEvent;
import java.util.List;
import kotlin.Metadata;

@Metadata
public interface InputEventCallback2 {
    void a(int i2);

    void b(KeyEvent keyEvent);

    void c(boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7);

    void d(List list);

    void e(RecordingInputConnection recordingInputConnection);
}
