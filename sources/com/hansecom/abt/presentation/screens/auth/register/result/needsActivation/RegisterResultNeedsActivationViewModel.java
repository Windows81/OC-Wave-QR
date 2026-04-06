package com.hansecom.abt.presentation.screens.auth.register.result.needsActivation;

import androidx.lifecycle.SavedStateHandle;
import androidx.navigation.SavedStateHandleKt;
import com.hansecom.abt.data.useCases.auth.ResendActivationEmailUseCase;
import com.hansecom.abt.presentation.mvi.MviViewModel;
import com.hansecom.abt.presentation.screens.auth.RegisterResultNeedsActivationDestination;
import com.hansecom.abt.presentation.screens.auth.register.result.needsActivation.RegisterResultNeedsActivation;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

@Metadata
public final class RegisterResultNeedsActivationViewModel extends MviViewModel<RegisterResultNeedsActivation.Action, RegisterResultNeedsActivation.State, RegisterResultNeedsActivation.Effect> {

    /* renamed from: i  reason: collision with root package name */
    public final ResendActivationEmailUseCase f34558i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RegisterResultNeedsActivationViewModel(SavedStateHandle savedStateHandle, ResendActivationEmailUseCase resendActivationEmailUseCase) {
        super(savedStateHandle, new RegisterResultNeedsActivation.State(((RegisterResultNeedsActivationDestination) SavedStateHandleKt.a(savedStateHandle, Reflection.b(RegisterResultNeedsActivationDestination.class), MapsKt.h())).a(), false, 2, (DefaultConstructorMarker) null));
        Intrinsics.i(savedStateHandle, "savedStateHandle");
        Intrinsics.i(resendActivationEmailUseCase, "resendActivationEmailUseCase");
        this.f34558i = resendActivationEmailUseCase;
    }

    public static final RegisterResultNeedsActivation.State A(RegisterResultNeedsActivation.State state) {
        Intrinsics.i(state, "$this$update");
        return RegisterResultNeedsActivation.State.b(state, (String) null, true, 1, (Object) null);
    }

    public static final RegisterResultNeedsActivation.State B(RegisterResultNeedsActivation.State state) {
        Intrinsics.i(state, "$this$update");
        return RegisterResultNeedsActivation.State.b(state, (String) null, false, 1, (Object) null);
    }

    public static final RegisterResultNeedsActivation.State C(RegisterResultNeedsActivation.State state) {
        Intrinsics.i(state, "$this$update");
        return RegisterResultNeedsActivation.State.b(state, (String) null, false, 1, (Object) null);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object z(kotlin.coroutines.Continuation r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.hansecom.abt.presentation.screens.auth.register.result.needsActivation.RegisterResultNeedsActivationViewModel$resendEmail$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.hansecom.abt.presentation.screens.auth.register.result.needsActivation.RegisterResultNeedsActivationViewModel$resendEmail$1 r0 = (com.hansecom.abt.presentation.screens.auth.register.result.needsActivation.RegisterResultNeedsActivationViewModel$resendEmail$1) r0
            int r1 = r0.F
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.F = r1
            goto L_0x0018
        L_0x0013:
            com.hansecom.abt.presentation.screens.auth.register.result.needsActivation.RegisterResultNeedsActivationViewModel$resendEmail$1 r0 = new com.hansecom.abt.presentation.screens.auth.register.result.needsActivation.RegisterResultNeedsActivationViewModel$resendEmail$1
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.D
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.F
            r3 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            java.lang.Object r0 = r0.C
            com.hansecom.abt.presentation.screens.auth.register.result.needsActivation.RegisterResultNeedsActivationViewModel r0 = (com.hansecom.abt.presentation.screens.auth.register.result.needsActivation.RegisterResultNeedsActivationViewModel) r0
            kotlin.ResultKt.b(r5)
            kotlin.Result r5 = (kotlin.Result) r5
            java.lang.Object r5 = r5.j()
            goto L_0x005e
        L_0x0033:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x003b:
            kotlin.ResultKt.b(r5)
            com.hansecom.abt.presentation.screens.auth.register.result.needsActivation.h r5 = new com.hansecom.abt.presentation.screens.auth.register.result.needsActivation.h
            r5.<init>()
            r4.r(r5)
            com.hansecom.abt.data.useCases.auth.ResendActivationEmailUseCase r5 = r4.f34558i
            android.os.Parcelable r2 = r4.m()
            com.hansecom.abt.presentation.screens.auth.register.result.needsActivation.RegisterResultNeedsActivation$State r2 = (com.hansecom.abt.presentation.screens.auth.register.result.needsActivation.RegisterResultNeedsActivation.State) r2
            java.lang.String r2 = r2.c()
            r0.C = r4
            r0.F = r3
            java.lang.Object r5 = r5.b(r2, r0)
            if (r5 != r1) goto L_0x005d
            return r1
        L_0x005d:
            r0 = r4
        L_0x005e:
            java.lang.Throwable r1 = kotlin.Result.e(r5)
            if (r1 != 0) goto L_0x0081
            kotlin.Unit r5 = (kotlin.Unit) r5
            com.hansecom.abt.presentation.screens.auth.register.result.needsActivation.i r5 = new com.hansecom.abt.presentation.screens.auth.register.result.needsActivation.i
            r5.<init>()
            r0.r(r5)
            com.hansecom.abt.presentation.screens.auth.register.result.needsActivation.RegisterResultNeedsActivation$Effect$Success r5 = new com.hansecom.abt.presentation.screens.auth.register.result.needsActivation.RegisterResultNeedsActivation$Effect$Success
            android.os.Parcelable r1 = r0.m()
            com.hansecom.abt.presentation.screens.auth.register.result.needsActivation.RegisterResultNeedsActivation$State r1 = (com.hansecom.abt.presentation.screens.auth.register.result.needsActivation.RegisterResultNeedsActivation.State) r1
            java.lang.String r1 = r1.c()
            r5.<init>(r1)
            r0.p(r5)
            goto L_0x0095
        L_0x0081:
            com.hansecom.abt.presentation.screens.auth.register.result.needsActivation.j r5 = new com.hansecom.abt.presentation.screens.auth.register.result.needsActivation.j
            r5.<init>()
            r0.r(r5)
            com.hansecom.abt.presentation.screens.auth.register.result.needsActivation.RegisterResultNeedsActivation$Effect$Error r5 = new com.hansecom.abt.presentation.screens.auth.register.result.needsActivation.RegisterResultNeedsActivation$Effect$Error
            com.hansecom.abt.util.resourcesResolvers.StringValue r1 = com.hansecom.abt.api.ApiExceptionsKt.a(r1)
            r5.<init>(r1)
            r0.p(r5)
        L_0x0095:
            kotlin.Unit r5 = kotlin.Unit.f40552a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.auth.register.result.needsActivation.RegisterResultNeedsActivationViewModel.z(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* renamed from: y */
    public Object o(RegisterResultNeedsActivation.Action action, Continuation continuation) {
        if (Intrinsics.d(action, RegisterResultNeedsActivation.Action.Resend.f34548a)) {
            Object z2 = z(continuation);
            return z2 == IntrinsicsKt.f() ? z2 : Unit.f40552a;
        }
        throw new NoWhenBranchMatchedException();
    }
}
