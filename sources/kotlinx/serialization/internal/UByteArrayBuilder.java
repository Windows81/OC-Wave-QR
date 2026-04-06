package kotlinx.serialization.internal;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.UByteArray;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.serialization.ExperimentalSerializationApi;

@Metadata
@ExperimentalSerializationApi
public final class UByteArrayBuilder extends PrimitiveArrayBuilder<UByteArray> {

    /* renamed from: a  reason: collision with root package name */
    public byte[] f42207a;

    /* renamed from: b  reason: collision with root package name */
    public int f42208b;

    public /* synthetic */ UByteArrayBuilder(byte[] bArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(bArr);
    }

    public /* bridge */ /* synthetic */ Object a() {
        return UByteArray.e(f());
    }

    public void b(int i2) {
        if (UByteArray.s(this.f42207a) < i2) {
            byte[] bArr = this.f42207a;
            byte[] copyOf = Arrays.copyOf(bArr, RangesKt.e(i2, UByteArray.s(bArr) * 2));
            Intrinsics.h(copyOf, "copyOf(...)");
            this.f42207a = UByteArray.h(copyOf);
        }
    }

    public int d() {
        return this.f42208b;
    }

    public final void e(byte b2) {
        PrimitiveArrayBuilder.c(this, 0, 1, (Object) null);
        byte[] bArr = this.f42207a;
        int d2 = d();
        this.f42208b = d2 + 1;
        UByteArray.z(bArr, d2, b2);
    }

    public byte[] f() {
        byte[] copyOf = Arrays.copyOf(this.f42207a, d());
        Intrinsics.h(copyOf, "copyOf(...)");
        return UByteArray.h(copyOf);
    }

    public UByteArrayBuilder(byte[] bArr) {
        Intrinsics.i(bArr, "bufferWithData");
        this.f42207a = bArr;
        this.f42208b = UByteArray.s(bArr);
        b(10);
    }
}
