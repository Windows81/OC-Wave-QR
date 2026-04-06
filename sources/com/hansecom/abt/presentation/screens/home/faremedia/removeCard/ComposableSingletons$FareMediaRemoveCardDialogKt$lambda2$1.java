package com.hansecom.abt.presentation.screens.home.faremedia.removeCard;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.hansecom.abt.presentation.screens.home.faremedia.removeCard.FareMediaRemoveCard;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

@Metadata
/* renamed from: com.hansecom.abt.presentation.screens.home.faremedia.removeCard.ComposableSingletons$FareMediaRemoveCardDialogKt$lambda-2$1  reason: invalid class name */
public final class ComposableSingletons$FareMediaRemoveCardDialogKt$lambda2$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public static final ComposableSingletons$FareMediaRemoveCardDialogKt$lambda2$1 f37237z = new ComposableSingletons$FareMediaRemoveCardDialogKt$lambda2$1();

    public static final Unit g(FareMediaRemoveCard.Action action) {
        Intrinsics.i(action, "it");
        return Unit.f40552a;
    }

    /* access modifiers changed from: private */
    public static final Unit h() {
        return Unit.f40552a;
    }

    /* access modifiers changed from: private */
    public static final Unit i() {
        return Unit.f40552a;
    }

    public final void f(Composer composer, int i2) {
        if ((i2 & 3) != 2 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-1228242946, i2, -1, "com.hansecom.abt.presentation.screens.home.faremedia.removeCard.ComposableSingletons$FareMediaRemoveCardDialogKt.lambda-2.<anonymous> (FareMediaRemoveCardDialog.kt:85)");
            }
            FareMediaRemoveCard.State state = new FareMediaRemoveCard.State(false, 1, (DefaultConstructorMarker) null);
            composer.X(-1432395901);
            Object g2 = composer.g();
            Composer.Companion companion = Composer.f14567a;
            if (g2 == companion.a()) {
                g2 = new a();
                composer.N(g2);
            }
            Function1 function1 = (Function1) g2;
            composer.M();
            Flow A2 = FlowKt.A();
            composer.X(-1432393885);
            Object g3 = composer.g();
            if (g3 == companion.a()) {
                g3 = new b();
                composer.N(g3);
            }
            Function0 function0 = (Function0) g3;
            composer.M();
            composer.X(-1432392989);
            Object g4 = composer.g();
            if (g4 == companion.a()) {
                g4 = new c();
                composer.N(g4);
            }
            composer.M();
            FareMediaRemoveCardDialogKt.e(state, function1, A2, function0, (Function0) g4, composer, 27696);
            if (ComposerKt.P()) {
                ComposerKt.X();
                return;
            }
            return;
        }
        composer.B();
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        f((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
