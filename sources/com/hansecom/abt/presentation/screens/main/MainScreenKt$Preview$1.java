package com.hansecom.abt.presentation.screens.main;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.hansecom.abt.presentation.screens.main.Main;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowKt;

@Metadata
final class MainScreenKt$Preview$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Main.State f37570z;

    public final void b(Composer composer, int i2) {
        if ((i2 & 3) != 2 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-1156098446, i2, -1, "com.hansecom.abt.presentation.screens.main.Preview.<anonymous> (MainScreen.kt:212)");
            }
            MainScreenKt.m(this.f37570z, (Function1) null, FlowKt.A(), composer, 0, 2);
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
