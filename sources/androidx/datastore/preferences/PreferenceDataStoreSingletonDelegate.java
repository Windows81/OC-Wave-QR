package androidx.datastore.preferences;

import android.content.Context;
import androidx.datastore.core.DataStore;
import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
import androidx.datastore.preferences.core.PreferenceDataStoreFactory;
import androidx.datastore.preferences.core.Preferences;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;

@Metadata
public final class PreferenceDataStoreSingletonDelegate implements ReadOnlyProperty<Context, DataStore<Preferences>> {

    /* renamed from: a  reason: collision with root package name */
    public final String f20686a;

    /* renamed from: b  reason: collision with root package name */
    public final ReplaceFileCorruptionHandler f20687b;

    /* renamed from: c  reason: collision with root package name */
    public final Function1 f20688c;

    /* renamed from: d  reason: collision with root package name */
    public final CoroutineScope f20689d;

    /* renamed from: e  reason: collision with root package name */
    public final Object f20690e = new Object();

    /* renamed from: f  reason: collision with root package name */
    public volatile DataStore f20691f;

    public PreferenceDataStoreSingletonDelegate(String str, ReplaceFileCorruptionHandler replaceFileCorruptionHandler, Function1 function1, CoroutineScope coroutineScope) {
        Intrinsics.i(str, "name");
        Intrinsics.i(function1, "produceMigrations");
        Intrinsics.i(coroutineScope, "scope");
        this.f20686a = str;
        this.f20687b = replaceFileCorruptionHandler;
        this.f20688c = function1;
        this.f20689d = coroutineScope;
    }

    /* renamed from: c */
    public DataStore a(Context context, KProperty kProperty) {
        DataStore dataStore;
        Intrinsics.i(context, "thisRef");
        Intrinsics.i(kProperty, "property");
        DataStore dataStore2 = this.f20691f;
        if (dataStore2 != null) {
            return dataStore2;
        }
        synchronized (this.f20690e) {
            try {
                if (this.f20691f == null) {
                    Context applicationContext = context.getApplicationContext();
                    PreferenceDataStoreFactory preferenceDataStoreFactory = PreferenceDataStoreFactory.f20706a;
                    ReplaceFileCorruptionHandler replaceFileCorruptionHandler = this.f20687b;
                    Function1 function1 = this.f20688c;
                    Intrinsics.h(applicationContext, "applicationContext");
                    this.f20691f = preferenceDataStoreFactory.b(replaceFileCorruptionHandler, (List) function1.invoke(applicationContext), this.f20689d, new PreferenceDataStoreSingletonDelegate$getValue$1$1(applicationContext, this));
                }
                dataStore = this.f20691f;
                Intrinsics.f(dataStore);
            } catch (Throwable th) {
                throw th;
            }
        }
        return dataStore;
    }
}
