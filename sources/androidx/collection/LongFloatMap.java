package androidx.collection;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public abstract class LongFloatMap {

    /* renamed from: a  reason: collision with root package name */
    public long[] f1806a;

    /* renamed from: b  reason: collision with root package name */
    public long[] f1807b;

    /* renamed from: c  reason: collision with root package name */
    public float[] f1808c;

    /* renamed from: d  reason: collision with root package name */
    public int f1809d;

    /* renamed from: e  reason: collision with root package name */
    public int f1810e;

    public /* synthetic */ LongFloatMap(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final int a(long j2) {
        int hashCode = Long.hashCode(j2) * -862048943;
        int i2 = hashCode ^ (hashCode << 16);
        int i3 = i2 & 127;
        int i4 = this.f1809d;
        int i5 = (i2 >>> 7) & i4;
        int i6 = 0;
        while (true) {
            long[] jArr = this.f1806a;
            int i7 = i5 >> 3;
            int i8 = (i5 & 7) << 3;
            long j3 = ((jArr[i7 + 1] << (64 - i8)) & ((-((long) i8)) >> 63)) | (jArr[i7] >>> i8);
            long j4 = (((long) i3) * 72340172838076673L) ^ j3;
            for (long j5 = (~j4) & (j4 - 72340172838076673L) & -9187201950435737472L; j5 != 0; j5 &= j5 - 1) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j5) >> 3) + i5) & i4;
                if (this.f1807b[numberOfTrailingZeros] == j2) {
                    return numberOfTrailingZeros;
                }
            }
            if ((j3 & ((~j3) << 6) & -9187201950435737472L) != 0) {
                return -1;
            }
            i6 += 8;
            i5 = (i5 + i6) & i4;
        }
    }

    public final int b() {
        return this.f1809d;
    }

    public final int c() {
        return this.f1810e;
    }

    public final boolean d() {
        return this.f1810e == 0;
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
            boolean r3 = r1 instanceof androidx.collection.LongFloatMap
            r4 = 0
            if (r3 != 0) goto L_0x000e
            return r4
        L_0x000e:
            androidx.collection.LongFloatMap r1 = (androidx.collection.LongFloatMap) r1
            int r3 = r1.c()
            int r5 = r18.c()
            if (r3 == r5) goto L_0x001b
            return r4
        L_0x001b:
            long[] r3 = r0.f1807b
            float[] r5 = r0.f1808c
            long[] r6 = r0.f1806a
            int r7 = r6.length
            int r7 = r7 + -2
            if (r7 < 0) goto L_0x0072
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
            if (r13 >= r11) goto L_0x006b
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 128(0x80, double:6.32E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L_0x0066
            int r14 = r8 << 3
            int r14 = r14 + r13
            r15 = r13
            r12 = r3[r14]
            r14 = r5[r14]
            int r12 = r1.a(r12)
            if (r12 < 0) goto L_0x0065
            float[] r13 = r1.f1808c
            r12 = r13[r12]
            int r12 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r12 != 0) goto L_0x0065
            r12 = 8
            goto L_0x0067
        L_0x0065:
            return r4
        L_0x0066:
            r15 = r13
        L_0x0067:
            long r9 = r9 >> r12
            int r13 = r15 + 1
            goto L_0x0041
        L_0x006b:
            if (r11 != r12) goto L_0x0072
        L_0x006d:
            if (r8 == r7) goto L_0x0072
            int r8 = r8 + 1
            goto L_0x0027
        L_0x0072:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.LongFloatMap.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        long[] jArr = this.f1807b;
        float[] fArr = this.f1808c;
        long[] jArr2 = this.f1806a;
        int length = jArr2.length - 2;
        int i2 = 0;
        if (length >= 0) {
            int i3 = 0;
            int i4 = 0;
            while (true) {
                long j2 = jArr2[i3];
                if ((((~j2) << 7) & j2 & -9187201950435737472L) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i6 = 0; i6 < i5; i6++) {
                        if ((255 & j2) < 128) {
                            int i7 = (i3 << 3) + i6;
                            long j3 = jArr[i7];
                            i4 += Float.hashCode(fArr[i7]) ^ Long.hashCode(j3);
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
        int i2;
        int i3;
        if (d()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder();
        sb.append('{');
        long[] jArr = this.f1807b;
        float[] fArr = this.f1808c;
        long[] jArr2 = this.f1806a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i4 = 0;
            int i5 = 0;
            while (true) {
                long j2 = jArr2[i4];
                if ((((~j2) << 7) & j2 & -9187201950435737472L) != -9187201950435737472L) {
                    int i6 = 8 - ((~(i4 - length)) >>> 31);
                    int i7 = 0;
                    while (i7 < i6) {
                        if ((255 & j2) < 128) {
                            int i8 = (i4 << 3) + i7;
                            i3 = i4;
                            long j3 = jArr[i8];
                            float f2 = fArr[i8];
                            sb.append(j3);
                            sb.append("=");
                            sb.append(f2);
                            i5++;
                            if (i5 < this.f1810e) {
                                sb.append(',');
                                sb.append(' ');
                            }
                        } else {
                            i3 = i4;
                        }
                        j2 >>= 8;
                        i7++;
                        i4 = i3;
                    }
                    int i9 = i4;
                    if (i6 != 8) {
                        break;
                    }
                    i2 = i9;
                } else {
                    i2 = i4;
                }
                if (i2 == length) {
                    break;
                }
                i4 = i2 + 1;
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        Intrinsics.h(sb2, "toString(...)");
        return sb2;
    }

    public LongFloatMap() {
        this.f1806a = ScatterMapKt.f1964a;
        this.f1807b = LongSetKt.a();
        this.f1808c = FloatSetKt.a();
    }
}
