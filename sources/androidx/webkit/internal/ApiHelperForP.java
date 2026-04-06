package androidx.webkit.internal;

import android.webkit.TracingController;
import android.webkit.WebView;

public class ApiHelperForP {
    public static TracingController a() {
        return TracingController.getInstance();
    }

    public static ClassLoader b() {
        return WebView.getWebViewClassLoader();
    }
}
