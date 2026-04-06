package androidx.webkit.internal;

import android.webkit.ServiceWorkerClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import androidx.webkit.ServiceWorkerClientCompat;

public class FrameworkServiceWorkerClient extends ServiceWorkerClient {

    /* renamed from: a  reason: collision with root package name */
    public final ServiceWorkerClientCompat f23145a;

    public WebResourceResponse shouldInterceptRequest(WebResourceRequest webResourceRequest) {
        return this.f23145a.a(webResourceRequest);
    }
}
