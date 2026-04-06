package com.hansecom.abt.data.repositories.generalData;

import com.hansecom.abt.data.preferences.base.DataStoreFileProducer;
import com.hansecom.abt.data.preferences.base.HashMapLocalDataProvider;
import com.hansecom.mapi.models.FareProductOffer;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata
public final class FareMediaPassesToOfferRepository$special$$inlined$create$2 extends HashMapLocalDataProvider<String, List<? extends FareProductOffer>> {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ FareMediaPassesToOfferRepository$special$$inlined$create$1 f33646f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FareMediaPassesToOfferRepository$special$$inlined$create$2(String str, DataStoreFileProducer dataStoreFileProducer, FareMediaPassesToOfferRepository$special$$inlined$create$1 fareMediaPassesToOfferRepository$special$$inlined$create$1) {
        super(str, dataStoreFileProducer);
        this.f33646f = fareMediaPassesToOfferRepository$special$$inlined$create$1;
    }

    public Function1 m() {
        return this.f33646f.a();
    }

    public Function1 n() {
        return this.f33646f.b();
    }
}
