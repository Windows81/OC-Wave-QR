package androidx.compose.ui.node;

import kotlin.Metadata;

@Metadata
public final class MyersDiffKt {
    public static final void b(IntStack intStack, DiffCallback diffCallback) {
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i2 < intStack.c()) {
            int i5 = i2 + 2;
            int b2 = intStack.b(i2) - intStack.b(i5);
            int b3 = intStack.b(i2 + 1) - intStack.b(i5);
            int b4 = intStack.b(i5);
            i2 += 3;
            while (i3 < b2) {
                diffCallback.a(i4, i3);
                i3++;
            }
            while (i4 < b3) {
                diffCallback.d(i4);
                i4++;
            }
            while (true) {
                int i6 = b4 - 1;
                if (b4 > 0) {
                    diffCallback.c(i3, i4);
                    i3++;
                    i4++;
                    b4 = i6;
                }
            }
        }
    }

    public static final boolean c(int i2, int i3, int i4, int i5, DiffCallback diffCallback, int[] iArr, int[] iArr2, int i6, int[] iArr3) {
        int i7;
        int i8;
        int i9;
        int i10 = i2;
        int i11 = i4;
        int[] iArr4 = iArr2;
        int i12 = i6;
        int i13 = (i3 - i10) - (i5 - i11);
        boolean z2 = (i13 & 1) == 0;
        int i14 = -i12;
        for (int i15 = i14; i15 <= i12; i15 += 2) {
            if (i15 == i14 || (i15 != i12 && CenteredArray.c(iArr4, i15 + 1) < CenteredArray.c(iArr4, i15 - 1))) {
                i8 = CenteredArray.c(iArr4, i15 + 1);
                i7 = i8;
            } else {
                i8 = CenteredArray.c(iArr4, i15 - 1);
                i7 = i8 - 1;
            }
            int i16 = i5 - ((i3 - i7) - i15);
            int i17 = ((i12 != 0 ? 1 : 0) & (i7 == i8 ? 1 : 0)) + i16;
            while (true) {
                if (i7 > i10 && i16 > i11) {
                    if (!diffCallback.b(i7 - 1, i16 - 1)) {
                        break;
                    }
                    i7--;
                    i16--;
                } else {
                    DiffCallback diffCallback2 = diffCallback;
                }
            }
            DiffCallback diffCallback22 = diffCallback;
            CenteredArray.f(iArr4, i15, i7);
            if (!z2 || (i9 = i13 - i15) < i14 || i9 > i12) {
                int[] iArr5 = iArr;
            } else if (CenteredArray.c(iArr, i9) >= i7) {
                f(i7, i16, i8, i17, true, iArr3);
                return true;
            }
        }
        return false;
    }

    public static final IntStack d(int i2, int i3, DiffCallback diffCallback) {
        int[] iArr;
        int i4 = i2;
        int i5 = i3;
        int i6 = ((i4 + i5) + 1) / 2;
        IntStack intStack = new IntStack(i6 * 3);
        IntStack intStack2 = new IntStack(i6 * 4);
        intStack2.h(0, i4, 0, i5);
        int i7 = (i6 * 2) + 1;
        int[] a2 = CenteredArray.a(new int[i7]);
        int[] a3 = CenteredArray.a(new int[i7]);
        int[] b2 = Snake.b(new int[5]);
        while (intStack2.d()) {
            int f2 = intStack2.f();
            int f3 = intStack2.f();
            int f4 = intStack2.f();
            int f5 = intStack2.f();
            int i8 = f5;
            int i9 = f4;
            int i10 = f3;
            int i11 = f2;
            int[] iArr2 = b2;
            if (h(f5, f4, f3, f2, diffCallback, a2, a3, iArr2)) {
                if (Math.min(iArr2[2] - iArr2[0], iArr2[3] - iArr2[1]) > 0) {
                    iArr = iArr2;
                    Snake.a(iArr, intStack);
                } else {
                    iArr = iArr2;
                }
                intStack2.h(i8, iArr[0], i10, iArr[1]);
                intStack2.h(iArr[2], i9, iArr[3], i11);
                b2 = iArr;
            } else {
                b2 = iArr2;
            }
        }
        intStack.k();
        intStack.g(i4, i5, 0);
        return intStack;
    }

    public static final void e(int i2, int i3, DiffCallback diffCallback) {
        b(d(i2, i3, diffCallback), diffCallback);
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [boolean] */
    /* JADX WARNING: type inference failed for: r7v0, types: [int[]] */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void f(int r2, int r3, int r4, int r5, boolean r6, int[] r7) {
        /*
            int r0 = r7.length
            r1 = 5
            if (r0 >= r1) goto L_0x0005
            return
        L_0x0005:
            r0 = 0
            r7[r0] = r2
            r2 = 1
            r7[r2] = r3
            r2 = 2
            r7[r2] = r4
            r2 = 3
            r7[r2] = r5
            r2 = 4
            r7[r2] = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.MyersDiffKt.f(int, int, int, int, boolean, int[]):void");
    }

    public static final boolean g(int i2, int i3, int i4, int i5, DiffCallback diffCallback, int[] iArr, int[] iArr2, int i6, int[] iArr3) {
        int i7;
        int i8;
        int i9;
        int i10 = i3;
        int i11 = i5;
        int[] iArr4 = iArr;
        int i12 = i6;
        int i13 = (i10 - i2) - (i11 - i4);
        boolean z2 = (Math.abs(i13) & 1) == 1;
        int i14 = -i12;
        for (int i15 = i14; i15 <= i12; i15 += 2) {
            if (i15 == i14 || (i15 != i12 && CenteredArray.c(iArr4, i15 + 1) > CenteredArray.c(iArr4, i15 - 1))) {
                i8 = CenteredArray.c(iArr4, i15 + 1);
                i7 = i8;
            } else {
                i8 = CenteredArray.c(iArr4, i15 - 1);
                i7 = i8 + 1;
            }
            int i16 = (i4 + (i7 - i2)) - i15;
            int i17 = i16 - ((i12 != 0 ? 1 : 0) & (i7 == i8 ? 1 : 0));
            while (true) {
                if (i7 < i10 && i16 < i11) {
                    if (!diffCallback.b(i7, i16)) {
                        break;
                    }
                    i7++;
                    i16++;
                } else {
                    DiffCallback diffCallback2 = diffCallback;
                }
            }
            CenteredArray.f(iArr4, i15, i7);
            if (!z2 || (i9 = i13 - i15) < i14 + 1 || i9 > i12 - 1) {
                int[] iArr5 = iArr2;
            } else if (CenteredArray.c(iArr2, i9) <= i7) {
                f(i8, i17, i7, i16, false, iArr3);
                return true;
            }
        }
        return false;
    }

    public static final boolean h(int i2, int i3, int i4, int i5, DiffCallback diffCallback, int[] iArr, int[] iArr2, int[] iArr3) {
        int i6 = i2;
        int i7 = i3;
        int i8 = i7 - i6;
        int i9 = i5 - i4;
        if (i8 >= 1 && i9 >= 1) {
            int i10 = ((i8 + i9) + 1) / 2;
            CenteredArray.f(iArr, 1, i6);
            CenteredArray.f(iArr2, 1, i7);
            int i11 = 0;
            while (i11 < i10) {
                int i12 = i11;
                if (g(i2, i3, i4, i5, diffCallback, iArr, iArr2, i11, iArr3) || c(i2, i3, i4, i5, diffCallback, iArr, iArr2, i12, iArr3)) {
                    return true;
                }
                i11 = i12 + 1;
            }
        }
        return false;
    }

    public static final void i(int[] iArr, int i2, int i3) {
        int i4 = iArr[i2];
        iArr[i2] = iArr[i3];
        iArr[i3] = i4;
    }
}
