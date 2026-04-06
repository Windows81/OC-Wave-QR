package androidx.datastore;

import android.content.Context;
import androidx.datastore.core.DataStore;
import androidx.datastore.core.DataStoreFactory;
import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
import androidx.datastore.core.okio.OkioSerializer;
import androidx.datastore.core.okio.OkioStorage;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;
import okio.FileSystem;

@Metadata
public final class DataStoreSingletonDelegate<T> implements ReadOnlyProperty<Context, DataStore<T>> {

    /* renamed from: a  reason: collision with root package name */
    public final String f20532a;

    /* renamed from: b  reason: collision with root package name */
    public final OkioSerializer f20533b;

    /* renamed from: c  reason: collision with root package name */
    public final ReplaceFileCorruptionHandler f20534c;

    /* renamed from: d  reason: collision with root package name */
    public final Function1 f20535d;

    /* renamed from: e  reason: collision with root package name */
    public final CoroutineScope f20536e;

    /* renamed from: f  reason: collision with root package name */
    public final Object f20537f;

    /* renamed from: g  reason: collision with root package name */
    public volatile DataStore f20538g;

    /* renamed from: c */
    public DataStore a(Context context, KProperty kProperty) {
        DataStore dataStore;
        Intrinsics.i(context, "thisRef");
        Intrinsics.i(kProperty, "property");
        DataStore dataStore2 = this.f20538g;
        if (dataStore2 != null) {
            return dataStore2;
        }
        synchronized (this.f20537f) {
            try {
                if (this.f20538g == null) {
                    Context applicationContext = context.getApplicationContext();
                    DataStoreFactory dataStoreFactory = DataStoreFactory.f20547a;
                    OkioStorage okioStorage = new OkioStorage(FileSystem.f43375b, this.f20533b, (Function2) null, new DataStoreSingletonDelegate$getValue$1$1(applicationContext, this), 4, (DefaultConstructorMarker) null);
                    ReplaceFileCorruptionHandler replaceFileCorruptionHandler = this.f20534c;
                    Function1 function1 = this.f20535d;
                    Intrinsics.h(applicationContext, "applicationContext");
                    this.f20538g = dataStoreFactory.b(okioStorage, replaceFileCorruptionHandler, (List) function1.invoke(applicationContext), this.f20536e);
                }
                dataStore = this.f20538g;
                Intrinsics.f(dataStore);
            } catch (Throwable th) {
                throw th;
            }
        }
        return dataStore;
    }
}
