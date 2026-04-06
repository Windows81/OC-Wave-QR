package androidx.compose.animation.core;

import kotlin.Metadata;

@Metadata
public final class SpringEstimationKt {
    public static final long a(double d2, double d3, double d4, double d5, double d6) {
        double sqrt = 2.0d * d3 * Math.sqrt(d2);
        double d7 = (sqrt * sqrt) - (4.0d * d2);
        double d8 = 0.0d;
        int i2 = (d7 > 0.0d ? 1 : (d7 == 0.0d ? 0 : -1));
        double sqrt2 = i2 < 0 ? 0.0d : Math.sqrt(d7);
        if (i2 < 0) {
            d8 = Math.sqrt(Math.abs(d7));
        }
        double d9 = -sqrt;
        return d((d9 + sqrt2) * 0.5d, d8 * 0.5d, (d9 - sqrt2) * 0.5d, d3, d4, d5, d6);
    }

    public static final long b(float f2, float f3, float f4, float f5, float f6) {
        if (f3 == 0.0f) {
            return 9223372036854L;
        }
        return a((double) f2, (double) f3, (double) f4, (double) f5, (double) f6);
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x00b2 A[LOOP:1: B:32:0x00a5->B:36:0x00b2, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final double c(double r20, double r22, double r24, double r26) {
        /*
            r0 = r26
            double r2 = r20 * r22
            double r4 = r24 - r2
            double r6 = r0 / r22
            double r6 = java.lang.Math.abs(r6)
            double r6 = java.lang.Math.log(r6)
            double r6 = r6 / r20
            double r8 = r0 / r4
            double r8 = java.lang.Math.abs(r8)
            double r8 = java.lang.Math.log(r8)
            r10 = 0
            r12 = r8
            r11 = r10
        L_0x001f:
            r14 = 6
            if (r11 >= r14) goto L_0x0031
            double r12 = r12 / r20
            double r12 = java.lang.Math.abs(r12)
            double r12 = java.lang.Math.log(r12)
            double r12 = r8 - r12
            int r11 = r11 + 1
            goto L_0x001f
        L_0x0031:
            double r12 = r12 / r20
            long r8 = java.lang.Double.doubleToRawLongBits(r6)
            r14 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            long r8 = r8 & r14
            r16 = 9218868437227405312(0x7ff0000000000000, double:Infinity)
            int r8 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1))
            r9 = 1
            if (r8 >= 0) goto L_0x0046
            r8 = r9
            goto L_0x0047
        L_0x0046:
            r8 = r10
        L_0x0047:
            if (r8 != 0) goto L_0x004b
            r6 = r12
            goto L_0x005f
        L_0x004b:
            long r18 = java.lang.Double.doubleToRawLongBits(r12)
            long r14 = r18 & r14
            int r8 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r8 >= 0) goto L_0x0057
            r8 = r9
            goto L_0x0058
        L_0x0057:
            r8 = r10
        L_0x0058:
            if (r8 != 0) goto L_0x005b
            goto L_0x005f
        L_0x005b:
            double r6 = java.lang.Math.max(r6, r12)
        L_0x005f:
            double r11 = r2 + r4
            double r11 = -r11
            double r13 = r20 * r4
            double r11 = r11 / r13
            double r13 = r20 * r11
            double r15 = java.lang.Math.exp(r13)
            double r15 = r15 * r22
            double r17 = r4 * r11
            double r13 = java.lang.Math.exp(r13)
            double r17 = r17 * r13
            double r13 = r15 + r17
            boolean r8 = java.lang.Double.isNaN(r11)
            if (r8 != 0) goto L_0x0096
            r15 = 0
            int r8 = (r11 > r15 ? 1 : (r11 == r15 ? 0 : -1))
            if (r8 > 0) goto L_0x0084
            goto L_0x0096
        L_0x0084:
            int r8 = (r11 > r15 ? 1 : (r11 == r15 ? 0 : -1))
            if (r8 <= 0) goto L_0x0098
            double r11 = -r13
            int r8 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r8 >= 0) goto L_0x0098
            int r8 = (r4 > r15 ? 1 : (r4 == r15 ? 0 : -1))
            if (r8 >= 0) goto L_0x0096
            int r8 = (r22 > r15 ? 1 : (r22 == r15 ? 0 : -1))
            if (r8 <= 0) goto L_0x0096
            r6 = r15
        L_0x0096:
            double r0 = -r0
            goto L_0x00a0
        L_0x0098:
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r6 = r6 / r20
            double r6 = -r6
            double r11 = r22 / r4
            double r6 = r6 - r11
        L_0x00a0:
            r11 = 9218868437227405311(0x7fefffffffffffff, double:1.7976931348623157E308)
        L_0x00a5:
            r13 = 4562254508917369340(0x3f50624dd2f1a9fc, double:0.001)
            int r8 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r8 <= 0) goto L_0x00d7
            r8 = 100
            if (r10 >= r8) goto L_0x00d7
            int r10 = r10 + 1
            double r11 = r4 * r6
            double r11 = r22 + r11
            double r13 = r20 * r6
            double r15 = java.lang.Math.exp(r13)
            double r11 = r11 * r15
            double r11 = r11 + r0
            r24 = r0
            double r0 = (double) r9
            double r0 = r0 + r13
            double r0 = r0 * r4
            double r0 = r0 + r2
            double r13 = java.lang.Math.exp(r13)
            double r0 = r0 * r13
            double r11 = r11 / r0
            double r0 = r6 - r11
            double r6 = r6 - r0
            double r11 = java.lang.Math.abs(r6)
            r6 = r0
            r0 = r24
            goto L_0x00a5
        L_0x00d7:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.SpringEstimationKt.c(double, double, double, double):double");
    }

    public static final long d(double d2, double d3, double d4, double d5, double d6, double d7, double d8) {
        double d9 = d6;
        int i2 = (d7 > 0.0d ? 1 : (d7 == 0.0d ? 0 : -1));
        if (i2 == 0 && d9 == 0.0d) {
            return 0;
        }
        if (i2 < 0) {
            d9 = -d9;
        }
        double abs = Math.abs(d7);
        return (long) ((d5 > 1.0d ? e(d2, d4, abs, d9, d8) : d5 < 1.0d ? g(d2, d3, abs, d9, d8) : c(d2, abs, d9, d8)) * 1000.0d);
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x00bf A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00c0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final double e(double r25, double r27, double r29, double r31, double r33) {
        /*
            r0 = r33
            double r2 = r25 * r29
            double r2 = r2 - r31
            double r4 = r25 - r27
            double r2 = r2 / r4
            double r16 = r29 - r2
            double r6 = r0 / r16
            double r6 = java.lang.Math.abs(r6)
            double r6 = java.lang.Math.log(r6)
            double r6 = r6 / r25
            double r8 = r0 / r2
            double r8 = java.lang.Math.abs(r8)
            double r8 = java.lang.Math.log(r8)
            double r8 = r8 / r27
            long r10 = java.lang.Double.doubleToRawLongBits(r6)
            r12 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            long r10 = r10 & r12
            r14 = 9218868437227405312(0x7ff0000000000000, double:Infinity)
            int r10 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1))
            r18 = 0
            r11 = 1
            if (r10 >= 0) goto L_0x0038
            r10 = r11
            goto L_0x003a
        L_0x0038:
            r10 = r18
        L_0x003a:
            if (r10 != 0) goto L_0x003f
            r19 = r8
            goto L_0x0056
        L_0x003f:
            long r19 = java.lang.Double.doubleToRawLongBits(r8)
            long r12 = r19 & r12
            int r10 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r10 >= 0) goto L_0x004a
            goto L_0x004c
        L_0x004a:
            r11 = r18
        L_0x004c:
            if (r11 != 0) goto L_0x0051
        L_0x004e:
            r19 = r6
            goto L_0x0056
        L_0x0051:
            double r6 = java.lang.Math.max(r6, r8)
            goto L_0x004e
        L_0x0056:
            double r21 = r16 * r25
            double r6 = -r2
            double r6 = r6 * r27
            double r6 = r21 / r6
            double r6 = java.lang.Math.log(r6)
            double r8 = r27 - r25
            double r10 = r6 / r8
            boolean r6 = java.lang.Double.isNaN(r10)
            if (r6 != 0) goto L_0x0090
            r23 = 0
            int r6 = (r10 > r23 ? 1 : (r10 == r23 ? 0 : -1))
            if (r6 > 0) goto L_0x0072
            goto L_0x0090
        L_0x0072:
            int r6 = (r10 > r23 ? 1 : (r10 == r23 ? 0 : -1))
            if (r6 <= 0) goto L_0x0092
            r6 = r16
            r8 = r25
            r12 = r2
            r14 = r27
            double r6 = f(r6, r8, r10, r12, r14)
            double r6 = -r6
            int r6 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r6 >= 0) goto L_0x0092
            int r4 = (r2 > r23 ? 1 : (r2 == r23 ? 0 : -1))
            if (r4 <= 0) goto L_0x0090
            int r4 = (r16 > r23 ? 1 : (r16 == r23 ? 0 : -1))
            if (r4 >= 0) goto L_0x0090
            r19 = r23
        L_0x0090:
            double r0 = -r0
            goto L_0x00a0
        L_0x0092:
            double r6 = r2 * r27
            double r6 = r6 * r27
            double r6 = -r6
            double r8 = r21 * r25
            double r6 = r6 / r8
            double r6 = java.lang.Math.log(r6)
            double r19 = r6 / r4
        L_0x00a0:
            double r4 = r25 * r19
            double r4 = java.lang.Math.exp(r4)
            double r4 = r4 * r21
            double r6 = r2 * r27
            double r8 = r27 * r19
            double r8 = java.lang.Math.exp(r8)
            double r8 = r8 * r6
            double r4 = r4 + r8
            double r4 = java.lang.Math.abs(r4)
            r8 = 4547007122018943789(0x3f1a36e2eb1c432d, double:1.0E-4)
            int r4 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r4 >= 0) goto L_0x00c0
            return r19
        L_0x00c0:
            r4 = 9218868437227405311(0x7fefffffffffffff, double:1.7976931348623157E308)
            r8 = r18
        L_0x00c7:
            r9 = 4562254508917369340(0x3f50624dd2f1a9fc, double:0.001)
            int r4 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r4 <= 0) goto L_0x0100
            r4 = 100
            if (r8 >= r4) goto L_0x0100
            int r8 = r8 + 1
            double r4 = r25 * r19
            double r9 = java.lang.Math.exp(r4)
            double r9 = r9 * r16
            double r11 = r27 * r19
            double r13 = java.lang.Math.exp(r11)
            double r13 = r13 * r2
            double r9 = r9 + r13
            double r9 = r9 + r0
            double r4 = java.lang.Math.exp(r4)
            double r4 = r4 * r21
            double r11 = java.lang.Math.exp(r11)
            double r11 = r11 * r6
            double r4 = r4 + r11
            double r9 = r9 / r4
            double r4 = r19 - r9
            double r19 = r19 - r4
            double r9 = java.lang.Math.abs(r19)
            r19 = r4
            r4 = r9
            goto L_0x00c7
        L_0x0100:
            return r19
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.SpringEstimationKt.e(double, double, double, double, double):double");
    }

    public static final double f(double d2, double d3, double d4, double d5, double d6) {
        return (d2 * Math.exp(d3 * d4)) + (d5 * Math.exp(d6 * d4));
    }

    public static final double g(double d2, double d3, double d4, double d5, double d6) {
        double d7 = (d5 - (d2 * d4)) / d3;
        return Math.log(d6 / Math.sqrt((d4 * d4) + (d7 * d7))) / d2;
    }
}
