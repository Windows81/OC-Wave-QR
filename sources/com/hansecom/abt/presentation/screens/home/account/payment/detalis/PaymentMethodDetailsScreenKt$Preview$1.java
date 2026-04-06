package com.hansecom.abt.presentation.screens.home.account.payment.detalis;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import com.hansecom.abt.presentation.screens.home.account.payment.detalis.PaymentMethodDetails;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

@Metadata
final class PaymentMethodDetailsScreenKt$Preview$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ PaymentMethodDetails.State f35775z;

    public final void b(Composer composer, int i2) {
        int i3 = i2;
        if ((i3 & 3) != 2 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(622817945, i3, -1, "com.hansecom.abt.presentation.screens.home.account.payment.detalis.Preview.<anonymous> (PaymentMethodDetailsScreen.kt:341)");
            }
            final PaymentMethodDetails.State state = this.f35775z;
            Composer composer2 = composer;
            SurfaceKt.c((Modifier) null, (Shape) null, 0, 0, 0.0f, 0.0f, (BorderStroke) null, ComposableLambdaKt.e(1085670068, true, new Function2<Composer, Integer, Unit>() {
                public static final Unit g(PaymentMethodDetails.Action action) {
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
                            ComposerKt.Y(1085670068, i2, -1, "com.hansecom.abt.presentation.screens.home.account.payment.detalis.Preview.<anonymous>.<anonymous> (PaymentMethodDetailsScreen.kt:342)");
                        }
                        PaymentMethodDetails.State state = state;
                        composer.X(-1741342045);
                        Object g2 = composer.g();
                        Composer.Companion companion = Composer.f14567a;
                        if (g2 == companion.a()) {
                            g2 = new l();
                            composer.N(g2);
                        }
                        Function1 function1 = (Function1) g2;
                        composer.M();
                        Flow A2 = FlowKt.A();
                        composer.X(-1741339645);
                        Object g3 = composer.g();
                        if (g3 == companion.a()) {
                            g3 = new m();
                            composer.N(g3);
                        }
                        Function0 function0 = (Function0) g3;
                        composer.M();
                        composer.X(-1741338781);
                        Object g4 = composer.g();
                        if (g4 == companion.a()) {
                            g4 = new n();
                            composer.N(g4);
                        }
                        composer.M();
                        PaymentMethodDetailsScreenKt.B(state, function1, A2, function0, (Function0) g4, composer, 27696);
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
            }, composer2, 54), composer2, 12582912, 127);
            if (ComposerKt.P()) {
                ComposerKt.X();
                return;
            }
            return;
        }
        composer.B();
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
