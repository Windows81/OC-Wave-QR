package androidx.webkit;

import android.content.pm.PackageInfo;
import android.net.Uri;
import android.webkit.WebView;
import androidx.webkit.internal.ApiHelperForO;
import androidx.webkit.internal.WebViewFeatureInternal;
import androidx.webkit.internal.WebViewGlueCommunicator;
import androidx.webkit.internal.WebViewProviderFactory;

public class WebViewCompat {

    /* renamed from: a  reason: collision with root package name */
    public static final Uri f23135a = Uri.parse("*");

    /* renamed from: b  reason: collision with root package name */
    public static final Uri f23136b = Uri.parse("");

    public interface VisualStateCallback {
        void onComplete(long j2);
    }

    public interface WebMessageListener {
        void a(WebView webView, WebMessageCompat webMessageCompat, Uri uri, boolean z2, JavaScriptReplyProxy javaScriptReplyProxy);
    }

    public static PackageInfo a() {
        return ApiHelperForO.a();
    }

    public static WebViewProviderFactory b() {
        return WebViewGlueCommunicator.d();
    }

    public static boolean c() {
        if (WebViewFeatureInternal.R.d()) {
            return b().getStatics().isMultiProcessEnabled();
        }
        throw WebViewFeatureInternal.a();
    }
}
