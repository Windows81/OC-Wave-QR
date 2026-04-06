package com.hansecom.abt.ui.webView;

import android.webkit.GeolocationPermissions;
import android.webkit.WebChromeClient;
import androidx.activity.compose.ManagedActivityResultLauncher;
import androidx.compose.runtime.MutableState;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class WebViewScreenKt$WebViewScreen$2$1$1$1$1 extends WebChromeClient {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ LifecycleOwner f38986a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ManagedActivityResultLauncher f38987b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ MutableState f38988c;

    public WebViewScreenKt$WebViewScreen$2$1$1$1$1(LifecycleOwner lifecycleOwner, ManagedActivityResultLauncher managedActivityResultLauncher, MutableState mutableState) {
        this.f38986a = lifecycleOwner;
        this.f38987b = managedActivityResultLauncher;
        this.f38988c = mutableState;
    }

    public void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        Intrinsics.i(str, "origin");
        Intrinsics.i(callback, "callback");
        if (this.f38986a.a().b().f(Lifecycle.State.STARTED)) {
            WebViewScreenKt.e(this.f38988c, new Pair(str, callback));
            ManagedActivityResultLauncher managedActivityResultLauncher = this.f38987b;
            if (managedActivityResultLauncher != null) {
                managedActivityResultLauncher.a(new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"});
            }
        }
    }
}
