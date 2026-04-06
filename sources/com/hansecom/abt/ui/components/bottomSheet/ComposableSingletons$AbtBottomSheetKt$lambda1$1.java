package com.hansecom.abt.ui.components.bottomSheet;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.IconKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.unit.Dp;
import com.hansecom.abt.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata
/* renamed from: com.hansecom.abt.ui.components.bottomSheet.ComposableSingletons$AbtBottomSheetKt$lambda-1$1  reason: invalid class name */
public final class ComposableSingletons$AbtBottomSheetKt$lambda1$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public static final ComposableSingletons$AbtBottomSheetKt$lambda1$1 f38031z = new ComposableSingletons$AbtBottomSheetKt$lambda1$1();

    public final void b(Composer composer, int i2) {
        if ((i2 & 3) != 2 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-1467021646, i2, -1, "com.hansecom.abt.ui.components.bottomSheet.ComposableSingletons$AbtBottomSheetKt.lambda-1.<anonymous> (AbtBottomSheet.kt:119)");
            }
            IconKt.d(PainterResources_androidKt.c(R.drawable.f33016r, composer, 0), "Close", SizeKt.t(Modifier.f15489d, Dp.m((float) 24)), 0, composer, 432, 8);
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
