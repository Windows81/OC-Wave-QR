package com.hansecom.abt.presentation.screens.home.barcode.help;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

@Metadata
/* renamed from: com.hansecom.abt.presentation.screens.home.barcode.help.ComposableSingletons$BarcodeDisplayHelpScreenKt$lambda-2$1  reason: invalid class name */
public final class ComposableSingletons$BarcodeDisplayHelpScreenKt$lambda2$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public static final ComposableSingletons$BarcodeDisplayHelpScreenKt$lambda2$1 f35870z = new ComposableSingletons$BarcodeDisplayHelpScreenKt$lambda2$1();

    /* access modifiers changed from: private */
    public static final Unit e() {
        return Unit.f40552a;
    }

    public final void c(Composer composer, int i2) {
        if ((i2 & 3) != 2 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-514324564, i2, -1, "com.hansecom.abt.presentation.screens.home.barcode.help.ComposableSingletons$BarcodeDisplayHelpScreenKt.lambda-2.<anonymous> (BarcodeDisplayHelpScreen.kt:92)");
            }
            composer.X(-2122869059);
            Object g2 = composer.g();
            if (g2 == Composer.f14567a.a()) {
                g2 = new c();
                composer.N(g2);
            }
            composer.M();
            BarcodeDisplayHelpScreenKt.e((Function0) g2, composer, 6);
            if (ComposerKt.P()) {
                ComposerKt.X();
                return;
            }
            return;
        }
        composer.B();
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        c((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
