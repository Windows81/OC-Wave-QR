package com.google.zxing.aztec.encoder;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public final class HighLevelEncoder {

    /* renamed from: b  reason: collision with root package name */
    public static final String[] f32493b = {"UPPER", "LOWER", "DIGIT", "MIXED", "PUNCT"};

    /* renamed from: c  reason: collision with root package name */
    public static final int[][] f32494c = {new int[]{0, 327708, 327710, 327709, 656318}, new int[]{590318, 0, 327710, 327709, 656318}, new int[]{262158, 590300, 0, 590301, 932798}, new int[]{327709, 327708, 656318, 0, 327710}, new int[]{327711, 656380, 656382, 656381, 0}};

    /* renamed from: d  reason: collision with root package name */
    public static final int[][] f32495d;

    /* renamed from: e  reason: collision with root package name */
    public static final int[][] f32496e;

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f32497a;

    static {
        int[] iArr = new int[2];
        iArr[1] = 256;
        iArr[0] = 5;
        int[][] iArr2 = (int[][]) Array.newInstance(Integer.TYPE, iArr);
        f32495d = iArr2;
        iArr2[0][32] = 1;
        for (int i2 = 65; i2 <= 90; i2++) {
            f32495d[0][i2] = i2 - 63;
        }
        f32495d[1][32] = 1;
        for (int i3 = 97; i3 <= 122; i3++) {
            f32495d[1][i3] = i3 - 95;
        }
        f32495d[2][32] = 1;
        for (int i4 = 48; i4 <= 57; i4++) {
            f32495d[2][i4] = i4 - 46;
        }
        int[] iArr3 = f32495d[2];
        iArr3[44] = 12;
        iArr3[46] = 13;
        int[] iArr4 = {0, 32, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 27, 28, 29, 30, 31, 64, 92, 94, 95, 96, 124, 126, 127};
        for (int i5 = 0; i5 < 28; i5++) {
            f32495d[3][iArr4[i5]] = i5;
        }
        int[] iArr5 = {0, 13, 0, 0, 0, 0, 33, 39, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 58, 59, 60, 61, 62, 63, 91, 93, 123, 125};
        for (int i6 = 0; i6 < 31; i6++) {
            int i7 = iArr5[i6];
            if (i7 > 0) {
                f32495d[4][i7] = i6;
            }
        }
        int[] iArr6 = new int[2];
        iArr6[1] = 6;
        iArr6[0] = 6;
        int[][] iArr7 = (int[][]) Array.newInstance(Integer.TYPE, iArr6);
        f32496e = iArr7;
        for (int[] fill : iArr7) {
            Arrays.fill(fill, -1);
        }
        int[][] iArr8 = f32496e;
        iArr8[0][4] = 0;
        int[] iArr9 = iArr8[1];
        iArr9[4] = 0;
        iArr9[0] = 28;
        iArr8[3][4] = 0;
        int[] iArr10 = iArr8[2];
        iArr10[4] = 0;
        iArr10[0] = 15;
    }

    public HighLevelEncoder(byte[] bArr) {
        this.f32497a = bArr;
    }

    public static Collection b(Iterable iterable) {
        LinkedList linkedList = new LinkedList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            State state = (State) it.next();
            Iterator it2 = linkedList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    linkedList.add(state);
                    break;
                }
                State state2 = (State) it2.next();
                if (state2.g(state)) {
                    break;
                } else if (state.g(state2)) {
                    it2.remove();
                }
            }
        }
        return linkedList;
    }

    public static void d(State state, int i2, int i3, Collection collection) {
        State c2 = state.c(i2);
        collection.add(c2.h(4, i3));
        if (state.f() != 4) {
            collection.add(c2.i(4, i3));
        }
        if (i3 == 3 || i3 == 4) {
            collection.add(c2.h(2, 16 - i3).h(2, 1));
        }
        if (state.d() > 0) {
            collection.add(state.a(i2).a(i2 + 1));
        }
    }

    public static Collection f(Iterable iterable, int i2, int i3) {
        LinkedList linkedList = new LinkedList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            d((State) it.next(), i2, i3, linkedList);
        }
        return b(linkedList);
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0045  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.zxing.common.BitArray a() {
        /*
            r8 = this;
            com.google.zxing.aztec.encoder.State r0 = com.google.zxing.aztec.encoder.State.f32501e
            java.util.List r0 = java.util.Collections.singletonList(r0)
            r1 = 0
            r2 = r1
        L_0x0008:
            byte[] r3 = r8.f32497a
            int r4 = r3.length
            if (r2 >= r4) goto L_0x004c
            int r4 = r2 + 1
            int r5 = r3.length
            if (r4 >= r5) goto L_0x0015
            byte r5 = r3[r4]
            goto L_0x0016
        L_0x0015:
            r5 = r1
        L_0x0016:
            byte r3 = r3[r2]
            r6 = 13
            if (r3 == r6) goto L_0x0038
            r6 = 44
            r7 = 32
            if (r3 == r6) goto L_0x0034
            r6 = 46
            if (r3 == r6) goto L_0x0030
            r6 = 58
            if (r3 == r6) goto L_0x002c
        L_0x002a:
            r3 = r1
            goto L_0x003d
        L_0x002c:
            if (r5 != r7) goto L_0x002a
            r3 = 5
            goto L_0x003d
        L_0x0030:
            if (r5 != r7) goto L_0x002a
            r3 = 3
            goto L_0x003d
        L_0x0034:
            if (r5 != r7) goto L_0x002a
            r3 = 4
            goto L_0x003d
        L_0x0038:
            r3 = 10
            if (r5 != r3) goto L_0x002a
            r3 = 2
        L_0x003d:
            if (r3 <= 0) goto L_0x0045
            java.util.Collection r0 = f(r0, r2, r3)
            r2 = r4
            goto L_0x0049
        L_0x0045:
            java.util.Collection r0 = r8.e(r0, r2)
        L_0x0049:
            int r2 = r2 + 1
            goto L_0x0008
        L_0x004c:
            com.google.zxing.aztec.encoder.HighLevelEncoder$1 r1 = new com.google.zxing.aztec.encoder.HighLevelEncoder$1
            r1.<init>()
            java.lang.Object r0 = java.util.Collections.min(r0, r1)
            com.google.zxing.aztec.encoder.State r0 = (com.google.zxing.aztec.encoder.State) r0
            byte[] r1 = r8.f32497a
            com.google.zxing.common.BitArray r0 = r0.j(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.aztec.encoder.HighLevelEncoder.a():com.google.zxing.common.BitArray");
    }

    public final void c(State state, int i2, Collection collection) {
        char c2 = (char) (this.f32497a[i2] & 255);
        boolean z2 = f32495d[state.f()][c2] > 0;
        State state2 = null;
        for (int i3 = 0; i3 <= 4; i3++) {
            int i4 = f32495d[i3][c2];
            if (i4 > 0) {
                if (state2 == null) {
                    state2 = state.c(i2);
                }
                if (!z2 || i3 == state.f() || i3 == 2) {
                    collection.add(state2.h(i3, i4));
                }
                if (!z2 && f32496e[state.f()][i3] >= 0) {
                    collection.add(state2.i(i3, i4));
                }
            }
        }
        if (state.d() > 0 || f32495d[state.f()][c2] == 0) {
            collection.add(state.a(i2));
        }
    }

    public final Collection e(Iterable iterable, int i2) {
        LinkedList linkedList = new LinkedList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            c((State) it.next(), i2, linkedList);
        }
        return b(linkedList);
    }
}
