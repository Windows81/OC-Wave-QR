package com.hansecom.abt.data;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import kotlinx.serialization.json.Json;

public final class DataModule_JsonFactory implements Factory<Json> {

    public static final class InstanceHolder {

        /* renamed from: a  reason: collision with root package name */
        public static final DataModule_JsonFactory f33173a = new DataModule_JsonFactory();
    }

    public static Json b() {
        return (Json) Preconditions.d(DataModule.f33171a.d());
    }

    /* renamed from: a */
    public Json get() {
        return b();
    }
}
