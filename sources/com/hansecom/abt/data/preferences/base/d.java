package com.hansecom.abt.data.preferences.base;

import kotlin.jvm.functions.Function0;

public final /* synthetic */ class d implements Function0 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ ValueLocalDataProvider f33387A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ DataStoreFileProducer f33388z;

    public /* synthetic */ d(DataStoreFileProducer dataStoreFileProducer, ValueLocalDataProvider valueLocalDataProvider) {
        this.f33388z = dataStoreFileProducer;
        this.f33387A = valueLocalDataProvider;
    }

    public final Object invoke() {
        return ValueLocalDataProvider.B(this.f33388z, this.f33387A);
    }
}
