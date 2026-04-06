package com.hansecom.abt.presentation.screens.home.account.information;

import com.hansecom.abt.R;
import com.hansecom.abt.data.exceptions.FieldErrorsException;
import com.hansecom.abt.data.repositories.UserRepository;
import com.hansecom.abt.data.useCases.account.ChangeAccountInfoUseCase;
import com.hansecom.abt.data.useCases.configurations.GetSignUpConfigurationUseCase;
import com.hansecom.abt.presentation.mvi.MviViewModel;
import com.hansecom.abt.presentation.screens.home.account.information.AccountInformation;
import com.hansecom.abt.util.inputValidators.InputValidators;
import com.hansecom.abt.util.resourcesResolvers.StringValue;
import com.hansecom.abt.util.resourcesResolvers.StringValueKt;
import com.hansecom.mapi.models.User;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata
public final class AccountInformationViewModel extends MviViewModel<AccountInformation.Action, AccountInformation.State, AccountInformation.Effect> {

    /* renamed from: i  reason: collision with root package name */
    public final UserRepository f35448i;

    /* renamed from: j  reason: collision with root package name */
    public final ChangeAccountInfoUseCase f35449j;

    /* renamed from: k  reason: collision with root package name */
    public final GetSignUpConfigurationUseCase f35450k;

    /* renamed from: l  reason: collision with root package name */
    public final InputValidators.InputValidator f35451l;

    /* renamed from: m  reason: collision with root package name */
    public final InputValidators.InputValidator f35452m;

    /* renamed from: n  reason: collision with root package name */
    public final InputValidators.InputValidator f35453n;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AccountInformationViewModel(androidx.lifecycle.SavedStateHandle r24, com.hansecom.abt.util.inputValidators.InputValidators r25, com.hansecom.abt.data.repositories.UserRepository r26, com.hansecom.abt.data.useCases.account.ChangeAccountInfoUseCase r27, com.hansecom.abt.data.useCases.configurations.GetSignUpConfigurationUseCase r28) {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            r2 = r26
            r3 = r27
            r4 = r28
            java.lang.String r5 = "savedStateHandle"
            kotlin.jvm.internal.Intrinsics.i(r1, r5)
            java.lang.String r5 = "inputValidators"
            r6 = r25
            kotlin.jvm.internal.Intrinsics.i(r6, r5)
            java.lang.String r5 = "userRepository"
            kotlin.jvm.internal.Intrinsics.i(r2, r5)
            java.lang.String r5 = "changeAccountInfoUseCase"
            kotlin.jvm.internal.Intrinsics.i(r3, r5)
            java.lang.String r5 = "getSignUpConfigurationUseCase"
            kotlin.jvm.internal.Intrinsics.i(r4, r5)
            com.hansecom.abt.presentation.screens.home.account.information.AccountInformation$State r5 = new com.hansecom.abt.presentation.screens.home.account.information.AccountInformation$State
            r21 = 8191(0x1fff, float:1.1478E-41)
            r22 = 0
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
            r18 = 0
            r19 = 0
            r20 = 0
            r7 = r5
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r0.<init>(r1, r5)
            r0.f35448i = r2
            r0.f35449j = r3
            r0.f35450k = r4
            com.hansecom.abt.util.inputValidators.InputValidators$InputValidator r1 = r25.r()
            r0.f35451l = r1
            com.hansecom.abt.util.inputValidators.InputValidators$InputValidator r1 = r25.u()
            r0.f35452m = r1
            com.hansecom.abt.util.inputValidators.InputValidators$InputValidator r1 = r25.x()
            r0.f35453n = r1
            kotlinx.coroutines.CoroutineScope r2 = androidx.lifecycle.ViewModelKt.a(r23)
            com.hansecom.abt.presentation.screens.home.account.information.AccountInformationViewModel$1 r5 = new com.hansecom.abt.presentation.screens.home.account.information.AccountInformationViewModel$1
            r1 = 0
            r5.<init>(r0, r1)
            r6 = 3
            r7 = 0
            r3 = 0
            r4 = 0
            kotlinx.coroutines.Job unused = kotlinx.coroutines.BuildersKt__Builders_commonKt.d(r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.account.information.AccountInformationViewModel.<init>(androidx.lifecycle.SavedStateHandle, com.hansecom.abt.util.inputValidators.InputValidators, com.hansecom.abt.data.repositories.UserRepository, com.hansecom.abt.data.useCases.account.ChangeAccountInfoUseCase, com.hansecom.abt.data.useCases.configurations.GetSignUpConfigurationUseCase):void");
    }

    private final void K() {
        r(new l());
    }

    public static final AccountInformation.State L(AccountInformation.State state) {
        AccountInformation.State state2 = state;
        Intrinsics.i(state2, "$this$update");
        return AccountInformation.State.b(state2, false, false, StringsKt.f1(state.f()).toString(), (StringValue) null, false, StringsKt.f1(state.j()).toString(), (StringValue) null, StringsKt.f1(state.d()).toString(), false, false, StringsKt.f1(state.n()).toString(), (StringValue) null, false, 7003, (Object) null);
    }

    public static final AccountInformation.State N(AccountInformation.Action action, AccountInformation.State state) {
        AccountInformation.State state2 = state;
        Intrinsics.i(state2, "$this$update");
        return AccountInformation.State.b(state2, false, false, ((AccountInformation.Action.FirstNameChange) action).a(), StringValue.Companion.a(), false, (String) null, (StringValue) null, (String) null, false, false, (String) null, (StringValue) null, false, 8179, (Object) null);
    }

    public static final AccountInformation.State O(AccountInformation.Action action, AccountInformation.State state) {
        AccountInformation.State state2 = state;
        Intrinsics.i(state2, "$this$update");
        return AccountInformation.State.b(state2, false, false, (String) null, (StringValue) null, false, ((AccountInformation.Action.LastNameChange) action).a(), StringValue.Companion.a(), (String) null, false, false, (String) null, (StringValue) null, false, 8095, (Object) null);
    }

    public static final AccountInformation.State P(AccountInformation.Action action, AccountInformation.State state) {
        AccountInformation.State state2 = state;
        Intrinsics.i(state2, "$this$update");
        return AccountInformation.State.b(state2, false, false, (String) null, (StringValue) null, false, (String) null, (StringValue) null, (String) null, false, false, ((AccountInformation.Action.PhoneChange) action).a(), StringValue.Companion.a(), false, 5119, (Object) null);
    }

    public static final AccountInformation.State R(AccountInformation.State state) {
        AccountInformation.State state2 = state;
        Intrinsics.i(state2, "$this$update");
        return AccountInformation.State.b(state2, true, false, (String) null, (StringValue) null, false, (String) null, (StringValue) null, (String) null, false, false, (String) null, (StringValue) null, false, 8190, (Object) null);
    }

    public static final AccountInformation.State S(User user, AccountInformation.State state) {
        Intrinsics.i(state, "$this$update");
        String e2 = user.e();
        String str = e2 == null ? "" : e2;
        String f2 = user.f();
        String str2 = f2 == null ? "" : f2;
        String g2 = user.g();
        String str3 = g2 == null ? "" : g2;
        String d2 = user.d();
        return AccountInformation.State.b(state, false, false, str, (StringValue) null, false, str2, (StringValue) null, d2 == null ? "" : d2, false, false, str3, (StringValue) null, false, 7002, (Object) null);
    }

    public static final AccountInformation.State T(Throwable th, AccountInformation.State state) {
        AccountInformation.State state2 = state;
        Intrinsics.i(state2, "$this$update");
        FieldErrorsException fieldErrorsException = (FieldErrorsException) th;
        return AccountInformation.State.b(state2, false, false, (String) null, StringValueKt.b(fieldErrorsException.h()), false, (String) null, StringValueKt.b(fieldErrorsException.i()), (String) null, false, false, (String) null, StringValueKt.b(fieldErrorsException.n()), false, 6071, (Object) null);
    }

    public static final AccountInformation.State U(AccountInformation.State state) {
        AccountInformation.State state2 = state;
        Intrinsics.i(state2, "$this$update");
        return AccountInformation.State.b(state2, false, false, (String) null, (StringValue) null, false, (String) null, (StringValue) null, (String) null, false, false, (String) null, (StringValue) null, false, 8190, (Object) null);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object V(kotlin.coroutines.Continuation r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.hansecom.abt.presentation.screens.home.account.information.AccountInformationViewModel$save$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.hansecom.abt.presentation.screens.home.account.information.AccountInformationViewModel$save$1 r0 = (com.hansecom.abt.presentation.screens.home.account.information.AccountInformationViewModel$save$1) r0
            int r1 = r0.F
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.F = r1
            goto L_0x0018
        L_0x0013:
            com.hansecom.abt.presentation.screens.home.account.information.AccountInformationViewModel$save$1 r0 = new com.hansecom.abt.presentation.screens.home.account.information.AccountInformationViewModel$save$1
            r0.<init>(r6, r7)
        L_0x0018:
            java.lang.Object r7 = r0.D
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.F
            r3 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            java.lang.Object r0 = r0.C
            com.hansecom.abt.presentation.screens.home.account.information.AccountInformationViewModel r0 = (com.hansecom.abt.presentation.screens.home.account.information.AccountInformationViewModel) r0
            kotlin.ResultKt.b(r7)
            kotlin.Result r7 = (kotlin.Result) r7
            java.lang.Object r7 = r7.j()
            goto L_0x0087
        L_0x0033:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x003b:
            kotlin.ResultKt.b(r7)
            r6.K()
            r6.Z()
            android.os.Parcelable r7 = r6.m()
            com.hansecom.abt.presentation.screens.home.account.information.AccountInformation$State r7 = (com.hansecom.abt.presentation.screens.home.account.information.AccountInformation.State) r7
            boolean r7 = r7.i()
            if (r7 == 0) goto L_0x0053
            kotlin.Unit r7 = kotlin.Unit.f40552a
            return r7
        L_0x0053:
            com.hansecom.abt.presentation.screens.home.account.information.o r7 = new com.hansecom.abt.presentation.screens.home.account.information.o
            r7.<init>()
            r6.r(r7)
            com.hansecom.abt.data.useCases.account.ChangeAccountInfoUseCase r7 = r6.f35449j
            android.os.Parcelable r2 = r6.m()
            com.hansecom.abt.presentation.screens.home.account.information.AccountInformation$State r2 = (com.hansecom.abt.presentation.screens.home.account.information.AccountInformation.State) r2
            java.lang.String r2 = r2.f()
            android.os.Parcelable r4 = r6.m()
            com.hansecom.abt.presentation.screens.home.account.information.AccountInformation$State r4 = (com.hansecom.abt.presentation.screens.home.account.information.AccountInformation.State) r4
            java.lang.String r4 = r4.j()
            android.os.Parcelable r5 = r6.m()
            com.hansecom.abt.presentation.screens.home.account.information.AccountInformation$State r5 = (com.hansecom.abt.presentation.screens.home.account.information.AccountInformation.State) r5
            java.lang.String r5 = r5.n()
            r0.C = r6
            r0.F = r3
            java.lang.Object r7 = r7.a(r2, r4, r5, r0)
            if (r7 != r1) goto L_0x0086
            return r1
        L_0x0086:
            r0 = r6
        L_0x0087:
            java.lang.Throwable r1 = kotlin.Result.e(r7)
            if (r1 != 0) goto L_0x009d
            kotlin.Unit r7 = (kotlin.Unit) r7
            com.hansecom.abt.presentation.screens.home.account.information.p r7 = new com.hansecom.abt.presentation.screens.home.account.information.p
            r7.<init>()
            r0.r(r7)
            com.hansecom.abt.presentation.screens.home.account.information.AccountInformation$Effect$Success r7 = com.hansecom.abt.presentation.screens.home.account.information.AccountInformation.Effect.Success.f35440a
            r0.p(r7)
            goto L_0x00b1
        L_0x009d:
            com.hansecom.abt.presentation.screens.home.account.information.q r7 = new com.hansecom.abt.presentation.screens.home.account.information.q
            r7.<init>()
            r0.r(r7)
            com.hansecom.abt.presentation.screens.home.account.information.AccountInformation$Effect$Failure r7 = new com.hansecom.abt.presentation.screens.home.account.information.AccountInformation$Effect$Failure
            com.hansecom.abt.util.resourcesResolvers.StringValue r1 = com.hansecom.abt.api.ApiExceptionsKt.a(r1)
            r7.<init>(r1)
            r0.p(r7)
        L_0x00b1:
            kotlin.Unit r7 = kotlin.Unit.f40552a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.account.information.AccountInformationViewModel.V(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final AccountInformation.State W(AccountInformation.State state) {
        AccountInformation.State state2 = state;
        Intrinsics.i(state2, "$this$update");
        return AccountInformation.State.b(state2, false, false, (String) null, (StringValue) null, false, (String) null, (StringValue) null, (String) null, false, false, (String) null, (StringValue) null, false, 4095, (Object) null);
    }

    public static final AccountInformation.State X(AccountInformation.State state) {
        AccountInformation.State state2 = state;
        Intrinsics.i(state2, "$this$update");
        return AccountInformation.State.b(state2, false, false, (String) null, (StringValue) null, false, (String) null, (StringValue) null, (String) null, false, false, (String) null, (StringValue) null, false, 4095, (Object) null);
    }

    public static final AccountInformation.State Y(AccountInformation.State state) {
        AccountInformation.State state2 = state;
        Intrinsics.i(state2, "$this$update");
        return AccountInformation.State.b(state2, false, false, (String) null, (StringValue) null, false, (String) null, (StringValue) null, (String) null, false, false, (String) null, (StringValue) null, true, 4095, (Object) null);
    }

    private final void Z() {
        r(new k(this));
    }

    public static final AccountInformation.State a0(AccountInformationViewModel accountInformationViewModel, AccountInformation.State state) {
        AccountInformationViewModel accountInformationViewModel2 = accountInformationViewModel;
        Intrinsics.i(state, "$this$update");
        return AccountInformation.State.b(state, false, false, (String) null, (accountInformationViewModel2.f35451l.a(((AccountInformation.State) accountInformationViewModel.m()).f()) || (((AccountInformation.State) accountInformationViewModel.m()).f().length() == 0 && !((AccountInformation.State) accountInformationViewModel.m()).g())) ? StringValue.Companion.a() : StringValueKt.c(R.string.f33049b), false, (String) null, (accountInformationViewModel2.f35452m.a(((AccountInformation.State) accountInformationViewModel.m()).j()) || (((AccountInformation.State) accountInformationViewModel.m()).j().length() == 0 && !((AccountInformation.State) accountInformationViewModel.m()).k())) ? StringValue.Companion.a() : StringValueKt.c(R.string.f33054g), (String) null, false, false, (String) null, (accountInformationViewModel2.f35453n.a(((AccountInformation.State) accountInformationViewModel.m()).n()) || (((AccountInformation.State) accountInformationViewModel.m()).n().length() == 0 && !((AccountInformation.State) accountInformationViewModel.m()).o())) ? StringValue.Companion.a() : StringValueKt.c(R.string.f33057j), false, 6071, (Object) null);
    }

    /* renamed from: M */
    public Object o(AccountInformation.Action action, Continuation continuation) {
        if (action instanceof AccountInformation.Action.FirstNameChange) {
            r(new j(action));
        } else if (action instanceof AccountInformation.Action.LastNameChange) {
            r(new m(action));
        } else if (action instanceof AccountInformation.Action.PhoneChange) {
            r(new n(action));
        } else if (action instanceof AccountInformation.Action.Save) {
            Object V = V(continuation);
            return V == IntrinsicsKt.f() ? V : Unit.f40552a;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.f40552a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object Q(kotlin.coroutines.Continuation r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.hansecom.abt.presentation.screens.home.account.information.AccountInformationViewModel$loadUserData$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.hansecom.abt.presentation.screens.home.account.information.AccountInformationViewModel$loadUserData$1 r0 = (com.hansecom.abt.presentation.screens.home.account.information.AccountInformationViewModel$loadUserData$1) r0
            int r1 = r0.F
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.F = r1
            goto L_0x0018
        L_0x0013:
            com.hansecom.abt.presentation.screens.home.account.information.AccountInformationViewModel$loadUserData$1 r0 = new com.hansecom.abt.presentation.screens.home.account.information.AccountInformationViewModel$loadUserData$1
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.D
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.F
            r3 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            java.lang.Object r0 = r0.C
            com.hansecom.abt.presentation.screens.home.account.information.AccountInformationViewModel r0 = (com.hansecom.abt.presentation.screens.home.account.information.AccountInformationViewModel) r0
            kotlin.ResultKt.b(r5)
            kotlin.Result r5 = (kotlin.Result) r5
            java.lang.Object r5 = r5.j()
            goto L_0x0054
        L_0x0033:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x003b:
            kotlin.ResultKt.b(r5)
            com.hansecom.abt.presentation.screens.home.account.information.r r5 = new com.hansecom.abt.presentation.screens.home.account.information.r
            r5.<init>()
            r4.r(r5)
            com.hansecom.abt.data.repositories.UserRepository r5 = r4.f35448i
            r0.C = r4
            r0.F = r3
            java.lang.Object r5 = r5.i(r0)
            if (r5 != r1) goto L_0x0053
            return r1
        L_0x0053:
            r0 = r4
        L_0x0054:
            java.lang.Throwable r1 = kotlin.Result.e(r5)
            if (r1 != 0) goto L_0x0065
            com.hansecom.mapi.models.User r5 = (com.hansecom.mapi.models.User) r5
            com.hansecom.abt.presentation.screens.home.account.information.s r1 = new com.hansecom.abt.presentation.screens.home.account.information.s
            r1.<init>(r5)
            r0.r(r1)
            goto L_0x0086
        L_0x0065:
            boolean r5 = r1 instanceof com.hansecom.abt.data.exceptions.FieldErrorsException
            if (r5 == 0) goto L_0x0072
            com.hansecom.abt.presentation.screens.home.account.information.t r5 = new com.hansecom.abt.presentation.screens.home.account.information.t
            r5.<init>(r1)
            r0.r(r5)
            goto L_0x007e
        L_0x0072:
            com.hansecom.abt.presentation.screens.home.account.information.AccountInformation$Effect$Failure r5 = new com.hansecom.abt.presentation.screens.home.account.information.AccountInformation$Effect$Failure
            com.hansecom.abt.util.resourcesResolvers.StringValue r1 = com.hansecom.abt.api.ApiExceptionsKt.a(r1)
            r5.<init>(r1)
            r0.p(r5)
        L_0x007e:
            com.hansecom.abt.presentation.screens.home.account.information.u r5 = new com.hansecom.abt.presentation.screens.home.account.information.u
            r5.<init>()
            r0.r(r5)
        L_0x0086:
            kotlin.Unit r5 = kotlin.Unit.f40552a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.account.information.AccountInformationViewModel.Q(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
