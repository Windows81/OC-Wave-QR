package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import java.util.NoSuchElementException;
import kotlin.Metadata;

@Metadata
public final class BufferIterator<T> extends AbstractListIterator<T> {

    /* renamed from: B  reason: collision with root package name */
    public final Object[] f15027B;

    public BufferIterator(Object[] objArr, int i2, int i3) {
        super(i2, i3);
        this.f15027B = objArr;
    }

    public Object next() {
        if (hasNext()) {
            Object[] objArr = this.f15027B;
            int e2 = e();
            g(e2 + 1);
            return objArr[e2];
        }
        throw new NoSuchElementException();
    }

    public Object previous() {
        if (hasPrevious()) {
            Object[] objArr = this.f15027B;
            g(e() - 1);
            return objArr[e()];
        }
        throw new NoSuchElementException();
    }
}
