package com.hansecom.abt.data.preferences.base;

import kotlin.jvm.functions.Function0;

public final /* synthetic */ class a implements Function0 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ HashMapLocalDataProvider f33382A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ DataStoreFileProducer f33383z;

    public /* synthetic */ a(DataStoreFileProducer dataStoreFileProducer, HashMapLocalDataProvider hashMapLocalDataProvider) {
        this.f33383z = dataStoreFileProducer;
        this.f33382A = hashMapLocalDataProvider;
    }

    public final Object invoke() {
        return HashMapLocalDataProvider.r(this.f33383z, this.f33382A);
    }
}
