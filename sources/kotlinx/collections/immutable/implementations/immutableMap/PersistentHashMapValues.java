package kotlinx.collections.immutable.implementations.immutableMap;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.AbstractCollection;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableCollection;

@Metadata
public final class PersistentHashMapValues<K, V> extends AbstractCollection<V> implements ImmutableCollection<V> {

    /* renamed from: z  reason: collision with root package name */
    public final PersistentHashMap f41282z;

    public PersistentHashMapValues(PersistentHashMap persistentHashMap) {
        Intrinsics.i(persistentHashMap, "map");
        this.f41282z = persistentHashMap;
    }

    public boolean contains(Object obj) {
        return this.f41282z.containsValue(obj);
    }

    public int g() {
        return this.f41282z.size();
    }

    public Iterator iterator() {
        return new PersistentHashMapValuesIterator(this.f41282z.q());
    }
}
