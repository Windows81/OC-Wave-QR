package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableCollection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.AbstractCollection;

@Metadata
public final class PersistentHashMapValues<K, V> extends AbstractCollection<V> implements ImmutableCollection<V> {

    /* renamed from: z  reason: collision with root package name */
    public final PersistentHashMap f15055z;

    public PersistentHashMapValues(PersistentHashMap persistentHashMap) {
        this.f15055z = persistentHashMap;
    }

    public boolean contains(Object obj) {
        return this.f15055z.containsValue(obj);
    }

    public int g() {
        return this.f15055z.size();
    }

    public Iterator iterator() {
        return new PersistentHashMapValuesIterator(this.f15055z.r());
    }
}
