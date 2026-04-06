package com.hansecom.abt.ui.components.abtTopBar;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

@Metadata
/* renamed from: com.hansecom.abt.ui.components.abtTopBar.ComposableSingletons$AbtTopBarKt$lambda-2$1  reason: invalid class name */
public final class ComposableSingletons$AbtTopBarKt$lambda2$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public static final ComposableSingletons$AbtTopBarKt$lambda2$1 f37944z = new ComposableSingletons$AbtTopBarKt$lambda2$1();

    /* access modifiers changed from: private */
    public static final Unit e() {
        return Unit.f40552a;
    }

    public final void c(Composer composer, int i2) {
        if ((i2 & 3) != 2 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(906036127, i2, -1, "com.hansecom.abt.ui.components.abtTopBar.ComposableSingletons$AbtTopBarKt.lambda-2.<anonymous> (AbtTopBar.kt:86)");
            }
            Modifier h2 = SizeKt.h(Modifier.f15489d, 0.0f, 1, (Object) null);
            composer.X(554236211);
            Object g2 = composer.g();
            if (g2 == Composer.f14567a.a()) {
                g2 = new b();
                composer.N(g2);
            }
            composer.M();
            AbtTopBarKt.b("title", h2, (Function0) g2, (Function3) null, false, composer, 25014, 8);
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
