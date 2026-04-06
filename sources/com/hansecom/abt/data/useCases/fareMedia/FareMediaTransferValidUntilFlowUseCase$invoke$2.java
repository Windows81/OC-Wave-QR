package com.hansecom.abt.data.useCases.fareMedia;

import java.time.LocalDateTime;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import timber.log.Timber;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.data.useCases.fareMedia.FareMediaTransferValidUntilFlowUseCase$invoke$2", f = "FareMediaTransferValidUntilFlowUseCase.kt", l = {}, m = "invokeSuspend")
public final class FareMediaTransferValidUntilFlowUseCase$invoke$2 extends SuspendLambda implements Function2<LocalDateTime, Continuation<? super Unit>, Object> {
    public int D;
    public /* synthetic */ Object E;

    public FareMediaTransferValidUntilFlowUseCase$invoke$2(Continuation continuation) {
        super(2, continuation);
    }

    /* renamed from: A */
    public final Object m(LocalDateTime localDateTime, Continuation continuation) {
        return ((FareMediaTransferValidUntilFlowUseCase$invoke$2) s(localDateTime, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        FareMediaTransferValidUntilFlowUseCase$invoke$2 fareMediaTransferValidUntilFlowUseCase$invoke$2 = new FareMediaTransferValidUntilFlowUseCase$invoke$2(continuation);
        fareMediaTransferValidUntilFlowUseCase$invoke$2.E = obj;
        return fareMediaTransferValidUntilFlowUseCase$invoke$2;
    }

    public final Object x(Object obj) {
        IntrinsicsKt.f();
        if (this.D == 0) {
            ResultKt.b(obj);
            if (((LocalDateTime) this.E) == null) {
                Timber.f44337a.b("Error converting fare media transfer time to LocalDateTime", new Object[0]);
            }
            return Unit.f40552a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
