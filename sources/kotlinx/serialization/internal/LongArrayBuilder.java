package kotlinx.serialization.internal;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

@Metadata
public final class LongArrayBuilder extends PrimitiveArrayBuilder<long[]> {

    /* renamed from: a  reason: collision with root package name */
    public long[] f42139a;

    /* renamed from: b  reason: collision with root package name */
    public int f42140b;

    public LongArrayBuilder(long[] jArr) {
        Intrinsics.i(jArr, "bufferWithData");
        this.f42139a = jArr;
        this.f42140b = jArr.length;
        b(10);
    }

    public void b(int i2) {
        long[] jArr = this.f42139a;
        if (jArr.length < i2) {
            long[] copyOf = Arrays.copyOf(jArr, RangesKt.e(i2, jArr.length * 2));
            Intrinsics.h(copyOf, "copyOf(...)");
            this.f42139a = copyOf;
        }
    }

    public int d() {
        return this.f42140b;
    }

    public final void e(long j2) {
        PrimitiveArrayBuilder.c(this, 0, 1, (Object) null);
        long[] jArr = this.f42139a;
        int d2 = d();
        this.f42140b = d2 + 1;
        jArr[d2] = j2;
    }

    /* renamed from: f */
    public long[] a() {
        long[] copyOf = Arrays.copyOf(this.f42139a, d());
        Intrinsics.h(copyOf, "copyOf(...)");
        return copyOf;
    }
}
