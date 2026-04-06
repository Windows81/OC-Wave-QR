package kotlinx.collections.immutable.implementations.persistentOrderedMap;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableMap;
import kotlinx.collections.immutable.implementations.immutableMap.MapEntry;

@Metadata
final class MutableMapEntry<K, V> extends MapEntry<K, V> implements Map.Entry<K, V>, KMutableMap.Entry {

    /* renamed from: B  reason: collision with root package name */
    public final Map f41311B;
    public LinkedValue C;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MutableMapEntry(Map map, Object obj, LinkedValue linkedValue) {
        super(obj, linkedValue.e());
        Intrinsics.i(map, "mutableMap");
        Intrinsics.i(linkedValue, "links");
        this.f41311B = map;
        this.C = linkedValue;
    }

    public Object getValue() {
        return this.C.e();
    }

    public Object setValue(Object obj) {
        Object e2 = this.C.e();
        this.C = this.C.h(obj);
        this.f41311B.put(getKey(), this.C);
        return e2;
    }
}
