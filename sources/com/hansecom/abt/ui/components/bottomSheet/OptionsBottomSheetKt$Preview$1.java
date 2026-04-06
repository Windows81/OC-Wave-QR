package com.hansecom.abt.ui.components.bottomSheet;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.hansecom.abt.presentation.model.FareMediaState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

@Metadata
final class OptionsBottomSheetKt$Preview$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ImmutableList f38048z;

    public static final Object h(FareMediaState fareMediaState) {
        Intrinsics.i(fareMediaState, "it");
        return fareMediaState.m();
    }

    public static final String i(FareMediaState fareMediaState) {
        Intrinsics.i(fareMediaState, "it");
        return fareMediaState.a();
    }

    public static final Unit k(FareMediaState fareMediaState) {
        Intrinsics.i(fareMediaState, "it");
        return Unit.f40552a;
    }

    /* access modifiers changed from: private */
    public static final Unit p() {
        return Unit.f40552a;
    }

    public final void g(Composer composer, int i2) {
        if ((i2 & 3) != 2 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-1088856464, i2, -1, "com.hansecom.abt.ui.components.bottomSheet.Preview.<anonymous> (OptionsBottomSheet.kt:156)");
            }
            ImmutableList immutableList = this.f38048z;
            composer.X(-751952842);
            Object g2 = composer.g();
            Composer.Companion companion = Composer.f14567a;
            if (g2 == companion.a()) {
                g2 = new l();
                composer.N(g2);
            }
            Function1 function1 = (Function1) g2;
            composer.M();
            composer.X(-751951719);
            Object g3 = composer.g();
            if (g3 == companion.a()) {
                g3 = new m();
                composer.N(g3);
            }
            Function1 function12 = (Function1) g3;
            composer.M();
            composer.X(-751950417);
            Object g4 = composer.g();
            if (g4 == companion.a()) {
                g4 = new n();
                composer.N(g4);
            }
            Function1 function13 = (Function1) g4;
            composer.M();
            composer.X(-751955473);
            Object g5 = composer.g();
            if (g5 == companion.a()) {
                g5 = new o();
                composer.N(g5);
            }
            composer.M();
            OptionsBottomSheetKt.h("Title", immutableList, function1, function12, function13, true, (Function0) g5, composer, 1797510);
            if (ComposerKt.P()) {
                ComposerKt.X();
                return;
            }
            return;
        }
        composer.B();
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        g((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
