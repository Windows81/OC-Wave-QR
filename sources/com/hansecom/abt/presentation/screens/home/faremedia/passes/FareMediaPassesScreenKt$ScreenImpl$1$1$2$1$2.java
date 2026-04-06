package com.hansecom.abt.presentation.screens.home.faremedia.passes;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.res.StringResources_androidKt;
import com.hansecom.abt.R;
import com.hansecom.abt.presentation.screens.home.faremedia.passes.FareMediaPasses;
import com.hansecom.abt.ui.components.abtButton.AbtButtonIconPosition;
import com.hansecom.abt.ui.components.abtButton.AbtButtonKt;
import com.hansecom.abt.ui.components.abtButton.AbtButtonState;
import com.hansecom.abt.ui.components.abtButton.AbtButtonStyle;
import com.hansecom.abt.ui.theme.Dimensions;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class FareMediaPassesScreenKt$ScreenImpl$1$1$2$1$2 implements Function3<LazyItemScope, Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function1 f37006z;

    public FareMediaPassesScreenKt$ScreenImpl$1$1$2$1$2(Function1 function1) {
        this.f37006z = function1;
    }

    /* access modifiers changed from: private */
    public static final Unit e(Function1 function1) {
        function1.invoke(FareMediaPasses.Action.AddMorePassClick.f36986a);
        return Unit.f40552a;
    }

    public final void c(LazyItemScope lazyItemScope, Composer composer, int i2) {
        Intrinsics.i(lazyItemScope, "$this$item");
        if ((i2 & 17) != 16 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-21458569, i2, -1, "com.hansecom.abt.presentation.screens.home.faremedia.passes.ScreenImpl.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (FareMediaPassesScreen.kt:120)");
            }
            Modifier.Companion companion = Modifier.f15489d;
            Modifier a2 = TestTagKt.a(SizeKt.h(companion, 0.0f, 1, (Object) null), "add_pass");
            String b2 = StringResources_androidKt.b(R.string.l7, composer, 0);
            composer.X(-969900949);
            boolean W = composer.W(this.f37006z);
            Function1 function1 = this.f37006z;
            Object g2 = composer.g();
            if (W || g2 == Composer.f14567a.a()) {
                g2 = new g(function1);
                composer.N(g2);
            }
            composer.M();
            AbtButtonKt.j((Function0) g2, a2, (AbtButtonStyle) null, (AbtButtonState) null, b2, (Integer) null, (AbtButtonIconPosition) null, composer, 48, 108);
            SpacerKt.a(SizeKt.i(companion, Dimensions.f38856a.e()), composer, 6);
            if (ComposerKt.P()) {
                ComposerKt.X();
                return;
            }
            return;
        }
        composer.B();
    }

    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        c((LazyItemScope) obj, (Composer) obj2, ((Number) obj3).intValue());
        return Unit.f40552a;
    }
}
