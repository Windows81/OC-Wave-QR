package com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi;

import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmiScreenKt$WebViewCardInfo$1$1$1", f = "AddPaymentMethodNmiScreen.kt", l = {}, m = "invokeSuspend")
public final class AddPaymentMethodNmiScreenKt$WebViewCardInfo$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int D;
    public final /* synthetic */ MutableState E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddPaymentMethodNmiScreenKt$WebViewCardInfo$1$1$1(MutableState mutableState, Continuation continuation) {
        super(2, continuation);
        this.E = mutableState;
    }

    /* renamed from: A */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((AddPaymentMethodNmiScreenKt$WebViewCardInfo$1$1$1) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        return new AddPaymentMethodNmiScreenKt$WebViewCardInfo$1$1$1(this.E, continuation);
    }

    public final Object x(Object obj) {
        IntrinsicsKt.f();
        if (this.D == 0) {
            ResultKt.b(obj);
            AddPaymentMethodNmiScreenKt.N(this.E, true);
            return Unit.f40552a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
