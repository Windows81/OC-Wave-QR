package com.hansecom.abt.data.repositories;

import com.hansecom.abt.data.preferences.base.DataStoreFileProducer;
import com.hansecom.abt.data.preferences.base.ValueLocalDataProvider;
import com.hansecom.mapi.models.PrivKey;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata
public final class FareMediaKeysRepository$special$$inlined$create$2 extends ValueLocalDataProvider<List<? extends PrivKey>> {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ FareMediaKeysRepository$special$$inlined$create$1 f33470f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FareMediaKeysRepository$special$$inlined$create$2(String str, DataStoreFileProducer dataStoreFileProducer, FareMediaKeysRepository$special$$inlined$create$1 fareMediaKeysRepository$special$$inlined$create$1) {
        super(str, dataStoreFileProducer);
        this.f33470f = fareMediaKeysRepository$special$$inlined$create$1;
    }

    public Function1 x() {
        return this.f33470f.a();
    }

    public Function1 y() {
        return this.f33470f.b();
    }
}
