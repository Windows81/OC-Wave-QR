package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableListIterator;
import kotlin.ranges.RangesKt;

@Metadata
public final class PersistentVectorMutableIterator<T> extends AbstractListIterator<T> implements ListIterator<T>, KMutableListIterator {

    /* renamed from: B  reason: collision with root package name */
    public final PersistentVectorBuilder f15035B;
    public int C;
    public TrieIterator D;
    public int E = -1;

    public PersistentVectorMutableIterator(PersistentVectorBuilder persistentVectorBuilder, int i2) {
        super(i2, persistentVectorBuilder.size());
        this.f15035B = persistentVectorBuilder;
        this.C = persistentVectorBuilder.n();
        m();
    }

    private final void k() {
        h(this.f15035B.size());
        this.C = this.f15035B.n();
        this.E = -1;
        m();
    }

    public void add(Object obj) {
        i();
        this.f15035B.add(e(), obj);
        g(e() + 1);
        k();
    }

    public final void i() {
        if (this.C != this.f15035B.n()) {
            throw new ConcurrentModificationException();
        }
    }

    public final void j() {
        if (this.E == -1) {
            throw new IllegalStateException();
        }
    }

    public final void m() {
        Object[] o2 = this.f15035B.o();
        if (o2 == null) {
            this.D = null;
            return;
        }
        int d2 = UtilsKt.d(this.f15035B.size());
        int j2 = RangesKt.j(e(), d2);
        int p2 = (this.f15035B.p() / 5) + 1;
        TrieIterator trieIterator = this.D;
        if (trieIterator == null) {
            this.D = new TrieIterator(o2, j2, d2, p2);
            return;
        }
        Intrinsics.f(trieIterator);
        trieIterator.m(o2, j2, d2, p2);
    }

    public Object next() {
        i();
        b();
        this.E = e();
        TrieIterator trieIterator = this.D;
        if (trieIterator == null) {
            Object[] q2 = this.f15035B.q();
            int e2 = e();
            g(e2 + 1);
            return q2[e2];
        } else if (trieIterator.hasNext()) {
            g(e() + 1);
            return trieIterator.next();
        } else {
            Object[] q3 = this.f15035B.q();
            int e3 = e();
            g(e3 + 1);
            return q3[e3 - trieIterator.f()];
        }
    }

    public Object previous() {
        i();
        c();
        this.E = e() - 1;
        TrieIterator trieIterator = this.D;
        if (trieIterator == null) {
            Object[] q2 = this.f15035B.q();
            g(e() - 1);
            return q2[e()];
        } else if (e() > trieIterator.f()) {
            Object[] q3 = this.f15035B.q();
            g(e() - 1);
            return q3[e() - trieIterator.f()];
        } else {
            g(e() - 1);
            return trieIterator.previous();
        }
    }

    public void remove() {
        i();
        j();
        this.f15035B.remove(this.E);
        if (this.E < e()) {
            g(this.E);
        }
        k();
    }

    public void set(Object obj) {
        i();
        j();
        this.f15035B.set(this.E, obj);
        this.C = this.f15035B.n();
        m();
    }
}
