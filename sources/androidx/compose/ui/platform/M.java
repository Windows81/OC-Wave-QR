package androidx.compose.ui.platform;

import android.view.View;
import androidx.compose.runtime.Recomposer;
import androidx.compose.ui.platform.WindowRecomposerFactory;

public final /* synthetic */ class M implements WindowRecomposerFactory {
    public final Recomposer a(View view) {
        return WindowRecomposerFactory.Companion.b(view);
    }
}
