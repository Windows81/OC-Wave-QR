package com.hansecom.abt.data.preferences.base;

import kotlin.jvm.functions.Function0;

public final /* synthetic */ class f implements Function0 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ ValueLocalDataProvider f33390A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ DataStoreFileProducer f33391z;

    public /* synthetic */ f(DataStoreFileProducer dataStoreFileProducer, ValueLocalDataProvider valueLocalDataProvider) {
        this.f33391z = dataStoreFileProducer;
        this.f33390A = valueLocalDataProvider;
    }

    public final Object invoke() {
        return ValueLocalDataProvider.C(this.f33391z, this.f33390A);
    }
}
