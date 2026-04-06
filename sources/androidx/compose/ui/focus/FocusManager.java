package androidx.compose.ui.focus;

import kotlin.Metadata;

@Metadata
public interface FocusManager {

    @Metadata
    public static final class DefaultImpls {
    }

    static /* synthetic */ void g(FocusManager focusManager, boolean z2, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 1) != 0) {
                z2 = false;
            }
            focusManager.w(z2);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clearFocus");
    }

    boolean p(int i2);

    void w(boolean z2);
}
