package kotlinx.serialization.json.internal;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

@Metadata
public final class JsonToStringWriter implements InternalJsonWriter {

    /* renamed from: a  reason: collision with root package name */
    public char[] f42406a = CharArrayPool.f42359c.d();

    /* renamed from: b  reason: collision with root package name */
    public int f42407b;

    private final int f(int i2, int i3) {
        int i4 = i3 + i2;
        char[] cArr = this.f42406a;
        if (cArr.length <= i4) {
            char[] copyOf = Arrays.copyOf(cArr, RangesKt.e(i4, i2 * 2));
            Intrinsics.h(copyOf, "copyOf(...)");
            this.f42406a = copyOf;
        }
        return i2;
    }

    public void a(char c2) {
        e(1);
        char[] cArr = this.f42406a;
        int i2 = this.f42407b;
        this.f42407b = i2 + 1;
        cArr[i2] = c2;
    }

    public void b(String str) {
        Intrinsics.i(str, "text");
        e(str.length() + 2);
        char[] cArr = this.f42406a;
        int i2 = this.f42407b;
        int i3 = i2 + 1;
        cArr[i2] = '\"';
        int length = str.length();
        str.getChars(0, length, cArr, i3);
        int i4 = length + i3;
        int i5 = i3;
        while (i5 < i4) {
            char c2 = cArr[i5];
            if (c2 >= StringOpsKt.a().length || StringOpsKt.a()[c2] == 0) {
                i5++;
            } else {
                d(i5 - i3, i5, str);
                return;
            }
        }
        cArr[i4] = '\"';
        this.f42407b = i4 + 1;
    }

    public void c(String str) {
        Intrinsics.i(str, "text");
        int length = str.length();
        if (length != 0) {
            e(length);
            str.getChars(0, str.length(), this.f42406a, this.f42407b);
            this.f42407b += length;
        }
    }

    public final void d(int i2, int i3, String str) {
        int i4;
        int length = str.length();
        while (i2 < length) {
            int f2 = f(i3, 2);
            char charAt = str.charAt(i2);
            if (charAt < StringOpsKt.a().length) {
                byte b2 = StringOpsKt.a()[charAt];
                if (b2 == 0) {
                    i4 = f2 + 1;
                    this.f42406a[f2] = (char) charAt;
                } else {
                    if (b2 == 1) {
                        String str2 = StringOpsKt.b()[charAt];
                        Intrinsics.f(str2);
                        int f3 = f(f2, str2.length());
                        str2.getChars(0, str2.length(), this.f42406a, f3);
                        i3 = f3 + str2.length();
                        this.f42407b = i3;
                    } else {
                        char[] cArr = this.f42406a;
                        cArr[f2] = '\\';
                        cArr[f2 + 1] = (char) b2;
                        i3 = f2 + 2;
                        this.f42407b = i3;
                    }
                    i2++;
                }
            } else {
                i4 = f2 + 1;
                this.f42406a[f2] = (char) charAt;
            }
            i3 = i4;
            i2++;
        }
        int f4 = f(i3, 1);
        this.f42406a[f4] = '\"';
        this.f42407b = f4 + 1;
    }

    public final void e(int i2) {
        f(this.f42407b, i2);
    }

    public void g() {
        CharArrayPool.f42359c.c(this.f42406a);
    }

    public String toString() {
        return new String(this.f42406a, 0, this.f42407b);
    }

    public void writeLong(long j2) {
        c(String.valueOf(j2));
    }
}
