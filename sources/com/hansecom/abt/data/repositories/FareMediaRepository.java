package com.hansecom.abt.data.repositories;

import com.hansecom.abt.data.deviceInfo.DeviceInfo;
import com.hansecom.abt.data.repositories.base.ValueRepository;
import com.hansecom.mapi.apis.UserFareMediaApi;
import com.hansecom.mapi.models.FareMedium;
import java.util.List;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

@Singleton
@Metadata
public final class FareMediaRepository extends ValueRepository<List<? extends FareMedium>> {

    /* renamed from: k  reason: collision with root package name */
    public final DeviceInfo f33486k;

    /* renamed from: l  reason: collision with root package name */
    public final UserFareMediaApi f33487l;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public FareMediaRepository(com.hansecom.abt.data.deviceInfo.DeviceInfo r6, com.hansecom.mapi.apis.UserFareMediaApi r7, kotlinx.serialization.json.Json r8, com.hansecom.abt.data.preferences.base.DataStoreFileProducer r9) {
        /*
            r5 = this;
            java.lang.String r0 = "deviceInfo"
            kotlin.jvm.internal.Intrinsics.i(r6, r0)
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
            com.hansecom.abt.data.preferences.base.ValueLocalDataProvider$Companion r2 = com.hansecom.abt.data.preferences.base.ValueLocalDataProvider.f33368d
            r8.a()
            com.hansecom.abt.data.preferences.base.CacheValue$Companion r2 = com.hansecom.abt.data.preferences.base.CacheValue.Companion
            kotlinx.serialization.internal.ArrayListSerializer r3 = new kotlinx.serialization.internal.ArrayListSerializer
            com.hansecom.mapi.models.FareMedium$Companion r4 = com.hansecom.mapi.models.FareMedium.Companion
            kotlinx.serialization.KSerializer r4 = r4.serializer()
            r3.<init>(r4)
            kotlinx.serialization.KSerializer r2 = r2.serializer(r3)
            com.hansecom.abt.data.repositories.FareMediaRepository$special$$inlined$create$1 r3 = new com.hansecom.abt.data.repositories.FareMediaRepository$special$$inlined$create$1
            r3.<init>(r8, r2)
            com.hansecom.abt.data.repositories.FareMediaRepository$special$$inlined$create$2 r8 = new com.hansecom.abt.data.repositories.FareMediaRepository$special$$inlined$create$2
            java.lang.String r2 = "FareMedia"
            r8.<init>(r2, r9, r3)
            r5.<init>(r1, r0, r8)
            r5.f33486k = r6
            r5.f33487l = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.data.repositories.FareMediaRepository.<init>(com.hansecom.abt.data.deviceInfo.DeviceInfo, com.hansecom.mapi.apis.UserFareMediaApi, kotlinx.serialization.json.Json, com.hansecom.abt.data.preferences.base.DataStoreFileProducer):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object N(java.lang.String r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.hansecom.abt.data.repositories.FareMediaRepository$getFareMedia$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.hansecom.abt.data.repositories.FareMediaRepository$getFareMedia$1 r0 = (com.hansecom.abt.data.repositories.FareMediaRepository$getFareMedia$1) r0
            int r1 = r0.F
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.F = r1
            goto L_0x0018
        L_0x0013:
            com.hansecom.abt.data.repositories.FareMediaRepository$getFareMedia$1 r0 = new com.hansecom.abt.data.repositories.FareMediaRepository$getFareMedia$1
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.D
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.F
            r3 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            java.lang.Object r5 = r0.C
            java.lang.String r5 = (java.lang.String) r5
            kotlin.ResultKt.b(r6)
            kotlin.Result r6 = (kotlin.Result) r6
            java.lang.Object r6 = r6.j()
            goto L_0x0049
        L_0x0033:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x003b:
            kotlin.ResultKt.b(r6)
            r0.C = r5
            r0.F = r3
            java.lang.Object r6 = r4.i(r0)
            if (r6 != r1) goto L_0x0049
            return r1
        L_0x0049:
            boolean r0 = kotlin.Result.h(r6)
            if (r0 == 0) goto L_0x007a
            java.util.List r6 = (java.util.List) r6
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r6 = r6.iterator()
        L_0x0057:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0072
            java.lang.Object r0 = r6.next()
            com.hansecom.mapi.models.FareMedium r0 = (com.hansecom.mapi.models.FareMedium) r0
            java.lang.String r1 = r0.f()
            boolean r1 = kotlin.jvm.internal.Intrinsics.d(r1, r5)
            if (r1 == 0) goto L_0x0057
            java.lang.Object r5 = kotlin.Result.b(r0)
            goto L_0x007e
        L_0x0072:
            java.util.NoSuchElementException r5 = new java.util.NoSuchElementException
            java.lang.String r6 = "Collection contains no element matching the predicate."
            r5.<init>(r6)
            throw r5
        L_0x007a:
            java.lang.Object r5 = kotlin.Result.b(r6)
        L_0x007e:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.data.repositories.FareMediaRepository.N(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Flow O(String str) {
        Intrinsics.i(str, "fareMediaId");
        return new FareMediaRepository$getFareMediaFlow$$inlined$map$1(p(), str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object q(kotlin.coroutines.Continuation r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.hansecom.abt.data.repositories.FareMediaRepository$getFreshData$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.hansecom.abt.data.repositories.FareMediaRepository$getFreshData$1 r0 = (com.hansecom.abt.data.repositories.FareMediaRepository$getFreshData$1) r0
            int r1 = r0.E
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.E = r1
            goto L_0x0018
        L_0x0013:
            com.hansecom.abt.data.repositories.FareMediaRepository$getFreshData$1 r0 = new com.hansecom.abt.data.repositories.FareMediaRepository$getFreshData$1
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
            com.hansecom.abt.data.repositories.FareMediaRepository$getFreshData-IoAF18A$$inlined$retrofit$default$1 r4 = new com.hansecom.abt.data.repositories.FareMediaRepository$getFreshData-IoAF18A$$inlined$retrofit$default$1
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
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.data.repositories.FareMediaRepository.q(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
