package androidx.compose.ui.platform;

import android.view.View;
import kotlin.Metadata;

@Metadata
final class AndroidComposeViewSensitiveContent35 {

    /* renamed from: a  reason: collision with root package name */
    public static final AndroidComposeViewSensitiveContent35 f17584a = new AndroidComposeViewSensitiveContent35();

    public final void a(View view, boolean z2) {
        if (z2) {
            view.setContentSensitivity(1);
        } else {
            view.setContentSensitivity(0);
        }
    }
}
