package com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout;

import androidx.compose.runtime.Composer;
import com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout.PassCheckout;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* renamed from: com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout.j  reason: case insensitive filesystem */
public final /* synthetic */ class C0592j implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f37149A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ int f37150B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ PassCheckout.State f37151z;

    public /* synthetic */ C0592j(PassCheckout.State state, Function1 function1, int i2) {
        this.f37151z = state;
        this.f37149A = function1;
        this.f37150B = i2;
    }

    public final Object m(Object obj, Object obj2) {
        return PassCheckoutScreenKt.p(this.f37151z, this.f37149A, this.f37150B, (Composer) obj, ((Integer) obj2).intValue());
    }
}
