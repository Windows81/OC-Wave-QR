package com.hansecom.abt.presentation.screens.home.faremedia.transferBalance;

import com.hansecom.abt.presentation.model.PaymentMethodState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

@Metadata
public final class FareMediaSelectorKt$ScreenImpl$1$1$2$1$1 implements Function0<Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ PaymentMethodState.FareMedia f37299A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function1 f37300z;

    public FareMediaSelectorKt$ScreenImpl$1$1$2$1$1(Function1 function1, PaymentMethodState.FareMedia fareMedia) {
        this.f37300z = function1;
        this.f37299A = fareMedia;
    }

    public final void b() {
        this.f37300z.invoke(this.f37299A);
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        b();
        return Unit.f40552a;
    }
}
