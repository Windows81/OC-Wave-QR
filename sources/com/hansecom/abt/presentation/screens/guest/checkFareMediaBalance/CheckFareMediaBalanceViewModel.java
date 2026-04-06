package com.hansecom.abt.presentation.screens.guest.checkFareMediaBalance;

import androidx.lifecycle.SavedStateHandle;
import com.hansecom.abt.AppFeatures;
import com.hansecom.abt.R;
import com.hansecom.abt.data.exceptions.FieldErrorsException;
import com.hansecom.abt.data.useCases.fareMedia.CheckFareMediaCardBalanceUseCase;
import com.hansecom.abt.presentation.mvi.MviViewModel;
import com.hansecom.abt.presentation.screens.guest.checkFareMediaBalance.CheckFareMediaBalance;
import com.hansecom.abt.util.StringExtKt;
import com.hansecom.abt.util.resourcesResolvers.StringValue;
import com.hansecom.abt.util.resourcesResolvers.StringValueKt;
import com.hansecom.mapi.models.FareMedium;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata
public final class CheckFareMediaBalanceViewModel extends MviViewModel<CheckFareMediaBalance.Action, CheckFareMediaBalance.State, CheckFareMediaBalance.Effect> {

    /* renamed from: i  reason: collision with root package name */
    public final AppFeatures f34724i;

    /* renamed from: j  reason: collision with root package name */
    public final CheckFareMediaCardBalanceUseCase f34725j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CheckFareMediaBalanceViewModel(SavedStateHandle savedStateHandle, AppFeatures appFeatures, CheckFareMediaCardBalanceUseCase checkFareMediaCardBalanceUseCase) {
        super(savedStateHandle, new CheckFareMediaBalance.State((String) null, (StringValue) null, appFeatures.c(), (String) null, (StringValue) null, false, (String) null, (String) null, 251, (DefaultConstructorMarker) null));
        Intrinsics.i(savedStateHandle, "savedStateHandle");
        Intrinsics.i(appFeatures, "appFeatures");
        Intrinsics.i(checkFareMediaCardBalanceUseCase, "checkFareMediaCardBalanceUseCase");
        this.f34724i = appFeatures;
        this.f34725j = checkFareMediaCardBalanceUseCase;
    }

    public static final CheckFareMediaBalance.State F(boolean z2, boolean z3, CheckFareMediaBalance.State state) {
        Intrinsics.i(state, "$this$update");
        return CheckFareMediaBalance.State.b(state, (String) null, z2 ? StringValue.Companion.a() : StringValueKt.c(R.string.A2), 0, (String) null, z3 ? StringValue.Companion.a() : StringValueKt.c(R.string.F2), false, (String) null, (String) null, 237, (Object) null);
    }

    public static final CheckFareMediaBalance.State H(CheckFareMediaBalance.State state) {
        Intrinsics.i(state, "$this$update");
        return CheckFareMediaBalance.State.b(state, (String) null, (StringValue) null, 0, (String) null, (StringValue) null, false, (String) null, (String) null, 223, (Object) null);
    }

    public static final CheckFareMediaBalance.State I(CheckFareMediaBalance.State state) {
        Intrinsics.i(state, "$this$update");
        return CheckFareMediaBalance.State.b(state, (String) null, (StringValue) null, 0, (String) null, (StringValue) null, true, "", "", 31, (Object) null);
    }

    public static final CheckFareMediaBalance.State J(CheckFareMediaBalance.State state) {
        Intrinsics.i(state, "$this$update");
        return CheckFareMediaBalance.State.b(state, (String) null, (StringValue) null, 0, (String) null, (StringValue) null, false, (String) null, (String) null, 223, (Object) null);
    }

    public static final CheckFareMediaBalance.State K(FareMedium fareMedium, CheckFareMediaBalance.State state) {
        Intrinsics.i(state, "$this$update");
        return CheckFareMediaBalance.State.b(state, (String) null, (StringValue) null, 0, (String) null, (StringValue) null, false, fareMedium.f(), String.valueOf(fareMedium.c()), 63, (Object) null);
    }

    public static final CheckFareMediaBalance.State L(CheckFareMediaBalance.State state) {
        Intrinsics.i(state, "$this$update");
        return CheckFareMediaBalance.State.b(state, (String) null, StringValueKt.c(R.string.h4), 0, (String) null, (StringValue) null, false, (String) null, (String) null, 253, (Object) null);
    }

    public static final CheckFareMediaBalance.State M(Throwable th, CheckFareMediaBalance.State state) {
        Intrinsics.i(state, "$this$update");
        FieldErrorsException fieldErrorsException = (FieldErrorsException) th;
        return CheckFareMediaBalance.State.b(state, (String) null, StringValueKt.b(fieldErrorsException.f()), 0, (String) null, StringValueKt.b(fieldErrorsException.g()), false, (String) null, (String) null, 237, (Object) null);
    }

    public static final CheckFareMediaBalance.State P(String str, CheckFareMediaBalanceViewModel checkFareMediaBalanceViewModel, CheckFareMediaBalance.State state) {
        Intrinsics.i(state, "$this$update");
        return CheckFareMediaBalance.State.b(state, StringsKt.n1(StringExtKt.a(str), checkFareMediaBalanceViewModel.f34724i.c()), StringValue.Companion.a(), 0, (String) null, (StringValue) null, false, (String) null, (String) null, 252, (Object) null);
    }

    public static final CheckFareMediaBalance.State R(String str, CheckFareMediaBalance.State state) {
        Intrinsics.i(state, "$this$update");
        return CheckFareMediaBalance.State.b(state, (String) null, (StringValue) null, 0, str, StringValue.Companion.a(), false, (String) null, (String) null, 231, (Object) null);
    }

    public final boolean E() {
        boolean S = S(((CheckFareMediaBalance.State) m()).c());
        boolean T = T(((CheckFareMediaBalance.State) m()).h());
        if (S && T) {
            return true;
        }
        r(new p(S, T));
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object G(kotlin.coroutines.Continuation r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.hansecom.abt.presentation.screens.guest.checkFareMediaBalance.CheckFareMediaBalanceViewModel$checkCardBalance$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.hansecom.abt.presentation.screens.guest.checkFareMediaBalance.CheckFareMediaBalanceViewModel$checkCardBalance$1 r0 = (com.hansecom.abt.presentation.screens.guest.checkFareMediaBalance.CheckFareMediaBalanceViewModel$checkCardBalance$1) r0
            int r1 = r0.F
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.F = r1
            goto L_0x0018
        L_0x0013:
            com.hansecom.abt.presentation.screens.guest.checkFareMediaBalance.CheckFareMediaBalanceViewModel$checkCardBalance$1 r0 = new com.hansecom.abt.presentation.screens.guest.checkFareMediaBalance.CheckFareMediaBalanceViewModel$checkCardBalance$1
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.D
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.F
            r3 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            java.lang.Object r0 = r0.C
            com.hansecom.abt.presentation.screens.guest.checkFareMediaBalance.CheckFareMediaBalanceViewModel r0 = (com.hansecom.abt.presentation.screens.guest.checkFareMediaBalance.CheckFareMediaBalanceViewModel) r0
            kotlin.ResultKt.b(r6)
            kotlin.Result r6 = (kotlin.Result) r6
            java.lang.Object r6 = r6.j()
            goto L_0x0079
        L_0x0033:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x003b:
            kotlin.ResultKt.b(r6)
            com.hansecom.abt.presentation.screens.guest.checkFareMediaBalance.j r6 = new com.hansecom.abt.presentation.screens.guest.checkFareMediaBalance.j
            r6.<init>()
            r5.r(r6)
            boolean r6 = r5.E()
            if (r6 != 0) goto L_0x0057
            com.hansecom.abt.presentation.screens.guest.checkFareMediaBalance.k r6 = new com.hansecom.abt.presentation.screens.guest.checkFareMediaBalance.k
            r6.<init>()
            r5.r(r6)
            kotlin.Unit r6 = kotlin.Unit.f40552a
            return r6
        L_0x0057:
            com.hansecom.abt.data.useCases.fareMedia.CheckFareMediaCardBalanceUseCase r6 = r5.f34725j
            android.os.Parcelable r2 = r5.m()
            com.hansecom.abt.presentation.screens.guest.checkFareMediaBalance.CheckFareMediaBalance$State r2 = (com.hansecom.abt.presentation.screens.guest.checkFareMediaBalance.CheckFareMediaBalance.State) r2
            java.lang.String r2 = r2.c()
            android.os.Parcelable r4 = r5.m()
            com.hansecom.abt.presentation.screens.guest.checkFareMediaBalance.CheckFareMediaBalance$State r4 = (com.hansecom.abt.presentation.screens.guest.checkFareMediaBalance.CheckFareMediaBalance.State) r4
            java.lang.String r4 = r4.h()
            r0.C = r5
            r0.F = r3
            java.lang.Object r6 = r6.a(r2, r4, r0)
            if (r6 != r1) goto L_0x0078
            return r1
        L_0x0078:
            r0 = r5
        L_0x0079:
            java.lang.Throwable r1 = kotlin.Result.e(r6)
            if (r1 != 0) goto L_0x008a
            com.hansecom.mapi.models.FareMedium r6 = (com.hansecom.mapi.models.FareMedium) r6
            com.hansecom.abt.presentation.screens.guest.checkFareMediaBalance.l r1 = new com.hansecom.abt.presentation.screens.guest.checkFareMediaBalance.l
            r1.<init>(r6)
            r0.r(r1)
            goto L_0x00b0
        L_0x008a:
            boolean r6 = r1 instanceof com.hansecom.abt.data.useCases.fareMedia.CheckBalancePhysicalCardNumberInvalidException
            if (r6 == 0) goto L_0x0097
            com.hansecom.abt.presentation.screens.guest.checkFareMediaBalance.m r6 = new com.hansecom.abt.presentation.screens.guest.checkFareMediaBalance.m
            r6.<init>()
            r0.r(r6)
            goto L_0x00b0
        L_0x0097:
            boolean r6 = r1 instanceof com.hansecom.abt.data.exceptions.FieldErrorsException
            if (r6 == 0) goto L_0x00a4
            com.hansecom.abt.presentation.screens.guest.checkFareMediaBalance.n r6 = new com.hansecom.abt.presentation.screens.guest.checkFareMediaBalance.n
            r6.<init>(r1)
            r0.r(r6)
            goto L_0x00b0
        L_0x00a4:
            com.hansecom.abt.presentation.screens.guest.checkFareMediaBalance.CheckFareMediaBalance$Effect$Error r6 = new com.hansecom.abt.presentation.screens.guest.checkFareMediaBalance.CheckFareMediaBalance$Effect$Error
            com.hansecom.abt.util.resourcesResolvers.StringValue r1 = com.hansecom.abt.api.ApiExceptionsKt.a(r1)
            r6.<init>(r1)
            r0.p(r6)
        L_0x00b0:
            com.hansecom.abt.presentation.screens.guest.checkFareMediaBalance.o r6 = new com.hansecom.abt.presentation.screens.guest.checkFareMediaBalance.o
            r6.<init>()
            r0.r(r6)
            kotlin.Unit r6 = kotlin.Unit.f40552a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.guest.checkFareMediaBalance.CheckFareMediaBalanceViewModel.G(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* renamed from: N */
    public Object o(CheckFareMediaBalance.Action action, Continuation continuation) {
        if (action instanceof CheckFareMediaBalance.Action.CardNumberChange) {
            O(((CheckFareMediaBalance.Action.CardNumberChange) action).a());
        } else if (action instanceof CheckFareMediaBalance.Action.CodeChange) {
            Q(((CheckFareMediaBalance.Action.CodeChange) action).a());
        } else if (Intrinsics.d(action, CheckFareMediaBalance.Action.Confirm.f34712a)) {
            Object G = G(continuation);
            return G == IntrinsicsKt.f() ? G : Unit.f40552a;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.f40552a;
    }

    public final void O(String str) {
        r(new i(str, this));
    }

    public final void Q(String str) {
        r(new h(StringsKt.n1(StringExtKt.a(str), this.f34724i.o())));
    }

    public final boolean S(String str) {
        return str.length() == this.f34724i.c();
    }

    public final boolean T(String str) {
        return str.length() == this.f34724i.o();
    }
}
