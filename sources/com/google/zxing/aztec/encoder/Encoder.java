package com.google.zxing.aztec.encoder;

import com.google.zxing.common.BitArray;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.reedsolomon.GenericGF;
import com.google.zxing.common.reedsolomon.ReedSolomonEncoder;

public final class Encoder {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f32492a = {4, 6, 6, 8, 8, 8, 8, 8, 8, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12};

    public static int[] a(BitArray bitArray, int i2, int i3) {
        int[] iArr = new int[i3];
        int i4 = bitArray.i() / i2;
        for (int i5 = 0; i5 < i4; i5++) {
            int i6 = 0;
            for (int i7 = 0; i7 < i2; i7++) {
                i6 |= bitArray.h((i5 * i2) + i7) ? 1 << ((i2 - i7) - 1) : 0;
            }
            iArr[i5] = i6;
        }
        return iArr;
    }

    public static void b(BitMatrix bitMatrix, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4 += 2) {
            int i5 = i2 - i4;
            int i6 = i5;
            while (true) {
                int i7 = i2 + i4;
                if (i6 > i7) {
                    break;
                }
                bitMatrix.i(i6, i5);
                bitMatrix.i(i6, i7);
                bitMatrix.i(i5, i6);
                bitMatrix.i(i7, i6);
                i6++;
            }
        }
        int i8 = i2 - i3;
        bitMatrix.i(i8, i8);
        int i9 = i8 + 1;
        bitMatrix.i(i9, i8);
        bitMatrix.i(i8, i9);
        int i10 = i2 + i3;
        bitMatrix.i(i10, i8);
        bitMatrix.i(i10, i9);
        bitMatrix.i(i10, i10 - 1);
    }

    public static void c(BitMatrix bitMatrix, boolean z2, int i2, BitArray bitArray) {
        int i3 = i2 / 2;
        int i4 = 0;
        if (z2) {
            while (i4 < 7) {
                int i5 = (i3 - 3) + i4;
                if (bitArray.h(i4)) {
                    bitMatrix.i(i5, i3 - 5);
                }
                if (bitArray.h(i4 + 7)) {
                    bitMatrix.i(i3 + 5, i5);
                }
                if (bitArray.h(20 - i4)) {
                    bitMatrix.i(i5, i3 + 5);
                }
                if (bitArray.h(27 - i4)) {
                    bitMatrix.i(i3 - 5, i5);
                }
                i4++;
            }
            return;
        }
        while (i4 < 10) {
            int i6 = (i3 - 5) + i4 + (i4 / 5);
            if (bitArray.h(i4)) {
                bitMatrix.i(i6, i3 - 7);
            }
            if (bitArray.h(i4 + 10)) {
                bitMatrix.i(i3 + 7, i6);
            }
            if (bitArray.h(29 - i4)) {
                bitMatrix.i(i6, i3 + 7);
            }
            if (bitArray.h(39 - i4)) {
                bitMatrix.i(i3 - 7, i6);
            }
            i4++;
        }
    }

    public static AztecCode d(byte[] bArr, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        boolean z2;
        BitArray bitArray;
        int i7;
        BitArray a2 = new HighLevelEncoder(bArr).a();
        int i8 = 11;
        int i9 = ((a2.i() * i2) / 100) + 11;
        int i10 = a2.i() + i9;
        int i11 = 32;
        boolean z3 = true;
        if (i3 != 0) {
            z2 = i3 < 0;
            i5 = Math.abs(i3);
            if (z2) {
                i11 = 4;
            }
            if (i5 <= i11) {
                i6 = i(i5, z2);
                i4 = f32492a[i5];
                int i12 = i6 - (i6 % i4);
                bitArray = h(a2, i4);
                if (bitArray.i() + i9 > i12) {
                    throw new IllegalArgumentException("Data to large for user specified layer");
                } else if (z2 && bitArray.i() > (i4 << 6)) {
                    throw new IllegalArgumentException("Data to large for user specified layer");
                }
            } else {
                throw new IllegalArgumentException(String.format("Illegal value %s for layers", new Object[]{Integer.valueOf(i3)}));
            }
        } else {
            BitArray bitArray2 = null;
            int i13 = 0;
            int i14 = 0;
            while (i13 <= 32) {
                boolean z4 = i13 <= 3 ? z3 : false;
                int i15 = z4 ? i13 + 1 : i13;
                int i16 = i(i15, z4);
                if (i10 <= i16) {
                    if (bitArray2 == null || i14 != f32492a[i15]) {
                        int i17 = f32492a[i15];
                        i14 = i17;
                        bitArray2 = h(a2, i17);
                    }
                    int i18 = i16 - (i16 % i14);
                    if ((!z4 || bitArray2.i() <= (i14 << 6)) && bitArray2.i() + i9 <= i18) {
                        bitArray = bitArray2;
                        i4 = i14;
                        z2 = z4;
                        i5 = i15;
                        i6 = i16;
                    }
                }
                i13++;
                z3 = z3;
            }
            throw new IllegalArgumentException("Data too large for an Aztec code");
        }
        BitArray e2 = e(bitArray, i6, i4);
        int i19 = bitArray.i() / i4;
        BitArray f2 = f(z2, i5, i19);
        if (!z2) {
            i8 = 14;
        }
        int i20 = i8 + (i5 << 2);
        int[] iArr = new int[i20];
        int i21 = 2;
        if (z2) {
            for (int i22 = 0; i22 < i20; i22++) {
                iArr[i22] = i22;
            }
            i7 = i20;
        } else {
            int i23 = i20 / 2;
            i7 = i20 + 1 + (((i23 - 1) / 15) * 2);
            int i24 = i7 / 2;
            for (int i25 = 0; i25 < i23; i25++) {
                int i26 = (i25 / 15) + i25;
                iArr[(i23 - i25) - (z3 ? 1 : 0)] = (i24 - i26) - 1;
                iArr[i23 + i25] = i26 + i24 + z3;
            }
        }
        BitMatrix bitMatrix = new BitMatrix(i7);
        int i27 = 0;
        int i28 = 0;
        while (i27 < i5) {
            int i29 = ((i5 - i27) << i21) + (z2 ? 9 : 12);
            int i30 = 0;
            while (i30 < i29) {
                int i31 = i30 << 1;
                int i32 = 0;
                while (i32 < i21) {
                    if (e2.h(i28 + i31 + i32)) {
                        int i33 = i27 << 1;
                        bitMatrix.i(iArr[i33 + i32], iArr[i33 + i30]);
                    }
                    if (e2.h((i29 << 1) + i28 + i31 + i32)) {
                        int i34 = i27 << 1;
                        bitMatrix.i(iArr[i34 + i30], iArr[((i20 - 1) - i34) - i32]);
                    }
                    if (e2.h((i29 << 2) + i28 + i31 + i32)) {
                        int i35 = (i20 - 1) - (i27 << 1);
                        bitMatrix.i(iArr[i35 - i32], iArr[i35 - i30]);
                    }
                    if (e2.h((i29 * 6) + i28 + i31 + i32)) {
                        int i36 = i27 << 1;
                        bitMatrix.i(iArr[((i20 - 1) - i36) - i30], iArr[i36 + i32]);
                    }
                    i32++;
                    i21 = 2;
                }
                i30++;
                i21 = 2;
            }
            i28 += i29 << 3;
            i27++;
            i21 = 2;
        }
        c(bitMatrix, z2, i7, f2);
        if (z2) {
            b(bitMatrix, i7 / 2, 5);
        } else {
            int i37 = i7 / 2;
            b(bitMatrix, i37, 7);
            int i38 = 0;
            int i39 = 0;
            while (i39 < (i20 / 2) - 1) {
                for (int i40 = i37 & 1; i40 < i7; i40 += 2) {
                    int i41 = i37 - i38;
                    bitMatrix.i(i41, i40);
                    int i42 = i37 + i38;
                    bitMatrix.i(i42, i40);
                    bitMatrix.i(i40, i41);
                    bitMatrix.i(i40, i42);
                }
                i39 += 15;
                i38 += 16;
            }
        }
        AztecCode aztecCode = new AztecCode();
        aztecCode.c(z2);
        aztecCode.f(i7);
        aztecCode.d(i5);
        aztecCode.b(i19);
        aztecCode.e(bitMatrix);
        return aztecCode;
    }

    public static BitArray e(BitArray bitArray, int i2, int i3) {
        ReedSolomonEncoder reedSolomonEncoder = new ReedSolomonEncoder(g(i3));
        int i4 = i2 / i3;
        int[] a2 = a(bitArray, i3, i4);
        reedSolomonEncoder.b(a2, i4 - (bitArray.i() / i3));
        BitArray bitArray2 = new BitArray();
        bitArray2.e(0, i2 % i3);
        for (int e2 : a2) {
            bitArray2.e(e2, i3);
        }
        return bitArray2;
    }

    public static BitArray f(boolean z2, int i2, int i3) {
        BitArray bitArray = new BitArray();
        if (z2) {
            bitArray.e(i2 - 1, 2);
            bitArray.e(i3 - 1, 6);
            return e(bitArray, 28, 4);
        }
        bitArray.e(i2 - 1, 5);
        bitArray.e(i3 - 1, 11);
        return e(bitArray, 40, 4);
    }

    public static GenericGF g(int i2) {
        if (i2 == 4) {
            return GenericGF.f32622k;
        }
        if (i2 == 6) {
            return GenericGF.f32621j;
        }
        if (i2 == 8) {
            return GenericGF.f32625n;
        }
        if (i2 == 10) {
            return GenericGF.f32620i;
        }
        if (i2 == 12) {
            return GenericGF.f32619h;
        }
        throw new IllegalArgumentException("Unsupported word size ".concat(String.valueOf(i2)));
    }

    public static BitArray h(BitArray bitArray, int i2) {
        BitArray bitArray2 = new BitArray();
        int i3 = bitArray.i();
        int i4 = (1 << i2) - 2;
        int i5 = 0;
        while (i5 < i3) {
            int i6 = 0;
            for (int i7 = 0; i7 < i2; i7++) {
                int i8 = i5 + i7;
                if (i8 >= i3 || bitArray.h(i8)) {
                    i6 |= 1 << ((i2 - 1) - i7);
                }
            }
            int i9 = i6 & i4;
            if (i9 == i4) {
                bitArray2.e(i9, i2);
            } else if (i9 == 0) {
                bitArray2.e(i6 | 1, i2);
            } else {
                bitArray2.e(i6, i2);
                i5 += i2;
            }
            i5--;
            i5 += i2;
        }
        return bitArray2;
    }

    public static int i(int i2, boolean z2) {
        return ((z2 ? 88 : 112) + (i2 << 4)) * i2;
    }
}
