package com.hansecom.abt.presentation.screens.home.faremedia.autoload;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.hansecom.abt.presentation.screens.home.faremedia.autoload.Autoload;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

@Metadata
final class AutoloadScreenKt$Preview$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Autoload.State f36233z;

    public static final Unit f(Autoload.Action action) {
        Intrinsics.i(action, "it");
        return Unit.f40552a;
    }

    public static final Unit g(Long l2) {
        return Unit.f40552a;
    }

    public final void e(Composer composer, int i2) {
        if ((i2 & 3) != 2 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(1284626909, i2, -1, "com.hansecom.abt.presentation.screens.home.faremedia.autoload.Preview.<anonymous> (AutoloadScreen.kt:356)");
            }
            Autoload.State state = this.f36233z;
            composer.X(-171913858);
            Object g2 = composer.g();
            Composer.Companion companion = Composer.f14567a;
            if (g2 == companion.a()) {
                g2 = new h();
                composer.N(g2);
            }
            Function1 function1 = (Function1) g2;
            composer.M();
            Flow A2 = FlowKt.A();
            composer.X(-171911585);
            Object g3 = composer.g();
            if (g3 == companion.a()) {
                g3 = new i();
                composer.N(g3);
            }
            composer.M();
            AutoloadScreenKt.s(state, function1, A2, (Function1) g3, composer, 3120);
            if (ComposerKt.P()) {
                ComposerKt.X();
                return;
            }
            return;
        }
        composer.B();
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        e((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
