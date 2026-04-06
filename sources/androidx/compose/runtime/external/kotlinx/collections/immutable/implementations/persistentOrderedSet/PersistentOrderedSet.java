package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.EndOfChain;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.AbstractSet;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class PersistentOrderedSet<E> extends AbstractSet<E> implements PersistentSet<E> {
    public static final Companion D = new Companion((DefaultConstructorMarker) null);
    public static final int E = 8;
    public static final PersistentOrderedSet F;

    /* renamed from: A  reason: collision with root package name */
    public final Object f15112A;

    /* renamed from: B  reason: collision with root package name */
    public final Object f15113B;
    public final PersistentHashMap C;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final PersistentSet a() {
            return PersistentOrderedSet.F;
        }

        public Companion() {
        }
    }

    static {
        EndOfChain endOfChain = EndOfChain.f15121a;
        F = new PersistentOrderedSet(endOfChain, endOfChain, PersistentHashMap.E.a());
    }

    public PersistentOrderedSet(Object obj, Object obj2, PersistentHashMap persistentHashMap) {
        this.f15112A = obj;
        this.f15113B = obj2;
        this.C = persistentHashMap;
    }

    public PersistentSet add(Object obj) {
        if (this.C.containsKey(obj)) {
            return this;
        }
        if (isEmpty()) {
            return new PersistentOrderedSet(obj, obj, this.C.t(obj, new Links()));
        }
        Object obj2 = this.f15113B;
        Object obj3 = this.C.get(obj2);
        Intrinsics.f(obj3);
        return new PersistentOrderedSet(this.f15112A, obj, this.C.t(obj2, ((Links) obj3).e(obj)).t(obj, new Links(obj2)));
    }

    public PersistentSet addAll(Collection collection) {
        PersistentSet.Builder l2 = l();
        l2.addAll(collection);
        return l2.d();
    }

    public boolean contains(Object obj) {
        return this.C.containsKey(obj);
    }

    public int g() {
        return this.C.size();
    }

    public Iterator iterator() {
        return new PersistentOrderedSetIterator(this.f15112A, this.C);
    }

    public PersistentSet.Builder l() {
        return new PersistentOrderedSetBuilder(this);
    }

    public final Object m() {
        return this.f15112A;
    }

    public final PersistentHashMap n() {
        return this.C;
    }

    public final Object o() {
        return this.f15113B;
    }

    public PersistentSet remove(Object obj) {
        Links links = (Links) this.C.get(obj);
        if (links == null) {
            return this;
        }
        PersistentHashMap u2 = this.C.u(obj);
        if (links.b()) {
            Object obj2 = u2.get(links.d());
            Intrinsics.f(obj2);
            u2 = u2.t(links.d(), ((Links) obj2).e(links.c()));
        }
        if (links.a()) {
            Object obj3 = u2.get(links.c());
            Intrinsics.f(obj3);
            u2 = u2.t(links.c(), ((Links) obj3).f(links.d()));
        }
        return new PersistentOrderedSet(!links.b() ? links.c() : this.f15112A, !links.a() ? links.d() : this.f15113B, u2);
    }

    public PersistentSet removeAll(Collection collection) {
        PersistentSet.Builder l2 = l();
        l2.removeAll(collection);
        return l2.d();
    }
}
