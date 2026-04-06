package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata
public abstract class PersistentHashMapBaseIterator<K, V, T> implements Iterator<T>, KMappedMarker {

    /* renamed from: A  reason: collision with root package name */
    public int f15043A;

    /* renamed from: B  reason: collision with root package name */
    public boolean f15044B = true;

    /* renamed from: z  reason: collision with root package name */
    public final TrieNodeBaseIterator[] f15045z;

    public PersistentHashMapBaseIterator(TrieNode trieNode, TrieNodeBaseIterator[] trieNodeBaseIteratorArr) {
        this.f15045z = trieNodeBaseIteratorArr;
        trieNodeBaseIteratorArr[0].k(trieNode.p(), trieNode.m() * 2);
        this.f15043A = 0;
        e();
    }

    public final void b() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
    }

    public final Object c() {
        b();
        return this.f15045z[this.f15043A].b();
    }

    public final void e() {
        if (!this.f15045z[this.f15043A].g()) {
            for (int i2 = this.f15043A; -1 < i2; i2--) {
                int g2 = g(i2);
                if (g2 == -1 && this.f15045z[i2].h()) {
                    this.f15045z[i2].j();
                    g2 = g(i2);
                }
                if (g2 != -1) {
                    this.f15043A = g2;
                    return;
                }
                if (i2 > 0) {
                    this.f15045z[i2 - 1].j();
                }
                this.f15045z[i2].k(TrieNode.f15056e.a().p(), 0);
            }
            this.f15044B = false;
        }
    }

    public final TrieNodeBaseIterator[] f() {
        return this.f15045z;
    }

    public final int g(int i2) {
        if (this.f15045z[i2].g()) {
            return i2;
        }
        if (!this.f15045z[i2].h()) {
            return -1;
        }
        TrieNode c2 = this.f15045z[i2].c();
        if (i2 == 6) {
            this.f15045z[i2 + 1].k(c2.p(), c2.p().length);
        } else {
            this.f15045z[i2 + 1].k(c2.p(), c2.m() * 2);
        }
        return g(i2 + 1);
    }

    public final void h(int i2) {
        this.f15043A = i2;
    }

    public boolean hasNext() {
        return this.f15044B;
    }

    public Object next() {
        b();
        Object next = this.f15045z[this.f15043A].next();
        e();
        return next;
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
