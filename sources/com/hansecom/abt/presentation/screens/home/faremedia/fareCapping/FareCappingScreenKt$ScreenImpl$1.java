package com.hansecom.abt.presentation.screens.home.faremedia.fareCapping;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.hansecom.abt.presentation.screens.home.faremedia.fareCapping.FareCapping;
import com.hansecom.abt.ui.components.loading.LoadingContentKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

@Metadata
public final class FareCappingScreenKt$ScreenImpl$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f36732A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ FareCapping.State f36733z;

    public FareCappingScreenKt$ScreenImpl$1(FareCapping.State state, Function1 function1) {
        this.f36733z = state;
        this.f36732A = function1;
    }

    public final void b(Composer composer, int i2) {
        if ((i2 & 3) != 2 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-479271285, i2, -1, "com.hansecom.abt.presentation.screens.home.faremedia.fareCapping.ScreenImpl.<anonymous> (FareCappingScreen.kt:63)");
            }
            if (this.f36733z.f()) {
                composer.X(713632617);
                LoadingContentKt.b(composer, 0);
                composer.M();
            } else {
                composer.X(713678435);
                FareCappingScreenKt.f(this.f36733z, this.f36732A, composer, 0);
                composer.M();
            }
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
