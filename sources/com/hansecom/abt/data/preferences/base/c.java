package com.hansecom.abt.data.preferences.base;

import kotlin.jvm.functions.Function0;

public final /* synthetic */ class c implements Function0 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ HashMapLocalDataProvider f33385A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ DataStoreFileProducer f33386z;

    public /* synthetic */ c(DataStoreFileProducer dataStoreFileProducer, HashMapLocalDataProvider hashMapLocalDataProvider) {
        this.f33386z = dataStoreFileProducer;
        this.f33385A = hashMapLocalDataProvider;
    }

    public final Object invoke() {
        return HashMapLocalDataProvider.s(this.f33386z, this.f33385A);
    }
}
