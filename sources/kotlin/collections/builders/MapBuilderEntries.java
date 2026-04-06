package kotlin.collections.builders;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class MapBuilderEntries<K, V> extends AbstractMapBuilderEntrySet<Map.Entry<K, V>, K, V> {

    /* renamed from: z  reason: collision with root package name */
    public final MapBuilder f40668z;

    public MapBuilderEntries(MapBuilder mapBuilder) {
        Intrinsics.i(mapBuilder, "backing");
        this.f40668z = mapBuilder;
    }

    public boolean addAll(Collection collection) {
        Intrinsics.i(collection, "elements");
        throw new UnsupportedOperationException();
    }

    public void clear() {
        this.f40668z.clear();
    }

    public boolean containsAll(Collection collection) {
        Intrinsics.i(collection, "elements");
        return this.f40668z.p(collection);
    }

    public int e() {
        return this.f40668z.size();
    }

    public boolean h(Map.Entry entry) {
        Intrinsics.i(entry, "element");
        return this.f40668z.q(entry);
    }

    public boolean i(Map.Entry entry) {
        Intrinsics.i(entry, "element");
        return this.f40668z.L(entry);
    }

    public boolean isEmpty() {
        return this.f40668z.isEmpty();
    }

    public Iterator iterator() {
        return this.f40668z.u();
    }

    /* renamed from: m */
    public boolean add(Map.Entry entry) {
        Intrinsics.i(entry, "element");
        throw new UnsupportedOperationException();
    }

    public boolean removeAll(Collection collection) {
        Intrinsics.i(collection, "elements");
        this.f40668z.n();
        return super.removeAll(collection);
    }

    public boolean retainAll(Collection collection) {
        Intrinsics.i(collection, "elements");
        this.f40668z.n();
        return super.retainAll(collection);
    }
}
