package com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi;

import android.content.Context;
import android.view.ViewGroup;
import android.webkit.WebView;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class AddPaymentMethodNmiScreenKt$WebViewCardInfo$1$2 implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Context f35626A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ int f35627B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ JsInterface f35628z;

    public AddPaymentMethodNmiScreenKt$WebViewCardInfo$1$2(JsInterface jsInterface, Context context, int i2) {
        this.f35628z = jsInterface;
        this.f35626A = context;
        this.f35627B = i2;
    }

    public static final WebView f(JsInterface jsInterface, Context context) {
        Intrinsics.i(context, "it");
        WebView webView = new WebView(context);
        webView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        webView.setWebViewClient(AddPaymentMethodNmiScreenKt.T(webView));
        webView.getSettings().setJavaScriptEnabled(true);
        WebView.setWebContentsDebuggingEnabled(true);
        webView.addJavascriptInterface(jsInterface, "AndroidListener");
        return webView;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003c, code lost:
        throw r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0038, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0039, code lost:
        kotlin.io.CloseableKt.a(r7, r8);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final kotlin.Unit g(android.content.Context r7, int r8, android.webkit.WebView r9) {
        /*
            java.lang.String r0 = "it"
            kotlin.jvm.internal.Intrinsics.i(r9, r0)
            android.content.res.Resources r7 = r7.getResources()
            java.io.InputStream r7 = r7.openRawResource(r8)
            java.lang.String r8 = "openRawResource(...)"
            kotlin.jvm.internal.Intrinsics.h(r7, r8)
            java.nio.charset.Charset r8 = kotlin.text.Charsets.f41118b
            java.io.InputStreamReader r0 = new java.io.InputStreamReader
            r0.<init>(r7, r8)
            java.io.BufferedReader r7 = new java.io.BufferedReader
            r8 = 8192(0x2000, float:1.14794E-41)
            r7.<init>(r0, r8)
            java.lang.String r3 = kotlin.io.TextStreamsKt.c(r7)     // Catch:{ all -> 0x0036 }
            r8 = 0
            kotlin.io.CloseableKt.a(r7, r8)
            java.lang.String r5 = ""
            r6 = 0
            java.lang.String r2 = "app://com.hansecom.spokaneapp/payment_verified?"
            java.lang.String r4 = "text/html; charset=UTF-8"
            r1 = r9
            r1.loadDataWithBaseURL(r2, r3, r4, r5, r6)
            kotlin.Unit r7 = kotlin.Unit.f40552a
            return r7
        L_0x0036:
            r8 = move-exception
            throw r8     // Catch:{ all -> 0x0038 }
        L_0x0038:
            r9 = move-exception
            kotlin.io.CloseableKt.a(r7, r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmiScreenKt$WebViewCardInfo$1$2.g(android.content.Context, int, android.webkit.WebView):kotlin.Unit");
    }

    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        e((AnimatedVisibilityScope) obj, (Composer) obj2, ((Number) obj3).intValue());
        return Unit.f40552a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: kotlin.jvm.functions.Function1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: kotlin.jvm.functions.Function1} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e(androidx.compose.animation.AnimatedVisibilityScope r9, androidx.compose.runtime.Composer r10, int r11) {
        /*
            r8 = this;
            java.lang.String r0 = "$this$AnimatedVisibility"
            kotlin.jvm.internal.Intrinsics.i(r9, r0)
            boolean r9 = androidx.compose.runtime.ComposerKt.P()
            if (r9 == 0) goto L_0x0014
            r9 = -1
            java.lang.String r0 = "com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.WebViewCardInfo.<anonymous>.<anonymous> (AddPaymentMethodNmiScreen.kt:197)"
            r1 = -683609076(0xffffffffd740f40c, float:-2.12154406E14)
            androidx.compose.runtime.ComposerKt.Y(r1, r11, r9, r0)
        L_0x0014:
            androidx.compose.ui.Modifier$Companion r9 = androidx.compose.ui.Modifier.f15489d
            r11 = 1
            r0 = 0
            r1 = 0
            androidx.compose.ui.Modifier r3 = androidx.compose.foundation.layout.SizeKt.f(r9, r1, r11, r0)
            r9 = 1990316944(0x76a1d390, float:1.6411148E33)
            r10.X(r9)
            com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.JsInterface r9 = r8.f35628z
            boolean r9 = r10.l(r9)
            com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.JsInterface r11 = r8.f35628z
            java.lang.Object r0 = r10.g()
            if (r9 != 0) goto L_0x0039
            androidx.compose.runtime.Composer$Companion r9 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r9 = r9.a()
            if (r0 != r9) goto L_0x0041
        L_0x0039:
            com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.v r0 = new com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.v
            r0.<init>(r11)
            r10.N(r0)
        L_0x0041:
            r2 = r0
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            r10.M()
            r9 = 1990335764(0x76a21d14, float:1.6440271E33)
            r10.X(r9)
            android.content.Context r9 = r8.f35626A
            boolean r9 = r10.l(r9)
            int r11 = r8.f35627B
            boolean r11 = r10.i(r11)
            r9 = r9 | r11
            android.content.Context r11 = r8.f35626A
            int r0 = r8.f35627B
            java.lang.Object r1 = r10.g()
            if (r9 != 0) goto L_0x006c
            androidx.compose.runtime.Composer$Companion r9 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r9 = r9.a()
            if (r1 != r9) goto L_0x0074
        L_0x006c:
            com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.w r1 = new com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.w
            r1.<init>(r11, r0)
            r10.N(r1)
        L_0x0074:
            r4 = r1
            kotlin.jvm.functions.Function1 r4 = (kotlin.jvm.functions.Function1) r4
            r10.M()
            r6 = 48
            r7 = 0
            r5 = r10
            androidx.compose.ui.viewinterop.AndroidView_androidKt.a(r2, r3, r4, r5, r6, r7)
            boolean r9 = androidx.compose.runtime.ComposerKt.P()
            if (r9 == 0) goto L_0x008a
            androidx.compose.runtime.ComposerKt.X()
        L_0x008a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmiScreenKt$WebViewCardInfo$1$2.e(androidx.compose.animation.AnimatedVisibilityScope, androidx.compose.runtime.Composer, int):void");
    }
}
