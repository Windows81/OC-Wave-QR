package com.hansecom.abt.presentation.screens.home.faremedia.cardHistory;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata
public final class CardHistoryViewModel$2$invokeSuspend$$inlined$map$1 implements Flow<Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ CardHistoryViewModel f36392A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Flow f36393z;

    public CardHistoryViewModel$2$invokeSuspend$$inlined$map$1(Flow flow, CardHistoryViewModel cardHistoryViewModel) {
        this.f36393z = flow;
        this.f36392A = cardHistoryViewModel;
    }

    public Object a(final FlowCollector flowCollector, Continuation continuation) {
        Flow flow = this.f36393z;
        final CardHistoryViewModel cardHistoryViewModel = this.f36392A;
        Object a2 = flow.a(new FlowCollector() {
            /* JADX WARNING: Removed duplicated region for block: B:12:0x0032  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object c(java.lang.Object r11, kotlin.coroutines.Continuation r12) {
                /*
                    r10 = this;
                    boolean r0 = r12 instanceof com.hansecom.abt.presentation.screens.home.faremedia.cardHistory.CardHistoryViewModel$2$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1
                    if (r0 == 0) goto L_0x0013
                    r0 = r12
                    com.hansecom.abt.presentation.screens.home.faremedia.cardHistory.CardHistoryViewModel$2$invokeSuspend$$inlined$map$1$2$1 r0 = (com.hansecom.abt.presentation.screens.home.faremedia.cardHistory.CardHistoryViewModel$2$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                    int r1 = r0.D
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.D = r1
                    goto L_0x0018
                L_0x0013:
                    com.hansecom.abt.presentation.screens.home.faremedia.cardHistory.CardHistoryViewModel$2$invokeSuspend$$inlined$map$1$2$1 r0 = new com.hansecom.abt.presentation.screens.home.faremedia.cardHistory.CardHistoryViewModel$2$invokeSuspend$$inlined$map$1$2$1
                    r0.<init>(r10, r12)
                L_0x0018:
                    java.lang.Object r12 = r0.C
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                    int r2 = r0.D
                    r3 = 1
                    if (r2 == 0) goto L_0x0032
                    if (r2 != r3) goto L_0x002a
                    kotlin.ResultKt.b(r12)
                    goto L_0x011f
                L_0x002a:
                    java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                    java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                    r11.<init>(r12)
                    throw r11
                L_0x0032:
                    kotlin.ResultKt.b(r12)
                    kotlinx.coroutines.flow.FlowCollector r12 = r4
                    kotlin.Result r11 = (kotlin.Result) r11
                    java.lang.Object r11 = r11.j()
                    java.lang.Throwable r2 = kotlin.Result.e(r11)
                    if (r2 != 0) goto L_0x00f1
                    com.hansecom.mapi.models.TransactionSearchResult r11 = (com.hansecom.mapi.models.TransactionSearchResult) r11
                    java.util.List r2 = r11.b()
                    kotlin.jvm.internal.Intrinsics.f(r2)
                    java.lang.Iterable r2 = (java.lang.Iterable) r2
                    java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
                    r4.<init>()
                    java.util.Iterator r2 = r2.iterator()
                L_0x0057:
                    boolean r5 = r2.hasNext()
                    if (r5 == 0) goto L_0x0084
                    java.lang.Object r5 = r2.next()
                    r6 = r5
                    com.hansecom.mapi.models.Transaction r6 = (com.hansecom.mapi.models.Transaction) r6
                    java.time.ZonedDateTime r6 = com.hansecom.abt.data.domainExtensions.TransactionExtKt.a(r6)
                    if (r6 == 0) goto L_0x006f
                    java.time.LocalDate r6 = r6.toLocalDate()
                    goto L_0x0070
                L_0x006f:
                    r6 = 0
                L_0x0070:
                    java.lang.Object r7 = r4.get(r6)
                    if (r7 != 0) goto L_0x007e
                    java.util.ArrayList r7 = new java.util.ArrayList
                    r7.<init>()
                    r4.put(r6, r7)
                L_0x007e:
                    java.util.List r7 = (java.util.List) r7
                    r7.add(r5)
                    goto L_0x0057
                L_0x0084:
                    java.util.ArrayList r2 = new java.util.ArrayList
                    int r5 = r4.size()
                    r2.<init>(r5)
                    java.util.Set r4 = r4.entrySet()
                    java.util.Iterator r4 = r4.iterator()
                L_0x0095:
                    boolean r5 = r4.hasNext()
                    if (r5 == 0) goto L_0x00e2
                    java.lang.Object r5 = r4.next()
                    java.util.Map$Entry r5 = (java.util.Map.Entry) r5
                    java.lang.Object r6 = r5.getKey()
                    kotlin.jvm.internal.Intrinsics.f(r6)
                    java.time.LocalDate r6 = (java.time.LocalDate) r6
                    java.lang.Object r5 = r5.getValue()
                    java.lang.Iterable r5 = (java.lang.Iterable) r5
                    java.util.ArrayList r7 = new java.util.ArrayList
                    r8 = 10
                    int r8 = kotlin.collections.CollectionsKt.x(r5, r8)
                    r7.<init>(r8)
                    java.util.Iterator r5 = r5.iterator()
                L_0x00bf:
                    boolean r8 = r5.hasNext()
                    if (r8 == 0) goto L_0x00d5
                    java.lang.Object r8 = r5.next()
                    com.hansecom.mapi.models.Transaction r8 = (com.hansecom.mapi.models.Transaction) r8
                    com.hansecom.abt.ui.components.historyItem.HistoryItemState$Companion r9 = com.hansecom.abt.ui.components.historyItem.HistoryItemState.F
                    com.hansecom.abt.ui.components.historyItem.HistoryItemState r8 = r9.a(r8)
                    r7.add(r8)
                    goto L_0x00bf
                L_0x00d5:
                    kotlinx.collections.immutable.PersistentList r5 = kotlinx.collections.immutable.ExtensionsKt.e(r7)
                    com.hansecom.abt.ui.components.historyItem.HistorySectionState r7 = new com.hansecom.abt.ui.components.historyItem.HistorySectionState
                    r7.<init>(r6, r5)
                    r2.add(r7)
                    goto L_0x0095
                L_0x00e2:
                    kotlinx.collections.immutable.PersistentList r2 = kotlinx.collections.immutable.ExtensionsKt.e(r2)
                    com.hansecom.abt.presentation.screens.home.faremedia.cardHistory.CardHistoryViewModel r4 = r2
                    com.hansecom.abt.presentation.screens.home.faremedia.cardHistory.CardHistoryViewModel$2$1$1$1 r5 = new com.hansecom.abt.presentation.screens.home.faremedia.cardHistory.CardHistoryViewModel$2$1$1$1
                    r5.<init>(r11, r2)
                    r4.r(r5)
                    goto L_0x0114
                L_0x00f1:
                    com.hansecom.abt.presentation.screens.home.faremedia.cardHistory.CardHistoryViewModel r11 = r2
                    com.hansecom.abt.presentation.screens.home.faremedia.cardHistory.CardHistory$Effect$Error r4 = new com.hansecom.abt.presentation.screens.home.faremedia.cardHistory.CardHistory$Effect$Error
                    com.hansecom.abt.util.resourcesResolvers.StringValue r2 = com.hansecom.abt.api.ApiExceptionsKt.a(r2)
                    r4.<init>(r2)
                    r11.p(r4)
                    com.hansecom.abt.presentation.screens.home.faremedia.cardHistory.CardHistoryViewModel r11 = r2
                    android.os.Parcelable r11 = r11.m()
                    com.hansecom.abt.presentation.screens.home.faremedia.cardHistory.CardHistory$State r11 = (com.hansecom.abt.presentation.screens.home.faremedia.cardHistory.CardHistory.State) r11
                    kotlinx.collections.immutable.PersistentList r11 = r11.e()
                    if (r11 != 0) goto L_0x0114
                    com.hansecom.abt.presentation.screens.home.faremedia.cardHistory.CardHistoryViewModel r11 = r2
                    com.hansecom.abt.presentation.screens.home.faremedia.cardHistory.CardHistoryViewModel$2$1$2$1 r2 = com.hansecom.abt.presentation.screens.home.faremedia.cardHistory.CardHistoryViewModel$2$1$2$1.f36398z
                    r11.r(r2)
                L_0x0114:
                    kotlin.Unit r11 = kotlin.Unit.f40552a
                    r0.D = r3
                    java.lang.Object r11 = r12.c(r11, r0)
                    if (r11 != r1) goto L_0x011f
                    return r1
                L_0x011f:
                    kotlin.Unit r11 = kotlin.Unit.f40552a
                    return r11
                */
                throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.faremedia.cardHistory.CardHistoryViewModel$2$invokeSuspend$$inlined$map$1.AnonymousClass2.c(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }, continuation);
        return a2 == IntrinsicsKt.f() ? a2 : Unit.f40552a;
    }
}
