package kotlinx.collections.immutable.implementations.immutableSet;

import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.AbstractMutableSet;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.PersistentSet;
import kotlinx.collections.immutable.internal.DeltaCounter;
import kotlinx.collections.immutable.internal.MutabilityOwnership;

@Metadata
public final class PersistentHashSetBuilder<E> extends AbstractMutableSet<E> implements PersistentSet.Builder<E> {

    /* renamed from: A  reason: collision with root package name */
    public MutabilityOwnership f41294A;

    /* renamed from: B  reason: collision with root package name */
    public TrieNode f41295B;
    public int C;
    public int D;

    /* renamed from: z  reason: collision with root package name */
    public PersistentHashSet f41296z;

    public boolean add(Object obj) {
        int size = size();
        this.f41295B = this.f41295B.r(obj != null ? obj.hashCode() : 0, obj, 0, this);
        return size != size();
    }

    public boolean addAll(Collection collection) {
        Intrinsics.i(collection, "elements");
        PersistentHashSet persistentHashSet = collection instanceof PersistentHashSet ? (PersistentHashSet) collection : null;
        if (persistentHashSet == null) {
            PersistentHashSetBuilder persistentHashSetBuilder = collection instanceof PersistentHashSetBuilder ? (PersistentHashSetBuilder) collection : null;
            persistentHashSet = persistentHashSetBuilder != null ? persistentHashSetBuilder.g() : null;
        }
        if (persistentHashSet == null) {
            return super.addAll(collection);
        }
        DeltaCounter deltaCounter = new DeltaCounter(0, 1, (DefaultConstructorMarker) null);
        int size = size();
        TrieNode s2 = this.f41295B.s(persistentHashSet.i(), 0, deltaCounter, this);
        int size2 = (collection.size() + size) - deltaCounter.a();
        if (size != size2) {
            this.f41295B = s2;
            n(size2);
        }
        return size != size();
    }

    public void clear() {
        TrieNode a2 = TrieNode.f41300d.a();
        Intrinsics.g(a2, "null cannot be cast to non-null type kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSetBuilder>");
        this.f41295B = a2;
        n(0);
    }

    public boolean contains(Object obj) {
        return this.f41295B.g(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    public boolean containsAll(Collection collection) {
        Intrinsics.i(collection, "elements");
        return collection instanceof PersistentHashSet ? this.f41295B.h(((PersistentHashSet) collection).i(), 0) : collection instanceof PersistentHashSetBuilder ? this.f41295B.h(((PersistentHashSetBuilder) collection).f41295B, 0) : super.containsAll(collection);
    }

    public int e() {
        return this.D;
    }

    public PersistentHashSet g() {
        PersistentHashSet persistentHashSet;
        if (this.f41295B == this.f41296z.i()) {
            persistentHashSet = this.f41296z;
        } else {
            this.f41294A = new MutabilityOwnership();
            persistentHashSet = new PersistentHashSet(this.f41295B, size());
        }
        this.f41296z = persistentHashSet;
        return persistentHashSet;
    }

    public final int h() {
        return this.C;
    }

    public final TrieNode i() {
        return this.f41295B;
    }

    public Iterator iterator() {
        return new PersistentHashSetMutableIterator(this);
    }

    public final MutabilityOwnership m() {
        return this.f41294A;
    }

    public void n(int i2) {
        this.D = i2;
        this.C++;
    }

    public boolean remove(Object obj) {
        int size = size();
        this.f41295B = this.f41295B.y(obj != null ? obj.hashCode() : 0, obj, 0, this);
        return size != size();
    }

    public boolean removeAll(Collection collection) {
        Intrinsics.i(collection, "elements");
        PersistentHashSet persistentHashSet = collection instanceof PersistentHashSet ? (PersistentHashSet) collection : null;
        if (persistentHashSet == null) {
            PersistentHashSetBuilder persistentHashSetBuilder = collection instanceof PersistentHashSetBuilder ? (PersistentHashSetBuilder) collection : null;
            persistentHashSet = persistentHashSetBuilder != null ? persistentHashSetBuilder.g() : null;
        }
        if (persistentHashSet == null) {
            return super.removeAll(collection);
        }
        DeltaCounter deltaCounter = new DeltaCounter(0, 1, (DefaultConstructorMarker) null);
        int size = size();
        Object z2 = this.f41295B.z(persistentHashSet.i(), 0, deltaCounter, this);
        int a2 = size - deltaCounter.a();
        if (a2 == 0) {
            clear();
        } else if (a2 != size) {
            Intrinsics.g(z2, "null cannot be cast to non-null type kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSetBuilder>");
            this.f41295B = (TrieNode) z2;
            n(a2);
        }
        return size != size();
    }

    public boolean retainAll(Collection collection) {
        Intrinsics.i(collection, "elements");
        PersistentHashSet persistentHashSet = collection instanceof PersistentHashSet ? (PersistentHashSet) collection : null;
        if (persistentHashSet == null) {
            PersistentHashSetBuilder persistentHashSetBuilder = collection instanceof PersistentHashSetBuilder ? (PersistentHashSetBuilder) collection : null;
            persistentHashSet = persistentHashSetBuilder != null ? persistentHashSetBuilder.g() : null;
        }
        if (persistentHashSet == null) {
            return super.retainAll(collection);
        }
        DeltaCounter deltaCounter = new DeltaCounter(0, 1, (DefaultConstructorMarker) null);
        int size = size();
        Object A2 = this.f41295B.A(persistentHashSet.i(), 0, deltaCounter, this);
        int a2 = deltaCounter.a();
        if (a2 == 0) {
            clear();
        } else if (a2 != size) {
            Intrinsics.g(A2, "null cannot be cast to non-null type kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSetBuilder>");
            this.f41295B = (TrieNode) A2;
            n(a2);
        }
        return size != size();
    }
}
