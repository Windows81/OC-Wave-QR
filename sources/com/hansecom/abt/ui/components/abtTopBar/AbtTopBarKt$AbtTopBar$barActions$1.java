package com.hansecom.abt.ui.components.abtTopBar;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class AbtTopBarKt$AbtTopBar$barActions$1 implements Function3<RowScope, Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function3 f37936z;

    public AbtTopBarKt$AbtTopBar$barActions$1(Function3 function3) {
        this.f37936z = function3;
    }

    public final void b(RowScope rowScope, Composer composer, int i2) {
        Intrinsics.i(rowScope, "<this>");
        if ((i2 & 6) == 0) {
            i2 |= composer.W(rowScope) ? 4 : 2;
        }
        if ((i2 & 19) != 18 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-1995607443, i2, -1, "com.hansecom.abt.ui.components.abtTopBar.AbtTopBar.<anonymous> (AbtTopBar.kt:47)");
            }
            this.f37936z.d(rowScope, composer, Integer.valueOf(i2 & 14));
            SpacerKt.a(SizeKt.y(Modifier.f15489d, Dp.m((float) 12)), composer, 6);
            if (ComposerKt.P()) {
                ComposerKt.X();
                return;
            }
            return;
        }
        composer.B();
    }

    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        b((RowScope) obj, (Composer) obj2, ((Number) obj3).intValue());
        return Unit.f40552a;
    }
}
