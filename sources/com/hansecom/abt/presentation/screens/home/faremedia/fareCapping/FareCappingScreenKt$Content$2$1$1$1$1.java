package com.hansecom.abt.presentation.screens.home.faremedia.fareCapping;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.unit.Dp;
import com.hansecom.abt.R;
import com.hansecom.abt.presentation.screens.home.faremedia.fareCapping.FareCapping;
import com.hansecom.abt.ui.components.emptyView.EmptyViewKt;
import com.hansecom.abt.ui.components.screenHeader.ScreenHeaderKt;
import com.hansecom.abt.ui.theme.Dimensions;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class FareCappingScreenKt$Content$2$1$1$1$1 implements Function3<LazyItemScope, Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ FareCapping.State f36730z;

    public FareCappingScreenKt$Content$2$1$1$1$1(FareCapping.State state) {
        this.f36730z = state;
    }

    public final void b(LazyItemScope lazyItemScope, Composer composer, int i2) {
        Composer composer2 = composer;
        int i3 = i2;
        LazyItemScope lazyItemScope2 = lazyItemScope;
        Intrinsics.i(lazyItemScope, "$this$item");
        if ((i3 & 17) != 16 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(522738702, i3, -1, "com.hansecom.abt.presentation.screens.home.faremedia.fareCapping.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (FareCappingScreen.kt:101)");
            }
            Modifier.Companion companion = Modifier.f15489d;
            SpacerKt.a(SizeKt.i(companion, Dimensions.f38856a.d()), composer2, 6);
            if (!this.f36730z.d().isEmpty() || !this.f36730z.e().isEmpty()) {
                composer2.X(716858796);
                composer2.X(854411537);
                String c2 = this.f36730z.c();
                if (c2.length() == 0) {
                    c2 = StringResources_androidKt.b(R.string.Y3, composer2, 0);
                }
                composer.M();
                ScreenHeaderKt.b((Modifier) null, (PaddingValues) null, 0, 0, c2, StringResources_androidKt.b(R.string.b4, composer2, 0), false, composer, 0, 79);
                composer.M();
            } else {
                composer2.X(716344816);
                SpacerKt.a(SizeKt.i(companion, Dp.m((float) 80)), composer2, 6);
                EmptyViewKt.b(SizeKt.h(companion, 0.0f, 1, (Object) null), Integer.valueOf(R.drawable.V), StringResources_androidKt.b(R.string.X3, composer2, 0), StringResources_androidKt.b(R.string.W3, composer2, 0), (String) null, (String) null, (Integer) null, (Function0) null, false, composer, 6, 496);
                composer.M();
            }
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
