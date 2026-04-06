package androidx.webkit.internal;

import android.webkit.WebView;
import androidx.webkit.WebViewRenderProcess;
import androidx.webkit.WebViewRenderProcessClient;

public final /* synthetic */ class e implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ WebView f23214A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ WebViewRenderProcess f23215B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ WebViewRenderProcessClient f23216z;

    public /* synthetic */ e(WebViewRenderProcessClient webViewRenderProcessClient, WebView webView, WebViewRenderProcess webViewRenderProcess) {
        this.f23216z = webViewRenderProcessClient;
        this.f23214A = webView;
        this.f23215B = webViewRenderProcess;
    }

    public final void run() {
        this.f23216z.a(this.f23214A, this.f23215B);
    }
}
