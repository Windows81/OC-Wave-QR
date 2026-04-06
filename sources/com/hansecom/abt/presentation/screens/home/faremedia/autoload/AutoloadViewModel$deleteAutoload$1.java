package com.hansecom.abt.presentation.screens.home.faremedia.autoload;

import com.hansecom.abt.api.ApiExceptionsKt;
import com.hansecom.abt.data.useCases.autoload.DeleteAutoloadUseCase;
import com.hansecom.abt.presentation.screens.home.faremedia.autoload.Autoload;
import com.hansecom.mapi.models.FareMediaAutoload;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.presentation.screens.home.faremedia.autoload.AutoloadViewModel$deleteAutoload$1", f = "AutoloadViewModel.kt", l = {160}, m = "invokeSuspend")
public final class AutoloadViewModel$deleteAutoload$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public Object D;
    public int E;
    public final /* synthetic */ AutoloadViewModel F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AutoloadViewModel$deleteAutoload$1(AutoloadViewModel autoloadViewModel, Continuation continuation) {
        super(2, continuation);
        this.F = autoloadViewModel;
    }

    public static final Autoload.State E(Autoload.State state) {
        return Autoload.State.b(state, (String) null, (AutoloadState) null, (BigDecimal) null, Autoload.State.LoadState.DELETING, false, 23, (Object) null);
    }

    public static final Autoload.State F(Autoload.State state) {
        return Autoload.State.b(state, (String) null, (AutoloadState) null, (BigDecimal) null, Autoload.State.LoadState.IDLE, false, 7, (Object) null);
    }

    public static final Autoload.State G(Autoload.State state) {
        return Autoload.State.b(state, (String) null, (AutoloadState) null, (BigDecimal) null, Autoload.State.LoadState.IDLE, false, 7, (Object) null);
    }

    /* renamed from: D */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((AutoloadViewModel$deleteAutoload$1) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        return new AutoloadViewModel$deleteAutoload$1(this.F, continuation);
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
                autoloadViewModel2.r(new v());
                DeleteAutoloadUseCase z2 = autoloadViewModel2.f36246k;
                String A2 = autoloadViewModel2.f36247l;
                long f3 = c2.f();
                this.D = autoloadViewModel2;
                this.E = 1;
                obj2 = z2.a(A2, f3, this);
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
        Throwable e2 = Result.e(obj2);
        if (e2 == null) {
            FareMediaAutoload fareMediaAutoload = (FareMediaAutoload) obj2;
            autoloadViewModel.r(new w());
            autoloadViewModel.p(Autoload.Effect.DeleteSuccess.f36225a);
        } else {
            autoloadViewModel.r(new x());
            autoloadViewModel.p(new Autoload.Effect.Error(ApiExceptionsKt.a(e2)));
        }
        return Unit.f40552a;
    }
}
