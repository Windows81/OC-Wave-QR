package com.hansecom.abt.data.useCases.fareMedia;

import com.hansecom.abt.data.repositories.FareMediaRepository;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.data.useCases.fareMedia.RefreshFareMediaDataUseCase$invoke$2$fareMediaRefreshJob$1", f = "RefreshFareMediaDataUseCase.kt", l = {}, m = "invokeSuspend")
public final class RefreshFareMediaDataUseCase$invoke$2$fareMediaRefreshJob$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {
    public int D;
    public /* synthetic */ Object E;
    public final /* synthetic */ RefreshFareMediaDataUseCase F;

    @Metadata
    @DebugMetadata(c = "com.hansecom.abt.data.useCases.fareMedia.RefreshFareMediaDataUseCase$invoke$2$fareMediaRefreshJob$1$1", f = "RefreshFareMediaDataUseCase.kt", l = {17}, m = "invokeSuspend")
    /* renamed from: com.hansecom.abt.data.useCases.fareMedia.RefreshFareMediaDataUseCase$invoke$2$fareMediaRefreshJob$1$1  reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int D;

        /* renamed from: A */
        public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
            return ((AnonymousClass1) s(coroutineScope, continuation)).x(Unit.f40552a);
        }

        public final Continuation s(Object obj, Continuation continuation) {
            return new AnonymousClass1(refreshFareMediaDataUseCase, continuation);
        }

        public final Object x(Object obj) {
            Object f2 = IntrinsicsKt.f();
            int i2 = this.D;
            if (i2 == 0) {
                ResultKt.b(obj);
                FareMediaRepository b2 = refreshFareMediaDataUseCase.f33927b;
                this.D = 1;
                if (b2.G(this) == f2) {
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

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RefreshFareMediaDataUseCase$invoke$2$fareMediaRefreshJob$1(RefreshFareMediaDataUseCase refreshFareMediaDataUseCase, Continuation continuation) {
        super(2, continuation);
        this.F = refreshFareMediaDataUseCase;
    }

    /* renamed from: A */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((RefreshFareMediaDataUseCase$invoke$2$fareMediaRefreshJob$1) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        RefreshFareMediaDataUseCase$invoke$2$fareMediaRefreshJob$1 refreshFareMediaDataUseCase$invoke$2$fareMediaRefreshJob$1 = new RefreshFareMediaDataUseCase$invoke$2$fareMediaRefreshJob$1(this.F, continuation);
        refreshFareMediaDataUseCase$invoke$2$fareMediaRefreshJob$1.E = obj;
        return refreshFareMediaDataUseCase$invoke$2$fareMediaRefreshJob$1;
    }

    public final Object x(Object obj) {
        IntrinsicsKt.f();
        if (this.D == 0) {
            ResultKt.b(obj);
            final RefreshFareMediaDataUseCase refreshFareMediaDataUseCase = this.F;
            return BuildersKt__Builders_commonKt.d((CoroutineScope) this.E, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1((Continuation) null), 3, (Object) null);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
