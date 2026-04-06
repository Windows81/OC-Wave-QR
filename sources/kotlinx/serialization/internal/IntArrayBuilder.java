package kotlinx.serialization.internal;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

@Metadata
public final class IntArrayBuilder extends PrimitiveArrayBuilder<int[]> {

    /* renamed from: a  reason: collision with root package name */
    public int[] f42126a;

    /* renamed from: b  reason: collision with root package name */
    public int f42127b;

    public IntArrayBuilder(int[] iArr) {
        Intrinsics.i(iArr, "bufferWithData");
        this.f42126a = iArr;
        this.f42127b = iArr.length;
        b(10);
    }

    public void b(int i2) {
        int[] iArr = this.f42126a;
        if (iArr.length < i2) {
            int[] copyOf = Arrays.copyOf(iArr, RangesKt.e(i2, iArr.length * 2));
            Intrinsics.h(copyOf, "copyOf(...)");
            this.f42126a = copyOf;
        }
    }

    public int d() {
        return this.f42127b;
    }

    public final void e(int i2) {
        PrimitiveArrayBuilder.c(this, 0, 1, (Object) null);
        int[] iArr = this.f42126a;
        int d2 = d();
        this.f42127b = d2 + 1;
        iArr[d2] = i2;
    }

    /* renamed from: f */
    public int[] a() {
        int[] copyOf = Arrays.copyOf(this.f42126a, d());
        Intrinsics.h(copyOf, "copyOf(...)");
        return copyOf;
    }
}
