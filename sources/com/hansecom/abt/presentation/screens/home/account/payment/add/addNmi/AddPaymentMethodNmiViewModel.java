package com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi;

import androidx.lifecycle.SavedStateHandle;
import com.hansecom.abt.R;
import com.hansecom.abt.data.exceptions.FieldErrorsException;
import com.hansecom.abt.data.repositories.UserRepository;
import com.hansecom.abt.data.repositories.generalData.CountriesRepository;
import com.hansecom.abt.data.repositories.generalData.StatesRepository;
import com.hansecom.abt.data.useCases.paymentMethods.AddPaymentMethodNmiUseCase;
import com.hansecom.abt.presentation.mvi.MviViewModel;
import com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmi;
import com.hansecom.abt.util.inputValidators.InputValidators;
import com.hansecom.abt.util.resourcesResolvers.StringValue;
import com.hansecom.abt.util.resourcesResolvers.StringValueKt;
import com.hansecom.mapi.models.Country;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.flow.StateFlow;

@Metadata
public final class AddPaymentMethodNmiViewModel extends MviViewModel<AddPaymentMethodNmi.Action, AddPaymentMethodNmi.State, AddPaymentMethodNmi.Effect> {

    /* renamed from: i  reason: collision with root package name */
    public final SavedStateHandle f35630i;

    /* renamed from: j  reason: collision with root package name */
    public final AddPaymentMethodNmiUseCase f35631j;

    /* renamed from: k  reason: collision with root package name */
    public final UserRepository f35632k;

    /* renamed from: l  reason: collision with root package name */
    public final CountriesRepository f35633l;

    /* renamed from: m  reason: collision with root package name */
    public final StatesRepository f35634m;

    /* renamed from: n  reason: collision with root package name */
    public final InputValidators.NonEmptyValidator f35635n;

    /* renamed from: o  reason: collision with root package name */
    public final InputValidators.NonEmptyValidator f35636o;

    /* renamed from: p  reason: collision with root package name */
    public final InputValidators.NonEmptyValidator f35637p;

    /* renamed from: q  reason: collision with root package name */
    public final StateFlow f35638q;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AddPaymentMethodNmiViewModel(androidx.lifecycle.SavedStateHandle r41, com.hansecom.abt.util.inputValidators.InputValidators r42, com.hansecom.abt.data.useCases.paymentMethods.AddPaymentMethodNmiUseCase r43, com.hansecom.abt.data.repositories.UserRepository r44, com.hansecom.abt.data.repositories.generalData.CountriesRepository r45, com.hansecom.abt.data.repositories.generalData.StatesRepository r46, com.hansecom.abt.api.RealmPreferences r47) {
        /*
            r40 = this;
            r8 = r40
            r9 = r41
            r0 = r43
            r1 = r44
            r2 = r45
            r3 = r46
            java.lang.String r4 = "savedStateHandle"
            kotlin.jvm.internal.Intrinsics.i(r9, r4)
            java.lang.String r4 = "inputValidators"
            r10 = r42
            kotlin.jvm.internal.Intrinsics.i(r10, r4)
            java.lang.String r4 = "addPaymentMethodNmiUseCase"
            kotlin.jvm.internal.Intrinsics.i(r0, r4)
            java.lang.String r4 = "userRepository"
            kotlin.jvm.internal.Intrinsics.i(r1, r4)
            java.lang.String r4 = "countriesRepository"
            kotlin.jvm.internal.Intrinsics.i(r2, r4)
            java.lang.String r4 = "statesRepository"
            kotlin.jvm.internal.Intrinsics.i(r3, r4)
            java.lang.String r4 = "realmPreferences"
            r5 = r47
            kotlin.jvm.internal.Intrinsics.i(r5, r4)
            com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmi$State r4 = new com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmi$State
            r11 = r4
            int r29 = r47.i()
            r32 = 917503(0xdffff, float:1.285696E-39)
            r33 = 0
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
            r30 = 0
            r31 = 0
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            r8.<init>(r9, r4)
            r8.f35630i = r9
            r8.f35631j = r0
            r8.f35632k = r1
            r8.f35633l = r2
            r8.f35634m = r3
            kotlinx.coroutines.CoroutineScope r34 = androidx.lifecycle.ViewModelKt.a(r40)
            com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmiViewModel$1 r0 = new com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmiViewModel$1
            r11 = 0
            r0.<init>(r8, r11)
            r38 = 3
            r39 = 0
            r35 = 0
            r36 = 0
            r37 = r0
            kotlinx.coroutines.Job unused = kotlinx.coroutines.BuildersKt__Builders_commonKt.d(r34, r35, r36, r37, r38, r39)
            com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmiViewModel$2 r5 = new com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmiViewModel$2
            r5.<init>(r8, r11)
            r6 = 7
            r7 = 0
            r1 = 0
            r2 = 0
            r3 = 0
            r0 = r40
            com.hansecom.abt.presentation.mvi.MviViewModel.t(r0, r1, r2, r3, r5, r6, r7)
            com.hansecom.abt.util.inputValidators.InputValidators$NonEmptyValidator r0 = r42.v()
            r8.f35635n = r0
            com.hansecom.abt.util.inputValidators.InputValidators$NonEmptyValidator r0 = r42.v()
            r8.f35636o = r0
            com.hansecom.abt.util.inputValidators.InputValidators$NonEmptyValidator r0 = r42.v()
            r8.f35637p = r0
            java.lang.String r0 = "paymentObject"
            kotlinx.coroutines.flow.StateFlow r0 = r9.d(r0, r11)
            r8.f35638q = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmiViewModel.<init>(androidx.lifecycle.SavedStateHandle, com.hansecom.abt.util.inputValidators.InputValidators, com.hansecom.abt.data.useCases.paymentMethods.AddPaymentMethodNmiUseCase, com.hansecom.abt.data.repositories.UserRepository, com.hansecom.abt.data.repositories.generalData.CountriesRepository, com.hansecom.abt.data.repositories.generalData.StatesRepository, com.hansecom.abt.api.RealmPreferences):void");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object R(kotlin.coroutines.Continuation r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            boolean r2 = r1 instanceof com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmiViewModel$addPaymentMethod$1
            if (r2 == 0) goto L_0x0017
            r2 = r1
            com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmiViewModel$addPaymentMethod$1 r2 = (com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmiViewModel$addPaymentMethod$1) r2
            int r3 = r2.F
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.F = r3
            goto L_0x001c
        L_0x0017:
            com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmiViewModel$addPaymentMethod$1 r2 = new com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmiViewModel$addPaymentMethod$1
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.D
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r4 = r2.F
            r5 = 1
            if (r4 == 0) goto L_0x0040
            if (r4 != r5) goto L_0x0038
            java.lang.Object r2 = r2.C
            com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmiViewModel r2 = (com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmiViewModel) r2
            kotlin.ResultKt.b(r1)
            kotlin.Result r1 = (kotlin.Result) r1
            java.lang.Object r1 = r1.j()
            goto L_0x00e6
        L_0x0038:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0040:
            kotlin.ResultKt.b(r1)
            android.os.Parcelable r1 = r18.m()
            com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmi$State r1 = (com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmi.State) r1
            boolean r1 = r1.p()
            r0.m0(r1)
            android.os.Parcelable r1 = r18.m()
            com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmi$State r1 = (com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmi.State) r1
            boolean r1 = r1.j()
            if (r1 == 0) goto L_0x005f
            kotlin.Unit r1 = kotlin.Unit.f40552a
            return r1
        L_0x005f:
            com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.B r1 = new com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.B
            r1.<init>()
            r0.r(r1)
            com.hansecom.abt.data.useCases.paymentMethods.AddPaymentMethodNmiUseCase r1 = r0.f35631j
            android.os.Parcelable r4 = r18.m()
            com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmi$State r4 = (com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmi.State) r4
            java.lang.String r4 = r4.k()
            kotlinx.coroutines.flow.StateFlow r6 = r0.f35638q
            java.lang.Object r6 = r6.getValue()
            kotlin.jvm.internal.Intrinsics.f(r6)
            com.hansecom.abt.api.networkMerchants.CreditCardInfoNetworkMerchantResponse r6 = (com.hansecom.abt.api.networkMerchants.CreditCardInfoNetworkMerchantResponse) r6
            com.hansecom.mapi.models.UserAddress r15 = new com.hansecom.mapi.models.UserAddress
            r7 = 0
            java.lang.Long r8 = kotlin.coroutines.jvm.internal.Boxing.d(r7)
            android.os.Parcelable r7 = r18.m()
            com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmi$State r7 = (com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmi.State) r7
            java.lang.String r9 = r7.s()
            android.os.Parcelable r7 = r18.m()
            com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmi$State r7 = (com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmi.State) r7
            java.lang.String r10 = r7.u()
            android.os.Parcelable r7 = r18.m()
            com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmi$State r7 = (com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmi.State) r7
            java.lang.String r11 = r7.f()
            android.os.Parcelable r7 = r18.m()
            com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmi$State r7 = (com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmi.State) r7
            java.lang.String r12 = r7.q()
            android.os.Parcelable r7 = r18.m()
            com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmi$State r7 = (com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmi.State) r7
            boolean r7 = r7.p()
            java.lang.Boolean r13 = kotlin.coroutines.jvm.internal.Boxing.a(r7)
            android.os.Parcelable r7 = r18.m()
            com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmi$State r7 = (com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmi.State) r7
            java.lang.String r14 = r7.h()
            android.os.Parcelable r7 = r18.m()
            com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmi$State r7 = (com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmi.State) r7
            java.lang.String r16 = r7.n()
            r7 = r15
            r17 = r15
            r15 = r16
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15)
            r2.C = r0
            r2.F = r5
            r5 = r17
            java.lang.Object r1 = r1.a(r4, r6, r5, r2)
            if (r1 != r3) goto L_0x00e5
            return r3
        L_0x00e5:
            r2 = r0
        L_0x00e6:
            java.lang.Throwable r3 = kotlin.Result.e(r1)
            if (r3 != 0) goto L_0x00f4
            kotlin.Unit r1 = (kotlin.Unit) r1
            com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmi$Effect$Success r1 = com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmi.Effect.Success.f35612a
            r2.p(r1)
            goto L_0x010d
        L_0x00f4:
            boolean r1 = r3 instanceof com.hansecom.abt.data.exceptions.FieldErrorsException
            if (r1 == 0) goto L_0x0101
            com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.C r1 = new com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.C
            r1.<init>(r3)
            r2.r(r1)
            goto L_0x010d
        L_0x0101:
            com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmi$Effect$Error r1 = new com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmi$Effect$Error
            com.hansecom.abt.util.resourcesResolvers.StringValue r3 = com.hansecom.abt.api.ApiExceptionsKt.a(r3)
            r1.<init>(r3)
            r2.p(r1)
        L_0x010d:
            com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.D r1 = new com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.D
            r1.<init>()
            r2.r(r1)
            kotlin.Unit r1 = kotlin.Unit.f40552a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmiViewModel.R(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final AddPaymentMethodNmi.State S(AddPaymentMethodNmi.State state) {
        Intrinsics.i(state, "$this$update");
        return AddPaymentMethodNmi.State.b(state, (String) null, (String) null, false, true, (String) null, (StringValue) null, (String) null, (StringValue) null, (String) null, (StringValue) null, (String) null, (StringValue) null, (String) null, (StringValue) null, (String) null, (StringValue) null, false, 0, (AddPaymentMethodNmi.State.ChooseCountry) null, (AddPaymentMethodNmi.State.ChooseState) null, 1048567, (Object) null);
    }

    public static final AddPaymentMethodNmi.State T(Throwable th, AddPaymentMethodNmi.State state) {
        Intrinsics.i(state, "$this$update");
        FieldErrorsException fieldErrorsException = (FieldErrorsException) th;
        StringValue a2 = fieldErrorsException.a();
        if (a2 == null) {
            a2 = StringValue.Companion.a();
        }
        StringValue stringValue = a2;
        StringValue b2 = fieldErrorsException.b();
        if (b2 == null) {
            b2 = StringValue.Companion.a();
        }
        StringValue stringValue2 = b2;
        StringValue o2 = fieldErrorsException.o();
        if (o2 == null) {
            o2 = StringValue.Companion.a();
        }
        StringValue stringValue3 = o2;
        StringValue d2 = fieldErrorsException.d();
        if (d2 == null) {
            d2 = StringValue.Companion.a();
        }
        StringValue stringValue4 = d2;
        StringValue c2 = fieldErrorsException.c();
        if (c2 == null) {
            c2 = StringValue.Companion.a();
        }
        StringValue stringValue5 = c2;
        StringValue r2 = fieldErrorsException.r();
        if (r2 == null) {
            r2 = StringValue.Companion.a();
        }
        return AddPaymentMethodNmi.State.b(state, (String) null, (String) null, false, false, (String) null, stringValue, (String) null, stringValue2, (String) null, stringValue5, (String) null, r2, (String) null, stringValue4, (String) null, stringValue3, false, 0, (AddPaymentMethodNmi.State.ChooseCountry) null, (AddPaymentMethodNmi.State.ChooseState) null, 1004895, (Object) null);
    }

    public static final AddPaymentMethodNmi.State U(AddPaymentMethodNmi.State state) {
        Intrinsics.i(state, "$this$update");
        return AddPaymentMethodNmi.State.b(state, (String) null, (String) null, false, false, (String) null, (StringValue) null, (String) null, (StringValue) null, (String) null, (StringValue) null, (String) null, (StringValue) null, (String) null, (StringValue) null, (String) null, (StringValue) null, false, 0, (AddPaymentMethodNmi.State.ChooseCountry) null, (AddPaymentMethodNmi.State.ChooseState) null, 1048567, (Object) null);
    }

    public static final AddPaymentMethodNmi.State W(AddPaymentMethodNmi.Action action, AddPaymentMethodNmi.State state) {
        Intrinsics.i(state, "$this$update");
        return AddPaymentMethodNmi.State.b(state, (String) null, (String) null, false, false, (String) null, (StringValue) null, (String) null, (StringValue) null, ((AddPaymentMethodNmi.Action.CityChange) action).a(), StringValue.Companion.a(), (String) null, (StringValue) null, (String) null, (StringValue) null, (String) null, (StringValue) null, false, 0, (AddPaymentMethodNmi.State.ChooseCountry) null, (AddPaymentMethodNmi.State.ChooseState) null, 1047807, (Object) null);
    }

    public static final AddPaymentMethodNmi.State X(AddPaymentMethodNmi.Action action, AddPaymentMethodNmi.State state) {
        Intrinsics.i(state, "$this$update");
        return AddPaymentMethodNmi.State.b(state, (String) null, (String) null, false, false, (String) null, (StringValue) null, (String) null, (StringValue) null, (String) null, (StringValue) null, ((AddPaymentMethodNmi.Action.PostalCodeChange) action).a(), StringValue.Companion.a(), (String) null, (StringValue) null, (String) null, (StringValue) null, false, 0, (AddPaymentMethodNmi.State.ChooseCountry) null, (AddPaymentMethodNmi.State.ChooseState) null, 1045503, (Object) null);
    }

    public static final AddPaymentMethodNmi.State Y(AddPaymentMethodNmi.Action action, AddPaymentMethodNmi.State state) {
        Intrinsics.i(state, "$this$update");
        return AddPaymentMethodNmi.State.b(state, (String) null, (String) null, false, false, (String) null, (StringValue) null, (String) null, (StringValue) null, (String) null, (StringValue) null, (String) null, (StringValue) null, (String) null, (StringValue) null, (String) null, (StringValue) null, false, 0, AddPaymentMethodNmi.State.ChooseCountry.b(state.d(), (ImmutableList) null, ((AddPaymentMethodNmi.Action.ChooseCountry.FilterChange) action).a(), 1, (Object) null), (AddPaymentMethodNmi.State.ChooseState) null, 786431, (Object) null);
    }

    public static final AddPaymentMethodNmi.State Z(AddPaymentMethodNmi.Action action, AddPaymentMethodNmi.State state) {
        Intrinsics.i(state, "$this$update");
        return AddPaymentMethodNmi.State.b(state, (String) null, (String) null, false, false, (String) null, (StringValue) null, (String) null, (StringValue) null, (String) null, (StringValue) null, (String) null, (StringValue) null, (String) null, (StringValue) null, (String) null, (StringValue) null, false, 0, (AddPaymentMethodNmi.State.ChooseCountry) null, AddPaymentMethodNmi.State.ChooseState.b(state.e(), (ImmutableList) null, ((AddPaymentMethodNmi.Action.ChooseState.FilterChange) action).a(), 1, (Object) null), 524287, (Object) null);
    }

    public static final AddPaymentMethodNmi.State a0(AddPaymentMethodNmi.Action action, AddPaymentMethodNmi.State state) {
        Intrinsics.i(state, "$this$update");
        return AddPaymentMethodNmi.State.b(state, (String) null, ((AddPaymentMethodNmi.Action.OnCardAddedInWebView) action).a().a().b(), true, false, (String) null, (StringValue) null, (String) null, (StringValue) null, (String) null, (StringValue) null, (String) null, (StringValue) null, (String) null, (StringValue) null, (String) null, (StringValue) null, false, 0, (AddPaymentMethodNmi.State.ChooseCountry) null, (AddPaymentMethodNmi.State.ChooseState) null, 1048569, (Object) null);
    }

    public static final AddPaymentMethodNmi.State b0(AddPaymentMethodNmi.Action action, AddPaymentMethodNmi.State state) {
        Intrinsics.i(state, "$this$update");
        return AddPaymentMethodNmi.State.b(state, (String) null, (String) null, false, false, (String) null, (StringValue) null, (String) null, (StringValue) null, (String) null, (StringValue) null, (String) null, (StringValue) null, (String) null, (StringValue) null, ((AddPaymentMethodNmi.Action.StateChange) action).a(), StringValue.Companion.a(), false, 0, (AddPaymentMethodNmi.State.ChooseCountry) null, (AddPaymentMethodNmi.State.ChooseState) null, 999423, (Object) null);
    }

    public static final AddPaymentMethodNmi.State c0(AddPaymentMethodNmi.Action action, AddPaymentMethodNmi.State state) {
        Intrinsics.i(state, "$this$update");
        return AddPaymentMethodNmi.State.b(state, (String) null, (String) null, false, false, ((AddPaymentMethodNmi.Action.StreetNameChange) action).a(), StringValue.Companion.a(), (String) null, (StringValue) null, (String) null, (StringValue) null, (String) null, (StringValue) null, (String) null, (StringValue) null, (String) null, (StringValue) null, false, 0, (AddPaymentMethodNmi.State.ChooseCountry) null, (AddPaymentMethodNmi.State.ChooseState) null, 1048527, (Object) null);
    }

    public static final AddPaymentMethodNmi.State d0(AddPaymentMethodNmi.Action action, AddPaymentMethodNmi.State state) {
        Intrinsics.i(state, "$this$update");
        return AddPaymentMethodNmi.State.b(state, (String) null, (String) null, false, false, (String) null, (StringValue) null, ((AddPaymentMethodNmi.Action.StreetNameSecondLineChange) action).a(), StringValue.Companion.a(), (String) null, (StringValue) null, (String) null, (StringValue) null, (String) null, (StringValue) null, (String) null, (StringValue) null, false, 0, (AddPaymentMethodNmi.State.ChooseCountry) null, (AddPaymentMethodNmi.State.ChooseState) null, 1048383, (Object) null);
    }

    public static final AddPaymentMethodNmi.State e0(Country country, AddPaymentMethodNmi.State state) {
        Intrinsics.i(state, "$this$update");
        String b2 = country.b();
        Intrinsics.f(b2);
        StringValue.Companion companion = StringValue.Companion;
        StringValue a2 = companion.a();
        Boolean c2 = country.c();
        return AddPaymentMethodNmi.State.b(state, (String) null, (String) null, false, false, (String) null, (StringValue) null, (String) null, (StringValue) null, (String) null, (StringValue) null, (String) null, (StringValue) null, b2, a2, "", companion.a(), c2 != null ? c2.booleanValue() : false, 0, (AddPaymentMethodNmi.State.ChooseCountry) null, (AddPaymentMethodNmi.State.ChooseState) null, 921599, (Object) null);
    }

    public static final AddPaymentMethodNmi.State f0(AddPaymentMethodNmi.State state) {
        Intrinsics.i(state, "$this$update");
        return AddPaymentMethodNmi.State.b(state, (String) null, (String) null, false, false, (String) null, (StringValue) null, (String) null, (StringValue) null, (String) null, (StringValue) null, (String) null, (StringValue) null, (String) null, (StringValue) null, (String) null, (StringValue) null, false, 0, AddPaymentMethodNmi.State.ChooseCountry.b(state.d(), (ImmutableList) null, "", 1, (Object) null), (AddPaymentMethodNmi.State.ChooseState) null, 786431, (Object) null);
    }

    public static final AddPaymentMethodNmi.State g0(AddPaymentMethodNmi.Action action, AddPaymentMethodNmi.State state) {
        Intrinsics.i(state, "$this$update");
        return AddPaymentMethodNmi.State.b(state, (String) null, (String) null, false, false, (String) null, (StringValue) null, (String) null, (StringValue) null, (String) null, (StringValue) null, (String) null, (StringValue) null, (String) null, (StringValue) null, ((AddPaymentMethodNmi.Action.ChooseState.StateChange) action).a(), StringValue.Companion.a(), false, 0, (AddPaymentMethodNmi.State.ChooseCountry) null, (AddPaymentMethodNmi.State.ChooseState) null, 999423, (Object) null);
    }

    public static final AddPaymentMethodNmi.State h0(AddPaymentMethodNmi.State state) {
        Intrinsics.i(state, "$this$update");
        return AddPaymentMethodNmi.State.b(state, (String) null, (String) null, false, false, (String) null, (StringValue) null, (String) null, (StringValue) null, (String) null, (StringValue) null, (String) null, (StringValue) null, (String) null, (StringValue) null, (String) null, (StringValue) null, false, 0, (AddPaymentMethodNmi.State.ChooseCountry) null, AddPaymentMethodNmi.State.ChooseState.b(state.e(), (ImmutableList) null, "", 1, (Object) null), 524287, (Object) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: com.hansecom.mapi.models.Country} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: com.hansecom.mapi.models.Country} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: com.hansecom.mapi.models.Country} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: com.hansecom.mapi.models.Country} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00b0 A[EDGE_INSN: B:41:0x00b0->B:37:0x00b0 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object i0(kotlin.coroutines.Continuation r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmiViewModel$loadUserInfo$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmiViewModel$loadUserInfo$1 r0 = (com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmiViewModel$loadUserInfo$1) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.G = r1
            goto L_0x0018
        L_0x0013:
            com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmiViewModel$loadUserInfo$1 r0 = new com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmiViewModel$loadUserInfo$1
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
            com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmiViewModel r0 = (com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmiViewModel) r0
            kotlin.ResultKt.b(r7)
            kotlin.Result r7 = (kotlin.Result) r7
            java.lang.Object r7 = r7.j()
            goto L_0x007b
        L_0x003a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x0042:
            java.lang.Object r2 = r0.C
            com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmiViewModel r2 = (com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmiViewModel) r2
            kotlin.ResultKt.b(r7)
            kotlin.Result r7 = (kotlin.Result) r7
            java.lang.Object r7 = r7.j()
            goto L_0x0061
        L_0x0050:
            kotlin.ResultKt.b(r7)
            com.hansecom.abt.data.repositories.UserRepository r7 = r6.f35632k
            r0.C = r6
            r0.G = r4
            java.lang.Object r7 = r7.i(r0)
            if (r7 != r1) goto L_0x0060
            return r1
        L_0x0060:
            r2 = r6
        L_0x0061:
            java.lang.Throwable r4 = kotlin.Result.e(r7)
            if (r4 != 0) goto L_0x00bb
            com.hansecom.mapi.models.User r7 = (com.hansecom.mapi.models.User) r7
            com.hansecom.abt.data.repositories.generalData.CountriesRepository r4 = r2.f35633l
            r0.C = r2
            r0.D = r7
            r0.G = r3
            java.lang.Object r0 = r4.i(r0)
            if (r0 != r1) goto L_0x0078
            return r1
        L_0x0078:
            r1 = r7
            r7 = r0
            r0 = r2
        L_0x007b:
            boolean r2 = kotlin.Result.g(r7)
            r3 = 0
            if (r2 == 0) goto L_0x0083
            r7 = r3
        L_0x0083:
            kotlin.jvm.internal.Intrinsics.f(r7)
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.Iterator r7 = r7.iterator()
        L_0x008c:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L_0x00b0
            java.lang.Object r2 = r7.next()
            r4 = r2
            com.hansecom.mapi.models.Country r4 = (com.hansecom.mapi.models.Country) r4
            java.lang.String r4 = r4.b()
            com.hansecom.mapi.models.UserAddress r5 = r1.i()
            if (r5 == 0) goto L_0x00a8
            java.lang.String r5 = r5.b()
            goto L_0x00a9
        L_0x00a8:
            r5 = r3
        L_0x00a9:
            boolean r4 = kotlin.jvm.internal.Intrinsics.d(r4, r5)
            if (r4 == 0) goto L_0x008c
            r3 = r2
        L_0x00b0:
            com.hansecom.mapi.models.Country r3 = (com.hansecom.mapi.models.Country) r3
            com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.E r7 = new com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.E
            r7.<init>(r1, r3)
            r0.r(r7)
            goto L_0x00c7
        L_0x00bb:
            com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmi$Effect$InitialLoadingError r7 = new com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmi$Effect$InitialLoadingError
            com.hansecom.abt.util.resourcesResolvers.StringValue r0 = com.hansecom.abt.api.ApiExceptionsKt.a(r4)
            r7.<init>(r0)
            r2.p(r7)
        L_0x00c7:
            kotlin.Unit r7 = kotlin.Unit.f40552a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmiViewModel.i0(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000f, code lost:
        r0 = r0.c();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmi.State j0(com.hansecom.mapi.models.User r24, com.hansecom.mapi.models.Country r25, com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmi.State r26) {
        /*
            java.lang.String r0 = "$this$update"
            r1 = r26
            kotlin.jvm.internal.Intrinsics.i(r1, r0)
            com.hansecom.mapi.models.UserAddress r0 = r24.i()
            java.lang.String r2 = ""
            if (r0 == 0) goto L_0x0019
            java.lang.String r0 = r0.c()
            if (r0 != 0) goto L_0x0016
            goto L_0x0019
        L_0x0016:
            r16 = r0
            goto L_0x001b
        L_0x0019:
            r16 = r2
        L_0x001b:
            com.hansecom.mapi.models.UserAddress r0 = r24.i()
            if (r0 == 0) goto L_0x002a
            java.lang.String r0 = r0.e()
            if (r0 != 0) goto L_0x0028
            goto L_0x002a
        L_0x0028:
            r6 = r0
            goto L_0x002b
        L_0x002a:
            r6 = r2
        L_0x002b:
            com.hansecom.mapi.models.UserAddress r0 = r24.i()
            if (r0 == 0) goto L_0x003a
            java.lang.String r0 = r0.f()
            if (r0 != 0) goto L_0x0038
            goto L_0x003a
        L_0x0038:
            r8 = r0
            goto L_0x003b
        L_0x003a:
            r8 = r2
        L_0x003b:
            com.hansecom.mapi.models.UserAddress r0 = r24.i()
            if (r0 == 0) goto L_0x004a
            java.lang.String r0 = r0.a()
            if (r0 != 0) goto L_0x0048
            goto L_0x004a
        L_0x0048:
            r10 = r0
            goto L_0x004b
        L_0x004a:
            r10 = r2
        L_0x004b:
            com.hansecom.mapi.models.UserAddress r0 = r24.i()
            if (r0 == 0) goto L_0x005a
            java.lang.String r0 = r0.g()
            if (r0 != 0) goto L_0x0058
            goto L_0x005a
        L_0x0058:
            r12 = r0
            goto L_0x005b
        L_0x005a:
            r12 = r2
        L_0x005b:
            com.hansecom.mapi.models.UserAddress r0 = r24.i()
            if (r0 == 0) goto L_0x006a
            java.lang.String r0 = r0.b()
            if (r0 != 0) goto L_0x0068
            goto L_0x006a
        L_0x0068:
            r14 = r0
            goto L_0x006b
        L_0x006a:
            r14 = r2
        L_0x006b:
            if (r25 == 0) goto L_0x007a
            java.lang.Boolean r0 = r25.c()
            if (r0 == 0) goto L_0x007a
            boolean r0 = r0.booleanValue()
        L_0x0077:
            r18 = r0
            goto L_0x007c
        L_0x007a:
            r0 = 0
            goto L_0x0077
        L_0x007c:
            r22 = 961199(0xeaaaf, float:1.346927E-39)
            r23 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r7 = 0
            r9 = 0
            r11 = 0
            r13 = 0
            r15 = 0
            r17 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r1 = r26
            com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmi$State r0 = com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmi.State.b(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmiViewModel.j0(com.hansecom.mapi.models.User, com.hansecom.mapi.models.Country, com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmi$State):com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmi$State");
    }

    private final void k0(String str) {
        r(new F(str));
    }

    public static final AddPaymentMethodNmi.State l0(String str, AddPaymentMethodNmi.State state) {
        AddPaymentMethodNmi.State state2 = state;
        Intrinsics.i(state, "$this$update");
        return AddPaymentMethodNmi.State.b(state2, str, (String) null, false, false, (String) null, (StringValue) null, (String) null, (StringValue) null, (String) null, (StringValue) null, (String) null, (StringValue) null, (String) null, (StringValue) null, (String) null, (StringValue) null, false, 0, (AddPaymentMethodNmi.State.ChooseCountry) null, (AddPaymentMethodNmi.State.ChooseState) null, 1048574, (Object) null);
    }

    public static final AddPaymentMethodNmi.State n0(AddPaymentMethodNmiViewModel addPaymentMethodNmiViewModel, boolean z2, AddPaymentMethodNmi.State state) {
        AddPaymentMethodNmiViewModel addPaymentMethodNmiViewModel2 = addPaymentMethodNmiViewModel;
        Intrinsics.i(state, "$this$update");
        StringValue a2 = addPaymentMethodNmiViewModel2.f35635n.a(state.s()) ? StringValue.Companion.a() : StringValueKt.c(R.string.P3);
        StringValue a3 = state.h().length() > 0 ? StringValue.Companion.a() : StringValueKt.c(R.string.P3);
        return AddPaymentMethodNmi.State.b(state, (String) null, (String) null, false, false, (String) null, a2, (String) null, (StringValue) null, (String) null, addPaymentMethodNmiViewModel2.f35637p.a(state.f()) ? StringValue.Companion.a() : StringValueKt.c(R.string.P3), (String) null, addPaymentMethodNmiViewModel2.f35636o.a(state.n()) ? StringValue.Companion.a() : StringValueKt.c(R.string.P3), (String) null, a3, (String) null, (!z2 || state.q().length() != 0) ? StringValue.Companion.a() : StringValueKt.c(R.string.P3), false, 0, (AddPaymentMethodNmi.State.ChooseCountry) null, (AddPaymentMethodNmi.State.ChooseState) null, 1005023, (Object) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    /* renamed from: V */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object o(com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmi.Action r11, kotlin.coroutines.Continuation r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmiViewModel$handle$1
            if (r0 == 0) goto L_0x0013
            r0 = r12
            com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmiViewModel$handle$1 r0 = (com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmiViewModel$handle$1) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.G = r1
            goto L_0x0018
        L_0x0013:
            com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmiViewModel$handle$1 r0 = new com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmiViewModel$handle$1
            r0.<init>(r10, r12)
        L_0x0018:
            java.lang.Object r12 = r0.E
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.G
            r3 = 500(0x1f4, double:2.47E-321)
            r5 = 4
            r6 = 3
            r7 = 2
            r8 = 1
            if (r2 == 0) goto L_0x0061
            if (r2 == r8) goto L_0x005d
            if (r2 == r7) goto L_0x004a
            if (r2 == r6) goto L_0x0041
            if (r2 != r5) goto L_0x0039
            java.lang.Object r11 = r0.C
            com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmiViewModel r11 = (com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmiViewModel) r11
            kotlin.ResultKt.b(r12)
            goto L_0x016c
        L_0x0039:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x0041:
            java.lang.Object r11 = r0.C
            com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmiViewModel r11 = (com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmiViewModel) r11
            kotlin.ResultKt.b(r12)
            goto L_0x013e
        L_0x004a:
            java.lang.Object r11 = r0.D
            com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmi$Action r11 = (com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmi.Action) r11
            java.lang.Object r2 = r0.C
            com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmiViewModel r2 = (com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmiViewModel) r2
            kotlin.ResultKt.b(r12)
            kotlin.Result r12 = (kotlin.Result) r12
            java.lang.Object r12 = r12.j()
            goto L_0x00e1
        L_0x005d:
            kotlin.ResultKt.b(r12)
            goto L_0x0084
        L_0x0061:
            kotlin.ResultKt.b(r12)
            boolean r12 = r11 instanceof com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmi.Action.NicknameChange
            if (r12 == 0) goto L_0x0073
            com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmi$Action$NicknameChange r11 = (com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmi.Action.NicknameChange) r11
            java.lang.String r11 = r11.a()
            r10.k0(r11)
            goto L_0x01a9
        L_0x0073:
            com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmi$Action$Confirm r12 = com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmi.Action.Confirm.f35601a
            boolean r12 = kotlin.jvm.internal.Intrinsics.d(r11, r12)
            if (r12 == 0) goto L_0x0087
            r0.G = r8
            java.lang.Object r11 = r10.R(r0)
            if (r11 != r1) goto L_0x0084
            return r1
        L_0x0084:
            kotlin.Unit r11 = kotlin.Unit.f40552a
            return r11
        L_0x0087:
            boolean r12 = r11 instanceof com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmi.Action.CityChange
            if (r12 == 0) goto L_0x0095
            com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.y r12 = new com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.y
            r12.<init>(r11)
            r10.r(r12)
            goto L_0x01a9
        L_0x0095:
            boolean r12 = r11 instanceof com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmi.Action.PostalCodeChange
            if (r12 == 0) goto L_0x00a3
            com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.J r12 = new com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.J
            r12.<init>(r11)
            r10.r(r12)
            goto L_0x01a9
        L_0x00a3:
            boolean r12 = r11 instanceof com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmi.Action.StateChange
            if (r12 == 0) goto L_0x00b1
            com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.K r12 = new com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.K
            r12.<init>(r11)
            r10.r(r12)
            goto L_0x01a9
        L_0x00b1:
            boolean r12 = r11 instanceof com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmi.Action.StreetNameChange
            if (r12 == 0) goto L_0x00bf
            com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.L r12 = new com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.L
            r12.<init>(r11)
            r10.r(r12)
            goto L_0x01a9
        L_0x00bf:
            boolean r12 = r11 instanceof com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmi.Action.StreetNameSecondLineChange
            if (r12 == 0) goto L_0x00cd
            com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.M r12 = new com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.M
            r12.<init>(r11)
            r10.r(r12)
            goto L_0x01a9
        L_0x00cd:
            boolean r12 = r11 instanceof com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmi.Action.ChooseCountry.CountryChange
            if (r12 == 0) goto L_0x014f
            com.hansecom.abt.data.repositories.generalData.CountriesRepository r12 = r10.f35633l
            r0.C = r10
            r0.D = r11
            r0.G = r7
            java.lang.Object r12 = r12.i(r0)
            if (r12 != r1) goto L_0x00e0
            return r1
        L_0x00e0:
            r2 = r10
        L_0x00e1:
            boolean r5 = kotlin.Result.g(r12)
            r7 = 0
            if (r5 == 0) goto L_0x00e9
            r12 = r7
        L_0x00e9:
            kotlin.jvm.internal.Intrinsics.f(r12)
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            java.util.Iterator r12 = r12.iterator()
        L_0x00f2:
            boolean r5 = r12.hasNext()
            if (r5 == 0) goto L_0x0147
            java.lang.Object r5 = r12.next()
            com.hansecom.mapi.models.Country r5 = (com.hansecom.mapi.models.Country) r5
            java.lang.String r8 = r5.b()
            r9 = r11
            com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmi$Action$ChooseCountry$CountryChange r9 = (com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmi.Action.ChooseCountry.CountryChange) r9
            java.lang.String r9 = r9.a()
            boolean r8 = kotlin.jvm.internal.Intrinsics.d(r8, r9)
            if (r8 == 0) goto L_0x00f2
            java.lang.String r11 = r5.b()
            android.os.Parcelable r12 = r2.m()
            com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmi$State r12 = (com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmi.State) r12
            java.lang.String r12 = r12.h()
            boolean r11 = kotlin.jvm.internal.Intrinsics.d(r11, r12)
            if (r11 != 0) goto L_0x012b
            com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.N r11 = new com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.N
            r11.<init>(r5)
            r2.r(r11)
        L_0x012b:
            com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmi$Effect$ChangeCountry$ChangeCountrySuccess r11 = com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmi.Effect.ChangeCountry.ChangeCountrySuccess.f35608a
            r2.p(r11)
            r0.C = r2
            r0.D = r7
            r0.G = r6
            java.lang.Object r11 = kotlinx.coroutines.DelayKt.b(r3, r0)
            if (r11 != r1) goto L_0x013d
            return r1
        L_0x013d:
            r11 = r2
        L_0x013e:
            com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.O r12 = new com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.O
            r12.<init>()
            r11.r(r12)
            goto L_0x01a9
        L_0x0147:
            java.util.NoSuchElementException r11 = new java.util.NoSuchElementException
            java.lang.String r12 = "Collection contains no element matching the predicate."
            r11.<init>(r12)
            throw r11
        L_0x014f:
            boolean r12 = r11 instanceof com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmi.Action.ChooseState.StateChange
            if (r12 == 0) goto L_0x0175
            com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.P r12 = new com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.P
            r12.<init>(r11)
            r10.r(r12)
            com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmi$Effect$ChangeState$ChangeStateSuccess r11 = com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmi.Effect.ChangeState.ChangeStateSuccess.f35609a
            r10.p(r11)
            r0.C = r10
            r0.G = r5
            java.lang.Object r11 = kotlinx.coroutines.DelayKt.b(r3, r0)
            if (r11 != r1) goto L_0x016b
            return r1
        L_0x016b:
            r11 = r10
        L_0x016c:
            com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.z r12 = new com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.z
            r12.<init>()
            r11.r(r12)
            goto L_0x01a9
        L_0x0175:
            boolean r12 = r11 instanceof com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmi.Action.ChooseCountry.FilterChange
            if (r12 == 0) goto L_0x0182
            com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.A r12 = new com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.A
            r12.<init>(r11)
            r10.r(r12)
            goto L_0x01a9
        L_0x0182:
            boolean r12 = r11 instanceof com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmi.Action.ChooseState.FilterChange
            if (r12 == 0) goto L_0x018f
            com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.H r12 = new com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.H
            r12.<init>(r11)
            r10.r(r12)
            goto L_0x01a9
        L_0x018f:
            boolean r12 = r11 instanceof com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmi.Action.OnCardAddedInWebView
            if (r12 == 0) goto L_0x01ac
            androidx.lifecycle.SavedStateHandle r12 = r10.f35630i
            r0 = r11
            com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmi$Action$OnCardAddedInWebView r0 = (com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmi.Action.OnCardAddedInWebView) r0
            com.hansecom.abt.api.networkMerchants.CreditCardInfoNetworkMerchantResponse r0 = r0.a()
            java.lang.String r1 = "paymentObject"
            r12.f(r1, r0)
            com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.I r12 = new com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.I
            r12.<init>(r11)
            r10.r(r12)
        L_0x01a9:
            kotlin.Unit r11 = kotlin.Unit.f40552a
            return r11
        L_0x01ac:
            kotlin.NoWhenBranchMatchedException r11 = new kotlin.NoWhenBranchMatchedException
            r11.<init>()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmiViewModel.o(com.hansecom.abt.presentation.screens.home.account.payment.add.addNmi.AddPaymentMethodNmi$Action, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void m0(boolean z2) {
        r(new G(this, z2));
    }
}
