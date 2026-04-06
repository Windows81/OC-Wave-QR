package com.hansecom.abt.ui.webView;

import android.content.Context;
import android.net.Uri;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.activity.compose.ManagedActivityResultLauncher;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class WebViewScreenKt$WebViewScreen$2 implements Function3<PaddingValues, Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ ManagedActivityResultLauncher f38983A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Uri f38984B;
    public final /* synthetic */ MutableState C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ LifecycleOwner f38985z;

    public WebViewScreenKt$WebViewScreen$2(LifecycleOwner lifecycleOwner, ManagedActivityResultLauncher managedActivityResultLauncher, Uri uri, MutableState mutableState) {
        this.f38985z = lifecycleOwner;
        this.f38983A = managedActivityResultLauncher;
        this.f38984B = uri;
        this.C = mutableState;
    }

    public static final WebView e(Uri uri, LifecycleOwner lifecycleOwner, ManagedActivityResultLauncher managedActivityResultLauncher, MutableState mutableState, Context context) {
        Intrinsics.i(context, "it");
        WebView webView = new WebView(context);
        webView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        webView.setWebViewClient(new WebViewClient());
        webView.setWebChromeClient(new WebViewScreenKt$WebViewScreen$2$1$1$1$1(lifecycleOwner, managedActivityResultLauncher, mutableState));
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setGeolocationEnabled(true);
        webView.loadUrl(String.valueOf(uri));
        return webView;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: kotlin.jvm.functions.Function1} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(androidx.compose.foundation.layout.PaddingValues r9, androidx.compose.runtime.Composer r10, int r11) {
        /*
            r8 = this;
            java.lang.String r0 = "innerPadding"
            kotlin.jvm.internal.Intrinsics.i(r9, r0)
            r0 = r11 & 6
            if (r0 != 0) goto L_0x0013
            boolean r0 = r10.W(r9)
            if (r0 == 0) goto L_0x0011
            r0 = 4
            goto L_0x0012
        L_0x0011:
            r0 = 2
        L_0x0012:
            r11 = r11 | r0
        L_0x0013:
            r0 = r11 & 19
            r1 = 18
            if (r0 != r1) goto L_0x0024
            boolean r0 = r10.t()
            if (r0 != 0) goto L_0x0020
            goto L_0x0024
        L_0x0020:
            r10.B()
            goto L_0x008e
        L_0x0024:
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x0033
            r0 = -1
            java.lang.String r1 = "com.hansecom.abt.ui.webView.WebViewScreen.<anonymous> (WebViewScreen.kt:54)"
            r2 = 1136399123(0x43bc1313, float:376.14902)
            androidx.compose.runtime.ComposerKt.Y(r2, r11, r0, r1)
        L_0x0033:
            androidx.compose.ui.Modifier$Companion r11 = androidx.compose.ui.Modifier.f15489d
            androidx.compose.ui.Modifier r9 = androidx.compose.foundation.layout.PaddingKt.h(r11, r9)
            r11 = 1
            r0 = 0
            r1 = 0
            androidx.compose.ui.Modifier r3 = androidx.compose.foundation.layout.SizeKt.f(r9, r1, r11, r0)
            r9 = 1715851355(0x6645d05b, float:2.3353742E23)
            r10.X(r9)
            androidx.lifecycle.LifecycleOwner r9 = r8.f38985z
            boolean r9 = r10.l(r9)
            androidx.activity.compose.ManagedActivityResultLauncher r11 = r8.f38983A
            boolean r11 = r10.l(r11)
            r9 = r9 | r11
            android.net.Uri r11 = r8.f38984B
            boolean r11 = r10.l(r11)
            r9 = r9 | r11
            android.net.Uri r11 = r8.f38984B
            androidx.lifecycle.LifecycleOwner r0 = r8.f38985z
            androidx.activity.compose.ManagedActivityResultLauncher r1 = r8.f38983A
            androidx.compose.runtime.MutableState r2 = r8.C
            java.lang.Object r4 = r10.g()
            if (r9 != 0) goto L_0x0070
            androidx.compose.runtime.Composer$Companion r9 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r9 = r9.a()
            if (r4 != r9) goto L_0x0078
        L_0x0070:
            com.hansecom.abt.ui.webView.e r4 = new com.hansecom.abt.ui.webView.e
            r4.<init>(r11, r0, r1, r2)
            r10.N(r4)
        L_0x0078:
            r2 = r4
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            r10.M()
            r6 = 0
            r7 = 4
            r4 = 0
            r5 = r10
            androidx.compose.ui.viewinterop.AndroidView_androidKt.a(r2, r3, r4, r5, r6, r7)
            boolean r9 = androidx.compose.runtime.ComposerKt.P()
            if (r9 == 0) goto L_0x008e
            androidx.compose.runtime.ComposerKt.X()
        L_0x008e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.ui.webView.WebViewScreenKt$WebViewScreen$2.c(androidx.compose.foundation.layout.PaddingValues, androidx.compose.runtime.Composer, int):void");
    }

    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        c((PaddingValues) obj, (Composer) obj2, ((Number) obj3).intValue());
        return Unit.f40552a;
    }
}
