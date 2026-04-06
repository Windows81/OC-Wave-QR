package com.hansecom.abt.presentation.screens.home.faremedia.autoload;

import com.hansecom.abt.api.ApiExceptionsKt;
import com.hansecom.abt.data.useCases.autoload.ChangeAutoloadUseCase;
import com.hansecom.abt.presentation.model.PaymentMethodState;
import com.hansecom.abt.presentation.screens.home.faremedia.autoload.Autoload;
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
import kotlinx.coroutines.CoroutineScope;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.presentation.screens.home.faremedia.autoload.AutoloadViewModel$setAutoloadPaused$1", f = "AutoloadViewModel.kt", l = {135}, m = "invokeSuspend")
public final class AutoloadViewModel$setAutoloadPaused$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public Object D;
    public int E;
    public final /* synthetic */ AutoloadViewModel F;
    public final /* synthetic */ boolean G;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AutoloadViewModel$setAutoloadPaused$1(AutoloadViewModel autoloadViewModel, boolean z2, Continuation continuation) {
        super(2, continuation);
        this.F = autoloadViewModel;
        this.G = z2;
    }

    public static final Autoload.State E(boolean z2, Autoload.State state) {
        return Autoload.State.b(state, (String) null, (AutoloadState) null, (BigDecimal) null, z2 ? Autoload.State.LoadState.PAUSING : Autoload.State.LoadState.ACTIVATING, false, 23, (Object) null);
    }

    /* access modifiers changed from: private */
    public static final Autoload.State F(Autoload.State state) {
        return Autoload.State.b(state, (String) null, (AutoloadState) null, (BigDecimal) null, Autoload.State.LoadState.IDLE, false, 23, (Object) null);
    }

    /* access modifiers changed from: private */
    public static final Autoload.State G(Autoload.State state) {
        return Autoload.State.b(state, (String) null, (AutoloadState) null, (BigDecimal) null, Autoload.State.LoadState.IDLE, false, 23, (Object) null);
    }

    /* renamed from: D */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((AutoloadViewModel$setAutoloadPaused$1) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        return new AutoloadViewModel$setAutoloadPaused$1(this.F, this.G, continuation);
    }

    public final Object x(Object obj) {
        Object obj2;
        AutoloadViewModel autoloadViewModel;
        Object f2 = IntrinsicsKt.f();
        int i2 = this.E;
        if (i2 == 0) {
            ResultKt.b(obj);
            AutoloadState c2 = ((Autoload.State) this.F.m()).c();
            if (c2 != null) {
                AutoloadViewModel autoloadViewModel2 = this.F;
                boolean z2 = this.G;
                autoloadViewModel2.r(new y(z2));
                ChangeAutoloadUseCase x2 = autoloadViewModel2.f36245j;
                String A2 = autoloadViewModel2.f36247l;
                long f3 = c2.f();
                BigDecimal c3 = c2.c();
                BigDecimal e2 = c2.e();
                PaymentMethodState.CreditCard g2 = c2.g();
                Intrinsics.f(g2);
                long c4 = g2.c();
                PaymentMethodState.CreditCard d2 = c2.d();
                Long d3 = d2 != null ? Boxing.d(d2.c()) : null;
                this.D = autoloadViewModel2;
                this.E = 1;
                obj2 = x2.a(A2, f3, z2, c3, e2, c4, d3, this);
                if (obj2 == f2) {
                    return f2;
                }
                autoloadViewModel = autoloadViewModel2;
            }
            return Unit.f40552a;
        } else if (i2 == 1) {
            autoloadViewModel = (AutoloadViewModel) this.D;
            ResultKt.b(obj);
            obj2 = ((Result) obj).j();
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Throwable e3 = Result.e(obj2);
        if (e3 == null) {
            FareMediaAutoload fareMediaAutoload = (FareMediaAutoload) obj2;
            autoloadViewModel.r(new z());
        } else {
            autoloadViewModel.r(new A());
            autoloadViewModel.p(new Autoload.Effect.Error(ApiExceptionsKt.a(e3)));
        }
        return Unit.f40552a;
    }
}
