package kotlinx.collections.immutable.implementations.immutableMap;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.AbstractSet;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableSet;

@Metadata
public final class PersistentHashMapKeys<K, V> extends AbstractSet<K> implements ImmutableSet<K> {

    /* renamed from: A  reason: collision with root package name */
    public final PersistentHashMap f41281A;

    public PersistentHashMapKeys(PersistentHashMap persistentHashMap) {
        Intrinsics.i(persistentHashMap, "map");
        this.f41281A = persistentHashMap;
    }

    public boolean contains(Object obj) {
        return this.f41281A.containsKey(obj);
    }

    public int g() {
        return this.f41281A.size();
    }

    public Iterator iterator() {
        return new PersistentHashMapKeysIterator(this.f41281A.q());
    }
}
