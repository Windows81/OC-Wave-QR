package kotlinx.serialization.internal;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.UShortArray;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.serialization.ExperimentalSerializationApi;

@Metadata
@ExperimentalSerializationApi
public final class UShortArrayBuilder extends PrimitiveArrayBuilder<UShortArray> {

    /* renamed from: a  reason: collision with root package name */
    public short[] f42222a;

    /* renamed from: b  reason: collision with root package name */
    public int f42223b;

    public /* synthetic */ UShortArrayBuilder(short[] sArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(sArr);
    }

    public /* bridge */ /* synthetic */ Object a() {
        return UShortArray.e(f());
    }

    public void b(int i2) {
        if (UShortArray.s(this.f42222a) < i2) {
            short[] sArr = this.f42222a;
            short[] copyOf = Arrays.copyOf(sArr, RangesKt.e(i2, UShortArray.s(sArr) * 2));
            Intrinsics.h(copyOf, "copyOf(...)");
            this.f42222a = UShortArray.h(copyOf);
        }
    }

    public int d() {
        return this.f42223b;
    }

    public final void e(short s2) {
        PrimitiveArrayBuilder.c(this, 0, 1, (Object) null);
        short[] sArr = this.f42222a;
        int d2 = d();
        this.f42223b = d2 + 1;
        UShortArray.z(sArr, d2, s2);
    }

    public short[] f() {
        short[] copyOf = Arrays.copyOf(this.f42222a, d());
        Intrinsics.h(copyOf, "copyOf(...)");
        return UShortArray.h(copyOf);
    }

    public UShortArrayBuilder(short[] sArr) {
        Intrinsics.i(sArr, "bufferWithData");
        this.f42222a = sArr;
        this.f42223b = UShortArray.s(sArr);
        b(10);
    }
}
