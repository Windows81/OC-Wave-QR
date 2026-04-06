package com.hansecom.abt.data.repositories;

import com.hansecom.abt.data.preferences.base.DataStoreFileProducer;
import com.hansecom.abt.data.preferences.base.HashMapLocalDataProvider;
import com.hansecom.mapi.models.FareMediaAutoload;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata
public final class AutoloadRepository$special$$inlined$create$2 extends HashMapLocalDataProvider<String, List<? extends FareMediaAutoload>> {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ AutoloadRepository$special$$inlined$create$1 f33400f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AutoloadRepository$special$$inlined$create$2(String str, DataStoreFileProducer dataStoreFileProducer, AutoloadRepository$special$$inlined$create$1 autoloadRepository$special$$inlined$create$1) {
        super(str, dataStoreFileProducer);
        this.f33400f = autoloadRepository$special$$inlined$create$1;
    }

    public Function1 m() {
        return this.f33400f.a();
    }

    public Function1 n() {
        return this.f33400f.b();
    }
}
