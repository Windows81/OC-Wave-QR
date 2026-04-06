package com.hansecom.abt.data.repositories.generalData;

import com.hansecom.abt.data.preferences.base.DataStoreFileProducer;
import com.hansecom.abt.data.preferences.base.ValueLocalDataProvider;
import com.hansecom.mapi.models.FareCategory;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata
public final class FareMediaCategoriesRepository$special$$inlined$create$2 extends ValueLocalDataProvider<List<? extends FareCategory>> {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ FareMediaCategoriesRepository$special$$inlined$create$1 f33635f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FareMediaCategoriesRepository$special$$inlined$create$2(String str, DataStoreFileProducer dataStoreFileProducer, FareMediaCategoriesRepository$special$$inlined$create$1 fareMediaCategoriesRepository$special$$inlined$create$1) {
        super(str, dataStoreFileProducer);
        this.f33635f = fareMediaCategoriesRepository$special$$inlined$create$1;
    }

    public Function1 x() {
        return this.f33635f.a();
    }

    public Function1 y() {
        return this.f33635f.b();
    }
}
