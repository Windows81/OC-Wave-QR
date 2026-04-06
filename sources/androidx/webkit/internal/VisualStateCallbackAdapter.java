package androidx.webkit.internal;

import androidx.webkit.WebViewCompat;
import org.chromium.support_lib_boundary.VisualStateCallbackBoundaryInterface;

public class VisualStateCallbackAdapter implements VisualStateCallbackBoundaryInterface {

    /* renamed from: a  reason: collision with root package name */
    public final WebViewCompat.VisualStateCallback f23161a;

    public void onComplete(long j2) {
        this.f23161a.onComplete(j2);
    }
}
