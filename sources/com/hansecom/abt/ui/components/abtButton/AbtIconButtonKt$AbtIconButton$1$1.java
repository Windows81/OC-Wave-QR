package com.hansecom.abt.ui.components.abtButton;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.IconKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata
public final class AbtIconButtonKt$AbtIconButton$1$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ String f37886A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Painter f37887z;

    public AbtIconButtonKt$AbtIconButton$1$1(Painter painter, String str) {
        this.f37887z = painter;
        this.f37886A = str;
    }

    public final void b(Composer composer, int i2) {
        if ((i2 & 3) != 2 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(280181834, i2, -1, "com.hansecom.abt.ui.components.abtButton.AbtIconButton.<anonymous>.<anonymous> (AbtIconButton.kt:61)");
            }
            IconKt.d(this.f37887z, this.f37886A, SizeKt.t(Modifier.f15489d, Dp.m((float) 18)), 0, composer, 384, 8);
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
