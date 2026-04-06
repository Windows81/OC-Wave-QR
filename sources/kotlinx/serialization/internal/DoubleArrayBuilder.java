package kotlinx.serialization.internal;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

@Metadata
public final class DoubleArrayBuilder extends PrimitiveArrayBuilder<double[]> {

    /* renamed from: a  reason: collision with root package name */
    public double[] f42099a;

    /* renamed from: b  reason: collision with root package name */
    public int f42100b;

    public DoubleArrayBuilder(double[] dArr) {
        Intrinsics.i(dArr, "bufferWithData");
        this.f42099a = dArr;
        this.f42100b = dArr.length;
        b(10);
    }

    public void b(int i2) {
        double[] dArr = this.f42099a;
        if (dArr.length < i2) {
            double[] copyOf = Arrays.copyOf(dArr, RangesKt.e(i2, dArr.length * 2));
            Intrinsics.h(copyOf, "copyOf(...)");
            this.f42099a = copyOf;
        }
    }

    public int d() {
        return this.f42100b;
    }

    public final void e(double d2) {
        PrimitiveArrayBuilder.c(this, 0, 1, (Object) null);
        double[] dArr = this.f42099a;
        int d3 = d();
        this.f42100b = d3 + 1;
        dArr[d3] = d2;
    }

    /* renamed from: f */
    public double[] a() {
        double[] copyOf = Arrays.copyOf(this.f42099a, d());
        Intrinsics.h(copyOf, "copyOf(...)");
        return copyOf;
    }
}
