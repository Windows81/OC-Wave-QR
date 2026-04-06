package com.hansecom.abt.presentation.screens.helpRequest;

import com.hansecom.abt.R;
import com.hansecom.abt.data.config.help.HelpScreenConfig;
import com.hansecom.abt.data.config.help.HelpScreenOptions;
import com.hansecom.abt.data.exceptions.FieldErrorsException;
import com.hansecom.abt.data.repositories.FareMediaRepository;
import com.hansecom.abt.data.useCases.SendHelpRequestUseCase;
import com.hansecom.abt.data.useCases.account.GetUserUseCase;
import com.hansecom.abt.data.useCases.auth.IsAccountLoggedInUseCase;
import com.hansecom.abt.presentation.mvi.MviViewModel;
import com.hansecom.abt.presentation.screens.helpRequest.HelpRequest;
import com.hansecom.abt.util.StringExtKt;
import com.hansecom.abt.util.inputValidators.InputValidators;
import com.hansecom.abt.util.resourcesResolvers.StringValue;
import com.hansecom.abt.util.resourcesResolvers.StringValueKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.collections.immutable.ImmutableList;

@Metadata
public final class HelpRequestViewModel extends MviViewModel<HelpRequest.Action, HelpRequest.State, HelpRequest.Effect> {

    /* renamed from: i  reason: collision with root package name */
    public final SendHelpRequestUseCase f34860i;

    /* renamed from: j  reason: collision with root package name */
    public final IsAccountLoggedInUseCase f34861j;

    /* renamed from: k  reason: collision with root package name */
    public final GetUserUseCase f34862k;

    /* renamed from: l  reason: collision with root package name */
    public final FareMediaRepository f34863l;

    /* renamed from: m  reason: collision with root package name */
    public final InputValidators.RegexInputValidator f34864m;

    /* renamed from: n  reason: collision with root package name */
    public final InputValidators.InputValidator f34865n;

    /* renamed from: o  reason: collision with root package name */
    public final InputValidators.InputValidator f34866o;

    /* renamed from: p  reason: collision with root package name */
    public final InputValidators.NonEmptyValidator f34867p;

    /* renamed from: q  reason: collision with root package name */
    public final InputValidators.NonEmptyValidator f34868q;

    /* renamed from: r  reason: collision with root package name */
    public final InputValidators.InputValidator f34869r;

    /* renamed from: s  reason: collision with root package name */
    public final InputValidators.NonEmptyValidator f34870s;

    /* renamed from: t  reason: collision with root package name */
    public final InputValidators.NonEmptyValidator f34871t;

    /* renamed from: u  reason: collision with root package name */
    public final InputValidators.NonEmptyValidator f34872u;

    /* renamed from: v  reason: collision with root package name */
    public final HelpRequestDestination f34873v;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public HelpRequestViewModel(androidx.lifecycle.SavedStateHandle r47, com.hansecom.abt.AppFeatures r48, com.hansecom.abt.util.inputValidators.InputValidators r49, com.hansecom.abt.data.useCases.SendHelpRequestUseCase r50, com.hansecom.abt.data.useCases.auth.IsAccountLoggedInUseCase r51, com.hansecom.abt.data.useCases.account.GetUserUseCase r52, com.hansecom.abt.data.repositories.FareMediaRepository r53) {
        /*
            r46 = this;
            r0 = r46
            r1 = r47
            r2 = r50
            r3 = r51
            r4 = r52
            r5 = r53
            java.lang.String r6 = "savedStateHandle"
            kotlin.jvm.internal.Intrinsics.i(r1, r6)
            java.lang.String r6 = "appFeatures"
            r7 = r48
            kotlin.jvm.internal.Intrinsics.i(r7, r6)
            java.lang.String r6 = "inputValidators"
            r8 = r49
            kotlin.jvm.internal.Intrinsics.i(r8, r6)
            java.lang.String r6 = "sendHelpRequestUseCase"
            kotlin.jvm.internal.Intrinsics.i(r2, r6)
            java.lang.String r6 = "isAccountLoggedInUseCase"
            kotlin.jvm.internal.Intrinsics.i(r3, r6)
            java.lang.String r6 = "getUserUseCase"
            kotlin.jvm.internal.Intrinsics.i(r4, r6)
            java.lang.String r6 = "fareMediaRepository"
            kotlin.jvm.internal.Intrinsics.i(r5, r6)
            com.hansecom.abt.presentation.screens.helpRequest.HelpRequest$State r6 = new com.hansecom.abt.presentation.screens.helpRequest.HelpRequest$State
            r9 = r6
            int r30 = r48.c()
            r44 = 1
            r45 = 0
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
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r36 = 0
            r37 = 0
            r38 = 0
            r39 = 0
            r40 = 0
            r41 = 0
            r42 = 0
            r43 = -1048577(0xffffffffffefffff, float:NaN)
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45)
            r0.<init>(r1, r6)
            r0.f34860i = r2
            r0.f34861j = r3
            r0.f34862k = r4
            r0.f34863l = r5
            com.hansecom.abt.util.inputValidators.InputValidators$RegexInputValidator r2 = r49.q()
            r0.f34864m = r2
            com.hansecom.abt.util.inputValidators.InputValidators$InputValidator r2 = r49.t()
            r0.f34865n = r2
            com.hansecom.abt.util.inputValidators.InputValidators$InputValidator r2 = r49.s()
            r0.f34866o = r2
            com.hansecom.abt.util.inputValidators.InputValidators$NonEmptyValidator r2 = r49.v()
            r0.f34867p = r2
            com.hansecom.abt.util.inputValidators.InputValidators$NonEmptyValidator r2 = r49.v()
            r0.f34868q = r2
            com.hansecom.abt.util.inputValidators.InputValidators$InputValidator r2 = r49.x()
            r0.f34869r = r2
            com.hansecom.abt.util.inputValidators.InputValidators$NonEmptyValidator r2 = r49.v()
            r0.f34870s = r2
            com.hansecom.abt.util.inputValidators.InputValidators$NonEmptyValidator r2 = r49.v()
            r0.f34871t = r2
            com.hansecom.abt.util.inputValidators.InputValidators$NonEmptyValidator r2 = r49.v()
            r0.f34872u = r2
            java.util.Map r2 = kotlin.collections.MapsKt.h()
            java.lang.Class<com.hansecom.abt.presentation.screens.helpRequest.HelpRequestDestination> r3 = com.hansecom.abt.presentation.screens.helpRequest.HelpRequestDestination.class
            kotlin.reflect.KClass r3 = kotlin.jvm.internal.Reflection.b(r3)
            java.lang.Object r1 = androidx.navigation.SavedStateHandleKt.a(r1, r3, r2)
            com.hansecom.abt.presentation.screens.helpRequest.HelpRequestDestination r1 = (com.hansecom.abt.presentation.screens.helpRequest.HelpRequestDestination) r1
            r0.f34873v = r1
            boolean r1 = r1.d()
            if (r1 == 0) goto L_0x00dc
            com.hansecom.abt.data.config.help.HelpScreenConfig r1 = r48.G()
            goto L_0x00e0
        L_0x00dc:
            com.hansecom.abt.data.config.help.HelpScreenConfig r1 = r48.n()
        L_0x00e0:
            com.hansecom.abt.presentation.screens.helpRequest.a0 r2 = new com.hansecom.abt.presentation.screens.helpRequest.a0
            r2.<init>(r0, r1)
            r0.r(r2)
            kotlinx.coroutines.CoroutineScope r2 = androidx.lifecycle.ViewModelKt.a(r46)
            com.hansecom.abt.presentation.screens.helpRequest.HelpRequestViewModel$2 r3 = new com.hansecom.abt.presentation.screens.helpRequest.HelpRequestViewModel$2
            r4 = 0
            r3.<init>(r0, r1, r4)
            r1 = 3
            r5 = 0
            r6 = 0
            r47 = r2
            r48 = r5
            r49 = r6
            r50 = r3
            r51 = r1
            r52 = r4
            kotlinx.coroutines.Job unused = kotlinx.coroutines.BuildersKt__Builders_commonKt.d(r47, r48, r49, r50, r51, r52)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.helpRequest.HelpRequestViewModel.<init>(androidx.lifecycle.SavedStateHandle, com.hansecom.abt.AppFeatures, com.hansecom.abt.util.inputValidators.InputValidators, com.hansecom.abt.data.useCases.SendHelpRequestUseCase, com.hansecom.abt.data.useCases.auth.IsAccountLoggedInUseCase, com.hansecom.abt.data.useCases.account.GetUserUseCase, com.hansecom.abt.data.repositories.FareMediaRepository):void");
    }

    public static final HelpRequest.State P(HelpRequestViewModel helpRequestViewModel, HelpScreenConfig helpScreenConfig, HelpRequest.State state) {
        Intrinsics.i(state, "$this$update");
        return HelpRequest.State.b(state, helpScreenConfig, helpScreenConfig.c() != null ? HelpScreenOptions.f33202a.b() : state.q(), helpScreenConfig.b() != null ? HelpScreenOptions.f33202a.a() : state.i(), helpScreenConfig.d() != null ? HelpScreenOptions.f33202a.c() : state.u(), (ImmutableList) null, (String) null, (StringValue) null, (String) null, (StringValue) null, (String) null, (StringValue) null, (String) null, (StringValue) null, (String) null, (StringValue) null, (String) null, (CardNumberState) null, false, (StringValue) null, false, 0, (String) null, false, (StringValue) null, (String) null, false, (StringValue) null, (String) null, false, (StringValue) null, false, false, helpRequestViewModel.f34873v.b(), -16, 0, (Object) null);
    }

    public static final HelpRequest.State W(HelpRequest.Action action, HelpRequest.State state) {
        Intrinsics.i(state, "$this$update");
        return HelpRequest.State.b(state, (HelpScreenConfig) null, (ImmutableList) null, (ImmutableList) null, (ImmutableList) null, (ImmutableList) null, ((HelpRequest.Action.EmailChange) action).a(), StringValue.Companion.a(), (String) null, (StringValue) null, (String) null, (StringValue) null, (String) null, (StringValue) null, (String) null, (StringValue) null, (String) null, (CardNumberState) null, false, (StringValue) null, false, 0, (String) null, false, (StringValue) null, (String) null, false, (StringValue) null, (String) null, false, (StringValue) null, false, false, false, -97, 1, (Object) null);
    }

    public static final HelpRequest.State X(HelpRequest.Action action, HelpRequest.State state) {
        Intrinsics.i(state, "$this$update");
        return HelpRequest.State.b(state, (HelpScreenConfig) null, (ImmutableList) null, (ImmutableList) null, (ImmutableList) null, (ImmutableList) null, (String) null, (StringValue) null, (String) null, (StringValue) null, (String) null, (StringValue) null, (String) null, (StringValue) null, (String) null, (StringValue) null, (String) null, (CardNumberState) null, false, (StringValue) null, false, 0, (String) null, false, (StringValue) null, (String) null, false, (StringValue) null, (String) null, ((HelpRequest.Action.CaseResolutionOpenSelector) action).a(), (StringValue) null, false, false, false, -268435457, 1, (Object) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0048  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.hansecom.abt.presentation.screens.helpRequest.HelpRequest.State Y(com.hansecom.abt.presentation.screens.helpRequest.HelpRequest.Action r38, com.hansecom.abt.presentation.screens.helpRequest.HelpRequest.State r39) {
        /*
            java.lang.String r0 = "$this$update"
            r1 = r39
            kotlin.jvm.internal.Intrinsics.i(r1, r0)
            r0 = r38
            com.hansecom.abt.presentation.screens.helpRequest.HelpRequest$Action$CardNumberSelect r0 = (com.hansecom.abt.presentation.screens.helpRequest.HelpRequest.Action.CardNumberSelect) r0
            com.hansecom.abt.presentation.screens.helpRequest.CardNumberState r2 = r0.a()
            java.lang.String r3 = ""
            r4 = 1
            if (r2 == 0) goto L_0x001d
            boolean r2 = r2.c()
            if (r2 != r4) goto L_0x001d
        L_0x001a:
            r17 = r3
            goto L_0x002e
        L_0x001d:
            com.hansecom.abt.presentation.screens.helpRequest.CardNumberState r2 = r0.a()
            if (r2 == 0) goto L_0x0028
            java.lang.String r2 = r2.a()
            goto L_0x0029
        L_0x0028:
            r2 = 0
        L_0x0029:
            if (r2 != 0) goto L_0x002c
            goto L_0x001a
        L_0x002c:
            r17 = r2
        L_0x002e:
            com.hansecom.abt.presentation.screens.helpRequest.CardNumberState r18 = r0.a()
            com.hansecom.abt.util.resourcesResolvers.StringValue$Companion r2 = com.hansecom.abt.util.resourcesResolvers.StringValue.Companion
            com.hansecom.abt.util.resourcesResolvers.StringValue r20 = r2.a()
            com.hansecom.abt.presentation.screens.helpRequest.CardNumberState r0 = r0.a()
            r2 = 0
            if (r0 == 0) goto L_0x0048
            boolean r0 = r0.c()
            if (r0 != r4) goto L_0x0048
            r21 = r4
            goto L_0x004a
        L_0x0048:
            r21 = r2
        L_0x004a:
            r36 = 1
            r37 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
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
            r19 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            r35 = -884737(0xfffffffffff27fff, float:NaN)
            r1 = r39
            com.hansecom.abt.presentation.screens.helpRequest.HelpRequest$State r0 = com.hansecom.abt.presentation.screens.helpRequest.HelpRequest.State.b(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.helpRequest.HelpRequestViewModel.Y(com.hansecom.abt.presentation.screens.helpRequest.HelpRequest$Action, com.hansecom.abt.presentation.screens.helpRequest.HelpRequest$State):com.hansecom.abt.presentation.screens.helpRequest.HelpRequest$State");
    }

    public static final HelpRequest.State Z(HelpRequest.Action action, HelpRequestViewModel helpRequestViewModel, HelpRequest.State state) {
        Intrinsics.i(state, "$this$update");
        return HelpRequest.State.b(state, (HelpScreenConfig) null, (ImmutableList) null, (ImmutableList) null, (ImmutableList) null, (ImmutableList) null, (String) null, (StringValue) null, (String) null, (StringValue) null, (String) null, (StringValue) null, (String) null, (StringValue) null, (String) null, (StringValue) null, StringsKt.n1(StringExtKt.a(((HelpRequest.Action.CardNumberChange) action).a()), ((HelpRequest.State) helpRequestViewModel.m()).f()), (CardNumberState) null, false, StringValue.Companion.a(), false, 0, (String) null, false, (StringValue) null, (String) null, false, (StringValue) null, (String) null, false, (StringValue) null, false, false, false, -294913, 1, (Object) null);
    }

    public static final HelpRequest.State a0(HelpRequest.Action action, HelpRequest.State state) {
        Intrinsics.i(state, "$this$update");
        return HelpRequest.State.b(state, (HelpScreenConfig) null, (ImmutableList) null, (ImmutableList) null, (ImmutableList) null, (ImmutableList) null, (String) null, (StringValue) null, (String) null, (StringValue) null, (String) null, (StringValue) null, (String) null, (StringValue) null, (String) null, (StringValue) null, (String) null, (CardNumberState) null, false, (StringValue) null, false, 0, ((HelpRequest.Action.CaseReasonChange) action).a(), false, StringValue.Companion.a(), (String) null, false, (StringValue) null, (String) null, false, (StringValue) null, false, false, false, -10485761, 1, (Object) null);
    }

    public static final HelpRequest.State b0(HelpRequest.Action action, HelpRequest.State state) {
        Intrinsics.i(state, "$this$update");
        return HelpRequest.State.b(state, (HelpScreenConfig) null, (ImmutableList) null, (ImmutableList) null, (ImmutableList) null, (ImmutableList) null, (String) null, (StringValue) null, (String) null, (StringValue) null, (String) null, (StringValue) null, (String) null, (StringValue) null, (String) null, (StringValue) null, (String) null, (CardNumberState) null, false, (StringValue) null, false, 0, (String) null, false, (StringValue) null, ((HelpRequest.Action.CaseCategoryChange) action).a(), false, StringValue.Companion.a(), (String) null, false, (StringValue) null, false, false, false, -83886081, 1, (Object) null);
    }

    public static final HelpRequest.State c0(HelpRequest.Action action, HelpRequest.State state) {
        Intrinsics.i(state, "$this$update");
        return HelpRequest.State.b(state, (HelpScreenConfig) null, (ImmutableList) null, (ImmutableList) null, (ImmutableList) null, (ImmutableList) null, (String) null, (StringValue) null, (String) null, (StringValue) null, (String) null, (StringValue) null, (String) null, (StringValue) null, (String) null, (StringValue) null, (String) null, (CardNumberState) null, false, (StringValue) null, false, 0, (String) null, false, (StringValue) null, (String) null, false, (StringValue) null, ((HelpRequest.Action.CaseResolutionChange) action).a(), false, StringValue.Companion.a(), false, false, false, -671088641, 1, (Object) null);
    }

    public static final HelpRequest.State d0(HelpRequest.Action action, HelpRequest.State state) {
        Intrinsics.i(state, "$this$update");
        return HelpRequest.State.b(state, (HelpScreenConfig) null, (ImmutableList) null, (ImmutableList) null, (ImmutableList) null, (ImmutableList) null, (String) null, (StringValue) null, (String) null, (StringValue) null, ((HelpRequest.Action.DescriptionChange) action).a(), StringValue.Companion.a(), (String) null, (StringValue) null, (String) null, (StringValue) null, (String) null, (CardNumberState) null, false, (StringValue) null, false, 0, (String) null, false, (StringValue) null, (String) null, false, (StringValue) null, (String) null, false, (StringValue) null, false, false, false, -1537, 1, (Object) null);
    }

    public static final HelpRequest.State e0(HelpRequest.Action action, HelpRequest.State state) {
        Intrinsics.i(state, "$this$update");
        return HelpRequest.State.b(state, (HelpScreenConfig) null, (ImmutableList) null, (ImmutableList) null, (ImmutableList) null, (ImmutableList) null, (String) null, (StringValue) null, ((HelpRequest.Action.SubjectChange) action).a(), StringValue.Companion.a(), (String) null, (StringValue) null, (String) null, (StringValue) null, (String) null, (StringValue) null, (String) null, (CardNumberState) null, false, (StringValue) null, false, 0, (String) null, false, (StringValue) null, (String) null, false, (StringValue) null, (String) null, false, (StringValue) null, false, false, false, -385, 1, (Object) null);
    }

    public static final HelpRequest.State f0(HelpRequest.Action action, HelpRequest.State state) {
        Intrinsics.i(state, "$this$update");
        return HelpRequest.State.b(state, (HelpScreenConfig) null, (ImmutableList) null, (ImmutableList) null, (ImmutableList) null, (ImmutableList) null, (String) null, (StringValue) null, (String) null, (StringValue) null, (String) null, (StringValue) null, ((HelpRequest.Action.ContactNameChange) action).a(), StringValue.Companion.a(), (String) null, (StringValue) null, (String) null, (CardNumberState) null, false, (StringValue) null, false, 0, (String) null, false, (StringValue) null, (String) null, false, (StringValue) null, (String) null, false, (StringValue) null, false, false, false, -6145, 1, (Object) null);
    }

    public static final HelpRequest.State g0(HelpRequest.Action action, HelpRequest.State state) {
        Intrinsics.i(state, "$this$update");
        return HelpRequest.State.b(state, (HelpScreenConfig) null, (ImmutableList) null, (ImmutableList) null, (ImmutableList) null, (ImmutableList) null, (String) null, (StringValue) null, (String) null, (StringValue) null, (String) null, (StringValue) null, (String) null, (StringValue) null, ((HelpRequest.Action.PhoneChange) action).a(), StringValue.Companion.a(), (String) null, (CardNumberState) null, false, (StringValue) null, false, 0, (String) null, false, (StringValue) null, (String) null, false, (StringValue) null, (String) null, false, (StringValue) null, false, false, false, -24577, 1, (Object) null);
    }

    public static final HelpRequest.State h0(HelpRequest.State state) {
        Intrinsics.i(state, "$this$update");
        return new HelpRequest.State((HelpScreenConfig) null, (ImmutableList) null, (ImmutableList) null, (ImmutableList) null, (ImmutableList) null, (String) null, (StringValue) null, (String) null, (StringValue) null, (String) null, (StringValue) null, (String) null, (StringValue) null, (String) null, (StringValue) null, (String) null, (CardNumberState) null, false, (StringValue) null, false, 0, (String) null, false, (StringValue) null, (String) null, false, (StringValue) null, (String) null, false, (StringValue) null, false, false, false, -1, 1, (DefaultConstructorMarker) null);
    }

    public static final HelpRequest.State i0(HelpRequest.Action action, HelpRequest.State state) {
        Intrinsics.i(state, "$this$update");
        return HelpRequest.State.b(state, (HelpScreenConfig) null, (ImmutableList) null, (ImmutableList) null, (ImmutableList) null, (ImmutableList) null, (String) null, (StringValue) null, (String) null, (StringValue) null, (String) null, (StringValue) null, (String) null, (StringValue) null, (String) null, (StringValue) null, (String) null, (CardNumberState) null, ((HelpRequest.Action.CardNumberOpenSelector) action).a(), (StringValue) null, false, 0, (String) null, false, (StringValue) null, (String) null, false, (StringValue) null, (String) null, false, (StringValue) null, false, false, false, -131073, 1, (Object) null);
    }

    public static final HelpRequest.State j0(HelpRequest.Action action, HelpRequest.State state) {
        Intrinsics.i(state, "$this$update");
        return HelpRequest.State.b(state, (HelpScreenConfig) null, (ImmutableList) null, (ImmutableList) null, (ImmutableList) null, (ImmutableList) null, (String) null, (StringValue) null, (String) null, (StringValue) null, (String) null, (StringValue) null, (String) null, (StringValue) null, (String) null, (StringValue) null, (String) null, (CardNumberState) null, false, (StringValue) null, false, 0, (String) null, ((HelpRequest.Action.CaseReasonOpenSelector) action).a(), (StringValue) null, (String) null, false, (StringValue) null, (String) null, false, (StringValue) null, false, false, false, -4194305, 1, (Object) null);
    }

    public static final HelpRequest.State k0(HelpRequest.Action action, HelpRequest.State state) {
        Intrinsics.i(state, "$this$update");
        return HelpRequest.State.b(state, (HelpScreenConfig) null, (ImmutableList) null, (ImmutableList) null, (ImmutableList) null, (ImmutableList) null, (String) null, (StringValue) null, (String) null, (StringValue) null, (String) null, (StringValue) null, (String) null, (StringValue) null, (String) null, (StringValue) null, (String) null, (CardNumberState) null, false, (StringValue) null, false, 0, (String) null, false, (StringValue) null, (String) null, ((HelpRequest.Action.CaseCategoryOpenSelector) action).a(), (StringValue) null, (String) null, false, (StringValue) null, false, false, false, -33554433, 1, (Object) null);
    }

    public static final HelpRequest.State m0(HelpRequest.State state) {
        Intrinsics.i(state, "$this$update");
        return HelpRequest.State.b(state, (HelpScreenConfig) null, (ImmutableList) null, (ImmutableList) null, (ImmutableList) null, (ImmutableList) null, (String) null, (StringValue) null, (String) null, (StringValue) null, (String) null, (StringValue) null, (String) null, (StringValue) null, (String) null, (StringValue) null, (String) null, (CardNumberState) null, false, (StringValue) null, false, 0, (String) null, false, (StringValue) null, (String) null, false, (StringValue) null, (String) null, false, (StringValue) null, true, false, false, -1073741825, 1, (Object) null);
    }

    public static final HelpRequest.State n0(HelpRequest.State state) {
        Intrinsics.i(state, "$this$update");
        return HelpRequest.State.b(state, (HelpScreenConfig) null, (ImmutableList) null, (ImmutableList) null, (ImmutableList) null, (ImmutableList) null, (String) null, (StringValue) null, (String) null, (StringValue) null, (String) null, (StringValue) null, (String) null, (StringValue) null, (String) null, (StringValue) null, (String) null, (CardNumberState) null, false, (StringValue) null, false, 0, (String) null, false, (StringValue) null, (String) null, false, (StringValue) null, (String) null, false, (StringValue) null, false, true, false, 1073741823, 1, (Object) null);
    }

    public static final HelpRequest.State o0(Throwable th, HelpRequest.State state) {
        Intrinsics.i(state, "$this$update");
        FieldErrorsException fieldErrorsException = (FieldErrorsException) th;
        return HelpRequest.State.b(state, (HelpScreenConfig) null, (ImmutableList) null, (ImmutableList) null, (ImmutableList) null, (ImmutableList) null, (String) null, StringValueKt.b(fieldErrorsException.e()), (String) null, StringValueKt.b(fieldErrorsException.p()), (String) null, StringValueKt.b(fieldErrorsException.q()), (String) null, (StringValue) null, (String) null, (StringValue) null, (String) null, (CardNumberState) null, false, (StringValue) null, false, 0, (String) null, false, (StringValue) null, (String) null, false, (StringValue) null, (String) null, false, (StringValue) null, false, false, false, -1073743169, 1, (Object) null);
    }

    public static final HelpRequest.State p0(HelpRequest.State state) {
        Intrinsics.i(state, "$this$update");
        return HelpRequest.State.b(state, (HelpScreenConfig) null, (ImmutableList) null, (ImmutableList) null, (ImmutableList) null, (ImmutableList) null, (String) null, (StringValue) null, (String) null, (StringValue) null, (String) null, (StringValue) null, (String) null, (StringValue) null, (String) null, (StringValue) null, (String) null, (CardNumberState) null, false, (StringValue) null, false, 0, (String) null, false, (StringValue) null, (String) null, false, (StringValue) null, (String) null, false, (StringValue) null, false, false, false, -1073741825, 1, (Object) null);
    }

    public static final HelpRequest.State r0(HelpRequestViewModel helpRequestViewModel, HelpRequest.State state) {
        HelpRequestViewModel helpRequestViewModel2 = helpRequestViewModel;
        Intrinsics.i(state, "$this$update");
        return HelpRequest.State.b(state, (HelpScreenConfig) null, (ImmutableList) null, (ImmutableList) null, (ImmutableList) null, (ImmutableList) null, (String) null, helpRequestViewModel2.s0(((HelpRequest.State) helpRequestViewModel.m()).A(), ((HelpRequest.State) helpRequestViewModel.m()).v().g(), helpRequestViewModel2.f34864m, R.string.c6), (String) null, helpRequestViewModel2.s0(((HelpRequest.State) helpRequestViewModel.m()).K(), ((HelpRequest.State) helpRequestViewModel.m()).v().i(), helpRequestViewModel2.f34865n, R.string.n6), (String) null, helpRequestViewModel2.s0(((HelpRequest.State) helpRequestViewModel.m()).y(), ((HelpRequest.State) helpRequestViewModel.m()).v().f(), helpRequestViewModel2.f34866o, R.string.Z5), (String) null, helpRequestViewModel2.s0(((HelpRequest.State) helpRequestViewModel.m()).w(), ((HelpRequest.State) helpRequestViewModel.m()).v().e(), helpRequestViewModel2.f34867p, R.string.W5), (String) null, helpRequestViewModel2.s0(((HelpRequest.State) helpRequestViewModel.m()).F(), ((HelpRequest.State) helpRequestViewModel.m()).v().h(), helpRequestViewModel2.f34869r, R.string.i6), (String) null, (CardNumberState) null, false, helpRequestViewModel2.s0(((HelpRequest.State) helpRequestViewModel.m()).c(), ((HelpRequest.State) helpRequestViewModel.m()).v().a(), helpRequestViewModel2.f34868q, R.string.K5), false, 0, (String) null, false, helpRequestViewModel2.s0(((HelpRequest.State) helpRequestViewModel.m()).n(), ((HelpRequest.State) helpRequestViewModel.m()).v().c(), helpRequestViewModel2.f34870s, R.string.Q5), (String) null, false, helpRequestViewModel2.s0(((HelpRequest.State) helpRequestViewModel.m()).j(), ((HelpRequest.State) helpRequestViewModel.m()).v().b(), helpRequestViewModel2.f34871t, R.string.N5), (String) null, false, helpRequestViewModel2.s0(((HelpRequest.State) helpRequestViewModel.m()).r(), ((HelpRequest.State) helpRequestViewModel.m()).v().d(), helpRequestViewModel2.f34872u, R.string.T5), false, false, false, -612652353, 1, (Object) null);
    }

    /* renamed from: V */
    public Object o(HelpRequest.Action action, Continuation continuation) {
        if (action instanceof HelpRequest.Action.EmailChange) {
            r(new q0(action));
        } else if (action instanceof HelpRequest.Action.DescriptionChange) {
            r(new c0(action));
        } else if (action instanceof HelpRequest.Action.SubjectChange) {
            r(new d0(action));
        } else if (action instanceof HelpRequest.Action.ContactNameChange) {
            r(new e0(action));
        } else if (action instanceof HelpRequest.Action.PhoneChange) {
            r(new f0(action));
        } else if (Intrinsics.d(action, HelpRequest.Action.Send.f34836a)) {
            Object l0 = l0(continuation);
            return l0 == IntrinsicsKt.f() ? l0 : Unit.f40552a;
        } else if (Intrinsics.d(action, HelpRequest.Action.CloseSuccess.f34831a)) {
            r(new g0());
            p(HelpRequest.Effect.GoBack.f34839a);
        } else if (action instanceof HelpRequest.Action.CardNumberOpenSelector) {
            r(new h0(action));
        } else if (action instanceof HelpRequest.Action.CaseReasonOpenSelector) {
            r(new i0(action));
        } else if (action instanceof HelpRequest.Action.CaseCategoryOpenSelector) {
            r(new j0(action));
        } else if (action instanceof HelpRequest.Action.CaseResolutionOpenSelector) {
            r(new k0(action));
        } else if (action instanceof HelpRequest.Action.CardNumberSelect) {
            r(new r0(action));
        } else if (action instanceof HelpRequest.Action.CardNumberChange) {
            r(new s0(action, this));
        } else if (action instanceof HelpRequest.Action.CaseReasonChange) {
            r(new t0(action));
        } else if (action instanceof HelpRequest.Action.CaseCategoryChange) {
            r(new u0(action));
        } else if (action instanceof HelpRequest.Action.CaseResolutionChange) {
            r(new b0(action));
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.f40552a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01a1  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01ac  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object l0(kotlin.coroutines.Continuation r15) {
        /*
            r14 = this;
            boolean r0 = r15 instanceof com.hansecom.abt.presentation.screens.helpRequest.HelpRequestViewModel$sendRequest$1
            if (r0 == 0) goto L_0x0014
            r0 = r15
            com.hansecom.abt.presentation.screens.helpRequest.HelpRequestViewModel$sendRequest$1 r0 = (com.hansecom.abt.presentation.screens.helpRequest.HelpRequestViewModel$sendRequest$1) r0
            int r1 = r0.F
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0014
            int r1 = r1 - r2
            r0.F = r1
        L_0x0012:
            r11 = r0
            goto L_0x001a
        L_0x0014:
            com.hansecom.abt.presentation.screens.helpRequest.HelpRequestViewModel$sendRequest$1 r0 = new com.hansecom.abt.presentation.screens.helpRequest.HelpRequestViewModel$sendRequest$1
            r0.<init>(r14, r15)
            goto L_0x0012
        L_0x001a:
            java.lang.Object r15 = r11.D
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r1 = r11.F
            r2 = 1
            if (r1 == 0) goto L_0x003e
            if (r1 != r2) goto L_0x0036
            java.lang.Object r0 = r11.C
            com.hansecom.abt.presentation.screens.helpRequest.HelpRequestViewModel r0 = (com.hansecom.abt.presentation.screens.helpRequest.HelpRequestViewModel) r0
            kotlin.ResultKt.b(r15)
            kotlin.Result r15 = (kotlin.Result) r15
            java.lang.Object r15 = r15.j()
            goto L_0x019b
        L_0x0036:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L_0x003e:
            kotlin.ResultKt.b(r15)
            boolean r15 = r14.q0()
            if (r15 == 0) goto L_0x004a
            kotlin.Unit r15 = kotlin.Unit.f40552a
            return r15
        L_0x004a:
            com.hansecom.abt.presentation.screens.helpRequest.l0 r15 = new com.hansecom.abt.presentation.screens.helpRequest.l0
            r15.<init>()
            r14.r(r15)
            com.hansecom.abt.data.useCases.SendHelpRequestUseCase r1 = r14.f34860i
            android.os.Parcelable r15 = r14.m()
            com.hansecom.abt.presentation.screens.helpRequest.HelpRequest$State r15 = (com.hansecom.abt.presentation.screens.helpRequest.HelpRequest.State) r15
            java.lang.String r15 = r15.A()
            android.os.Parcelable r3 = r14.m()
            com.hansecom.abt.presentation.screens.helpRequest.HelpRequest$State r3 = (com.hansecom.abt.presentation.screens.helpRequest.HelpRequest.State) r3
            com.hansecom.abt.data.config.help.HelpScreenConfig r3 = r3.v()
            java.lang.Boolean r3 = r3.g()
            r4 = 0
            if (r3 == 0) goto L_0x0076
            int r3 = r15.length()
            if (r3 <= 0) goto L_0x0076
            goto L_0x0077
        L_0x0076:
            r15 = r4
        L_0x0077:
            android.os.Parcelable r3 = r14.m()
            com.hansecom.abt.presentation.screens.helpRequest.HelpRequest$State r3 = (com.hansecom.abt.presentation.screens.helpRequest.HelpRequest.State) r3
            java.lang.String r3 = r3.K()
            android.os.Parcelable r5 = r14.m()
            com.hansecom.abt.presentation.screens.helpRequest.HelpRequest$State r5 = (com.hansecom.abt.presentation.screens.helpRequest.HelpRequest.State) r5
            com.hansecom.abt.data.config.help.HelpScreenConfig r5 = r5.v()
            java.lang.Boolean r5 = r5.i()
            if (r5 == 0) goto L_0x0098
            int r5 = r3.length()
            if (r5 <= 0) goto L_0x0098
            goto L_0x0099
        L_0x0098:
            r3 = r4
        L_0x0099:
            android.os.Parcelable r5 = r14.m()
            com.hansecom.abt.presentation.screens.helpRequest.HelpRequest$State r5 = (com.hansecom.abt.presentation.screens.helpRequest.HelpRequest.State) r5
            java.lang.String r5 = r5.y()
            android.os.Parcelable r6 = r14.m()
            com.hansecom.abt.presentation.screens.helpRequest.HelpRequest$State r6 = (com.hansecom.abt.presentation.screens.helpRequest.HelpRequest.State) r6
            com.hansecom.abt.data.config.help.HelpScreenConfig r6 = r6.v()
            java.lang.Boolean r6 = r6.f()
            if (r6 == 0) goto L_0x00ba
            int r6 = r5.length()
            if (r6 <= 0) goto L_0x00ba
            goto L_0x00bb
        L_0x00ba:
            r5 = r4
        L_0x00bb:
            android.os.Parcelable r6 = r14.m()
            com.hansecom.abt.presentation.screens.helpRequest.HelpRequest$State r6 = (com.hansecom.abt.presentation.screens.helpRequest.HelpRequest.State) r6
            java.lang.String r6 = r6.w()
            android.os.Parcelable r7 = r14.m()
            com.hansecom.abt.presentation.screens.helpRequest.HelpRequest$State r7 = (com.hansecom.abt.presentation.screens.helpRequest.HelpRequest.State) r7
            com.hansecom.abt.data.config.help.HelpScreenConfig r7 = r7.v()
            java.lang.Boolean r7 = r7.e()
            if (r7 == 0) goto L_0x00dc
            int r7 = r6.length()
            if (r7 <= 0) goto L_0x00dc
            goto L_0x00dd
        L_0x00dc:
            r6 = r4
        L_0x00dd:
            android.os.Parcelable r7 = r14.m()
            com.hansecom.abt.presentation.screens.helpRequest.HelpRequest$State r7 = (com.hansecom.abt.presentation.screens.helpRequest.HelpRequest.State) r7
            java.lang.String r7 = r7.F()
            android.os.Parcelable r8 = r14.m()
            com.hansecom.abt.presentation.screens.helpRequest.HelpRequest$State r8 = (com.hansecom.abt.presentation.screens.helpRequest.HelpRequest.State) r8
            com.hansecom.abt.data.config.help.HelpScreenConfig r8 = r8.v()
            java.lang.Boolean r8 = r8.h()
            if (r8 == 0) goto L_0x00fe
            int r8 = r7.length()
            if (r8 <= 0) goto L_0x00fe
            goto L_0x00ff
        L_0x00fe:
            r7 = r4
        L_0x00ff:
            android.os.Parcelable r8 = r14.m()
            com.hansecom.abt.presentation.screens.helpRequest.HelpRequest$State r8 = (com.hansecom.abt.presentation.screens.helpRequest.HelpRequest.State) r8
            java.lang.String r8 = r8.c()
            android.os.Parcelable r9 = r14.m()
            com.hansecom.abt.presentation.screens.helpRequest.HelpRequest$State r9 = (com.hansecom.abt.presentation.screens.helpRequest.HelpRequest.State) r9
            com.hansecom.abt.data.config.help.HelpScreenConfig r9 = r9.v()
            java.lang.Boolean r9 = r9.a()
            if (r9 == 0) goto L_0x0120
            int r9 = r8.length()
            if (r9 <= 0) goto L_0x0120
            goto L_0x0121
        L_0x0120:
            r8 = r4
        L_0x0121:
            android.os.Parcelable r9 = r14.m()
            com.hansecom.abt.presentation.screens.helpRequest.HelpRequest$State r9 = (com.hansecom.abt.presentation.screens.helpRequest.HelpRequest.State) r9
            java.lang.String r9 = r9.n()
            android.os.Parcelable r10 = r14.m()
            com.hansecom.abt.presentation.screens.helpRequest.HelpRequest$State r10 = (com.hansecom.abt.presentation.screens.helpRequest.HelpRequest.State) r10
            com.hansecom.abt.data.config.help.HelpScreenConfig r10 = r10.v()
            java.lang.Boolean r10 = r10.c()
            if (r10 == 0) goto L_0x0142
            int r10 = r9.length()
            if (r10 <= 0) goto L_0x0142
            goto L_0x0143
        L_0x0142:
            r9 = r4
        L_0x0143:
            android.os.Parcelable r10 = r14.m()
            com.hansecom.abt.presentation.screens.helpRequest.HelpRequest$State r10 = (com.hansecom.abt.presentation.screens.helpRequest.HelpRequest.State) r10
            java.lang.String r10 = r10.j()
            android.os.Parcelable r12 = r14.m()
            com.hansecom.abt.presentation.screens.helpRequest.HelpRequest$State r12 = (com.hansecom.abt.presentation.screens.helpRequest.HelpRequest.State) r12
            com.hansecom.abt.data.config.help.HelpScreenConfig r12 = r12.v()
            java.lang.Boolean r12 = r12.b()
            if (r12 == 0) goto L_0x0164
            int r12 = r10.length()
            if (r12 <= 0) goto L_0x0164
            goto L_0x0165
        L_0x0164:
            r10 = r4
        L_0x0165:
            android.os.Parcelable r12 = r14.m()
            com.hansecom.abt.presentation.screens.helpRequest.HelpRequest$State r12 = (com.hansecom.abt.presentation.screens.helpRequest.HelpRequest.State) r12
            java.lang.String r12 = r12.r()
            android.os.Parcelable r13 = r14.m()
            com.hansecom.abt.presentation.screens.helpRequest.HelpRequest$State r13 = (com.hansecom.abt.presentation.screens.helpRequest.HelpRequest.State) r13
            com.hansecom.abt.data.config.help.HelpScreenConfig r13 = r13.v()
            java.lang.Boolean r13 = r13.d()
            if (r13 == 0) goto L_0x0186
            int r13 = r12.length()
            if (r13 <= 0) goto L_0x0186
            goto L_0x0187
        L_0x0186:
            r12 = r4
        L_0x0187:
            r11.C = r14
            r11.F = r2
            r2 = r15
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r9
            r9 = r10
            r10 = r12
            java.lang.Object r15 = r1.b(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            if (r15 != r0) goto L_0x019a
            return r0
        L_0x019a:
            r0 = r14
        L_0x019b:
            java.lang.Throwable r1 = kotlin.Result.e(r15)
            if (r1 != 0) goto L_0x01ac
            com.hansecom.mapi.models.HelpRequestResponse r15 = (com.hansecom.mapi.models.HelpRequestResponse) r15
            com.hansecom.abt.presentation.screens.helpRequest.n0 r15 = new com.hansecom.abt.presentation.screens.helpRequest.n0
            r15.<init>()
            r0.r(r15)
            goto L_0x01cd
        L_0x01ac:
            boolean r15 = r1 instanceof com.hansecom.abt.data.exceptions.FieldErrorsException
            if (r15 == 0) goto L_0x01b9
            com.hansecom.abt.presentation.screens.helpRequest.o0 r15 = new com.hansecom.abt.presentation.screens.helpRequest.o0
            r15.<init>(r1)
            r0.r(r15)
            goto L_0x01cd
        L_0x01b9:
            com.hansecom.abt.presentation.screens.helpRequest.p0 r15 = new com.hansecom.abt.presentation.screens.helpRequest.p0
            r15.<init>()
            r0.r(r15)
            com.hansecom.abt.presentation.screens.helpRequest.HelpRequest$Effect$Error r15 = new com.hansecom.abt.presentation.screens.helpRequest.HelpRequest$Effect$Error
            com.hansecom.abt.util.resourcesResolvers.StringValue r1 = com.hansecom.abt.api.ApiExceptionsKt.a(r1)
            r15.<init>(r1)
            r0.p(r15)
        L_0x01cd:
            kotlin.Unit r15 = kotlin.Unit.f40552a
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.helpRequest.HelpRequestViewModel.l0(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final boolean q0() {
        r(new m0(this));
        return ((HelpRequest.State) m()).C();
    }

    public final StringValue s0(String str, Boolean bool, InputValidators.InputValidator inputValidator, int i2) {
        return (!Intrinsics.d(bool, Boolean.TRUE) || inputValidator.a(str)) ? StringValue.Companion.a() : StringValueKt.c(i2);
    }
}
