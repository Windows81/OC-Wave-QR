package kotlinx.collections.immutable.implementations.persistentOrderedMap;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.jvm.internal.markers.KMutableIterator;
import kotlinx.collections.immutable.internal.EndOfChain;

@Metadata
public class PersistentOrderedMapBuilderLinksIterator<K, V> implements Iterator<LinkedValue<V>>, KMutableIterator {

    /* renamed from: A  reason: collision with root package name */
    public final PersistentOrderedMapBuilder f41327A;

    /* renamed from: B  reason: collision with root package name */
    public Object f41328B = EndOfChain.f41356a;
    public boolean C;
    public int D;
    public int E;

    /* renamed from: z  reason: collision with root package name */
    public Object f41329z;

    public PersistentOrderedMapBuilderLinksIterator(Object obj, PersistentOrderedMapBuilder persistentOrderedMapBuilder) {
        Intrinsics.i(persistentOrderedMapBuilder, "builder");
        this.f41329z = obj;
        this.f41327A = persistentOrderedMapBuilder;
        this.D = persistentOrderedMapBuilder.g().g();
    }

    private final void b() {
        if (this.f41327A.g().g() != this.D) {
            throw new ConcurrentModificationException();
        }
    }

    private final void c() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
    }

    private final void e() {
        if (!this.C) {
            throw new IllegalStateException();
        }
    }

    public final PersistentOrderedMapBuilder f() {
        return this.f41327A;
    }

    public final Object g() {
        return this.f41328B;
    }

    /* renamed from: h */
    public LinkedValue next() {
        b();
        c();
        this.f41328B = this.f41329z;
        this.C = true;
        this.E++;
        Object obj = this.f41327A.g().get(this.f41329z);
        if (obj != null) {
            LinkedValue linkedValue = (LinkedValue) obj;
            this.f41329z = linkedValue.c();
            return linkedValue;
        }
        throw new ConcurrentModificationException("Hash code of a key (" + this.f41329z + ") has changed after it was added to the persistent map.");
    }

    public boolean hasNext() {
        return this.E < this.f41327A.size();
    }

    public void remove() {
        e();
        TypeIntrinsics.d(this.f41327A).remove(this.f41328B);
        this.f41328B = null;
        this.C = false;
        this.D = this.f41327A.g().g();
        this.E--;
    }
}
