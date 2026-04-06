package com.hansecom.abt.presentation.screens.auth.reset.success;

import androidx.lifecycle.SavedStateHandle;
import androidx.navigation.SavedStateHandleKt;
import com.hansecom.abt.data.repositories.UserRepository;
import com.hansecom.abt.presentation.mvi.MviViewModel;
import com.hansecom.abt.presentation.screens.auth.ResetPasswordSuccessDestination;
import com.hansecom.abt.presentation.screens.auth.reset.success.ResetPasswordSuccess;
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
public final class ResetPasswordSuccessViewModel extends MviViewModel<ResetPasswordSuccess.Action, ResetPasswordSuccess.State, ResetPasswordSuccess.Effect> {

    /* renamed from: i  reason: collision with root package name */
    public final UserRepository f34641i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ResetPasswordSuccessViewModel(SavedStateHandle savedStateHandle, UserRepository userRepository) {
        super(savedStateHandle, new ResetPasswordSuccess.State(((ResetPasswordSuccessDestination) SavedStateHandleKt.a(savedStateHandle, Reflection.b(ResetPasswordSuccessDestination.class), MapsKt.h())).a(), false, 2, (DefaultConstructorMarker) null));
        Intrinsics.i(savedStateHandle, "savedStateHandle");
        Intrinsics.i(userRepository, "userRepository");
        this.f34641i = userRepository;
    }

    public static final ResetPasswordSuccess.State A(ResetPasswordSuccess.State state) {
        Intrinsics.i(state, "$this$update");
        return ResetPasswordSuccess.State.b(state, (String) null, true, 1, (Object) null);
    }

    public static final ResetPasswordSuccess.State B(ResetPasswordSuccess.State state) {
        Intrinsics.i(state, "$this$update");
        return ResetPasswordSuccess.State.b(state, (String) null, false, 1, (Object) null);
    }

    public static final ResetPasswordSuccess.State C(ResetPasswordSuccess.State state) {
        Intrinsics.i(state, "$this$update");
        return ResetPasswordSuccess.State.b(state, (String) null, false, 1, (Object) null);
    }

    /* renamed from: y */
    public Object o(ResetPasswordSuccess.Action action, Continuation continuation) {
        if (Intrinsics.d(action, ResetPasswordSuccess.Action.Resend.f34631a)) {
            Object z2 = z(((ResetPasswordSuccess.State) m()).c(), continuation);
            return z2 == IntrinsicsKt.f() ? z2 : Unit.f40552a;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object z(java.lang.String r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.hansecom.abt.presentation.screens.auth.reset.success.ResetPasswordSuccessViewModel$resendPassword$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.hansecom.abt.presentation.screens.auth.reset.success.ResetPasswordSuccessViewModel$resendPassword$1 r0 = (com.hansecom.abt.presentation.screens.auth.reset.success.ResetPasswordSuccessViewModel$resendPassword$1) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.G = r1
            goto L_0x0018
        L_0x0013:
            com.hansecom.abt.presentation.screens.auth.reset.success.ResetPasswordSuccessViewModel$resendPassword$1 r0 = new com.hansecom.abt.presentation.screens.auth.reset.success.ResetPasswordSuccessViewModel$resendPassword$1
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.E
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.G
            r3 = 1
            if (r2 == 0) goto L_0x003f
            if (r2 != r3) goto L_0x0037
            java.lang.Object r5 = r0.D
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r0 = r0.C
            com.hansecom.abt.presentation.screens.auth.reset.success.ResetPasswordSuccessViewModel r0 = (com.hansecom.abt.presentation.screens.auth.reset.success.ResetPasswordSuccessViewModel) r0
            kotlin.ResultKt.b(r6)
            kotlin.Result r6 = (kotlin.Result) r6
            java.lang.Object r6 = r6.j()
            goto L_0x005a
        L_0x0037:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x003f:
            kotlin.ResultKt.b(r6)
            com.hansecom.abt.presentation.screens.auth.reset.success.h r6 = new com.hansecom.abt.presentation.screens.auth.reset.success.h
            r6.<init>()
            r4.r(r6)
            com.hansecom.abt.data.repositories.UserRepository r6 = r4.f34641i
            r0.C = r4
            r0.D = r5
            r0.G = r3
            java.lang.Object r6 = r6.O(r5, r0)
            if (r6 != r1) goto L_0x0059
            return r1
        L_0x0059:
            r0 = r4
        L_0x005a:
            java.lang.Throwable r1 = kotlin.Result.e(r6)
            if (r1 != 0) goto L_0x0073
            kotlin.Unit r6 = (kotlin.Unit) r6
            com.hansecom.abt.presentation.screens.auth.reset.success.i r6 = new com.hansecom.abt.presentation.screens.auth.reset.success.i
            r6.<init>()
            r0.r(r6)
            com.hansecom.abt.presentation.screens.auth.reset.success.ResetPasswordSuccess$Effect$Success r6 = new com.hansecom.abt.presentation.screens.auth.reset.success.ResetPasswordSuccess$Effect$Success
            r6.<init>(r5)
            r0.p(r6)
            goto L_0x0087
        L_0x0073:
            com.hansecom.abt.presentation.screens.auth.reset.success.j r5 = new com.hansecom.abt.presentation.screens.auth.reset.success.j
            r5.<init>()
            r0.r(r5)
            com.hansecom.abt.presentation.screens.auth.reset.success.ResetPasswordSuccess$Effect$Error r5 = new com.hansecom.abt.presentation.screens.auth.reset.success.ResetPasswordSuccess$Effect$Error
            com.hansecom.abt.util.resourcesResolvers.StringValue r6 = com.hansecom.abt.api.ApiExceptionsKt.a(r1)
            r5.<init>(r6)
            r0.p(r5)
        L_0x0087:
            kotlin.Unit r5 = kotlin.Unit.f40552a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.auth.reset.success.ResetPasswordSuccessViewModel.z(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
