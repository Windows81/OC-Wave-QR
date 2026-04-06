package com.hansecom.abt.presentation.screens.home.account.address.chooseCountry;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.hansecom.abt.presentation.screens.home.account.address.ChangeAddress;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ExtensionsKt;

@Metadata
/* renamed from: com.hansecom.abt.presentation.screens.home.account.address.chooseCountry.ComposableSingletons$ChangeAddressChooseCountryScreenKt$lambda-1$1  reason: invalid class name */
public final class ComposableSingletons$ChangeAddressChooseCountryScreenKt$lambda1$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public static final ComposableSingletons$ChangeAddressChooseCountryScreenKt$lambda1$1 f35173z = new ComposableSingletons$ChangeAddressChooseCountryScreenKt$lambda1$1();

    public static final Unit e(ChangeAddress.Action.ChooseCountry chooseCountry) {
        Intrinsics.i(chooseCountry, "it");
        return Unit.f40552a;
    }

    public final void c(Composer composer, int i2) {
        if ((i2 & 3) != 2 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(1200737909, i2, -1, "com.hansecom.abt.presentation.screens.home.account.address.chooseCountry.ComposableSingletons$ChangeAddressChooseCountryScreenKt.lambda-1.<anonymous> (ChangeAddressChooseCountryScreen.kt:99)");
            }
            ChangeAddress.State.ChooseCountry chooseCountry = new ChangeAddress.State.ChooseCountry(ExtensionsKt.b("Portugal", "Spain"), (String) null, 2, (DefaultConstructorMarker) null);
            composer.X(644534363);
            Object g2 = composer.g();
            if (g2 == Composer.f14567a.a()) {
                g2 = new f();
                composer.N(g2);
            }
            composer.M();
            ChangeAddressChooseCountryScreenKt.h(chooseCountry, (Function1) g2, composer, 48);
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
