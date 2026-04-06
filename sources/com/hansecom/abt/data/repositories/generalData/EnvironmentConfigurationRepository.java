package com.hansecom.abt.data.repositories.generalData;

import com.hansecom.abt.data.repositories.base.ValueRepository;
import com.hansecom.mapi.apis.ConfigurationApi;
import com.hansecom.mapi.models.EnvironmentConfiguration;
import javax.inject.Singleton;
import kotlin.Metadata;

@Singleton
@Metadata
public final class EnvironmentConfigurationRepository extends ValueRepository<EnvironmentConfiguration> {

    /* renamed from: k  reason: collision with root package name */
    public final ConfigurationApi f33617k;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public EnvironmentConfigurationRepository(com.hansecom.mapi.apis.ConfigurationApi r5, kotlinx.serialization.json.Json r6, com.hansecom.abt.data.preferences.base.DataStoreFileProducer r7) {
        /*
            r4 = this;
            java.lang.String r0 = "api"
            kotlin.jvm.internal.Intrinsics.i(r5, r0)
            java.lang.String r0 = "json"
            kotlin.jvm.internal.Intrinsics.i(r6, r0)
            java.lang.String r0 = "dataStoreFileProducer"
            kotlin.jvm.internal.Intrinsics.i(r7, r0)
            com.hansecom.abt.data.preferences.base.Seconds$Companion r0 = com.hansecom.abt.data.preferences.base.Seconds.f33366b
            r1 = 15
            com.hansecom.abt.data.preferences.base.Seconds r3 = r0.c(r1)
            com.hansecom.abt.data.preferences.base.Seconds r0 = r0.a(r1)
            com.hansecom.abt.data.preferences.base.ValueLocalDataProvider$Companion r1 = com.hansecom.abt.data.preferences.base.ValueLocalDataProvider.f33368d
            r6.a()
            com.hansecom.abt.data.preferences.base.CacheValue$Companion r1 = com.hansecom.abt.data.preferences.base.CacheValue.Companion
            com.hansecom.mapi.models.EnvironmentConfiguration$Companion r2 = com.hansecom.mapi.models.EnvironmentConfiguration.Companion
            kotlinx.serialization.KSerializer r2 = r2.serializer()
            kotlinx.serialization.KSerializer r1 = r1.serializer(r2)
            com.hansecom.abt.data.repositories.generalData.EnvironmentConfigurationRepository$special$$inlined$create$1 r2 = new com.hansecom.abt.data.repositories.generalData.EnvironmentConfigurationRepository$special$$inlined$create$1
            r2.<init>(r6, r1)
            com.hansecom.abt.data.repositories.generalData.EnvironmentConfigurationRepository$special$$inlined$create$2 r6 = new com.hansecom.abt.data.repositories.generalData.EnvironmentConfigurationRepository$special$$inlined$create$2
            java.lang.String r1 = "EnvironmentConfiguration"
            r6.<init>(r1, r7, r2)
            r4.<init>(r3, r0, r6)
            r4.f33617k = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.data.repositories.generalData.EnvironmentConfigurationRepository.<init>(com.hansecom.mapi.apis.ConfigurationApi, kotlinx.serialization.json.Json, com.hansecom.abt.data.preferences.base.DataStoreFileProducer):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object q(kotlin.coroutines.Continuation r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.hansecom.abt.data.repositories.generalData.EnvironmentConfigurationRepository$getFreshData$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.hansecom.abt.data.repositories.generalData.EnvironmentConfigurationRepository$getFreshData$1 r0 = (com.hansecom.abt.data.repositories.generalData.EnvironmentConfigurationRepository$getFreshData$1) r0
            int r1 = r0.E
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.E = r1
            goto L_0x0018
        L_0x0013:
            com.hansecom.abt.data.repositories.generalData.EnvironmentConfigurationRepository$getFreshData$1 r0 = new com.hansecom.abt.data.repositories.generalData.EnvironmentConfigurationRepository$getFreshData$1
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
            com.hansecom.abt.data.repositories.generalData.EnvironmentConfigurationRepository$getFreshData-IoAF18A$$inlined$retrofit$default$1 r4 = new com.hansecom.abt.data.repositories.generalData.EnvironmentConfigurationRepository$getFreshData-IoAF18A$$inlined$retrofit$default$1
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
        throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.data.repositories.generalData.EnvironmentConfigurationRepository.q(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
