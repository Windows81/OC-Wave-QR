package androidx.collection;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public abstract class IntFloatMap {

    /* renamed from: a  reason: collision with root package name */
    public long[] f1770a;

    /* renamed from: b  reason: collision with root package name */
    public int[] f1771b;

    /* renamed from: c  reason: collision with root package name */
    public float[] f1772c;

    /* renamed from: d  reason: collision with root package name */
    public int f1773d;

    /* renamed from: e  reason: collision with root package name */
    public int f1774e;

    public /* synthetic */ IntFloatMap(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final int a(int i2) {
        int hashCode = Integer.hashCode(i2) * -862048943;
        int i3 = hashCode ^ (hashCode << 16);
        int i4 = i3 & 127;
        int i5 = this.f1773d;
        int i6 = (i3 >>> 7) & i5;
        int i7 = 0;
        while (true) {
            long[] jArr = this.f1770a;
            int i8 = i6 >> 3;
            int i9 = (i6 & 7) << 3;
            long j2 = ((jArr[i8 + 1] << (64 - i9)) & ((-((long) i9)) >> 63)) | (jArr[i8] >>> i9);
            long j3 = (((long) i4) * 72340172838076673L) ^ j2;
            for (long j4 = (~j3) & (j3 - 72340172838076673L) & -9187201950435737472L; j4 != 0; j4 &= j4 - 1) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j4) >> 3) + i6) & i5;
                if (this.f1771b[numberOfTrailingZeros] == i2) {
                    return numberOfTrailingZeros;
                }
            }
            if ((j2 & ((~j2) << 6) & -9187201950435737472L) != 0) {
                return -1;
            }
            i7 += 8;
            i6 = (i6 + i7) & i5;
        }
    }

    public final int b() {
        return this.f1773d;
    }

    public final int c() {
        return this.f1774e;
    }

    public final boolean d() {
        return this.f1774e == 0;
    }

    /* JADX WARNING: type inference failed for: r19v0, types: [java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = 1
            if (r1 != r0) goto L_0x0008
            return r2
        L_0x0008:
            boolean r3 = r1 instanceof androidx.collection.IntFloatMap
            r4 = 0
            if (r3 != 0) goto L_0x000e
            return r4
        L_0x000e:
            androidx.collection.IntFloatMap r1 = (androidx.collection.IntFloatMap) r1
            int r3 = r1.c()
            int r5 = r18.c()
            if (r3 == r5) goto L_0x001b
            return r4
        L_0x001b:
            int[] r3 = r0.f1771b
            float[] r5 = r0.f1772c
            long[] r6 = r0.f1770a
            int r7 = r6.length
            int r7 = r7 + -2
            if (r7 < 0) goto L_0x006b
            r8 = r4
        L_0x0027:
            r9 = r6[r8]
            long r11 = ~r9
            r13 = 7
            long r11 = r11 << r13
            long r11 = r11 & r9
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r13
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 == 0) goto L_0x006d
            int r11 = r8 - r7
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = r4
        L_0x0041:
            if (r13 >= r11) goto L_0x0068
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 128(0x80, double:6.32E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L_0x0063
            int r14 = r8 << 3
            int r14 = r14 + r13
            r15 = r3[r14]
            r14 = r5[r14]
            int r15 = r1.a(r15)
            if (r15 < 0) goto L_0x0062
            float[] r2 = r1.f1772c
            r2 = r2[r15]
            int r2 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r2 != 0) goto L_0x0062
            goto L_0x0063
        L_0x0062:
            return r4
        L_0x0063:
            long r9 = r9 >> r12
            int r13 = r13 + 1
            r2 = 1
            goto L_0x0041
        L_0x0068:
            if (r11 != r12) goto L_0x006b
            goto L_0x006d
        L_0x006b:
            r1 = 1
            goto L_0x0073
        L_0x006d:
            if (r8 == r7) goto L_0x006b
            int r8 = r8 + 1
            r2 = 1
            goto L_0x0027
        L_0x0073:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.IntFloatMap.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int[] iArr = this.f1771b;
        float[] fArr = this.f1772c;
        long[] jArr = this.f1770a;
        int length = jArr.length - 2;
        int i2 = 0;
        if (length >= 0) {
            int i3 = 0;
            int i4 = 0;
            while (true) {
                long j2 = jArr[i3];
                if ((((~j2) << 7) & j2 & -9187201950435737472L) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i6 = 0; i6 < i5; i6++) {
                        if ((255 & j2) < 128) {
                            int i7 = (i3 << 3) + i6;
                            int i8 = iArr[i7];
                            i4 += Float.hashCode(fArr[i7]) ^ Integer.hashCode(i8);
                        }
                        j2 >>= 8;
                    }
                    if (i5 != 8) {
                        return i4;
                    }
                }
                if (i3 == length) {
                    i2 = i4;
                    break;
                }
                i3++;
            }
        }
        return i2;
    }

    public String toString() {
        if (d()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder();
        sb.append('{');
        int[] iArr = this.f1771b;
        float[] fArr = this.f1772c;
        long[] jArr = this.f1770a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            int i3 = 0;
            while (true) {
                long j2 = jArr[i2];
                if ((((~j2) << 7) & j2 & -9187201950435737472L) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j2) < 128) {
                            int i6 = (i2 << 3) + i5;
                            int i7 = iArr[i6];
                            float f2 = fArr[i6];
                            sb.append(i7);
                            sb.append("=");
                            sb.append(f2);
                            i3++;
                            if (i3 < this.f1774e) {
                                sb.append(',');
                                sb.append(' ');
                            }
                        }
                        j2 >>= 8;
                    }
                    if (i4 != 8) {
                        break;
                    }
                }
                if (i2 == length) {
                    break;
                }
                i2++;
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        Intrinsics.h(sb2, "toString(...)");
        return sb2;
    }

    public IntFloatMap() {
        this.f1770a = ScatterMapKt.f1964a;
        this.f1771b = IntSetKt.a();
        this.f1772c = FloatSetKt.a();
    }
}
