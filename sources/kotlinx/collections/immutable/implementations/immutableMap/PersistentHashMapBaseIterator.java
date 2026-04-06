package kotlinx.collections.immutable.implementations.immutableMap;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata
public abstract class PersistentHashMapBaseIterator<K, V, T> implements Iterator<T>, KMappedMarker {

    /* renamed from: A  reason: collision with root package name */
    public int f41266A;

    /* renamed from: B  reason: collision with root package name */
    public boolean f41267B = true;

    /* renamed from: z  reason: collision with root package name */
    public final TrieNodeBaseIterator[] f41268z;

    public PersistentHashMapBaseIterator(TrieNode trieNode, TrieNodeBaseIterator[] trieNodeBaseIteratorArr) {
        Intrinsics.i(trieNode, "node");
        Intrinsics.i(trieNodeBaseIteratorArr, "path");
        this.f41268z = trieNodeBaseIteratorArr;
        trieNodeBaseIteratorArr[0].k(trieNode.m(), trieNode.i() * 2);
        this.f41266A = 0;
        e();
    }

    private final void b() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
    }

    private final void e() {
        if (!this.f41268z[this.f41266A].g()) {
            for (int i2 = this.f41266A; -1 < i2; i2--) {
                int g2 = g(i2);
                if (g2 == -1 && this.f41268z[i2].h()) {
                    this.f41268z[i2].j();
                    g2 = g(i2);
                }
                if (g2 != -1) {
                    this.f41266A = g2;
                    return;
                }
                if (i2 > 0) {
                    this.f41268z[i2 - 1].j();
                }
                this.f41268z[i2].k(TrieNode.f41283e.a().m(), 0);
            }
            this.f41267B = false;
        }
    }

    private final int g(int i2) {
        if (this.f41268z[i2].g()) {
            return i2;
        }
        if (!this.f41268z[i2].h()) {
            return -1;
        }
        TrieNode c2 = this.f41268z[i2].c();
        if (i2 == 6) {
            this.f41268z[i2 + 1].k(c2.m(), c2.m().length);
        } else {
            this.f41268z[i2 + 1].k(c2.m(), c2.i() * 2);
        }
        return g(i2 + 1);
    }

    public final Object c() {
        b();
        return this.f41268z[this.f41266A].b();
    }

    public final TrieNodeBaseIterator[] f() {
        return this.f41268z;
    }

    public final void h(int i2) {
        this.f41266A = i2;
    }

    public boolean hasNext() {
        return this.f41267B;
    }

    public Object next() {
        b();
        Object next = this.f41268z[this.f41266A].next();
        e();
        return next;
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
