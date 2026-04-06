package com.hansecom.abt.data.repositories;

import com.hansecom.abt.data.preferences.base.DataStoreFileProducer;
import com.hansecom.abt.data.preferences.base.HashMapLocalDataProvider;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata
public final class FareMediaTransferTimeRepository$special$$inlined$create$2 extends HashMapLocalDataProvider<String, String> {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ FareMediaTransferTimeRepository$special$$inlined$create$1 f33511f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FareMediaTransferTimeRepository$special$$inlined$create$2(String str, DataStoreFileProducer dataStoreFileProducer, FareMediaTransferTimeRepository$special$$inlined$create$1 fareMediaTransferTimeRepository$special$$inlined$create$1) {
        super(str, dataStoreFileProducer);
        this.f33511f = fareMediaTransferTimeRepository$special$$inlined$create$1;
    }

    public Function1 m() {
        return this.f33511f.a();
    }

    public Function1 n() {
        return this.f33511f.b();
    }
}
