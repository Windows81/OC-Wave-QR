package kotlinx.collections.immutable.implementations.persistentOrderedSet;

import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.AbstractMutableSet;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.PersistentSet;
import kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder;
import kotlinx.collections.immutable.internal.EndOfChain;

@Metadata
public final class PersistentOrderedSetBuilder<E> extends AbstractMutableSet<E> implements PersistentSet.Builder<E> {

    /* renamed from: A  reason: collision with root package name */
    public Object f41347A;

    /* renamed from: B  reason: collision with root package name */
    public final PersistentHashMapBuilder f41348B;

    /* renamed from: z  reason: collision with root package name */
    public Object f41349z;

    public boolean add(Object obj) {
        if (this.f41348B.containsKey(obj)) {
            return false;
        }
        if (isEmpty()) {
            this.f41349z = obj;
            this.f41347A = obj;
            this.f41348B.put(obj, new Links());
            return true;
        }
        Object obj2 = this.f41348B.get(this.f41347A);
        Intrinsics.f(obj2);
        this.f41348B.put(this.f41347A, ((Links) obj2).e(obj));
        this.f41348B.put(obj, new Links(this.f41347A));
        this.f41347A = obj;
        return true;
    }

    public void clear() {
        this.f41348B.clear();
        EndOfChain endOfChain = EndOfChain.f41356a;
        this.f41349z = endOfChain;
        this.f41347A = endOfChain;
    }

    public boolean contains(Object obj) {
        return this.f41348B.containsKey(obj);
    }

    public int e() {
        return this.f41348B.size();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (size() != set.size()) {
            return false;
        }
        return set instanceof PersistentOrderedSet ? this.f41348B.h().k(((PersistentOrderedSet) obj).i().q(), PersistentOrderedSetBuilder$equals$1.f41350z) : set instanceof PersistentOrderedSetBuilder ? this.f41348B.h().k(((PersistentOrderedSetBuilder) obj).f41348B.h(), PersistentOrderedSetBuilder$equals$2.f41351z) : super.equals(obj);
    }

    public final Object g() {
        return this.f41349z;
    }

    public final PersistentHashMapBuilder h() {
        return this.f41348B;
    }

    public int hashCode() {
        return super.hashCode();
    }

    public Iterator iterator() {
        return new PersistentOrderedSetMutableIterator(this);
    }

    public boolean remove(Object obj) {
        Links links = (Links) this.f41348B.remove(obj);
        if (links == null) {
            return false;
        }
        if (links.b()) {
            Object obj2 = this.f41348B.get(links.d());
            Intrinsics.f(obj2);
            this.f41348B.put(links.d(), ((Links) obj2).e(links.c()));
        } else {
            this.f41349z = links.c();
        }
        if (links.a()) {
            Object obj3 = this.f41348B.get(links.c());
            Intrinsics.f(obj3);
            this.f41348B.put(links.c(), ((Links) obj3).f(links.d()));
            return true;
        }
        this.f41347A = links.d();
        return true;
    }
}
