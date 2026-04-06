package com.hansecom.abt.data.repositories;

import com.hansecom.abt.data.preferences.base.DataStoreFileProducer;
import com.hansecom.abt.data.preferences.base.HashMapLocalDataProvider;
import com.hansecom.mapi.models.TransactionSearchResult;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata
public final class CardHistoryRepository$special$$inlined$create$2 extends HashMapLocalDataProvider<String, TransactionSearchResult> {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ CardHistoryRepository$special$$inlined$create$1 f33414f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CardHistoryRepository$special$$inlined$create$2(String str, DataStoreFileProducer dataStoreFileProducer, CardHistoryRepository$special$$inlined$create$1 cardHistoryRepository$special$$inlined$create$1) {
        super(str, dataStoreFileProducer);
        this.f33414f = cardHistoryRepository$special$$inlined$create$1;
    }

    public Function1 m() {
        return this.f33414f.a();
    }

    public Function1 n() {
        return this.f33414f.b();
    }
}
