package kotlin.io.encoding;

import kotlin.Metadata;
import kotlin.collections.AbstractList;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;

@Metadata
public class Base64 {

    /* renamed from: d  reason: collision with root package name */
    public static final Default f40804d = new Default((DefaultConstructorMarker) null);

    /* renamed from: e  reason: collision with root package name */
    public static final byte[] f40805e = {13, 10};

    /* renamed from: f  reason: collision with root package name */
    public static final Base64 f40806f;

    /* renamed from: g  reason: collision with root package name */
    public static final Base64 f40807g;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f40808a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f40809b;

    /* renamed from: c  reason: collision with root package name */
    public final PaddingOption f40810c;

    @Metadata
    public static final class Default extends Base64 {
        public /* synthetic */ Default(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final byte[] o() {
            return Base64.f40805e;
        }

        public Default() {
            super(false, false, PaddingOption.PRESENT, (DefaultConstructorMarker) null);
        }
    }

    @Metadata
    public enum PaddingOption {
        PRESENT,
        ABSENT,
        PRESENT_OPTIONAL,
        ABSENT_OPTIONAL;

        static {
            PaddingOption[] d2;
            E = EnumEntriesKt.a(d2);
        }
    }

    static {
        PaddingOption paddingOption = PaddingOption.PRESENT;
        f40806f = new Base64(true, false, paddingOption);
        f40807g = new Base64(false, true, paddingOption);
    }

    public /* synthetic */ Base64(boolean z2, boolean z3, PaddingOption paddingOption, DefaultConstructorMarker defaultConstructorMarker) {
        this(z2, z3, paddingOption);
    }

    public final void b(int i2, int i3, int i4) {
        if (i3 < 0 || i3 > i2) {
            throw new IndexOutOfBoundsException("destination offset: " + i3 + ", destination size: " + i2);
        }
        int i5 = i3 + i4;
        if (i5 < 0 || i5 > i2) {
            throw new IndexOutOfBoundsException("The destination array does not have enough capacity, destination offset: " + i3 + ", destination size: " + i2 + ", capacity needed: " + i4);
        }
    }

    public final void c(int i2) {
        if (this.f40810c == PaddingOption.ABSENT) {
            throw new IllegalArgumentException("The padding option is set to ABSENT, but the input has a pad character at index " + i2);
        }
    }

    public final void d(int i2, int i3, int i4) {
        AbstractList.f40564z.a(i3, i4, i2);
    }

    public final int e(byte[] bArr, byte[] bArr2, int i2, int i3, int i4) {
        boolean z2;
        byte[] bArr3 = bArr;
        int i5 = i4;
        int[] c2 = this.f40808a ? Base64Kt.f40817d : Base64Kt.f40815b;
        int i6 = -8;
        int i7 = i2;
        int i8 = i3;
        int i9 = -8;
        int i10 = 0;
        while (true) {
            if (i8 >= i5) {
                z2 = false;
                break;
            }
            if (i9 == i6 && i8 + 3 < i5) {
                int i11 = i8 + 4;
                int i12 = (c2[bArr3[i8 + 1] & 255] << 12) | (c2[bArr3[i8] & 255] << 18) | (c2[bArr3[i8 + 2] & 255] << 6) | c2[bArr3[i8 + 3] & 255];
                if (i12 >= 0) {
                    bArr2[i7] = (byte) (i12 >> 16);
                    int i13 = i7 + 2;
                    bArr2[i7 + 1] = (byte) (i12 >> 8);
                    i7 += 3;
                    bArr2[i13] = (byte) i12;
                    i8 = i11;
                    i6 = -8;
                }
            }
            byte b2 = bArr3[i8] & 255;
            int i14 = c2[b2];
            if (i14 >= 0) {
                i8++;
                i10 = (i10 << 6) | i14;
                int i15 = i9 + 6;
                if (i15 >= 0) {
                    bArr2[i7] = (byte) (i10 >>> i15);
                    i10 &= (1 << i15) - 1;
                    i9 -= 2;
                    i7++;
                } else {
                    i9 = i15;
                }
            } else if (i14 == -2) {
                i8 = k(bArr3, i8, i5, i9);
                z2 = true;
                break;
            } else if (this.f40809b) {
                i8++;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Invalid symbol '");
                sb.append((char) b2);
                sb.append("'(");
                String num = Integer.toString(b2, CharsKt.a(8));
                Intrinsics.h(num, "toString(...)");
                sb.append(num);
                sb.append(") at index ");
                sb.append(i8);
                throw new IllegalArgumentException(sb.toString());
            }
            i6 = -8;
        }
        if (i9 == -2) {
            throw new IllegalArgumentException("The last unit of input does not have enough bits");
        } else if (i9 != -8 && !z2 && this.f40810c == PaddingOption.PRESENT) {
            throw new IllegalArgumentException("The padding option is set to PRESENT, but the input is not properly padded");
        } else if (i10 == 0) {
            int n2 = n(bArr3, i8, i5);
            if (n2 >= i5) {
                return i7 - i2;
            }
            byte b3 = bArr3[n2] & 255;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Symbol '");
            sb2.append((char) b3);
            sb2.append("'(");
            String num2 = Integer.toString(b3, CharsKt.a(8));
            Intrinsics.h(num2, "toString(...)");
            sb2.append(num2);
            sb2.append(") at index ");
            sb2.append(n2 - 1);
            sb2.append(" is prohibited after the pad character");
            throw new IllegalArgumentException(sb2.toString());
        } else {
            throw new IllegalArgumentException("The pad bits must be zeros");
        }
    }

    public final int f(byte[] bArr, byte[] bArr2, int i2, int i3, int i4) {
        Intrinsics.i(bArr, "source");
        Intrinsics.i(bArr2, "destination");
        d(bArr.length, i3, i4);
        b(bArr2.length, i2, g(bArr, i3, i4));
        return e(bArr, bArr2, i2, i3, i4);
    }

    public final int g(byte[] bArr, int i2, int i3) {
        Intrinsics.i(bArr, "source");
        int i4 = i3 - i2;
        if (i4 == 0) {
            return 0;
        }
        if (i4 != 1) {
            if (this.f40809b) {
                while (true) {
                    if (i2 >= i3) {
                        break;
                    }
                    int i5 = Base64Kt.f40815b[bArr[i2] & 255];
                    if (i5 < 0) {
                        if (i5 == -2) {
                            i4 -= i3 - i2;
                            break;
                        }
                        i4--;
                    }
                    i2++;
                }
            } else if (bArr[i3 - 1] == 61) {
                i4 = bArr[i3 + -2] == 61 ? i4 - 2 : i4 - 1;
            }
            return (int) ((((long) i4) * ((long) 6)) / ((long) 8));
        }
        throw new IllegalArgumentException("Input should have at least 2 symbols for Base64 decoding, startIndex: " + i2 + ", endIndex: " + i3);
    }

    public final int h(byte[] bArr, byte[] bArr2, int i2, int i3, int i4) {
        Intrinsics.i(bArr, "source");
        Intrinsics.i(bArr2, "destination");
        return i(bArr, bArr2, i2, i3, i4);
    }

    public final int i(byte[] bArr, byte[] bArr2, int i2, int i3, int i4) {
        byte[] bArr3 = bArr;
        byte[] bArr4 = bArr2;
        int i5 = i2;
        int i6 = i3;
        int i7 = i4;
        Intrinsics.i(bArr3, "source");
        Intrinsics.i(bArr4, "destination");
        d(bArr3.length, i6, i7);
        b(bArr4.length, i5, j(i7 - i6));
        byte[] d2 = this.f40808a ? Base64Kt.f40816c : Base64Kt.f40814a;
        int i8 = this.f40809b ? 19 : Integer.MAX_VALUE;
        int i9 = i5;
        while (i6 + 2 < i7) {
            int min = Math.min((i7 - i6) / 3, i8);
            for (int i10 = 0; i10 < min; i10++) {
                int i11 = i6 + 2;
                i6 += 3;
                byte b2 = ((bArr3[i6 + 1] & 255) << 8) | ((bArr3[i6] & 255) << 16) | (bArr3[i11] & 255);
                bArr4[i9] = d2[b2 >>> 18];
                bArr4[i9 + 1] = d2[(b2 >>> 12) & 63];
                int i12 = i9 + 3;
                bArr4[i9 + 2] = d2[(b2 >>> 6) & 63];
                i9 += 4;
                bArr4[i12] = d2[b2 & 63];
            }
            if (min == i8 && i6 != i7) {
                int i13 = i9 + 1;
                byte[] bArr5 = f40805e;
                bArr4[i9] = bArr5[0];
                i9 += 2;
                bArr4[i13] = bArr5[1];
            }
        }
        int i14 = i7 - i6;
        if (i14 == 1) {
            int i15 = i6 + 1;
            int i16 = (bArr3[i6] & 255) << 4;
            bArr4[i9] = d2[i16 >>> 6];
            int i17 = i9 + 2;
            bArr4[i9 + 1] = d2[i16 & 63];
            if (m()) {
                int i18 = i9 + 3;
                bArr4[i17] = 61;
                i9 += 4;
                bArr4[i18] = 61;
                i6 = i15;
            } else {
                i6 = i15;
                i9 = i17;
            }
        } else if (i14 == 2) {
            int i19 = i6 + 1;
            i6 += 2;
            int i20 = ((bArr3[i19] & 255) << 2) | ((bArr3[i6] & 255) << 10);
            bArr4[i9] = d2[i20 >>> 12];
            bArr4[i9 + 1] = d2[(i20 >>> 6) & 63];
            int i21 = i9 + 3;
            bArr4[i9 + 2] = d2[i20 & 63];
            if (m()) {
                i9 += 4;
                bArr4[i21] = 61;
            } else {
                i9 = i21;
            }
        }
        if (i6 == i7) {
            return i9 - i5;
        }
        throw new IllegalStateException("Check failed.");
    }

    public final int j(int i2) {
        int i3 = i2 / 3;
        int i4 = i2 % 3;
        int i5 = 4;
        int i6 = i3 * 4;
        if (i4 != 0) {
            if (!m()) {
                i5 = i4 + 1;
            }
            i6 += i5;
        }
        if (this.f40809b) {
            i6 += ((i6 - 1) / 76) * 2;
        }
        if (i6 >= 0) {
            return i6;
        }
        throw new IllegalArgumentException("Input is too big");
    }

    public final int k(byte[] bArr, int i2, int i3, int i4) {
        if (i4 != -8) {
            if (i4 == -6) {
                c(i2);
            } else if (i4 == -4) {
                c(i2);
                i2 = n(bArr, i2 + 1, i3);
                if (i2 == i3 || bArr[i2] != 61) {
                    throw new IllegalArgumentException("Missing one pad character at index " + i2);
                }
            } else if (i4 != -2) {
                throw new IllegalStateException("Unreachable");
            }
            return i2 + 1;
        }
        throw new IllegalArgumentException("Redundant pad character at index " + i2);
    }

    public final boolean l() {
        return this.f40809b;
    }

    public final boolean m() {
        PaddingOption paddingOption = this.f40810c;
        return paddingOption == PaddingOption.PRESENT || paddingOption == PaddingOption.PRESENT_OPTIONAL;
    }

    public final int n(byte[] bArr, int i2, int i3) {
        if (!this.f40809b) {
            return i2;
        }
        while (i2 < i3) {
            if (Base64Kt.f40815b[bArr[i2] & 255] != -1) {
                return i2;
            }
            i2++;
        }
        return i2;
    }

    public Base64(boolean z2, boolean z3, PaddingOption paddingOption) {
        this.f40808a = z2;
        this.f40809b = z3;
        this.f40810c = paddingOption;
        if (z2 && z3) {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }
}
