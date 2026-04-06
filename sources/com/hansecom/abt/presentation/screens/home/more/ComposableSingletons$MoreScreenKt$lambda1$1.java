package com.hansecom.abt.presentation.screens.home.more;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import com.hansecom.abt.R;
import com.hansecom.abt.ui.components.screenHeader.ScreenHeaderKt;
import com.hansecom.abt.ui.theme.AbtTheme;
import com.hansecom.abt.ui.theme.Dimensions;
import com.hansecom.abt.util.resourcesResolvers.StringResourceKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata
/* renamed from: com.hansecom.abt.presentation.screens.home.more.ComposableSingletons$MoreScreenKt$lambda-1$1  reason: invalid class name */
public final class ComposableSingletons$MoreScreenKt$lambda1$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public static final ComposableSingletons$MoreScreenKt$lambda1$1 f37415z = new ComposableSingletons$MoreScreenKt$lambda1$1();

    public final void b(Composer composer, int i2) {
        if ((i2 & 3) != 2 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(690979286, i2, -1, "com.hansecom.abt.presentation.screens.home.more.ComposableSingletons$MoreScreenKt.lambda-1.<anonymous> (MoreScreen.kt:82)");
            }
            Modifier k2 = PaddingKt.k(WindowInsetsPadding_androidKt.b(Modifier.f15489d), Dimensions.f38856a.c(), 0.0f, 2, (Object) null);
            AbtTheme abtTheme = AbtTheme.f38851a;
            ScreenHeaderKt.b(k2, (PaddingValues) null, abtTheme.b(composer, 6).o(), abtTheme.b(composer, 6).o(), StringResourceKt.a(R.string.f7, new Object[0], composer, 0), StringResourceKt.a(R.string.g7, new Object[0], composer, 0), true, composer, 1572864, 2);
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
