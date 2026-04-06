package com.hansecom.abt.ui.webView;

import android.content.Context;
import android.net.Uri;
import android.view.ViewGroup;
import android.webkit.WebView;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.webkit.WebViewAssetLoader;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class LocalWebViewScreenKt$LocalWebViewScreen$2 implements Function3<PaddingValues, Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Uri f38979A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Context f38980z;

    public LocalWebViewScreenKt$LocalWebViewScreen$2(Context context, Uri uri) {
        this.f38980z = context;
        this.f38979A = uri;
    }

    public static final WebView e(Context context, Uri uri, Context context2) {
        Intrinsics.i(context2, "it");
        WebViewAssetLoader b2 = new WebViewAssetLoader.Builder().c("local").a("/assets/", new WebViewAssetLoader.AssetsPathHandler(context)).a("/res/", new WebViewAssetLoader.ResourcesPathHandler(context)).b();
        Intrinsics.h(b2, "build(...)");
        WebView webView = new WebView(context2);
        webView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        webView.setWebViewClient(new LocalContentWebViewClient(b2));
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl(uri.toString());
        return webView;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: kotlin.jvm.functions.Function1} */
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
            goto L_0x0083
        L_0x0024:
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x0033
            r0 = -1
            java.lang.String r1 = "com.hansecom.abt.ui.webView.LocalWebViewScreen.<anonymous> (LocalWebViewScreen.kt:35)"
            r2 = 931767657(0x3789a569, float:1.6408698E-5)
            androidx.compose.runtime.ComposerKt.Y(r2, r11, r0, r1)
        L_0x0033:
            androidx.compose.ui.Modifier$Companion r11 = androidx.compose.ui.Modifier.f15489d
            androidx.compose.ui.Modifier r9 = androidx.compose.foundation.layout.PaddingKt.h(r11, r9)
            r11 = 1
            r0 = 0
            r1 = 0
            androidx.compose.ui.Modifier r3 = androidx.compose.foundation.layout.SizeKt.f(r9, r1, r11, r0)
            r9 = -976589855(0xffffffffc5ca6be1, float:-6477.485)
            r10.X(r9)
            android.content.Context r9 = r8.f38980z
            boolean r9 = r10.l(r9)
            android.net.Uri r11 = r8.f38979A
            boolean r11 = r10.l(r11)
            r9 = r9 | r11
            android.content.Context r11 = r8.f38980z
            android.net.Uri r0 = r8.f38979A
            java.lang.Object r1 = r10.g()
            if (r9 != 0) goto L_0x0065
            androidx.compose.runtime.Composer$Companion r9 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r9 = r9.a()
            if (r1 != r9) goto L_0x006d
        L_0x0065:
            com.hansecom.abt.ui.webView.b r1 = new com.hansecom.abt.ui.webView.b
            r1.<init>(r11, r0)
            r10.N(r1)
        L_0x006d:
            r2 = r1
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            r10.M()
            r6 = 0
            r7 = 4
            r4 = 0
            r5 = r10
            androidx.compose.ui.viewinterop.AndroidView_androidKt.a(r2, r3, r4, r5, r6, r7)
            boolean r9 = androidx.compose.runtime.ComposerKt.P()
            if (r9 == 0) goto L_0x0083
            androidx.compose.runtime.ComposerKt.X()
        L_0x0083:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.ui.webView.LocalWebViewScreenKt$LocalWebViewScreen$2.c(androidx.compose.foundation.layout.PaddingValues, androidx.compose.runtime.Composer, int):void");
    }

    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        c((PaddingValues) obj, (Composer) obj2, ((Number) obj3).intValue());
        return Unit.f40552a;
    }
}
