package com.hansecom.abt.presentation.screens.home.faremedia.instituitions.details;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import com.hansecom.abt.ui.components.circleIcons.CircleIconKt;
import com.hansecom.abt.ui.components.circleIcons.CircleIconStyle;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
/* renamed from: com.hansecom.abt.presentation.screens.home.faremedia.instituitions.details.ComposableSingletons$InstitutionDetailsScreenKt$lambda-1$1  reason: invalid class name */
public final class ComposableSingletons$InstitutionDetailsScreenKt$lambda1$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public static final ComposableSingletons$InstitutionDetailsScreenKt$lambda1$1 f36824z = new ComposableSingletons$InstitutionDetailsScreenKt$lambda1$1();

    public final void b(Composer composer, int i2) {
        if ((i2 & 3) != 2 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(139983812, i2, -1, "com.hansecom.abt.presentation.screens.home.faremedia.instituitions.details.ComposableSingletons$InstitutionDetailsScreenKt.lambda-1.<anonymous> (InstitutionDetailsScreen.kt:91)");
            }
            CircleIconKt.b(new CircleIconStyle.Type.Warning((CircleIconStyle.Size) null, 1, (DefaultConstructorMarker) null), (Modifier) null, 0, composer, 0, 6);
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
