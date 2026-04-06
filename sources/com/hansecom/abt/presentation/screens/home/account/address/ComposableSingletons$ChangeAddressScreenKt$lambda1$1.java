package com.hansecom.abt.presentation.screens.home.account.address;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.hansecom.abt.presentation.screens.home.account.address.ChangeAddress;
import com.hansecom.abt.util.resourcesResolvers.StringValue;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
/* renamed from: com.hansecom.abt.presentation.screens.home.account.address.ComposableSingletons$ChangeAddressScreenKt$lambda-1$1  reason: invalid class name */
public final class ComposableSingletons$ChangeAddressScreenKt$lambda1$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public static final ComposableSingletons$ChangeAddressScreenKt$lambda1$1 f35154z = new ComposableSingletons$ChangeAddressScreenKt$lambda1$1();

    public static final Unit g(ChangeAddress.Action action) {
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
        Composer composer2 = composer;
        int i3 = i2;
        if ((i3 & 3) != 2 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(555960716, i3, -1, "com.hansecom.abt.presentation.screens.home.account.address.ComposableSingletons$ChangeAddressScreenKt.lambda-1.<anonymous> (ChangeAddressScreen.kt:181)");
            }
            ChangeAddress.State state = new ChangeAddress.State((String) null, (StringValue) null, (String) null, (StringValue) null, (String) null, (StringValue) null, (String) null, (StringValue) null, (String) null, (StringValue) null, (String) null, (StringValue) null, false, false, (ChangeAddress.State.ChooseCountry) null, (ChangeAddress.State.ChooseState) null, 65535, (DefaultConstructorMarker) null);
            composer2.X(-1347066017);
            Object g2 = composer.g();
            Composer.Companion companion = Composer.f14567a;
            if (g2 == companion.a()) {
                g2 = new G();
                composer2.N(g2);
            }
            Function1 function1 = (Function1) g2;
            composer.M();
            composer2.X(-1347069632);
            Object g3 = composer.g();
            if (g3 == companion.a()) {
                g3 = new H();
                composer2.N(g3);
            }
            Function0 function0 = (Function0) g3;
            composer.M();
            composer2.X(-1347068480);
            Object g4 = composer.g();
            if (g4 == companion.a()) {
                g4 = new I();
                composer2.N(g4);
            }
            composer.M();
            ChangeAddressScreenKt.g(state, function1, function0, (Function0) g4, composer, 3504, 0);
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
