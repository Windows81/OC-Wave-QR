package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableSet;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.AbstractSet;

@Metadata
public final class PersistentHashMapKeys<K, V> extends AbstractSet<K> implements ImmutableSet<K> {

    /* renamed from: A  reason: collision with root package name */
    public final PersistentHashMap f15054A;

    public PersistentHashMapKeys(PersistentHashMap persistentHashMap) {
        this.f15054A = persistentHashMap;
    }

    public boolean contains(Object obj) {
        return this.f15054A.containsKey(obj);
    }

    public int g() {
        return this.f15054A.size();
    }

    public Iterator iterator() {
        return new PersistentHashMapKeysIterator(this.f15054A.r());
    }
}
