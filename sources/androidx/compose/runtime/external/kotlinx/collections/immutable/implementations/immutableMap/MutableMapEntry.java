package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMutableMap;

@Metadata
final class MutableMapEntry<K, V> extends MapEntry<K, V> implements Map.Entry<K, V>, KMutableMap.Entry {

    /* renamed from: B  reason: collision with root package name */
    public final PersistentHashMapBuilderEntriesIterator f15042B;
    public Object C;

    public MutableMapEntry(PersistentHashMapBuilderEntriesIterator persistentHashMapBuilderEntriesIterator, Object obj, Object obj2) {
        super(obj, obj2);
        this.f15042B = persistentHashMapBuilderEntriesIterator;
        this.C = obj2;
    }

    public void a(Object obj) {
        this.C = obj;
    }

    public Object getValue() {
        return this.C;
    }

    public Object setValue(Object obj) {
        Object value = getValue();
        a(obj);
        this.f15042B.c(getKey(), obj);
        return value;
    }
}
