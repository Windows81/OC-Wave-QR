package androidx.collection;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableSet;

@Metadata
final class MutableSetWrapper<E> extends SetWrapper<E> implements Set<E>, KMutableSet {

    /* renamed from: A  reason: collision with root package name */
    public final MutableScatterSet f1915A;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MutableSetWrapper(MutableScatterSet mutableScatterSet) {
        super(mutableScatterSet);
        Intrinsics.i(mutableScatterSet, "parent");
        this.f1915A = mutableScatterSet;
    }

    public boolean add(Object obj) {
        return this.f1915A.h(obj);
    }

    public boolean addAll(Collection collection) {
        Intrinsics.i(collection, "elements");
        return this.f1915A.j(collection);
    }

    public void clear() {
        this.f1915A.m();
    }

    public Iterator iterator() {
        return new MutableSetWrapper$iterator$1(this);
    }

    public boolean remove(Object obj) {
        return this.f1915A.y(obj);
    }

    public boolean removeAll(Collection collection) {
        Intrinsics.i(collection, "elements");
        return this.f1915A.z(collection);
    }

    public boolean retainAll(Collection collection) {
        Intrinsics.i(collection, "elements");
        return this.f1915A.C(collection);
    }
}
