package androidx.compose.ui.text.input;

import android.view.KeyEvent;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;

@Metadata
@Deprecated
public interface InputEventCallback2 {
    void a(int i2);

    void b(KeyEvent keyEvent);

    void c(boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7);

    void d(List list);

    void e(RecordingInputConnection recordingInputConnection);
}
