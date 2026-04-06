package com.hansecom.abt.data.repositories;

import com.hansecom.abt.data.preferences.base.DataStoreFileProducer;
import com.hansecom.abt.data.preferences.base.ValueLocalDataProvider;
import com.hansecom.mapi.models.FareMedium;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata
public final class FareMediaRepository$special$$inlined$create$2 extends ValueLocalDataProvider<List<? extends FareMedium>> {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ FareMediaRepository$special$$inlined$create$1 f33498f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FareMediaRepository$special$$inlined$create$2(String str, DataStoreFileProducer dataStoreFileProducer, FareMediaRepository$special$$inlined$create$1 fareMediaRepository$special$$inlined$create$1) {
        super(str, dataStoreFileProducer);
        this.f33498f = fareMediaRepository$special$$inlined$create$1;
    }

    public Function1 x() {
        return this.f33498f.a();
    }

    public Function1 y() {
        return this.f33498f.b();
    }
}
