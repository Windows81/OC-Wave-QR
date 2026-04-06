package com.hansecom.abt.presentation.screens.home.faremedia.instituitions.search;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.hansecom.abt.presentation.screens.home.faremedia.instituitions.search.InstitutionsSearch;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

@Metadata
final class InstitutionsSearchScreenKt$Preview$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ InstitutionsSearch.State f36873z;

    public static final Unit g(InstitutionsSearch.Action action) {
        Intrinsics.i(action, "it");
        return Unit.f40552a;
    }

    public static final Unit h(int i2) {
        return Unit.f40552a;
    }

    /* access modifiers changed from: private */
    public static final Unit i() {
        return Unit.f40552a;
    }

    public final void f(Composer composer, int i2) {
        if ((i2 & 3) != 2 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(557641800, i2, -1, "com.hansecom.abt.presentation.screens.home.faremedia.instituitions.search.Preview.<anonymous> (InstitutionsSearchScreen.kt:159)");
            }
            InstitutionsSearch.State state = this.f36873z;
            composer.X(-1652585947);
            Object g2 = composer.g();
            Composer.Companion companion = Composer.f14567a;
            if (g2 == companion.a()) {
                g2 = new c();
                composer.N(g2);
            }
            Function1 function1 = (Function1) g2;
            composer.M();
            Flow A2 = FlowKt.A();
            composer.X(-1652583643);
            Object g3 = composer.g();
            if (g3 == companion.a()) {
                g3 = new d();
                composer.N(g3);
            }
            Function1 function12 = (Function1) g3;
            composer.M();
            composer.X(-1652582811);
            Object g4 = composer.g();
            if (g4 == companion.a()) {
                g4 = new e();
                composer.N(g4);
            }
            composer.M();
            InstitutionsSearchScreenKt.f(state, function1, A2, function12, (Function0) g4, composer, 27696, 0);
            if (ComposerKt.P()) {
                ComposerKt.X();
                return;
            }
            return;
        }
        composer.B();
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        f((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
