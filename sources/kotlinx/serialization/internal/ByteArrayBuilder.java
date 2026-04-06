package kotlinx.serialization.internal;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

@Metadata
public final class ByteArrayBuilder extends PrimitiveArrayBuilder<byte[]> {

    /* renamed from: a  reason: collision with root package name */
    public byte[] f42075a;

    /* renamed from: b  reason: collision with root package name */
    public int f42076b;

    public ByteArrayBuilder(byte[] bArr) {
        Intrinsics.i(bArr, "bufferWithData");
        this.f42075a = bArr;
        this.f42076b = bArr.length;
        b(10);
    }

    public void b(int i2) {
        byte[] bArr = this.f42075a;
        if (bArr.length < i2) {
            byte[] copyOf = Arrays.copyOf(bArr, RangesKt.e(i2, bArr.length * 2));
            Intrinsics.h(copyOf, "copyOf(...)");
            this.f42075a = copyOf;
        }
    }

    public int d() {
        return this.f42076b;
    }

    public final void e(byte b2) {
        PrimitiveArrayBuilder.c(this, 0, 1, (Object) null);
        byte[] bArr = this.f42075a;
        int d2 = d();
        this.f42076b = d2 + 1;
        bArr[d2] = b2;
    }

    /* renamed from: f */
    public byte[] a() {
        byte[] copyOf = Arrays.copyOf(this.f42075a, d());
        Intrinsics.h(copyOf, "copyOf(...)");
        return copyOf;
    }
}
