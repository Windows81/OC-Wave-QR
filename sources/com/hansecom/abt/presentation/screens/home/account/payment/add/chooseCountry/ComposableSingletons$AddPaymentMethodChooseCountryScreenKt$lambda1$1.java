package com.hansecom.abt.presentation.screens.home.account.payment.add.chooseCountry;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmi;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ExtensionsKt;

@Metadata
/* renamed from: com.hansecom.abt.presentation.screens.home.account.payment.add.chooseCountry.ComposableSingletons$AddPaymentMethodChooseCountryScreenKt$lambda-1$1  reason: invalid class name */
public final class ComposableSingletons$AddPaymentMethodChooseCountryScreenKt$lambda1$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public static final ComposableSingletons$AddPaymentMethodChooseCountryScreenKt$lambda1$1 f35722z = new ComposableSingletons$AddPaymentMethodChooseCountryScreenKt$lambda1$1();

    public static final Unit f(AddPaymentMethodNmi.Action.ChooseCountry chooseCountry) {
        Intrinsics.i(chooseCountry, "it");
        return Unit.f40552a;
    }

    /* access modifiers changed from: private */
    public static final Unit g() {
        return Unit.f40552a;
    }

    public final void e(Composer composer, int i2) {
        if ((i2 & 3) != 2 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(977342226, i2, -1, "com.hansecom.abt.presentation.screens.home.account.payment.add.chooseCountry.ComposableSingletons$AddPaymentMethodChooseCountryScreenKt.lambda-1.<anonymous> (AddPaymentMethodChooseCountryScreen.kt:105)");
            }
            AddPaymentMethodNmi.State.ChooseCountry chooseCountry = new AddPaymentMethodNmi.State.ChooseCountry(ExtensionsKt.b("Portugal", "Spain"), (String) null, 2, (DefaultConstructorMarker) null);
            composer.X(-1515002880);
            Object g2 = composer.g();
            Composer.Companion companion = Composer.f14567a;
            if (g2 == companion.a()) {
                g2 = new f();
                composer.N(g2);
            }
            Function1 function1 = (Function1) g2;
            composer.M();
            composer.X(-1515002144);
            Object g3 = composer.g();
            if (g3 == companion.a()) {
                g3 = new g();
                composer.N(g3);
            }
            composer.M();
            AddPaymentMethodChooseCountryScreenKt.h(chooseCountry, function1, (Function0) g3, composer, 432);
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
