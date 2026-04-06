package com.hansecom.abt.presentation.screens.home;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import com.hansecom.abt.R;
import com.hansecom.abt.ui.components.circleIcons.CircleIconKt;
import com.hansecom.abt.ui.components.circleIcons.CircleIconStyle;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
/* renamed from: com.hansecom.abt.presentation.screens.home.ComposableSingletons$HomeScreenKt$lambda-1$1  reason: invalid class name */
public final class ComposableSingletons$HomeScreenKt$lambda1$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public static final ComposableSingletons$HomeScreenKt$lambda1$1 f34964z = new ComposableSingletons$HomeScreenKt$lambda1$1();

    public final void b(Composer composer, int i2) {
        if ((i2 & 3) != 2 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(966615341, i2, -1, "com.hansecom.abt.presentation.screens.home.ComposableSingletons$HomeScreenKt.lambda-1.<anonymous> (HomeScreen.kt:137)");
            }
            CircleIconKt.b(new CircleIconStyle.Type.Informative((CircleIconStyle.Size) null, 1, (DefaultConstructorMarker) null), (Modifier) null, R.drawable.G, composer, 0, 2);
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
