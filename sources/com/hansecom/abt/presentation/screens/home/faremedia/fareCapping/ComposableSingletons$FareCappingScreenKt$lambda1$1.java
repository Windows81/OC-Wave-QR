package com.hansecom.abt.presentation.screens.home.faremedia.fareCapping;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.unit.Dp;
import com.hansecom.abt.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata
/* renamed from: com.hansecom.abt.presentation.screens.home.faremedia.fareCapping.ComposableSingletons$FareCappingScreenKt$lambda-1$1  reason: invalid class name */
public final class ComposableSingletons$FareCappingScreenKt$lambda1$1 implements Function3<LazyItemScope, Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public static final ComposableSingletons$FareCappingScreenKt$lambda1$1 f36710z = new ComposableSingletons$FareCappingScreenKt$lambda1$1();

    public final void b(LazyItemScope lazyItemScope, Composer composer, int i2) {
        Intrinsics.i(lazyItemScope, "$this$item");
        if ((i2 & 17) != 16 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(101229587, i2, -1, "com.hansecom.abt.presentation.screens.home.faremedia.fareCapping.ComposableSingletons$FareCappingScreenKt.lambda-1.<anonymous> (FareCappingScreen.kt:122)");
            }
            FareCappingScreenKt.n(StringResources_androidKt.b(R.string.V3, composer, 0), composer, 0);
            SpacerKt.a(SizeKt.i(Modifier.f15489d, Dp.m((float) 16)), composer, 6);
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
