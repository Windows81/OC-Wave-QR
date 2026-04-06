package kotlinx.collections.immutable.implementations.immutableSet;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.jvm.internal.markers.KMutableIterator;
import kotlinx.collections.immutable.internal.CommonFunctionsKt;

@Metadata
public final class PersistentHashSetMutableIterator<E> extends PersistentHashSetIterator<E> implements Iterator<E>, KMutableIterator {
    public final PersistentHashSetBuilder C;
    public Object D;
    public boolean E;
    public int F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PersistentHashSetMutableIterator(PersistentHashSetBuilder persistentHashSetBuilder) {
        super(persistentHashSetBuilder.i());
        Intrinsics.i(persistentHashSetBuilder, "builder");
        this.C = persistentHashSetBuilder;
        this.F = persistentHashSetBuilder.h();
    }

    private final void h() {
        if (this.C.h() != this.F) {
            throw new ConcurrentModificationException();
        }
    }

    private final void i() {
        if (!this.E) {
            throw new IllegalStateException();
        }
    }

    public final boolean j(TrieNode trieNode) {
        return trieNode.k() == 0;
    }

    public final void k(int i2, TrieNode trieNode, Object obj, int i3) {
        boolean z2 = true;
        if (j(trieNode)) {
            int t0 = ArraysKt.t0(trieNode.l(), obj);
            if (t0 == -1) {
                z2 = false;
            }
            CommonFunctionsKt.a(z2);
            ((TrieNodeIterator) e().get(i3)).h(trieNode.l(), t0);
            g(i3);
            return;
        }
        int n2 = trieNode.n(1 << TrieNodeKt.d(i2, i3 * 5));
        ((TrieNodeIterator) e().get(i3)).h(trieNode.l(), n2);
        Object obj2 = trieNode.l()[n2];
        if (obj2 instanceof TrieNode) {
            k(i2, (TrieNode) obj2, obj, i3 + 1);
        } else {
            g(i3);
        }
    }

    public Object next() {
        h();
        Object next = super.next();
        this.D = next;
        this.E = true;
        return next;
    }

    public void remove() {
        i();
        if (hasNext()) {
            Object b2 = b();
            TypeIntrinsics.a(this.C).remove(this.D);
            k(b2 != null ? b2.hashCode() : 0, this.C.i(), b2, 0);
        } else {
            TypeIntrinsics.a(this.C).remove(this.D);
        }
        this.D = null;
        this.E = false;
        this.F = this.C.h();
    }
}
