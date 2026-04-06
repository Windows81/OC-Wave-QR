package com.hansecom.abt.presentation.screens.home.faremedia.transferBalance;

import androidx.compose.runtime.Composer;
import com.hansecom.abt.presentation.screens.home.faremedia.transferBalance.TransferBalance;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;

public final /* synthetic */ class q implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f37353A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Flow f37354B;
    public final /* synthetic */ Function0 C;
    public final /* synthetic */ int D;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ TransferBalance.State f37355z;

    public /* synthetic */ q(TransferBalance.State state, Function1 function1, Flow flow, Function0 function0, int i2) {
        this.f37355z = state;
        this.f37353A = function1;
        this.f37354B = flow;
        this.C = function0;
        this.D = i2;
    }

    public final Object m(Object obj, Object obj2) {
        return TransferBalanceScreenKt.g(this.f37355z, this.f37353A, this.f37354B, this.C, this.D, (Composer) obj, ((Integer) obj2).intValue());
    }
}
