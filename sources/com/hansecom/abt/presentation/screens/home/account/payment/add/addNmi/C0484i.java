package com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* renamed from: com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.i  reason: case insensitive filesystem */
public final /* synthetic */ class C0484i implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ int f35695A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function1 f35696B;
    public final /* synthetic */ Function1 C;
    public final /* synthetic */ int D;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ PaddingValues f35697z;

    public /* synthetic */ C0484i(PaddingValues paddingValues, int i2, Function1 function1, Function1 function12, int i3) {
        this.f35697z = paddingValues;
        this.f35695A = i2;
        this.f35696B = function1;
        this.C = function12;
        this.D = i3;
    }

    public final Object m(Object obj, Object obj2) {
        return AddPaymentMethodNmiScreenKt.O(this.f35697z, this.f35695A, this.f35696B, this.C, this.D, (Composer) obj, ((Integer) obj2).intValue());
    }
}
