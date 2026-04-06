package com.hansecom.abt.data.repositories;

import com.hansecom.abt.data.repositories.base.MultipleValueRepository;
import com.hansecom.mapi.apis.UserFareMediaApi;
import com.hansecom.mapi.models.TransactionSearchResult;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Singleton
@Metadata
public final class CardHistoryRepository extends MultipleValueRepository<String, TransactionSearchResult> {

    /* renamed from: h  reason: collision with root package name */
    public static final Companion f33404h = new Companion((DefaultConstructorMarker) null);

    /* renamed from: i  reason: collision with root package name */
    public static final int f33405i = 8;

    /* renamed from: f  reason: collision with root package name */
    public final UserFareMediaApi f33406f;

    /* renamed from: g  reason: collision with root package name */
    public final Function2 f33407g = new CardHistoryRepository$getFreshData$1(this, (Continuation) null);

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
    public CardHistoryRepository(com.hansecom.mapi.apis.UserFareMediaApi r7, kotlinx.serialization.json.Json r8, com.hansecom.abt.data.preferences.base.DataStoreFileProducer r9) {
        /*
            r6 = this;
            java.lang.String r0 = "userFareMediaApi"
            kotlin.jvm.internal.Intrinsics.i(r7, r0)
            java.lang.String r0 = "json"
            kotlin.jvm.internal.Intrinsics.i(r8, r0)
            java.lang.String r0 = "dataStoreFileProducer"
            kotlin.jvm.internal.Intrinsics.i(r9, r0)
            com.hansecom.abt.data.preferences.base.Seconds$Companion r0 = com.hansecom.abt.data.preferences.base.Seconds.f33366b
            r1 = 2
            com.hansecom.abt.data.preferences.base.Seconds r1 = r0.c(r1)
            r2 = 15
            com.hansecom.abt.data.preferences.base.Seconds r0 = r0.a(r2)
            com.hansecom.abt.data.preferences.base.HashMapLocalDataProvider$Companion r2 = com.hansecom.abt.data.preferences.base.HashMapLocalDataProvider.f33346d
            r8.a()
            kotlinx.serialization.internal.LinkedHashMapSerializer r2 = new kotlinx.serialization.internal.LinkedHashMapSerializer
            kotlinx.serialization.internal.StringSerializer r3 = kotlinx.serialization.internal.StringSerializer.f42197a
            com.hansecom.abt.data.preferences.base.CacheValue$Companion r4 = com.hansecom.abt.data.preferences.base.CacheValue.Companion
            com.hansecom.mapi.models.TransactionSearchResult$Companion r5 = com.hansecom.mapi.models.TransactionSearchResult.Companion
            kotlinx.serialization.KSerializer r5 = r5.serializer()
            kotlinx.serialization.KSerializer r4 = r4.serializer(r5)
            kotlinx.serialization.KSerializer r4 = kotlinx.serialization.builtins.BuiltinSerializersKt.u(r4)
            r2.<init>(r3, r4)
            com.hansecom.abt.data.repositories.CardHistoryRepository$special$$inlined$create$1 r3 = new com.hansecom.abt.data.repositories.CardHistoryRepository$special$$inlined$create$1
            r3.<init>(r8, r2)
            com.hansecom.abt.data.repositories.CardHistoryRepository$special$$inlined$create$2 r8 = new com.hansecom.abt.data.repositories.CardHistoryRepository$special$$inlined$create$2
            java.lang.String r2 = "CardHistory"
            r8.<init>(r2, r9, r3)
            r6.<init>(r1, r0, r8)
            r6.f33406f = r7
            com.hansecom.abt.data.repositories.CardHistoryRepository$getFreshData$1 r7 = new com.hansecom.abt.data.repositories.CardHistoryRepository$getFreshData$1
            r8 = 0
            r7.<init>(r6, r8)
            r6.f33407g = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.data.repositories.CardHistoryRepository.<init>(com.hansecom.mapi.apis.UserFareMediaApi, kotlinx.serialization.json.Json, com.hansecom.abt.data.preferences.base.DataStoreFileProducer):void");
    }

    public Function2 j() {
        return this.f33407g;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00fc A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x010d A[Catch:{ all -> 0x0165 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object r(java.lang.String r23, kotlin.coroutines.Continuation r24) {
        /*
            r22 = this;
            r1 = r22
            r0 = r24
            boolean r2 = r0 instanceof com.hansecom.abt.data.repositories.CardHistoryRepository$getMore$1
            if (r2 == 0) goto L_0x0017
            r2 = r0
            com.hansecom.abt.data.repositories.CardHistoryRepository$getMore$1 r2 = (com.hansecom.abt.data.repositories.CardHistoryRepository$getMore$1) r2
            int r3 = r2.J
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.J = r3
            goto L_0x001c
        L_0x0017:
            com.hansecom.abt.data.repositories.CardHistoryRepository$getMore$1 r2 = new com.hansecom.abt.data.repositories.CardHistoryRepository$getMore$1
            r2.<init>(r1, r0)
        L_0x001c:
            java.lang.Object r0 = r2.H
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r4 = r2.J
            r5 = 0
            r6 = 4
            r7 = 3
            r8 = 2
            r9 = 1
            r10 = 0
            if (r4 == 0) goto L_0x008c
            if (r4 == r9) goto L_0x0071
            if (r4 == r8) goto L_0x005c
            if (r4 == r7) goto L_0x0041
            if (r4 != r6) goto L_0x0039
            kotlin.ResultKt.b(r0)
            goto L_0x0160
        L_0x0039:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0041:
            java.lang.Object r4 = r2.G
            kotlinx.coroutines.sync.Mutex r4 = (kotlinx.coroutines.sync.Mutex) r4
            java.lang.Object r7 = r2.F
            com.hansecom.mapi.models.TransactionSearchResult r7 = (com.hansecom.mapi.models.TransactionSearchResult) r7
            java.lang.Object r8 = r2.E
            com.hansecom.abt.data.repositories.base.BaseRepository r8 = (com.hansecom.abt.data.repositories.base.BaseRepository) r8
            java.lang.Object r11 = r2.D
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r12 = r2.C
            com.hansecom.abt.data.repositories.CardHistoryRepository r12 = (com.hansecom.abt.data.repositories.CardHistoryRepository) r12
            kotlin.ResultKt.b(r0)
            r14 = r7
        L_0x0059:
            r13 = r11
            goto L_0x0100
        L_0x005c:
            java.lang.Object r4 = r2.F
            com.hansecom.mapi.models.TransactionSearchResult r4 = (com.hansecom.mapi.models.TransactionSearchResult) r4
            java.lang.Object r8 = r2.E
            com.hansecom.abt.data.repositories.base.BaseRepository r8 = (com.hansecom.abt.data.repositories.base.BaseRepository) r8
            java.lang.Object r11 = r2.D
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r12 = r2.C
            com.hansecom.abt.data.repositories.CardHistoryRepository r12 = (com.hansecom.abt.data.repositories.CardHistoryRepository) r12
            kotlin.ResultKt.b(r0)
            goto L_0x00e2
        L_0x0071:
            java.lang.Object r4 = r2.E
            com.hansecom.abt.data.repositories.base.BaseRepository r4 = (com.hansecom.abt.data.repositories.base.BaseRepository) r4
            java.lang.Object r11 = r2.D
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r12 = r2.C
            com.hansecom.abt.data.repositories.CardHistoryRepository r12 = (com.hansecom.abt.data.repositories.CardHistoryRepository) r12
            kotlin.ResultKt.b(r0)
            kotlin.Result r0 = (kotlin.Result) r0
            java.lang.Object r0 = r0.j()
            r21 = r11
            r11 = r4
            r4 = r21
            goto L_0x00aa
        L_0x008c:
            kotlin.ResultKt.b(r0)
            com.hansecom.abt.data.repositories.base.BaseRepository r0 = r22.m(r23)
            r2.C = r1
            r4 = r23
            r2.D = r4
            r2.E = r0
            r2.J = r9
            java.lang.Object r11 = r0.i(r2)
            if (r11 != r3) goto L_0x00a4
            return r3
        L_0x00a4:
            r12 = r1
            r21 = r11
            r11 = r0
            r0 = r21
        L_0x00aa:
            boolean r13 = kotlin.Result.g(r0)
            if (r13 == 0) goto L_0x00b5
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.Boxing.a(r5)
            return r0
        L_0x00b5:
            kotlin.ResultKt.b(r0)
            com.hansecom.mapi.models.TransactionSearchResult r0 = (com.hansecom.mapi.models.TransactionSearchResult) r0
            boolean r13 = r11.y()
            if (r13 == 0) goto L_0x00e4
            kotlinx.coroutines.Job r13 = r11.m()
            boolean r13 = r13.b()
            if (r13 == 0) goto L_0x00e4
            kotlinx.coroutines.Job r13 = r11.m()
            r2.C = r12
            r2.D = r4
            r2.E = r11
            r2.F = r0
            r2.J = r8
            java.lang.Object r8 = r13.D(r2)
            if (r8 != r3) goto L_0x00df
            return r3
        L_0x00df:
            r8 = r11
            r11 = r4
            r4 = r0
        L_0x00e2:
            r0 = r4
            goto L_0x00e6
        L_0x00e4:
            r8 = r11
            r11 = r4
        L_0x00e6:
            kotlinx.coroutines.sync.Mutex r4 = r8.n()
            r2.C = r12
            r2.D = r11
            r2.E = r8
            r2.F = r0
            r2.G = r4
            r2.J = r7
            java.lang.Object r7 = r4.d(r10, r2)
            if (r7 != r3) goto L_0x00fd
            return r3
        L_0x00fd:
            r14 = r0
            goto L_0x0059
        L_0x0100:
            java.lang.Integer r0 = r14.c()     // Catch:{ all -> 0x0165 }
            kotlin.jvm.internal.Intrinsics.f(r0)     // Catch:{ all -> 0x0165 }
            int r0 = r0.intValue()     // Catch:{ all -> 0x0165 }
            if (r0 == 0) goto L_0x0167
            java.util.List r0 = r14.b()     // Catch:{ all -> 0x0165 }
            kotlin.jvm.internal.Intrinsics.f(r0)     // Catch:{ all -> 0x0165 }
            int r0 = r0.size()     // Catch:{ all -> 0x0165 }
            java.lang.Integer r7 = r14.c()     // Catch:{ all -> 0x0165 }
            kotlin.jvm.internal.Intrinsics.f(r7)     // Catch:{ all -> 0x0165 }
            int r7 = r7.intValue()     // Catch:{ all -> 0x0165 }
            if (r0 < r7) goto L_0x0126
            goto L_0x0167
        L_0x0126:
            kotlinx.coroutines.CoroutineScope r0 = r8.k()     // Catch:{ all -> 0x0165 }
            com.hansecom.abt.data.repositories.CardHistoryRepository$getMore$2$1 r18 = new com.hansecom.abt.data.repositories.CardHistoryRepository$getMore$2$1     // Catch:{ all -> 0x0165 }
            r16 = 0
            r11 = r18
            r15 = r8
            r11.<init>(r12, r13, r14, r15, r16)     // Catch:{ all -> 0x0165 }
            r19 = 3
            r20 = 0
            r16 = 0
            r17 = 0
            r15 = r0
            kotlinx.coroutines.Job r0 = kotlinx.coroutines.BuildersKt__Builders_commonKt.d(r15, r16, r17, r18, r19, r20)     // Catch:{ all -> 0x0165 }
            r8.I(r0)     // Catch:{ all -> 0x0165 }
            kotlin.Unit r0 = kotlin.Unit.f40552a     // Catch:{ all -> 0x0165 }
            r4.e(r10)
            kotlinx.coroutines.Job r0 = r8.m()
            r2.C = r10
            r2.D = r10
            r2.E = r10
            r2.F = r10
            r2.G = r10
            r2.J = r6
            java.lang.Object r0 = r0.D(r2)
            if (r0 != r3) goto L_0x0160
            return r3
        L_0x0160:
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.Boxing.a(r9)
            return r0
        L_0x0165:
            r0 = move-exception
            goto L_0x016f
        L_0x0167:
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.Boxing.a(r5)     // Catch:{ all -> 0x0165 }
            r4.e(r10)
            return r0
        L_0x016f:
            r4.e(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.data.repositories.CardHistoryRepository.r(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
