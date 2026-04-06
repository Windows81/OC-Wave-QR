package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.AbstractSet;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class PersistentHashSet<E> extends AbstractSet<E> implements PersistentSet<E> {
    public static final Companion C = new Companion((DefaultConstructorMarker) null);
    public static final int D = 8;
    public static final PersistentHashSet E = new PersistentHashSet(TrieNode.f15076d.a(), 0);

    /* renamed from: A  reason: collision with root package name */
    public final TrieNode f15068A;

    /* renamed from: B  reason: collision with root package name */
    public final int f15069B;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public PersistentHashSet(TrieNode trieNode, int i2) {
        this.f15068A = trieNode;
        this.f15069B = i2;
    }

    public PersistentSet add(Object obj) {
        TrieNode b2 = this.f15068A.b(obj != null ? obj.hashCode() : 0, obj, 0);
        return this.f15068A == b2 ? this : new PersistentHashSet(b2, size() + 1);
    }

    public PersistentSet addAll(Collection collection) {
        PersistentSet.Builder l2 = l();
        l2.addAll(collection);
        return l2.d();
    }

    public boolean contains(Object obj) {
        return this.f15068A.i(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    public boolean containsAll(Collection collection) {
        return collection instanceof PersistentHashSet ? this.f15068A.j(((PersistentHashSet) collection).f15068A, 0) : collection instanceof PersistentHashSetBuilder ? this.f15068A.j(((PersistentHashSetBuilder) collection).i(), 0) : super.containsAll(collection);
    }

    public int g() {
        return this.f15069B;
    }

    public final TrieNode i() {
        return this.f15068A;
    }

    public Iterator iterator() {
        return new PersistentHashSetIterator(this.f15068A);
    }

    public PersistentSet.Builder l() {
        return new PersistentHashSetBuilder(this);
    }

    public PersistentSet remove(Object obj) {
        TrieNode J = this.f15068A.J(obj != null ? obj.hashCode() : 0, obj, 0);
        return this.f15068A == J ? this : new PersistentHashSet(J, size() - 1);
    }

    public PersistentSet removeAll(Collection collection) {
        PersistentSet.Builder l2 = l();
        l2.removeAll(collection);
        return l2.d();
    }
}
