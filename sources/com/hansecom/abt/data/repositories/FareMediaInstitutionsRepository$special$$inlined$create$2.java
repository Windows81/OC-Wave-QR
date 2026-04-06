package com.hansecom.abt.data.repositories;

import com.hansecom.abt.data.preferences.base.DataStoreFileProducer;
import com.hansecom.abt.data.preferences.base.HashMapLocalDataProvider;
import com.hansecom.mapi.models.Institution;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata
public final class FareMediaInstitutionsRepository$special$$inlined$create$2 extends HashMapLocalDataProvider<String, List<? extends Institution>> {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ FareMediaInstitutionsRepository$special$$inlined$create$1 f33459f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FareMediaInstitutionsRepository$special$$inlined$create$2(String str, DataStoreFileProducer dataStoreFileProducer, FareMediaInstitutionsRepository$special$$inlined$create$1 fareMediaInstitutionsRepository$special$$inlined$create$1) {
        super(str, dataStoreFileProducer);
        this.f33459f = fareMediaInstitutionsRepository$special$$inlined$create$1;
    }

    public Function1 m() {
        return this.f33459f.a();
    }

    public Function1 n() {
        return this.f33459f.b();
    }
}
