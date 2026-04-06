package kotlin.collections;

import java.util.RandomAccess;
import kotlin.Metadata;

@Metadata
public final class ArraysKt___ArraysJvmKt$asList$4 extends AbstractList<Long> implements RandomAccess {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ long[] f40586A;

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof Long)) {
            return false;
        }
        return i(((Number) obj).longValue());
    }

    public int g() {
        return this.f40586A.length;
    }

    public boolean i(long j2) {
        return ArraysKt.X(this.f40586A, j2);
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        return n(((Number) obj).longValue());
    }

    public boolean isEmpty() {
        return this.f40586A.length == 0;
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        return o(((Number) obj).longValue());
    }

    /* renamed from: m */
    public Long get(int i2) {
        return Long.valueOf(this.f40586A[i2]);
    }

    public int n(long j2) {
        return ArraysKt.s0(this.f40586A, j2);
    }

    public int o(long j2) {
        return ArraysKt.H0(this.f40586A, j2);
    }
}
