package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata
public class PersistentHashSetIterator<E> implements Iterator<E>, KMappedMarker {

    /* renamed from: A  reason: collision with root package name */
    public int f15073A;

    /* renamed from: B  reason: collision with root package name */
    public boolean f15074B = true;

    /* renamed from: z  reason: collision with root package name */
    public final List f15075z;

    public PersistentHashSetIterator(TrieNode trieNode) {
        List s2 = CollectionsKt.s(new TrieNodeIterator());
        this.f15075z = s2;
        TrieNodeIterator.i((TrieNodeIterator) s2.get(0), trieNode.n(), 0, 2, (Object) null);
        this.f15073A = 0;
        c();
    }

    private final int f(int i2) {
        if (((TrieNodeIterator) this.f15075z.get(i2)).d()) {
            return i2;
        }
        if (!((TrieNodeIterator) this.f15075z.get(i2)).e()) {
            return -1;
        }
        TrieNode b2 = ((TrieNodeIterator) this.f15075z.get(i2)).b();
        int i3 = i2 + 1;
        if (i3 == this.f15075z.size()) {
            this.f15075z.add(new TrieNodeIterator());
        }
        TrieNodeIterator.i((TrieNodeIterator) this.f15075z.get(i3), b2.n(), 0, 2, (Object) null);
        return f(i3);
    }

    public final Object b() {
        CommonFunctionsKt.a(hasNext());
        return ((TrieNodeIterator) this.f15075z.get(this.f15073A)).a();
    }

    public final void c() {
        if (!((TrieNodeIterator) this.f15075z.get(this.f15073A)).d()) {
            for (int i2 = this.f15073A; -1 < i2; i2--) {
                int f2 = f(i2);
                if (f2 == -1 && ((TrieNodeIterator) this.f15075z.get(i2)).c()) {
                    ((TrieNodeIterator) this.f15075z.get(i2)).f();
                    f2 = f(i2);
                }
                if (f2 != -1) {
                    this.f15073A = f2;
                    return;
                }
                if (i2 > 0) {
                    ((TrieNodeIterator) this.f15075z.get(i2 - 1)).f();
                }
                ((TrieNodeIterator) this.f15075z.get(i2)).h(TrieNode.f15076d.a().n(), 0);
            }
            this.f15074B = false;
        }
    }

    public final List e() {
        return this.f15075z;
    }

    public final void g(int i2) {
        this.f15073A = i2;
    }

    public boolean hasNext() {
        return this.f15074B;
    }

    public Object next() {
        if (this.f15074B) {
            Object g2 = ((TrieNodeIterator) this.f15075z.get(this.f15073A)).g();
            c();
            return g2;
        }
        throw new NoSuchElementException();
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
