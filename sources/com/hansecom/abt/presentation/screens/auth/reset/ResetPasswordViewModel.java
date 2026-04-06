package com.hansecom.abt.presentation.screens.auth.reset;

import androidx.lifecycle.SavedStateHandle;
import com.hansecom.abt.data.repositories.UserRepository;
import com.hansecom.abt.presentation.mvi.MviViewModel;
import com.hansecom.abt.presentation.screens.auth.reset.ResetPassword;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class ResetPasswordViewModel extends MviViewModel<ResetPassword.Action, ResetPassword.State, ResetPassword.Effect> {

    /* renamed from: i  reason: collision with root package name */
    public final UserRepository f34611i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ResetPasswordViewModel(SavedStateHandle savedStateHandle, UserRepository userRepository) {
        super(savedStateHandle, new ResetPassword.State((String) null, false, false, 7, (DefaultConstructorMarker) null));
        Intrinsics.i(savedStateHandle, "savedStateHandle");
        Intrinsics.i(userRepository, "userRepository");
        this.f34611i = userRepository;
    }

    public static final ResetPassword.State B(ResetPassword.Action action, ResetPassword.State state) {
        Intrinsics.i(state, "$this$update");
        return ResetPassword.State.b(state, ((ResetPassword.Action.EmailChange) action).a(), true, false, 4, (Object) null);
    }

    public static final ResetPassword.State D(ResetPassword.State state) {
        Intrinsics.i(state, "$this$update");
        return ResetPassword.State.b(state, (String) null, false, false, 5, (Object) null);
    }

    public static final ResetPassword.State E(ResetPassword.State state) {
        Intrinsics.i(state, "$this$update");
        return ResetPassword.State.b(state, (String) null, false, true, 3, (Object) null);
    }

    public static final ResetPassword.State F(ResetPassword.State state) {
        Intrinsics.i(state, "$this$update");
        return ResetPassword.State.b(state, (String) null, false, false, 3, (Object) null);
    }

    public static final ResetPassword.State G(ResetPassword.State state) {
        Intrinsics.i(state, "$this$update");
        return ResetPassword.State.b(state, (String) null, false, false, 3, (Object) null);
    }

    /* renamed from: A */
    public Object o(ResetPassword.Action action, Continuation continuation) {
        if (action instanceof ResetPassword.Action.EmailChange) {
            r(new i(action));
            return Unit.f40552a;
        } else if (Intrinsics.d(action, ResetPassword.Action.Reset.f34600a)) {
            Object C = C(((ResetPassword.State) m()).c(), continuation);
            return C == IntrinsicsKt.f() ? C : Unit.f40552a;
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object C(java.lang.String r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.hansecom.abt.presentation.screens.auth.reset.ResetPasswordViewModel$resetPassword$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.hansecom.abt.presentation.screens.auth.reset.ResetPasswordViewModel$resetPassword$1 r0 = (com.hansecom.abt.presentation.screens.auth.reset.ResetPasswordViewModel$resetPassword$1) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.G = r1
            goto L_0x0018
        L_0x0013:
            com.hansecom.abt.presentation.screens.auth.reset.ResetPasswordViewModel$resetPassword$1 r0 = new com.hansecom.abt.presentation.screens.auth.reset.ResetPasswordViewModel$resetPassword$1
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
            com.hansecom.abt.presentation.screens.auth.reset.ResetPasswordViewModel r0 = (com.hansecom.abt.presentation.screens.auth.reset.ResetPasswordViewModel) r0
            kotlin.ResultKt.b(r6)
            kotlin.Result r6 = (kotlin.Result) r6
            java.lang.Object r6 = r6.j()
            goto L_0x006b
        L_0x0037:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x003f:
            kotlin.ResultKt.b(r6)
            int r6 = r5.length()
            if (r6 != 0) goto L_0x0053
            com.hansecom.abt.presentation.screens.auth.reset.j r5 = new com.hansecom.abt.presentation.screens.auth.reset.j
            r5.<init>()
            r4.r(r5)
            kotlin.Unit r5 = kotlin.Unit.f40552a
            return r5
        L_0x0053:
            com.hansecom.abt.presentation.screens.auth.reset.k r6 = new com.hansecom.abt.presentation.screens.auth.reset.k
            r6.<init>()
            r4.r(r6)
            com.hansecom.abt.data.repositories.UserRepository r6 = r4.f34611i
            r0.C = r4
            r0.D = r5
            r0.G = r3
            java.lang.Object r6 = r6.O(r5, r0)
            if (r6 != r1) goto L_0x006a
            return r1
        L_0x006a:
            r0 = r4
        L_0x006b:
            java.lang.Throwable r1 = kotlin.Result.e(r6)
            if (r1 != 0) goto L_0x0084
            kotlin.Unit r6 = (kotlin.Unit) r6
            com.hansecom.abt.presentation.screens.auth.reset.l r6 = new com.hansecom.abt.presentation.screens.auth.reset.l
            r6.<init>()
            r0.r(r6)
            com.hansecom.abt.presentation.screens.auth.reset.ResetPassword$Effect$Success r6 = new com.hansecom.abt.presentation.screens.auth.reset.ResetPassword$Effect$Success
            r6.<init>(r5)
            r0.p(r6)
            goto L_0x0098
        L_0x0084:
            com.hansecom.abt.presentation.screens.auth.reset.m r5 = new com.hansecom.abt.presentation.screens.auth.reset.m
            r5.<init>()
            r0.r(r5)
            com.hansecom.abt.presentation.screens.auth.reset.ResetPassword$Effect$Error r5 = new com.hansecom.abt.presentation.screens.auth.reset.ResetPassword$Effect$Error
            com.hansecom.abt.util.resourcesResolvers.StringValue r6 = com.hansecom.abt.api.ApiExceptionsKt.a(r1)
            r5.<init>(r6)
            r0.p(r5)
        L_0x0098:
            kotlin.Unit r5 = kotlin.Unit.f40552a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.auth.reset.ResetPasswordViewModel.C(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
