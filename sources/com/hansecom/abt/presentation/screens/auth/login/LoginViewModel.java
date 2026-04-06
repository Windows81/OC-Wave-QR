package com.hansecom.abt.presentation.screens.auth.login;

import com.hansecom.abt.R;
import com.hansecom.abt.data.exceptions.FieldErrorsException;
import com.hansecom.abt.data.useCases.auth.LogInUseCase;
import com.hansecom.abt.presentation.mvi.MviViewModel;
import com.hansecom.abt.presentation.screens.auth.login.Login;
import com.hansecom.abt.util.inputValidators.InputValidators;
import com.hansecom.abt.util.resourcesResolvers.StringValue;
import com.hansecom.abt.util.resourcesResolvers.StringValueKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class LoginViewModel extends MviViewModel<Login.Action, Login.State, Login.Effect> {

    /* renamed from: i  reason: collision with root package name */
    public final LogInUseCase f34305i;

    /* renamed from: j  reason: collision with root package name */
    public final InputValidators.RegexInputValidator f34306j;

    /* renamed from: k  reason: collision with root package name */
    public final InputValidators.NonEmptyValidator f34307k;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public LoginViewModel(androidx.lifecycle.SavedStateHandle r17, com.hansecom.abt.util.inputValidators.InputValidators r18, com.hansecom.abt.AppFeatures r19, com.hansecom.abt.data.useCases.auth.LogInUseCase r20) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r20
            java.lang.String r3 = "savedStateHandle"
            kotlin.jvm.internal.Intrinsics.i(r1, r3)
            java.lang.String r3 = "inputValidators"
            r4 = r18
            kotlin.jvm.internal.Intrinsics.i(r4, r3)
            java.lang.String r3 = "appFeatures"
            r5 = r19
            kotlin.jvm.internal.Intrinsics.i(r5, r3)
            java.lang.String r3 = "logInUseCase"
            kotlin.jvm.internal.Intrinsics.i(r2, r3)
            com.hansecom.abt.presentation.screens.auth.login.Login$State r3 = new com.hansecom.abt.presentation.screens.auth.login.Login$State
            boolean r12 = r19.b()
            boolean r5 = r19.b()
            r13 = r5 ^ 1
            r14 = 63
            r15 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r5 = r3
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r0.<init>(r1, r3)
            r0.f34305i = r2
            com.hansecom.abt.util.inputValidators.InputValidators$RegexInputValidator r1 = r18.z()
            r0.f34306j = r1
            com.hansecom.abt.util.inputValidators.InputValidators$NonEmptyValidator r1 = r18.v()
            r0.f34307k = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.auth.login.LoginViewModel.<init>(androidx.lifecycle.SavedStateHandle, com.hansecom.abt.util.inputValidators.InputValidators, com.hansecom.abt.AppFeatures, com.hansecom.abt.data.useCases.auth.LogInUseCase):void");
    }

    public static final Login.State F(Login.Action action, Login.State state) {
        Intrinsics.i(state, "$this$update");
        String a2 = ((Login.Action.EmailChange) action).a();
        StringValue.Companion companion = StringValue.Companion;
        return Login.State.b(state, a2, companion.a(), (String) null, companion.a(), false, false, false, false, 244, (Object) null);
    }

    public static final Login.State G(Login.Action action, Login.State state) {
        Intrinsics.i(state, "$this$update");
        String a2 = ((Login.Action.PasswordChange) action).a();
        StringValue.Companion companion = StringValue.Companion;
        return Login.State.b(state, (String) null, companion.a(), a2, companion.a(), false, false, false, false, 241, (Object) null);
    }

    public static final Login.State H(Login.State state) {
        Intrinsics.i(state, "$this$update");
        return Login.State.b(state, (String) null, (StringValue) null, (String) null, (StringValue) null, !state.i(), false, false, false, 239, (Object) null);
    }

    public static final Login.State I(Login.Action action, Login.State state) {
        Intrinsics.i(state, "$this$update");
        Login.Action.AutoLogin autoLogin = (Login.Action.AutoLogin) action;
        return Login.State.b(state, autoLogin.a(), (StringValue) null, autoLogin.b(), (StringValue) null, false, false, false, false, 250, (Object) null);
    }

    public static final Login.State K(FieldErrorsException fieldErrorsException, Login.State state) {
        Intrinsics.i(state, "$this$update");
        return Login.State.b(state, (String) null, StringValueKt.b(fieldErrorsException.e()), (String) null, StringValueKt.b(fieldErrorsException.m()), false, false, false, false, 245, (Object) null);
    }

    public static final Login.State M(boolean z2, boolean z3, Login.State state) {
        Intrinsics.i(state, "$this$update");
        return Login.State.b(state, (String) null, z2 ? StringValue.Companion.a() : StringValueKt.c(R.string.E9), (String) null, z3 ? StringValue.Companion.a() : StringValueKt.c(R.string.I9), false, false, false, false, 245, (Object) null);
    }

    public static final Login.State N(Login.State state) {
        Intrinsics.i(state, "$this$update");
        return Login.State.b(state, (String) null, (StringValue) null, (String) null, (StringValue) null, false, true, false, false, 223, (Object) null);
    }

    public static final Login.State O(Login.State state) {
        Intrinsics.i(state, "$this$update");
        return Login.State.b(state, (String) null, (StringValue) null, (String) null, (StringValue) null, false, false, false, false, 223, (Object) null);
    }

    public static final Login.State P(Login.State state) {
        Intrinsics.i(state, "$this$update");
        return Login.State.b(state, (String) null, (StringValue) null, (String) null, (StringValue) null, false, false, false, false, 223, (Object) null);
    }

    /* renamed from: E */
    public Object o(Login.Action action, Continuation continuation) {
        if (action instanceof Login.Action.EmailChange) {
            r(new u(action));
        } else if (action instanceof Login.Action.PasswordChange) {
            r(new v(action));
        } else if (action instanceof Login.Action.PasswordContentVisibilityToggle) {
            r(new w());
        } else if (action instanceof Login.Action.C0007Login) {
            Object L = L(((Login.State) m()).c(), ((Login.State) m()).g(), continuation);
            return L == IntrinsicsKt.f() ? L : Unit.f40552a;
        } else if (action instanceof Login.Action.AutoLogin) {
            r(new x(action));
            Login.Action.AutoLogin autoLogin = (Login.Action.AutoLogin) action;
            Object L2 = L(autoLogin.a(), autoLogin.b(), continuation);
            return L2 == IntrinsicsKt.f() ? L2 : Unit.f40552a;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.f40552a;
    }

    public final void J(FieldErrorsException fieldErrorsException) {
        r(new y(fieldErrorsException));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v9, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object L(java.lang.String r6, java.lang.String r7, kotlin.coroutines.Continuation r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.hansecom.abt.presentation.screens.auth.login.LoginViewModel$signIn$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.hansecom.abt.presentation.screens.auth.login.LoginViewModel$signIn$1 r0 = (com.hansecom.abt.presentation.screens.auth.login.LoginViewModel$signIn$1) r0
            int r1 = r0.H
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.H = r1
            goto L_0x0018
        L_0x0013:
            com.hansecom.abt.presentation.screens.auth.login.LoginViewModel$signIn$1 r0 = new com.hansecom.abt.presentation.screens.auth.login.LoginViewModel$signIn$1
            r0.<init>(r5, r8)
        L_0x0018:
            java.lang.Object r8 = r0.F
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.H
            r3 = 1
            if (r2 == 0) goto L_0x0044
            if (r2 != r3) goto L_0x003c
            java.lang.Object r6 = r0.E
            r7 = r6
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r6 = r0.D
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r0 = r0.C
            com.hansecom.abt.presentation.screens.auth.login.LoginViewModel r0 = (com.hansecom.abt.presentation.screens.auth.login.LoginViewModel) r0
            kotlin.ResultKt.b(r8)
            kotlin.Result r8 = (kotlin.Result) r8
            java.lang.Object r8 = r8.j()
            goto L_0x0084
        L_0x003c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0044:
            kotlin.ResultKt.b(r8)
            com.hansecom.abt.util.inputValidators.InputValidators$RegexInputValidator r8 = r5.f34306j
            boolean r8 = r8.a(r6)
            com.hansecom.abt.util.inputValidators.InputValidators$NonEmptyValidator r2 = r5.f34307k
            boolean r2 = r2.a(r7)
            com.hansecom.abt.presentation.screens.auth.login.q r4 = new com.hansecom.abt.presentation.screens.auth.login.q
            r4.<init>(r8, r2)
            r5.r(r4)
            android.os.Parcelable r8 = r5.m()
            com.hansecom.abt.presentation.screens.auth.login.Login$State r8 = (com.hansecom.abt.presentation.screens.auth.login.Login.State) r8
            boolean r8 = r8.e()
            if (r8 == 0) goto L_0x006a
            kotlin.Unit r6 = kotlin.Unit.f40552a
            return r6
        L_0x006a:
            com.hansecom.abt.presentation.screens.auth.login.r r8 = new com.hansecom.abt.presentation.screens.auth.login.r
            r8.<init>()
            r5.r(r8)
            com.hansecom.abt.data.useCases.auth.LogInUseCase r8 = r5.f34305i
            r0.C = r5
            r0.D = r6
            r0.E = r7
            r0.H = r3
            java.lang.Object r8 = r8.c(r6, r7, r0)
            if (r8 != r1) goto L_0x0083
            return r1
        L_0x0083:
            r0 = r5
        L_0x0084:
            java.lang.Throwable r1 = kotlin.Result.e(r8)
            if (r1 != 0) goto L_0x009d
            kotlin.Unit r8 = (kotlin.Unit) r8
            com.hansecom.abt.presentation.screens.auth.login.s r8 = new com.hansecom.abt.presentation.screens.auth.login.s
            r8.<init>()
            r0.r(r8)
            com.hansecom.abt.presentation.screens.auth.login.Login$Effect$LoginSuccess r8 = new com.hansecom.abt.presentation.screens.auth.login.Login$Effect$LoginSuccess
            r8.<init>(r6, r7)
            r0.p(r8)
            goto L_0x00ed
        L_0x009d:
            com.hansecom.abt.presentation.screens.auth.login.t r7 = new com.hansecom.abt.presentation.screens.auth.login.t
            r7.<init>()
            r0.r(r7)
            boolean r7 = r1 instanceof com.hansecom.abt.api.NotAuthorizedException
            if (r7 == 0) goto L_0x00c1
            r8 = r1
            com.hansecom.abt.api.NotAuthorizedException r8 = (com.hansecom.abt.api.NotAuthorizedException) r8
            java.lang.String r8 = r8.b()
            java.lang.String r2 = "inactive_account"
            boolean r8 = kotlin.jvm.internal.Intrinsics.d(r8, r2)
            if (r8 == 0) goto L_0x00c1
            com.hansecom.abt.presentation.screens.auth.login.Login$Effect$AccountInactive r7 = new com.hansecom.abt.presentation.screens.auth.login.Login$Effect$AccountInactive
            r7.<init>(r6)
            r0.p(r7)
            goto L_0x00ed
        L_0x00c1:
            if (r7 == 0) goto L_0x00d2
            com.hansecom.abt.presentation.screens.auth.login.Login$Effect$LoginFail r6 = new com.hansecom.abt.presentation.screens.auth.login.Login$Effect$LoginFail
            int r7 = com.hansecom.abt.R.string.C9
            com.hansecom.abt.util.resourcesResolvers.StringValue r7 = com.hansecom.abt.util.resourcesResolvers.StringValueKt.c(r7)
            r6.<init>(r7)
            r0.p(r6)
            goto L_0x00ed
        L_0x00d2:
            boolean r6 = r1 instanceof com.hansecom.abt.api.ApiValidationException
            if (r6 == 0) goto L_0x00e1
            com.hansecom.abt.data.exceptions.FieldErrorsException r6 = new com.hansecom.abt.data.exceptions.FieldErrorsException
            com.hansecom.abt.api.ApiValidationException r1 = (com.hansecom.abt.api.ApiValidationException) r1
            r6.<init>(r1)
            r0.J(r6)
            goto L_0x00ed
        L_0x00e1:
            com.hansecom.abt.presentation.screens.auth.login.Login$Effect$LoginFail r6 = new com.hansecom.abt.presentation.screens.auth.login.Login$Effect$LoginFail
            com.hansecom.abt.util.resourcesResolvers.StringValue r7 = com.hansecom.abt.api.ApiExceptionsKt.a(r1)
            r6.<init>(r7)
            r0.p(r6)
        L_0x00ed:
            kotlin.Unit r6 = kotlin.Unit.f40552a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.auth.login.LoginViewModel.L(java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
