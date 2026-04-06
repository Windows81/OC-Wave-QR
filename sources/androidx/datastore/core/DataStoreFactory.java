package androidx.datastore.core;

import androidx.datastore.core.handlers.NoOpCorruptionHandler;
import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;

@Metadata
public final class DataStoreFactory {

    /* renamed from: a  reason: collision with root package name */
    public static final DataStoreFactory f20547a = new DataStoreFactory();

    public static /* synthetic */ DataStore c(DataStoreFactory dataStoreFactory, Serializer serializer, ReplaceFileCorruptionHandler replaceFileCorruptionHandler, List list, CoroutineScope coroutineScope, Function0 function0, int i2, Object obj) {
        ReplaceFileCorruptionHandler replaceFileCorruptionHandler2 = (i2 & 2) != 0 ? null : replaceFileCorruptionHandler;
        if ((i2 & 4) != 0) {
            list = CollectionsKt.m();
        }
        List list2 = list;
        if ((i2 & 8) != 0) {
            coroutineScope = CoroutineScopeKt.a(Dispatchers.b().y(SupervisorKt.b((Job) null, 1, (Object) null)));
        }
        return dataStoreFactory.a(serializer, replaceFileCorruptionHandler2, list2, coroutineScope, function0);
    }

    public final DataStore a(Serializer serializer, ReplaceFileCorruptionHandler replaceFileCorruptionHandler, List list, CoroutineScope coroutineScope, Function0 function0) {
        Intrinsics.i(serializer, "serializer");
        Intrinsics.i(list, "migrations");
        Intrinsics.i(coroutineScope, "scope");
        Intrinsics.i(function0, "produceFile");
        return b(new FileStorage(serializer, (Function1) null, function0, 2, (DefaultConstructorMarker) null), replaceFileCorruptionHandler, list, coroutineScope);
    }

    public final DataStore b(Storage storage, ReplaceFileCorruptionHandler replaceFileCorruptionHandler, List list, CoroutineScope coroutineScope) {
        Intrinsics.i(storage, "storage");
        Intrinsics.i(list, "migrations");
        Intrinsics.i(coroutineScope, "scope");
        CorruptionHandler corruptionHandler = replaceFileCorruptionHandler;
        if (replaceFileCorruptionHandler == null) {
            corruptionHandler = new NoOpCorruptionHandler();
        }
        return new DataStoreImpl(storage, CollectionsKt.e(DataMigrationInitializer.f20546a.b(list)), corruptionHandler, coroutineScope);
    }
}
