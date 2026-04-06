package com.hansecom.abt.presentation.screens.home.faremedia.cardHistory;

import com.hansecom.abt.data.repositories.CardHistoryRepository;
import com.hansecom.abt.presentation.mvi.MviViewModel;
import com.hansecom.abt.presentation.screens.home.faremedia.cardHistory.CardHistory;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.PersistentList;

@Metadata
public final class CardHistoryViewModel extends MviViewModel<CardHistory.Action, CardHistory.State, CardHistory.Effect> {

    /* renamed from: i  reason: collision with root package name */
    public final CardHistoryRepository f36390i;

    /* renamed from: j  reason: collision with root package name */
    public final String f36391j;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public CardHistoryViewModel(androidx.lifecycle.SavedStateHandle r18, com.hansecom.abt.data.repositories.CardHistoryRepository r19, com.hansecom.abt.data.repositories.FareMediaRepository r20) {
        /*
            r17 = this;
            r8 = r17
            r0 = r18
            r1 = r19
            r2 = r20
            java.lang.String r3 = "savedStateHandle"
            kotlin.jvm.internal.Intrinsics.i(r0, r3)
            java.lang.String r3 = "cardHistoryRepository"
            kotlin.jvm.internal.Intrinsics.i(r1, r3)
            java.lang.String r3 = "fareMediaRepository"
            kotlin.jvm.internal.Intrinsics.i(r2, r3)
            com.hansecom.abt.presentation.screens.home.faremedia.cardHistory.CardHistory$State r3 = new com.hansecom.abt.presentation.screens.home.faremedia.cardHistory.CardHistory$State
            r15 = 31
            r16 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r9 = r3
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            r8.<init>(r0, r3)
            r8.f36390i = r1
            java.util.Map r1 = kotlin.collections.MapsKt.h()
            java.lang.Class<com.hansecom.abt.presentation.screens.home.faremedia.cardOptions.CardOptionsCardHistoryDestination> r3 = com.hansecom.abt.presentation.screens.home.faremedia.cardOptions.CardOptionsCardHistoryDestination.class
            kotlin.reflect.KClass r3 = kotlin.jvm.internal.Reflection.b(r3)
            java.lang.Object r0 = androidx.navigation.SavedStateHandleKt.a(r0, r3, r1)
            com.hansecom.abt.presentation.screens.home.faremedia.cardOptions.CardOptionsCardHistoryDestination r0 = (com.hansecom.abt.presentation.screens.home.faremedia.cardOptions.CardOptionsCardHistoryDestination) r0
            java.lang.String r0 = r0.a()
            r8.f36391j = r0
            kotlinx.coroutines.CoroutineScope r1 = androidx.lifecycle.ViewModelKt.a(r17)
            com.hansecom.abt.presentation.screens.home.faremedia.cardHistory.CardHistoryViewModel$1 r4 = new com.hansecom.abt.presentation.screens.home.faremedia.cardHistory.CardHistoryViewModel$1
            r0 = 0
            r4.<init>(r2, r8, r0)
            r5 = 3
            r6 = 0
            r2 = 0
            r3 = 0
            kotlinx.coroutines.Job unused = kotlinx.coroutines.BuildersKt__Builders_commonKt.d(r1, r2, r3, r4, r5, r6)
            com.hansecom.abt.presentation.screens.home.faremedia.cardHistory.CardHistoryViewModel$2 r5 = new com.hansecom.abt.presentation.screens.home.faremedia.cardHistory.CardHistoryViewModel$2
            r5.<init>(r8, r0)
            r6 = 7
            r7 = 0
            r1 = 0
            r2 = 0
            r3 = 0
            r0 = r17
            com.hansecom.abt.presentation.mvi.MviViewModel.t(r0, r1, r2, r3, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.faremedia.cardHistory.CardHistoryViewModel.<init>(androidx.lifecycle.SavedStateHandle, com.hansecom.abt.data.repositories.CardHistoryRepository, com.hansecom.abt.data.repositories.FareMediaRepository):void");
    }

    public static final CardHistory.State B(CardHistory.State state) {
        Intrinsics.i(state, "$this$update");
        return CardHistory.State.b(state, (String) null, true, 0, false, (PersistentList) null, 29, (Object) null);
    }

    public static final CardHistory.State C(CardHistory.State state) {
        Intrinsics.i(state, "$this$update");
        return CardHistory.State.b(state, (String) null, false, 0, false, (PersistentList) null, 29, (Object) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: A */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object o(com.hansecom.abt.presentation.screens.home.faremedia.cardHistory.CardHistory.Action r6, kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.hansecom.abt.presentation.screens.home.faremedia.cardHistory.CardHistoryViewModel$handle$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.hansecom.abt.presentation.screens.home.faremedia.cardHistory.CardHistoryViewModel$handle$1 r0 = (com.hansecom.abt.presentation.screens.home.faremedia.cardHistory.CardHistoryViewModel$handle$1) r0
            int r1 = r0.F
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.F = r1
            goto L_0x0018
        L_0x0013:
            com.hansecom.abt.presentation.screens.home.faremedia.cardHistory.CardHistoryViewModel$handle$1 r0 = new com.hansecom.abt.presentation.screens.home.faremedia.cardHistory.CardHistoryViewModel$handle$1
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.D
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.F
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x003c
            if (r2 == r4) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            kotlin.ResultKt.b(r7)
            goto L_0x007d
        L_0x002c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0034:
            java.lang.Object r6 = r0.C
            com.hansecom.abt.presentation.screens.home.faremedia.cardHistory.CardHistoryViewModel r6 = (com.hansecom.abt.presentation.screens.home.faremedia.cardHistory.CardHistoryViewModel) r6
            kotlin.ResultKt.b(r7)
            goto L_0x005f
        L_0x003c:
            kotlin.ResultKt.b(r7)
            com.hansecom.abt.presentation.screens.home.faremedia.cardHistory.CardHistory$Action$Refresh r7 = com.hansecom.abt.presentation.screens.home.faremedia.cardHistory.CardHistory.Action.Refresh.f36373a
            boolean r7 = kotlin.jvm.internal.Intrinsics.d(r6, r7)
            if (r7 == 0) goto L_0x0068
            com.hansecom.abt.presentation.screens.home.faremedia.cardHistory.h r6 = new com.hansecom.abt.presentation.screens.home.faremedia.cardHistory.h
            r6.<init>()
            r5.r(r6)
            com.hansecom.abt.data.repositories.CardHistoryRepository r6 = r5.f36390i
            java.lang.String r7 = r5.f36391j
            r0.C = r5
            r0.F = r4
            java.lang.Object r6 = r6.o(r7, r0)
            if (r6 != r1) goto L_0x005e
            return r1
        L_0x005e:
            r6 = r5
        L_0x005f:
            com.hansecom.abt.presentation.screens.home.faremedia.cardHistory.i r7 = new com.hansecom.abt.presentation.screens.home.faremedia.cardHistory.i
            r7.<init>()
            r6.r(r7)
            goto L_0x007d
        L_0x0068:
            com.hansecom.abt.presentation.screens.home.faremedia.cardHistory.CardHistory$Action$GetMore r7 = com.hansecom.abt.presentation.screens.home.faremedia.cardHistory.CardHistory.Action.GetMore.f36372a
            boolean r6 = kotlin.jvm.internal.Intrinsics.d(r6, r7)
            if (r6 == 0) goto L_0x0080
            com.hansecom.abt.data.repositories.CardHistoryRepository r6 = r5.f36390i
            java.lang.String r7 = r5.f36391j
            r0.F = r3
            java.lang.Object r6 = r6.r(r7, r0)
            if (r6 != r1) goto L_0x007d
            return r1
        L_0x007d:
            kotlin.Unit r6 = kotlin.Unit.f40552a
            return r6
        L_0x0080:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.faremedia.cardHistory.CardHistoryViewModel.o(com.hansecom.abt.presentation.screens.home.faremedia.cardHistory.CardHistory$Action, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
