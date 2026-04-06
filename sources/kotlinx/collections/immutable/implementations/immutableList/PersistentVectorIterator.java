package kotlinx.collections.immutable.implementations.immutableList;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

@Metadata
public final class PersistentVectorIterator<T> extends AbstractListIterator<T> {

    /* renamed from: B  reason: collision with root package name */
    public final Object[] f41253B;
    public final TrieIterator C;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PersistentVectorIterator(Object[] objArr, Object[] objArr2, int i2, int i3, int i4) {
        super(i2, i3);
        Intrinsics.i(objArr, "root");
        Intrinsics.i(objArr2, "tail");
        this.f41253B = objArr2;
        int c2 = UtilsKt.c(i3);
        this.C = new TrieIterator(objArr, RangesKt.j(i2, c2), c2, i4);
    }

    public Object next() {
        b();
        if (this.C.hasNext()) {
            g(e() + 1);
            return this.C.next();
        }
        Object[] objArr = this.f41253B;
        int e2 = e();
        g(e2 + 1);
        return objArr[e2 - this.C.f()];
    }

    public Object previous() {
        c();
        if (e() > this.C.f()) {
            Object[] objArr = this.f41253B;
            g(e() - 1);
            return objArr[e() - this.C.f()];
        }
        g(e() - 1);
        return this.C.previous();
    }
}
