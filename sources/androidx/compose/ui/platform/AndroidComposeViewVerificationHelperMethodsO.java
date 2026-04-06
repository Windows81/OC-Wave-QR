package androidx.compose.ui.platform;

import android.view.View;
import kotlin.Metadata;

@Metadata
final class AndroidComposeViewVerificationHelperMethodsO {

    /* renamed from: a  reason: collision with root package name */
    public static final AndroidComposeViewVerificationHelperMethodsO f17589a = new AndroidComposeViewVerificationHelperMethodsO();

    public final void a(View view, int i2, boolean z2) {
        view.setFocusable(i2);
        view.setDefaultFocusHighlightEnabled(z2);
    }
}
