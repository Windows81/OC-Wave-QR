package com.hansecom.abt.presentation.screens.home.faremedia;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.IconKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.unit.Dp;
import com.hansecom.abt.R;
import com.hansecom.abt.ui.theme.AbtTheme;
import com.hansecom.abt.util.resourcesResolvers.StringResourceKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata
/* renamed from: com.hansecom.abt.presentation.screens.home.faremedia.ComposableSingletons$FareMediaScreenKt$lambda-4$1  reason: invalid class name */
public final class ComposableSingletons$FareMediaScreenKt$lambda4$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public static final ComposableSingletons$FareMediaScreenKt$lambda4$1 f35896z = new ComposableSingletons$FareMediaScreenKt$lambda4$1();

    public final void b(Composer composer, int i2) {
        if ((i2 & 3) != 2 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(951578389, i2, -1, "com.hansecom.abt.presentation.screens.home.faremedia.ComposableSingletons$FareMediaScreenKt.lambda-4.<anonymous> (FareMediaScreen.kt:636)");
            }
            IconKt.d(PainterResources_androidKt.c(R.drawable.f33022x, composer, 0), StringResourceKt.a(R.string.O4, new Object[0], composer, 0), SizeKt.t(Modifier.f15489d, Dp.m((float) 24)), AbtTheme.f38851a.b(composer, 6).x(), composer, 384, 0);
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
