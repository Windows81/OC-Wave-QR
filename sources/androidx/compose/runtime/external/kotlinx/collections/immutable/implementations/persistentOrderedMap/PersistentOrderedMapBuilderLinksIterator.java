package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.EndOfChain;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.jvm.internal.markers.KMutableIterator;

@Metadata
public class PersistentOrderedMapBuilderLinksIterator<K, V> implements Iterator<LinkedValue<V>>, KMutableIterator {

    /* renamed from: A  reason: collision with root package name */
    public final PersistentOrderedMapBuilder f15096A;

    /* renamed from: B  reason: collision with root package name */
    public Object f15097B = EndOfChain.f15121a;
    public boolean C;
    public int D;
    public int E;

    /* renamed from: z  reason: collision with root package name */
    public Object f15098z;

    public PersistentOrderedMapBuilderLinksIterator(Object obj, PersistentOrderedMapBuilder persistentOrderedMapBuilder) {
        this.f15098z = obj;
        this.f15096A = persistentOrderedMapBuilder;
        this.D = persistentOrderedMapBuilder.g().g();
    }

    private final void b() {
        if (this.f15096A.g().g() != this.D) {
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
        return this.f15096A;
    }

    public final Object g() {
        return this.f15097B;
    }

    /* renamed from: h */
    public LinkedValue next() {
        b();
        c();
        this.f15097B = this.f15098z;
        this.C = true;
        this.E++;
        Object obj = this.f15096A.g().get(this.f15098z);
        if (obj != null) {
            LinkedValue linkedValue = (LinkedValue) obj;
            this.f15098z = linkedValue.c();
            return linkedValue;
        }
        throw new ConcurrentModificationException("Hash code of a key (" + this.f15098z + ") has changed after it was added to the persistent map.");
    }

    public boolean hasNext() {
        return this.E < this.f15096A.size();
    }

    public void remove() {
        e();
        TypeIntrinsics.d(this.f15096A).remove(this.f15097B);
        this.f15097B = null;
        this.C = false;
        this.D = this.f15096A.g().g();
        this.E--;
    }
}
