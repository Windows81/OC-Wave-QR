package kotlinx.collections.immutable.implementations.immutableSet;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlinx.collections.immutable.internal.CommonFunctionsKt;

@Metadata
public class PersistentHashSetIterator<E> implements Iterator<E>, KMappedMarker {

    /* renamed from: A  reason: collision with root package name */
    public int f41297A;

    /* renamed from: B  reason: collision with root package name */
    public boolean f41298B = true;

    /* renamed from: z  reason: collision with root package name */
    public final List f41299z;

    public PersistentHashSetIterator(TrieNode trieNode) {
        Intrinsics.i(trieNode, "node");
        List s2 = CollectionsKt.s(new TrieNodeIterator());
        this.f41299z = s2;
        TrieNodeIterator.i((TrieNodeIterator) s2.get(0), trieNode.l(), 0, 2, (Object) null);
        this.f41297A = 0;
        c();
    }

    private final void c() {
        if (!((TrieNodeIterator) this.f41299z.get(this.f41297A)).d()) {
            for (int i2 = this.f41297A; -1 < i2; i2--) {
                int f2 = f(i2);
                if (f2 == -1 && ((TrieNodeIterator) this.f41299z.get(i2)).c()) {
                    ((TrieNodeIterator) this.f41299z.get(i2)).f();
                    f2 = f(i2);
                }
                if (f2 != -1) {
                    this.f41297A = f2;
                    return;
                }
                if (i2 > 0) {
                    ((TrieNodeIterator) this.f41299z.get(i2 - 1)).f();
                }
                ((TrieNodeIterator) this.f41299z.get(i2)).h(TrieNode.f41300d.a().l(), 0);
            }
            this.f41298B = false;
        }
    }

    private final int f(int i2) {
        if (((TrieNodeIterator) this.f41299z.get(i2)).d()) {
            return i2;
        }
        if (!((TrieNodeIterator) this.f41299z.get(i2)).e()) {
            return -1;
        }
        TrieNode b2 = ((TrieNodeIterator) this.f41299z.get(i2)).b();
        int i3 = i2 + 1;
        if (i3 == this.f41299z.size()) {
            this.f41299z.add(new TrieNodeIterator());
        }
        TrieNodeIterator.i((TrieNodeIterator) this.f41299z.get(i3), b2.l(), 0, 2, (Object) null);
        return f(i3);
    }

    public final Object b() {
        CommonFunctionsKt.a(hasNext());
        return ((TrieNodeIterator) this.f41299z.get(this.f41297A)).a();
    }

    public final List e() {
        return this.f41299z;
    }

    public final void g(int i2) {
        this.f41297A = i2;
    }

    public boolean hasNext() {
        return this.f41298B;
    }

    public Object next() {
        if (this.f41298B) {
            Object g2 = ((TrieNodeIterator) this.f41299z.get(this.f41297A)).g();
            c();
            return g2;
        }
        throw new NoSuchElementException();
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
