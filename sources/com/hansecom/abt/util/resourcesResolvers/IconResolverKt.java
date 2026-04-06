package com.hansecom.abt.util.resourcesResolvers;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.res.PainterResources_androidKt;
import kotlin.Metadata;

@Metadata
public final class IconResolverKt {

    /* renamed from: a  reason: collision with root package name */
    public static final ProvidableCompositionLocal f39085a = CompositionLocalKt.j(new b());

    public static final IconResolver b() {
        throw new IllegalStateException("CompositionLocal IconResolver not present");
    }

    public static final ProvidableCompositionLocal c() {
        return f39085a;
    }

    public static final Painter d(String str, Composer composer, int i2) {
        composer.X(-805813224);
        if (ComposerKt.P()) {
            ComposerKt.Y(-805813224, i2, -1, "com.hansecom.abt.util.resourcesResolvers.resolveIcon (IconResolver.kt:42)");
        }
        int a2 = ((IconResolver) composer.C(f39085a)).a(str);
        Painter c2 = a2 != 0 ? PainterResources_androidKt.c(a2, composer, 0) : null;
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        composer.M();
        return c2;
    }
}
