package com.hansecom.abt.presentation.screens.home.faremedia.addValue;

import com.google.android.gms.wallet.PaymentData;
import com.google.android.gms.wallet.contract.ApiTaskResult;
import com.hansecom.abt.R;
import com.hansecom.abt.api.ApiExceptionsKt;
import com.hansecom.abt.data.useCases.AddBalanceWithGooglePayUseCase;
import com.hansecom.abt.presentation.model.PaymentMethodState;
import com.hansecom.abt.presentation.screens.home.faremedia.addValue.FareMediaAddValue;
import com.hansecom.abt.ui.UiResult;
import com.hansecom.abt.util.resourcesResolvers.StringValue;
import com.hansecom.abt.util.resourcesResolvers.StringValueKt;
import java.math.BigDecimal;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.PersistentList;
import kotlinx.coroutines.CoroutineScope;
import timber.log.Timber;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.presentation.screens.home.faremedia.addValue.FareMediaAddValueViewModel$onGooglePayResult$1", f = "FareMediaAddValueViewModel.kt", l = {265}, m = "invokeSuspend")
public final class FareMediaAddValueViewModel$onGooglePayResult$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public Object D;
    public int E;
    public final /* synthetic */ ApiTaskResult F;
    public final /* synthetic */ FareMediaAddValueViewModel G;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FareMediaAddValueViewModel$onGooglePayResult$1(ApiTaskResult apiTaskResult, FareMediaAddValueViewModel fareMediaAddValueViewModel, Continuation continuation) {
        super(2, continuation);
        this.F = apiTaskResult;
        this.G = fareMediaAddValueViewModel;
    }

    /* access modifiers changed from: private */
    public static final FareMediaAddValue.State E(FareMediaAddValue.State state) {
        return FareMediaAddValue.State.b(state, (String) null, (String) null, (FareMediaAddValue.State.ValidationError) null, (BigDecimal) null, (BigDecimal) null, (BigDecimal) null, (PersistentList) null, (PaymentMethodState) null, (PersistentList) null, false, false, true, false, (String) null, (UiResult) null, (Integer) null, (BigDecimal) null, (BigDecimal) null, (BigDecimal) null, 522239, (Object) null);
    }

    public static final FareMediaAddValue.State F(FareMediaAddValue.State state) {
        return FareMediaAddValue.State.b(state, (String) null, (String) null, (FareMediaAddValue.State.ValidationError) null, (BigDecimal) null, (BigDecimal) null, (BigDecimal) null, (PersistentList) null, (PaymentMethodState) null, (PersistentList) null, false, false, false, false, (String) null, (UiResult) null, (Integer) null, (BigDecimal) null, (BigDecimal) null, (BigDecimal) null, 522239, (Object) null);
    }

    public static final FareMediaAddValue.State G(FareMediaAddValue.State state) {
        return FareMediaAddValue.State.b(state, (String) null, (String) null, (FareMediaAddValue.State.ValidationError) null, (BigDecimal) null, (BigDecimal) null, (BigDecimal) null, (PersistentList) null, (PaymentMethodState) null, (PersistentList) null, false, false, false, false, (String) null, (UiResult) null, (Integer) null, (BigDecimal) null, (BigDecimal) null, (BigDecimal) null, 522239, (Object) null);
    }

    /* renamed from: D */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((FareMediaAddValueViewModel$onGooglePayResult$1) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        return new FareMediaAddValueViewModel$onGooglePayResult$1(this.F, this.G, continuation);
    }

    public final Object x(Object obj) {
        Object obj2;
        BigDecimal bigDecimal;
        Object f2 = IntrinsicsKt.f();
        int i2 = this.E;
        if (i2 == 0) {
            ResultKt.b(obj);
            if (this.F.b().S() != 0 || this.F.a() == null) {
                if (this.F.b().S() != 16) {
                    Timber.Forest forest = Timber.f44337a;
                    int S = this.F.b().S();
                    String X = this.F.b().X();
                    forest.b("Google Pay error [" + S + "] " + X, new Object[0]);
                    FareMediaAddValueViewModel fareMediaAddValueViewModel = this.G;
                    StringValue c2 = StringValueKt.c(R.string.Q3);
                    String X2 = this.F.b().X();
                    if (X2 == null) {
                        X2 = String.valueOf(this.F.b().S());
                    }
                    fareMediaAddValueViewModel.p(new FareMediaAddValue.Effect.Error(c2, CollectionsKt.e(X2)));
                }
                return Unit.f40552a;
            }
            BigDecimal r2 = ((FareMediaAddValue.State) this.G.m()).r();
            this.G.r(new P());
            AddBalanceWithGooglePayUseCase E2 = this.G.f36089k;
            String K = this.G.f36095q;
            Object a2 = this.F.a();
            Intrinsics.f(a2);
            PaymentData paymentData = (PaymentData) a2;
            String e2 = ((FareMediaAddValue.State) this.G.m()).h().c() ? ((FareMediaAddValue.State) this.G.m()).e() : null;
            this.D = r2;
            this.E = 1;
            Object a3 = E2.a(K, r2, paymentData, e2, this);
            if (a3 == f2) {
                return f2;
            }
            bigDecimal = r2;
            obj2 = a3;
        } else if (i2 == 1) {
            bigDecimal = (BigDecimal) this.D;
            ResultKt.b(obj);
            obj2 = ((Result) obj).j();
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        FareMediaAddValueViewModel fareMediaAddValueViewModel2 = this.G;
        Throwable e3 = Result.e(obj2);
        if (e3 == null) {
            Unit unit = (Unit) obj2;
            fareMediaAddValueViewModel2.r(new Q());
            fareMediaAddValueViewModel2.p(new FareMediaAddValue.Effect.Success(bigDecimal));
        } else {
            fareMediaAddValueViewModel2.r(new S());
            fareMediaAddValueViewModel2.p(new FareMediaAddValue.Effect.Error(ApiExceptionsKt.a(e3), (List) null, 2, (DefaultConstructorMarker) null));
        }
        return Unit.f40552a;
    }
}
