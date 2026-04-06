package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.MapEntry;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMutableMap;

@Metadata
final class MutableMapEntry<K, V> extends MapEntry<K, V> implements Map.Entry<K, V>, KMutableMap.Entry {

    /* renamed from: B  reason: collision with root package name */
    public final Map f15088B;
    public LinkedValue C;

    public MutableMapEntry(Map map, Object obj, LinkedValue linkedValue) {
        super(obj, linkedValue.e());
        this.f15088B = map;
        this.C = linkedValue;
    }

    public Object getValue() {
        return this.C.e();
    }

    public Object setValue(Object obj) {
        Object e2 = this.C.e();
        this.C = this.C.h(obj);
        this.f15088B.put(getKey(), this.C);
        return e2;
    }
}
