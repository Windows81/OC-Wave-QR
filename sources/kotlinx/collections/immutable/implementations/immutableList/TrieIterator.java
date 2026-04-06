package kotlinx.collections.immutable.implementations.immutableList;

import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class TrieIterator<E> extends AbstractListIterator<E> {

    /* renamed from: B  reason: collision with root package name */
    public int f41258B;
    public Object[] C;
    public boolean D;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TrieIterator(Object[] objArr, int i2, int i3, int i4) {
        super(i2, i3);
        Intrinsics.i(objArr, "root");
        this.f41258B = i4;
        Object[] objArr2 = new Object[i4];
        this.C = objArr2;
        boolean z2 = i2 == i3;
        this.D = z2;
        objArr2[0] = objArr;
        j(i2 - (z2 ? 1 : 0), 1);
    }

    private final Object i() {
        Object obj = this.C[this.f41258B - 1];
        Intrinsics.g(obj, "null cannot be cast to non-null type kotlin.Array<E of kotlinx.collections.immutable.implementations.immutableList.TrieIterator>");
        return ((Object[]) obj)[e() & 31];
    }

    private final void j(int i2, int i3) {
        int i4 = (this.f41258B - i3) * 5;
        while (i3 < this.f41258B) {
            Object[] objArr = this.C;
            Object[] objArr2 = objArr[i3 - 1];
            Intrinsics.g(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr[i3] = objArr2[UtilsKt.a(i2, i4)];
            i4 -= 5;
            i3++;
        }
    }

    private final void k(int i2) {
        int i3 = 0;
        while (UtilsKt.a(e(), i3) == i2) {
            i3 += 5;
        }
        if (i3 > 0) {
            j(e(), ((this.f41258B - 1) - (i3 / 5)) + 1);
        }
    }

    public final void m(Object[] objArr, int i2, int i3, int i4) {
        Intrinsics.i(objArr, "root");
        g(i2);
        h(i3);
        this.f41258B = i4;
        if (this.C.length < i4) {
            this.C = new Object[i4];
        }
        boolean z2 = false;
        this.C[0] = objArr;
        if (i2 == i3) {
            z2 = true;
        }
        this.D = z2;
        j(i2 - (z2 ? 1 : 0), 1);
    }

    public Object next() {
        if (hasNext()) {
            Object i2 = i();
            g(e() + 1);
            if (e() == f()) {
                this.D = true;
                return i2;
            }
            k(0);
            return i2;
        }
        throw new NoSuchElementException();
    }

    public Object previous() {
        if (hasPrevious()) {
            g(e() - 1);
            if (this.D) {
                this.D = false;
                return i();
            }
            k(31);
            return i();
        }
        throw new NoSuchElementException();
    }
}
