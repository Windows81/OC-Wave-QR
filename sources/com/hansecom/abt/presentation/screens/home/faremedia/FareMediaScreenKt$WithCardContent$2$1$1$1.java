package com.hansecom.abt.presentation.screens.home.faremedia;

import com.hansecom.abt.presentation.screens.home.faremedia.FareMedia;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.presentation.screens.home.faremedia.FareMediaScreenKt$WithCardContent$2$1$1$1", f = "FareMediaScreen.kt", l = {}, m = "invokeSuspend")
public final class FareMediaScreenKt$WithCardContent$2$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int D;
    public final /* synthetic */ Function1 E;
    public final /* synthetic */ FareMedia.State.CardItem F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FareMediaScreenKt$WithCardContent$2$1$1$1(Function1 function1, FareMedia.State.CardItem cardItem, Continuation continuation) {
        super(2, continuation);
        this.E = function1;
        this.F = cardItem;
    }

    /* renamed from: A */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((FareMediaScreenKt$WithCardContent$2$1$1$1) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        return new FareMediaScreenKt$WithCardContent$2$1$1$1(this.E, this.F, continuation);
    }

    public final Object x(Object obj) {
        IntrinsicsKt.f();
        if (this.D == 0) {
            ResultKt.b(obj);
            this.E.invoke(this.F.m());
            return Unit.f40552a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
