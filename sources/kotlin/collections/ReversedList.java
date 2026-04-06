package kotlin.collections;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;

@Metadata
final class ReversedList<T> extends AbstractMutableList<T> {

    /* renamed from: z  reason: collision with root package name */
    public final List f40629z;

    public void add(int i2, Object obj) {
        this.f40629z.add(CollectionsKt__ReversedViewsKt.T(this, i2), obj);
    }

    public void clear() {
        this.f40629z.clear();
    }

    public int e() {
        return this.f40629z.size();
    }

    public Object g(int i2) {
        return this.f40629z.remove(CollectionsKt__ReversedViewsKt.R(this, i2));
    }

    public Object get(int i2) {
        return this.f40629z.get(CollectionsKt__ReversedViewsKt.R(this, i2));
    }

    public Iterator iterator() {
        return listIterator(0);
    }

    public ListIterator listIterator() {
        return listIterator(0);
    }

    public Object set(int i2, Object obj) {
        return this.f40629z.set(CollectionsKt__ReversedViewsKt.R(this, i2), obj);
    }

    public ListIterator listIterator(int i2) {
        return new ReversedList$listIterator$1(this, i2);
    }
}
