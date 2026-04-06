package com.hansecom.abt.presentation.screens.home.account.payment.add.addCyberSource;

import android.graphics.Bitmap;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata
public final class AddPaymentMethodCyberSourceScreenKt$addPaymentWebViewClient$1 extends WebViewClient {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Function0 f35561a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ WebView f35562b;

    public AddPaymentMethodCyberSourceScreenKt$addPaymentWebViewClient$1(Function0 function0, WebView webView) {
        this.f35561a = function0;
        this.f35562b = webView;
    }

    public static final void b(String str) {
    }

    public void onPageFinished(WebView webView, String str) {
        if (webView != null) {
            webView.loadUrl("javascript:(function() {\n    var style = document.createElement('style');\n    style.innerHTML = `\n        body {\n            font-size: 100% !important;\n            padding: 1em;\n            max-width: 100vw;\n            box-sizing: border-box;\n            overflow-x: hidden;\n        }\n        img, iframe, table {\n            max-width: 100% !important;\n            height: auto !important;\n        }\n    `;\n    document.head.appendChild(style);\n})();");
        }
    }

    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        this.f35562b.evaluateJavascript("window.webkit = { messageHandlers: { myhdlAndroid: window.AndroidListener} }", new m());
    }

    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        Intrinsics.i(webResourceRequest, "request");
        String path = webResourceRequest.getUrl().getPath();
        if (path != null && StringsKt.W(path, "payment-response-success", false, 2, (Object) null)) {
            this.f35561a.invoke();
        }
        return super.shouldInterceptRequest(webView, webResourceRequest);
    }
}
