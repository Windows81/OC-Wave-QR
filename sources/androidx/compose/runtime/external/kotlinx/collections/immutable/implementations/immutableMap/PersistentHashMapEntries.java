package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableSet;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.AbstractSet;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class PersistentHashMapEntries<K, V> extends AbstractSet<Map.Entry<? extends K, ? extends V>> implements ImmutableSet<Map.Entry<? extends K, ? extends V>> {

    /* renamed from: A  reason: collision with root package name */
    public final PersistentHashMap f15053A;

    public PersistentHashMapEntries(PersistentHashMap persistentHashMap) {
        this.f15053A = persistentHashMap;
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        return i((Map.Entry) obj);
    }

    public int g() {
        return this.f15053A.size();
    }

    public boolean i(Map.Entry entry) {
        if (entry == null) {
            return false;
        }
        Object obj = this.f15053A.get(entry.getKey());
        return obj != null ? Intrinsics.d(obj, entry.getValue()) : entry.getValue() == null && this.f15053A.containsKey(entry.getKey());
    }

    public Iterator iterator() {
        return new PersistentHashMapEntriesIterator(this.f15053A.r());
    }
}
