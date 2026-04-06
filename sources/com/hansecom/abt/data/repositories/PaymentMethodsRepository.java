package com.hansecom.abt.data.repositories;

import com.hansecom.abt.data.repositories.base.ValueRepository;
import com.hansecom.mapi.apis.UserDataApi;
import com.hansecom.mapi.models.PaymentMethod;
import java.util.List;
import javax.inject.Singleton;
import kotlin.Metadata;

@Singleton
@Metadata
public final class PaymentMethodsRepository extends ValueRepository<List<? extends PaymentMethod>> {

    /* renamed from: k  reason: collision with root package name */
    public final UserDataApi f33527k;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public PaymentMethodsRepository(com.hansecom.mapi.apis.UserDataApi r6, kotlinx.serialization.json.Json r7, com.hansecom.abt.data.preferences.base.DataStoreFileProducer r8) {
        /*
            r5 = this;
            java.lang.String r0 = "userApi"
            kotlin.jvm.internal.Intrinsics.i(r6, r0)
            java.lang.String r0 = "json"
            kotlin.jvm.internal.Intrinsics.i(r7, r0)
            java.lang.String r0 = "dataStoreFileProducer"
            kotlin.jvm.internal.Intrinsics.i(r8, r0)
            com.hansecom.abt.data.preferences.base.Seconds$Companion r0 = com.hansecom.abt.data.preferences.base.Seconds.f33366b
            r1 = 15
            com.hansecom.abt.data.preferences.base.Seconds r3 = r0.c(r1)
            com.hansecom.abt.data.preferences.base.Seconds r0 = r0.a(r1)
            com.hansecom.abt.data.preferences.base.ValueLocalDataProvider$Companion r1 = com.hansecom.abt.data.preferences.base.ValueLocalDataProvider.f33368d
            r7.a()
            com.hansecom.abt.data.preferences.base.CacheValue$Companion r1 = com.hansecom.abt.data.preferences.base.CacheValue.Companion
            kotlinx.serialization.internal.ArrayListSerializer r2 = new kotlinx.serialization.internal.ArrayListSerializer
            com.hansecom.mapi.models.PaymentMethod$Companion r4 = com.hansecom.mapi.models.PaymentMethod.Companion
            kotlinx.serialization.KSerializer r4 = r4.serializer()
            r2.<init>(r4)
            kotlinx.serialization.KSerializer r1 = r1.serializer(r2)
            com.hansecom.abt.data.repositories.PaymentMethodsRepository$special$$inlined$create$1 r2 = new com.hansecom.abt.data.repositories.PaymentMethodsRepository$special$$inlined$create$1
            r2.<init>(r7, r1)
            com.hansecom.abt.data.repositories.PaymentMethodsRepository$special$$inlined$create$2 r7 = new com.hansecom.abt.data.repositories.PaymentMethodsRepository$special$$inlined$create$2
            java.lang.String r1 = "PaymentMethods"
            r7.<init>(r1, r8, r2)
            r5.<init>(r3, r0, r7)
            r5.f33527k = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.data.repositories.PaymentMethodsRepository.<init>(com.hansecom.mapi.apis.UserDataApi, kotlinx.serialization.json.Json, com.hansecom.abt.data.preferences.base.DataStoreFileProducer):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x009e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object M(long r17, java.lang.String r19, boolean r20, kotlin.coroutines.Continuation r21) {
        /*
            r16 = this;
            r8 = r16
            r0 = r21
            boolean r1 = r0 instanceof com.hansecom.abt.data.repositories.PaymentMethodsRepository$editPaymentMethod$1
            if (r1 == 0) goto L_0x0018
            r1 = r0
            com.hansecom.abt.data.repositories.PaymentMethodsRepository$editPaymentMethod$1 r1 = (com.hansecom.abt.data.repositories.PaymentMethodsRepository$editPaymentMethod$1) r1
            int r2 = r1.H
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0018
            int r2 = r2 - r3
            r1.H = r2
        L_0x0016:
            r9 = r1
            goto L_0x001e
        L_0x0018:
            com.hansecom.abt.data.repositories.PaymentMethodsRepository$editPaymentMethod$1 r1 = new com.hansecom.abt.data.repositories.PaymentMethodsRepository$editPaymentMethod$1
            r1.<init>(r8, r0)
            goto L_0x0016
        L_0x001e:
            java.lang.Object r0 = r9.F
            java.lang.Object r10 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r1 = r9.H
            r11 = 3
            r12 = 2
            r13 = 1
            if (r1 == 0) goto L_0x005a
            if (r1 == r13) goto L_0x0051
            if (r1 == r12) goto L_0x0042
            if (r1 != r11) goto L_0x003a
            java.lang.Object r1 = r9.C
            kotlin.Result r1 = (kotlin.Result) r1
            kotlin.ResultKt.b(r0)
            goto L_0x00b6
        L_0x003a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0042:
            java.lang.Object r1 = r9.E
            java.lang.Object r2 = r9.D
            kotlin.Result r2 = (kotlin.Result) r2
            java.lang.Object r3 = r9.C
            com.hansecom.abt.data.repositories.PaymentMethodsRepository r3 = (com.hansecom.abt.data.repositories.PaymentMethodsRepository) r3
            kotlin.ResultKt.b(r0)
            r0 = r2
            goto L_0x009f
        L_0x0051:
            java.lang.Object r1 = r9.C
            com.hansecom.abt.data.repositories.PaymentMethodsRepository r1 = (com.hansecom.abt.data.repositories.PaymentMethodsRepository) r1
            kotlin.ResultKt.b(r0)
            r3 = r1
            goto L_0x0082
        L_0x005a:
            kotlin.ResultKt.b(r0)
            com.hansecom.abt.api.JsonParser r0 = com.hansecom.abt.api.JsonParser.f33114a
            kotlinx.serialization.json.Json r1 = r0.c()
            kotlinx.coroutines.CoroutineDispatcher r14 = kotlinx.coroutines.Dispatchers.b()
            com.hansecom.abt.data.repositories.PaymentMethodsRepository$editPaymentMethod-BWLJW6A$$inlined$retrofit$default$1 r15 = new com.hansecom.abt.data.repositories.PaymentMethodsRepository$editPaymentMethod-BWLJW6A$$inlined$retrofit$default$1
            r2 = 0
            r0 = r15
            r3 = r16
            r4 = r17
            r6 = r19
            r7 = r20
            r0.<init>(r1, r2, r3, r4, r6, r7)
            r9.C = r8
            r9.H = r13
            java.lang.Object r0 = kotlinx.coroutines.BuildersKt.g(r14, r15, r9)
            if (r0 != r10) goto L_0x0081
            return r10
        L_0x0081:
            r3 = r8
        L_0x0082:
            kotlin.Result r0 = (kotlin.Result) r0
            java.lang.Object r0 = r0.j()
            kotlin.Result r0 = kotlin.Result.a(r0)
            java.lang.Object r1 = r0.j()
            r9.C = r3
            r9.D = r0
            r9.E = r1
            r9.H = r12
            java.lang.Object r2 = r3.D(r9)
            if (r2 != r10) goto L_0x009f
            return r10
        L_0x009f:
            boolean r1 = kotlin.Result.h(r1)
            if (r1 == 0) goto L_0x00b7
            r9.C = r0
            r1 = 0
            r9.D = r1
            r9.E = r1
            r9.H = r11
            java.lang.Object r1 = r3.G(r9)
            if (r1 != r10) goto L_0x00b5
            return r10
        L_0x00b5:
            r1 = r0
        L_0x00b6:
            r0 = r1
        L_0x00b7:
            java.lang.Object r0 = r0.j()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.data.repositories.PaymentMethodsRepository.M(long, java.lang.String, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0049 A[SYNTHETIC, Splitter:B:17:0x0049] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object N(kotlin.coroutines.Continuation r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.hansecom.abt.data.repositories.PaymentMethodsRepository$getDefaultPaymentMethod$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.hansecom.abt.data.repositories.PaymentMethodsRepository$getDefaultPaymentMethod$1 r0 = (com.hansecom.abt.data.repositories.PaymentMethodsRepository$getDefaultPaymentMethod$1) r0
            int r1 = r0.E
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.E = r1
            goto L_0x0018
        L_0x0013:
            com.hansecom.abt.data.repositories.PaymentMethodsRepository$getDefaultPaymentMethod$1 r0 = new com.hansecom.abt.data.repositories.PaymentMethodsRepository$getDefaultPaymentMethod$1
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.C
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.E
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            kotlin.ResultKt.b(r5)
            kotlin.Result r5 = (kotlin.Result) r5
            java.lang.Object r5 = r5.j()
            goto L_0x0043
        L_0x002f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0037:
            kotlin.ResultKt.b(r5)
            r0.E = r3
            java.lang.Object r5 = r4.i(r0)
            if (r5 != r1) goto L_0x0043
            return r1
        L_0x0043:
            boolean r0 = kotlin.Result.h(r5)
            if (r0 == 0) goto L_0x007d
            java.util.List r5 = (java.util.List) r5     // Catch:{ all -> 0x006d }
            java.lang.Iterable r5 = (java.lang.Iterable) r5     // Catch:{ all -> 0x006d }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x006d }
        L_0x0051:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x006d }
            if (r0 == 0) goto L_0x006f
            java.lang.Object r0 = r5.next()     // Catch:{ all -> 0x006d }
            r1 = r0
            com.hansecom.mapi.models.PaymentMethod r1 = (com.hansecom.mapi.models.PaymentMethod) r1     // Catch:{ all -> 0x006d }
            java.lang.Boolean r1 = r1.h()     // Catch:{ all -> 0x006d }
            java.lang.Boolean r2 = kotlin.coroutines.jvm.internal.Boxing.a(r3)     // Catch:{ all -> 0x006d }
            boolean r1 = kotlin.jvm.internal.Intrinsics.d(r1, r2)     // Catch:{ all -> 0x006d }
            if (r1 == 0) goto L_0x0051
            goto L_0x0070
        L_0x006d:
            r5 = move-exception
            goto L_0x0077
        L_0x006f:
            r0 = 0
        L_0x0070:
            com.hansecom.mapi.models.PaymentMethod r0 = (com.hansecom.mapi.models.PaymentMethod) r0     // Catch:{ all -> 0x006d }
            java.lang.Object r5 = kotlin.Result.b(r0)     // Catch:{ all -> 0x006d }
            goto L_0x0081
        L_0x0077:
            kotlin.Result$Companion r0 = kotlin.Result.f40519A
            java.lang.Object r5 = kotlin.ResultKt.a(r5)
        L_0x007d:
            java.lang.Object r5 = kotlin.Result.b(r5)
        L_0x0081:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.data.repositories.PaymentMethodsRepository.N(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004d A[SYNTHETIC, Splitter:B:17:0x004d] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object O(long r5, kotlin.coroutines.Continuation r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.hansecom.abt.data.repositories.PaymentMethodsRepository$getPaymentMethod$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.hansecom.abt.data.repositories.PaymentMethodsRepository$getPaymentMethod$1 r0 = (com.hansecom.abt.data.repositories.PaymentMethodsRepository$getPaymentMethod$1) r0
            int r1 = r0.F
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.F = r1
            goto L_0x0018
        L_0x0013:
            com.hansecom.abt.data.repositories.PaymentMethodsRepository$getPaymentMethod$1 r0 = new com.hansecom.abt.data.repositories.PaymentMethodsRepository$getPaymentMethod$1
            r0.<init>(r4, r7)
        L_0x0018:
            java.lang.Object r7 = r0.D
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.F
            r3 = 1
            if (r2 == 0) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            long r5 = r0.C
            kotlin.ResultKt.b(r7)
            kotlin.Result r7 = (kotlin.Result) r7
            java.lang.Object r7 = r7.j()
            goto L_0x0047
        L_0x0031:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0039:
            kotlin.ResultKt.b(r7)
            r0.C = r5
            r0.F = r3
            java.lang.Object r7 = r4.i(r0)
            if (r7 != r1) goto L_0x0047
            return r1
        L_0x0047:
            boolean r0 = kotlin.Result.h(r7)
            if (r0 == 0) goto L_0x008d
            java.util.List r7 = (java.util.List) r7     // Catch:{ all -> 0x0078 }
            java.lang.Iterable r7 = (java.lang.Iterable) r7     // Catch:{ all -> 0x0078 }
            java.util.Iterator r7 = r7.iterator()     // Catch:{ all -> 0x0078 }
        L_0x0055:
            boolean r0 = r7.hasNext()     // Catch:{ all -> 0x0078 }
            if (r0 == 0) goto L_0x007a
            java.lang.Object r0 = r7.next()     // Catch:{ all -> 0x0078 }
            r1 = r0
            com.hansecom.mapi.models.PaymentMethod r1 = (com.hansecom.mapi.models.PaymentMethod) r1     // Catch:{ all -> 0x0078 }
            java.lang.Long r1 = r1.e()     // Catch:{ all -> 0x0078 }
            if (r1 != 0) goto L_0x0069
            goto L_0x0055
        L_0x0069:
            long r1 = r1.longValue()     // Catch:{ all -> 0x0078 }
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0055
            com.hansecom.mapi.models.PaymentMethod r0 = (com.hansecom.mapi.models.PaymentMethod) r0     // Catch:{ all -> 0x0078 }
            java.lang.Object r5 = kotlin.Result.b(r0)     // Catch:{ all -> 0x0078 }
            goto L_0x0091
        L_0x0078:
            r5 = move-exception
            goto L_0x0082
        L_0x007a:
            java.util.NoSuchElementException r5 = new java.util.NoSuchElementException     // Catch:{ all -> 0x0078 }
            java.lang.String r6 = "Collection contains no element matching the predicate."
            r5.<init>(r6)     // Catch:{ all -> 0x0078 }
            throw r5     // Catch:{ all -> 0x0078 }
        L_0x0082:
            kotlin.Result$Companion r6 = kotlin.Result.f40519A
            java.lang.Object r5 = kotlin.ResultKt.a(r5)
            java.lang.Object r5 = kotlin.Result.b(r5)
            goto L_0x0091
        L_0x008d:
            java.lang.Object r5 = kotlin.Result.b(r7)
        L_0x0091:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.data.repositories.PaymentMethodsRepository.O(long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0135 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0143 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object P(long r19, kotlin.coroutines.Continuation r21) {
        /*
            r18 = this;
            r6 = r18
            r0 = r21
            boolean r1 = r0 instanceof com.hansecom.abt.data.repositories.PaymentMethodsRepository$removePaymentMethod$1
            if (r1 == 0) goto L_0x0018
            r1 = r0
            com.hansecom.abt.data.repositories.PaymentMethodsRepository$removePaymentMethod$1 r1 = (com.hansecom.abt.data.repositories.PaymentMethodsRepository$removePaymentMethod$1) r1
            int r2 = r1.I
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0018
            int r2 = r2 - r3
            r1.I = r2
        L_0x0016:
            r14 = r1
            goto L_0x001e
        L_0x0018:
            com.hansecom.abt.data.repositories.PaymentMethodsRepository$removePaymentMethod$1 r1 = new com.hansecom.abt.data.repositories.PaymentMethodsRepository$removePaymentMethod$1
            r1.<init>(r6, r0)
            goto L_0x0016
        L_0x001e:
            java.lang.Object r0 = r14.G
            java.lang.Object r15 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r1 = r14.I
            r13 = 4
            r7 = 3
            r8 = 2
            r9 = 1
            r12 = 0
            if (r1 == 0) goto L_0x0082
            if (r1 == r9) goto L_0x0073
            if (r1 == r8) goto L_0x0056
            if (r1 == r7) goto L_0x0046
            if (r1 != r13) goto L_0x003e
            java.lang.Object r1 = r14.C
            kotlin.Result r1 = (kotlin.Result) r1
            kotlin.ResultKt.b(r0)
            goto L_0x0144
        L_0x003e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0046:
            java.lang.Object r1 = r14.D
            kotlin.Result r1 = (kotlin.Result) r1
            java.lang.Object r2 = r14.C
            com.hansecom.abt.data.repositories.PaymentMethodsRepository r2 = (com.hansecom.abt.data.repositories.PaymentMethodsRepository) r2
            kotlin.ResultKt.b(r0)
            r3 = r2
            r2 = r12
            r0 = r13
            goto L_0x0137
        L_0x0056:
            long r1 = r14.F
            java.lang.Object r3 = r14.E
            com.hansecom.abt.data.repositories.base.BaseRepository r3 = (com.hansecom.abt.data.repositories.base.BaseRepository) r3
            java.lang.Object r4 = r14.D
            kotlin.Result r4 = (kotlin.Result) r4
            java.lang.Object r5 = r14.C
            com.hansecom.abt.data.repositories.PaymentMethodsRepository r5 = (com.hansecom.abt.data.repositories.PaymentMethodsRepository) r5
            kotlin.ResultKt.b(r0)
            kotlin.Result r0 = (kotlin.Result) r0
            java.lang.Object r0 = r0.j()
            r16 = r5
            r5 = r3
            r3 = r16
            goto L_0x00d5
        L_0x0073:
            long r1 = r14.F
            java.lang.Object r3 = r14.C
            com.hansecom.abt.data.repositories.PaymentMethodsRepository r3 = (com.hansecom.abt.data.repositories.PaymentMethodsRepository) r3
            kotlin.ResultKt.b(r0)
            r16 = r1
            r2 = r0
            r0 = r16
            goto L_0x00aa
        L_0x0082:
            kotlin.ResultKt.b(r0)
            com.hansecom.abt.api.JsonParser r0 = com.hansecom.abt.api.JsonParser.f33114a
            kotlinx.serialization.json.Json r1 = r0.c()
            kotlinx.coroutines.CoroutineDispatcher r10 = kotlinx.coroutines.Dispatchers.b()
            com.hansecom.abt.data.repositories.PaymentMethodsRepository$removePaymentMethod-gIAlu-s$$inlined$retrofit$default$1 r11 = new com.hansecom.abt.data.repositories.PaymentMethodsRepository$removePaymentMethod-gIAlu-s$$inlined$retrofit$default$1
            r2 = 0
            r0 = r11
            r3 = r18
            r4 = r19
            r0.<init>(r1, r2, r3, r4)
            r14.C = r6
            r0 = r19
            r14.F = r0
            r14.I = r9
            java.lang.Object r2 = kotlinx.coroutines.BuildersKt.g(r10, r11, r14)
            if (r2 != r15) goto L_0x00a9
            return r15
        L_0x00a9:
            r3 = r6
        L_0x00aa:
            kotlin.Result r2 = (kotlin.Result) r2
            java.lang.Object r2 = r2.j()
            kotlin.Result r4 = kotlin.Result.a(r2)
            java.lang.Object r2 = r4.j()
            boolean r2 = kotlin.Result.h(r2)
            if (r2 == 0) goto L_0x0145
            r14.C = r3
            r14.D = r4
            r14.E = r3
            r14.F = r0
            r14.I = r8
            java.lang.Object r2 = r3.i(r14)
            if (r2 != r15) goto L_0x00cf
            return r15
        L_0x00cf:
            r5 = r3
            r16 = r0
            r0 = r2
            r1 = r16
        L_0x00d5:
            boolean r8 = kotlin.Result.h(r0)
            if (r8 == 0) goto L_0x010d
            java.util.List r0 = (java.util.List) r0
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x00e8:
            boolean r9 = r0.hasNext()
            if (r9 == 0) goto L_0x0108
            java.lang.Object r9 = r0.next()
            r10 = r9
            com.hansecom.mapi.models.PaymentMethod r10 = (com.hansecom.mapi.models.PaymentMethod) r10
            java.lang.Long r10 = r10.e()
            if (r10 != 0) goto L_0x00fc
            goto L_0x0104
        L_0x00fc:
            long r10 = r10.longValue()
            int r10 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r10 == 0) goto L_0x00e8
        L_0x0104:
            r8.add(r9)
            goto L_0x00e8
        L_0x0108:
            java.lang.Object r0 = kotlin.Result.b(r8)
            goto L_0x0111
        L_0x010d:
            java.lang.Object r0 = kotlin.Result.b(r0)
        L_0x0111:
            boolean r1 = kotlin.Result.g(r0)
            if (r1 == 0) goto L_0x0119
            r8 = r12
            goto L_0x011a
        L_0x0119:
            r8 = r0
        L_0x011a:
            kotlin.jvm.internal.Intrinsics.f(r8)
            r14.C = r3
            r14.D = r4
            r14.E = r12
            r14.I = r7
            r9 = 0
            r10 = 0
            r0 = 6
            r1 = 0
            r7 = r5
            r11 = r14
            r2 = r12
            r12 = r0
            r0 = r13
            r13 = r1
            java.lang.Object r1 = com.hansecom.abt.data.repositories.base.BaseRepository.K(r7, r8, r9, r10, r11, r12, r13)
            if (r1 != r15) goto L_0x0136
            return r15
        L_0x0136:
            r1 = r4
        L_0x0137:
            r14.C = r1
            r14.D = r2
            r14.I = r0
            java.lang.Object r0 = r3.D(r14)
            if (r0 != r15) goto L_0x0144
            return r15
        L_0x0144:
            r4 = r1
        L_0x0145:
            java.lang.Object r0 = r4.j()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.data.repositories.PaymentMethodsRepository.P(long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object q(kotlin.coroutines.Continuation r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.hansecom.abt.data.repositories.PaymentMethodsRepository$getFreshData$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.hansecom.abt.data.repositories.PaymentMethodsRepository$getFreshData$1 r0 = (com.hansecom.abt.data.repositories.PaymentMethodsRepository$getFreshData$1) r0
            int r1 = r0.E
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.E = r1
            goto L_0x0018
        L_0x0013:
            com.hansecom.abt.data.repositories.PaymentMethodsRepository$getFreshData$1 r0 = new com.hansecom.abt.data.repositories.PaymentMethodsRepository$getFreshData$1
            r0.<init>(r6, r7)
        L_0x0018:
            java.lang.Object r7 = r0.C
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.E
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            kotlin.ResultKt.b(r7)
            goto L_0x004d
        L_0x0029:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x0031:
            kotlin.ResultKt.b(r7)
            com.hansecom.abt.api.JsonParser r7 = com.hansecom.abt.api.JsonParser.f33114a
            kotlinx.serialization.json.Json r7 = r7.c()
            kotlinx.coroutines.CoroutineDispatcher r2 = kotlinx.coroutines.Dispatchers.b()
            com.hansecom.abt.data.repositories.PaymentMethodsRepository$getFreshData-IoAF18A$$inlined$retrofit$default$1 r4 = new com.hansecom.abt.data.repositories.PaymentMethodsRepository$getFreshData-IoAF18A$$inlined$retrofit$default$1
            r5 = 0
            r4.<init>(r7, r5, r6)
            r0.E = r3
            java.lang.Object r7 = kotlinx.coroutines.BuildersKt.g(r2, r4, r0)
            if (r7 != r1) goto L_0x004d
            return r1
        L_0x004d:
            kotlin.Result r7 = (kotlin.Result) r7
            java.lang.Object r7 = r7.j()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.data.repositories.PaymentMethodsRepository.q(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
