package com.hansecom.abt.presentation.screens.home.faremedia.cardInformation;

import com.hansecom.abt.data.exceptions.FieldErrorsException;
import com.hansecom.abt.data.useCases.fareMedia.GetFareMediaUseCase;
import com.hansecom.abt.data.useCases.fareMedia.UpdateNicknameUseCase;
import com.hansecom.abt.data.useCases.institution.GetInstitutionsUseCase;
import com.hansecom.abt.presentation.mvi.MviViewModel;
import com.hansecom.abt.presentation.screens.home.faremedia.cardInformation.CardInformation;
import com.hansecom.abt.util.resourcesResolvers.StringValue;
import com.hansecom.abt.util.resourcesResolvers.StringValueKt;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

@Metadata
public final class CardInformationViewModel extends MviViewModel<CardInformation.Action, CardInformation.State, CardInformation.Effect> {

    /* renamed from: i  reason: collision with root package name */
    public final GetFareMediaUseCase f36434i;

    /* renamed from: j  reason: collision with root package name */
    public final GetInstitutionsUseCase f36435j;

    /* renamed from: k  reason: collision with root package name */
    public final UpdateNicknameUseCase f36436k;

    /* renamed from: l  reason: collision with root package name */
    public final String f36437l;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public CardInformationViewModel(androidx.lifecycle.SavedStateHandle r23, com.hansecom.abt.data.useCases.fareMedia.GetFareMediaUseCase r24, com.hansecom.abt.data.useCases.institution.GetInstitutionsUseCase r25, com.hansecom.abt.data.useCases.fareMedia.UpdateNicknameUseCase r26) {
        /*
            r22 = this;
            r8 = r22
            r0 = r23
            r1 = r24
            r2 = r25
            r3 = r26
            java.lang.String r4 = "savedStateHandle"
            kotlin.jvm.internal.Intrinsics.i(r0, r4)
            java.lang.String r4 = "getFareMediaUseCase"
            kotlin.jvm.internal.Intrinsics.i(r1, r4)
            java.lang.String r4 = "getInstitutionsUseCase"
            kotlin.jvm.internal.Intrinsics.i(r2, r4)
            java.lang.String r4 = "updateNicknameUseCase"
            kotlin.jvm.internal.Intrinsics.i(r3, r4)
            com.hansecom.abt.presentation.screens.home.faremedia.cardInformation.CardInformation$State r4 = new com.hansecom.abt.presentation.screens.home.faremedia.cardInformation.CardInformation$State
            r20 = 1022(0x3fe, float:1.432E-42)
            r21 = 0
            r10 = 1
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r9 = r4
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r8.<init>(r0, r4)
            r8.f36434i = r1
            r8.f36435j = r2
            r8.f36436k = r3
            java.util.Map r1 = kotlin.collections.MapsKt.h()
            java.lang.Class<com.hansecom.abt.presentation.screens.home.faremedia.cardOptions.CardOptionsCardInformationDestination> r2 = com.hansecom.abt.presentation.screens.home.faremedia.cardOptions.CardOptionsCardInformationDestination.class
            kotlin.reflect.KClass r2 = kotlin.jvm.internal.Reflection.b(r2)
            java.lang.Object r0 = androidx.navigation.SavedStateHandleKt.a(r0, r2, r1)
            com.hansecom.abt.presentation.screens.home.faremedia.cardOptions.CardOptionsCardInformationDestination r0 = (com.hansecom.abt.presentation.screens.home.faremedia.cardOptions.CardOptionsCardInformationDestination) r0
            java.lang.String r0 = r0.a()
            r8.f36437l = r0
            com.hansecom.abt.presentation.screens.home.faremedia.cardInformation.CardInformationViewModel$1 r5 = new com.hansecom.abt.presentation.screens.home.faremedia.cardInformation.CardInformationViewModel$1
            r0 = 0
            r5.<init>(r8, r0)
            r6 = 7
            r7 = 0
            r1 = 0
            r2 = 0
            r3 = 0
            r0 = r22
            com.hansecom.abt.presentation.mvi.MviViewModel.t(r0, r1, r2, r3, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.faremedia.cardInformation.CardInformationViewModel.<init>(androidx.lifecycle.SavedStateHandle, com.hansecom.abt.data.useCases.fareMedia.GetFareMediaUseCase, com.hansecom.abt.data.useCases.institution.GetInstitutionsUseCase, com.hansecom.abt.data.useCases.fareMedia.UpdateNicknameUseCase):void");
    }

    public static final CardInformation.State G(CardInformation.Action action, CardInformation.State state) {
        Intrinsics.i(state, "$this$update");
        return CardInformation.State.b(state, false, (String) null, (String) null, (String) null, (String) null, (BigDecimal) null, (ImmutableList) null, ((CardInformation.Action.NicknameChange) action).a(), StringValue.Companion.a(), false, 639, (Object) null);
    }

    public static final CardInformation.State I(CardInformation.State state) {
        Intrinsics.i(state, "$this$update");
        return CardInformation.State.b(state, false, (String) null, (String) null, (String) null, (String) null, (BigDecimal) null, (ImmutableList) null, (String) null, (StringValue) null, true, 511, (Object) null);
    }

    public static final CardInformation.State J(CardInformation.State state) {
        Intrinsics.i(state, "$this$update");
        return CardInformation.State.b(state, false, (String) null, (String) null, (String) null, (String) null, (BigDecimal) null, (ImmutableList) null, (String) null, (StringValue) null, false, 511, (Object) null);
    }

    public static final CardInformation.State K(Throwable th, CardInformation.State state) {
        Intrinsics.i(state, "$this$update");
        return CardInformation.State.b(state, false, (String) null, (String) null, (String) null, (String) null, (BigDecimal) null, (ImmutableList) null, (String) null, StringValueKt.b(((FieldErrorsException) th).j()), false, 255, (Object) null);
    }

    public static final CardInformation.State L(CardInformation.State state) {
        Intrinsics.i(state, "$this$update");
        return CardInformation.State.b(state, false, (String) null, (String) null, (String) null, (String) null, (BigDecimal) null, (ImmutableList) null, (String) null, (StringValue) null, false, 511, (Object) null);
    }

    /* renamed from: F */
    public Object o(CardInformation.Action action, Continuation continuation) {
        if (action instanceof CardInformation.Action.NicknameChange) {
            r(new j(action));
            return Unit.f40552a;
        } else if (Intrinsics.d(action, CardInformation.Action.NicknameSave.f36424a)) {
            Object H = H(continuation);
            return H == IntrinsicsKt.f() ? H : Unit.f40552a;
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object H(kotlin.coroutines.Continuation r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.hansecom.abt.presentation.screens.home.faremedia.cardInformation.CardInformationViewModel$saveChanges$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.hansecom.abt.presentation.screens.home.faremedia.cardInformation.CardInformationViewModel$saveChanges$1 r0 = (com.hansecom.abt.presentation.screens.home.faremedia.cardInformation.CardInformationViewModel$saveChanges$1) r0
            int r1 = r0.F
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.F = r1
            goto L_0x0018
        L_0x0013:
            com.hansecom.abt.presentation.screens.home.faremedia.cardInformation.CardInformationViewModel$saveChanges$1 r0 = new com.hansecom.abt.presentation.screens.home.faremedia.cardInformation.CardInformationViewModel$saveChanges$1
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.D
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.F
            r3 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            java.lang.Object r0 = r0.C
            com.hansecom.abt.presentation.screens.home.faremedia.cardInformation.CardInformationViewModel r0 = (com.hansecom.abt.presentation.screens.home.faremedia.cardInformation.CardInformationViewModel) r0
            kotlin.ResultKt.b(r6)
            kotlin.Result r6 = (kotlin.Result) r6
            java.lang.Object r6 = r6.j()
            goto L_0x0060
        L_0x0033:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x003b:
            kotlin.ResultKt.b(r6)
            com.hansecom.abt.presentation.screens.home.faremedia.cardInformation.k r6 = new com.hansecom.abt.presentation.screens.home.faremedia.cardInformation.k
            r6.<init>()
            r5.r(r6)
            com.hansecom.abt.data.useCases.fareMedia.UpdateNicknameUseCase r6 = r5.f36436k
            java.lang.String r2 = r5.f36437l
            android.os.Parcelable r4 = r5.m()
            com.hansecom.abt.presentation.screens.home.faremedia.cardInformation.CardInformation$State r4 = (com.hansecom.abt.presentation.screens.home.faremedia.cardInformation.CardInformation.State) r4
            java.lang.String r4 = r4.g()
            r0.C = r5
            r0.F = r3
            java.lang.Object r6 = r6.a(r2, r4, r0)
            if (r6 != r1) goto L_0x005f
            return r1
        L_0x005f:
            r0 = r5
        L_0x0060:
            java.lang.Throwable r1 = kotlin.Result.e(r6)
            if (r1 != 0) goto L_0x0083
            com.hansecom.mapi.models.FareMedium r6 = (com.hansecom.mapi.models.FareMedium) r6
            com.hansecom.abt.presentation.screens.home.faremedia.cardInformation.l r6 = new com.hansecom.abt.presentation.screens.home.faremedia.cardInformation.l
            r6.<init>()
            r0.r(r6)
            com.hansecom.abt.presentation.screens.home.faremedia.cardInformation.CardInformation$Effect$Success r6 = new com.hansecom.abt.presentation.screens.home.faremedia.cardInformation.CardInformation$Effect$Success
            android.os.Parcelable r1 = r0.m()
            com.hansecom.abt.presentation.screens.home.faremedia.cardInformation.CardInformation$State r1 = (com.hansecom.abt.presentation.screens.home.faremedia.cardInformation.CardInformation.State) r1
            java.lang.String r1 = r1.g()
            r6.<init>(r1)
            r0.p(r6)
            goto L_0x00ad
        L_0x0083:
            boolean r6 = r1 instanceof com.hansecom.abt.data.exceptions.FieldErrorsException
            if (r6 == 0) goto L_0x0099
            r6 = r1
            com.hansecom.abt.data.exceptions.FieldErrorsException r6 = (com.hansecom.abt.data.exceptions.FieldErrorsException) r6
            com.hansecom.abt.util.resourcesResolvers.StringValue r6 = r6.j()
            if (r6 == 0) goto L_0x0099
            com.hansecom.abt.presentation.screens.home.faremedia.cardInformation.m r6 = new com.hansecom.abt.presentation.screens.home.faremedia.cardInformation.m
            r6.<init>(r1)
            r0.r(r6)
            goto L_0x00ad
        L_0x0099:
            com.hansecom.abt.presentation.screens.home.faremedia.cardInformation.n r6 = new com.hansecom.abt.presentation.screens.home.faremedia.cardInformation.n
            r6.<init>()
            r0.r(r6)
            com.hansecom.abt.presentation.screens.home.faremedia.cardInformation.CardInformation$Effect$Error r6 = new com.hansecom.abt.presentation.screens.home.faremedia.cardInformation.CardInformation$Effect$Error
            com.hansecom.abt.util.resourcesResolvers.StringValue r1 = com.hansecom.abt.api.ApiExceptionsKt.a(r1)
            r6.<init>(r1)
            r0.p(r6)
        L_0x00ad:
            kotlin.Unit r6 = kotlin.Unit.f40552a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.faremedia.cardInformation.CardInformationViewModel.H(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
