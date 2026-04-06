package androidx.datastore.preferences.core;

import androidx.datastore.core.DataStore;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

@Metadata
public final class PreferenceDataStore implements DataStore<Preferences> {

    /* renamed from: a  reason: collision with root package name */
    public final DataStore f20705a;

    public PreferenceDataStore(DataStore dataStore) {
        Intrinsics.i(dataStore, "delegate");
        this.f20705a = dataStore;
    }

    public Object a(Function2 function2, Continuation continuation) {
        return this.f20705a.a(new PreferenceDataStore$updateData$2(function2, (Continuation) null), continuation);
    }

    public Flow getData() {
        return this.f20705a.getData();
    }
}
