package kotlin.collections;

import java.util.RandomAccess;
import kotlin.Metadata;

@Metadata
public final class ArraysKt___ArraysJvmKt$asList$1 extends AbstractList<Byte> implements RandomAccess {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ byte[] f40583A;

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof Byte)) {
            return false;
        }
        return i(((Number) obj).byteValue());
    }

    public int g() {
        return this.f40583A.length;
    }

    public boolean i(byte b2) {
        return ArraysKt.U(this.f40583A, b2);
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof Byte)) {
            return -1;
        }
        return n(((Number) obj).byteValue());
    }

    public boolean isEmpty() {
        return this.f40583A.length == 0;
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof Byte)) {
            return -1;
        }
        return o(((Number) obj).byteValue());
    }

    /* renamed from: m */
    public Byte get(int i2) {
        return Byte.valueOf(this.f40583A[i2]);
    }

    public int n(byte b2) {
        return ArraysKt.p0(this.f40583A, b2);
    }

    public int o(byte b2) {
        return ArraysKt.E0(this.f40583A, b2);
    }
}
