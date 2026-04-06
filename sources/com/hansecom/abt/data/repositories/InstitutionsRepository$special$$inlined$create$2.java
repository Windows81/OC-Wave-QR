package com.hansecom.abt.data.repositories;

import com.hansecom.abt.data.preferences.base.DataStoreFileProducer;
import com.hansecom.abt.data.preferences.base.ValueLocalDataProvider;
import com.hansecom.mapi.models.Institution;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata
public final class InstitutionsRepository$special$$inlined$create$2 extends ValueLocalDataProvider<List<? extends Institution>> {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ InstitutionsRepository$special$$inlined$create$1 f33523f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InstitutionsRepository$special$$inlined$create$2(String str, DataStoreFileProducer dataStoreFileProducer, InstitutionsRepository$special$$inlined$create$1 institutionsRepository$special$$inlined$create$1) {
        super(str, dataStoreFileProducer);
        this.f33523f = institutionsRepository$special$$inlined$create$1;
    }

    public Function1 x() {
        return this.f33523f.a();
    }

    public Function1 y() {
        return this.f33523f.b();
    }
}
