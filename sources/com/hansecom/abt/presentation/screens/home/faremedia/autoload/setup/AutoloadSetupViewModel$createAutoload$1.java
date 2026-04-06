package com.hansecom.abt.presentation.screens.home.faremedia.autoload.setup;

import com.hansecom.abt.api.ApiExceptionsKt;
import com.hansecom.abt.data.useCases.autoload.CreateAutoloadUseCase;
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
import kotlinx.collections.immutable.PersistentList;
import kotlinx.coroutines.CoroutineScope;
import timber.log.Timber;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.presentation.screens.home.faremedia.autoload.setup.AutoloadSetupViewModel$createAutoload$1", f = "AutoloadSetupViewModel.kt", l = {208}, m = "invokeSuspend")
public final class AutoloadSetupViewModel$createAutoload$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int D;
    public final /* synthetic */ AutoloadSetupViewModel E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AutoloadSetupViewModel$createAutoload$1(AutoloadSetupViewModel autoloadSetupViewModel, Continuation continuation) {
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
        return ((AutoloadSetupViewModel$createAutoload$1) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        return new AutoloadSetupViewModel$createAutoload$1(this.E, continuation);
    }

    public final Object x(Object obj) {
        Object obj2;
        Object f2 = IntrinsicsKt.f();
        int i2 = this.D;
        if (i2 == 0) {
            ResultKt.b(obj);
            BigDecimal e2 = BigDecimalExtKt.e(((AutoloadSetup.State) this.E.m()).d());
            BigDecimal e3 = BigDecimalExtKt.e(((AutoloadSetup.State) this.E.m()).r());
            if (!this.E.J(e3, e2)) {
                return Unit.f40552a;
            }
            PaymentMethodState.CreditCard l2 = ((AutoloadSetup.State) this.E.m()).l();
            PaymentMethodState.CreditCard c2 = ((AutoloadSetup.State) this.E.m()).c();
            if (l2 != null) {
                this.E.r(new B());
                CreateAutoloadUseCase C = this.E.f36317k;
                String b2 = this.E.f36319m.b();
                long c3 = l2.c();
                Long d2 = c2 != null ? Boxing.d(c2.c()) : null;
                this.D = 1;
                obj2 = C.a(b2, e3, e2, c3, d2, this);
                if (obj2 == f2) {
                    return f2;
                }
            } else {
                Timber.f44337a.b("Unsupported payment type", new Object[0]);
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
            autoloadSetupViewModel.r(new C());
            autoloadSetupViewModel.p(AutoloadSetup.Effect.Success.f36297a);
        } else {
            autoloadSetupViewModel.r(new D());
            autoloadSetupViewModel.p(new AutoloadSetup.Effect.Error(ApiExceptionsKt.a(e4)));
        }
        return Unit.f40552a;
    }
}
