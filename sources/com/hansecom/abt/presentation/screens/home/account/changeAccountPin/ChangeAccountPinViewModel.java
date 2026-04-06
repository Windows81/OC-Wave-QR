package com.hansecom.abt.presentation.screens.home.account.changeAccountPin;

import com.hansecom.abt.AppFeatures;
import com.hansecom.abt.data.exceptions.FieldErrorsException;
import com.hansecom.abt.data.repositories.UserRepository;
import com.hansecom.abt.presentation.mvi.MviViewModel;
import com.hansecom.abt.presentation.screens.home.account.changeAccountPin.ChangeAccountPin;
import com.hansecom.abt.util.StringExtKt;
import com.hansecom.abt.util.inputValidators.InputValidators;
import com.hansecom.abt.util.resourcesResolvers.StringValue;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata
public final class ChangeAccountPinViewModel extends MviViewModel<ChangeAccountPin.Action, ChangeAccountPin.State, ChangeAccountPin.Effect> {

    /* renamed from: i  reason: collision with root package name */
    public final UserRepository f35245i;

    /* renamed from: j  reason: collision with root package name */
    public final AppFeatures f35246j;

    /* renamed from: k  reason: collision with root package name */
    public final InputValidators.NonEmptyValidator f35247k;

    /* renamed from: l  reason: collision with root package name */
    public final InputValidators.InputValidator f35248l;

    /* renamed from: m  reason: collision with root package name */
    public final InputValidators.InputValidator f35249m;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ChangeAccountPinViewModel(androidx.lifecycle.SavedStateHandle r21, com.hansecom.abt.util.inputValidators.InputValidators r22, com.hansecom.abt.data.repositories.UserRepository r23, com.hansecom.abt.AppFeatures r24) {
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
            java.lang.String r5 = "userRepository"
            kotlin.jvm.internal.Intrinsics.i(r3, r5)
            java.lang.String r5 = "appFeatures"
            kotlin.jvm.internal.Intrinsics.i(r4, r5)
            com.hansecom.abt.presentation.screens.home.account.changeAccountPin.ChangeAccountPin$State r5 = new com.hansecom.abt.presentation.screens.home.account.changeAccountPin.ChangeAccountPin$State
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
            r0.f35245i = r3
            r0.f35246j = r4
            com.hansecom.abt.util.inputValidators.InputValidators$NonEmptyValidator r1 = r22.v()
            r0.f35247k = r1
            com.hansecom.abt.util.inputValidators.InputValidators$InputValidator r1 = r22.p()
            r0.f35248l = r1
            com.hansecom.abt.presentation.screens.home.account.changeAccountPin.u r1 = new com.hansecom.abt.presentation.screens.home.account.changeAccountPin.u
            r1.<init>(r0)
            com.hansecom.abt.util.inputValidators.InputValidators$InputValidator r1 = r2.n(r1)
            r0.f35249m = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.account.changeAccountPin.ChangeAccountPinViewModel.<init>(androidx.lifecycle.SavedStateHandle, com.hansecom.abt.util.inputValidators.InputValidators, com.hansecom.abt.data.repositories.UserRepository, com.hansecom.abt.AppFeatures):void");
    }

    public static final ChangeAccountPin.State G(ChangeAccountPin.Action action, ChangeAccountPin.State state) {
        Intrinsics.i(state, "$this$update");
        return ChangeAccountPin.State.b(state, ((ChangeAccountPin.Action.OldPinChange) action).a(), true, StringValue.Companion.a(), false, (String) null, false, false, (String) null, false, false, false, 2040, (Object) null);
    }

    public static final ChangeAccountPin.State H(ChangeAccountPin.Action action, ChangeAccountPinViewModel changeAccountPinViewModel, ChangeAccountPin.State state) {
        ChangeAccountPin.State state2 = state;
        Intrinsics.i(state2, "$this$update");
        return ChangeAccountPin.State.b(state2, (String) null, false, (StringValue) null, false, StringsKt.n1(StringExtKt.a(((ChangeAccountPin.Action.NewPinChange) action).a()), changeAccountPinViewModel.f35246j.D()), true, false, (String) null, false, false, false, 1999, (Object) null);
    }

    public static final ChangeAccountPin.State I(ChangeAccountPin.Action action, ChangeAccountPinViewModel changeAccountPinViewModel, ChangeAccountPin.State state) {
        ChangeAccountPin.State state2 = state;
        Intrinsics.i(state2, "$this$update");
        return ChangeAccountPin.State.b(state2, (String) null, false, (StringValue) null, false, (String) null, false, false, StringsKt.n1(StringExtKt.a(((ChangeAccountPin.Action.NewPinConfirmationChange) action).a()), changeAccountPinViewModel.f35246j.D()), true, false, false, 1663, (Object) null);
    }

    public static final ChangeAccountPin.State J(ChangeAccountPinViewModel changeAccountPinViewModel, ChangeAccountPin.State state) {
        Intrinsics.i(state, "$this$update");
        return ChangeAccountPin.State.b(state, (String) null, false, (StringValue) null, !((ChangeAccountPin.State) changeAccountPinViewModel.m()).o(), (String) null, false, false, (String) null, false, false, false, 2039, (Object) null);
    }

    public static final ChangeAccountPin.State K(ChangeAccountPinViewModel changeAccountPinViewModel, ChangeAccountPin.State state) {
        Intrinsics.i(state, "$this$update");
        return ChangeAccountPin.State.b(state, (String) null, false, (StringValue) null, false, (String) null, false, !((ChangeAccountPin.State) changeAccountPinViewModel.m()).n(), (String) null, false, false, false, 1983, (Object) null);
    }

    public static final ChangeAccountPin.State L(ChangeAccountPinViewModel changeAccountPinViewModel, ChangeAccountPin.State state) {
        Intrinsics.i(state, "$this$update");
        return ChangeAccountPin.State.b(state, (String) null, false, (StringValue) null, false, (String) null, false, false, (String) null, false, !((ChangeAccountPin.State) changeAccountPinViewModel.m()).l(), false, 1535, (Object) null);
    }

    public static final String M(ChangeAccountPinViewModel changeAccountPinViewModel) {
        return ((ChangeAccountPin.State) changeAccountPinViewModel.m()).d();
    }

    public static final ChangeAccountPin.State O(Throwable th, ChangeAccountPin.State state) {
        StringValue a2;
        Intrinsics.i(state, "$this$update");
        FieldErrorsException fieldErrorsException = th instanceof FieldErrorsException ? (FieldErrorsException) th : null;
        if (fieldErrorsException == null || (a2 = fieldErrorsException.l()) == null) {
            a2 = StringValue.Companion.a();
        }
        return ChangeAccountPin.State.b(state, (String) null, false, a2, false, (String) null, false, false, (String) null, false, false, false, 1019, (Object) null);
    }

    public static final ChangeAccountPin.State P(ChangeAccountPin.State state) {
        Intrinsics.i(state, "$this$update");
        return ChangeAccountPin.State.b(state, (String) null, false, (StringValue) null, false, (String) null, false, false, (String) null, false, false, true, 1023, (Object) null);
    }

    public static final ChangeAccountPin.State Q(ChangeAccountPin.State state) {
        Intrinsics.i(state, "$this$update");
        return ChangeAccountPin.State.b(state, (String) null, false, (StringValue) null, false, (String) null, false, false, (String) null, false, false, false, 1023, (Object) null);
    }

    public static final ChangeAccountPin.State S(ChangeAccountPinViewModel changeAccountPinViewModel, ChangeAccountPin.State state) {
        ChangeAccountPinViewModel changeAccountPinViewModel2 = changeAccountPinViewModel;
        ChangeAccountPin.State state2 = state;
        Intrinsics.i(state2, "$this$update");
        return ChangeAccountPin.State.b(state2, (String) null, changeAccountPinViewModel2.f35247k.a(((ChangeAccountPin.State) changeAccountPinViewModel.m()).h()), (StringValue) null, false, (String) null, changeAccountPinViewModel2.f35248l.a(((ChangeAccountPin.State) changeAccountPinViewModel.m()).d()), false, (String) null, changeAccountPinViewModel2.f35249m.a(((ChangeAccountPin.State) changeAccountPinViewModel.m()).e()), false, false, 1757, (Object) null);
    }

    /* renamed from: F */
    public Object o(ChangeAccountPin.Action action, Continuation continuation) {
        if (action instanceof ChangeAccountPin.Action.OldPinChange) {
            r(new n(action));
        } else if (action instanceof ChangeAccountPin.Action.NewPinChange) {
            r(new p(action, this));
        } else if (action instanceof ChangeAccountPin.Action.NewPinConfirmationChange) {
            r(new q(action, this));
        } else if (Intrinsics.d(action, ChangeAccountPin.Action.OldPinVisibilityToggle.f35235a)) {
            r(new r(this));
        } else if (Intrinsics.d(action, ChangeAccountPin.Action.NewPinVisibilityToggle.f35233a)) {
            r(new s(this));
        } else if (Intrinsics.d(action, ChangeAccountPin.Action.NewPinConfirmationVisibilityToggle.f35232a)) {
            r(new t(this));
        } else if (action instanceof ChangeAccountPin.Action.Confirm) {
            Object N = N(continuation);
            return N == IntrinsicsKt.f() ? N : Unit.f40552a;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.f40552a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object N(kotlin.coroutines.Continuation r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.hansecom.abt.presentation.screens.home.account.changeAccountPin.ChangeAccountPinViewModel$save$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.hansecom.abt.presentation.screens.home.account.changeAccountPin.ChangeAccountPinViewModel$save$1 r0 = (com.hansecom.abt.presentation.screens.home.account.changeAccountPin.ChangeAccountPinViewModel$save$1) r0
            int r1 = r0.F
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.F = r1
            goto L_0x0018
        L_0x0013:
            com.hansecom.abt.presentation.screens.home.account.changeAccountPin.ChangeAccountPinViewModel$save$1 r0 = new com.hansecom.abt.presentation.screens.home.account.changeAccountPin.ChangeAccountPinViewModel$save$1
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.D
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.F
            r3 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            java.lang.Object r0 = r0.C
            com.hansecom.abt.presentation.screens.home.account.changeAccountPin.ChangeAccountPinViewModel r0 = (com.hansecom.abt.presentation.screens.home.account.changeAccountPin.ChangeAccountPinViewModel) r0
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
            r5.R()
            android.os.Parcelable r6 = r5.m()
            com.hansecom.abt.presentation.screens.home.account.changeAccountPin.ChangeAccountPin$State r6 = (com.hansecom.abt.presentation.screens.home.account.changeAccountPin.ChangeAccountPin.State) r6
            boolean r6 = r6.c()
            if (r6 == 0) goto L_0x0050
            kotlin.Unit r6 = kotlin.Unit.f40552a
            return r6
        L_0x0050:
            com.hansecom.abt.presentation.screens.home.account.changeAccountPin.v r6 = new com.hansecom.abt.presentation.screens.home.account.changeAccountPin.v
            r6.<init>()
            r5.r(r6)
            com.hansecom.abt.data.repositories.UserRepository r6 = r5.f35245i
            android.os.Parcelable r2 = r5.m()
            com.hansecom.abt.presentation.screens.home.account.changeAccountPin.ChangeAccountPin$State r2 = (com.hansecom.abt.presentation.screens.home.account.changeAccountPin.ChangeAccountPin.State) r2
            java.lang.String r2 = r2.h()
            android.os.Parcelable r4 = r5.m()
            com.hansecom.abt.presentation.screens.home.account.changeAccountPin.ChangeAccountPin$State r4 = (com.hansecom.abt.presentation.screens.home.account.changeAccountPin.ChangeAccountPin.State) r4
            java.lang.String r4 = r4.d()
            r0.C = r5
            r0.F = r3
            java.lang.Object r6 = r6.M(r2, r4, r0)
            if (r6 != r1) goto L_0x0079
            return r1
        L_0x0079:
            r0 = r5
        L_0x007a:
            java.lang.Throwable r1 = kotlin.Result.e(r6)
            if (r1 != 0) goto L_0x0090
            kotlin.Unit r6 = (kotlin.Unit) r6
            com.hansecom.abt.presentation.screens.home.account.changeAccountPin.w r6 = new com.hansecom.abt.presentation.screens.home.account.changeAccountPin.w
            r6.<init>()
            r0.r(r6)
            com.hansecom.abt.presentation.screens.home.account.changeAccountPin.ChangeAccountPin$Effect$Success r6 = com.hansecom.abt.presentation.screens.home.account.changeAccountPin.ChangeAccountPin.Effect.Success.f35237a
            r0.p(r6)
            goto L_0x00a4
        L_0x0090:
            com.hansecom.abt.presentation.screens.home.account.changeAccountPin.x r6 = new com.hansecom.abt.presentation.screens.home.account.changeAccountPin.x
            r6.<init>(r1)
            r0.r(r6)
            com.hansecom.abt.presentation.screens.home.account.changeAccountPin.ChangeAccountPin$Effect$Error r6 = new com.hansecom.abt.presentation.screens.home.account.changeAccountPin.ChangeAccountPin$Effect$Error
            com.hansecom.abt.util.resourcesResolvers.StringValue r1 = com.hansecom.abt.api.ApiExceptionsKt.a(r1)
            r6.<init>(r1)
            r0.p(r6)
        L_0x00a4:
            kotlin.Unit r6 = kotlin.Unit.f40552a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.account.changeAccountPin.ChangeAccountPinViewModel.N(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void R() {
        r(new o(this));
    }
}
