package com.hansecom.abt.data.repositories.generalData;

import com.hansecom.abt.data.preferences.base.DataStoreFileProducer;
import com.hansecom.mapi.apis.ConfigurationApi;
import dagger.internal.Factory;
import dagger.internal.Provider;
import kotlinx.serialization.json.Json;

public final class EnvironmentConfigurationRepository_Factory implements Factory<EnvironmentConfigurationRepository> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f33625a;

    /* renamed from: b  reason: collision with root package name */
    public final Provider f33626b;

    /* renamed from: c  reason: collision with root package name */
    public final Provider f33627c;

    public static EnvironmentConfigurationRepository b(ConfigurationApi configurationApi, Json json, DataStoreFileProducer dataStoreFileProducer) {
        return new EnvironmentConfigurationRepository(configurationApi, json, dataStoreFileProducer);
    }

    /* renamed from: a */
    public EnvironmentConfigurationRepository get() {
        return b((ConfigurationApi) this.f33625a.get(), (Json) this.f33626b.get(), (DataStoreFileProducer) this.f33627c.get());
    }
}
