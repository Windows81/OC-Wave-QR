package com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout;

import androidx.compose.runtime.Composer;
import com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout.PassCheckout;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;

/* renamed from: com.hansecom.abt.presentation.screens.home.faremedia.passes.checkout.d  reason: case insensitive filesystem */
public final /* synthetic */ class C0586d implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f37138A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Flow f37139B;
    public final /* synthetic */ Function0 C;
    public final /* synthetic */ int D;
    public final /* synthetic */ int E;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ PassCheckout.State f37140z;

    public /* synthetic */ C0586d(PassCheckout.State state, Function1 function1, Flow flow, Function0 function0, int i2, int i3) {
        this.f37140z = state;
        this.f37138A = function1;
        this.f37139B = flow;
        this.C = function0;
        this.D = i2;
        this.E = i3;
    }

    public final Object m(Object obj, Object obj2) {
        return PassCheckoutScreenKt.A(this.f37140z, this.f37138A, this.f37139B, this.C, this.D, this.E, (Composer) obj, ((Integer) obj2).intValue());
    }
}
