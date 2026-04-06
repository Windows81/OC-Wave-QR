package kotlin.collections;

import java.util.RandomAccess;
import kotlin.Metadata;

@Metadata
public final class ArraysKt___ArraysJvmKt$asList$2 extends AbstractList<Short> implements RandomAccess {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ short[] f40584A;

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof Short)) {
            return false;
        }
        return i(((Number) obj).shortValue());
    }

    public int g() {
        return this.f40584A.length;
    }

    public boolean i(short s2) {
        return ArraysKt.Z(this.f40584A, s2);
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof Short)) {
            return -1;
        }
        return n(((Number) obj).shortValue());
    }

    public boolean isEmpty() {
        return this.f40584A.length == 0;
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof Short)) {
            return -1;
        }
        return o(((Number) obj).shortValue());
    }

    /* renamed from: m */
    public Short get(int i2) {
        return Short.valueOf(this.f40584A[i2]);
    }

    public int n(short s2) {
        return ArraysKt.u0(this.f40584A, s2);
    }

    public int o(short s2) {
        return ArraysKt.J0(this.f40584A, s2);
    }
}
