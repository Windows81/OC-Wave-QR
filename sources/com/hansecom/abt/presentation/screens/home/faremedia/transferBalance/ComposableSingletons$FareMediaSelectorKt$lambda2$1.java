package com.hansecom.abt.presentation.screens.home.faremedia.transferBalance;

import androidx.compose.foundation.layout.PaddingKt;
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
/* renamed from: com.hansecom.abt.presentation.screens.home.faremedia.transferBalance.ComposableSingletons$FareMediaSelectorKt$lambda-2$1  reason: invalid class name */
public final class ComposableSingletons$FareMediaSelectorKt$lambda2$1 implements Function3<LazyItemScope, Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public static final ComposableSingletons$FareMediaSelectorKt$lambda2$1 f37272z = new ComposableSingletons$FareMediaSelectorKt$lambda2$1();

    public final void b(LazyItemScope lazyItemScope, Composer composer, int i2) {
        Composer composer2 = composer;
        int i3 = i2;
        Intrinsics.i(lazyItemScope, "$this$item");
        if ((i3 & 17) != 16 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-1095375027, i3, -1, "com.hansecom.abt.presentation.screens.home.faremedia.transferBalance.ComposableSingletons$FareMediaSelectorKt.lambda-2.<anonymous> (FareMediaSelector.kt:130)");
            }
            TextKt.j(StringResources_androidKt.b(R.string.a3, composer2, 0), PaddingKt.m(Modifier.f15489d, 0.0f, 0.0f, 0.0f, Dp.m((float) 8), 7, (Object) null), 0, (TextAutoSize) null, 0, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0, (TextDecoration) null, (TextAlign) null, 0, 0, false, 0, 0, (Function1) null, AbtTheme.f38851a.d(composer2, 6).f(), composer, 48, 0, 131068);
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
