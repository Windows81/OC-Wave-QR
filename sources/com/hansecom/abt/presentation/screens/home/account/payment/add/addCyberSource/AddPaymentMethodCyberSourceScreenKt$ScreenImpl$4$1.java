package com.hansecom.abt.presentation.screens.home.account.payment.add.addCyberSource;

import androidx.compose.material3.SnackbarDuration;
import com.hansecom.abt.presentation.screens.home.account.payment.add.addCyberSource.AddPaymentMethodCyberSource;
import com.hansecom.abt.ui.components.snackbar.AbtSnackbarHostState;
import com.hansecom.abt.ui.components.snackbar.SnackbarType;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Job;

@Metadata
@DebugMetadata(c = "com.hansecom.abt.presentation.screens.home.account.payment.add.addCyberSource.AddPaymentMethodCyberSourceScreenKt$ScreenImpl$4$1", f = "AddPaymentMethodCyberSourceScreen.kt", l = {138}, m = "invokeSuspend")
public final class AddPaymentMethodCyberSourceScreenKt$ScreenImpl$4$1 extends SuspendLambda implements Function2<AddPaymentMethodCyberSource.Effect, Continuation<? super Unit>, Object> {
    public int D;
    public /* synthetic */ Object E;
    public final /* synthetic */ AbtSnackbarHostState F;
    public final /* synthetic */ Function0 G;
    public final /* synthetic */ CoroutineScope H;
    public final /* synthetic */ Function0 I;

    @Metadata
    @DebugMetadata(c = "com.hansecom.abt.presentation.screens.home.account.payment.add.addCyberSource.AddPaymentMethodCyberSourceScreenKt$ScreenImpl$4$1$1", f = "AddPaymentMethodCyberSourceScreen.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.hansecom.abt.presentation.screens.home.account.payment.add.addCyberSource.AddPaymentMethodCyberSourceScreenKt$ScreenImpl$4$1$1  reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int D;

        /* renamed from: A */
        public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
            return ((AnonymousClass1) s(coroutineScope, continuation)).x(Unit.f40552a);
        }

        public final Continuation s(Object obj, Continuation continuation) {
            return new AnonymousClass1(abtSnackbarHostState, effect, continuation);
        }

        public final Object x(Object obj) {
            IntrinsicsKt.f();
            if (this.D == 0) {
                ResultKt.b(obj);
                AbtSnackbarHostState.d(abtSnackbarHostState, ((AddPaymentMethodCyberSource.Effect.InitialLoadingError) effect).a(), (SnackbarType) null, (String) null, false, (SnackbarDuration) null, (CoroutineScope) null, 62, (Object) null);
                return Unit.f40552a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddPaymentMethodCyberSourceScreenKt$ScreenImpl$4$1(AbtSnackbarHostState abtSnackbarHostState, Function0 function0, CoroutineScope coroutineScope, Function0 function02, Continuation continuation) {
        super(2, continuation);
        this.F = abtSnackbarHostState;
        this.G = function0;
        this.H = coroutineScope;
        this.I = function02;
    }

    /* renamed from: A */
    public final Object m(AddPaymentMethodCyberSource.Effect effect, Continuation continuation) {
        return ((AddPaymentMethodCyberSourceScreenKt$ScreenImpl$4$1) s(effect, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        AddPaymentMethodCyberSourceScreenKt$ScreenImpl$4$1 addPaymentMethodCyberSourceScreenKt$ScreenImpl$4$1 = new AddPaymentMethodCyberSourceScreenKt$ScreenImpl$4$1(this.F, this.G, this.H, this.I, continuation);
        addPaymentMethodCyberSourceScreenKt$ScreenImpl$4$1.E = obj;
        return addPaymentMethodCyberSourceScreenKt$ScreenImpl$4$1;
    }

    public final Object x(Object obj) {
        Object f2 = IntrinsicsKt.f();
        int i2 = this.D;
        if (i2 == 0) {
            ResultKt.b(obj);
            final AddPaymentMethodCyberSource.Effect effect = (AddPaymentMethodCyberSource.Effect) this.E;
            if (effect instanceof AddPaymentMethodCyberSource.Effect.Error) {
                AbtSnackbarHostState.d(this.F, ((AddPaymentMethodCyberSource.Effect.Error) effect).a(), (SnackbarType) null, (String) null, false, (SnackbarDuration) null, (CoroutineScope) null, 62, (Object) null);
            } else if (Intrinsics.d(effect, AddPaymentMethodCyberSource.Effect.Success.f35546a)) {
                this.D = 1;
                if (DelayKt.b(2000, this) == f2) {
                    return f2;
                }
            } else if (effect instanceof AddPaymentMethodCyberSource.Effect.InitialLoadingError) {
                CoroutineScope coroutineScope = this.H;
                final AbtSnackbarHostState abtSnackbarHostState = this.F;
                Job unused = BuildersKt__Builders_commonKt.d(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1((Continuation) null), 3, (Object) null);
                this.I.invoke();
            } else {
                throw new NoWhenBranchMatchedException();
            }
            return Unit.f40552a;
        } else if (i2 == 1) {
            ResultKt.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.G.invoke();
        return Unit.f40552a;
    }
}
