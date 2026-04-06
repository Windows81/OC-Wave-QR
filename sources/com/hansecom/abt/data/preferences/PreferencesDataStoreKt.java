package com.hansecom.abt.data.preferences;

import android.content.Context;
import androidx.datastore.core.DataStore;
import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
import androidx.datastore.preferences.PreferenceDataStoreDelegateKt;
import androidx.datastore.preferences.core.Preferences;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

@Metadata
public final class PreferencesDataStoreKt {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f33328a = {Reflection.i(new PropertyReference1Impl(PreferencesDataStoreKt.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 1))};

    /* renamed from: b  reason: collision with root package name */
    public static final ReadOnlyProperty f33329b = PreferenceDataStoreDelegateKt.b("preferences", (ReplaceFileCorruptionHandler) null, (Function1) null, (CoroutineScope) null, 14, (Object) null);

    public static final Flow a(DataStore dataStore, Preferences.Key key, Object obj) {
        Intrinsics.i(dataStore, "<this>");
        Intrinsics.i(key, "key");
        return FlowKt.h(new PreferencesDataStoreKt$flowOf$$inlined$map$1(dataStore.getData(), key, obj), new PreferencesDataStoreKt$flowOf$2(obj, (Continuation) null));
    }

    public static final Object b(DataStore dataStore, Preferences.Key key, Continuation continuation) {
        return BuildersKt.g(Dispatchers.b(), new PreferencesDataStoreKt$get$2(dataStore, key, (Continuation) null), continuation);
    }

    public static final DataStore c(Context context) {
        Intrinsics.i(context, "<this>");
        return (DataStore) f33329b.a(context, f33328a[0]);
    }

    public static final Object d(DataStore dataStore, Preferences.Key key, Object obj, Continuation continuation) {
        return BuildersKt.g(Dispatchers.b(), new PreferencesDataStoreKt$getOrDefault$2(dataStore, key, obj, (Continuation) null), continuation);
    }

    public static final Object e(DataStore dataStore, Preferences.Key key, Object obj, Continuation continuation) {
        Object g2 = BuildersKt.g(Dispatchers.b(), new PreferencesDataStoreKt$set$2(dataStore, obj, key, (Continuation) null), continuation);
        return g2 == IntrinsicsKt.f() ? g2 : Unit.f40552a;
    }
}
