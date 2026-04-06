package kotlinx.serialization.internal;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.ULongArray;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.serialization.ExperimentalSerializationApi;

@Metadata
@ExperimentalSerializationApi
public final class ULongArrayBuilder extends PrimitiveArrayBuilder<ULongArray> {

    /* renamed from: a  reason: collision with root package name */
    public long[] f42217a;

    /* renamed from: b  reason: collision with root package name */
    public int f42218b;

    public /* synthetic */ ULongArrayBuilder(long[] jArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(jArr);
    }

    public /* bridge */ /* synthetic */ Object a() {
        return ULongArray.e(f());
    }

    public void b(int i2) {
        if (ULongArray.s(this.f42217a) < i2) {
            long[] jArr = this.f42217a;
            long[] copyOf = Arrays.copyOf(jArr, RangesKt.e(i2, ULongArray.s(jArr) * 2));
            Intrinsics.h(copyOf, "copyOf(...)");
            this.f42217a = ULongArray.h(copyOf);
        }
    }

    public int d() {
        return this.f42218b;
    }

    public final void e(long j2) {
        PrimitiveArrayBuilder.c(this, 0, 1, (Object) null);
        long[] jArr = this.f42217a;
        int d2 = d();
        this.f42218b = d2 + 1;
        ULongArray.z(jArr, d2, j2);
    }

    public long[] f() {
        long[] copyOf = Arrays.copyOf(this.f42217a, d());
        Intrinsics.h(copyOf, "copyOf(...)");
        return ULongArray.h(copyOf);
    }

    public ULongArrayBuilder(long[] jArr) {
        Intrinsics.i(jArr, "bufferWithData");
        this.f42217a = jArr;
        this.f42218b = ULongArray.s(jArr);
        b(10);
    }
}
