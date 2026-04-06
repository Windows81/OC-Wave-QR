package androidx.collection;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableSet;

@Metadata
final class MutableOrderedSetWrapper<E> extends OrderedSetWrapper<E> implements Set<E>, KMutableSet {

    /* renamed from: A  reason: collision with root package name */
    public final MutableOrderedScatterSet f1908A;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MutableOrderedSetWrapper(MutableOrderedScatterSet mutableOrderedScatterSet) {
        super(mutableOrderedScatterSet);
        Intrinsics.i(mutableOrderedScatterSet, "parent");
        this.f1908A = mutableOrderedScatterSet;
    }

    public boolean add(Object obj) {
        return this.f1908A.g(obj);
    }

    public boolean addAll(Collection collection) {
        Intrinsics.i(collection, "elements");
        return this.f1908A.h(collection);
    }

    public void clear() {
        this.f1908A.k();
    }

    public Iterator iterator() {
        return new MutableOrderedSetWrapper$iterator$1(this);
    }

    public boolean remove(Object obj) {
        return this.f1908A.x(obj);
    }

    public boolean removeAll(Collection collection) {
        Intrinsics.i(collection, "elements");
        return this.f1908A.y(collection);
    }

    public boolean retainAll(Collection collection) {
        Intrinsics.i(collection, "elements");
        return this.f1908A.B(collection);
    }
}
