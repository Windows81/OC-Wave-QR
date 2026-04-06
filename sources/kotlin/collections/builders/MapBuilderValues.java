package kotlin.collections.builders;

import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.AbstractMutableCollection;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableCollection;

@Metadata
public final class MapBuilderValues<V> extends AbstractMutableCollection<V> implements Collection<V>, KMutableCollection {

    /* renamed from: z  reason: collision with root package name */
    public final MapBuilder f40670z;

    public MapBuilderValues(MapBuilder mapBuilder) {
        Intrinsics.i(mapBuilder, "backing");
        this.f40670z = mapBuilder;
    }

    public boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    public boolean addAll(Collection collection) {
        Intrinsics.i(collection, "elements");
        throw new UnsupportedOperationException();
    }

    public void clear() {
        this.f40670z.clear();
    }

    public boolean contains(Object obj) {
        return this.f40670z.containsValue(obj);
    }

    public int e() {
        return this.f40670z.size();
    }

    public boolean isEmpty() {
        return this.f40670z.isEmpty();
    }

    public Iterator iterator() {
        return this.f40670z.S();
    }

    public boolean remove(Object obj) {
        return this.f40670z.Q(obj);
    }

    public boolean removeAll(Collection collection) {
        Intrinsics.i(collection, "elements");
        this.f40670z.n();
        return super.removeAll(collection);
    }

    public boolean retainAll(Collection collection) {
        Intrinsics.i(collection, "elements");
        this.f40670z.n();
        return super.retainAll(collection);
    }
}
