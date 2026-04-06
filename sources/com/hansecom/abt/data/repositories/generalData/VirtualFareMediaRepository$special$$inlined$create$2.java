package com.hansecom.abt.data.repositories.generalData;

import com.hansecom.abt.data.preferences.base.DataStoreFileProducer;
import com.hansecom.abt.data.preferences.base.ValueLocalDataProvider;
import com.hansecom.mapi.models.VirtualFareMedia;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata
public final class VirtualFareMediaRepository$special$$inlined$create$2 extends ValueLocalDataProvider<List<? extends VirtualFareMedia>> {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ VirtualFareMediaRepository$special$$inlined$create$1 f33680f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VirtualFareMediaRepository$special$$inlined$create$2(String str, DataStoreFileProducer dataStoreFileProducer, VirtualFareMediaRepository$special$$inlined$create$1 virtualFareMediaRepository$special$$inlined$create$1) {
        super(str, dataStoreFileProducer);
        this.f33680f = virtualFareMediaRepository$special$$inlined$create$1;
    }

    public Function1 x() {
        return this.f33680f.a();
    }

    public Function1 y() {
        return this.f33680f.b();
    }
}
