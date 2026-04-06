package com.hansecom.abt.data.repositories;

import com.hansecom.abt.data.repositories.base.MultipleValueRepository;
import com.hansecom.mapi.apis.UserFareMediaApi;
import com.hansecom.mapi.models.FareMediumConfigurations;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

@Singleton
@Metadata
public final class FareMediaConfigRepository extends MultipleValueRepository<String, FareMediumConfigurations> {

    /* renamed from: f  reason: collision with root package name */
    public final UserFareMediaApi f33439f;

    /* renamed from: g  reason: collision with root package name */
    public final Function2 f33440g = new FareMediaConfigRepository$getFreshData$1(this, (Continuation) null);

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public FareMediaConfigRepository(com.hansecom.mapi.apis.UserFareMediaApi r7, kotlinx.serialization.json.Json r8, com.hansecom.abt.data.preferences.base.DataStoreFileProducer r9) {
        /*
            r6 = this;
            java.lang.String r0 = "userFareMediaApi"
            kotlin.jvm.internal.Intrinsics.i(r7, r0)
            java.lang.String r0 = "json"
            kotlin.jvm.internal.Intrinsics.i(r8, r0)
            java.lang.String r0 = "dataStoreFileProducer"
            kotlin.jvm.internal.Intrinsics.i(r9, r0)
            com.hansecom.abt.data.preferences.base.Seconds$Companion r0 = com.hansecom.abt.data.preferences.base.Seconds.f33366b
            r1 = 15
            com.hansecom.abt.data.preferences.base.Seconds r3 = r0.c(r1)
            com.hansecom.abt.data.preferences.base.Seconds r0 = r0.a(r1)
            com.hansecom.abt.data.preferences.base.HashMapLocalDataProvider$Companion r1 = com.hansecom.abt.data.preferences.base.HashMapLocalDataProvider.f33346d
            r8.a()
            kotlinx.serialization.internal.LinkedHashMapSerializer r1 = new kotlinx.serialization.internal.LinkedHashMapSerializer
            kotlinx.serialization.internal.StringSerializer r2 = kotlinx.serialization.internal.StringSerializer.f42197a
            com.hansecom.abt.data.preferences.base.CacheValue$Companion r4 = com.hansecom.abt.data.preferences.base.CacheValue.Companion
            com.hansecom.mapi.models.FareMediumConfigurations$Companion r5 = com.hansecom.mapi.models.FareMediumConfigurations.Companion
            kotlinx.serialization.KSerializer r5 = r5.serializer()
            kotlinx.serialization.KSerializer r4 = r4.serializer(r5)
            kotlinx.serialization.KSerializer r4 = kotlinx.serialization.builtins.BuiltinSerializersKt.u(r4)
            r1.<init>(r2, r4)
            com.hansecom.abt.data.repositories.FareMediaConfigRepository$special$$inlined$create$1 r2 = new com.hansecom.abt.data.repositories.FareMediaConfigRepository$special$$inlined$create$1
            r2.<init>(r8, r1)
            com.hansecom.abt.data.repositories.FareMediaConfigRepository$special$$inlined$create$2 r8 = new com.hansecom.abt.data.repositories.FareMediaConfigRepository$special$$inlined$create$2
            java.lang.String r1 = "FareMediaConfig"
            r8.<init>(r1, r9, r2)
            r6.<init>(r3, r0, r8)
            r6.f33439f = r7
            com.hansecom.abt.data.repositories.FareMediaConfigRepository$getFreshData$1 r7 = new com.hansecom.abt.data.repositories.FareMediaConfigRepository$getFreshData$1
            r8 = 0
            r7.<init>(r6, r8)
            r6.f33440g = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.data.repositories.FareMediaConfigRepository.<init>(com.hansecom.mapi.apis.UserFareMediaApi, kotlinx.serialization.json.Json, com.hansecom.abt.data.preferences.base.DataStoreFileProducer):void");
    }

    public Function2 j() {
        return this.f33440g;
    }
}
