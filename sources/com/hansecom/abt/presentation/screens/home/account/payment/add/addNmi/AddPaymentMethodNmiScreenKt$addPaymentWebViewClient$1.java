package com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi;

import android.graphics.Bitmap;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import kotlin.Metadata;

@Metadata
public final class AddPaymentMethodNmiScreenKt$addPaymentWebViewClient$1 extends WebViewClient {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ WebView f35629a;

    public AddPaymentMethodNmiScreenKt$addPaymentWebViewClient$1(WebView webView) {
        this.f35629a = webView;
    }

    public static final void b(String str) {
    }

    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        this.f35629a.evaluateJavascript("window.webkit = { messageHandlers: { myhdlAndroid: window.AndroidListener} }", new x());
    }

    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        return false;
    }
}
