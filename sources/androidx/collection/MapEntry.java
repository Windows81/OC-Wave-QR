package androidx.collection;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata
final class MapEntry<K, V> implements Map.Entry<K, V>, KMappedMarker {

    /* renamed from: A  reason: collision with root package name */
    public final Object f1864A;

    /* renamed from: z  reason: collision with root package name */
    public final Object f1865z;

    public MapEntry(Object obj, Object obj2) {
        this.f1865z = obj;
        this.f1864A = obj2;
    }

    public Object getKey() {
        return this.f1865z;
    }

    public Object getValue() {
        return this.f1864A;
    }

    public Object setValue(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
