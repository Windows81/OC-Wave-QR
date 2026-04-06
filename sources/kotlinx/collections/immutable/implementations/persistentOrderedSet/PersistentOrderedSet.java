package kotlinx.collections.immutable.implementations.persistentOrderedSet;

import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.AbstractSet;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.PersistentSet;
import kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap;
import kotlinx.collections.immutable.internal.EndOfChain;

@Metadata
public final class PersistentOrderedSet<E> extends AbstractSet<E> implements PersistentSet<E> {
    public static final Companion D = new Companion((DefaultConstructorMarker) null);
    public static final PersistentOrderedSet E;

    /* renamed from: A  reason: collision with root package name */
    public final Object f41343A;

    /* renamed from: B  reason: collision with root package name */
    public final Object f41344B;
    public final PersistentHashMap C;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    static {
        EndOfChain endOfChain = EndOfChain.f41356a;
        E = new PersistentOrderedSet(endOfChain, endOfChain, PersistentHashMap.E.a());
    }

    public PersistentOrderedSet(Object obj, Object obj2, PersistentHashMap persistentHashMap) {
        Intrinsics.i(persistentHashMap, "hashMap");
        this.f41343A = obj;
        this.f41344B = obj2;
        this.C = persistentHashMap;
    }

    public boolean contains(Object obj) {
        return this.C.containsKey(obj);
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
        return set instanceof PersistentOrderedSet ? this.C.q().k(((PersistentOrderedSet) obj).C.q(), PersistentOrderedSet$equals$1.f41345z) : set instanceof PersistentOrderedSetBuilder ? this.C.q().k(((PersistentOrderedSetBuilder) obj).h().h(), PersistentOrderedSet$equals$2.f41346z) : super.equals(obj);
    }

    public int g() {
        return this.C.size();
    }

    public int hashCode() {
        return super.hashCode();
    }

    public final PersistentHashMap i() {
        return this.C;
    }

    public Iterator iterator() {
        return new PersistentOrderedSetIterator(this.f41343A, this.C);
    }
}
