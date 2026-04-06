package com.hansecom.abt.presentation.screens.home.faremedia.autoload.setup;

import com.hansecom.abt.api.ApiExceptionsKt;
import com.hansecom.abt.data.useCases.autoload.ChangeAutoloadUseCase;
import com.hansecom.abt.presentation.model.PaymentMethodState;
import com.hansecom.abt.presentation.screens.home.faremedia.autoload.setup.AutoloadSetup;
import com.hansecom.abt.util.BigDecimalExtKt;
import com.hansecom.mapi.models.FareMediaAutoload;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.PersistentList;
import kotlinx.coroutines.CoroutineScope;
import timber.log.Timber;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.presentation.screens.home.faremedia.autoload.setup.AutoloadSetupViewModel$changeAutoload$1", f = "AutoloadSetupViewModel.kt", l = {242}, m = "invokeSuspend")
public final class AutoloadSetupViewModel$changeAutoload$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int D;
    public final /* synthetic */ AutoloadSetupViewModel E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AutoloadSetupViewModel$changeAutoload$1(AutoloadSetupViewModel autoloadSetupViewModel, Continuation continuation) {
        super(2, continuation);
        this.E = autoloadSetupViewModel;
    }

    /* access modifiers changed from: private */
    public static final AutoloadSetup.State E(AutoloadSetup.State state) {
        return AutoloadSetup.State.b(state, (String) null, (String) null, (AutoloadSetup.State.BalanceValidationError) null, (BigDecimal) null, (BigDecimal) null, (String) null, (AutoloadSetup.State.TopUpValidationError) null, (BigDecimal) null, (BigDecimal) null, (BigDecimal) null, (PersistentList) null, false, false, (PaymentMethodState.CreditCard) null, (PersistentList) null, false, (PaymentMethodState.CreditCard) null, false, true, 262143, (Object) null);
    }

    /* access modifiers changed from: private */
    public static final AutoloadSetup.State F(AutoloadSetup.State state) {
        return AutoloadSetup.State.b(state, (String) null, (String) null, (AutoloadSetup.State.BalanceValidationError) null, (BigDecimal) null, (BigDecimal) null, (String) null, (AutoloadSetup.State.TopUpValidationError) null, (BigDecimal) null, (BigDecimal) null, (BigDecimal) null, (PersistentList) null, false, false, (PaymentMethodState.CreditCard) null, (PersistentList) null, false, (PaymentMethodState.CreditCard) null, false, false, 262143, (Object) null);
    }

    /* access modifiers changed from: private */
    public static final AutoloadSetup.State G(AutoloadSetup.State state) {
        return AutoloadSetup.State.b(state, (String) null, (String) null, (AutoloadSetup.State.BalanceValidationError) null, (BigDecimal) null, (BigDecimal) null, (String) null, (AutoloadSetup.State.TopUpValidationError) null, (BigDecimal) null, (BigDecimal) null, (BigDecimal) null, (PersistentList) null, false, false, (PaymentMethodState.CreditCard) null, (PersistentList) null, false, (PaymentMethodState.CreditCard) null, false, false, 262143, (Object) null);
    }

    /* renamed from: D */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((AutoloadSetupViewModel$changeAutoload$1) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        return new AutoloadSetupViewModel$changeAutoload$1(this.E, continuation);
    }

    public final Object x(Object obj) {
        Object obj2;
        Object f2 = IntrinsicsKt.f();
        int i2 = this.D;
        if (i2 == 0) {
            ResultKt.b(obj);
            PaymentMethodState.CreditCard l2 = ((AutoloadSetup.State) this.E.m()).l();
            BigDecimal e2 = BigDecimalExtKt.e(((AutoloadSetup.State) this.E.m()).d());
            BigDecimal e3 = BigDecimalExtKt.e(((AutoloadSetup.State) this.E.m()).r());
            if (!this.E.J(e3, e2)) {
                return Unit.f40552a;
            }
            if (l2 != null) {
                this.E.r(new y());
                ChangeAutoloadUseCase B2 = this.E.f36318l;
                String b2 = this.E.f36319m.b();
                Long a2 = this.E.f36319m.a();
                Intrinsics.f(a2);
                long longValue = a2.longValue();
                boolean v2 = ((AutoloadSetup.State) this.E.m()).v();
                long c2 = l2.c();
                PaymentMethodState.CreditCard c3 = ((AutoloadSetup.State) this.E.m()).c();
                Long d2 = c3 != null ? Boxing.d(c3.c()) : null;
                this.D = 1;
                obj2 = B2.a(b2, longValue, v2, e3, e2, c2, d2, this);
                if (obj2 == f2) {
                    return f2;
                }
            } else {
                Timber.f44337a.b("Unsupported payment method", new Object[0]);
                return Unit.f40552a;
            }
        } else if (i2 == 1) {
            ResultKt.b(obj);
            obj2 = ((Result) obj).j();
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AutoloadSetupViewModel autoloadSetupViewModel = this.E;
        Throwable e4 = Result.e(obj2);
        if (e4 == null) {
            FareMediaAutoload fareMediaAutoload = (FareMediaAutoload) obj2;
            autoloadSetupViewModel.r(new z());
            autoloadSetupViewModel.p(AutoloadSetup.Effect.Success.f36297a);
        } else {
            autoloadSetupViewModel.r(new A());
            autoloadSetupViewModel.p(new AutoloadSetup.Effect.Error(ApiExceptionsKt.a(e4)));
        }
        return Unit.f40552a;
    }
}
