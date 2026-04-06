package com.hansecom.abt.util;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.WindowInfo;
import androidx.compose.ui.unit.Constraints;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class ModifierExtKt {
    public static final Modifier c(Modifier modifier, Composer composer, int i2) {
        Intrinsics.i(modifier, "<this>");
        composer.X(-1121927229);
        if (ComposerKt.P()) {
            ComposerKt.Y(-1121927229, i2, -1, "com.hansecom.abt.util.ignoreParentHorizontalPadding (ModifierExt.kt:8)");
        }
        int a2 = (int) (((WindowInfo) composer.C(CompositionLocalsKt.u())).a() >> 32);
        composer.X(-1495883410);
        boolean i3 = composer.i(a2);
        Object g2 = composer.g();
        if (i3 || g2 == Composer.f14567a.a()) {
            g2 = new h(a2);
            composer.N(g2);
        }
        composer.M();
        Modifier a3 = LayoutModifierKt.a(modifier, (Function3) g2);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        composer.M();
        return a3;
    }

    public static final MeasureResult d(int i2, MeasureScope measureScope, Measurable measurable, Constraints constraints) {
        Intrinsics.i(measureScope, "$this$layout");
        Intrinsics.i(measurable, "measurable");
        Placeable c0 = measurable.c0(Constraints.d(constraints.r(), 0, i2, 0, 0, 13, (Object) null));
        return MeasureScope.R1(measureScope, c0.L0(), c0.C0(), (Map) null, new i(c0), 4, (Object) null);
    }

    public static final Unit e(Placeable placeable, Placeable.PlacementScope placementScope) {
        Intrinsics.i(placementScope, "$this$layout");
        Placeable.PlacementScope.j(placementScope, placeable, 0, 0, 0.0f, 4, (Object) null);
        return Unit.f40552a;
    }
}
