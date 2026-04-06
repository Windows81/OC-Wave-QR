package com.hansecom.abt.ui.webView;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import com.hansecom.abt.ui.components.abtTopBar.AbtTopBarKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

@Metadata
public final class WebViewScreenKt$WebViewScreen$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function0 f38981A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ String f38982z;

    public WebViewScreenKt$WebViewScreen$1(String str, Function0 function0) {
        this.f38982z = str;
        this.f38981A = function0;
    }

    public final void b(Composer composer, int i2) {
        if ((i2 & 3) != 2 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-1013233592, i2, -1, "com.hansecom.abt.ui.webView.WebViewScreen.<anonymous> (WebViewScreen.kt:47)");
            }
            AbtTopBarKt.b(this.f38982z, SizeKt.h(Modifier.f15489d, 0.0f, 1, (Object) null), this.f38981A, (Function3) null, false, composer, 48, 24);
            if (ComposerKt.P()) {
                ComposerKt.X();
                return;
            }
            return;
        }
        composer.B();
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
