package kotlinx.serialization.internal;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

@Metadata
public final class BooleanArrayBuilder extends PrimitiveArrayBuilder<boolean[]> {

    /* renamed from: a  reason: collision with root package name */
    public boolean[] f42070a;

    /* renamed from: b  reason: collision with root package name */
    public int f42071b;

    public BooleanArrayBuilder(boolean[] zArr) {
        Intrinsics.i(zArr, "bufferWithData");
        this.f42070a = zArr;
        this.f42071b = zArr.length;
        b(10);
    }

    public void b(int i2) {
        boolean[] zArr = this.f42070a;
        if (zArr.length < i2) {
            boolean[] copyOf = Arrays.copyOf(zArr, RangesKt.e(i2, zArr.length * 2));
            Intrinsics.h(copyOf, "copyOf(...)");
            this.f42070a = copyOf;
        }
    }

    public int d() {
        return this.f42071b;
    }

    public final void e(boolean z2) {
        PrimitiveArrayBuilder.c(this, 0, 1, (Object) null);
        boolean[] zArr = this.f42070a;
        int d2 = d();
        this.f42071b = d2 + 1;
        zArr[d2] = z2;
    }

    /* renamed from: f */
    public boolean[] a() {
        boolean[] copyOf = Arrays.copyOf(this.f42070a, d());
        Intrinsics.h(copyOf, "copyOf(...)");
        return copyOf;
    }
}
