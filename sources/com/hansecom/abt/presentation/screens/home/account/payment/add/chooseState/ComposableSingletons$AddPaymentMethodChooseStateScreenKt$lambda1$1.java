package com.hansecom.abt.presentation.screens.home.account.payment.add.chooseState;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmi;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ExtensionsKt;

@Metadata
/* renamed from: com.hansecom.abt.presentation.screens.home.account.payment.add.chooseState.ComposableSingletons$AddPaymentMethodChooseStateScreenKt$lambda-1$1  reason: invalid class name */
public final class ComposableSingletons$AddPaymentMethodChooseStateScreenKt$lambda1$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public static final ComposableSingletons$AddPaymentMethodChooseStateScreenKt$lambda1$1 f35746z = new ComposableSingletons$AddPaymentMethodChooseStateScreenKt$lambda1$1();

    public static final Unit f(AddPaymentMethodNmi.Action.ChooseState chooseState) {
        Intrinsics.i(chooseState, "it");
        return Unit.f40552a;
    }

    /* access modifiers changed from: private */
    public static final Unit g() {
        return Unit.f40552a;
    }

    public final void e(Composer composer, int i2) {
        if ((i2 & 3) != 2 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(713311474, i2, -1, "com.hansecom.abt.presentation.screens.home.account.payment.add.chooseState.ComposableSingletons$AddPaymentMethodChooseStateScreenKt.lambda-1.<anonymous> (AddPaymentMethodChooseStateScreen.kt:112)");
            }
            AddPaymentMethodNmi.State.ChooseState chooseState = new AddPaymentMethodNmi.State.ChooseState(ExtensionsKt.b("Portugal", "Spain"), "");
            composer.X(-1994721920);
            Object g2 = composer.g();
            Composer.Companion companion = Composer.f14567a;
            if (g2 == companion.a()) {
                g2 = new f();
                composer.N(g2);
            }
            Function1 function1 = (Function1) g2;
            composer.M();
            composer.X(-1994721184);
            Object g3 = composer.g();
            if (g3 == companion.a()) {
                g3 = new g();
                composer.N(g3);
            }
            composer.M();
            AddPaymentMethodChooseStateScreenKt.h(chooseState, function1, (Function0) g3, composer, 432);
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
