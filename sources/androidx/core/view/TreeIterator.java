package androidx.core.view;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata
public final class TreeIterator<T> implements Iterator<T>, KMappedMarker {

    /* renamed from: A  reason: collision with root package name */
    public final List f20251A = new ArrayList();

    /* renamed from: B  reason: collision with root package name */
    public Iterator f20252B;

    /* renamed from: z  reason: collision with root package name */
    public final Function1 f20253z;

    public TreeIterator(Iterator it, Function1 function1) {
        this.f20253z = function1;
        this.f20252B = it;
    }

    public final void b(Object obj) {
        Iterator it = (Iterator) this.f20253z.invoke(obj);
        if (it == null || !it.hasNext()) {
            while (!this.f20252B.hasNext() && !this.f20251A.isEmpty()) {
                this.f20252B = (Iterator) CollectionsKt.p0(this.f20251A);
                CollectionsKt.K(this.f20251A);
            }
            return;
        }
        this.f20251A.add(this.f20252B);
        this.f20252B = it;
    }

    public boolean hasNext() {
        return this.f20252B.hasNext();
    }

    public Object next() {
        Object next = this.f20252B.next();
        b(next);
        return next;
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
