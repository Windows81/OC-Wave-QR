package com.hansecom.abt.presentation.screens.home.account;

import androidx.compose.runtime.Composer;
import com.hansecom.abt.presentation.screens.home.account.Account;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class G implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f35092A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ boolean f35093B;
    public final /* synthetic */ int C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Account.State f35094z;

    public /* synthetic */ G(Account.State state, Function1 function1, boolean z2, int i2) {
        this.f35094z = state;
        this.f35092A = function1;
        this.f35093B = z2;
        this.C = i2;
    }

    public final Object m(Object obj, Object obj2) {
        return AccountScreenKt.s(this.f35094z, this.f35092A, this.f35093B, this.C, (Composer) obj, ((Integer) obj2).intValue());
    }
}
