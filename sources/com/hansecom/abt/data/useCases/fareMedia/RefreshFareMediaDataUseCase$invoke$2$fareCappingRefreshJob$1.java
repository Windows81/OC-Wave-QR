package com.hansecom.abt.data.useCases.fareMedia;

import com.hansecom.abt.data.repositories.FareCappingRepository;
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
@DebugMetadata(c = "com.hansecom.abt.data.useCases.fareMedia.RefreshFareMediaDataUseCase$invoke$2$fareCappingRefreshJob$1", f = "RefreshFareMediaDataUseCase.kt", l = {22}, m = "invokeSuspend")
public final class RefreshFareMediaDataUseCase$invoke$2$fareCappingRefreshJob$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int D;
    public final /* synthetic */ RefreshFareMediaDataUseCase E;
    public final /* synthetic */ String F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RefreshFareMediaDataUseCase$invoke$2$fareCappingRefreshJob$1(RefreshFareMediaDataUseCase refreshFareMediaDataUseCase, String str, Continuation continuation) {
        super(2, continuation);
        this.E = refreshFareMediaDataUseCase;
        this.F = str;
    }

    /* renamed from: A */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((RefreshFareMediaDataUseCase$invoke$2$fareCappingRefreshJob$1) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        return new RefreshFareMediaDataUseCase$invoke$2$fareCappingRefreshJob$1(this.E, this.F, continuation);
    }

    public final Object x(Object obj) {
        Object f2 = IntrinsicsKt.f();
        int i2 = this.D;
        if (i2 == 0) {
            ResultKt.b(obj);
            FareCappingRepository a2 = this.E.f33928c;
            String str = this.F;
            this.D = 1;
            if (a2.o(str, this) == f2) {
                return f2;
            }
        } else if (i2 == 1) {
            ResultKt.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.f40552a;
    }
}
