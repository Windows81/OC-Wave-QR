package com.hansecom.abt.presentation.screens.home.faremedia.passes;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.unit.Dp;
import com.hansecom.abt.R;
import com.hansecom.abt.ui.components.screenHeader.ScreenHeaderKt;
import com.hansecom.abt.ui.theme.Dimensions;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata
/* renamed from: com.hansecom.abt.presentation.screens.home.faremedia.passes.ComposableSingletons$FareMediaPassesScreenKt$lambda-1$1  reason: invalid class name */
public final class ComposableSingletons$FareMediaPassesScreenKt$lambda1$1 implements Function3<LazyItemScope, Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public static final ComposableSingletons$FareMediaPassesScreenKt$lambda1$1 f36985z = new ComposableSingletons$FareMediaPassesScreenKt$lambda1$1();

    public final void b(LazyItemScope lazyItemScope, Composer composer, int i2) {
        Intrinsics.i(lazyItemScope, "$this$item");
        if ((i2 & 17) != 16 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-1272734116, i2, -1, "com.hansecom.abt.presentation.screens.home.faremedia.passes.ComposableSingletons$FareMediaPassesScreenKt.lambda-1.<anonymous> (FareMediaPassesScreen.kt:96)");
            }
            SpacerKt.a(SizeKt.i(Modifier.f15489d, Dimensions.f38856a.d()), composer, 6);
            ScreenHeaderKt.b((Modifier) null, PaddingKt.e(0.0f, Dp.m((float) 0), 0.0f, Dp.m((float) 32), 5, (Object) null), 0, 0, StringResources_androidKt.b(R.string.o7, composer, 0), StringResources_androidKt.b(R.string.u7, composer, 0), false, composer, 48, 77);
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
