package com.hansecom.abt.data.repositories;

import com.hansecom.abt.data.repositories.base.MultipleValueRepository;
import com.hansecom.mapi.apis.UserFareMediaApi;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;

@Singleton
@Metadata
public final class FareMediaTransferTimeRepository extends MultipleValueRepository<String, String> {

    /* renamed from: f  reason: collision with root package name */
    public final UserFareMediaApi f33503f;

    /* renamed from: g  reason: collision with root package name */
    public final Function2 f33504g;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public FareMediaTransferTimeRepository(com.hansecom.mapi.apis.UserFareMediaApi r6, com.hansecom.abt.AppFeatures r7, kotlinx.serialization.json.Json r8, com.hansecom.abt.data.preferences.base.DataStoreFileProducer r9) {
        /*
            r5 = this;
            java.lang.String r0 = "userFareMediaApi"
            kotlin.jvm.internal.Intrinsics.i(r6, r0)
            java.lang.String r0 = "appFeatures"
            kotlin.jvm.internal.Intrinsics.i(r7, r0)
            java.lang.String r0 = "json"
            kotlin.jvm.internal.Intrinsics.i(r8, r0)
            java.lang.String r0 = "dataStoreFileProducer"
            kotlin.jvm.internal.Intrinsics.i(r9, r0)
            com.hansecom.abt.data.preferences.base.Seconds$Companion r0 = com.hansecom.abt.data.preferences.base.Seconds.f33366b
            r1 = 1
            com.hansecom.abt.data.preferences.base.Seconds r1 = r0.c(r1)
            r2 = 3
            com.hansecom.abt.data.preferences.base.Seconds r0 = r0.b(r2)
            com.hansecom.abt.data.preferences.base.HashMapLocalDataProvider$Companion r2 = com.hansecom.abt.data.preferences.base.HashMapLocalDataProvider.f33346d
            r8.a()
            kotlinx.serialization.internal.LinkedHashMapSerializer r2 = new kotlinx.serialization.internal.LinkedHashMapSerializer
            kotlinx.serialization.internal.StringSerializer r3 = kotlinx.serialization.internal.StringSerializer.f42197a
            com.hansecom.abt.data.preferences.base.CacheValue$Companion r4 = com.hansecom.abt.data.preferences.base.CacheValue.Companion
            kotlinx.serialization.KSerializer r4 = r4.serializer(r3)
            kotlinx.serialization.KSerializer r4 = kotlinx.serialization.builtins.BuiltinSerializersKt.u(r4)
            r2.<init>(r3, r4)
            com.hansecom.abt.data.repositories.FareMediaTransferTimeRepository$special$$inlined$create$1 r3 = new com.hansecom.abt.data.repositories.FareMediaTransferTimeRepository$special$$inlined$create$1
            r3.<init>(r8, r2)
            com.hansecom.abt.data.repositories.FareMediaTransferTimeRepository$special$$inlined$create$2 r8 = new com.hansecom.abt.data.repositories.FareMediaTransferTimeRepository$special$$inlined$create$2
            java.lang.String r2 = "FareMediaTransferTime"
            r8.<init>(r2, r9, r3)
            r5.<init>(r1, r0, r8)
            r5.f33503f = r6
            com.hansecom.abt.data.repositories.FareMediaTransferTimeRepository$getFreshData$1 r6 = new com.hansecom.abt.data.repositories.FareMediaTransferTimeRepository$getFreshData$1
            r8 = 0
            r6.<init>(r7, r5, r8)
            r5.f33504g = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.data.repositories.FareMediaTransferTimeRepository.<init>(com.hansecom.mapi.apis.UserFareMediaApi, com.hansecom.abt.AppFeatures, kotlinx.serialization.json.Json, com.hansecom.abt.data.preferences.base.DataStoreFileProducer):void");
    }

    public Function2 j() {
        return this.f33504g;
    }
}
