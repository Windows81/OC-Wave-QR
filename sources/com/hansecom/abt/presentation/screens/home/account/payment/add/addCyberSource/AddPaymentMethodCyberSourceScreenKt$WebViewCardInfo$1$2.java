package com.hansecom.abt.presentation.screens.home.account.payment.add.addCyberSource;

import android.content.Context;
import android.view.ViewGroup;
import android.webkit.WebView;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class AddPaymentMethodCyberSourceScreenKt$WebViewCardInfo$1$2 implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ String f35559A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function0 f35560z;

    public AddPaymentMethodCyberSourceScreenKt$WebViewCardInfo$1$2(Function0 function0, String str) {
        this.f35560z = function0;
        this.f35559A = str;
    }

    public static final WebView f(Function0 function0, Context context) {
        Intrinsics.i(context, "it");
        WebView webView = new WebView(context);
        webView.getSettings().setBuiltInZoomControls(true);
        webView.getSettings().setDisplayZoomControls(false);
        webView.getSettings().setSupportZoom(true);
        webView.getSettings().setUseWideViewPort(true);
        webView.getSettings().setLoadWithOverviewMode(true);
        webView.setInitialScale(200);
        webView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        webView.setWebViewClient(AddPaymentMethodCyberSourceScreenKt.A(webView, function0));
        webView.getSettings().setJavaScriptEnabled(true);
        return webView;
    }

    public static final Unit g(String str, WebView webView) {
        Intrinsics.i(webView, "it");
        webView.loadDataWithBaseURL("app://com.hansecom.spokaneapp/payment_verified?", str, "text/html; charset=UTF-8", "", (String) null);
        return Unit.f40552a;
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
            java.lang.String r0 = "com.hansecom.abt.presentation.screens.home.account.payment.add.addCyberSource.WebViewCardInfo.<anonymous>.<anonymous> (AddPaymentMethodCyberSourceScreen.kt:177)"
            r1 = 740241942(0x2c1f3216, float:2.2623062E-12)
            androidx.compose.runtime.ComposerKt.Y(r1, r11, r9, r0)
        L_0x0014:
            androidx.compose.ui.Modifier$Companion r9 = androidx.compose.ui.Modifier.f15489d
            r11 = 1
            r0 = 0
            r1 = 0
            androidx.compose.ui.Modifier r3 = androidx.compose.foundation.layout.SizeKt.f(r9, r1, r11, r0)
            r9 = -1894084917(0xffffffff8f1a8ecb, float:-7.620287E-30)
            r10.X(r9)
            kotlin.jvm.functions.Function0 r9 = r8.f35560z
            boolean r9 = r10.W(r9)
            kotlin.jvm.functions.Function0 r11 = r8.f35560z
            java.lang.Object r0 = r10.g()
            if (r9 != 0) goto L_0x0039
            androidx.compose.runtime.Composer$Companion r9 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r9 = r9.a()
            if (r0 != r9) goto L_0x0041
        L_0x0039:
            com.hansecom.abt.presentation.screens.home.account.payment.add.addCyberSource.k r0 = new com.hansecom.abt.presentation.screens.home.account.payment.add.addCyberSource.k
            r0.<init>(r11)
            r10.N(r0)
        L_0x0041:
            r2 = r0
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            r10.M()
            r9 = -1894059786(0xffffffff8f1af0f6, float:-7.6391936E-30)
            r10.X(r9)
            java.lang.String r9 = r8.f35559A
            boolean r9 = r10.W(r9)
            java.lang.String r11 = r8.f35559A
            java.lang.Object r0 = r10.g()
            if (r9 != 0) goto L_0x0063
            androidx.compose.runtime.Composer$Companion r9 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r9 = r9.a()
            if (r0 != r9) goto L_0x006b
        L_0x0063:
            com.hansecom.abt.presentation.screens.home.account.payment.add.addCyberSource.l r0 = new com.hansecom.abt.presentation.screens.home.account.payment.add.addCyberSource.l
            r0.<init>(r11)
            r10.N(r0)
        L_0x006b:
            r4 = r0
            kotlin.jvm.functions.Function1 r4 = (kotlin.jvm.functions.Function1) r4
            r10.M()
            r6 = 48
            r7 = 0
            r5 = r10
            androidx.compose.ui.viewinterop.AndroidView_androidKt.a(r2, r3, r4, r5, r6, r7)
            boolean r9 = androidx.compose.runtime.ComposerKt.P()
            if (r9 == 0) goto L_0x0081
            androidx.compose.runtime.ComposerKt.X()
        L_0x0081:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.account.payment.add.addCyberSource.AddPaymentMethodCyberSourceScreenKt$WebViewCardInfo$1$2.e(androidx.compose.animation.AnimatedVisibilityScope, androidx.compose.runtime.Composer, int):void");
    }
}
