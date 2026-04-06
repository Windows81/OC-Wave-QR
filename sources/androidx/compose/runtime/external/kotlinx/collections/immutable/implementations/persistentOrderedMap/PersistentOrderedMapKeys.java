package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableSet;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.AbstractSet;

@Metadata
public final class PersistentOrderedMapKeys<K, V> extends AbstractSet<K> implements ImmutableSet<K> {

    /* renamed from: A  reason: collision with root package name */
    public final PersistentOrderedMap f15103A;

    public PersistentOrderedMapKeys(PersistentOrderedMap persistentOrderedMap) {
        this.f15103A = persistentOrderedMap;
    }

    public boolean contains(Object obj) {
        return this.f15103A.containsKey(obj);
    }

    public int g() {
        return this.f15103A.size();
    }

    public Iterator iterator() {
        return new PersistentOrderedMapKeysIterator(this.f15103A);
    }
}
