package androidx.compose.ui.platform;

import android.view.View;
import kotlin.Metadata;

@Metadata
final class AndroidComposeViewForceDarkModeQ {

    /* renamed from: a  reason: collision with root package name */
    public static final AndroidComposeViewForceDarkModeQ f17583a = new AndroidComposeViewForceDarkModeQ();

    public final void a(View view) {
        view.setForceDarkAllowed(false);
    }
}
