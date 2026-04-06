package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import kotlin.Metadata;
import kotlin.ranges.RangesKt;

@Metadata
public final class PersistentVectorIterator<T> extends AbstractListIterator<T> {

    /* renamed from: B  reason: collision with root package name */
    public final Object[] f15034B;
    public final TrieIterator C;

    public PersistentVectorIterator(Object[] objArr, Object[] objArr2, int i2, int i3, int i4) {
        super(i2, i3);
        this.f15034B = objArr2;
        int d2 = UtilsKt.d(i3);
        this.C = new TrieIterator(objArr, RangesKt.j(i2, d2), d2, i4);
    }

    public Object next() {
        b();
        if (this.C.hasNext()) {
            g(e() + 1);
            return this.C.next();
        }
        Object[] objArr = this.f15034B;
        int e2 = e();
        g(e2 + 1);
        return objArr[e2 - this.C.f()];
    }

    public Object previous() {
        c();
        if (e() > this.C.f()) {
            Object[] objArr = this.f15034B;
            g(e() - 1);
            return objArr[e() - this.C.f()];
        }
        g(e() - 1);
        return this.C.previous();
    }
}
