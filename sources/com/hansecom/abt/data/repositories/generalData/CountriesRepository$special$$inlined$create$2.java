package com.hansecom.abt.data.repositories.generalData;

import com.hansecom.abt.data.preferences.base.DataStoreFileProducer;
import com.hansecom.abt.data.preferences.base.ValueLocalDataProvider;
import com.hansecom.mapi.models.Country;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata
public final class CountriesRepository$special$$inlined$create$2 extends ValueLocalDataProvider<List<? extends Country>> {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ CountriesRepository$special$$inlined$create$1 f33613f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CountriesRepository$special$$inlined$create$2(String str, DataStoreFileProducer dataStoreFileProducer, CountriesRepository$special$$inlined$create$1 countriesRepository$special$$inlined$create$1) {
        super(str, dataStoreFileProducer);
        this.f33613f = countriesRepository$special$$inlined$create$1;
    }

    public Function1 x() {
        return this.f33613f.a();
    }

    public Function1 y() {
        return this.f33613f.b();
    }
}
