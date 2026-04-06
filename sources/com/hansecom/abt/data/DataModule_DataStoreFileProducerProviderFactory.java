package com.hansecom.abt.data;

import android.content.Context;
import com.hansecom.abt.data.preferences.base.DataStoreFileProducer;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;

public final class DataModule_DataStoreFileProducerProviderFactory implements Factory<DataStoreFileProducer> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f33172a;

    public static DataStoreFileProducer a(Context context) {
        return (DataStoreFileProducer) Preconditions.d(DataModule.f33171a.b(context));
    }

    /* renamed from: b */
    public DataStoreFileProducer get() {
        return a((Context) this.f33172a.get());
    }
}
