package com.hansecom.abt.data.repositories.generalData;

import com.hansecom.abt.data.preferences.base.DataStoreFileProducer;
import com.hansecom.abt.data.preferences.base.HashMapLocalDataProvider;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata
public final class StatesRepository$special$$inlined$create$2 extends HashMapLocalDataProvider<Integer, List<? extends String>> {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ StatesRepository$special$$inlined$create$1 f33669f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StatesRepository$special$$inlined$create$2(String str, DataStoreFileProducer dataStoreFileProducer, StatesRepository$special$$inlined$create$1 statesRepository$special$$inlined$create$1) {
        super(str, dataStoreFileProducer);
        this.f33669f = statesRepository$special$$inlined$create$1;
    }

    public Function1 m() {
        return this.f33669f.a();
    }

    public Function1 n() {
        return this.f33669f.b();
    }
}
