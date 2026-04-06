package kotlinx.collections.immutable.implementations.persistentOrderedMap;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.AbstractSet;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableSet;

@Metadata
public final class PersistentOrderedMapKeys<K, V> extends AbstractSet<K> implements ImmutableSet<K> {

    /* renamed from: A  reason: collision with root package name */
    public final PersistentOrderedMap f41334A;

    public PersistentOrderedMapKeys(PersistentOrderedMap persistentOrderedMap) {
        Intrinsics.i(persistentOrderedMap, "map");
        this.f41334A = persistentOrderedMap;
    }

    public boolean contains(Object obj) {
        return this.f41334A.containsKey(obj);
    }

    public int g() {
        return this.f41334A.size();
    }

    public Iterator iterator() {
        return new PersistentOrderedMapKeysIterator(this.f41334A);
    }
}
