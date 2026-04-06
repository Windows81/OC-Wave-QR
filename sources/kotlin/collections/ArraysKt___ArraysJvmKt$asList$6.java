package kotlin.collections;

import java.util.RandomAccess;
import kotlin.Metadata;

@Metadata
public final class ArraysKt___ArraysJvmKt$asList$6 extends AbstractList<Double> implements RandomAccess {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ double[] f40588A;

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof Double)) {
            return false;
        }
        return i(((Number) obj).doubleValue());
    }

    public int g() {
        return this.f40588A.length;
    }

    public boolean i(double d2) {
        for (double doubleToLongBits : this.f40588A) {
            if (Double.doubleToLongBits(doubleToLongBits) == Double.doubleToLongBits(d2)) {
                return true;
            }
        }
        return false;
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        return n(((Number) obj).doubleValue());
    }

    public boolean isEmpty() {
        return this.f40588A.length == 0;
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        return o(((Number) obj).doubleValue());
    }

    /* renamed from: m */
    public Double get(int i2) {
        return Double.valueOf(this.f40588A[i2]);
    }

    public int n(double d2) {
        double[] dArr = this.f40588A;
        int length = dArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (Double.doubleToLongBits(dArr[i2]) == Double.doubleToLongBits(d2)) {
                return i2;
            }
        }
        return -1;
    }

    public int o(double d2) {
        double[] dArr = this.f40588A;
        int length = dArr.length - 1;
        if (length < 0) {
            return -1;
        }
        while (true) {
            int i2 = length - 1;
            if (Double.doubleToLongBits(dArr[length]) == Double.doubleToLongBits(d2)) {
                return length;
            }
            if (i2 < 0) {
                return -1;
            }
            length = i2;
        }
    }
}
