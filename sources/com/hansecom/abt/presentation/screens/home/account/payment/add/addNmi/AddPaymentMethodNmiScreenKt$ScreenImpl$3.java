package com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmi;
import com.hansecom.abt.ui.components.snackbar.AbtSnackbarHostState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class AddPaymentMethodNmiScreenKt$ScreenImpl$3 implements Function3<PaddingValues, Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f35623A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ AbtSnackbarHostState f35624B;
    public final /* synthetic */ Function0 C;
    public final /* synthetic */ Function0 D;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ AddPaymentMethodNmi.State f35625z;

    public AddPaymentMethodNmiScreenKt$ScreenImpl$3(AddPaymentMethodNmi.State state, Function1 function1, AbtSnackbarHostState abtSnackbarHostState, Function0 function0, Function0 function02) {
        this.f35625z = state;
        this.f35623A = function1;
        this.f35624B = abtSnackbarHostState;
        this.C = function0;
        this.D = function02;
    }

    public final void b(PaddingValues paddingValues, Composer composer, int i2) {
        Intrinsics.i(paddingValues, "it");
        if ((i2 & 6) == 0) {
            i2 |= composer.W(paddingValues) ? 4 : 2;
        }
        if ((i2 & 19) != 18 || !composer.t()) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-667944750, i2, -1, "com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.ScreenImpl.<anonymous> (AddPaymentMethodNmiScreen.kt:143)");
            }
            AddPaymentMethodNmiScreenKt.H(this.f35625z, this.f35623A, this.f35624B, this.C, this.D, paddingValues, composer, i2 & 14);
            if (ComposerKt.P()) {
                ComposerKt.X();
                return;
            }
            return;
        }
        composer.B();
    }

    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        b((PaddingValues) obj, (Composer) obj2, ((Number) obj3).intValue());
        return Unit.f40552a;
    }
}
