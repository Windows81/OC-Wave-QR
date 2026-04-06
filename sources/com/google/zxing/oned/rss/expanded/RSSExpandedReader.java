package com.google.zxing.oned.rss.expanded;

import com.google.zxing.oned.rss.AbstractRSSReader;

public final class RSSExpandedReader extends AbstractRSSReader {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f32751a = {7, 5, 4, 3, 1};

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f32752b = {4, 20, 52, 104, 204};

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f32753c = {0, 348, 1388, 2948, 3988};

    /* renamed from: d  reason: collision with root package name */
    public static final int[][] f32754d = {new int[]{1, 8, 4, 1}, new int[]{3, 6, 4, 1}, new int[]{3, 4, 6, 1}, new int[]{3, 2, 8, 1}, new int[]{2, 6, 5, 1}, new int[]{2, 2, 9, 1}};

    /* renamed from: e  reason: collision with root package name */
    public static final int[][] f32755e;

    /* renamed from: f  reason: collision with root package name */
    public static final int[][] f32756f = {new int[]{0, 0}, new int[]{0, 1, 1}, new int[]{0, 2, 1, 3}, new int[]{0, 4, 1, 3, 2}, new int[]{0, 4, 1, 3, 3, 5}, new int[]{0, 4, 1, 3, 4, 5, 5}, new int[]{0, 0, 1, 1, 2, 2, 3, 3}, new int[]{0, 0, 1, 1, 2, 2, 3, 4, 4}, new int[]{0, 0, 1, 1, 2, 2, 3, 4, 5, 5}, new int[]{0, 0, 1, 1, 2, 3, 3, 4, 4, 5, 5}};

    static {
        int[] iArr = new int[8];
        int[] iArr2 = iArr;
        // fill-array-data instruction
        iArr[0] = 1;
        iArr[1] = 3;
        iArr[2] = 9;
        iArr[3] = 27;
        iArr[4] = 81;
        iArr[5] = 32;
        iArr[6] = 96;
        iArr[7] = 77;
        int[] iArr3 = new int[8];
        int[] iArr4 = iArr3;
        // fill-array-data instruction
        iArr3[0] = 20;
        iArr3[1] = 60;
        iArr3[2] = 180;
        iArr3[3] = 118;
        iArr3[4] = 143;
        iArr3[5] = 7;
        iArr3[6] = 21;
        iArr3[7] = 63;
        int[] iArr5 = new int[8];
        int[] iArr6 = iArr5;
        // fill-array-data instruction
        iArr5[0] = 189;
        iArr5[1] = 145;
        iArr5[2] = 13;
        iArr5[3] = 39;
        iArr5[4] = 117;
        iArr5[5] = 140;
        iArr5[6] = 209;
        iArr5[7] = 205;
        int[] iArr7 = new int[8];
        int[] iArr8 = iArr7;
        // fill-array-data instruction
        iArr7[0] = 193;
        iArr7[1] = 157;
        iArr7[2] = 49;
        iArr7[3] = 147;
        iArr7[4] = 19;
        iArr7[5] = 57;
        iArr7[6] = 171;
        iArr7[7] = 91;
        int[] iArr9 = new int[8];
        int[] iArr10 = iArr9;
        // fill-array-data instruction
        iArr9[0] = 62;
        iArr9[1] = 186;
        iArr9[2] = 136;
        iArr9[3] = 197;
        iArr9[4] = 169;
        iArr9[5] = 85;
        iArr9[6] = 44;
        iArr9[7] = 132;
        int[] iArr11 = new int[8];
        int[] iArr12 = iArr11;
        // fill-array-data instruction
        iArr11[0] = 185;
        iArr11[1] = 133;
        iArr11[2] = 188;
        iArr11[3] = 142;
        iArr11[4] = 4;
        iArr11[5] = 12;
        iArr11[6] = 36;
        iArr11[7] = 108;
        int[] iArr13 = new int[8];
        int[] iArr14 = iArr13;
        // fill-array-data instruction
        iArr13[0] = 113;
        iArr13[1] = 128;
        iArr13[2] = 173;
        iArr13[3] = 97;
        iArr13[4] = 80;
        iArr13[5] = 29;
        iArr13[6] = 87;
        iArr13[7] = 50;
        int[] iArr15 = new int[8];
        int[] iArr16 = iArr15;
        // fill-array-data instruction
        iArr15[0] = 150;
        iArr15[1] = 28;
        iArr15[2] = 84;
        iArr15[3] = 41;
        iArr15[4] = 123;
        iArr15[5] = 158;
        iArr15[6] = 52;
        iArr15[7] = 156;
        int[] iArr17 = new int[8];
        int[] iArr18 = iArr17;
        // fill-array-data instruction
        iArr17[0] = 46;
        iArr17[1] = 138;
        iArr17[2] = 203;
        iArr17[3] = 187;
        iArr17[4] = 139;
        iArr17[5] = 206;
        iArr17[6] = 196;
        iArr17[7] = 166;
        int[] iArr19 = new int[8];
        int[] iArr20 = iArr19;
        // fill-array-data instruction
        iArr19[0] = 76;
        iArr19[1] = 17;
        iArr19[2] = 51;
        iArr19[3] = 153;
        iArr19[4] = 37;
        iArr19[5] = 111;
        iArr19[6] = 122;
        iArr19[7] = 155;
        int[] iArr21 = new int[8];
        // fill-array-data instruction
        iArr21[0] = 43;
        iArr21[1] = 129;
        iArr21[2] = 176;
        iArr21[3] = 106;
        iArr21[4] = 107;
        iArr21[5] = 110;
        iArr21[6] = 119;
        iArr21[7] = 146;
        int[] iArr22 = new int[8];
        int[] iArr23 = iArr22;
        // fill-array-data instruction
        iArr22[0] = 16;
        iArr22[1] = 48;
        iArr22[2] = 144;
        iArr22[3] = 10;
        iArr22[4] = 30;
        iArr22[5] = 90;
        iArr22[6] = 59;
        iArr22[7] = 177;
        int[] iArr24 = new int[8];
        int[] iArr25 = iArr24;
        // fill-array-data instruction
        iArr24[0] = 109;
        iArr24[1] = 116;
        iArr24[2] = 137;
        iArr24[3] = 200;
        iArr24[4] = 178;
        iArr24[5] = 112;
        iArr24[6] = 125;
        iArr24[7] = 164;
        int[] iArr26 = new int[8];
        int[] iArr27 = iArr26;
        // fill-array-data instruction
        iArr26[0] = 70;
        iArr26[1] = 210;
        iArr26[2] = 208;
        iArr26[3] = 202;
        iArr26[4] = 184;
        iArr26[5] = 130;
        iArr26[6] = 179;
        iArr26[7] = 115;
        int[] iArr28 = new int[8];
        int[] iArr29 = iArr28;
        // fill-array-data instruction
        iArr28[0] = 134;
        iArr28[1] = 191;
        iArr28[2] = 151;
        iArr28[3] = 31;
        iArr28[4] = 93;
        iArr28[5] = 68;
        iArr28[6] = 204;
        iArr28[7] = 190;
        int[] iArr30 = new int[8];
        int[] iArr31 = iArr30;
        // fill-array-data instruction
        iArr30[0] = 148;
        iArr30[1] = 22;
        iArr30[2] = 66;
        iArr30[3] = 198;
        iArr30[4] = 172;
        iArr30[5] = 94;
        iArr30[6] = 71;
        iArr30[7] = 2;
        int[] iArr32 = new int[8];
        int[] iArr33 = iArr32;
        // fill-array-data instruction
        iArr32[0] = 6;
        iArr32[1] = 18;
        iArr32[2] = 54;
        iArr32[3] = 162;
        iArr32[4] = 64;
        iArr32[5] = 192;
        iArr32[6] = 154;
        iArr32[7] = 40;
        int[] iArr34 = new int[8];
        int[] iArr35 = iArr34;
        // fill-array-data instruction
        iArr34[0] = 120;
        iArr34[1] = 149;
        iArr34[2] = 25;
        iArr34[3] = 75;
        iArr34[4] = 14;
        iArr34[5] = 42;
        iArr34[6] = 126;
        iArr34[7] = 167;
        int[] iArr36 = new int[8];
        int[] iArr37 = iArr36;
        // fill-array-data instruction
        iArr36[0] = 79;
        iArr36[1] = 26;
        iArr36[2] = 78;
        iArr36[3] = 23;
        iArr36[4] = 69;
        iArr36[5] = 207;
        iArr36[6] = 199;
        iArr36[7] = 175;
        int[] iArr38 = new int[8];
        int[] iArr39 = iArr38;
        // fill-array-data instruction
        iArr38[0] = 103;
        iArr38[1] = 98;
        iArr38[2] = 83;
        iArr38[3] = 38;
        iArr38[4] = 114;
        iArr38[5] = 131;
        iArr38[6] = 182;
        iArr38[7] = 124;
        int[] iArr40 = new int[8];
        int[] iArr41 = iArr40;
        // fill-array-data instruction
        iArr40[0] = 161;
        iArr40[1] = 61;
        iArr40[2] = 183;
        iArr40[3] = 127;
        iArr40[4] = 170;
        iArr40[5] = 88;
        iArr40[6] = 53;
        iArr40[7] = 159;
        int[] iArr42 = new int[8];
        int[] iArr43 = iArr42;
        // fill-array-data instruction
        iArr42[0] = 55;
        iArr42[1] = 165;
        iArr42[2] = 73;
        iArr42[3] = 8;
        iArr42[4] = 24;
        iArr42[5] = 72;
        iArr42[6] = 5;
        iArr42[7] = 15;
        int[] iArr44 = new int[8];
        // fill-array-data instruction
        iArr44[0] = 45;
        iArr44[1] = 135;
        iArr44[2] = 194;
        iArr44[3] = 160;
        iArr44[4] = 58;
        iArr44[5] = 174;
        iArr44[6] = 100;
        iArr44[7] = 89;
        f32755e = new int[][]{iArr2, iArr4, iArr6, iArr8, iArr10, iArr12, iArr14, iArr16, iArr18, iArr20, iArr21, iArr23, iArr25, iArr27, iArr29, iArr31, iArr33, iArr35, iArr37, iArr39, iArr41, iArr43, iArr44};
    }
}
