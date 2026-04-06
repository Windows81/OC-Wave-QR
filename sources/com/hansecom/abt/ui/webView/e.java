package com.hansecom.abt.ui.webView;

import android.content.Context;
import android.net.Uri;
import androidx.activity.compose.ManagedActivityResultLauncher;
import androidx.compose.runtime.MutableState;
import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class e implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ LifecycleOwner f38998A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ ManagedActivityResultLauncher f38999B;
    public final /* synthetic */ MutableState C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Uri f39000z;

    public /* synthetic */ e(Uri uri, LifecycleOwner lifecycleOwner, ManagedActivityResultLauncher managedActivityResultLauncher, MutableState mutableState) {
        this.f39000z = uri;
        this.f38998A = lifecycleOwner;
        this.f38999B = managedActivityResultLauncher;
        this.C = mutableState;
    }

    public final Object invoke(Object obj) {
        return WebViewScreenKt$WebViewScreen$2.e(this.f39000z, this.f38998A, this.f38999B, this.C, (Context) obj);
    }
}
