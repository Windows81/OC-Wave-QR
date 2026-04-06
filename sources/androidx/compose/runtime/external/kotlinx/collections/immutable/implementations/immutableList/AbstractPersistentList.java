package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableList;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList;
import c.a;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.collections.AbstractList;

@Metadata
public abstract class AbstractPersistentList<E> extends AbstractList<E> implements PersistentList<E> {
    public static final boolean m(Collection collection, Object obj) {
        return collection.contains(obj);
    }

    public PersistentList addAll(Collection collection) {
        PersistentList.Builder l2 = l();
        l2.addAll(collection);
        return l2.d();
    }

    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public boolean containsAll(Collection collection) {
        Iterable<Object> iterable = collection;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return true;
        }
        for (Object contains : iterable) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public Iterator iterator() {
        return listIterator();
    }

    public ListIterator listIterator() {
        return listIterator(0);
    }

    public PersistentList remove(Object obj) {
        int indexOf = indexOf(obj);
        return indexOf != -1 ? w0(indexOf) : this;
    }

    public PersistentList removeAll(Collection collection) {
        return H0(new a(collection));
    }

    public ImmutableList subList(int i2, int i3) {
        return super.subList(i2, i3);
    }
}
