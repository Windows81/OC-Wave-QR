package com.hansecom.abt.presentation.screens.home.faremedia.instituitions;

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
import com.hansecom.abt.presentation.screens.home.faremedia.instituitions.Institutions;
import com.hansecom.abt.ui.components.abtButton.AbtButtonIconPosition;
import com.hansecom.abt.ui.components.abtButton.AbtButtonKt;
import com.hansecom.abt.ui.components.abtButton.AbtButtonState;
import com.hansecom.abt.ui.components.abtButton.AbtButtonStyle;
import com.hansecom.abt.ui.theme.Dimensions;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class InstitutionsScreenKt$ScreenImpl$1$1$2$1$3 implements Function3<LazyItemScope, Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function0 f36780A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Institutions.State f36781z;

    public InstitutionsScreenKt$ScreenImpl$1$1$2$1$3(Institutions.State state, Function0 function0) {
        this.f36781z = state;
        this.f36780A = function0;
    }

    public final void b(LazyItemScope lazyItemScope, Composer composer, int i2) {
        Composer composer2 = composer;
        int i3 = i2;
        Intrinsics.i(lazyItemScope, "$this$item");
        if ((i3 & 17) != 16 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(1455028988, i3, -1, "com.hansecom.abt.presentation.screens.home.faremedia.instituitions.ScreenImpl.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (InstitutionsScreen.kt:120)");
            }
            composer2.X(1128074872);
            if (this.f36781z.c()) {
                Modifier m2 = PaddingKt.m(SizeKt.h(Modifier.f15489d, 0.0f, 1, (Object) null), 0.0f, Dp.m((float) 8), 0.0f, 0.0f, 13, (Object) null);
                String b2 = StringResources_androidKt.b(R.string.L6, composer2, 0);
                AbtButtonKt.j(this.f36780A, m2, AbtButtonStyle.f37880f.a(composer2, 6).e(composer2, 0), (AbtButtonState) null, b2, (Integer) null, (AbtButtonIconPosition) null, composer, 48, 104);
            }
            composer.M();
            SpacerKt.a(SizeKt.i(Modifier.f15489d, Dimensions.f38856a.e()), composer2, 6);
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
