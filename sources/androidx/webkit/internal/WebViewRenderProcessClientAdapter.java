package androidx.webkit.internal;

import android.webkit.WebView;
import androidx.webkit.WebViewRenderProcessClient;
import java.lang.reflect.InvocationHandler;
import java.util.concurrent.Executor;
import org.chromium.support_lib_boundary.WebViewRendererClientBoundaryInterface;

public class WebViewRenderProcessClientAdapter implements WebViewRendererClientBoundaryInterface {

    /* renamed from: c  reason: collision with root package name */
    public static final String[] f23205c = {"WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE"};

    /* renamed from: a  reason: collision with root package name */
    public final Executor f23206a;

    /* renamed from: b  reason: collision with root package name */
    public final WebViewRenderProcessClient f23207b;

    public final String[] getSupportedFeatures() {
        return f23205c;
    }

    public final void onRendererResponsive(WebView webView, InvocationHandler invocationHandler) {
        WebViewRenderProcessImpl c2 = WebViewRenderProcessImpl.c(invocationHandler);
        WebViewRenderProcessClient webViewRenderProcessClient = this.f23207b;
        Executor executor = this.f23206a;
        if (executor == null) {
            webViewRenderProcessClient.a(webView, c2);
        } else {
            executor.execute(new e(webViewRenderProcessClient, webView, c2));
        }
    }

    public final void onRendererUnresponsive(WebView webView, InvocationHandler invocationHandler) {
        WebViewRenderProcessImpl c2 = WebViewRenderProcessImpl.c(invocationHandler);
        WebViewRenderProcessClient webViewRenderProcessClient = this.f23207b;
        Executor executor = this.f23206a;
        if (executor == null) {
            webViewRenderProcessClient.b(webView, c2);
        } else {
            executor.execute(new f(webViewRenderProcessClient, webView, c2));
        }
    }
}
