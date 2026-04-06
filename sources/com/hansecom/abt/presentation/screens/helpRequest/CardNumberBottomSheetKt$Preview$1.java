package com.hansecom.abt.presentation.screens.helpRequest;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

@Metadata
final class CardNumberBottomSheetKt$Preview$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ PreviewState f34796z;

    public static final Unit f(CardNumberState cardNumberState) {
        Intrinsics.i(cardNumberState, "it");
        return Unit.f40552a;
    }

    /* access modifiers changed from: private */
    public static final Unit g() {
        return Unit.f40552a;
    }

    public final void e(Composer composer, int i2) {
        if ((i2 & 3) != 2 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-19676417, i2, -1, "com.hansecom.abt.presentation.screens.helpRequest.Preview.<anonymous> (CardNumberBottomSheet.kt:229)");
            }
            ImmutableList a2 = this.f34796z.a();
            composer.X(1274935760);
            Object g2 = composer.g();
            Composer.Companion companion = Composer.f14567a;
            if (g2 == companion.a()) {
                g2 = new C0433j();
                composer.N(g2);
            }
            Function1 function1 = (Function1) g2;
            composer.M();
            composer.X(1274932560);
            Object g3 = composer.g();
            if (g3 == companion.a()) {
                g3 = new C0434k();
                composer.N(g3);
            }
            composer.M();
            CardNumberBottomSheetKt.h("Title", a2, function1, true, (Function0) g3, composer, 28038);
            if (ComposerKt.P()) {
                ComposerKt.X();
                return;
            }
            return;
        }
        composer.B();
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        e((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
