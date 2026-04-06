package com.hansecom.abt.presentation.screens.home.account.address;

import com.hansecom.abt.data.repositories.UserRepository;
import com.hansecom.abt.data.repositories.generalData.CountriesRepository;
import com.hansecom.abt.data.useCases.account.ChangeAddressUseCase;
import com.hansecom.abt.presentation.mvi.MviViewModel;
import com.hansecom.abt.presentation.screens.home.account.address.ChangeAddress;
import com.hansecom.abt.util.resourcesResolvers.StringValue;
import com.hansecom.mapi.models.Country;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

@Metadata
public final class ChangeAddressViewModel extends MviViewModel<ChangeAddress.Action, ChangeAddress.State, ChangeAddress.Effect> {

    /* renamed from: i  reason: collision with root package name */
    public final UserRepository f35139i;

    /* renamed from: j  reason: collision with root package name */
    public final ChangeAddressUseCase f35140j;

    /* renamed from: k  reason: collision with root package name */
    public final CountriesRepository f35141k;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ChangeAddressViewModel(androidx.lifecycle.SavedStateHandle r35, com.hansecom.abt.data.repositories.UserRepository r36, com.hansecom.abt.data.useCases.account.ChangeAddressUseCase r37, com.hansecom.abt.data.repositories.generalData.CountriesRepository r38) {
        /*
            r34 = this;
            r8 = r34
            r0 = r35
            r1 = r36
            r2 = r37
            r3 = r38
            java.lang.String r4 = "savedStateHandle"
            kotlin.jvm.internal.Intrinsics.i(r0, r4)
            java.lang.String r4 = "userRepository"
            kotlin.jvm.internal.Intrinsics.i(r1, r4)
            java.lang.String r4 = "changeAddressUseCase"
            kotlin.jvm.internal.Intrinsics.i(r2, r4)
            java.lang.String r4 = "countriesRepository"
            kotlin.jvm.internal.Intrinsics.i(r3, r4)
            com.hansecom.abt.presentation.screens.home.account.address.ChangeAddress$State r4 = new com.hansecom.abt.presentation.screens.home.account.address.ChangeAddress$State
            r9 = r4
            r26 = 65535(0xffff, float:9.1834E-41)
            r27 = 0
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
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r8.<init>(r0, r4)
            r8.f35139i = r1
            r8.f35140j = r2
            r8.f35141k = r3
            kotlinx.coroutines.CoroutineScope r28 = androidx.lifecycle.ViewModelKt.a(r34)
            com.hansecom.abt.presentation.screens.home.account.address.ChangeAddressViewModel$1 r0 = new com.hansecom.abt.presentation.screens.home.account.address.ChangeAddressViewModel$1
            r1 = 0
            r0.<init>(r8, r1)
            r32 = 3
            r33 = 0
            r29 = 0
            r30 = 0
            r31 = r0
            kotlinx.coroutines.Job unused = kotlinx.coroutines.BuildersKt__Builders_commonKt.d(r28, r29, r30, r31, r32, r33)
            com.hansecom.abt.presentation.screens.home.account.address.ChangeAddressViewModel$2 r5 = new com.hansecom.abt.presentation.screens.home.account.address.ChangeAddressViewModel$2
            r5.<init>(r8, r1)
            r6 = 7
            r7 = 0
            r2 = 0
            r3 = 0
            r0 = r34
            com.hansecom.abt.presentation.mvi.MviViewModel.t(r0, r1, r2, r3, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.account.address.ChangeAddressViewModel.<init>(androidx.lifecycle.SavedStateHandle, com.hansecom.abt.data.repositories.UserRepository, com.hansecom.abt.data.useCases.account.ChangeAddressUseCase, com.hansecom.abt.data.repositories.generalData.CountriesRepository):void");
    }

    public static final ChangeAddress.State M(ChangeAddress.Action action, ChangeAddress.State state) {
        Intrinsics.i(state, "$this$update");
        return ChangeAddress.State.b(state, (String) null, (StringValue) null, (String) null, (StringValue) null, ((ChangeAddress.Action.CityChange) action).a(), StringValue.Companion.a(), (String) null, (StringValue) null, (String) null, (StringValue) null, (String) null, (StringValue) null, false, false, (ChangeAddress.State.ChooseCountry) null, (ChangeAddress.State.ChooseState) null, 65487, (Object) null);
    }

    public static final ChangeAddress.State N(ChangeAddress.Action action, ChangeAddress.State state) {
        Intrinsics.i(state, "$this$update");
        return ChangeAddress.State.b(state, (String) null, (StringValue) null, (String) null, (StringValue) null, (String) null, (StringValue) null, (String) null, (StringValue) null, ((ChangeAddress.Action.PostalCodeChange) action).a(), StringValue.Companion.a(), (String) null, (StringValue) null, false, false, (ChangeAddress.State.ChooseCountry) null, (ChangeAddress.State.ChooseState) null, 64767, (Object) null);
    }

    public static final ChangeAddress.State O(ChangeAddress.Action action, ChangeAddress.State state) {
        Intrinsics.i(state, "$this$update");
        return ChangeAddress.State.b(state, (String) null, (StringValue) null, (String) null, (StringValue) null, (String) null, (StringValue) null, ((ChangeAddress.Action.StateChange) action).a(), StringValue.Companion.a(), (String) null, (StringValue) null, (String) null, (StringValue) null, false, false, (ChangeAddress.State.ChooseCountry) null, (ChangeAddress.State.ChooseState) null, 65343, (Object) null);
    }

    public static final ChangeAddress.State P(ChangeAddress.Action action, ChangeAddress.State state) {
        Intrinsics.i(state, "$this$update");
        return ChangeAddress.State.b(state, ((ChangeAddress.Action.StreetNameChange) action).a(), StringValue.Companion.a(), (String) null, (StringValue) null, (String) null, (StringValue) null, (String) null, (StringValue) null, (String) null, (StringValue) null, (String) null, (StringValue) null, false, false, (ChangeAddress.State.ChooseCountry) null, (ChangeAddress.State.ChooseState) null, 65532, (Object) null);
    }

    public static final ChangeAddress.State Q(ChangeAddress.Action action, ChangeAddress.State state) {
        Intrinsics.i(state, "$this$update");
        return ChangeAddress.State.b(state, (String) null, (StringValue) null, ((ChangeAddress.Action.StreetNameSecondLineChange) action).a(), StringValue.Companion.a(), (String) null, (StringValue) null, (String) null, (StringValue) null, (String) null, (StringValue) null, (String) null, (StringValue) null, false, false, (ChangeAddress.State.ChooseCountry) null, (ChangeAddress.State.ChooseState) null, 65523, (Object) null);
    }

    public static final ChangeAddress.State R(Country country, ChangeAddress.State state) {
        Intrinsics.i(state, "$this$update");
        String b2 = country.b();
        String str = b2 == null ? "" : b2;
        Boolean c2 = country.c();
        boolean booleanValue = c2 != null ? c2.booleanValue() : false;
        String k2 = !Intrinsics.d(Boolean.valueOf(state.j()), country.c()) ? "" : state.k();
        StringValue.Companion companion = StringValue.Companion;
        return ChangeAddress.State.b(state, (String) null, (StringValue) null, (String) null, (StringValue) null, (String) null, (StringValue) null, k2, companion.a(), (String) null, (StringValue) null, str, companion.a(), booleanValue, false, (ChangeAddress.State.ChooseCountry) null, (ChangeAddress.State.ChooseState) null, 58175, (Object) null);
    }

    public static final ChangeAddress.State S(ChangeAddress.Action action, ChangeAddress.State state) {
        Intrinsics.i(state, "$this$update");
        return ChangeAddress.State.b(state, (String) null, (StringValue) null, (String) null, (StringValue) null, (String) null, (StringValue) null, ((ChangeAddress.Action.ChooseState.StateChange) action).a(), StringValue.Companion.a(), (String) null, (StringValue) null, (String) null, (StringValue) null, false, false, (ChangeAddress.State.ChooseCountry) null, (ChangeAddress.State.ChooseState) null, 65343, (Object) null);
    }

    public static final ChangeAddress.State T(ChangeAddress.Action action, ChangeAddress.State state) {
        Intrinsics.i(state, "$this$update");
        return ChangeAddress.State.b(state, (String) null, (StringValue) null, (String) null, (StringValue) null, (String) null, (StringValue) null, (String) null, (StringValue) null, (String) null, (StringValue) null, (String) null, (StringValue) null, false, false, ChangeAddress.State.ChooseCountry.b(state.c(), (ImmutableList) null, ((ChangeAddress.Action.ChooseCountry.FilterChange) action).a(), 1, (Object) null), (ChangeAddress.State.ChooseState) null, 49151, (Object) null);
    }

    public static final ChangeAddress.State U(ChangeAddress.Action action, ChangeAddress.State state) {
        Intrinsics.i(state, "$this$update");
        return ChangeAddress.State.b(state, (String) null, (StringValue) null, (String) null, (StringValue) null, (String) null, (StringValue) null, (String) null, (StringValue) null, (String) null, (StringValue) null, (String) null, (StringValue) null, false, false, (ChangeAddress.State.ChooseCountry) null, ChangeAddress.State.ChooseState.b(state.d(), (ImmutableList) null, ((ChangeAddress.Action.ChooseState.FilterChange) action).a(), 1, (Object) null), 32767, (Object) null);
    }

    public static final ChangeAddress.State W(ChangeAddress.State state) {
        Intrinsics.i(state, "$this$update");
        return ChangeAddress.State.b(state, (String) null, (StringValue) null, (String) null, (StringValue) null, (String) null, (StringValue) null, (String) null, (StringValue) null, (String) null, (StringValue) null, (String) null, (StringValue) null, false, true, (ChangeAddress.State.ChooseCountry) null, (ChangeAddress.State.ChooseState) null, 57343, (Object) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000f, code lost:
        r0 = r0.c();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.hansecom.abt.presentation.screens.home.account.address.ChangeAddress.State X(com.hansecom.mapi.models.User r20, com.hansecom.mapi.models.Country r21, com.hansecom.abt.presentation.screens.home.account.address.ChangeAddress.State r22) {
        /*
            java.lang.String r0 = "$this$update"
            r1 = r22
            kotlin.jvm.internal.Intrinsics.i(r1, r0)
            com.hansecom.mapi.models.UserAddress r0 = r20.i()
            java.lang.String r2 = ""
            if (r0 == 0) goto L_0x0018
            java.lang.String r0 = r0.c()
            if (r0 != 0) goto L_0x0016
            goto L_0x0018
        L_0x0016:
            r8 = r0
            goto L_0x0019
        L_0x0018:
            r8 = r2
        L_0x0019:
            com.hansecom.mapi.models.UserAddress r0 = r20.i()
            if (r0 == 0) goto L_0x0025
            java.lang.String r0 = r0.e()
            if (r0 != 0) goto L_0x0026
        L_0x0025:
            r0 = r2
        L_0x0026:
            com.hansecom.mapi.models.UserAddress r3 = r20.i()
            if (r3 == 0) goto L_0x0035
            java.lang.String r3 = r3.f()
            if (r3 != 0) goto L_0x0033
            goto L_0x0035
        L_0x0033:
            r4 = r3
            goto L_0x0036
        L_0x0035:
            r4 = r2
        L_0x0036:
            com.hansecom.mapi.models.UserAddress r3 = r20.i()
            if (r3 == 0) goto L_0x0045
            java.lang.String r3 = r3.a()
            if (r3 != 0) goto L_0x0043
            goto L_0x0045
        L_0x0043:
            r6 = r3
            goto L_0x0046
        L_0x0045:
            r6 = r2
        L_0x0046:
            com.hansecom.mapi.models.UserAddress r3 = r20.i()
            if (r3 == 0) goto L_0x0055
            java.lang.String r3 = r3.g()
            if (r3 != 0) goto L_0x0053
            goto L_0x0055
        L_0x0053:
            r10 = r3
            goto L_0x0056
        L_0x0055:
            r10 = r2
        L_0x0056:
            com.hansecom.mapi.models.UserAddress r3 = r20.i()
            if (r3 == 0) goto L_0x0065
            java.lang.String r3 = r3.b()
            if (r3 != 0) goto L_0x0063
            goto L_0x0065
        L_0x0063:
            r12 = r3
            goto L_0x0066
        L_0x0065:
            r12 = r2
        L_0x0066:
            if (r21 == 0) goto L_0x0074
            java.lang.Boolean r2 = r21.c()
            if (r2 == 0) goto L_0x0074
            boolean r2 = r2.booleanValue()
        L_0x0072:
            r14 = r2
            goto L_0x0076
        L_0x0074:
            r2 = 0
            goto L_0x0072
        L_0x0076:
            r18 = 51882(0xcaaa, float:7.2702E-41)
            r19 = 0
            r3 = 0
            r5 = 0
            r7 = 0
            r9 = 0
            r11 = 0
            r13 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r1 = r22
            r2 = r0
            com.hansecom.abt.presentation.screens.home.account.address.ChangeAddress$State r0 = com.hansecom.abt.presentation.screens.home.account.address.ChangeAddress.State.b(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.account.address.ChangeAddressViewModel.X(com.hansecom.mapi.models.User, com.hansecom.mapi.models.Country, com.hansecom.abt.presentation.screens.home.account.address.ChangeAddress$State):com.hansecom.abt.presentation.screens.home.account.address.ChangeAddress$State");
    }

    public static final ChangeAddress.State Z(ChangeAddress.State state) {
        Intrinsics.i(state, "$this$update");
        return ChangeAddress.State.b(state, (String) null, (StringValue) null, (String) null, (StringValue) null, (String) null, (StringValue) null, (String) null, (StringValue) null, (String) null, (StringValue) null, (String) null, (StringValue) null, false, true, (ChangeAddress.State.ChooseCountry) null, (ChangeAddress.State.ChooseState) null, 57343, (Object) null);
    }

    public static final ChangeAddress.State a0(ChangeAddress.State state) {
        Intrinsics.i(state, "$this$update");
        return ChangeAddress.State.b(state, (String) null, (StringValue) null, (String) null, (StringValue) null, (String) null, (StringValue) null, (String) null, (StringValue) null, (String) null, (StringValue) null, (String) null, (StringValue) null, false, false, (ChangeAddress.State.ChooseCountry) null, (ChangeAddress.State.ChooseState) null, 57343, (Object) null);
    }

    public static final ChangeAddress.State b0(ChangeAddress.State state) {
        Intrinsics.i(state, "$this$update");
        return ChangeAddress.State.b(state, (String) null, (StringValue) null, (String) null, (StringValue) null, (String) null, (StringValue) null, (String) null, (StringValue) null, (String) null, (StringValue) null, (String) null, (StringValue) null, false, false, (ChangeAddress.State.ChooseCountry) null, (ChangeAddress.State.ChooseState) null, 57343, (Object) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: L */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object o(com.hansecom.abt.presentation.screens.home.account.address.ChangeAddress.Action r6, kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.hansecom.abt.presentation.screens.home.account.address.ChangeAddressViewModel$handle$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.hansecom.abt.presentation.screens.home.account.address.ChangeAddressViewModel$handle$1 r0 = (com.hansecom.abt.presentation.screens.home.account.address.ChangeAddressViewModel$handle$1) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.G = r1
            goto L_0x0018
        L_0x0013:
            com.hansecom.abt.presentation.screens.home.account.address.ChangeAddressViewModel$handle$1 r0 = new com.hansecom.abt.presentation.screens.home.account.address.ChangeAddressViewModel$handle$1
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.E
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.G
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0047
            if (r2 == r4) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            kotlin.ResultKt.b(r7)
            goto L_0x010a
        L_0x002d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0035:
            java.lang.Object r6 = r0.D
            com.hansecom.abt.presentation.screens.home.account.address.ChangeAddress$Action r6 = (com.hansecom.abt.presentation.screens.home.account.address.ChangeAddress.Action) r6
            java.lang.Object r0 = r0.C
            com.hansecom.abt.presentation.screens.home.account.address.ChangeAddressViewModel r0 = (com.hansecom.abt.presentation.screens.home.account.address.ChangeAddressViewModel) r0
            kotlin.ResultKt.b(r7)
            kotlin.Result r7 = (kotlin.Result) r7
            java.lang.Object r7 = r7.j()
            goto L_0x00a4
        L_0x0047:
            kotlin.ResultKt.b(r7)
            boolean r7 = r6 instanceof com.hansecom.abt.presentation.screens.home.account.address.ChangeAddress.Action.CityChange
            if (r7 == 0) goto L_0x0058
            com.hansecom.abt.presentation.screens.home.account.address.r r7 = new com.hansecom.abt.presentation.screens.home.account.address.r
            r7.<init>(r6)
            r5.r(r7)
            goto L_0x0126
        L_0x0058:
            boolean r7 = r6 instanceof com.hansecom.abt.presentation.screens.home.account.address.ChangeAddress.Action.PostalCodeChange
            if (r7 == 0) goto L_0x0066
            com.hansecom.abt.presentation.screens.home.account.address.w r7 = new com.hansecom.abt.presentation.screens.home.account.address.w
            r7.<init>(r6)
            r5.r(r7)
            goto L_0x0126
        L_0x0066:
            boolean r7 = r6 instanceof com.hansecom.abt.presentation.screens.home.account.address.ChangeAddress.Action.StateChange
            if (r7 == 0) goto L_0x0074
            com.hansecom.abt.presentation.screens.home.account.address.x r7 = new com.hansecom.abt.presentation.screens.home.account.address.x
            r7.<init>(r6)
            r5.r(r7)
            goto L_0x0126
        L_0x0074:
            boolean r7 = r6 instanceof com.hansecom.abt.presentation.screens.home.account.address.ChangeAddress.Action.StreetNameChange
            if (r7 == 0) goto L_0x0082
            com.hansecom.abt.presentation.screens.home.account.address.y r7 = new com.hansecom.abt.presentation.screens.home.account.address.y
            r7.<init>(r6)
            r5.r(r7)
            goto L_0x0126
        L_0x0082:
            boolean r7 = r6 instanceof com.hansecom.abt.presentation.screens.home.account.address.ChangeAddress.Action.StreetNameSecondLineChange
            if (r7 == 0) goto L_0x0090
            com.hansecom.abt.presentation.screens.home.account.address.z r7 = new com.hansecom.abt.presentation.screens.home.account.address.z
            r7.<init>(r6)
            r5.r(r7)
            goto L_0x0126
        L_0x0090:
            boolean r7 = r6 instanceof com.hansecom.abt.presentation.screens.home.account.address.ChangeAddress.Action.ChooseCountry.CountryChange
            if (r7 == 0) goto L_0x00e7
            com.hansecom.abt.data.repositories.generalData.CountriesRepository r7 = r5.f35141k
            r0.C = r5
            r0.D = r6
            r0.G = r4
            java.lang.Object r7 = r7.i(r0)
            if (r7 != r1) goto L_0x00a3
            return r1
        L_0x00a3:
            r0 = r5
        L_0x00a4:
            boolean r1 = kotlin.Result.g(r7)
            if (r1 == 0) goto L_0x00ab
            r7 = 0
        L_0x00ab:
            kotlin.jvm.internal.Intrinsics.f(r7)
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.Iterator r7 = r7.iterator()
        L_0x00b4:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L_0x00df
            java.lang.Object r1 = r7.next()
            com.hansecom.mapi.models.Country r1 = (com.hansecom.mapi.models.Country) r1
            java.lang.String r2 = r1.b()
            r3 = r6
            com.hansecom.abt.presentation.screens.home.account.address.ChangeAddress$Action$ChooseCountry$CountryChange r3 = (com.hansecom.abt.presentation.screens.home.account.address.ChangeAddress.Action.ChooseCountry.CountryChange) r3
            java.lang.String r3 = r3.a()
            boolean r2 = kotlin.jvm.internal.Intrinsics.d(r2, r3)
            if (r2 == 0) goto L_0x00b4
            com.hansecom.abt.presentation.screens.home.account.address.A r6 = new com.hansecom.abt.presentation.screens.home.account.address.A
            r6.<init>(r1)
            r0.r(r6)
            com.hansecom.abt.presentation.screens.home.account.address.ChangeAddress$Effect$ChangeCountry$ChangeCountrySuccess r6 = com.hansecom.abt.presentation.screens.home.account.address.ChangeAddress.Effect.ChangeCountry.ChangeCountrySuccess.f35120a
            r0.p(r6)
            goto L_0x0126
        L_0x00df:
            java.util.NoSuchElementException r6 = new java.util.NoSuchElementException
            java.lang.String r7 = "Collection contains no element matching the predicate."
            r6.<init>(r7)
            throw r6
        L_0x00e7:
            boolean r7 = r6 instanceof com.hansecom.abt.presentation.screens.home.account.address.ChangeAddress.Action.ChooseState.StateChange
            if (r7 == 0) goto L_0x00f9
            com.hansecom.abt.presentation.screens.home.account.address.B r7 = new com.hansecom.abt.presentation.screens.home.account.address.B
            r7.<init>(r6)
            r5.r(r7)
            com.hansecom.abt.presentation.screens.home.account.address.ChangeAddress$Effect$ChangeState$ChangeStateSuccess r6 = com.hansecom.abt.presentation.screens.home.account.address.ChangeAddress.Effect.ChangeState.ChangeStateSuccess.f35121a
            r5.p(r6)
            goto L_0x0126
        L_0x00f9:
            com.hansecom.abt.presentation.screens.home.account.address.ChangeAddress$Action$Confirm r7 = com.hansecom.abt.presentation.screens.home.account.address.ChangeAddress.Action.Confirm.f35115a
            boolean r7 = kotlin.jvm.internal.Intrinsics.d(r6, r7)
            if (r7 == 0) goto L_0x010d
            r0.G = r3
            java.lang.Object r6 = r5.Y(r0)
            if (r6 != r1) goto L_0x010a
            return r1
        L_0x010a:
            kotlin.Unit r6 = kotlin.Unit.f40552a
            return r6
        L_0x010d:
            boolean r7 = r6 instanceof com.hansecom.abt.presentation.screens.home.account.address.ChangeAddress.Action.ChooseCountry.FilterChange
            if (r7 == 0) goto L_0x011a
            com.hansecom.abt.presentation.screens.home.account.address.C r7 = new com.hansecom.abt.presentation.screens.home.account.address.C
            r7.<init>(r6)
            r5.r(r7)
            goto L_0x0126
        L_0x011a:
            boolean r7 = r6 instanceof com.hansecom.abt.presentation.screens.home.account.address.ChangeAddress.Action.ChooseState.FilterChange
            if (r7 == 0) goto L_0x0129
            com.hansecom.abt.presentation.screens.home.account.address.D r7 = new com.hansecom.abt.presentation.screens.home.account.address.D
            r7.<init>(r6)
            r5.r(r7)
        L_0x0126:
            kotlin.Unit r6 = kotlin.Unit.f40552a
            return r6
        L_0x0129:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.account.address.ChangeAddressViewModel.o(com.hansecom.abt.presentation.screens.home.account.address.ChangeAddress$Action, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: com.hansecom.mapi.models.Country} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: com.hansecom.mapi.models.Country} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: com.hansecom.mapi.models.Country} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: com.hansecom.mapi.models.Country} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00b8 A[EDGE_INSN: B:42:0x00b8->B:37:0x00b8 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object V(kotlin.coroutines.Continuation r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.hansecom.abt.presentation.screens.home.account.address.ChangeAddressViewModel$loadUserInfo$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.hansecom.abt.presentation.screens.home.account.address.ChangeAddressViewModel$loadUserInfo$1 r0 = (com.hansecom.abt.presentation.screens.home.account.address.ChangeAddressViewModel$loadUserInfo$1) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.G = r1
            goto L_0x0018
        L_0x0013:
            com.hansecom.abt.presentation.screens.home.account.address.ChangeAddressViewModel$loadUserInfo$1 r0 = new com.hansecom.abt.presentation.screens.home.account.address.ChangeAddressViewModel$loadUserInfo$1
            r0.<init>(r6, r7)
        L_0x0018:
            java.lang.Object r7 = r0.E
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.G
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0050
            if (r2 == r4) goto L_0x0042
            if (r2 != r3) goto L_0x003a
            java.lang.Object r1 = r0.D
            com.hansecom.mapi.models.User r1 = (com.hansecom.mapi.models.User) r1
            java.lang.Object r0 = r0.C
            com.hansecom.abt.presentation.screens.home.account.address.ChangeAddressViewModel r0 = (com.hansecom.abt.presentation.screens.home.account.address.ChangeAddressViewModel) r0
            kotlin.ResultKt.b(r7)
            kotlin.Result r7 = (kotlin.Result) r7
            java.lang.Object r7 = r7.j()
            goto L_0x0083
        L_0x003a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x0042:
            java.lang.Object r2 = r0.C
            com.hansecom.abt.presentation.screens.home.account.address.ChangeAddressViewModel r2 = (com.hansecom.abt.presentation.screens.home.account.address.ChangeAddressViewModel) r2
            kotlin.ResultKt.b(r7)
            kotlin.Result r7 = (kotlin.Result) r7
            java.lang.Object r7 = r7.j()
            goto L_0x0069
        L_0x0050:
            kotlin.ResultKt.b(r7)
            com.hansecom.abt.presentation.screens.home.account.address.u r7 = new com.hansecom.abt.presentation.screens.home.account.address.u
            r7.<init>()
            r6.r(r7)
            com.hansecom.abt.data.repositories.UserRepository r7 = r6.f35139i
            r0.C = r6
            r0.G = r4
            java.lang.Object r7 = r7.i(r0)
            if (r7 != r1) goto L_0x0068
            return r1
        L_0x0068:
            r2 = r6
        L_0x0069:
            java.lang.Throwable r4 = kotlin.Result.e(r7)
            if (r4 != 0) goto L_0x00c3
            com.hansecom.mapi.models.User r7 = (com.hansecom.mapi.models.User) r7
            com.hansecom.abt.data.repositories.generalData.CountriesRepository r4 = r2.f35141k
            r0.C = r2
            r0.D = r7
            r0.G = r3
            java.lang.Object r0 = r4.i(r0)
            if (r0 != r1) goto L_0x0080
            return r1
        L_0x0080:
            r1 = r7
            r7 = r0
            r0 = r2
        L_0x0083:
            boolean r2 = kotlin.Result.g(r7)
            r3 = 0
            if (r2 == 0) goto L_0x008b
            r7 = r3
        L_0x008b:
            kotlin.jvm.internal.Intrinsics.f(r7)
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.Iterator r7 = r7.iterator()
        L_0x0094:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L_0x00b8
            java.lang.Object r2 = r7.next()
            r4 = r2
            com.hansecom.mapi.models.Country r4 = (com.hansecom.mapi.models.Country) r4
            java.lang.String r4 = r4.b()
            com.hansecom.mapi.models.UserAddress r5 = r1.i()
            if (r5 == 0) goto L_0x00b0
            java.lang.String r5 = r5.b()
            goto L_0x00b1
        L_0x00b0:
            r5 = r3
        L_0x00b1:
            boolean r4 = kotlin.jvm.internal.Intrinsics.d(r4, r5)
            if (r4 == 0) goto L_0x0094
            r3 = r2
        L_0x00b8:
            com.hansecom.mapi.models.Country r3 = (com.hansecom.mapi.models.Country) r3
            com.hansecom.abt.presentation.screens.home.account.address.v r7 = new com.hansecom.abt.presentation.screens.home.account.address.v
            r7.<init>(r1, r3)
            r0.r(r7)
            goto L_0x00cf
        L_0x00c3:
            com.hansecom.abt.presentation.screens.home.account.address.ChangeAddress$Effect$Details$Error r7 = new com.hansecom.abt.presentation.screens.home.account.address.ChangeAddress$Effect$Details$Error
            com.hansecom.abt.util.resourcesResolvers.StringValue r0 = com.hansecom.abt.api.ApiExceptionsKt.a(r4)
            r7.<init>(r0)
            r2.p(r7)
        L_0x00cf:
            kotlin.Unit r7 = kotlin.Unit.f40552a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.account.address.ChangeAddressViewModel.V(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r1v18, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00e2 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00a4 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object Y(kotlin.coroutines.Continuation r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            boolean r2 = r1 instanceof com.hansecom.abt.presentation.screens.home.account.address.ChangeAddressViewModel$save$1
            if (r2 == 0) goto L_0x0017
            r2 = r1
            com.hansecom.abt.presentation.screens.home.account.address.ChangeAddressViewModel$save$1 r2 = (com.hansecom.abt.presentation.screens.home.account.address.ChangeAddressViewModel$save$1) r2
            int r3 = r2.G
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.G = r3
            goto L_0x001c
        L_0x0017:
            com.hansecom.abt.presentation.screens.home.account.address.ChangeAddressViewModel$save$1 r2 = new com.hansecom.abt.presentation.screens.home.account.address.ChangeAddressViewModel$save$1
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.E
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r4 = r2.G
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L_0x0055
            if (r4 == r6) goto L_0x0043
            if (r4 != r5) goto L_0x003b
            java.lang.Object r2 = r2.C
            com.hansecom.abt.presentation.screens.home.account.address.ChangeAddressViewModel r2 = (com.hansecom.abt.presentation.screens.home.account.address.ChangeAddressViewModel) r2
            kotlin.ResultKt.b(r1)
            kotlin.Result r1 = (kotlin.Result) r1
            java.lang.Object r1 = r1.j()
            goto L_0x00e4
        L_0x003b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0043:
            java.lang.Object r4 = r2.D
            com.hansecom.abt.presentation.screens.home.account.address.ChangeAddress$State r4 = (com.hansecom.abt.presentation.screens.home.account.address.ChangeAddress.State) r4
            java.lang.Object r6 = r2.C
            com.hansecom.abt.presentation.screens.home.account.address.ChangeAddressViewModel r6 = (com.hansecom.abt.presentation.screens.home.account.address.ChangeAddressViewModel) r6
            kotlin.ResultKt.b(r1)
            kotlin.Result r1 = (kotlin.Result) r1
            java.lang.Object r1 = r1.j()
            goto L_0x0077
        L_0x0055:
            kotlin.ResultKt.b(r1)
            com.hansecom.abt.presentation.screens.home.account.address.E r1 = new com.hansecom.abt.presentation.screens.home.account.address.E
            r1.<init>()
            r0.r(r1)
            android.os.Parcelable r1 = r18.m()
            r4 = r1
            com.hansecom.abt.presentation.screens.home.account.address.ChangeAddress$State r4 = (com.hansecom.abt.presentation.screens.home.account.address.ChangeAddress.State) r4
            com.hansecom.abt.data.repositories.generalData.CountriesRepository r1 = r0.f35141k
            r2.C = r0
            r2.D = r4
            r2.G = r6
            java.lang.Object r1 = r1.i(r2)
            if (r1 != r3) goto L_0x0076
            return r3
        L_0x0076:
            r6 = r0
        L_0x0077:
            boolean r7 = kotlin.Result.g(r1)
            r8 = 0
            if (r7 == 0) goto L_0x007f
            r1 = r8
        L_0x007f:
            kotlin.jvm.internal.Intrinsics.f(r1)
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L_0x0088:
            boolean r7 = r1.hasNext()
            if (r7 == 0) goto L_0x00a4
            java.lang.Object r7 = r1.next()
            r9 = r7
            com.hansecom.mapi.models.Country r9 = (com.hansecom.mapi.models.Country) r9
            java.lang.String r9 = r9.b()
            java.lang.String r10 = r4.g()
            boolean r9 = kotlin.jvm.internal.Intrinsics.d(r9, r10)
            if (r9 == 0) goto L_0x0088
            goto L_0x00a5
        L_0x00a4:
            r7 = r8
        L_0x00a5:
            com.hansecom.mapi.models.Country r7 = (com.hansecom.mapi.models.Country) r7
            java.lang.String r13 = r4.e()
            java.lang.String r16 = r4.g()
            java.lang.String r14 = r4.k()
            java.lang.String r11 = r4.l()
            java.lang.String r12 = r4.o()
            java.lang.String r17 = r4.h()
            if (r7 == 0) goto L_0x00c7
            java.lang.Boolean r1 = r7.c()
            r15 = r1
            goto L_0x00c8
        L_0x00c7:
            r15 = r8
        L_0x00c8:
            com.hansecom.mapi.models.UserAddress r1 = new com.hansecom.mapi.models.UserAddress
            r9 = 0
            java.lang.Long r10 = kotlin.coroutines.jvm.internal.Boxing.d(r9)
            r9 = r1
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17)
            com.hansecom.abt.data.useCases.account.ChangeAddressUseCase r4 = r6.f35140j
            r2.C = r6
            r2.D = r8
            r2.G = r5
            java.lang.Object r1 = r4.a(r1, r2)
            if (r1 != r3) goto L_0x00e3
            return r3
        L_0x00e3:
            r2 = r6
        L_0x00e4:
            java.lang.Throwable r3 = kotlin.Result.e(r1)
            if (r3 != 0) goto L_0x00fa
            kotlin.Unit r1 = (kotlin.Unit) r1
            com.hansecom.abt.presentation.screens.home.account.address.s r1 = new com.hansecom.abt.presentation.screens.home.account.address.s
            r1.<init>()
            r2.r(r1)
            com.hansecom.abt.presentation.screens.home.account.address.ChangeAddress$Effect$Details$Success r1 = com.hansecom.abt.presentation.screens.home.account.address.ChangeAddress.Effect.Details.Success.f35124a
            r2.p(r1)
            goto L_0x010e
        L_0x00fa:
            com.hansecom.abt.presentation.screens.home.account.address.t r1 = new com.hansecom.abt.presentation.screens.home.account.address.t
            r1.<init>()
            r2.r(r1)
            com.hansecom.abt.presentation.screens.home.account.address.ChangeAddress$Effect$Details$Error r1 = new com.hansecom.abt.presentation.screens.home.account.address.ChangeAddress$Effect$Details$Error
            com.hansecom.abt.util.resourcesResolvers.StringValue r3 = com.hansecom.abt.api.ApiExceptionsKt.a(r3)
            r1.<init>(r3)
            r2.p(r1)
        L_0x010e:
            kotlin.Unit r1 = kotlin.Unit.f40552a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.account.address.ChangeAddressViewModel.Y(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
