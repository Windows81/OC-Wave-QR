package androidx.compose.foundation.text.input.internal;

import android.view.KeyEvent;
import androidx.compose.ui.text.input.ImeAction;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class LegacyTextInputMethodRequest$createInputConnection$1 implements InputEventCallback2 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ LegacyTextInputMethodRequest f6254a;

    public LegacyTextInputMethodRequest$createInputConnection$1(LegacyTextInputMethodRequest legacyTextInputMethodRequest) {
        this.f6254a = legacyTextInputMethodRequest;
    }

    public void a(int i2) {
        this.f6254a.f6243d.invoke(ImeAction.j(i2));
    }

    public void b(KeyEvent keyEvent) {
        this.f6254a.h().sendKeyEvent(keyEvent);
    }

    public void c(boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.f6254a.f6252m.b(z2, z3, z4, z5, z6, z7);
    }

    public void d(List list) {
        this.f6254a.f6242c.invoke(list);
    }

    public void e(RecordingInputConnection recordingInputConnection) {
        int size = this.f6254a.f6249j.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (Intrinsics.d(((WeakReference) this.f6254a.f6249j.get(i2)).get(), recordingInputConnection)) {
                this.f6254a.f6249j.remove(i2);
                return;
            }
        }
    }
}
