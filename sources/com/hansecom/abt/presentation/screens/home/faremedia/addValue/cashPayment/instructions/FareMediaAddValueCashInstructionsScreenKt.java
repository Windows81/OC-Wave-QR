package com.hansecom.abt.presentation.screens.home.faremedia.addValue.cashPayment.instructions;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import com.hansecom.abt.presentation.screens.home.faremedia.addValue.cashPayment.instructions.FareMediaAddValueCashPaymentInstructions;
import com.hansecom.abt.ui.components.ScreenContentKt;
import com.hansecom.abt.ui.theme.AbtTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

@Metadata
public final class FareMediaAddValueCashInstructionsScreenKt {
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x005e, code lost:
        if ((r14 & 1) != 0) goto L_0x0060;
     */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00da  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void d(com.hansecom.abt.presentation.screens.home.faremedia.addValue.cashPayment.instructions.FareMediaAddValueCashPaymentInstructionsViewModel r10, kotlin.jvm.functions.Function0 r11, androidx.compose.runtime.Composer r12, int r13, int r14) {
        /*
            java.lang.String r0 = "goToCashBarcode"
            kotlin.jvm.internal.Intrinsics.i(r11, r0)
            r0 = -1463487244(0xffffffffa8c4f4f4, float:-2.1866603E-14)
            androidx.compose.runtime.Composer r12 = r12.q(r0)
            r1 = r13 & 6
            if (r1 != 0) goto L_0x001f
            r1 = r14 & 1
            if (r1 != 0) goto L_0x001c
            boolean r1 = r12.l(r10)
            if (r1 == 0) goto L_0x001c
            r1 = 4
            goto L_0x001d
        L_0x001c:
            r1 = 2
        L_0x001d:
            r1 = r1 | r13
            goto L_0x0020
        L_0x001f:
            r1 = r13
        L_0x0020:
            r2 = r14 & 2
            if (r2 == 0) goto L_0x0028
            r1 = r1 | 48
        L_0x0026:
            r9 = r1
            goto L_0x0039
        L_0x0028:
            r2 = r13 & 48
            if (r2 != 0) goto L_0x0026
            boolean r2 = r12.l(r11)
            if (r2 == 0) goto L_0x0035
            r2 = 32
            goto L_0x0037
        L_0x0035:
            r2 = 16
        L_0x0037:
            r1 = r1 | r2
            goto L_0x0026
        L_0x0039:
            r1 = r9 & 19
            r2 = 18
            if (r1 != r2) goto L_0x004b
            boolean r1 = r12.t()
            if (r1 != 0) goto L_0x0046
            goto L_0x004b
        L_0x0046:
            r12.B()
            goto L_0x00dd
        L_0x004b:
            r12.p()
            r1 = r13 & 1
            if (r1 == 0) goto L_0x0063
            boolean r1 = r12.J()
            if (r1 == 0) goto L_0x0059
            goto L_0x0063
        L_0x0059:
            r12.B()
            r1 = r14 & 1
            if (r1 == 0) goto L_0x00af
        L_0x0060:
            r9 = r9 & -15
            goto L_0x00af
        L_0x0063:
            r1 = r14 & 1
            if (r1 == 0) goto L_0x00af
            r10 = 1890788296(0x70b323c8, float:4.435286E29)
            r12.f(r10)
            androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner r10 = androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner.f22073a
            int r1 = androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner.f22075c
            androidx.lifecycle.ViewModelStoreOwner r2 = r10.c(r12, r1)
            if (r2 == 0) goto L_0x00a7
            r10 = 0
            androidx.lifecycle.ViewModelProvider$Factory r4 = androidx.hilt.navigation.compose.HiltViewModelKt.a(r2, r12, r10)
            r10 = 1729797275(0x671a9c9b, float:7.301333E23)
            r12.f(r10)
            boolean r10 = r2 instanceof androidx.lifecycle.HasDefaultViewModelProviderFactory
            if (r10 == 0) goto L_0x008f
            r10 = r2
            androidx.lifecycle.HasDefaultViewModelProviderFactory r10 = (androidx.lifecycle.HasDefaultViewModelProviderFactory) r10
            androidx.lifecycle.viewmodel.CreationExtras r10 = r10.n()
        L_0x008d:
            r5 = r10
            goto L_0x0092
        L_0x008f:
            androidx.lifecycle.viewmodel.CreationExtras$Empty r10 = androidx.lifecycle.viewmodel.CreationExtras.Empty.f22064c
            goto L_0x008d
        L_0x0092:
            r7 = 36936(0x9048, float:5.1758E-41)
            r8 = 0
            java.lang.Class<com.hansecom.abt.presentation.screens.home.faremedia.addValue.cashPayment.instructions.FareMediaAddValueCashPaymentInstructionsViewModel> r1 = com.hansecom.abt.presentation.screens.home.faremedia.addValue.cashPayment.instructions.FareMediaAddValueCashPaymentInstructionsViewModel.class
            r3 = 0
            r6 = r12
            androidx.lifecycle.ViewModel r10 = androidx.lifecycle.viewmodel.compose.ViewModelKt.b(r1, r2, r3, r4, r5, r6, r7, r8)
            r12.S()
            r12.S()
            com.hansecom.abt.presentation.screens.home.faremedia.addValue.cashPayment.instructions.FareMediaAddValueCashPaymentInstructionsViewModel r10 = (com.hansecom.abt.presentation.screens.home.faremedia.addValue.cashPayment.instructions.FareMediaAddValueCashPaymentInstructionsViewModel) r10
            goto L_0x0060
        L_0x00a7:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner"
            r10.<init>(r11)
            throw r10
        L_0x00af:
            r12.U()
            boolean r1 = androidx.compose.runtime.ComposerKt.P()
            if (r1 == 0) goto L_0x00be
            r1 = -1
            java.lang.String r2 = "com.hansecom.abt.presentation.screens.home.faremedia.addValue.cashPayment.instructions.FareMediaAddValueCashInstructionsScreen (FareMediaAddValueCashInstructionsScreen.kt:38)"
            androidx.compose.runtime.ComposerKt.Y(r0, r9, r1, r2)
        L_0x00be:
            int r0 = r9 << 6
            r5 = r0 & 896(0x380, float:1.256E-42)
            r6 = 3
            r2 = 0
            r3 = 0
            r1 = r10
            r4 = r12
            androidx.compose.runtime.State r0 = r1.q(r2, r3, r4, r5, r6)
            com.hansecom.abt.presentation.screens.home.faremedia.addValue.cashPayment.instructions.FareMediaAddValueCashPaymentInstructions$State r0 = e(r0)
            r1 = r9 & 112(0x70, float:1.57E-43)
            i(r0, r11, r12, r1)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x00dd
            androidx.compose.runtime.ComposerKt.X()
        L_0x00dd:
            androidx.compose.runtime.ScopeUpdateScope r12 = r12.x()
            if (r12 == 0) goto L_0x00eb
            com.hansecom.abt.presentation.screens.home.faremedia.addValue.cashPayment.instructions.d r0 = new com.hansecom.abt.presentation.screens.home.faremedia.addValue.cashPayment.instructions.d
            r0.<init>(r10, r11, r13, r14)
            r12.a(r0)
        L_0x00eb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.faremedia.addValue.cashPayment.instructions.FareMediaAddValueCashInstructionsScreenKt.d(com.hansecom.abt.presentation.screens.home.faremedia.addValue.cashPayment.instructions.FareMediaAddValueCashPaymentInstructionsViewModel, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final FareMediaAddValueCashPaymentInstructions.State e(State state) {
        return (FareMediaAddValueCashPaymentInstructions.State) state.getValue();
    }

    public static final Unit f(FareMediaAddValueCashPaymentInstructionsViewModel fareMediaAddValueCashPaymentInstructionsViewModel, Function0 function0, int i2, int i3, Composer composer, int i4) {
        d(fareMediaAddValueCashPaymentInstructionsViewModel, function0, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }

    public static final void g(String str, Composer composer, int i2) {
        int i3;
        Composer composer2;
        String str2 = str;
        int i4 = i2;
        Composer q2 = composer.q(553884440);
        if ((i4 & 6) == 0) {
            i3 = (q2.W(str2) ? 4 : 2) | i4;
        } else {
            i3 = i4;
        }
        if ((i3 & 3) != 2 || !q2.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(553884440, i3, -1, "com.hansecom.abt.presentation.screens.home.faremedia.addValue.cashPayment.instructions.InstructionBadge (FareMediaAddValueCashInstructionsScreen.kt:104)");
            }
            composer2 = q2;
            SurfaceKt.c(SizeKt.t(Modifier.f15489d, Dp.m((float) 52)), RoundedCornerShapeKt.f(), AbtTheme.f38851a.b(q2, 6).x(), 0, 0.0f, 0.0f, (BorderStroke) null, ComposableLambdaKt.e(-1805444237, true, new FareMediaAddValueCashInstructionsScreenKt$InstructionBadge$1(str2), q2, 54), q2, 12582918, 120);
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
            composer2 = q2;
        }
        ScopeUpdateScope x2 = composer2.x();
        if (x2 != null) {
            x2.a(new b(str2, i4));
        }
    }

    public static final Unit h(String str, int i2, Composer composer, int i3) {
        g(str, composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }

    public static final void i(FareMediaAddValueCashPaymentInstructions.State state, Function0 function0, Composer composer, int i2) {
        int i3;
        Composer q2 = composer.q(-1351109903);
        if ((i2 & 6) == 0) {
            i3 = (q2.W(state) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= q2.l(function0) ? 32 : 16;
        }
        if ((i3 & 19) != 18 || !q2.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-1351109903, i3, -1, "com.hansecom.abt.presentation.screens.home.faremedia.addValue.cashPayment.instructions.ScreenImpl (FareMediaAddValueCashInstructionsScreen.kt:50)");
            }
            ScreenContentKt.d((Modifier) null, 0, 0, ComposableLambdaKt.e(513848754, true, new FareMediaAddValueCashInstructionsScreenKt$ScreenImpl$1(state, function0), q2, 54), q2, 3072, 7);
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
        }
        ScopeUpdateScope x2 = q2.x();
        if (x2 != null) {
            x2.a(new c(state, function0, i2));
        }
    }

    public static final Unit j(FareMediaAddValueCashPaymentInstructions.State state, Function0 function0, int i2, Composer composer, int i3) {
        i(state, function0, composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }
}
