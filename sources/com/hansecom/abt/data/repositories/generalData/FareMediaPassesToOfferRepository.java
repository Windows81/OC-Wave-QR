package com.hansecom.abt.data.repositories.generalData;

import com.hansecom.abt.data.repositories.base.MultipleValueRepository;
import com.hansecom.mapi.apis.GeneralDataApi;
import com.hansecom.mapi.models.FareProductOffer;
import java.util.List;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

@Singleton
@Metadata
public final class FareMediaPassesToOfferRepository extends MultipleValueRepository<String, List<? extends FareProductOffer>> {

    /* renamed from: f  reason: collision with root package name */
    public final GeneralDataApi f33639f;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public FareMediaPassesToOfferRepository(com.hansecom.mapi.apis.GeneralDataApi r8, kotlinx.serialization.json.Json r9, com.hansecom.abt.data.preferences.base.DataStoreFileProducer r10) {
        /*
            r7 = this;
            java.lang.String r0 = "api"
            kotlin.jvm.internal.Intrinsics.i(r8, r0)
            java.lang.String r0 = "json"
            kotlin.jvm.internal.Intrinsics.i(r9, r0)
            java.lang.String r0 = "dataStoreFileProducer"
            kotlin.jvm.internal.Intrinsics.i(r10, r0)
            com.hansecom.abt.data.preferences.base.Seconds$Companion r0 = com.hansecom.abt.data.preferences.base.Seconds.f33366b
            r1 = 15
            com.hansecom.abt.data.preferences.base.Seconds r3 = r0.c(r1)
            com.hansecom.abt.data.preferences.base.Seconds r0 = r0.a(r1)
            com.hansecom.abt.data.preferences.base.HashMapLocalDataProvider$Companion r1 = com.hansecom.abt.data.preferences.base.HashMapLocalDataProvider.f33346d
            r9.a()
            kotlinx.serialization.internal.LinkedHashMapSerializer r1 = new kotlinx.serialization.internal.LinkedHashMapSerializer
            kotlinx.serialization.internal.StringSerializer r2 = kotlinx.serialization.internal.StringSerializer.f42197a
            com.hansecom.abt.data.preferences.base.CacheValue$Companion r4 = com.hansecom.abt.data.preferences.base.CacheValue.Companion
            kotlinx.serialization.internal.ArrayListSerializer r5 = new kotlinx.serialization.internal.ArrayListSerializer
            com.hansecom.mapi.models.FareProductOffer$Companion r6 = com.hansecom.mapi.models.FareProductOffer.Companion
            kotlinx.serialization.KSerializer r6 = r6.serializer()
            r5.<init>(r6)
            kotlinx.serialization.KSerializer r4 = r4.serializer(r5)
            kotlinx.serialization.KSerializer r4 = kotlinx.serialization.builtins.BuiltinSerializersKt.u(r4)
            r1.<init>(r2, r4)
            com.hansecom.abt.data.repositories.generalData.FareMediaPassesToOfferRepository$special$$inlined$create$1 r2 = new com.hansecom.abt.data.repositories.generalData.FareMediaPassesToOfferRepository$special$$inlined$create$1
            r2.<init>(r9, r1)
            com.hansecom.abt.data.repositories.generalData.FareMediaPassesToOfferRepository$special$$inlined$create$2 r9 = new com.hansecom.abt.data.repositories.generalData.FareMediaPassesToOfferRepository$special$$inlined$create$2
            java.lang.String r1 = "FareMediaPassesToOffer"
            r9.<init>(r1, r10, r2)
            r7.<init>(r3, r0, r9)
            r7.f33639f = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.data.repositories.generalData.FareMediaPassesToOfferRepository.<init>(com.hansecom.mapi.apis.GeneralDataApi, kotlinx.serialization.json.Json, com.hansecom.abt.data.preferences.base.DataStoreFileProducer):void");
    }

    public Function2 j() {
        return new FareMediaPassesToOfferRepository$getFreshData$1(this, (Continuation) null);
    }
}
