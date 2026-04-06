package com.hansecom.abt.data.repositories;

import com.hansecom.abt.data.preferences.base.DataStoreFileProducer;
import com.hansecom.abt.data.preferences.base.HashMapLocalDataProvider;
import com.hansecom.mapi.models.FareMediumConfigurations;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata
public final class FareMediaConfigRepository$special$$inlined$create$2 extends HashMapLocalDataProvider<String, FareMediumConfigurations> {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ FareMediaConfigRepository$special$$inlined$create$1 f33447f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FareMediaConfigRepository$special$$inlined$create$2(String str, DataStoreFileProducer dataStoreFileProducer, FareMediaConfigRepository$special$$inlined$create$1 fareMediaConfigRepository$special$$inlined$create$1) {
        super(str, dataStoreFileProducer);
        this.f33447f = fareMediaConfigRepository$special$$inlined$create$1;
    }

    public Function1 m() {
        return this.f33447f.a();
    }

    public Function1 n() {
        return this.f33447f.b();
    }
}
