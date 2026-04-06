package com.hansecom.abt.data;

import android.content.Context;
import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.core.Preferences;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import kotlin.properties.ReadOnlyProperty;

public final class DataModule_PreferencesDataStoreProviderFactory implements Factory<ReadOnlyProperty<Context, DataStore<Preferences>>> {

    public static final class InstanceHolder {

        /* renamed from: a  reason: collision with root package name */
        public static final DataModule_PreferencesDataStoreProviderFactory f33174a = new DataModule_PreferencesDataStoreProviderFactory();
    }

    public static ReadOnlyProperty b() {
        return (ReadOnlyProperty) Preconditions.d(DataModule.f33171a.e());
    }

    /* renamed from: a */
    public ReadOnlyProperty get() {
        return b();
    }
}
