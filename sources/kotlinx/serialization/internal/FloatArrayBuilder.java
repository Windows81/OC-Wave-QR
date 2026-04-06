package kotlinx.serialization.internal;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

@Metadata
public final class FloatArrayBuilder extends PrimitiveArrayBuilder<float[]> {

    /* renamed from: a  reason: collision with root package name */
    public float[] f42117a;

    /* renamed from: b  reason: collision with root package name */
    public int f42118b;

    public FloatArrayBuilder(float[] fArr) {
        Intrinsics.i(fArr, "bufferWithData");
        this.f42117a = fArr;
        this.f42118b = fArr.length;
        b(10);
    }

    public void b(int i2) {
        float[] fArr = this.f42117a;
        if (fArr.length < i2) {
            float[] copyOf = Arrays.copyOf(fArr, RangesKt.e(i2, fArr.length * 2));
            Intrinsics.h(copyOf, "copyOf(...)");
            this.f42117a = copyOf;
        }
    }

    public int d() {
        return this.f42118b;
    }

    public final void e(float f2) {
        PrimitiveArrayBuilder.c(this, 0, 1, (Object) null);
        float[] fArr = this.f42117a;
        int d2 = d();
        this.f42118b = d2 + 1;
        fArr[d2] = f2;
    }

    /* renamed from: f */
    public float[] a() {
        float[] copyOf = Arrays.copyOf(this.f42117a, d());
        Intrinsics.h(copyOf, "copyOf(...)");
        return copyOf;
    }
}
