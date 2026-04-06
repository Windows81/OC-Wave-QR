package kotlinx.collections.immutable.implementations.immutableList;

import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableListIterator;
import kotlin.ranges.RangesKt;

@Metadata
public final class PersistentVectorMutableIterator<T> extends AbstractListIterator<T> implements ListIterator<T>, KMutableListIterator {

    /* renamed from: B  reason: collision with root package name */
    public final PersistentVectorBuilder f41254B;
    public int C;
    public TrieIterator D;
    public int E = -1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PersistentVectorMutableIterator(PersistentVectorBuilder persistentVectorBuilder, int i2) {
        super(i2, persistentVectorBuilder.size());
        Intrinsics.i(persistentVectorBuilder, "builder");
        this.f41254B = persistentVectorBuilder;
        this.C = persistentVectorBuilder.m();
        m();
    }

    private final void i() {
        if (this.C != this.f41254B.m()) {
            throw new ConcurrentModificationException();
        }
    }

    private final void j() {
        if (this.E == -1) {
            throw new IllegalStateException();
        }
    }

    private final void k() {
        h(this.f41254B.size());
        this.C = this.f41254B.m();
        this.E = -1;
        m();
    }

    private final void m() {
        Object[] n2 = this.f41254B.n();
        if (n2 == null) {
            this.D = null;
            return;
        }
        int c2 = UtilsKt.c(this.f41254B.size());
        int j2 = RangesKt.j(e(), c2);
        int o2 = (this.f41254B.o() / 5) + 1;
        TrieIterator trieIterator = this.D;
        if (trieIterator == null) {
            this.D = new TrieIterator(n2, j2, c2, o2);
            return;
        }
        Intrinsics.f(trieIterator);
        trieIterator.m(n2, j2, c2, o2);
    }

    public void add(Object obj) {
        i();
        this.f41254B.add(e(), obj);
        g(e() + 1);
        k();
    }

    public Object next() {
        i();
        b();
        this.E = e();
        TrieIterator trieIterator = this.D;
        if (trieIterator == null) {
            Object[] p2 = this.f41254B.p();
            int e2 = e();
            g(e2 + 1);
            return p2[e2];
        } else if (trieIterator.hasNext()) {
            g(e() + 1);
            return trieIterator.next();
        } else {
            Object[] p3 = this.f41254B.p();
            int e3 = e();
            g(e3 + 1);
            return p3[e3 - trieIterator.f()];
        }
    }

    public Object previous() {
        i();
        c();
        this.E = e() - 1;
        TrieIterator trieIterator = this.D;
        if (trieIterator == null) {
            Object[] p2 = this.f41254B.p();
            g(e() - 1);
            return p2[e()];
        } else if (e() > trieIterator.f()) {
            Object[] p3 = this.f41254B.p();
            g(e() - 1);
            return p3[e() - trieIterator.f()];
        } else {
            g(e() - 1);
            return trieIterator.previous();
        }
    }

    public void remove() {
        i();
        j();
        this.f41254B.remove(this.E);
        if (this.E < e()) {
            g(this.E);
        }
        k();
    }

    public void set(Object obj) {
        i();
        j();
        this.f41254B.set(this.E, obj);
        this.C = this.f41254B.m();
        m();
    }
}
