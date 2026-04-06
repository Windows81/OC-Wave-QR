package androidx.webkit.internal;

import java.util.concurrent.Callable;
import org.chromium.support_lib_boundary.WebViewRendererBoundaryInterface;

public final /* synthetic */ class g implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ WebViewRendererBoundaryInterface f23220a;

    public /* synthetic */ g(WebViewRendererBoundaryInterface webViewRendererBoundaryInterface) {
        this.f23220a = webViewRendererBoundaryInterface;
    }

    public final Object call() {
        return WebViewRenderProcessImpl.d(this.f23220a);
    }
}
