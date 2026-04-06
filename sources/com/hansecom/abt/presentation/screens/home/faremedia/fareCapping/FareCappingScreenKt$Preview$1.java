package com.hansecom.abt.presentation.screens.home.faremedia.fareCapping;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.hansecom.abt.presentation.screens.home.faremedia.fareCapping.FareCapping;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;

@Metadata
final class FareCappingScreenKt$Preview$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ FareCapping.State f36731z;

    public static final Unit e(FareCapping.Action action) {
        Intrinsics.i(action, "it");
        return Unit.f40552a;
    }

    public final void c(Composer composer, int i2) {
        if ((i2 & 3) != 2 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-862438261, i2, -1, "com.hansecom.abt.presentation.screens.home.faremedia.fareCapping.Preview.<anonymous> (FareCappingScreen.kt:188)");
            }
            FareCapping.State state = this.f36731z;
            composer.X(-393078525);
            Object g2 = composer.g();
            if (g2 == Composer.f14567a.a()) {
                g2 = new g();
                composer.N(g2);
            }
            composer.M();
            FareCappingScreenKt.l(state, (Function1) g2, FlowKt.A(), composer, 48, 0);
            if (ComposerKt.P()) {
                ComposerKt.X();
                return;
            }
            return;
        }
        composer.B();
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        c((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
