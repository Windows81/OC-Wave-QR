package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.jvm.internal.markers.KMutableIterator;

@Metadata
public class PersistentHashMapBuilderBaseIterator<K, V, T> extends PersistentHashMapBaseIterator<K, V, T> implements Iterator<T>, KMutableIterator {
    public final PersistentHashMapBuilder C;
    public Object D;
    public boolean E;
    public int F;

    public PersistentHashMapBuilderBaseIterator(PersistentHashMapBuilder persistentHashMapBuilder, TrieNodeBaseIterator[] trieNodeBaseIteratorArr) {
        super(persistentHashMapBuilder.h(), trieNodeBaseIteratorArr);
        this.C = persistentHashMapBuilder;
        this.F = persistentHashMapBuilder.g();
    }

    private final void i() {
        if (this.C.g() != this.F) {
            throw new ConcurrentModificationException();
        }
    }

    public final void j() {
        if (!this.E) {
            throw new IllegalStateException();
        }
    }

    public final void k(int i2, TrieNode trieNode, Object obj, int i3) {
        int i4 = i3 * 5;
        if (i4 > 30) {
            f()[i3].m(trieNode.p(), trieNode.p().length, 0);
            while (!Intrinsics.d(f()[i3].b(), obj)) {
                f()[i3].i();
            }
            h(i3);
            return;
        }
        int f2 = 1 << TrieNodeKt.f(i2, i4);
        if (trieNode.q(f2)) {
            f()[i3].m(trieNode.p(), trieNode.m() * 2, trieNode.n(f2));
            h(i3);
            return;
        }
        int O = trieNode.O(f2);
        TrieNode N = trieNode.N(O);
        f()[i3].m(trieNode.p(), trieNode.m() * 2, O);
        k(i2, N, obj, i3 + 1);
    }

    public final void m(Object obj, Object obj2) {
        if (this.C.containsKey(obj)) {
            if (hasNext()) {
                Object c2 = c();
                this.C.put(obj, obj2);
                k(c2 != null ? c2.hashCode() : 0, this.C.h(), c2, 0);
            } else {
                this.C.put(obj, obj2);
            }
            this.F = this.C.g();
        }
    }

    public Object next() {
        i();
        this.D = c();
        this.E = true;
        return super.next();
    }

    public void remove() {
        j();
        if (hasNext()) {
            Object c2 = c();
            TypeIntrinsics.d(this.C).remove(this.D);
            k(c2 != null ? c2.hashCode() : 0, this.C.h(), c2, 0);
        } else {
            TypeIntrinsics.d(this.C).remove(this.D);
        }
        this.D = null;
        this.E = false;
        this.F = this.C.g();
    }
}
