package com.hansecom.abt.presentation.screens.payment;

import androidx.compose.material3.SheetState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.res.StringResources_androidKt;
import com.hansecom.abt.R;
import com.hansecom.abt.presentation.model.PaymentMethodState;
import com.hansecom.abt.presentation.screens.payment.ChoosePaymentMethod;
import com.hansecom.abt.ui.components.bottomSheet.AbtBottomSheetKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

@Metadata
final class ChoosePaymentMethodScreenKt$Preview$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ ChoosePaymentMethod.State f37763A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ SheetState f37764z;

    /* access modifiers changed from: private */
    public static final Unit e() {
        return Unit.f40552a;
    }

    public final void c(Composer composer, int i2) {
        Composer composer2 = composer;
        int i3 = i2;
        if ((i3 & 3) != 2 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-322674882, i3, -1, "com.hansecom.abt.presentation.screens.payment.Preview.<anonymous> (ChoosePaymentMethodScreen.kt:283)");
            }
            String b2 = StringResources_androidKt.b(R.string.i3, composer2, 0);
            SheetState sheetState = this.f37764z;
            composer2.X(1792304840);
            Object g2 = composer.g();
            if (g2 == Composer.f14567a.a()) {
                g2 = new o();
                composer2.N(g2);
            }
            composer.M();
            final ChoosePaymentMethod.State state = this.f37763A;
            AbtBottomSheetKt.e(sheetState, b2, 0, 0, (Shape) null, (Function2) null, (Function0) g2, (Function3) null, ComposableLambdaKt.e(-1201632590, true, new Function3<Function0<? extends Unit>, Composer, Integer, Unit>() {
                public static final Unit g(ChoosePaymentMethod.Action action) {
                    Intrinsics.i(action, "it");
                    return Unit.f40552a;
                }

                /* access modifiers changed from: private */
                public static final Unit h() {
                    return Unit.f40552a;
                }

                public static final Unit i(PaymentMethodState paymentMethodState) {
                    Intrinsics.i(paymentMethodState, "it");
                    return Unit.f40552a;
                }

                public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
                    f((Function0) obj, (Composer) obj2, ((Number) obj3).intValue());
                    return Unit.f40552a;
                }

                public final void f(Function0 function0, Composer composer, int i2) {
                    Intrinsics.i(function0, "it");
                    if ((i2 & 17) != 16 || !composer.t()) {
                        if (ComposerKt.P()) {
                            ComposerKt.Y(-1201632590, i2, -1, "com.hansecom.abt.presentation.screens.payment.Preview.<anonymous>.<anonymous> (ChoosePaymentMethodScreen.kt:288)");
                        }
                        ChoosePaymentMethod.State state = state;
                        composer.X(1047789127);
                        Object g2 = composer.g();
                        Composer.Companion companion = Composer.f14567a;
                        if (g2 == companion.a()) {
                            g2 = new p();
                            composer.N(g2);
                        }
                        Function1 function1 = (Function1) g2;
                        composer.M();
                        Flow A2 = FlowKt.A();
                        composer.X(1047792135);
                        Object g3 = composer.g();
                        if (g3 == companion.a()) {
                            g3 = new q();
                            composer.N(g3);
                        }
                        Function0 function02 = (Function0) g3;
                        composer.M();
                        composer.X(1047793608);
                        Object g4 = composer.g();
                        if (g4 == companion.a()) {
                            g4 = new r();
                            composer.N(g4);
                        }
                        composer.M();
                        ChoosePaymentMethodScreenKt.E(state, function1, A2, function02, (Function1) g4, composer, 27696);
                        if (ComposerKt.P()) {
                            ComposerKt.X();
                            return;
                        }
                        return;
                    }
                    composer.B();
                }
            }, composer2, 54), composer, 102236166, 188);
            if (ComposerKt.P()) {
                ComposerKt.X();
                return;
            }
            return;
        }
        composer.B();
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        c((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
