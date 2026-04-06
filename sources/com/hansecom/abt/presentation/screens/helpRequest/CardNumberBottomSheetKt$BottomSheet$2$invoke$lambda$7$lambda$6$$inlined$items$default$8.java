package com.hansecom.abt.presentation.screens.helpRequest;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class CardNumberBottomSheetKt$BottomSheet$2$invoke$lambda$7$lambda$6$$inlined$items$default$8 extends Lambda implements Function4<LazyItemScope, Integer, Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f34780A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function0 f34781B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ List f34782z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CardNumberBottomSheetKt$BottomSheet$2$invoke$lambda$7$lambda$6$$inlined$items$default$8(List list, Function1 function1, Function0 function0) {
        super(4);
        this.f34782z = list;
        this.f34780A = function1;
        this.f34781B = function0;
    }

    public final void b(LazyItemScope lazyItemScope, int i2, Composer composer, int i3) {
        int i4;
        if ((i3 & 6) == 0) {
            i4 = (composer.W(lazyItemScope) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= composer.i(i2) ? 32 : 16;
        }
        boolean z2 = true;
        if ((i4 & 147) == 146) {
            z2 = false;
        }
        if (composer.E(z2, i4 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-632812321, i4, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
            }
            CardNumberState cardNumberState = (CardNumberState) this.f34782z.get(i2);
            composer.X(-1786385007);
            String b2 = cardNumberState.b();
            String a2 = cardNumberState.a();
            composer.X(912210567);
            boolean W = composer.W(this.f34780A) | composer.W(cardNumberState) | composer.W(this.f34781B);
            Object g2 = composer.g();
            if (W || g2 == Composer.f14567a.a()) {
                g2 = new CardNumberBottomSheetKt$BottomSheet$2$1$1$4$1$1(this.f34780A, cardNumberState, this.f34781B);
                composer.N(g2);
            }
            composer.M();
            CardNumberBottomSheetKt.l(b2, a2, (Function0) g2, composer, 0);
            composer.M();
            if (ComposerKt.P()) {
                ComposerKt.X();
                return;
            }
            return;
        }
        composer.B();
    }

    public /* bridge */ /* synthetic */ Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        b((LazyItemScope) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
        return Unit.f40552a;
    }
}
