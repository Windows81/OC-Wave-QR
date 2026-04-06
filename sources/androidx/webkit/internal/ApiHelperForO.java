package androidx.webkit.internal;

import android.content.pm.PackageInfo;
import android.webkit.WebView;

public class ApiHelperForO {
    public static PackageInfo a() {
        return WebView.getCurrentWebViewPackage();
    }
}
