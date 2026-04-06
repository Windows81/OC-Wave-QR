package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.DeltaCounter;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.AbstractMutableSet;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class PersistentHashSetBuilder<E> extends AbstractMutableSet<E> implements PersistentSet.Builder<E> {

    /* renamed from: A  reason: collision with root package name */
    public MutabilityOwnership f15070A = new MutabilityOwnership();

    /* renamed from: B  reason: collision with root package name */
    public TrieNode f15071B = this.f15072z.i();
    public int C;
    public int D = this.f15072z.size();

    /* renamed from: z  reason: collision with root package name */
    public PersistentHashSet f15072z;

    public PersistentHashSetBuilder(PersistentHashSet persistentHashSet) {
        this.f15072z = persistentHashSet;
    }

    public boolean add(Object obj) {
        int size = size();
        this.f15071B = this.f15071B.t(obj != null ? obj.hashCode() : 0, obj, 0, this);
        return size != size();
    }

    public boolean addAll(Collection collection) {
        PersistentHashSet persistentHashSet = collection instanceof PersistentHashSet ? (PersistentHashSet) collection : null;
        if (persistentHashSet == null) {
            PersistentHashSetBuilder persistentHashSetBuilder = collection instanceof PersistentHashSetBuilder ? (PersistentHashSetBuilder) collection : null;
            persistentHashSet = persistentHashSetBuilder != null ? persistentHashSetBuilder.d() : null;
        }
        if (persistentHashSet == null) {
            return super.addAll(collection);
        }
        DeltaCounter deltaCounter = new DeltaCounter(0, 1, (DefaultConstructorMarker) null);
        int size = size();
        TrieNode u2 = this.f15071B.u(persistentHashSet.i(), 0, deltaCounter, this);
        int size2 = (collection.size() + size) - deltaCounter.a();
        if (size != size2) {
            this.f15071B = u2;
            n(size2);
        }
        return size != size();
    }

    public void clear() {
        TrieNode a2 = TrieNode.f15076d.a();
        Intrinsics.g(a2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSetBuilder>");
        this.f15071B = a2;
        n(0);
    }

    public boolean contains(Object obj) {
        return this.f15071B.i(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    public boolean containsAll(Collection collection) {
        return collection instanceof PersistentHashSet ? this.f15071B.j(((PersistentHashSet) collection).i(), 0) : collection instanceof PersistentHashSetBuilder ? this.f15071B.j(((PersistentHashSetBuilder) collection).f15071B, 0) : super.containsAll(collection);
    }

    public int e() {
        return this.D;
    }

    /* renamed from: g */
    public PersistentHashSet d() {
        PersistentHashSet persistentHashSet;
        if (this.f15071B == this.f15072z.i()) {
            persistentHashSet = this.f15072z;
        } else {
            this.f15070A = new MutabilityOwnership();
            persistentHashSet = new PersistentHashSet(this.f15071B, size());
        }
        this.f15072z = persistentHashSet;
        return persistentHashSet;
    }

    public final int h() {
        return this.C;
    }

    public final TrieNode i() {
        return this.f15071B;
    }

    public Iterator iterator() {
        return new PersistentHashSetMutableIterator(this);
    }

    public final MutabilityOwnership m() {
        return this.f15070A;
    }

    public void n(int i2) {
        this.D = i2;
        this.C++;
    }

    public boolean remove(Object obj) {
        int size = size();
        this.f15071B = this.f15071B.D(obj != null ? obj.hashCode() : 0, obj, 0, this);
        return size != size();
    }

    public boolean removeAll(Collection collection) {
        PersistentHashSet persistentHashSet = collection instanceof PersistentHashSet ? (PersistentHashSet) collection : null;
        if (persistentHashSet == null) {
            PersistentHashSetBuilder persistentHashSetBuilder = collection instanceof PersistentHashSetBuilder ? (PersistentHashSetBuilder) collection : null;
            persistentHashSet = persistentHashSetBuilder != null ? persistentHashSetBuilder.d() : null;
        }
        if (persistentHashSet == null) {
            return super.removeAll(collection);
        }
        DeltaCounter deltaCounter = new DeltaCounter(0, 1, (DefaultConstructorMarker) null);
        int size = size();
        Object E = this.f15071B.E(persistentHashSet.i(), 0, deltaCounter, this);
        int a2 = size - deltaCounter.a();
        if (a2 == 0) {
            clear();
        } else if (a2 != size) {
            Intrinsics.g(E, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSetBuilder>");
            this.f15071B = (TrieNode) E;
            n(a2);
        }
        return size != size();
    }

    public boolean retainAll(Collection collection) {
        PersistentHashSet persistentHashSet = collection instanceof PersistentHashSet ? (PersistentHashSet) collection : null;
        if (persistentHashSet == null) {
            PersistentHashSetBuilder persistentHashSetBuilder = collection instanceof PersistentHashSetBuilder ? (PersistentHashSetBuilder) collection : null;
            persistentHashSet = persistentHashSetBuilder != null ? persistentHashSetBuilder.d() : null;
        }
        if (persistentHashSet == null) {
            return super.retainAll(collection);
        }
        DeltaCounter deltaCounter = new DeltaCounter(0, 1, (DefaultConstructorMarker) null);
        int size = size();
        Object G = this.f15071B.G(persistentHashSet.i(), 0, deltaCounter, this);
        int a2 = deltaCounter.a();
        if (a2 == 0) {
            clear();
        } else if (a2 != size) {
            Intrinsics.g(G, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSetBuilder>");
            this.f15071B = (TrieNode) G;
            n(a2);
        }
        return size != size();
    }
}
