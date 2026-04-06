package com.hansecom.abt.presentation.screens.guest.checkFareMediaBalance;

import androidx.compose.runtime.Composer;
import com.hansecom.abt.presentation.screens.guest.checkFareMediaBalance.CheckFareMediaBalance;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;

public final /* synthetic */ class b implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f34735A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Flow f34736B;
    public final /* synthetic */ Function0 C;
    public final /* synthetic */ int D;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ CheckFareMediaBalance.State f34737z;

    public /* synthetic */ b(CheckFareMediaBalance.State state, Function1 function1, Flow flow, Function0 function0, int i2) {
        this.f34737z = state;
        this.f34735A = function1;
        this.f34736B = flow;
        this.C = function0;
        this.D = i2;
    }

    public final Object m(Object obj, Object obj2) {
        return CheckFareMediaBalanceScreenKt.g(this.f34737z, this.f34735A, this.f34736B, this.C, this.D, (Composer) obj, ((Integer) obj2).intValue());
    }
}
