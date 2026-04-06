package androidx.compose.ui.platform;

import android.view.View;
import android.view.translation.ViewTranslationCallback;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class AndroidComposeViewTranslationCallback implements ViewTranslationCallback {

    /* renamed from: a  reason: collision with root package name */
    public static final AndroidComposeViewTranslationCallback f17586a = new AndroidComposeViewTranslationCallback();

    public boolean onClearTranslation(View view) {
        Intrinsics.g(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        ((AndroidComposeView) view).getContentCaptureManager$ui_release().w();
        return true;
    }

    public boolean onHideTranslation(View view) {
        Intrinsics.g(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        ((AndroidComposeView) view).getContentCaptureManager$ui_release().y();
        return true;
    }

    public boolean onShowTranslation(View view) {
        Intrinsics.g(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        ((AndroidComposeView) view).getContentCaptureManager$ui_release().B();
        return true;
    }
}
