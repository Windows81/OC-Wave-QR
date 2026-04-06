package com.hansecom.abt.data.repositories.generalData;

import com.hansecom.abt.data.repositories.base.ValueRepository;
import com.hansecom.mapi.apis.GeneralDataApi;
import com.hansecom.mapi.models.Country;
import java.util.List;
import javax.inject.Singleton;
import kotlin.Metadata;

@Singleton
@Metadata
public final class CountriesRepository extends ValueRepository<List<? extends Country>> {

    /* renamed from: k  reason: collision with root package name */
    public final GeneralDataApi f33606k;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public CountriesRepository(com.hansecom.mapi.apis.GeneralDataApi r6, kotlinx.serialization.json.Json r7, com.hansecom.abt.data.preferences.base.DataStoreFileProducer r8) {
        /*
            r5 = this;
            java.lang.String r0 = "api"
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
            com.hansecom.mapi.models.Country$Companion r4 = com.hansecom.mapi.models.Country.Companion
            kotlinx.serialization.KSerializer r4 = r4.serializer()
            r2.<init>(r4)
            kotlinx.serialization.KSerializer r1 = r1.serializer(r2)
            com.hansecom.abt.data.repositories.generalData.CountriesRepository$special$$inlined$create$1 r2 = new com.hansecom.abt.data.repositories.generalData.CountriesRepository$special$$inlined$create$1
            r2.<init>(r7, r1)
            com.hansecom.abt.data.repositories.generalData.CountriesRepository$special$$inlined$create$2 r7 = new com.hansecom.abt.data.repositories.generalData.CountriesRepository$special$$inlined$create$2
            java.lang.String r1 = "Countries"
            r7.<init>(r1, r8, r2)
            r5.<init>(r3, r0, r7)
            r5.f33606k = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.data.repositories.generalData.CountriesRepository.<init>(com.hansecom.mapi.apis.GeneralDataApi, kotlinx.serialization.json.Json, com.hansecom.abt.data.preferences.base.DataStoreFileProducer):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object q(kotlin.coroutines.Continuation r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.hansecom.abt.data.repositories.generalData.CountriesRepository$getFreshData$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.hansecom.abt.data.repositories.generalData.CountriesRepository$getFreshData$1 r0 = (com.hansecom.abt.data.repositories.generalData.CountriesRepository$getFreshData$1) r0
            int r1 = r0.E
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.E = r1
            goto L_0x0018
        L_0x0013:
            com.hansecom.abt.data.repositories.generalData.CountriesRepository$getFreshData$1 r0 = new com.hansecom.abt.data.repositories.generalData.CountriesRepository$getFreshData$1
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
            com.hansecom.abt.data.repositories.generalData.CountriesRepository$getFreshData-IoAF18A$$inlined$retrofit$default$1 r4 = new com.hansecom.abt.data.repositories.generalData.CountriesRepository$getFreshData-IoAF18A$$inlined$retrofit$default$1
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
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.data.repositories.generalData.CountriesRepository.q(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
