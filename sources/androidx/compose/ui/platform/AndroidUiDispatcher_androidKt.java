package androidx.compose.ui.platform;

import android.os.Looper;
import kotlin.Metadata;

@Metadata
public final class AndroidUiDispatcher_androidKt {
    public static final boolean b() {
        return Looper.myLooper() == Looper.getMainLooper();
    }
}
