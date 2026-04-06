package kotlinx.serialization.json.internal;

import java.io.OutputStream;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

@Metadata
public final class JsonToJavaStreamWriter implements InternalJsonWriter {

    /* renamed from: a  reason: collision with root package name */
    public final OutputStream f42402a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f42403b;

    /* renamed from: c  reason: collision with root package name */
    public char[] f42404c;

    /* renamed from: d  reason: collision with root package name */
    public int f42405d;

    public void a(char c2) {
        h(c2);
    }

    public void b(String str) {
        Intrinsics.i(str, "text");
        e(0, str.length() + 2);
        char[] cArr = this.f42404c;
        cArr[0] = '\"';
        int length = str.length();
        int i2 = 1;
        str.getChars(0, length, cArr, 1);
        int i3 = length + 1;
        while (i2 < i3) {
            char c2 = cArr[i2];
            if (c2 >= StringOpsKt.a().length || StringOpsKt.a()[c2] == 0) {
                i2++;
            } else {
                d(i2, str);
                return;
            }
        }
        cArr[i3] = '\"';
        g(cArr, length + 2);
        f();
    }

    public void c(String str) {
        Intrinsics.i(str, "text");
        int length = str.length();
        e(0, length);
        str.getChars(0, length, this.f42404c, 0);
        g(this.f42404c, length);
    }

    public final void d(int i2, String str) {
        int i3;
        int length = str.length();
        for (int i4 = i2 - 1; i4 < length; i4++) {
            int e2 = e(i2, 2);
            char charAt = str.charAt(i4);
            if (charAt < StringOpsKt.a().length) {
                byte b2 = StringOpsKt.a()[charAt];
                if (b2 == 0) {
                    i3 = e2 + 1;
                    this.f42404c[e2] = (char) charAt;
                } else {
                    if (b2 == 1) {
                        String str2 = StringOpsKt.b()[charAt];
                        Intrinsics.f(str2);
                        int e3 = e(e2, str2.length());
                        str2.getChars(0, str2.length(), this.f42404c, e3);
                        i2 = e3 + str2.length();
                    } else {
                        char[] cArr = this.f42404c;
                        cArr[e2] = '\\';
                        cArr[e2 + 1] = (char) b2;
                        i2 = e2 + 2;
                    }
                }
            } else {
                i3 = e2 + 1;
                this.f42404c[e2] = (char) charAt;
            }
            i2 = i3;
        }
        e(i2, 1);
        char[] cArr2 = this.f42404c;
        cArr2[i2] = '\"';
        g(cArr2, i2 + 1);
        f();
    }

    public final int e(int i2, int i3) {
        int i4 = i3 + i2;
        char[] cArr = this.f42404c;
        if (cArr.length <= i4) {
            char[] copyOf = Arrays.copyOf(cArr, RangesKt.e(i4, i2 * 2));
            Intrinsics.h(copyOf, "copyOf(...)");
            this.f42404c = copyOf;
        }
        return i2;
    }

    public final void f() {
        this.f42402a.write(this.f42403b, 0, this.f42405d);
        this.f42405d = 0;
    }

    public final void g(char[] cArr, int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("count < 0");
        } else if (i2 <= cArr.length) {
            int i3 = 0;
            while (i3 < i2) {
                char c2 = cArr[i3];
                if (c2 < 128) {
                    if (this.f42403b.length - this.f42405d < 1) {
                        f();
                    }
                    byte[] bArr = this.f42403b;
                    int i4 = this.f42405d;
                    int i5 = i4 + 1;
                    this.f42405d = i5;
                    bArr[i4] = (byte) c2;
                    i3++;
                    int min = Math.min(i2, (bArr.length - i5) + i3);
                    while (i3 < min) {
                        char c3 = cArr[i3];
                        if (c3 >= 128) {
                            break;
                        }
                        byte[] bArr2 = this.f42403b;
                        int i6 = this.f42405d;
                        this.f42405d = i6 + 1;
                        bArr2[i6] = (byte) c3;
                        i3++;
                    }
                } else {
                    if (c2 < 2048) {
                        if (this.f42403b.length - this.f42405d < 2) {
                            f();
                        }
                        byte[] bArr3 = this.f42403b;
                        int i7 = this.f42405d;
                        int i8 = i7 + 1;
                        this.f42405d = i8;
                        bArr3[i7] = (byte) ((c2 >> 6) | 192);
                        this.f42405d = i7 + 2;
                        bArr3[i8] = (byte) ((c2 & '?') | 128);
                    } else if (c2 < 55296 || c2 > 57343) {
                        if (this.f42403b.length - this.f42405d < 3) {
                            f();
                        }
                        byte[] bArr4 = this.f42403b;
                        int i9 = this.f42405d;
                        int i10 = i9 + 1;
                        this.f42405d = i10;
                        bArr4[i9] = (byte) ((c2 >> 12) | 224);
                        int i11 = i9 + 2;
                        this.f42405d = i11;
                        bArr4[i10] = (byte) (((c2 >> 6) & 63) | 128);
                        this.f42405d = i9 + 3;
                        bArr4[i11] = (byte) ((c2 & '?') | 128);
                    } else {
                        int i12 = i3 + 1;
                        char c4 = i12 < i2 ? cArr[i12] : 0;
                        if (c2 > 56319 || 56320 > c4 || c4 >= 57344) {
                            if (this.f42403b.length - this.f42405d < 1) {
                                f();
                            }
                            byte[] bArr5 = this.f42403b;
                            int i13 = this.f42405d;
                            this.f42405d = i13 + 1;
                            bArr5[i13] = (byte) 63;
                            i3 = i12;
                        } else {
                            int i14 = (((c2 & 1023) << 10) | (c4 & 1023)) + 0;
                            if (this.f42403b.length - this.f42405d < 4) {
                                f();
                            }
                            byte[] bArr6 = this.f42403b;
                            int i15 = this.f42405d;
                            int i16 = i15 + 1;
                            this.f42405d = i16;
                            bArr6[i15] = (byte) ((i14 >> 18) | 240);
                            int i17 = i15 + 2;
                            this.f42405d = i17;
                            bArr6[i16] = (byte) (((i14 >> 12) & 63) | 128);
                            int i18 = i15 + 3;
                            this.f42405d = i18;
                            bArr6[i17] = (byte) (((i14 >> 6) & 63) | 128);
                            this.f42405d = i15 + 4;
                            bArr6[i18] = (byte) ((i14 & 63) | 128);
                            i3 += 2;
                        }
                    }
                    i3++;
                }
            }
        } else {
            throw new IllegalArgumentException(("count > string.length: " + i2 + " > " + cArr.length).toString());
        }
    }

    public final void h(int i2) {
        if (i2 < 128) {
            if (this.f42403b.length - this.f42405d < 1) {
                f();
            }
            byte[] bArr = this.f42403b;
            int i3 = this.f42405d;
            this.f42405d = i3 + 1;
            bArr[i3] = (byte) i2;
        } else if (i2 < 2048) {
            if (this.f42403b.length - this.f42405d < 2) {
                f();
            }
            byte[] bArr2 = this.f42403b;
            int i4 = this.f42405d;
            int i5 = i4 + 1;
            this.f42405d = i5;
            bArr2[i4] = (byte) ((i2 >> 6) | 192);
            this.f42405d = i4 + 2;
            bArr2[i5] = (byte) ((i2 & 63) | 128);
        } else if (55296 <= i2 && i2 < 57344) {
            if (this.f42403b.length - this.f42405d < 1) {
                f();
            }
            byte[] bArr3 = this.f42403b;
            int i6 = this.f42405d;
            this.f42405d = i6 + 1;
            bArr3[i6] = (byte) 63;
        } else if (i2 < 65536) {
            if (this.f42403b.length - this.f42405d < 3) {
                f();
            }
            byte[] bArr4 = this.f42403b;
            int i7 = this.f42405d;
            int i8 = i7 + 1;
            this.f42405d = i8;
            bArr4[i7] = (byte) ((i2 >> 12) | 224);
            int i9 = i7 + 2;
            this.f42405d = i9;
            bArr4[i8] = (byte) (((i2 >> 6) & 63) | 128);
            this.f42405d = i7 + 3;
            bArr4[i9] = (byte) ((i2 & 63) | 128);
        } else if (i2 <= 1114111) {
            if (this.f42403b.length - this.f42405d < 4) {
                f();
            }
            byte[] bArr5 = this.f42403b;
            int i10 = this.f42405d;
            int i11 = i10 + 1;
            this.f42405d = i11;
            bArr5[i10] = (byte) ((i2 >> 18) | 240);
            int i12 = i10 + 2;
            this.f42405d = i12;
            bArr5[i11] = (byte) (((i2 >> 12) & 63) | 128);
            int i13 = i10 + 3;
            this.f42405d = i13;
            bArr5[i12] = (byte) (((i2 >> 6) & 63) | 128);
            this.f42405d = i10 + 4;
            bArr5[i13] = (byte) ((i2 & 63) | 128);
        } else {
            throw new JsonEncodingException("Unexpected code point: " + i2);
        }
    }

    public void writeLong(long j2) {
        c(String.valueOf(j2));
    }
}
