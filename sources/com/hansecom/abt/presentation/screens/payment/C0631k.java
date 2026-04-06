package com.hansecom.abt.presentation.screens.payment;

import androidx.compose.foundation.lazy.LazyListScope;
import com.hansecom.abt.presentation.screens.payment.ChoosePaymentMethod;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* renamed from: com.hansecom.abt.presentation.screens.payment.k  reason: case insensitive filesystem */
public final /* synthetic */ class C0631k implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f37835A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function0 f37836B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ChoosePaymentMethod.State f37837z;

    public /* synthetic */ C0631k(ChoosePaymentMethod.State state, Function1 function1, Function0 function0) {
        this.f37837z = state;
        this.f37835A = function1;
        this.f37836B = function0;
    }

    public final Object invoke(Object obj) {
        return ChoosePaymentMethodScreenKt.s(this.f37837z, this.f37835A, this.f37836B, (LazyListScope) obj);
    }
}
