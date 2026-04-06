package kotlinx.collections.immutable.implementations.immutableList;

import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.collections.AbstractList;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.PersistentList;

@Metadata
public abstract class AbstractPersistentList<E> extends AbstractList<E> implements PersistentList<E> {
    public PersistentList addAll(Collection collection) {
        Intrinsics.i(collection, "elements");
        PersistentList.Builder l2 = l();
        l2.addAll(collection);
        return l2.d();
    }

    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public boolean containsAll(Collection collection) {
        Intrinsics.i(collection, "elements");
        Iterable<Object> iterable = collection;
        if (((Collection) iterable).isEmpty()) {
            return true;
        }
        for (Object contains : iterable) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: i */
    public ImmutableList subList(int i2, int i3) {
        return PersistentList.DefaultImpls.a(this, i2, i3);
    }

    public Iterator iterator() {
        return listIterator();
    }

    public ListIterator listIterator() {
        return listIterator(0);
    }
}
