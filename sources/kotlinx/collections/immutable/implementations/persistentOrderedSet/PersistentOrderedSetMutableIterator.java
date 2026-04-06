package kotlinx.collections.immutable.implementations.persistentOrderedSet;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.jvm.internal.markers.KMutableIterator;

@Metadata
public final class PersistentOrderedSetMutableIterator<E> extends PersistentOrderedSetIterator<E> implements Iterator<E>, KMutableIterator {
    public final PersistentOrderedSetBuilder C;
    public Object D;
    public boolean E;
    public int F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PersistentOrderedSetMutableIterator(PersistentOrderedSetBuilder persistentOrderedSetBuilder) {
        super(persistentOrderedSetBuilder.g(), persistentOrderedSetBuilder.h());
        Intrinsics.i(persistentOrderedSetBuilder, "builder");
        this.C = persistentOrderedSetBuilder;
        this.F = persistentOrderedSetBuilder.h().g();
    }

    private final void f() {
        if (this.C.h().g() != this.F) {
            throw new ConcurrentModificationException();
        }
    }

    private final void g() {
        if (!this.E) {
            throw new IllegalStateException();
        }
    }

    public Object next() {
        f();
        Object next = super.next();
        this.D = next;
        this.E = true;
        return next;
    }

    public void remove() {
        g();
        PersistentOrderedSetBuilder persistentOrderedSetBuilder = this.C;
        TypeIntrinsics.a(persistentOrderedSetBuilder).remove(this.D);
        this.D = null;
        this.E = false;
        this.F = this.C.h().g();
        e(c() - 1);
    }
}
