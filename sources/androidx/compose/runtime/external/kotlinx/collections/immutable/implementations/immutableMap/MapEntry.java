package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata
public class MapEntry<K, V> implements Map.Entry<K, V>, KMappedMarker {

    /* renamed from: A  reason: collision with root package name */
    public final Object f15040A;

    /* renamed from: z  reason: collision with root package name */
    public final Object f15041z;

    public MapEntry(Object obj, Object obj2) {
        this.f15041z = obj;
        this.f15040A = obj2;
    }

    public boolean equals(Object obj) {
        Map.Entry entry = obj instanceof Map.Entry ? (Map.Entry) obj : null;
        return entry != null && Intrinsics.d(entry.getKey(), getKey()) && Intrinsics.d(entry.getValue(), getValue());
    }

    public Object getKey() {
        return this.f15041z;
    }

    public Object getValue() {
        return this.f15040A;
    }

    public int hashCode() {
        Object key = getKey();
        int i2 = 0;
        int hashCode = key != null ? key.hashCode() : 0;
        Object value = getValue();
        if (value != null) {
            i2 = value.hashCode();
        }
        return hashCode ^ i2;
    }

    public Object setValue(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getKey());
        sb.append('=');
        sb.append(getValue());
        return sb.toString();
    }
}
