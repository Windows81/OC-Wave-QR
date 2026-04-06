package kotlinx.serialization.internal;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

@Metadata
public final class ShortArrayBuilder extends PrimitiveArrayBuilder<short[]> {

    /* renamed from: a  reason: collision with root package name */
    public short[] f42192a;

    /* renamed from: b  reason: collision with root package name */
    public int f42193b;

    public ShortArrayBuilder(short[] sArr) {
        Intrinsics.i(sArr, "bufferWithData");
        this.f42192a = sArr;
        this.f42193b = sArr.length;
        b(10);
    }

    public void b(int i2) {
        short[] sArr = this.f42192a;
        if (sArr.length < i2) {
            short[] copyOf = Arrays.copyOf(sArr, RangesKt.e(i2, sArr.length * 2));
            Intrinsics.h(copyOf, "copyOf(...)");
            this.f42192a = copyOf;
        }
    }

    public int d() {
        return this.f42193b;
    }

    public final void e(short s2) {
        PrimitiveArrayBuilder.c(this, 0, 1, (Object) null);
        short[] sArr = this.f42192a;
        int d2 = d();
        this.f42193b = d2 + 1;
        sArr[d2] = s2;
    }

    /* renamed from: f */
    public short[] a() {
        short[] copyOf = Arrays.copyOf(this.f42192a, d());
        Intrinsics.h(copyOf, "copyOf(...)");
        return copyOf;
    }
}
