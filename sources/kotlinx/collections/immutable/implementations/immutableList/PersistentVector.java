package kotlinx.collections.immutable.implementations.immutableList;

import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.collections.immutable.PersistentList;
import kotlinx.collections.immutable.internal.CommonFunctionsKt;
import kotlinx.collections.immutable.internal.ListImplementation;

@Metadata
public final class PersistentVector<E> extends AbstractPersistentList<E> implements PersistentList<E> {

    /* renamed from: A  reason: collision with root package name */
    public final Object[] f41247A;

    /* renamed from: B  reason: collision with root package name */
    public final Object[] f41248B;
    public final int C;
    public final int D;

    public PersistentVector(Object[] objArr, Object[] objArr2, int i2, int i3) {
        Intrinsics.i(objArr, "root");
        Intrinsics.i(objArr2, "tail");
        this.f41247A = objArr;
        this.f41248B = objArr2;
        this.C = i2;
        this.D = i3;
        if (size() > 32) {
            CommonFunctionsKt.a(size() - UtilsKt.c(size()) <= RangesKt.j(objArr2.length, 32));
            return;
        }
        throw new IllegalArgumentException(("Trie-based persistent vector should have at least 33 elements, got " + size()).toString());
    }

    private final Object[] m(int i2) {
        if (o() <= i2) {
            return this.f41248B;
        }
        Object[] objArr = this.f41247A;
        for (int i3 = this.D; i3 > 0; i3 -= 5) {
            Object[] objArr2 = objArr[UtilsKt.a(i2, i3)];
            Intrinsics.g(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr = objArr2;
        }
        return objArr;
    }

    private final int o() {
        return UtilsKt.c(size());
    }

    public int g() {
        return this.C;
    }

    public Object get(int i2) {
        ListImplementation.a(i2, size());
        return m(i2)[i2 & 31];
    }

    public ListIterator listIterator(int i2) {
        ListImplementation.b(i2, size());
        return new PersistentVectorIterator(this.f41247A, this.f41248B, i2, size(), (this.D / 5) + 1);
    }

    /* renamed from: n */
    public PersistentVectorBuilder l() {
        return new PersistentVectorBuilder(this, this.f41247A, this.f41248B, this.D);
    }
}
