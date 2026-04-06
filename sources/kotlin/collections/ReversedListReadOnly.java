package kotlin.collections;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
class ReversedListReadOnly<T> extends AbstractList<T> {

    /* renamed from: A  reason: collision with root package name */
    public final List f40632A;

    public ReversedListReadOnly(List list) {
        Intrinsics.i(list, "delegate");
        this.f40632A = list;
    }

    public int g() {
        return this.f40632A.size();
    }

    public Object get(int i2) {
        return this.f40632A.get(CollectionsKt__ReversedViewsKt.R(this, i2));
    }

    public Iterator iterator() {
        return listIterator(0);
    }

    public ListIterator listIterator() {
        return listIterator(0);
    }

    public ListIterator listIterator(int i2) {
        return new ReversedListReadOnly$listIterator$1(this, i2);
    }
}
