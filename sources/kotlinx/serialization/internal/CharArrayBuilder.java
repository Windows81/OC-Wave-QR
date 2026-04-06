package kotlinx.serialization.internal;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

@Metadata
public final class CharArrayBuilder extends PrimitiveArrayBuilder<char[]> {

    /* renamed from: a  reason: collision with root package name */
    public char[] f42082a;

    /* renamed from: b  reason: collision with root package name */
    public int f42083b;

    public CharArrayBuilder(char[] cArr) {
        Intrinsics.i(cArr, "bufferWithData");
        this.f42082a = cArr;
        this.f42083b = cArr.length;
        b(10);
    }

    public void b(int i2) {
        char[] cArr = this.f42082a;
        if (cArr.length < i2) {
            char[] copyOf = Arrays.copyOf(cArr, RangesKt.e(i2, cArr.length * 2));
            Intrinsics.h(copyOf, "copyOf(...)");
            this.f42082a = copyOf;
        }
    }

    public int d() {
        return this.f42083b;
    }

    public final void e(char c2) {
        PrimitiveArrayBuilder.c(this, 0, 1, (Object) null);
        char[] cArr = this.f42082a;
        int d2 = d();
        this.f42083b = d2 + 1;
        cArr[d2] = c2;
    }

    /* renamed from: f */
    public char[] a() {
        char[] copyOf = Arrays.copyOf(this.f42082a, d());
        Intrinsics.h(copyOf, "copyOf(...)");
        return copyOf;
    }
}
