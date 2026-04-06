package androidx.compose.ui.platform;

import android.view.View;
import kotlin.Metadata;

@Metadata
public final class AndroidComposeViewTranslationCallbackS {

    /* renamed from: a  reason: collision with root package name */
    public static final AndroidComposeViewTranslationCallbackS f17587a = new AndroidComposeViewTranslationCallbackS();

    public final void a(View view) {
        view.clearViewTranslationCallback();
    }

    public final void b(View view) {
        view.setViewTranslationCallback(C0347m.a(AndroidComposeViewTranslationCallback.f17586a));
    }
}
