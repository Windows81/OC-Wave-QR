package com.hansecom.abt.presentation.screens.home.faremedia.addValue.cashPayment.instructions;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModelKt;
import com.hansecom.abt.data.preferences.AppPreferences;
import com.hansecom.abt.presentation.mvi.MviViewModel;
import com.hansecom.abt.presentation.screens.home.faremedia.addValue.cashPayment.instructions.FareMediaAddValueCashPaymentInstructions;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;

@Metadata
public final class FareMediaAddValueCashPaymentInstructionsViewModel extends MviViewModel<FareMediaAddValueCashPaymentInstructions.Action, FareMediaAddValueCashPaymentInstructions.State, FareMediaAddValueCashPaymentInstructions.Effect> {

    /* renamed from: i  reason: collision with root package name */
    public final AppPreferences f36177i;

    @Metadata
    @DebugMetadata(c = "com.hansecom.abt.presentation.screens.home.faremedia.addValue.cashPayment.instructions.FareMediaAddValueCashPaymentInstructionsViewModel$1", f = "FareMediaAddValueCashPaymentInstructionsViewModel.kt", l = {22, 27}, m = "invokeSuspend")
    /* renamed from: com.hansecom.abt.presentation.screens.home.faremedia.addValue.cashPayment.instructions.FareMediaAddValueCashPaymentInstructionsViewModel$1  reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int D;
        public final /* synthetic */ FareMediaAddValueCashPaymentInstructionsViewModel E;

        {
            this.E = r1;
        }

        public static final FareMediaAddValueCashPaymentInstructions.State C(boolean z2, FareMediaAddValueCashPaymentInstructions.State state) {
            return state.a(!z2);
        }

        /* renamed from: B */
        public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
            return ((AnonymousClass1) s(coroutineScope, continuation)).x(Unit.f40552a);
        }

        public final Continuation s(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.E, continuation);
        }

        public final Object x(Object obj) {
            Object f2 = IntrinsicsKt.f();
            int i2 = this.D;
            if (i2 == 0) {
                ResultKt.b(obj);
                AppPreferences u2 = this.E.f36177i;
                this.D = 1;
                obj = u2.b(this);
                if (obj == f2) {
                    return f2;
                }
            } else if (i2 == 1) {
                ResultKt.b(obj);
            } else if (i2 == 2) {
                ResultKt.b(obj);
                return Unit.f40552a;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            boolean booleanValue = ((Boolean) obj).booleanValue();
            this.E.r(new f(booleanValue));
            if (!booleanValue) {
                AppPreferences u3 = this.E.f36177i;
                this.D = 2;
                if (u3.f(true, this) == f2) {
                    return f2;
                }
            }
            return Unit.f40552a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FareMediaAddValueCashPaymentInstructionsViewModel(SavedStateHandle savedStateHandle, AppPreferences appPreferences) {
        super(savedStateHandle, new FareMediaAddValueCashPaymentInstructions.State(false, 1, (DefaultConstructorMarker) null));
        Intrinsics.i(savedStateHandle, "savedStateHandle");
        Intrinsics.i(appPreferences, "appPreferences");
        this.f36177i = appPreferences;
        Job unused = BuildersKt__Builders_commonKt.d(ViewModelKt.a(this), (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, (Continuation) null), 3, (Object) null);
    }

    /* renamed from: w */
    public Object o(FareMediaAddValueCashPaymentInstructions.Action action, Continuation continuation) {
        return Unit.f40552a;
    }
}
