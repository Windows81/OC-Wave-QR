package com.hansecom.abt.ui.webView;

import android.content.Context;
import android.net.Uri;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class LocalWebViewScreenKt {
    public static final void b(String str, Uri uri, Function0 function0, Composer composer, int i2, int i3) {
        int i4;
        String str2;
        String str3;
        Uri uri2 = uri;
        Function0 function02 = function0;
        int i5 = i2;
        Intrinsics.i(uri2, "uri");
        Intrinsics.i(function02, "onUp");
        Composer q2 = composer.q(1158241434);
        int i6 = i3 & 1;
        if (i6 != 0) {
            i4 = i5 | 6;
            str2 = str;
        } else if ((i5 & 6) == 0) {
            str2 = str;
            i4 = (q2.W(str2) ? 4 : 2) | i5;
        } else {
            str2 = str;
            i4 = i5;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i5 & 48) == 0) {
            i4 |= q2.l(uri2) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i5 & 384) == 0) {
            i4 |= q2.l(function02) ? 256 : 128;
        }
        if ((i4 & 147) != 146 || !q2.t()) {
            String str4 = i6 != 0 ? null : str2;
            if (ComposerKt.P()) {
                ComposerKt.Y(1158241434, i4, -1, "com.hansecom.abt.ui.webView.LocalWebViewScreen (LocalWebViewScreen.kt:23)");
            }
            str3 = str4;
            ScaffoldKt.f((Modifier) null, ComposableLambdaKt.e(-654074786, true, new LocalWebViewScreenKt$LocalWebViewScreen$1(str4, function02), q2, 54), (Function2) null, (Function2) null, (Function2) null, 0, 0, 0, (WindowInsets) null, ComposableLambdaKt.e(931767657, true, new LocalWebViewScreenKt$LocalWebViewScreen$2((Context) q2.C(AndroidCompositionLocals_androidKt.g()), uri2), q2, 54), q2, 805306416, 509);
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
            str3 = str2;
        }
        ScopeUpdateScope x2 = q2.x();
        if (x2 != null) {
            x2.a(new a(str3, uri, function0, i2, i3));
        }
    }

    public static final Unit c(String str, Uri uri, Function0 function0, int i2, int i3, Composer composer, int i4) {
        b(str, uri, function0, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }
}
