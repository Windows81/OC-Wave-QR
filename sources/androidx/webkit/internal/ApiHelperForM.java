package androidx.webkit.internal;

import android.webkit.WebMessage;
import android.webkit.WebMessagePort;
import android.webkit.WebResourceError;
import android.webkit.WebView;
import androidx.webkit.WebMessageCompat;
import androidx.webkit.WebMessagePortCompat;
import androidx.webkit.WebViewCompat;

public class ApiHelperForM {

    /* renamed from: androidx.webkit.internal.ApiHelperForM$1  reason: invalid class name */
    class AnonymousClass1 extends WebMessagePort.WebMessageCallback {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ WebMessagePortCompat.WebMessageCallbackCompat f23141a;

        public void onMessage(WebMessagePort webMessagePort, WebMessage webMessage) {
            this.f23141a.a(new WebMessagePortImpl(webMessagePort), WebMessagePortImpl.b(webMessage));
        }
    }

    /* renamed from: androidx.webkit.internal.ApiHelperForM$2  reason: invalid class name */
    class AnonymousClass2 extends WebMessagePort.WebMessageCallback {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ WebMessagePortCompat.WebMessageCallbackCompat f23142a;

        public void onMessage(WebMessagePort webMessagePort, WebMessage webMessage) {
            this.f23142a.a(new WebMessagePortImpl(webMessagePort), WebMessagePortImpl.b(webMessage));
        }
    }

    /* renamed from: androidx.webkit.internal.ApiHelperForM$3  reason: invalid class name */
    class AnonymousClass3 extends WebView.VisualStateCallback {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ WebViewCompat.VisualStateCallback f23143a;

        public void onComplete(long j2) {
            this.f23143a.onComplete(j2);
        }
    }

    public static WebMessageCompat a(WebMessage webMessage) {
        return new WebMessageCompat(webMessage.getData(), WebMessagePortImpl.d(webMessage.getPorts()));
    }

    public static CharSequence b(WebResourceError webResourceError) {
        return webResourceError.getDescription();
    }

    public static int c(WebResourceError webResourceError) {
        return webResourceError.getErrorCode();
    }
}
