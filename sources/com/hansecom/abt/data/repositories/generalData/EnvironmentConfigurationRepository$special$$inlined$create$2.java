package com.hansecom.abt.data.repositories.generalData;

import com.hansecom.abt.data.preferences.base.DataStoreFileProducer;
import com.hansecom.abt.data.preferences.base.ValueLocalDataProvider;
import com.hansecom.mapi.models.EnvironmentConfiguration;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata
public final class EnvironmentConfigurationRepository$special$$inlined$create$2 extends ValueLocalDataProvider<EnvironmentConfiguration> {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ EnvironmentConfigurationRepository$special$$inlined$create$1 f33624f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EnvironmentConfigurationRepository$special$$inlined$create$2(String str, DataStoreFileProducer dataStoreFileProducer, EnvironmentConfigurationRepository$special$$inlined$create$1 environmentConfigurationRepository$special$$inlined$create$1) {
        super(str, dataStoreFileProducer);
        this.f33624f = environmentConfigurationRepository$special$$inlined$create$1;
    }

    public Function1 x() {
        return this.f33624f.a();
    }

    public Function1 y() {
        return this.f33624f.b();
    }
}
