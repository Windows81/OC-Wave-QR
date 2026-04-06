package com.hansecom.abt.data.repositories;

import com.hansecom.abt.data.preferences.base.DataStoreFileProducer;
import com.hansecom.abt.data.preferences.base.HashMapLocalDataProvider;
import com.hansecom.mapi.models.FareProduct;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata
public final class FareMediaPassesRepository$special$$inlined$create$2 extends HashMapLocalDataProvider<String, List<? extends FareProduct>> {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ FareMediaPassesRepository$special$$inlined$create$1 f33482f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FareMediaPassesRepository$special$$inlined$create$2(String str, DataStoreFileProducer dataStoreFileProducer, FareMediaPassesRepository$special$$inlined$create$1 fareMediaPassesRepository$special$$inlined$create$1) {
        super(str, dataStoreFileProducer);
        this.f33482f = fareMediaPassesRepository$special$$inlined$create$1;
    }

    public Function1 m() {
        return this.f33482f.a();
    }

    public Function1 n() {
        return this.f33482f.b();
    }
}
