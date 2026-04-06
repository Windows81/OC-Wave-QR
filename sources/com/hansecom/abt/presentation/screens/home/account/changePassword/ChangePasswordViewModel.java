package com.hansecom.abt.presentation.screens.home.account.changePassword;

import com.hansecom.abt.data.exceptions.FieldErrorsException;
import com.hansecom.abt.data.useCases.account.ChangePasswordUseCase;
import com.hansecom.abt.data.useCases.account.GetUserEmailUseCase;
import com.hansecom.abt.presentation.mvi.MviViewModel;
import com.hansecom.abt.presentation.screens.home.account.changePassword.ChangePassword;
import com.hansecom.abt.util.inputValidators.InputValidators;
import com.hansecom.abt.util.resourcesResolvers.StringValue;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class ChangePasswordViewModel extends MviViewModel<ChangePassword.Action, ChangePassword.State, ChangePassword.Effect> {

    /* renamed from: i  reason: collision with root package name */
    public final ChangePasswordUseCase f35299i;

    /* renamed from: j  reason: collision with root package name */
    public final GetUserEmailUseCase f35300j;

    /* renamed from: k  reason: collision with root package name */
    public final InputValidators.RegexInputValidator f35301k;

    /* renamed from: l  reason: collision with root package name */
    public final InputValidators.InputValidator f35302l;

    /* renamed from: m  reason: collision with root package name */
    public String f35303m = "";

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ChangePasswordViewModel(androidx.lifecycle.SavedStateHandle r21, com.hansecom.abt.util.inputValidators.InputValidators r22, com.hansecom.abt.data.useCases.account.ChangePasswordUseCase r23, com.hansecom.abt.data.useCases.account.GetUserEmailUseCase r24) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = r22
            r3 = r23
            r4 = r24
            java.lang.String r5 = "savedStateHandle"
            kotlin.jvm.internal.Intrinsics.i(r1, r5)
            java.lang.String r5 = "inputValidators"
            kotlin.jvm.internal.Intrinsics.i(r2, r5)
            java.lang.String r5 = "changePasswordUseCase"
            kotlin.jvm.internal.Intrinsics.i(r3, r5)
            java.lang.String r5 = "getUserEmailUseCase"
            kotlin.jvm.internal.Intrinsics.i(r4, r5)
            com.hansecom.abt.presentation.screens.home.account.changePassword.ChangePassword$State r5 = new com.hansecom.abt.presentation.screens.home.account.changePassword.ChangePassword$State
            r18 = 2047(0x7ff, float:2.868E-42)
            r19 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r6 = r5
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r0.<init>(r1, r5)
            r0.f35299i = r3
            r0.f35300j = r4
            com.hansecom.abt.util.inputValidators.InputValidators$RegexInputValidator r1 = r22.w()
            r0.f35301k = r1
            com.hansecom.abt.presentation.screens.home.account.changePassword.n r1 = new com.hansecom.abt.presentation.screens.home.account.changePassword.n
            r1.<init>(r0)
            com.hansecom.abt.util.inputValidators.InputValidators$InputValidator r1 = r2.n(r1)
            r0.f35302l = r1
            java.lang.String r1 = ""
            r0.f35303m = r1
            kotlinx.coroutines.CoroutineScope r2 = androidx.lifecycle.ViewModelKt.a(r20)
            com.hansecom.abt.presentation.screens.home.account.changePassword.ChangePasswordViewModel$1 r5 = new com.hansecom.abt.presentation.screens.home.account.changePassword.ChangePasswordViewModel$1
            r1 = 0
            r5.<init>(r0, r1)
            r6 = 3
            r3 = 0
            r4 = 0
            kotlinx.coroutines.Job unused = kotlinx.coroutines.BuildersKt__Builders_commonKt.d(r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.account.changePassword.ChangePasswordViewModel.<init>(androidx.lifecycle.SavedStateHandle, com.hansecom.abt.util.inputValidators.InputValidators, com.hansecom.abt.data.useCases.account.ChangePasswordUseCase, com.hansecom.abt.data.useCases.account.GetUserEmailUseCase):void");
    }

    public static final ChangePassword.State J(ChangePassword.Action action, ChangePasswordViewModel changePasswordViewModel, ChangePassword.State state) {
        ChangePassword.State state2 = state;
        Intrinsics.i(state2, "$this$update");
        return ChangePassword.State.b(state2, changePasswordViewModel.f35303m, ((ChangePassword.Action.OldPasswordChange) action).a(), StringValue.Companion.a(), false, (String) null, false, false, (String) null, false, false, false, 2040, (Object) null);
    }

    public static final ChangePassword.State K(ChangePassword.Action action, ChangePassword.State state) {
        Intrinsics.i(state, "$this$update");
        return ChangePassword.State.b(state, (String) null, (String) null, (StringValue) null, false, ((ChangePassword.Action.NewPasswordChange) action).a(), true, false, (String) null, false, false, false, 1999, (Object) null);
    }

    public static final ChangePassword.State L(ChangePassword.Action action, ChangePassword.State state) {
        Intrinsics.i(state, "$this$update");
        return ChangePassword.State.b(state, (String) null, (String) null, (StringValue) null, false, (String) null, false, false, ((ChangePassword.Action.NewPasswordConfirmationChange) action).a(), true, false, false, 1663, (Object) null);
    }

    public static final ChangePassword.State M(ChangePasswordViewModel changePasswordViewModel, ChangePassword.State state) {
        Intrinsics.i(state, "$this$update");
        return ChangePassword.State.b(state, (String) null, (String) null, (StringValue) null, !((ChangePassword.State) changePasswordViewModel.m()).o(), (String) null, false, false, (String) null, false, false, false, 2039, (Object) null);
    }

    public static final ChangePassword.State N(ChangePasswordViewModel changePasswordViewModel, ChangePassword.State state) {
        Intrinsics.i(state, "$this$update");
        return ChangePassword.State.b(state, (String) null, (String) null, (StringValue) null, false, (String) null, false, !((ChangePassword.State) changePasswordViewModel.m()).n(), (String) null, false, false, false, 1983, (Object) null);
    }

    public static final ChangePassword.State O(ChangePasswordViewModel changePasswordViewModel, ChangePassword.State state) {
        Intrinsics.i(state, "$this$update");
        return ChangePassword.State.b(state, (String) null, (String) null, (StringValue) null, false, (String) null, false, false, (String) null, false, !((ChangePassword.State) changePasswordViewModel.m()).l(), false, 1535, (Object) null);
    }

    public static final String P(ChangePasswordViewModel changePasswordViewModel) {
        return ((ChangePassword.State) changePasswordViewModel.m()).e();
    }

    public static final ChangePassword.State R(Throwable th, ChangePassword.State state) {
        Intrinsics.i(state, "$this$update");
        StringValue k2 = ((FieldErrorsException) th).k();
        if (k2 == null) {
            k2 = StringValue.Companion.a();
        }
        return ChangePassword.State.b(state, (String) null, (String) null, k2, false, (String) null, false, false, (String) null, false, false, false, 2043, (Object) null);
    }

    public static final ChangePassword.State S(ChangePassword.State state) {
        Intrinsics.i(state, "$this$update");
        return ChangePassword.State.b(state, (String) null, (String) null, (StringValue) null, false, (String) null, false, false, (String) null, false, false, false, 1023, (Object) null);
    }

    public static final ChangePassword.State T(ChangePassword.State state) {
        Intrinsics.i(state, "$this$update");
        return ChangePassword.State.b(state, (String) null, (String) null, (StringValue) null, false, (String) null, false, false, (String) null, false, false, true, 1023, (Object) null);
    }

    public static final ChangePassword.State U(ChangePassword.State state) {
        Intrinsics.i(state, "$this$update");
        return ChangePassword.State.b(state, (String) null, (String) null, (StringValue) null, false, (String) null, false, false, (String) null, false, false, false, 1023, (Object) null);
    }

    public static final ChangePassword.State W(ChangePasswordViewModel changePasswordViewModel, ChangePassword.State state) {
        ChangePasswordViewModel changePasswordViewModel2 = changePasswordViewModel;
        ChangePassword.State state2 = state;
        Intrinsics.i(state2, "$this$update");
        return ChangePassword.State.b(state2, (String) null, (String) null, (StringValue) null, false, (String) null, changePasswordViewModel2.f35301k.a(((ChangePassword.State) changePasswordViewModel.m()).e()), false, (String) null, changePasswordViewModel2.f35302l.a(((ChangePassword.State) changePasswordViewModel.m()).f()), false, false, 1759, (Object) null);
    }

    /* renamed from: I */
    public Object o(ChangePassword.Action action, Continuation continuation) {
        if (action instanceof ChangePassword.Action.OldPasswordChange) {
            r(new s(action, this));
        } else if (action instanceof ChangePassword.Action.NewPasswordChange) {
            r(new t(action));
        } else if (action instanceof ChangePassword.Action.NewPasswordConfirmationChange) {
            r(new u(action));
        } else if (Intrinsics.d(action, ChangePassword.Action.OldPasswordVisibilityToggle.f35289a)) {
            r(new v(this));
        } else if (Intrinsics.d(action, ChangePassword.Action.NewPasswordVisibilityToggle.f35287a)) {
            r(new w(this));
        } else if (Intrinsics.d(action, ChangePassword.Action.NewPasswordConfirmationVisibilityToggle.f35286a)) {
            r(new x(this));
        } else if (action instanceof ChangePassword.Action.Confirm) {
            Object Q = Q(continuation);
            return Q == IntrinsicsKt.f() ? Q : Unit.f40552a;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.f40552a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object Q(kotlin.coroutines.Continuation r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.hansecom.abt.presentation.screens.home.account.changePassword.ChangePasswordViewModel$save$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.hansecom.abt.presentation.screens.home.account.changePassword.ChangePasswordViewModel$save$1 r0 = (com.hansecom.abt.presentation.screens.home.account.changePassword.ChangePasswordViewModel$save$1) r0
            int r1 = r0.F
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.F = r1
            goto L_0x0018
        L_0x0013:
            com.hansecom.abt.presentation.screens.home.account.changePassword.ChangePasswordViewModel$save$1 r0 = new com.hansecom.abt.presentation.screens.home.account.changePassword.ChangePasswordViewModel$save$1
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.D
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.F
            r3 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            java.lang.Object r0 = r0.C
            com.hansecom.abt.presentation.screens.home.account.changePassword.ChangePasswordViewModel r0 = (com.hansecom.abt.presentation.screens.home.account.changePassword.ChangePasswordViewModel) r0
            kotlin.ResultKt.b(r6)
            kotlin.Result r6 = (kotlin.Result) r6
            java.lang.Object r6 = r6.j()
            goto L_0x007a
        L_0x0033:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x003b:
            kotlin.ResultKt.b(r6)
            r5.V()
            android.os.Parcelable r6 = r5.m()
            com.hansecom.abt.presentation.screens.home.account.changePassword.ChangePassword$State r6 = (com.hansecom.abt.presentation.screens.home.account.changePassword.ChangePassword.State) r6
            boolean r6 = r6.d()
            if (r6 == 0) goto L_0x0050
            kotlin.Unit r6 = kotlin.Unit.f40552a
            return r6
        L_0x0050:
            com.hansecom.abt.presentation.screens.home.account.changePassword.m r6 = new com.hansecom.abt.presentation.screens.home.account.changePassword.m
            r6.<init>()
            r5.r(r6)
            com.hansecom.abt.data.useCases.account.ChangePasswordUseCase r6 = r5.f35299i
            android.os.Parcelable r2 = r5.m()
            com.hansecom.abt.presentation.screens.home.account.changePassword.ChangePassword$State r2 = (com.hansecom.abt.presentation.screens.home.account.changePassword.ChangePassword.State) r2
            java.lang.String r2 = r2.i()
            android.os.Parcelable r4 = r5.m()
            com.hansecom.abt.presentation.screens.home.account.changePassword.ChangePassword$State r4 = (com.hansecom.abt.presentation.screens.home.account.changePassword.ChangePassword.State) r4
            java.lang.String r4 = r4.e()
            r0.C = r5
            r0.F = r3
            java.lang.Object r6 = r6.b(r2, r4, r0)
            if (r6 != r1) goto L_0x0079
            return r1
        L_0x0079:
            r0 = r5
        L_0x007a:
            java.lang.Throwable r1 = kotlin.Result.e(r6)
            if (r1 != 0) goto L_0x009f
            kotlin.Unit r6 = (kotlin.Unit) r6
            com.hansecom.abt.presentation.screens.home.account.changePassword.p r6 = new com.hansecom.abt.presentation.screens.home.account.changePassword.p
            r6.<init>()
            r0.r(r6)
            com.hansecom.abt.presentation.screens.home.account.changePassword.ChangePassword$Effect$Success r6 = new com.hansecom.abt.presentation.screens.home.account.changePassword.ChangePassword$Effect$Success
            java.lang.String r1 = r0.f35303m
            android.os.Parcelable r2 = r0.m()
            com.hansecom.abt.presentation.screens.home.account.changePassword.ChangePassword$State r2 = (com.hansecom.abt.presentation.screens.home.account.changePassword.ChangePassword.State) r2
            java.lang.String r2 = r2.e()
            r6.<init>(r1, r2)
            r0.p(r6)
            goto L_0x00c0
        L_0x009f:
            boolean r6 = r1 instanceof com.hansecom.abt.data.exceptions.FieldErrorsException
            if (r6 == 0) goto L_0x00ac
            com.hansecom.abt.presentation.screens.home.account.changePassword.q r6 = new com.hansecom.abt.presentation.screens.home.account.changePassword.q
            r6.<init>(r1)
            r0.r(r6)
            goto L_0x00b8
        L_0x00ac:
            com.hansecom.abt.presentation.screens.home.account.changePassword.ChangePassword$Effect$Error r6 = new com.hansecom.abt.presentation.screens.home.account.changePassword.ChangePassword$Effect$Error
            com.hansecom.abt.util.resourcesResolvers.StringValue r1 = com.hansecom.abt.api.ApiExceptionsKt.a(r1)
            r6.<init>(r1)
            r0.p(r6)
        L_0x00b8:
            com.hansecom.abt.presentation.screens.home.account.changePassword.r r6 = new com.hansecom.abt.presentation.screens.home.account.changePassword.r
            r6.<init>()
            r0.r(r6)
        L_0x00c0:
            kotlin.Unit r6 = kotlin.Unit.f40552a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.account.changePassword.ChangePasswordViewModel.Q(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void V() {
        r(new o(this));
    }
}
