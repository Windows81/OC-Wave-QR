package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableSet;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.AbstractSet;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class PersistentOrderedMapEntries<K, V> extends AbstractSet<Map.Entry<? extends K, ? extends V>> implements ImmutableSet<Map.Entry<? extends K, ? extends V>> {

    /* renamed from: A  reason: collision with root package name */
    public final PersistentOrderedMap f15101A;

    public PersistentOrderedMapEntries(PersistentOrderedMap persistentOrderedMap) {
        this.f15101A = persistentOrderedMap;
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        return i((Map.Entry) obj);
    }

    public int g() {
        return this.f15101A.size();
    }

    public boolean i(Map.Entry entry) {
        if (entry == null) {
            return false;
        }
        Object obj = this.f15101A.get(entry.getKey());
        return obj != null ? Intrinsics.d(obj, entry.getValue()) : entry.getValue() == null && this.f15101A.containsKey(entry.getKey());
    }

    public Iterator iterator() {
        return new PersistentOrderedMapEntriesIterator(this.f15101A);
    }
}
