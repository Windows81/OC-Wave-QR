package com.hansecom.abt.presentation.screens.home.faremedia.unlockCard;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.hansecom.abt.presentation.screens.home.faremedia.unlockCard.FareMediaUnlockCard;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

@Metadata
final class FareMediaUnlockCardDialogKt$Preview$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ FareMediaUnlockCard.State f37375z;

    public static final Unit g(FareMediaUnlockCard.Action action) {
        Intrinsics.i(action, "it");
        return Unit.f40552a;
    }

    /* access modifiers changed from: private */
    public static final Unit h() {
        return Unit.f40552a;
    }

    /* access modifiers changed from: private */
    public static final Unit i() {
        return Unit.f40552a;
    }

    public final void f(Composer composer, int i2) {
        if ((i2 & 3) != 2 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-1850246915, i2, -1, "com.hansecom.abt.presentation.screens.home.faremedia.unlockCard.Preview.<anonymous> (FareMediaUnlockCardDialog.kt:98)");
            }
            FareMediaUnlockCard.State state = this.f37375z;
            composer.X(-1159457667);
            Object g2 = composer.g();
            Composer.Companion companion = Composer.f14567a;
            if (g2 == companion.a()) {
                g2 = new d();
                composer.N(g2);
            }
            Function1 function1 = (Function1) g2;
            composer.M();
            Flow A2 = FlowKt.A();
            composer.X(-1159455651);
            Object g3 = composer.g();
            if (g3 == companion.a()) {
                g3 = new e();
                composer.N(g3);
            }
            Function0 function0 = (Function0) g3;
            composer.M();
            composer.X(-1159454755);
            Object g4 = composer.g();
            if (g4 == companion.a()) {
                g4 = new f();
                composer.N(g4);
            }
            composer.M();
            FareMediaUnlockCardDialogKt.d(state, function1, A2, function0, (Function0) g4, composer, 27696);
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
