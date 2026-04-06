package com.hansecom.abt.data.repositories;

import com.hansecom.abt.data.preferences.base.DataStoreFileProducer;
import com.hansecom.abt.data.preferences.base.HashMapLocalDataProvider;
import com.hansecom.mapi.models.CappingPot;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata
public final class FareCappingRepository$special$$inlined$create$2 extends HashMapLocalDataProvider<String, List<? extends CappingPot>> {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ FareCappingRepository$special$$inlined$create$1 f33435f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FareCappingRepository$special$$inlined$create$2(String str, DataStoreFileProducer dataStoreFileProducer, FareCappingRepository$special$$inlined$create$1 fareCappingRepository$special$$inlined$create$1) {
        super(str, dataStoreFileProducer);
        this.f33435f = fareCappingRepository$special$$inlined$create$1;
    }

    public Function1 m() {
        return this.f33435f.a();
    }

    public Function1 n() {
        return this.f33435f.b();
    }
}
