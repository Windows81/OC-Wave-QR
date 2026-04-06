package kotlin.collections.builders;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.AbstractMutableSet;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableSet;

@Metadata
public final class MapBuilderKeys<E> extends AbstractMutableSet<E> implements Set<E>, KMutableSet {

    /* renamed from: z  reason: collision with root package name */
    public final MapBuilder f40669z;

    public MapBuilderKeys(MapBuilder mapBuilder) {
        Intrinsics.i(mapBuilder, "backing");
        this.f40669z = mapBuilder;
    }

    public boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    public boolean addAll(Collection collection) {
        Intrinsics.i(collection, "elements");
        throw new UnsupportedOperationException();
    }

    public void clear() {
        this.f40669z.clear();
    }

    public boolean contains(Object obj) {
        return this.f40669z.containsKey(obj);
    }

    public int e() {
        return this.f40669z.size();
    }

    public boolean isEmpty() {
        return this.f40669z.isEmpty();
    }

    public Iterator iterator() {
        return this.f40669z.E();
    }

    public boolean remove(Object obj) {
        return this.f40669z.P(obj);
    }

    public boolean removeAll(Collection collection) {
        Intrinsics.i(collection, "elements");
        this.f40669z.n();
        return super.removeAll(collection);
    }

    public boolean retainAll(Collection collection) {
        Intrinsics.i(collection, "elements");
        this.f40669z.n();
        return super.retainAll(collection);
    }
}
