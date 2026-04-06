package com.hansecom.abt.ui.components.formFields;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.res.StringResources_androidKt;
import com.hansecom.abt.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata
/* renamed from: com.hansecom.abt.ui.components.formFields.ComposableSingletons$CardNumberFieldKt$lambda-1$1  reason: invalid class name */
public final class ComposableSingletons$CardNumberFieldKt$lambda1$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public static final ComposableSingletons$CardNumberFieldKt$lambda1$1 f38283z = new ComposableSingletons$CardNumberFieldKt$lambda1$1();

    public static final Unit e(String str) {
        Intrinsics.i(str, "it");
        return Unit.f40552a;
    }

    public final void c(Composer composer, int i2) {
        Composer composer2 = composer;
        int i3 = i2;
        if ((i3 & 3) != 2 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(323939695, i3, -1, "com.hansecom.abt.ui.components.formFields.ComposableSingletons$CardNumberFieldKt.lambda-1.<anonymous> (CardNumberField.kt:67)");
            }
            composer2.X(-33149650);
            Object g2 = composer.g();
            if (g2 == Composer.f14567a.a()) {
                g2 = new C0650q();
                composer2.N(g2);
            }
            composer.M();
            CardNumberFieldKt.b("4111111", (Function1) g2, 20, StringResources_androidKt.b(R.string.c0, composer2, 0), "", (Modifier) null, (String) null, "https://secure.networkmerchants.com/shared/images/brand-visa.png", false, 0, (FocusRequester) null, composer, 12607926, 0, 1888);
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
