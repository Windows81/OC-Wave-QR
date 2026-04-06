package com.hansecom.abt.presentation.screens.payment;

import android.content.Context;
import androidx.navigation.NavGraphBuilder;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class B implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function0 f37724A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function1 f37725B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Context f37726z;

    public /* synthetic */ B(Context context, Function0 function0, Function1 function1) {
        this.f37726z = context;
        this.f37724A = function0;
        this.f37725B = function1;
    }

    public final Object invoke(Object obj) {
        return ChoosePaymentNavigationKt.d(this.f37726z, this.f37724A, this.f37725B, (NavGraphBuilder) obj);
    }
}
