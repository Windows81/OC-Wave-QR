package com.hansecom.abt.presentation.screens.auth.reset.success;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.hansecom.abt.presentation.screens.auth.reset.success.ResetPasswordSuccess;
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
/* renamed from: com.hansecom.abt.presentation.screens.auth.reset.success.ComposableSingletons$ResetPasswordSuccessScreenKt$lambda-1$1  reason: invalid class name */
public final class ComposableSingletons$ResetPasswordSuccessScreenKt$lambda1$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public static final ComposableSingletons$ResetPasswordSuccessScreenKt$lambda1$1 f34630z = new ComposableSingletons$ResetPasswordSuccessScreenKt$lambda1$1();

    /* access modifiers changed from: private */
    public static final Unit g() {
        return Unit.f40552a;
    }

    /* access modifiers changed from: private */
    public static final Unit h() {
        return Unit.f40552a;
    }

    public static final Unit i(ResetPasswordSuccess.Action action) {
        Intrinsics.i(action, "it");
        return Unit.f40552a;
    }

    public final void f(Composer composer, int i2) {
        if ((i2 & 3) != 2 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(307447822, i2, -1, "com.hansecom.abt.presentation.screens.auth.reset.success.ComposableSingletons$ResetPasswordSuccessScreenKt.lambda-1.<anonymous> (ResetPasswordSuccessScreen.kt:123)");
            }
            ResetPasswordSuccess.State state = new ResetPasswordSuccess.State((String) null, false, 3, (DefaultConstructorMarker) null);
            Flow A2 = FlowKt.A();
            composer.X(1588341460);
            Object g2 = composer.g();
            Composer.Companion companion = Composer.f14567a;
            if (g2 == companion.a()) {
                g2 = new a();
                composer.N(g2);
            }
            Function0 function0 = (Function0) g2;
            composer.M();
            composer.X(1588342292);
            Object g3 = composer.g();
            if (g3 == companion.a()) {
                g3 = new b();
                composer.N(g3);
            }
            Function0 function02 = (Function0) g3;
            composer.M();
            composer.X(1588339540);
            Object g4 = composer.g();
            if (g4 == companion.a()) {
                g4 = new c();
                composer.N(g4);
            }
            composer.M();
            ResetPasswordSuccessScreenKt.f(function0, function02, state, (Function1) g4, A2, composer, 3126, 0);
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
