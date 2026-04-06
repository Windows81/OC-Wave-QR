package com.hansecom.abt.presentation.screens.home.faremedia.cardOptions;

import com.hansecom.abt.presentation.screens.home.faremedia.cardOptions.CardOptions;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.presentation.screens.home.faremedia.cardOptions.CardOptionsScreenKt$ScreenImpl$2$1", f = "CardOptionsScreen.kt", l = {}, m = "invokeSuspend")
public final class CardOptionsScreenKt$ScreenImpl$2$1 extends SuspendLambda implements Function2<CardOptions.Effect, Continuation<? super Unit>, Object> {
    public int D;
    public /* synthetic */ Object E;
    public final /* synthetic */ Function0 F;
    public final /* synthetic */ Function0 G;
    public final /* synthetic */ Function0 H;
    public final /* synthetic */ Function0 I;
    public final /* synthetic */ Function0 J;
    public final /* synthetic */ Function0 K;
    public final /* synthetic */ Function0 L;
    public final /* synthetic */ Function0 M;
    public final /* synthetic */ Function0 N;
    public final /* synthetic */ Function0 O;
    public final /* synthetic */ Function0 P;
    public final /* synthetic */ Function0 Q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CardOptionsScreenKt$ScreenImpl$2$1(Function0 function0, Function0 function02, Function0 function03, Function0 function04, Function0 function05, Function0 function06, Function0 function07, Function0 function08, Function0 function09, Function0 function010, Function0 function011, Function0 function012, Continuation continuation) {
        super(2, continuation);
        this.F = function0;
        this.G = function02;
        this.H = function03;
        this.I = function04;
        this.J = function05;
        this.K = function06;
        this.L = function07;
        this.M = function08;
        this.N = function09;
        this.O = function010;
        this.P = function011;
        this.Q = function012;
    }

    /* renamed from: A */
    public final Object m(CardOptions.Effect effect, Continuation continuation) {
        return ((CardOptionsScreenKt$ScreenImpl$2$1) s(effect, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        CardOptionsScreenKt$ScreenImpl$2$1 cardOptionsScreenKt$ScreenImpl$2$1 = new CardOptionsScreenKt$ScreenImpl$2$1(this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, this.O, this.P, this.Q, continuation);
        cardOptionsScreenKt$ScreenImpl$2$1.E = obj;
        return cardOptionsScreenKt$ScreenImpl$2$1;
    }

    public final Object x(Object obj) {
        IntrinsicsKt.f();
        if (this.D == 0) {
            ResultKt.b(obj);
            CardOptions.Effect effect = (CardOptions.Effect) this.E;
            if (Intrinsics.d(effect, CardOptions.Effect.AddValue.f36471a)) {
                this.F.invoke();
            } else if (Intrinsics.d(effect, CardOptions.Effect.Autoload.f36472a)) {
                this.G.invoke();
            } else if (Intrinsics.d(effect, CardOptions.Effect.CardHistory.f36473a)) {
                this.H.invoke();
            } else if (Intrinsics.d(effect, CardOptions.Effect.CardInformation.f36474a)) {
                this.I.invoke();
            } else if (Intrinsics.d(effect, CardOptions.Effect.ConvertToVirtual.f36475a)) {
                this.J.invoke();
            } else if (Intrinsics.d(effect, CardOptions.Effect.FareCapping.f36476a)) {
                this.K.invoke();
            } else if (Intrinsics.d(effect, CardOptions.Effect.Institutions.f36477a)) {
                this.L.invoke();
            } else if (Intrinsics.d(effect, CardOptions.Effect.LockCard.f36478a)) {
                this.M.invoke();
            } else if (Intrinsics.d(effect, CardOptions.Effect.UnlockCard.f36482a)) {
                this.N.invoke();
            } else if (Intrinsics.d(effect, CardOptions.Effect.Passes.f36479a)) {
                this.O.invoke();
            } else if (Intrinsics.d(effect, CardOptions.Effect.RemoveCard.f36480a)) {
                this.P.invoke();
            } else if (Intrinsics.d(effect, CardOptions.Effect.TransferBalance.f36481a)) {
                this.Q.invoke();
            } else {
                throw new NoWhenBranchMatchedException();
            }
            return Unit.f40552a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
