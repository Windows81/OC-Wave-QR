package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.EndOfChain;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.AbstractMutableSet;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class PersistentOrderedSetBuilder<E> extends AbstractMutableSet<E> implements PersistentSet.Builder<E> {

    /* renamed from: A  reason: collision with root package name */
    public Object f15114A;

    /* renamed from: B  reason: collision with root package name */
    public Object f15115B = this.f15116z.o();
    public final PersistentHashMapBuilder C = this.f15116z.n().l();

    /* renamed from: z  reason: collision with root package name */
    public PersistentOrderedSet f15116z;

    public PersistentOrderedSetBuilder(PersistentOrderedSet persistentOrderedSet) {
        this.f15116z = persistentOrderedSet;
        this.f15114A = persistentOrderedSet.m();
    }

    public boolean add(Object obj) {
        if (this.C.containsKey(obj)) {
            return false;
        }
        if (isEmpty()) {
            this.f15114A = obj;
            this.f15115B = obj;
            this.C.put(obj, new Links());
            return true;
        }
        Object obj2 = this.C.get(this.f15115B);
        Intrinsics.f(obj2);
        this.C.put(this.f15115B, ((Links) obj2).e(obj));
        this.C.put(obj, new Links(this.f15115B));
        this.f15115B = obj;
        return true;
    }

    public void clear() {
        this.C.clear();
        EndOfChain endOfChain = EndOfChain.f15121a;
        this.f15114A = endOfChain;
        this.f15115B = endOfChain;
    }

    public boolean contains(Object obj) {
        return this.C.containsKey(obj);
    }

    public PersistentSet d() {
        PersistentOrderedSet persistentOrderedSet;
        PersistentHashMap f2 = this.C.d();
        if (f2 == this.f15116z.n()) {
            boolean z2 = false;
            CommonFunctionsKt.a(this.f15114A == this.f15116z.m());
            if (this.f15115B == this.f15116z.o()) {
                z2 = true;
            }
            CommonFunctionsKt.a(z2);
            persistentOrderedSet = this.f15116z;
        } else {
            persistentOrderedSet = new PersistentOrderedSet(this.f15114A, this.f15115B, f2);
        }
        this.f15116z = persistentOrderedSet;
        return persistentOrderedSet;
    }

    public int e() {
        return this.C.size();
    }

    public final Object g() {
        return this.f15114A;
    }

    public final PersistentHashMapBuilder h() {
        return this.C;
    }

    public Iterator iterator() {
        return new PersistentOrderedSetMutableIterator(this);
    }

    public boolean remove(Object obj) {
        Links links = (Links) this.C.remove(obj);
        if (links == null) {
            return false;
        }
        if (links.b()) {
            Object obj2 = this.C.get(links.d());
            Intrinsics.f(obj2);
            this.C.put(links.d(), ((Links) obj2).e(links.c()));
        } else {
            this.f15114A = links.c();
        }
        if (links.a()) {
            Object obj3 = this.C.get(links.c());
            Intrinsics.f(obj3);
            this.C.put(links.c(), ((Links) obj3).f(links.d()));
            return true;
        }
        this.f15115B = links.d();
        return true;
    }
}
