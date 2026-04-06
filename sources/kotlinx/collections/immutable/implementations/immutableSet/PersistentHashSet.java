package kotlinx.collections.immutable.implementations.immutableSet;

import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.AbstractSet;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.PersistentSet;

@Metadata
public final class PersistentHashSet<E> extends AbstractSet<E> implements PersistentSet<E> {
    public static final Companion C = new Companion((DefaultConstructorMarker) null);
    public static final PersistentHashSet D = new PersistentHashSet(TrieNode.f41300d.a(), 0);

    /* renamed from: A  reason: collision with root package name */
    public final TrieNode f41292A;

    /* renamed from: B  reason: collision with root package name */
    public final int f41293B;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public PersistentHashSet(TrieNode trieNode, int i2) {
        Intrinsics.i(trieNode, "node");
        this.f41292A = trieNode;
        this.f41293B = i2;
    }

    public boolean contains(Object obj) {
        return this.f41292A.g(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    public boolean containsAll(Collection collection) {
        Intrinsics.i(collection, "elements");
        return collection instanceof PersistentHashSet ? this.f41292A.h(((PersistentHashSet) collection).f41292A, 0) : collection instanceof PersistentHashSetBuilder ? this.f41292A.h(((PersistentHashSetBuilder) collection).i(), 0) : super.containsAll(collection);
    }

    public int g() {
        return this.f41293B;
    }

    public final TrieNode i() {
        return this.f41292A;
    }

    public Iterator iterator() {
        return new PersistentHashSetIterator(this.f41292A);
    }
}
