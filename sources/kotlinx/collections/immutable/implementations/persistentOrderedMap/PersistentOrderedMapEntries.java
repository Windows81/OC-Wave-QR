package kotlinx.collections.immutable.implementations.persistentOrderedMap;

import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.AbstractSet;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableSet;
import kotlinx.collections.immutable.internal.MapImplementation;

@Metadata
public final class PersistentOrderedMapEntries<K, V> extends AbstractSet<Map.Entry<? extends K, ? extends V>> implements ImmutableSet<Map.Entry<? extends K, ? extends V>> {

    /* renamed from: A  reason: collision with root package name */
    public final PersistentOrderedMap f41332A;

    public PersistentOrderedMapEntries(PersistentOrderedMap persistentOrderedMap) {
        Intrinsics.i(persistentOrderedMap, "map");
        this.f41332A = persistentOrderedMap;
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        return i((Map.Entry) obj);
    }

    public int g() {
        return this.f41332A.size();
    }

    public boolean i(Map.Entry entry) {
        Intrinsics.i(entry, "element");
        return MapImplementation.f41358a.a(this.f41332A, entry);
    }

    public Iterator iterator() {
        return new PersistentOrderedMapEntriesIterator(this.f41332A);
    }
}
