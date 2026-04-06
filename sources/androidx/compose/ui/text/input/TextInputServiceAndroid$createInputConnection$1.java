package androidx.compose.ui.text.input;

import android.view.KeyEvent;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class TextInputServiceAndroid$createInputConnection$1 implements InputEventCallback2 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ TextInputServiceAndroid f18920a;

    public TextInputServiceAndroid$createInputConnection$1(TextInputServiceAndroid textInputServiceAndroid) {
        this.f18920a = textInputServiceAndroid;
    }

    public void a(int i2) {
        this.f18920a.f18906f.invoke(ImeAction.j(i2));
    }

    public void b(KeyEvent keyEvent) {
        this.f18920a.p().sendKeyEvent(keyEvent);
    }

    public void c(boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.f18920a.f18912l.b(z2, z3, z4, z5, z6, z7);
    }

    public void d(List list) {
        this.f18920a.f18905e.invoke(list);
    }

    public void e(RecordingInputConnection recordingInputConnection) {
        int size = this.f18920a.f18909i.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (Intrinsics.d(((WeakReference) this.f18920a.f18909i.get(i2)).get(), recordingInputConnection)) {
                this.f18920a.f18909i.remove(i2);
                return;
            }
        }
    }
}
