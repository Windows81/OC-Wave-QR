package com.hansecom.abt.presentation.screens.home.faremedia.convertToVirtual;

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
/* renamed from: com.hansecom.abt.presentation.screens.home.faremedia.convertToVirtual.ComposableSingletons$ConvertToVirtualCardDialogKt$lambda-1$1  reason: invalid class name */
public final class ComposableSingletons$ConvertToVirtualCardDialogKt$lambda1$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public static final ComposableSingletons$ConvertToVirtualCardDialogKt$lambda1$1 f36651z = new ComposableSingletons$ConvertToVirtualCardDialogKt$lambda1$1();

    public final void b(Composer composer, int i2) {
        if ((i2 & 3) != 2 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(2097406410, i2, -1, "com.hansecom.abt.presentation.screens.home.faremedia.convertToVirtual.ComposableSingletons$ConvertToVirtualCardDialogKt.lambda-1.<anonymous> (ConvertToVirtualCardDialog.kt:49)");
            }
            CircleIconKt.b(new CircleIconStyle.Type.Informative((CircleIconStyle.Size) null, 1, (DefaultConstructorMarker) null), (Modifier) null, R.drawable.f33017s, composer, 0, 2);
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
