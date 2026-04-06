package com.hansecom.abt.presentation.screens.home.account;

import com.hansecom.abt.api.ApiExceptionsKt;
import com.hansecom.abt.data.exceptions.FieldErrorsException;
import com.hansecom.abt.data.useCases.CloseAccountUseCase;
import com.hansecom.abt.data.useCases.LogOutUseCase;
import com.hansecom.abt.data.useCases.lock.ToggleBiometricsLockActivatedUseCase;
import com.hansecom.abt.presentation.mvi.MviViewModel;
import com.hansecom.abt.presentation.screens.home.account.Account;
import com.hansecom.abt.ui.components.listItem.MenuItemListState;
import com.hansecom.abt.util.resourcesResolvers.StringValue;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class AccountViewModel extends MviViewModel<Account.Action, Account.State, Account.Effect> {

    /* renamed from: i  reason: collision with root package name */
    public final LogOutUseCase f35064i;

    /* renamed from: j  reason: collision with root package name */
    public final CloseAccountUseCase f35065j;

    /* renamed from: k  reason: collision with root package name */
    public final ToggleBiometricsLockActivatedUseCase f35066k;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AccountViewModel(androidx.lifecycle.SavedStateHandle r22, com.hansecom.abt.presentation.biometric.BiometricHelper r23, com.hansecom.abt.data.useCases.configurations.GetAccountMenuConfigurationUseCase r24, com.hansecom.abt.data.useCases.LogOutUseCase r25, com.hansecom.abt.data.useCases.CloseAccountUseCase r26, com.hansecom.abt.data.useCases.lock.ToggleBiometricsLockActivatedUseCase r27) {
        /*
            r21 = this;
            r8 = r21
            r0 = r22
            r1 = r24
            r2 = r25
            r3 = r26
            r4 = r27
            java.lang.String r5 = "savedStateHandle"
            kotlin.jvm.internal.Intrinsics.i(r0, r5)
            java.lang.String r5 = "biometricHelper"
            r6 = r23
            kotlin.jvm.internal.Intrinsics.i(r6, r5)
            java.lang.String r5 = "getAccountMenuConfigurationUseCase"
            kotlin.jvm.internal.Intrinsics.i(r1, r5)
            java.lang.String r5 = "logOutUseCase"
            kotlin.jvm.internal.Intrinsics.i(r2, r5)
            java.lang.String r5 = "closeAccountUseCase"
            kotlin.jvm.internal.Intrinsics.i(r3, r5)
            java.lang.String r5 = "toggleBiometricsLockActivatedUseCase"
            kotlin.jvm.internal.Intrinsics.i(r4, r5)
            com.hansecom.abt.presentation.screens.home.account.Account$State r5 = new com.hansecom.abt.presentation.screens.home.account.Account$State
            boolean r10 = r23.c()
            r19 = 510(0x1fe, float:7.15E-43)
            r20 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r9 = r5
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r8.<init>(r0, r5)
            r8.f35064i = r2
            r8.f35065j = r3
            r8.f35066k = r4
            com.hansecom.abt.presentation.screens.home.account.AccountViewModel$1 r5 = new com.hansecom.abt.presentation.screens.home.account.AccountViewModel$1
            r0 = 0
            r5.<init>(r1, r8, r0)
            r6 = 7
            r7 = 0
            r1 = 0
            r2 = 0
            r3 = 0
            r0 = r21
            com.hansecom.abt.presentation.mvi.MviViewModel.t(r0, r1, r2, r3, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.account.AccountViewModel.<init>(androidx.lifecycle.SavedStateHandle, com.hansecom.abt.presentation.biometric.BiometricHelper, com.hansecom.abt.data.useCases.configurations.GetAccountMenuConfigurationUseCase, com.hansecom.abt.data.useCases.LogOutUseCase, com.hansecom.abt.data.useCases.CloseAccountUseCase, com.hansecom.abt.data.useCases.lock.ToggleBiometricsLockActivatedUseCase):void");
    }

    public static final Account.State H(Throwable th, Account.State state) {
        StringValue a2;
        Intrinsics.i(state, "$this$update");
        FieldErrorsException fieldErrorsException = th instanceof FieldErrorsException ? (FieldErrorsException) th : null;
        if (fieldErrorsException == null || (a2 = fieldErrorsException.m()) == null) {
            a2 = ApiExceptionsKt.a(th);
        }
        return Account.State.b(state, false, false, false, (String) null, a2, false, false, false, (MenuItemListState) null, 431, (Object) null);
    }

    public static final Account.State I(Account.State state) {
        Intrinsics.i(state, "$this$update");
        return Account.State.b(state, false, false, false, (String) null, (StringValue) null, false, true, false, (MenuItemListState) null, 447, (Object) null);
    }

    public static final Account.State J(Account.State state) {
        Intrinsics.i(state, "$this$update");
        return Account.State.b(state, false, false, false, (String) null, (StringValue) null, false, false, false, (MenuItemListState) null, 443, (Object) null);
    }

    public static final Account.State L(Account.Action action, Account.State state) {
        Intrinsics.i(state, "$this$update");
        return Account.State.b(state, false, false, ((Account.Action.CloseDialog) action).a(), "", StringValue.Companion.a(), false, false, false, (MenuItemListState) null, 483, (Object) null);
    }

    public static final Account.State M(Account.Action action, Account.State state) {
        Intrinsics.i(state, "$this$update");
        return Account.State.b(state, false, false, false, ((Account.Action.ClosePasswordChange) action).a(), StringValue.Companion.a(), false, false, false, (MenuItemListState) null, 487, (Object) null);
    }

    public static final Account.State N(Account.State state) {
        Intrinsics.i(state, "$this$update");
        return Account.State.b(state, false, false, false, (String) null, (StringValue) null, !state.f(), false, false, (MenuItemListState) null, 479, (Object) null);
    }

    public static final Account.State O(Account.State state) {
        Intrinsics.i(state, "$this$update");
        return Account.State.b(state, false, false, false, (String) null, (StringValue) null, false, false, false, (MenuItemListState) null, 383, (Object) null);
    }

    public static final Account.State P(Account.Action action, Account.State state) {
        Intrinsics.i(state, "$this$update");
        return Account.State.b(state, false, false, false, (String) null, (StringValue) null, false, false, ((Account.Action.LogoutDialog) action).a(), (MenuItemListState) null, 383, (Object) null);
    }

    public static final Account.State Q(Account.State state) {
        Intrinsics.i(state, "$this$update");
        return Account.State.b(state, false, false, false, (String) null, (StringValue) null, false, false, true, (MenuItemListState) null, 383, (Object) null);
    }

    public static final Account.State R(Account.State state) {
        Intrinsics.i(state, "$this$update");
        return Account.State.b(state, false, false, true, (String) null, (StringValue) null, false, false, false, (MenuItemListState) null, 507, (Object) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a9 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object G(kotlin.coroutines.Continuation r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.hansecom.abt.presentation.screens.home.account.AccountViewModel$closeAccount$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.hansecom.abt.presentation.screens.home.account.AccountViewModel$closeAccount$1 r0 = (com.hansecom.abt.presentation.screens.home.account.AccountViewModel$closeAccount$1) r0
            int r1 = r0.F
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.F = r1
            goto L_0x0018
        L_0x0013:
            com.hansecom.abt.presentation.screens.home.account.AccountViewModel$closeAccount$1 r0 = new com.hansecom.abt.presentation.screens.home.account.AccountViewModel$closeAccount$1
            r0.<init>(r6, r7)
        L_0x0018:
            java.lang.Object r7 = r0.D
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.F
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x004e
            if (r2 == r5) goto L_0x0040
            if (r2 == r4) goto L_0x0038
            if (r2 != r3) goto L_0x0030
            kotlin.ResultKt.b(r7)
            goto L_0x00b2
        L_0x0030:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x0038:
            java.lang.Object r2 = r0.C
            com.hansecom.abt.presentation.screens.home.account.AccountViewModel r2 = (com.hansecom.abt.presentation.screens.home.account.AccountViewModel) r2
            kotlin.ResultKt.b(r7)
            goto L_0x009c
        L_0x0040:
            java.lang.Object r2 = r0.C
            com.hansecom.abt.presentation.screens.home.account.AccountViewModel r2 = (com.hansecom.abt.presentation.screens.home.account.AccountViewModel) r2
            kotlin.ResultKt.b(r7)
            kotlin.Result r7 = (kotlin.Result) r7
            java.lang.Object r7 = r7.j()
            goto L_0x0071
        L_0x004e:
            kotlin.ResultKt.b(r7)
            com.hansecom.abt.presentation.screens.home.account.U r7 = new com.hansecom.abt.presentation.screens.home.account.U
            r7.<init>()
            r6.r(r7)
            com.hansecom.abt.data.useCases.CloseAccountUseCase r7 = r6.f35065j
            android.os.Parcelable r2 = r6.m()
            com.hansecom.abt.presentation.screens.home.account.Account$State r2 = (com.hansecom.abt.presentation.screens.home.account.Account.State) r2
            java.lang.String r2 = r2.d()
            r0.C = r6
            r0.F = r5
            java.lang.Object r7 = r7.a(r2, r0)
            if (r7 != r1) goto L_0x0070
            return r1
        L_0x0070:
            r2 = r6
        L_0x0071:
            java.lang.Throwable r5 = kotlin.Result.e(r7)
            if (r5 != 0) goto L_0x00aa
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            com.hansecom.abt.presentation.screens.home.account.Account$Effect$SuccessClosingAccount r5 = new com.hansecom.abt.presentation.screens.home.account.Account$Effect$SuccessClosingAccount
            r5.<init>(r7)
            r2.p(r5)
            com.hansecom.abt.presentation.screens.home.account.V r5 = new com.hansecom.abt.presentation.screens.home.account.V
            r5.<init>()
            r2.r(r5)
            if (r7 == 0) goto L_0x00b2
            r0.C = r2
            r0.F = r4
            r4 = 200(0xc8, double:9.9E-322)
            java.lang.Object r7 = kotlinx.coroutines.DelayKt.b(r4, r0)
            if (r7 != r1) goto L_0x009c
            return r1
        L_0x009c:
            com.hansecom.abt.data.useCases.LogOutUseCase r7 = r2.f35064i
            r2 = 0
            r0.C = r2
            r0.F = r3
            java.lang.Object r7 = r7.a(r0)
            if (r7 != r1) goto L_0x00b2
            return r1
        L_0x00aa:
            com.hansecom.abt.presentation.screens.home.account.W r7 = new com.hansecom.abt.presentation.screens.home.account.W
            r7.<init>(r5)
            r2.r(r7)
        L_0x00b2:
            kotlin.Unit r7 = kotlin.Unit.f40552a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.account.AccountViewModel.G(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: K */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object o(com.hansecom.abt.presentation.screens.home.account.Account.Action r4, kotlin.coroutines.Continuation r5) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof com.hansecom.abt.presentation.screens.home.account.Account.Action.CloseDialog
            if (r0 == 0) goto L_0x000e
            com.hansecom.abt.presentation.screens.home.account.X r5 = new com.hansecom.abt.presentation.screens.home.account.X
            r5.<init>(r4)
            r3.r(r5)
            goto L_0x0146
        L_0x000e:
            boolean r0 = r4 instanceof com.hansecom.abt.presentation.screens.home.account.Account.Action.ClosePasswordChange
            if (r0 == 0) goto L_0x001c
            com.hansecom.abt.presentation.screens.home.account.Y r5 = new com.hansecom.abt.presentation.screens.home.account.Y
            r5.<init>(r4)
            r3.r(r5)
            goto L_0x0146
        L_0x001c:
            boolean r0 = r4 instanceof com.hansecom.abt.presentation.screens.home.account.Account.Action.ClosePasswordVisibilityToggle
            if (r0 == 0) goto L_0x002a
            com.hansecom.abt.presentation.screens.home.account.Z r4 = new com.hansecom.abt.presentation.screens.home.account.Z
            r4.<init>()
            r3.r(r4)
            goto L_0x0146
        L_0x002a:
            boolean r0 = r4 instanceof com.hansecom.abt.presentation.screens.home.account.Account.Action.Close
            if (r0 == 0) goto L_0x003c
            java.lang.Object r4 = r3.G(r5)
            java.lang.Object r5 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            if (r4 != r5) goto L_0x0039
            return r4
        L_0x0039:
            kotlin.Unit r4 = kotlin.Unit.f40552a
            return r4
        L_0x003c:
            boolean r0 = r4 instanceof com.hansecom.abt.presentation.screens.home.account.Account.Action.LogOut
            if (r0 == 0) goto L_0x0058
            com.hansecom.abt.presentation.screens.home.account.a0 r4 = new com.hansecom.abt.presentation.screens.home.account.a0
            r4.<init>()
            r3.r(r4)
            com.hansecom.abt.data.useCases.LogOutUseCase r4 = r3.f35064i
            java.lang.Object r4 = r4.a(r5)
            java.lang.Object r5 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            if (r4 != r5) goto L_0x0055
            return r4
        L_0x0055:
            kotlin.Unit r4 = kotlin.Unit.f40552a
            return r4
        L_0x0058:
            boolean r0 = r4 instanceof com.hansecom.abt.presentation.screens.home.account.Account.Action.LogoutDialog
            if (r0 == 0) goto L_0x0066
            com.hansecom.abt.presentation.screens.home.account.b0 r5 = new com.hansecom.abt.presentation.screens.home.account.b0
            r5.<init>(r4)
            r3.r(r5)
            goto L_0x0146
        L_0x0066:
            boolean r0 = r4 instanceof com.hansecom.abt.presentation.screens.home.account.Account.Action.MenuItemClick
            if (r0 == 0) goto L_0x0149
            com.hansecom.abt.presentation.screens.home.account.Account$Action$MenuItemClick r4 = (com.hansecom.abt.presentation.screens.home.account.Account.Action.MenuItemClick) r4
            com.hansecom.abt.ui.components.listItem.MenuItemState r0 = r4.a()
            java.lang.String r0 = r0.O()
            r1 = 0
            if (r0 == 0) goto L_0x0126
            int r2 = r0.hashCode()
            switch(r2) {
                case -2126734812: goto L_0x0117;
                case -1382091262: goto L_0x0105;
                case -1097329270: goto L_0x00f3;
                case -361995073: goto L_0x00e4;
                case -40141108: goto L_0x00d5;
                case 631494470: goto L_0x00c5;
                case 931431019: goto L_0x00b4;
                case 975466118: goto L_0x0091;
                case 1455245253: goto L_0x0080;
                default: goto L_0x007e;
            }
        L_0x007e:
            goto L_0x0126
        L_0x0080:
            java.lang.String r5 = "changePin"
            boolean r5 = r0.equals(r5)
            if (r5 != 0) goto L_0x008a
            goto L_0x0126
        L_0x008a:
            com.hansecom.abt.presentation.screens.home.account.Account$Effect$OpenChangePin r4 = com.hansecom.abt.presentation.screens.home.account.Account.Effect.OpenChangePin.f35026a
            r3.p(r4)
            goto L_0x0146
        L_0x0091:
            java.lang.String r2 = "biometricsLock"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x009b
            goto L_0x0126
        L_0x009b:
            timber.log.Timber$Forest r4 = timber.log.Timber.f44337a
            java.lang.String r0 = "click"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r4.a(r0, r1)
            com.hansecom.abt.data.useCases.lock.ToggleBiometricsLockActivatedUseCase r4 = r3.f35066k
            java.lang.Object r4 = r4.a(r5)
            java.lang.Object r5 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            if (r4 != r5) goto L_0x00b1
            return r4
        L_0x00b1:
            kotlin.Unit r4 = kotlin.Unit.f40552a
            return r4
        L_0x00b4:
            java.lang.String r5 = "changePassword"
            boolean r5 = r0.equals(r5)
            if (r5 != 0) goto L_0x00be
            goto L_0x0126
        L_0x00be:
            com.hansecom.abt.presentation.screens.home.account.Account$Effect$OpenChangePassword r4 = com.hansecom.abt.presentation.screens.home.account.Account.Effect.OpenChangePassword.f35025a
            r3.p(r4)
            goto L_0x0146
        L_0x00c5:
            java.lang.String r5 = "securityQuestion"
            boolean r5 = r0.equals(r5)
            if (r5 != 0) goto L_0x00ce
            goto L_0x0126
        L_0x00ce:
            com.hansecom.abt.presentation.screens.home.account.Account$Effect$OpenChangeSecurityQuestion r4 = com.hansecom.abt.presentation.screens.home.account.Account.Effect.OpenChangeSecurityQuestion.f35027a
            r3.p(r4)
            goto L_0x0146
        L_0x00d5:
            java.lang.String r5 = "paymentMethods"
            boolean r5 = r0.equals(r5)
            if (r5 != 0) goto L_0x00de
            goto L_0x0126
        L_0x00de:
            com.hansecom.abt.presentation.screens.home.account.Account$Effect$OpenPaymentMethods r4 = com.hansecom.abt.presentation.screens.home.account.Account.Effect.OpenPaymentMethods.f35028a
            r3.p(r4)
            goto L_0x0146
        L_0x00e4:
            java.lang.String r5 = "accountInformation"
            boolean r5 = r0.equals(r5)
            if (r5 != 0) goto L_0x00ed
            goto L_0x0126
        L_0x00ed:
            com.hansecom.abt.presentation.screens.home.account.Account$Effect$OpenAccountInformation r4 = com.hansecom.abt.presentation.screens.home.account.Account.Effect.OpenAccountInformation.f35023a
            r3.p(r4)
            goto L_0x0146
        L_0x00f3:
            java.lang.String r5 = "logout"
            boolean r5 = r0.equals(r5)
            if (r5 != 0) goto L_0x00fc
            goto L_0x0126
        L_0x00fc:
            com.hansecom.abt.presentation.screens.home.account.c0 r4 = new com.hansecom.abt.presentation.screens.home.account.c0
            r4.<init>()
            r3.r(r4)
            goto L_0x0146
        L_0x0105:
            java.lang.String r5 = "deleteAccount"
            boolean r5 = r0.equals(r5)
            if (r5 != 0) goto L_0x010e
            goto L_0x0126
        L_0x010e:
            com.hansecom.abt.presentation.screens.home.account.d0 r4 = new com.hansecom.abt.presentation.screens.home.account.d0
            r4.<init>()
            r3.r(r4)
            goto L_0x0146
        L_0x0117:
            java.lang.String r5 = "changeAddress"
            boolean r5 = r0.equals(r5)
            if (r5 != 0) goto L_0x0120
            goto L_0x0126
        L_0x0120:
            com.hansecom.abt.presentation.screens.home.account.Account$Effect$OpenChangeAddress r4 = com.hansecom.abt.presentation.screens.home.account.Account.Effect.OpenChangeAddress.f35024a
            r3.p(r4)
            goto L_0x0146
        L_0x0126:
            timber.log.Timber$Forest r5 = timber.log.Timber.f44337a
            com.hansecom.abt.ui.components.listItem.MenuItemState r4 = r4.a()
            java.lang.String r4 = r4.O()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Unhandled menu item click action="
            r0.append(r2)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            java.lang.Object[] r0 = new java.lang.Object[r1]
            r5.b(r4, r0)
        L_0x0146:
            kotlin.Unit r4 = kotlin.Unit.f40552a
            return r4
        L_0x0149:
            kotlin.NoWhenBranchMatchedException r4 = new kotlin.NoWhenBranchMatchedException
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.account.AccountViewModel.o(com.hansecom.abt.presentation.screens.home.account.Account$Action, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
