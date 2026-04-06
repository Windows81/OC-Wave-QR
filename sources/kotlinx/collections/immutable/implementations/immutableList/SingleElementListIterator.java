package kotlinx.collections.immutable.implementations.immutableList;

import kotlin.Metadata;

@Metadata
public final class SingleElementListIterator<E> extends AbstractListIterator<E> {

    /* renamed from: B  reason: collision with root package name */
    public final Object f41255B;

    public SingleElementListIterator(Object obj, int i2) {
        super(i2, 1);
        this.f41255B = obj;
    }

    public Object next() {
        b();
        g(e() + 1);
        return this.f41255B;
    }

    public Object previous() {
        c();
        g(e() - 1);
        return this.f41255B;
    }
}
