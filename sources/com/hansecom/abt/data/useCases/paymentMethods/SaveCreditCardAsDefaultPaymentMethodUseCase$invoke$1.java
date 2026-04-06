package com.hansecom.abt.data.useCases.paymentMethods;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.data.useCases.paymentMethods.SaveCreditCardAsDefaultPaymentMethodUseCase", f = "SaveCreditCardAsDefaultPaymentMethodUseCase.kt", l = {15, 16, 18, 19, 20}, m = "invoke")
public final class SaveCreditCardAsDefaultPaymentMethodUseCase$invoke$1 extends ContinuationImpl {
    public Object C;
    public long D;
    public /* synthetic */ Object E;
    public final /* synthetic */ SaveCreditCardAsDefaultPaymentMethodUseCase F;
    public int G;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SaveCreditCardAsDefaultPaymentMethodUseCase$invoke$1(SaveCreditCardAsDefaultPaymentMethodUseCase saveCreditCardAsDefaultPaymentMethodUseCase, Continuation continuation) {
        super(continuation);
        this.F = saveCreditCardAsDefaultPaymentMethodUseCase;
    }

    public final Object x(Object obj) {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        return this.F.a(0, this);
    }
}
