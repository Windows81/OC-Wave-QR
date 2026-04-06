package com.hansecom.abt.presentation.screens.home.account;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import com.hansecom.abt.presentation.screens.home.account.Account;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class C implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Account.State f35079A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function1 f35080B;
    public final /* synthetic */ int C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Modifier f35081z;

    public /* synthetic */ C(Modifier modifier, Account.State state, Function1 function1, int i2) {
        this.f35081z = modifier;
        this.f35079A = state;
        this.f35080B = function1;
        this.C = i2;
    }

    public final Object m(Object obj, Object obj2) {
        return AccountScreenKt.v(this.f35081z, this.f35079A, this.f35080B, this.C, (Composer) obj, ((Integer) obj2).intValue());
    }
}
