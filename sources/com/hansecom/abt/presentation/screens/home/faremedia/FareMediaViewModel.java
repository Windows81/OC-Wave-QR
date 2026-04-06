package com.hansecom.abt.presentation.screens.home.faremedia;

import com.hansecom.abt.R;
import com.hansecom.abt.data.config.links.LinksConfigItem;
import com.hansecom.abt.data.repositories.FareMediaRepository;
import com.hansecom.abt.data.useCases.GetMostRelevantFareCappingFlowUseCase;
import com.hansecom.abt.data.useCases.configurations.GetFareCategoryColorsUseCase;
import com.hansecom.abt.data.useCases.configurations.GetMoreInfoFareMediaLinkUseCase;
import com.hansecom.abt.data.useCases.configurations.GetRemoteFeatureConfigUseCase;
import com.hansecom.abt.data.useCases.fareMedia.FareMediaTransferValidUntilFlowUseCase;
import com.hansecom.abt.data.useCases.fareMedia.GetGoogleWalletProvisioningLinkUseCase;
import com.hansecom.abt.data.useCases.fareMedia.RefreshFareMediaDataUseCase;
import com.hansecom.abt.data.useCases.fareMedia.TransferFareMediaCardUseCase;
import com.hansecom.abt.presentation.model.TransferTimeState;
import com.hansecom.abt.presentation.mvi.MviViewModel;
import com.hansecom.abt.presentation.screens.home.faremedia.FareMedia;
import com.hansecom.abt.ui.components.fareCapping.FareCappingCardState;
import com.hansecom.abt.util.resourcesResolvers.StringValue;
import com.hansecom.abt.util.resourcesResolvers.StringValueKt;
import com.hansecom.mapi.models.FareMedium;
import com.hansecom.mapi.models.FareMediumWalletInformation;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ExtensionsKt;
import kotlinx.collections.immutable.PersistentList;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;

@Metadata
public final class FareMediaViewModel extends MviViewModel<FareMedia.Action, FareMedia.State, FareMedia.Effect> {

    /* renamed from: s  reason: collision with root package name */
    public static final Companion f35971s = new Companion((DefaultConstructorMarker) null);

    /* renamed from: t  reason: collision with root package name */
    public static final int f35972t = 8;

    /* renamed from: i  reason: collision with root package name */
    public final FareMediaRepository f35973i;

    /* renamed from: j  reason: collision with root package name */
    public final RefreshFareMediaDataUseCase f35974j;

    /* renamed from: k  reason: collision with root package name */
    public final FareMediaTransferValidUntilFlowUseCase f35975k;

    /* renamed from: l  reason: collision with root package name */
    public final TransferFareMediaCardUseCase f35976l;

    /* renamed from: m  reason: collision with root package name */
    public final GetRemoteFeatureConfigUseCase f35977m;

    /* renamed from: n  reason: collision with root package name */
    public final GetMostRelevantFareCappingFlowUseCase f35978n;

    /* renamed from: o  reason: collision with root package name */
    public final GetMoreInfoFareMediaLinkUseCase f35979o;

    /* renamed from: p  reason: collision with root package name */
    public final GetFareCategoryColorsUseCase f35980p;

    /* renamed from: q  reason: collision with root package name */
    public final GetGoogleWalletProvisioningLinkUseCase f35981q;

    /* renamed from: r  reason: collision with root package name */
    public Job f35982r;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public FareMediaViewModel(androidx.lifecycle.SavedStateHandle r33, com.hansecom.abt.data.repositories.FareMediaRepository r34, com.hansecom.abt.data.useCases.fareMedia.RefreshFareMediaDataUseCase r35, com.hansecom.abt.data.useCases.fareMedia.FareMediaTransferValidUntilFlowUseCase r36, com.hansecom.abt.data.useCases.fareMedia.TransferFareMediaCardUseCase r37, com.hansecom.abt.data.useCases.configurations.GetRemoteFeatureConfigUseCase r38, com.hansecom.abt.data.useCases.GetMostRelevantFareCappingFlowUseCase r39, com.hansecom.abt.data.useCases.configurations.GetMoreInfoFareMediaLinkUseCase r40, com.hansecom.abt.data.useCases.configurations.GetFareCategoryColorsUseCase r41, com.hansecom.abt.data.useCases.fareMedia.GetGoogleWalletProvisioningLinkUseCase r42, com.hansecom.abt.AppFeatures r43, com.hansecom.abt.presentation.wallet.GoogleWalletHelper r44) {
        /*
            r32 = this;
            r0 = r32
            r1 = r33
            r2 = r34
            r3 = r35
            r4 = r36
            r5 = r37
            r6 = r38
            r7 = r39
            r8 = r40
            r9 = r41
            r10 = r42
            r11 = r43
            r12 = r44
            java.lang.String r13 = "savedStateHandle"
            kotlin.jvm.internal.Intrinsics.i(r1, r13)
            java.lang.String r13 = "fareMediaRepository"
            kotlin.jvm.internal.Intrinsics.i(r2, r13)
            java.lang.String r13 = "refreshFareMediaDataUseCase"
            kotlin.jvm.internal.Intrinsics.i(r3, r13)
            java.lang.String r13 = "fareMediaTransferValidUntilFlowUseCase"
            kotlin.jvm.internal.Intrinsics.i(r4, r13)
            java.lang.String r13 = "transferFareMediaCardUseCase"
            kotlin.jvm.internal.Intrinsics.i(r5, r13)
            java.lang.String r13 = "getRemoteFeatureConfigUseCase"
            kotlin.jvm.internal.Intrinsics.i(r6, r13)
            java.lang.String r13 = "getMostRelevantFareCappingFlowUseCase"
            kotlin.jvm.internal.Intrinsics.i(r7, r13)
            java.lang.String r13 = "getMoreInfoFareMediaLinkUseCase"
            kotlin.jvm.internal.Intrinsics.i(r8, r13)
            java.lang.String r13 = "getFareCategoryColorsUseCase"
            kotlin.jvm.internal.Intrinsics.i(r9, r13)
            java.lang.String r13 = "getGoogleWalletProvisioningLinkUseCase"
            kotlin.jvm.internal.Intrinsics.i(r10, r13)
            java.lang.String r13 = "appFeatures"
            kotlin.jvm.internal.Intrinsics.i(r11, r13)
            java.lang.String r13 = "googleWalletHelper"
            kotlin.jvm.internal.Intrinsics.i(r12, r13)
            com.hansecom.abt.presentation.screens.home.faremedia.FareMedia$State r13 = new com.hansecom.abt.presentation.screens.home.faremedia.FareMedia$State
            r14 = r13
            boolean r27 = r43.v()
            r30 = 14207(0x377f, float:1.9908E-41)
            r31 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 1
            r23 = 0
            r24 = 0
            r25 = 0
            r28 = 0
            r29 = 0
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r27, r28, r29, r30, r31)
            r0.<init>(r1, r13)
            r0.f35973i = r2
            r0.f35974j = r3
            r0.f35975k = r4
            r0.f35976l = r5
            r0.f35977m = r6
            r0.f35978n = r7
            r0.f35979o = r8
            r0.f35980p = r9
            r0.f35981q = r10
            com.hansecom.abt.presentation.screens.home.faremedia.FareMediaViewModel$1 r1 = new com.hansecom.abt.presentation.screens.home.faremedia.FareMediaViewModel$1
            r2 = 0
            r1.<init>(r11, r12, r0, r2)
            r2 = 7
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r33 = r32
            r34 = r4
            r35 = r5
            r36 = r6
            r38 = r1
            r39 = r2
            r40 = r3
            com.hansecom.abt.presentation.mvi.MviViewModel.t(r33, r34, r35, r36, r38, r39, r40)
            com.hansecom.abt.presentation.screens.home.faremedia.s0 r1 = new com.hansecom.abt.presentation.screens.home.faremedia.s0
            r1.<init>(r0)
            r0.r(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.faremedia.FareMediaViewModel.<init>(androidx.lifecycle.SavedStateHandle, com.hansecom.abt.data.repositories.FareMediaRepository, com.hansecom.abt.data.useCases.fareMedia.RefreshFareMediaDataUseCase, com.hansecom.abt.data.useCases.fareMedia.FareMediaTransferValidUntilFlowUseCase, com.hansecom.abt.data.useCases.fareMedia.TransferFareMediaCardUseCase, com.hansecom.abt.data.useCases.configurations.GetRemoteFeatureConfigUseCase, com.hansecom.abt.data.useCases.GetMostRelevantFareCappingFlowUseCase, com.hansecom.abt.data.useCases.configurations.GetMoreInfoFareMediaLinkUseCase, com.hansecom.abt.data.useCases.configurations.GetFareCategoryColorsUseCase, com.hansecom.abt.data.useCases.fareMedia.GetGoogleWalletProvisioningLinkUseCase, com.hansecom.abt.AppFeatures, com.hansecom.abt.presentation.wallet.GoogleWalletHelper):void");
    }

    public static final FareMedia.State K(FareMediaViewModel fareMediaViewModel, FareMedia.State state) {
        Intrinsics.i(state, "$this$update");
        LinksConfigItem a2 = fareMediaViewModel.f35979o.a();
        return FareMedia.State.b(state, (PersistentList) null, (StringValue) null, (FareCappingCardState) null, 0, (String) null, false, false, false, (FareMedia.State.DialogType) null, false, 0, false, a2 != null ? a2.d() : null, false, 12287, (Object) null);
    }

    public static final FareMedia.State Y(FareMedia.State state) {
        Intrinsics.i(state, "$this$update");
        return FareMedia.State.b(state, (PersistentList) null, (StringValue) null, (FareCappingCardState) null, 0, (String) null, false, false, false, FareMedia.State.DialogType.ADD_TO_WALLET_LOADING, false, 0, false, (String) null, false, 16127, (Object) null);
    }

    public static final FareMedia.State Z(FareMedia.State state) {
        Intrinsics.i(state, "$this$update");
        return FareMedia.State.b(state, (PersistentList) null, (StringValue) null, (FareCappingCardState) null, 0, (String) null, false, false, false, FareMedia.State.DialogType.NONE, false, 0, false, (String) null, false, 16127, (Object) null);
    }

    public static final FareMedia.State a0(FareMedia.State state) {
        Intrinsics.i(state, "$this$update");
        return FareMedia.State.b(state, (PersistentList) null, (StringValue) null, (FareCappingCardState) null, 0, (String) null, false, false, false, FareMedia.State.DialogType.NONE, false, 0, false, (String) null, false, 16127, (Object) null);
    }

    public static final FareMedia.State d0(FareMediaViewModel fareMediaViewModel, FareMedia.State state) {
        Intrinsics.i(state, "$this$update");
        return FareMedia.State.b(state, (PersistentList) null, (StringValue) null, (FareCappingCardState) null, 0, (String) null, false, false, false, (!((FareMedia.State) fareMediaViewModel.m()).r() || ((FareMedia.State) fareMediaViewModel.m()).o()) ? FareMedia.State.DialogType.CREATE_OR_LINK : FareMedia.State.DialogType.TRANSFER_OR_LINK, false, 0, false, (String) null, false, 16127, (Object) null);
    }

    public static final FareMedia.State e0(FareMedia.State state) {
        Intrinsics.i(state, "$this$update");
        return FareMedia.State.b(state, (PersistentList) null, (StringValue) null, (FareCappingCardState) null, 0, (String) null, false, false, false, FareMedia.State.DialogType.TRANSFER, false, 0, false, (String) null, false, 16127, (Object) null);
    }

    public static final FareMedia.State f0(FareMedia.State state) {
        Intrinsics.i(state, "$this$update");
        return FareMedia.State.b(state, (PersistentList) null, (StringValue) null, (FareCappingCardState) null, 0, (String) null, false, false, false, FareMedia.State.DialogType.NONE, false, 0, false, (String) null, false, 16127, (Object) null);
    }

    public static final FareMedia.State g0(FareMedia.Action action, FareMedia.State state) {
        Intrinsics.i(state, "$this$update");
        return FareMedia.State.b(state, (PersistentList) null, (StringValue) null, (FareCappingCardState) null, 0, ((FareMedia.Action.ChangeCurrentCard) action).a(), false, false, false, (FareMedia.State.DialogType) null, false, 0, false, (String) null, false, 16363, (Object) null);
    }

    public static final FareMedia.State h0(FareMedia.State state) {
        Intrinsics.i(state, "$this$update");
        return FareMedia.State.b(state, (PersistentList) null, (StringValue) null, (FareCappingCardState) null, 0, (String) null, false, false, false, FareMedia.State.DialogType.NONE, false, 0, false, (String) null, false, 16127, (Object) null);
    }

    public static final FareMedia.State i0(FareMedia.State state) {
        Intrinsics.i(state, "$this$update");
        return FareMedia.State.b(state, (PersistentList) null, (StringValue) null, (FareCappingCardState) null, 0, (String) null, false, false, false, FareMedia.State.DialogType.NONE, false, 0, false, (String) null, false, 16127, (Object) null);
    }

    public static final FareMedia.State m0(FareMedia.State state) {
        Intrinsics.i(state, "$this$update");
        return FareMedia.State.b(state, (PersistentList) null, (StringValue) null, (FareCappingCardState) null, 0, (String) null, false, false, false, (FareMedia.State.DialogType) null, true, 0, false, (String) null, false, 15871, (Object) null);
    }

    public static final FareMedia.State n0(FareMedia.State state) {
        Intrinsics.i(state, "$this$update");
        return FareMedia.State.b(state, (PersistentList) null, (StringValue) null, (FareCappingCardState) null, 0, (String) null, false, false, false, (FareMedia.State.DialogType) null, false, 0, false, (String) null, false, 15871, (Object) null);
    }

    public static final FareMedia.State p0(FareMedia.State state) {
        Intrinsics.i(state, "$this$update");
        return FareMedia.State.b(state, (PersistentList) null, (StringValue) null, (FareCappingCardState) null, 0, (String) null, false, false, false, FareMedia.State.DialogType.TRANSFER_LOADING, false, 0, false, (String) null, false, 16127, (Object) null);
    }

    public static final FareMedia.State q0(FareMedia.State state) {
        Intrinsics.i(state, "$this$update");
        return FareMedia.State.b(state, (PersistentList) null, (StringValue) null, (FareCappingCardState) null, 0, (String) null, false, false, false, FareMedia.State.DialogType.NONE, false, 0, false, (String) null, false, 16127, (Object) null);
    }

    public static final FareMedia.State r0(FareMedia.State state) {
        Intrinsics.i(state, "$this$update");
        return FareMedia.State.b(state, (PersistentList) null, (StringValue) null, (FareCappingCardState) null, 0, (String) null, false, false, false, FareMedia.State.DialogType.NONE, false, 0, false, (String) null, false, 16127, (Object) null);
    }

    public static final FareMedia.State t0(PersistentList persistentList, FareMedia.State state) {
        FareMedia.State state2 = state;
        Intrinsics.i(state, "$this$update");
        return FareMedia.State.b(state2, persistentList, (StringValue) null, (FareCappingCardState) null, 0, (String) null, false, false, false, (FareMedia.State.DialogType) null, false, 0, false, (String) null, false, 16382, (Object) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object X(java.lang.String r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.hansecom.abt.presentation.screens.home.faremedia.FareMediaViewModel$addToGoogleWallet$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.hansecom.abt.presentation.screens.home.faremedia.FareMediaViewModel$addToGoogleWallet$1 r0 = (com.hansecom.abt.presentation.screens.home.faremedia.FareMediaViewModel$addToGoogleWallet$1) r0
            int r1 = r0.F
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.F = r1
            goto L_0x0018
        L_0x0013:
            com.hansecom.abt.presentation.screens.home.faremedia.FareMediaViewModel$addToGoogleWallet$1 r0 = new com.hansecom.abt.presentation.screens.home.faremedia.FareMediaViewModel$addToGoogleWallet$1
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.D
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.F
            r3 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            java.lang.Object r5 = r0.C
            com.hansecom.abt.presentation.screens.home.faremedia.FareMediaViewModel r5 = (com.hansecom.abt.presentation.screens.home.faremedia.FareMediaViewModel) r5
            kotlin.ResultKt.b(r6)
            kotlin.Result r6 = (kotlin.Result) r6
            java.lang.Object r6 = r6.j()
            goto L_0x0054
        L_0x0033:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x003b:
            kotlin.ResultKt.b(r6)
            com.hansecom.abt.presentation.screens.home.faremedia.z0 r6 = new com.hansecom.abt.presentation.screens.home.faremedia.z0
            r6.<init>()
            r4.r(r6)
            com.hansecom.abt.data.useCases.fareMedia.GetGoogleWalletProvisioningLinkUseCase r6 = r4.f35981q
            r0.C = r4
            r0.F = r3
            java.lang.Object r6 = r6.a(r5, r0)
            if (r6 != r1) goto L_0x0053
            return r1
        L_0x0053:
            r5 = r4
        L_0x0054:
            boolean r0 = kotlin.Result.h(r6)
            if (r0 == 0) goto L_0x0090
            r0 = r6
            com.hansecom.mapi.models.GoogleWalletProvisioningResponse r0 = (com.hansecom.mapi.models.GoogleWalletProvisioningResponse) r0
            com.hansecom.abt.presentation.screens.home.faremedia.A0 r1 = new com.hansecom.abt.presentation.screens.home.faremedia.A0
            r1.<init>()
            r5.r(r1)
            java.lang.String r1 = r0.b()
            if (r1 == 0) goto L_0x007b
            com.hansecom.abt.presentation.screens.home.faremedia.FareMedia$Effect$LaunchGoogleWalletWithLink r1 = new com.hansecom.abt.presentation.screens.home.faremedia.FareMedia$Effect$LaunchGoogleWalletWithLink
            java.lang.String r0 = r0.b()
            kotlin.jvm.internal.Intrinsics.f(r0)
            r1.<init>(r0)
            r5.p(r1)
            goto L_0x0090
        L_0x007b:
            java.lang.String r1 = r0.a()
            if (r1 == 0) goto L_0x0090
            com.hansecom.abt.presentation.screens.home.faremedia.FareMedia$Effect$LaunchGoogleWalletWithJwt r1 = new com.hansecom.abt.presentation.screens.home.faremedia.FareMedia$Effect$LaunchGoogleWalletWithJwt
            java.lang.String r0 = r0.a()
            kotlin.jvm.internal.Intrinsics.f(r0)
            r1.<init>(r0)
            r5.p(r1)
        L_0x0090:
            java.lang.Throwable r6 = kotlin.Result.e(r6)
            if (r6 == 0) goto L_0x00aa
            com.hansecom.abt.presentation.screens.home.faremedia.B0 r0 = new com.hansecom.abt.presentation.screens.home.faremedia.B0
            r0.<init>()
            r5.r(r0)
            com.hansecom.abt.presentation.screens.home.faremedia.FareMedia$Effect$Error r0 = new com.hansecom.abt.presentation.screens.home.faremedia.FareMedia$Effect$Error
            com.hansecom.abt.util.resourcesResolvers.StringValue r6 = com.hansecom.abt.api.ApiExceptionsKt.a(r6)
            r0.<init>(r6)
            r5.p(r0)
        L_0x00aa:
            kotlin.Unit r5 = kotlin.Unit.f40552a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.faremedia.FareMediaViewModel.X(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final FareMedia.State.CardProvisioningStatus b0(boolean z2, FareMedium fareMedium) {
        if (fareMedium.p() == null) {
            return FareMedia.State.CardProvisioningStatus.UNSUPPORTED;
        }
        if (z2) {
            return FareMedia.State.CardProvisioningStatus.WALLET_UNAVAILABLE;
        }
        FareMediumWalletInformation p2 = fareMedium.p();
        return p2 != null ? Intrinsics.d(p2.a(), Boolean.TRUE) : false ? FareMedia.State.CardProvisioningStatus.PROVISIONED : FareMedia.State.CardProvisioningStatus.CAN_BE_PROVISIONED;
    }

    /* renamed from: c0 */
    public Object o(FareMedia.Action action, Continuation continuation) {
        if (Intrinsics.d(action, FareMedia.Action.AddCard.f35900a)) {
            r(new H0(this));
        } else if (Intrinsics.d(action, FareMedia.Action.RetrieveCard.f35909a)) {
            r(new t0());
        } else if (Intrinsics.d(action, FareMedia.Action.DismissDialog.f35904a)) {
            r(new u0());
        } else if (Intrinsics.d(action, FareMedia.Action.Refresh.f35908a)) {
            Object l0 = l0(continuation);
            return l0 == IntrinsicsKt.f() ? l0 : Unit.f40552a;
        } else if (action instanceof FareMedia.Action.ChangeCurrentCard) {
            if (!Intrinsics.d(((FareMedia.State) m()).g(), ((FareMedia.Action.ChangeCurrentCard) action).a())) {
                r(new v0(action));
            }
        } else if (Intrinsics.d(action, FareMedia.Action.CreateCardClick.f35903a)) {
            r(new w0());
            p(FareMedia.Effect.GoToCreateCard.f35912a);
        } else if (Intrinsics.d(action, FareMedia.Action.LinkCardClick.f35905a)) {
            r(new x0());
            p(FareMedia.Effect.GoToLinkCard.f35913a);
        } else if (Intrinsics.d(action, FareMedia.Action.TransferCardClick.f35910a)) {
            Object o0 = o0(continuation);
            return o0 == IntrinsicsKt.f() ? o0 : Unit.f40552a;
        } else if (action instanceof FareMedia.Action.AddToGoogleWalletClick) {
            Object X = X(((FareMedia.Action.AddToGoogleWalletClick) action).a(), continuation);
            return X == IntrinsicsKt.f() ? X : Unit.f40552a;
        } else if (action instanceof FareMedia.Action.OnGoogleWalletResult) {
            FareMedia.Action.OnGoogleWalletResult onGoogleWalletResult = (FareMedia.Action.OnGoogleWalletResult) action;
            Object k0 = k0(onGoogleWalletResult.b(), onGoogleWalletResult.a(), continuation);
            return k0 == IntrinsicsKt.f() ? k0 : Unit.f40552a;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.f40552a;
    }

    public final void j0(LocalDateTime localDateTime, CoroutineScope coroutineScope) {
        Job job = this.f35982r;
        if (job != null) {
            Job.DefaultImpls.a(job, (CancellationException) null, 1, (Object) null);
        }
        int between = (int) (ChronoUnit.SECONDS.between(LocalDateTime.now(), localDateTime.plusSeconds(300)) + 1);
        int max = Math.max(between, 0);
        int i2 = (max / 60) + 1;
        int i3 = max % 60;
        List s2 = CollectionsKt.s(0);
        if (i3 != 0) {
            s2.add(Integer.valueOf(i3));
        }
        Collection collection = s2;
        Integer[] numArr = new Integer[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            numArr[i4] = 60;
        }
        CollectionsKt.C(collection, numArr);
        this.f35982r = FlowKt.P(FlowKt.V(FlowKt.c(s2), new FareMediaViewModel$launchTimer$2(this, localDateTime, (Continuation) null)), coroutineScope);
    }

    public final Object k0(int i2, String str, Continuation continuation) {
        StringValue stringValue;
        if (i2 == -1) {
            Object l0 = l0(continuation);
            return l0 == IntrinsicsKt.f() ? l0 : Unit.f40552a;
        }
        if (i2 != 0) {
            if (str == null || (stringValue = StringValueKt.d(str)) == null) {
                stringValue = StringValueKt.c(R.string.N3);
            }
            p(new FareMedia.Effect.Error(stringValue));
        }
        return Unit.f40552a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object l0(kotlin.coroutines.Continuation r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.hansecom.abt.presentation.screens.home.faremedia.FareMediaViewModel$refreshAllFareMedia$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.hansecom.abt.presentation.screens.home.faremedia.FareMediaViewModel$refreshAllFareMedia$1 r0 = (com.hansecom.abt.presentation.screens.home.faremedia.FareMediaViewModel$refreshAllFareMedia$1) r0
            int r1 = r0.F
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.F = r1
            goto L_0x0018
        L_0x0013:
            com.hansecom.abt.presentation.screens.home.faremedia.FareMediaViewModel$refreshAllFareMedia$1 r0 = new com.hansecom.abt.presentation.screens.home.faremedia.FareMediaViewModel$refreshAllFareMedia$1
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.D
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.F
            r3 = 1
            if (r2 == 0) goto L_0x003a
            if (r2 != r3) goto L_0x0032
            java.lang.Object r0 = r0.C
            com.hansecom.abt.presentation.screens.home.faremedia.FareMediaViewModel r0 = (com.hansecom.abt.presentation.screens.home.faremedia.FareMediaViewModel) r0
            kotlin.ResultKt.b(r5)
            kotlin.Result r5 = (kotlin.Result) r5
            r5.j()
            goto L_0x005d
        L_0x0032:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x003a:
            kotlin.ResultKt.b(r5)
            com.hansecom.abt.presentation.screens.home.faremedia.C0 r5 = new com.hansecom.abt.presentation.screens.home.faremedia.C0
            r5.<init>()
            r4.r(r5)
            com.hansecom.abt.data.useCases.fareMedia.RefreshFareMediaDataUseCase r5 = r4.f35974j
            android.os.Parcelable r2 = r4.m()
            com.hansecom.abt.presentation.screens.home.faremedia.FareMedia$State r2 = (com.hansecom.abt.presentation.screens.home.faremedia.FareMedia.State) r2
            java.lang.String r2 = r2.g()
            r0.C = r4
            r0.F = r3
            java.lang.Object r5 = r5.d(r2, r0)
            if (r5 != r1) goto L_0x005c
            return r1
        L_0x005c:
            r0 = r4
        L_0x005d:
            com.hansecom.abt.presentation.screens.home.faremedia.D0 r5 = new com.hansecom.abt.presentation.screens.home.faremedia.D0
            r5.<init>()
            r0.r(r5)
            kotlin.Unit r5 = kotlin.Unit.f40552a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.faremedia.FareMediaViewModel.l0(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o0(kotlin.coroutines.Continuation r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.hansecom.abt.presentation.screens.home.faremedia.FareMediaViewModel$transferCard$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.hansecom.abt.presentation.screens.home.faremedia.FareMediaViewModel$transferCard$1 r0 = (com.hansecom.abt.presentation.screens.home.faremedia.FareMediaViewModel$transferCard$1) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.G = r1
            goto L_0x0018
        L_0x0013:
            com.hansecom.abt.presentation.screens.home.faremedia.FareMediaViewModel$transferCard$1 r0 = new com.hansecom.abt.presentation.screens.home.faremedia.FareMediaViewModel$transferCard$1
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.E
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.G
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0048
            if (r2 == r4) goto L_0x003a
            if (r2 != r3) goto L_0x0032
            java.lang.Object r1 = r0.D
            java.lang.Object r0 = r0.C
            com.hansecom.abt.presentation.screens.home.faremedia.FareMediaViewModel r0 = (com.hansecom.abt.presentation.screens.home.faremedia.FareMediaViewModel) r0
            kotlin.ResultKt.b(r6)
            goto L_0x0083
        L_0x0032:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x003a:
            java.lang.Object r2 = r0.C
            com.hansecom.abt.presentation.screens.home.faremedia.FareMediaViewModel r2 = (com.hansecom.abt.presentation.screens.home.faremedia.FareMediaViewModel) r2
            kotlin.ResultKt.b(r6)
            kotlin.Result r6 = (kotlin.Result) r6
            java.lang.Object r6 = r6.j()
            goto L_0x0061
        L_0x0048:
            kotlin.ResultKt.b(r6)
            com.hansecom.abt.presentation.screens.home.faremedia.E0 r6 = new com.hansecom.abt.presentation.screens.home.faremedia.E0
            r6.<init>()
            r5.r(r6)
            com.hansecom.abt.data.useCases.fareMedia.TransferFareMediaCardUseCase r6 = r5.f35976l
            r0.C = r5
            r0.G = r4
            java.lang.Object r6 = r6.a(r0)
            if (r6 != r1) goto L_0x0060
            return r1
        L_0x0060:
            r2 = r5
        L_0x0061:
            boolean r4 = kotlin.Result.h(r6)
            if (r4 == 0) goto L_0x008a
            r4 = r6
            kotlin.Unit r4 = (kotlin.Unit) r4
            com.hansecom.abt.presentation.screens.home.faremedia.F0 r4 = new com.hansecom.abt.presentation.screens.home.faremedia.F0
            r4.<init>()
            r2.r(r4)
            r0.C = r2
            r0.D = r6
            r0.G = r3
            r3 = 500(0x1f4, double:2.47E-321)
            java.lang.Object r0 = kotlinx.coroutines.DelayKt.b(r3, r0)
            if (r0 != r1) goto L_0x0081
            return r1
        L_0x0081:
            r1 = r6
            r0 = r2
        L_0x0083:
            com.hansecom.abt.presentation.screens.home.faremedia.FareMedia$Effect$ScrollToCarouselStart r6 = com.hansecom.abt.presentation.screens.home.faremedia.FareMedia.Effect.ScrollToCarouselStart.f35916a
            r0.p(r6)
            r2 = r0
            r6 = r1
        L_0x008a:
            java.lang.Throwable r6 = kotlin.Result.e(r6)
            if (r6 == 0) goto L_0x00a4
            com.hansecom.abt.presentation.screens.home.faremedia.G0 r0 = new com.hansecom.abt.presentation.screens.home.faremedia.G0
            r0.<init>()
            r2.r(r0)
            com.hansecom.abt.presentation.screens.home.faremedia.FareMedia$Effect$Error r0 = new com.hansecom.abt.presentation.screens.home.faremedia.FareMedia$Effect$Error
            com.hansecom.abt.util.resourcesResolvers.StringValue r6 = com.hansecom.abt.api.ApiExceptionsKt.a(r6)
            r0.<init>(r6)
            r2.p(r0)
        L_0x00a4:
            kotlin.Unit r6 = kotlin.Unit.f40552a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.faremedia.FareMediaViewModel.o0(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void s0(String str, LocalDateTime localDateTime) {
        Duration duration;
        int i2;
        LocalDateTime localDateTime2 = localDateTime;
        if (localDateTime2 == null) {
            duration = Duration.ZERO;
        } else {
            duration = Duration.between(LocalDateTime.now(), localDateTime2);
            if (duration.isNegative()) {
                duration = Duration.ZERO;
            }
        }
        Duration duration2 = Duration.ZERO;
        boolean z2 = true;
        int minutes = ((int) duration.toMinutes()) + (Intrinsics.d(duration, duration2) ^ true ? 1 : 0);
        boolean z3 = !Intrinsics.d(duration, duration2);
        int i3 = 0;
        if (minutes > this.f35977m.d().a()) {
            z2 = false;
        }
        TransferTimeState transferTimeState = new TransferTimeState(minutes, z3, z2);
        Iterator it = ((FareMedia.State) m()).f().iterator();
        while (true) {
            if (!it.hasNext()) {
                i2 = -1;
                break;
            } else if (Intrinsics.d(((FareMedia.State.CardItem) it.next()).m(), str)) {
                i2 = i3;
                break;
            } else {
                i3++;
            }
        }
        if (i2 != -1 && (((FareMedia.State) m()).f().get(i2) instanceof FareMedia.State.CardItem.Card)) {
            List P0 = CollectionsKt.P0(((FareMedia.State) m()).f());
            Object obj = P0.get(i2);
            Intrinsics.g(obj, "null cannot be cast to non-null type com.hansecom.abt.presentation.screens.home.faremedia.FareMedia.State.CardItem.Card");
            P0.set(i2, FareMedia.State.CardItem.Card.b((FareMedia.State.CardItem.Card) obj, (String) null, (String) null, (String) null, false, (String) null, (String) null, (StringValue) null, false, false, false, (FareMedia.State.CardProvisioningStatus) null, (Long) null, transferTimeState, 4095, (Object) null));
            r(new y0(ExtensionsKt.e(P0)));
        }
    }
}
