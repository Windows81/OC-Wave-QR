package com.hansecom.abt.presentation.screens.payment;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.text.TextAutoSize;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import com.hansecom.abt.R;
import com.hansecom.abt.ui.theme.AbtTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata
/* renamed from: com.hansecom.abt.presentation.screens.payment.ComposableSingletons$ChoosePaymentMethodScreenKt$lambda-1$1  reason: invalid class name */
public final class ComposableSingletons$ChoosePaymentMethodScreenKt$lambda1$1 implements Function3<LazyItemScope, Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public static final ComposableSingletons$ChoosePaymentMethodScreenKt$lambda1$1 f37789z = new ComposableSingletons$ChoosePaymentMethodScreenKt$lambda1$1();

    public final void b(LazyItemScope lazyItemScope, Composer composer, int i2) {
        Composer composer2 = composer;
        int i3 = i2;
        Intrinsics.i(lazyItemScope, "$this$item");
        if ((i3 & 17) != 16 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-71554998, i3, -1, "com.hansecom.abt.presentation.screens.payment.ComposableSingletons$ChoosePaymentMethodScreenKt.lambda-1.<anonymous> (ChoosePaymentMethodScreen.kt:111)");
            }
            Modifier.Companion companion = Modifier.f15489d;
            Modifier h2 = SizeKt.h(companion, 0.0f, 1, (Object) null);
            String b2 = StringResources_androidKt.b(R.string.h3, composer2, 0);
            AbtTheme abtTheme = AbtTheme.f38851a;
            TextKt.j(b2, h2, abtTheme.b(composer2, 6).q(), (TextAutoSize) null, 0, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0, (TextDecoration) null, (TextAlign) null, 0, 0, false, 0, 0, (Function1) null, abtTheme.d(composer2, 6).f(), composer, 48, 0, 131064);
            SpacerKt.a(SizeKt.i(companion, Dp.m((float) 12)), composer, 6);
            if (ComposerKt.P()) {
                ComposerKt.X();
                return;
            }
            return;
        }
        composer.B();
    }

    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        b((LazyItemScope) obj, (Composer) obj2, ((Number) obj3).intValue());
        return Unit.f40552a;
    }
}
