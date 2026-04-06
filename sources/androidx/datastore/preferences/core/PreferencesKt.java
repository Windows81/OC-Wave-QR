package androidx.datastore.preferences.core;

import androidx.datastore.core.DataStore;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

@Metadata
public final class PreferencesKt {
    public static final Object a(DataStore dataStore, Function2 function2, Continuation continuation) {
        return dataStore.a(new PreferencesKt$edit$2(function2, (Continuation) null), continuation);
    }
}
