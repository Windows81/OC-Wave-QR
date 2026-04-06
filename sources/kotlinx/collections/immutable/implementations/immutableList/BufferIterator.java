package kotlinx.collections.immutable.implementations.immutableList;

import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class BufferIterator<T> extends AbstractListIterator<T> {

    /* renamed from: B  reason: collision with root package name */
    public final Object[] f41245B;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BufferIterator(Object[] objArr, int i2, int i3) {
        super(i2, i3);
        Intrinsics.i(objArr, "buffer");
        this.f41245B = objArr;
    }

    public Object next() {
        if (hasNext()) {
            Object[] objArr = this.f41245B;
            int e2 = e();
            g(e2 + 1);
            return objArr[e2];
        }
        throw new NoSuchElementException();
    }

    public Object previous() {
        if (hasPrevious()) {
            Object[] objArr = this.f41245B;
            g(e() - 1);
            return objArr[e()];
        }
        throw new NoSuchElementException();
    }
}
