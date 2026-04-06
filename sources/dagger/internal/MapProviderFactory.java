package dagger.internal;

import dagger.Lazy;
import dagger.internal.AbstractMapFactory;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.inject.Provider;

public final class MapProviderFactory<K, V> extends AbstractMapFactory<K, V, Provider<V>> implements Lazy<Map<K, Provider<V>>> {

    public static final class Builder<K, V> extends AbstractMapFactory.Builder<K, V, Provider<V>> {

        /* renamed from: dagger.internal.MapProviderFactory$Builder$1  reason: invalid class name */
        class AnonymousClass1 implements Provider<Map<Object, Provider<Object>>> {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Provider f39771a;

            /* renamed from: a */
            public Map get() {
                Map map = (Map) this.f39771a.get();
                if (map.isEmpty()) {
                    return Collections.emptyMap();
                }
                LinkedHashMap c2 = DaggerCollections.c(map.size());
                for (Map.Entry entry : map.entrySet()) {
                    c2.put(entry.getKey(), Providers.a((Provider) entry.getValue()));
                }
                return Collections.unmodifiableMap(c2);
            }
        }
    }

    /* renamed from: b */
    public Map get() {
        return a();
    }
}
