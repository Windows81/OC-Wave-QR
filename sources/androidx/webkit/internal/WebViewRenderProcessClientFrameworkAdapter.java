package androidx.webkit.internal;

import android.webkit.WebView;
import android.webkit.WebViewRenderProcess;
import android.webkit.WebViewRenderProcessClient;

public class WebViewRenderProcessClientFrameworkAdapter extends WebViewRenderProcessClient {

    /* renamed from: a  reason: collision with root package name */
    public final androidx.webkit.WebViewRenderProcessClient f23208a;

    public void onRenderProcessResponsive(WebView webView, WebViewRenderProcess webViewRenderProcess) {
        this.f23208a.a(webView, WebViewRenderProcessImpl.b(webViewRenderProcess));
    }

    public void onRenderProcessUnresponsive(WebView webView, WebViewRenderProcess webViewRenderProcess) {
        this.f23208a.b(webView, WebViewRenderProcessImpl.b(webViewRenderProcess));
    }
}
