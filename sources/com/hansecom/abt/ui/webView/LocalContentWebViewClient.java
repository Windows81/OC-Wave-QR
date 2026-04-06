package com.hansecom.abt.ui.webView;

import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.webkit.WebViewAssetLoader;
import androidx.webkit.WebViewClientCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class LocalContentWebViewClient extends WebViewClientCompat {

    /* renamed from: b  reason: collision with root package name */
    public final WebViewAssetLoader f38976b;

    public LocalContentWebViewClient(WebViewAssetLoader webViewAssetLoader) {
        Intrinsics.i(webViewAssetLoader, "assetLoader");
        this.f38976b = webViewAssetLoader;
    }

    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        Intrinsics.i(webView, "view");
        Intrinsics.i(webResourceRequest, "request");
        return this.f38976b.a(webResourceRequest.getUrl());
    }
}
