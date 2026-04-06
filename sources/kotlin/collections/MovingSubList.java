package kotlin.collections;

import java.util.List;
import java.util.RandomAccess;
import kotlin.Metadata;

@Metadata
public final class MovingSubList<E> extends AbstractList<E> implements RandomAccess {

    /* renamed from: A  reason: collision with root package name */
    public final List f40625A;

    /* renamed from: B  reason: collision with root package name */
    public int f40626B;
    public int C;

    public int g() {
        return this.C;
    }

    public Object get(int i2) {
        AbstractList.f40564z.b(i2, this.C);
        return this.f40625A.get(this.f40626B + i2);
    }
}
