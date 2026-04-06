package com.hansecom.abt.presentation.screens.helpRequest;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.res.StringResources_androidKt;
import com.hansecom.abt.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class CardNumberBottomSheetKt$BottomSheet$2$1$1$5 implements Function3<LazyItemScope, Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function0 f34792A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function1 f34793z;

    public CardNumberBottomSheetKt$BottomSheet$2$1$1$5(Function1 function1, Function0 function0) {
        this.f34793z = function1;
        this.f34792A = function0;
    }

    public static final Unit e(Function1 function1, CardNumberState cardNumberState, Function0 function0) {
        function1.invoke(cardNumberState);
        function0.invoke();
        return Unit.f40552a;
    }

    public final void c(LazyItemScope lazyItemScope, Composer composer, int i2) {
        Intrinsics.i(lazyItemScope, "$this$item");
        if ((i2 & 17) != 16 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(1078238299, i2, -1, "com.hansecom.abt.presentation.screens.helpRequest.BottomSheet.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CardNumberBottomSheet.kt:136)");
            }
            CardNumberState cardNumberState = new CardNumberState("0", "", StringResources_androidKt.b(R.string.X2, composer, 0), false, true);
            String a2 = cardNumberState.a();
            composer.X(912231648);
            boolean W = composer.W(this.f34793z) | composer.W(cardNumberState) | composer.W(this.f34792A);
            Function1 function1 = this.f34793z;
            Function0 function0 = this.f34792A;
            Object g2 = composer.g();
            if (W || g2 == Composer.f14567a.a()) {
                g2 = new C0432i(function1, cardNumberState, function0);
                composer.N(g2);
            }
            composer.M();
            CardNumberBottomSheetKt.l("", a2, (Function0) g2, composer, 6);
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
