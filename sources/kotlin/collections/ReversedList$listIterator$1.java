package kotlin.collections;

import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMutableListIterator;

@Metadata
public final class ReversedList$listIterator$1 implements ListIterator<T>, KMutableListIterator {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ ReversedList f40630A;

    /* renamed from: z  reason: collision with root package name */
    public final ListIterator f40631z;

    public ReversedList$listIterator$1(ReversedList reversedList, int i2) {
        this.f40630A = reversedList;
        this.f40631z = reversedList.f40629z.listIterator(CollectionsKt__ReversedViewsKt.T(reversedList, i2));
    }

    public void add(Object obj) {
        this.f40631z.add(obj);
        this.f40631z.previous();
    }

    public boolean hasNext() {
        return this.f40631z.hasPrevious();
    }

    public boolean hasPrevious() {
        return this.f40631z.hasNext();
    }

    public Object next() {
        return this.f40631z.previous();
    }

    public int nextIndex() {
        return CollectionsKt__ReversedViewsKt.S(this.f40630A, this.f40631z.previousIndex());
    }

    public Object previous() {
        return this.f40631z.next();
    }

    public int previousIndex() {
        return CollectionsKt__ReversedViewsKt.S(this.f40630A, this.f40631z.nextIndex());
    }

    public void remove() {
        this.f40631z.remove();
    }

    public void set(Object obj) {
        this.f40631z.set(obj);
    }
}
