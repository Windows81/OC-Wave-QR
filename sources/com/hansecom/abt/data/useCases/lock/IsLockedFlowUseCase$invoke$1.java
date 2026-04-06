package com.hansecom.abt.data.useCases.lock;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function4;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.data.useCases.lock.IsLockedFlowUseCase$invoke$1", f = "IsLockedFlowUseCase.kt", l = {}, m = "invokeSuspend")
public final class IsLockedFlowUseCase$invoke$1 extends SuspendLambda implements Function4<Boolean, Boolean, Boolean, Continuation<? super Boolean>, Object> {
    public int D;
    public /* synthetic */ boolean E;
    public /* synthetic */ boolean F;
    public /* synthetic */ boolean G;
    public final /* synthetic */ IsLockedFlowUseCase H;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IsLockedFlowUseCase$invoke$1(IsLockedFlowUseCase isLockedFlowUseCase, Continuation continuation) {
        super(4, continuation);
        this.H = isLockedFlowUseCase;
    }

    public final Object A(boolean z2, boolean z3, boolean z4, Continuation continuation) {
        IsLockedFlowUseCase$invoke$1 isLockedFlowUseCase$invoke$1 = new IsLockedFlowUseCase$invoke$1(this.H, continuation);
        isLockedFlowUseCase$invoke$1.E = z2;
        isLockedFlowUseCase$invoke$1.F = z3;
        isLockedFlowUseCase$invoke$1.G = z4;
        return isLockedFlowUseCase$invoke$1.x(Unit.f40552a);
    }

    public /* bridge */ /* synthetic */ Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        return A(((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue(), ((Boolean) obj3).booleanValue(), (Continuation) obj4);
    }

    public final Object x(Object obj) {
        IntrinsicsKt.f();
        if (this.D == 0) {
            ResultKt.b(obj);
            return Boxing.a(this.H.f33974a.E() && this.E && this.F && this.G);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
