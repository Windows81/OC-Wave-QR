package com.hansecom.abt.presentation.screens.main;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.hansecom.abt.presentation.screens.home.barcode.help.BarcodeDisplayHelpScreenKt;
import com.hansecom.abt.util.CallDeviceOnBackButtonKt;
import com.hansecom.abt.util.LaunchTracingKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata
/* renamed from: com.hansecom.abt.presentation.screens.main.ComposableSingletons$MainNavigationKt$lambda-3$1  reason: invalid class name */
public final class ComposableSingletons$MainNavigationKt$lambda3$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public static final ComposableSingletons$MainNavigationKt$lambda3$1 f37532z = new ComposableSingletons$MainNavigationKt$lambda3$1();

    public final void b(Composer composer, int i2) {
        if ((i2 & 3) != 2 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-1868887170, i2, -1, "com.hansecom.abt.presentation.screens.main.ComposableSingletons$MainNavigationKt.lambda-3.<anonymous> (MainNavigation.kt:117)");
            }
            LaunchTracingKt.c("BarcodeDisplayHelpScreen", composer, 6);
            BarcodeDisplayHelpScreenKt.c(CallDeviceOnBackButtonKt.b(composer, 0), composer, 0);
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
