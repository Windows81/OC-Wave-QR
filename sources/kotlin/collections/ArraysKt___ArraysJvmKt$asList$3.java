package kotlin.collections;

import java.util.RandomAccess;
import kotlin.Metadata;

@Metadata
public final class ArraysKt___ArraysJvmKt$asList$3 extends AbstractList<Integer> implements RandomAccess {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ int[] f40585A;

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof Integer)) {
            return false;
        }
        return i(((Number) obj).intValue());
    }

    public int g() {
        return this.f40585A.length;
    }

    public boolean i(int i2) {
        return ArraysKt.W(this.f40585A, i2);
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        return n(((Number) obj).intValue());
    }

    public boolean isEmpty() {
        return this.f40585A.length == 0;
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        return o(((Number) obj).intValue());
    }

    /* renamed from: m */
    public Integer get(int i2) {
        return Integer.valueOf(this.f40585A[i2]);
    }

    public int n(int i2) {
        return ArraysKt.r0(this.f40585A, i2);
    }

    public int o(int i2) {
        return ArraysKt.G0(this.f40585A, i2);
    }
}
