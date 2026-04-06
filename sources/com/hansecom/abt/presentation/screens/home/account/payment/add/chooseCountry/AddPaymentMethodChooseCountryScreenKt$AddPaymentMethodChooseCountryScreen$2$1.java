package com.hansecom.abt.presentation.screens.home.account.payment.add.chooseCountry;

import com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmi;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.presentation.screens.home.account.payment.add.chooseCountry.AddPaymentMethodChooseCountryScreenKt$AddPaymentMethodChooseCountryScreen$2$1", f = "AddPaymentMethodChooseCountryScreen.kt", l = {}, m = "invokeSuspend")
public final class AddPaymentMethodChooseCountryScreenKt$AddPaymentMethodChooseCountryScreen$2$1 extends SuspendLambda implements Function2<AddPaymentMethodNmi.Effect, Continuation<? super Unit>, Object> {
    public int D;
    public /* synthetic */ Object E;
    public final /* synthetic */ Function0 F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddPaymentMethodChooseCountryScreenKt$AddPaymentMethodChooseCountryScreen$2$1(Function0 function0, Continuation continuation) {
        super(2, continuation);
        this.F = function0;
    }

    /* renamed from: A */
    public final Object m(AddPaymentMethodNmi.Effect effect, Continuation continuation) {
        return ((AddPaymentMethodChooseCountryScreenKt$AddPaymentMethodChooseCountryScreen$2$1) s(effect, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        AddPaymentMethodChooseCountryScreenKt$AddPaymentMethodChooseCountryScreen$2$1 addPaymentMethodChooseCountryScreenKt$AddPaymentMethodChooseCountryScreen$2$1 = new AddPaymentMethodChooseCountryScreenKt$AddPaymentMethodChooseCountryScreen$2$1(this.F, continuation);
        addPaymentMethodChooseCountryScreenKt$AddPaymentMethodChooseCountryScreen$2$1.E = obj;
        return addPaymentMethodChooseCountryScreenKt$AddPaymentMethodChooseCountryScreen$2$1;
    }

    public final Object x(Object obj) {
        IntrinsicsKt.f();
        if (this.D == 0) {
            ResultKt.b(obj);
            if (((AddPaymentMethodNmi.Effect) this.E) instanceof AddPaymentMethodNmi.Effect.ChangeCountry.ChangeCountrySuccess) {
                this.F.invoke();
            }
            return Unit.f40552a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
