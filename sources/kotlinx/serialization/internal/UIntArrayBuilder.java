package kotlinx.serialization.internal;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.UIntArray;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.serialization.ExperimentalSerializationApi;

@Metadata
@ExperimentalSerializationApi
public final class UIntArrayBuilder extends PrimitiveArrayBuilder<UIntArray> {

    /* renamed from: a  reason: collision with root package name */
    public int[] f42212a;

    /* renamed from: b  reason: collision with root package name */
    public int f42213b;

    public /* synthetic */ UIntArrayBuilder(int[] iArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(iArr);
    }

    public /* bridge */ /* synthetic */ Object a() {
        return UIntArray.e(f());
    }

    public void b(int i2) {
        if (UIntArray.s(this.f42212a) < i2) {
            int[] iArr = this.f42212a;
            int[] copyOf = Arrays.copyOf(iArr, RangesKt.e(i2, UIntArray.s(iArr) * 2));
            Intrinsics.h(copyOf, "copyOf(...)");
            this.f42212a = UIntArray.h(copyOf);
        }
    }

    public int d() {
        return this.f42213b;
    }

    public final void e(int i2) {
        PrimitiveArrayBuilder.c(this, 0, 1, (Object) null);
        int[] iArr = this.f42212a;
        int d2 = d();
        this.f42213b = d2 + 1;
        UIntArray.z(iArr, d2, i2);
    }

    public int[] f() {
        int[] copyOf = Arrays.copyOf(this.f42212a, d());
        Intrinsics.h(copyOf, "copyOf(...)");
        return UIntArray.h(copyOf);
    }

    public UIntArrayBuilder(int[] iArr) {
        Intrinsics.i(iArr, "bufferWithData");
        this.f42212a = iArr;
        this.f42213b = UIntArray.s(iArr);
        b(10);
    }
}
