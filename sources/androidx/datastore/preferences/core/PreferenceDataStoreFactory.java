package androidx.datastore.preferences.core;

import androidx.datastore.core.DataStore;
import androidx.datastore.core.DataStoreFactory;
import androidx.datastore.core.FileStorage;
import androidx.datastore.core.Storage;
import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

@Metadata
public final class PreferenceDataStoreFactory {

    /* renamed from: a  reason: collision with root package name */
    public static final PreferenceDataStoreFactory f20706a = new PreferenceDataStoreFactory();

    public final DataStore a(Storage storage, ReplaceFileCorruptionHandler replaceFileCorruptionHandler, List list, CoroutineScope coroutineScope) {
        Intrinsics.i(storage, "storage");
        Intrinsics.i(list, "migrations");
        Intrinsics.i(coroutineScope, "scope");
        return new PreferenceDataStore(DataStoreFactory.f20547a.b(storage, replaceFileCorruptionHandler, list, coroutineScope));
    }

    public final DataStore b(ReplaceFileCorruptionHandler replaceFileCorruptionHandler, List list, CoroutineScope coroutineScope, Function0 function0) {
        Intrinsics.i(list, "migrations");
        Intrinsics.i(coroutineScope, "scope");
        Intrinsics.i(function0, "produceFile");
        return new PreferenceDataStore(a(new FileStorage(PreferencesFileSerializer.f20712a, (Function1) null, new PreferenceDataStoreFactory$create$delegate$1(function0), 2, (DefaultConstructorMarker) null), replaceFileCorruptionHandler, list, coroutineScope));
    }
}
