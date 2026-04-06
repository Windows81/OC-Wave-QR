package androidx.webkit.internal;

import android.webkit.WebView;
import androidx.webkit.WebViewRenderProcess;
import androidx.webkit.WebViewRenderProcessClient;

public final /* synthetic */ class f implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ WebView f23217A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ WebViewRenderProcess f23218B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ WebViewRenderProcessClient f23219z;

    public /* synthetic */ f(WebViewRenderProcessClient webViewRenderProcessClient, WebView webView, WebViewRenderProcess webViewRenderProcess) {
        this.f23219z = webViewRenderProcessClient;
        this.f23217A = webView;
        this.f23218B = webViewRenderProcess;
    }

    public final void run() {
        this.f23219z.b(this.f23217A, this.f23218B);
    }
}
