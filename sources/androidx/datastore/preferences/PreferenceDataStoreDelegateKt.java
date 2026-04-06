package androidx.datastore.preferences;

import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ReadOnlyProperty;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;

@Metadata
public final class PreferenceDataStoreDelegateKt {
    public static final ReadOnlyProperty a(String str, ReplaceFileCorruptionHandler replaceFileCorruptionHandler, Function1 function1, CoroutineScope coroutineScope) {
        Intrinsics.i(str, "name");
        Intrinsics.i(function1, "produceMigrations");
        Intrinsics.i(coroutineScope, "scope");
        return new PreferenceDataStoreSingletonDelegate(str, replaceFileCorruptionHandler, function1, coroutineScope);
    }

    public static /* synthetic */ ReadOnlyProperty b(String str, ReplaceFileCorruptionHandler replaceFileCorruptionHandler, Function1 function1, CoroutineScope coroutineScope, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            replaceFileCorruptionHandler = null;
        }
        if ((i2 & 4) != 0) {
            function1 = PreferenceDataStoreDelegateKt$preferencesDataStore$1.f20685z;
        }
        if ((i2 & 8) != 0) {
            coroutineScope = CoroutineScopeKt.a(Dispatchers.b().y(SupervisorKt.b((Job) null, 1, (Object) null)));
        }
        return a(str, replaceFileCorruptionHandler, function1, coroutineScope);
    }
}
