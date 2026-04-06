package kotlinx.collections.immutable.implementations.immutableMap;

import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.AbstractSet;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableSet;
import kotlinx.collections.immutable.internal.MapImplementation;

@Metadata
public final class PersistentHashMapEntries<K, V> extends AbstractSet<Map.Entry<? extends K, ? extends V>> implements ImmutableSet<Map.Entry<? extends K, ? extends V>> {

    /* renamed from: A  reason: collision with root package name */
    public final PersistentHashMap f41280A;

    public PersistentHashMapEntries(PersistentHashMap persistentHashMap) {
        Intrinsics.i(persistentHashMap, "map");
        this.f41280A = persistentHashMap;
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        return i((Map.Entry) obj);
    }

    public int g() {
        return this.f41280A.size();
    }

    public boolean i(Map.Entry entry) {
        Intrinsics.i(entry, "element");
        return MapImplementation.f41358a.a(this.f41280A, entry);
    }

    public Iterator iterator() {
        return new PersistentHashMapEntriesIterator(this.f41280A.q());
    }
}
