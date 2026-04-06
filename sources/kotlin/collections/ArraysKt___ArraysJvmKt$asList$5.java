package kotlin.collections;

import java.util.RandomAccess;
import kotlin.Metadata;

@Metadata
public final class ArraysKt___ArraysJvmKt$asList$5 extends AbstractList<Float> implements RandomAccess {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ float[] f40587A;

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof Float)) {
            return false;
        }
        return i(((Number) obj).floatValue());
    }

    public int g() {
        return this.f40587A.length;
    }

    public boolean i(float f2) {
        for (float floatToIntBits : this.f40587A) {
            if (Float.floatToIntBits(floatToIntBits) == Float.floatToIntBits(f2)) {
                return true;
            }
        }
        return false;
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        return n(((Number) obj).floatValue());
    }

    public boolean isEmpty() {
        return this.f40587A.length == 0;
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        return o(((Number) obj).floatValue());
    }

    /* renamed from: m */
    public Float get(int i2) {
        return Float.valueOf(this.f40587A[i2]);
    }

    public int n(float f2) {
        float[] fArr = this.f40587A;
        int length = fArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (Float.floatToIntBits(fArr[i2]) == Float.floatToIntBits(f2)) {
                return i2;
            }
        }
        return -1;
    }

    public int o(float f2) {
        float[] fArr = this.f40587A;
        int length = fArr.length - 1;
        if (length < 0) {
            return -1;
        }
        while (true) {
            int i2 = length - 1;
            if (Float.floatToIntBits(fArr[length]) == Float.floatToIntBits(f2)) {
                return length;
            }
            if (i2 < 0) {
                return -1;
            }
            length = i2;
        }
    }
}
