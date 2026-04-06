package kotlin.collections;

import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata
public final class ReversedListReadOnly$listIterator$1 implements ListIterator<T>, KMappedMarker {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ ReversedListReadOnly f40633A;

    /* renamed from: z  reason: collision with root package name */
    public final ListIterator f40634z;

    public ReversedListReadOnly$listIterator$1(ReversedListReadOnly reversedListReadOnly, int i2) {
        this.f40633A = reversedListReadOnly;
        this.f40634z = reversedListReadOnly.f40632A.listIterator(CollectionsKt__ReversedViewsKt.T(reversedListReadOnly, i2));
    }

    public void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean hasNext() {
        return this.f40634z.hasPrevious();
    }

    public boolean hasPrevious() {
        return this.f40634z.hasNext();
    }

    public Object next() {
        return this.f40634z.previous();
    }

    public int nextIndex() {
        return CollectionsKt__ReversedViewsKt.S(this.f40633A, this.f40634z.previousIndex());
    }

    public Object previous() {
        return this.f40634z.next();
    }

    public int previousIndex() {
        return CollectionsKt__ReversedViewsKt.S(this.f40633A, this.f40634z.nextIndex());
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
