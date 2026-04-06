package org.bson.types;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public final class Decimal128 extends Number implements Comparable<Decimal128> {

    /* renamed from: B  reason: collision with root package name */
    public static final BigInteger f44037B = new BigInteger("10");
    public static final BigInteger C = new BigInteger("1");
    public static final BigInteger D = new BigInteger("0");
    public static final Set E = new HashSet(Collections.singletonList("nan"));
    public static final Set F = new HashSet(Collections.singletonList("-nan"));
    public static final Set G = new HashSet(Arrays.asList(new String[]{"inf", "+inf", "infinity", "+infinity"}));
    public static final Set H = new HashSet(Arrays.asList(new String[]{"-inf", "-infinity"}));
    public static final Decimal128 I = fromIEEE754BIDEncoding(8646911284551352320L, 0);
    public static final Decimal128 J = fromIEEE754BIDEncoding(-576460752303423488L, 0);
    public static final Decimal128 K = fromIEEE754BIDEncoding(-288230376151711744L, 0);
    public static final Decimal128 L = fromIEEE754BIDEncoding(8935141660703064064L, 0);
    public static final Decimal128 M = fromIEEE754BIDEncoding(3476778912330022912L, 0);
    public static final Decimal128 N = fromIEEE754BIDEncoding(-5746593124524752896L, 0);

    /* renamed from: A  reason: collision with root package name */
    public final long f44038A;

    /* renamed from: z  reason: collision with root package name */
    public final long f44039z;

    public Decimal128(long j2) {
        this(new BigDecimal(j2, MathContext.DECIMAL128));
    }

    public static Decimal128 fromIEEE754BIDEncoding(long j2, long j3) {
        return new Decimal128(j2, j3);
    }

    public static Decimal128 z(String str) {
        String lowerCase = str.toLowerCase();
        if (E.contains(lowerCase)) {
            return L;
        }
        if (F.contains(lowerCase)) {
            return K;
        }
        if (G.contains(lowerCase)) {
            return I;
        }
        if (H.contains(lowerCase)) {
            return J;
        }
        BigDecimal bigDecimal = new BigDecimal(str);
        boolean z2 = false;
        if (str.charAt(0) == '-') {
            z2 = true;
        }
        return new Decimal128(bigDecimal, z2);
    }

    public final String A() {
        StringBuilder sb = new StringBuilder();
        BigDecimal f2 = f();
        String bigInteger = f2.unscaledValue().abs().toString();
        if (x()) {
            sb.append('-');
        }
        int i2 = -f2.scale();
        int length = (bigInteger.length() - 1) + i2;
        if (i2 > 0 || length < -6) {
            sb.append(bigInteger.charAt(0));
            if (bigInteger.length() > 1) {
                sb.append('.');
                sb.append(bigInteger, 1, bigInteger.length());
            }
            sb.append('E');
            if (length > 0) {
                sb.append('+');
            }
            sb.append(length);
        } else if (i2 == 0) {
            sb.append(bigInteger);
        } else {
            int length2 = (-i2) - bigInteger.length();
            if (length2 >= 0) {
                sb.append('0');
                sb.append('.');
                for (int i3 = 0; i3 < length2; i3++) {
                    sb.append('0');
                }
                sb.append(bigInteger, 0, bigInteger.length());
            } else {
                int i4 = -length2;
                sb.append(bigInteger, 0, i4);
                sb.append('.');
                sb.append(bigInteger, i4, i4 - i2);
            }
        }
        return sb.toString();
    }

    public final boolean B() {
        return (this.f44039z & 6917529027641081856L) == 6917529027641081856L;
    }

    public BigDecimal d() {
        if (t()) {
            throw new ArithmeticException("NaN can not be converted to a BigDecimal");
        } else if (!r()) {
            BigDecimal f2 = f();
            if (!x() || f2.signum() != 0) {
                return f2;
            }
            throw new ArithmeticException("Negative zero can not be converted to a BigDecimal");
        } else {
            throw new ArithmeticException("Infinity can not be converted to a BigDecimal");
        }
    }

    public double doubleValue() {
        if (t()) {
            return Double.NaN;
        }
        if (r()) {
            return x() ? Double.NEGATIVE_INFINITY : Double.POSITIVE_INFINITY;
        }
        BigDecimal f2 = f();
        if (p(f2)) {
            return -0.0d;
        }
        return f2.doubleValue();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Decimal128.class != obj.getClass()) {
            return false;
        }
        Decimal128 decimal128 = (Decimal128) obj;
        return this.f44039z == decimal128.f44039z && this.f44038A == decimal128.f44038A;
    }

    public final BigDecimal f() {
        int i2 = -m();
        if (B()) {
            return BigDecimal.valueOf(0, i2);
        }
        return new BigDecimal(new BigInteger(x() ? -1 : 1, l()), i2);
    }

    public float floatValue() {
        return (float) doubleValue();
    }

    public final BigDecimal h(BigDecimal bigDecimal) {
        BigDecimal bigDecimal2;
        if ((-bigDecimal.scale()) > 6111) {
            int i2 = (-bigDecimal.scale()) - 6111;
            if (bigDecimal.unscaledValue().equals(D)) {
                return new BigDecimal(bigDecimal.unscaledValue(), -6111);
            }
            if (bigDecimal.precision() + i2 <= 34) {
                bigDecimal2 = new BigDecimal(bigDecimal.unscaledValue().multiply(f44037B.pow(i2)), bigDecimal.scale() + i2);
            } else {
                throw new NumberFormatException("Exponent is out of range for Decimal128 encoding of " + bigDecimal);
            }
        } else if ((-bigDecimal.scale()) < -6176) {
            int scale = bigDecimal.scale() - 6176;
            bigDecimal2 = new BigDecimal(bigDecimal.unscaledValue().divide(k(bigDecimal, scale) == 0 ? C : f44037B.pow(scale)), bigDecimal.scale() - scale);
        } else {
            BigDecimal round = bigDecimal.round(MathContext.DECIMAL128);
            int precision = bigDecimal.precision() - round.precision();
            if (precision <= 0) {
                return round;
            }
            k(bigDecimal, precision);
            return round;
        }
        return bigDecimal2;
    }

    public int hashCode() {
        long j2 = this.f44038A;
        long j3 = this.f44039z;
        return (((int) (j2 ^ (j2 >>> 32))) * 31) + ((int) ((j3 >>> 32) ^ j3));
    }

    public int intValue() {
        return (int) doubleValue();
    }

    /* renamed from: j */
    public int compareTo(Decimal128 decimal128) {
        if (t()) {
            return decimal128.t() ^ true ? 1 : 0;
        }
        if (!r()) {
            BigDecimal f2 = f();
            BigDecimal f3 = decimal128.f();
            if (y(f2) && decimal128.y(f3)) {
                if (p(f2)) {
                    return decimal128.p(f3) ? 0 : -1;
                }
                if (decimal128.p(f3)) {
                    return 1;
                }
            }
            if (decimal128.t()) {
                return -1;
            }
            return decimal128.r() ? decimal128.x() ? 1 : -1 : f2.compareTo(f3);
        } else if (x()) {
            return (!decimal128.r() || !decimal128.x()) ? -1 : 0;
        } else {
            if (decimal128.t()) {
                return -1;
            }
            return (!decimal128.r() || decimal128.x()) ? 1 : 0;
        }
    }

    public final int k(BigDecimal bigDecimal, int i2) {
        String bigInteger = bigDecimal.unscaledValue().abs().toString();
        int max = Math.max(0, bigInteger.length() - i2);
        int i3 = max;
        while (i3 < bigInteger.length()) {
            if (bigInteger.charAt(i3) == '0') {
                i3++;
            } else {
                throw new NumberFormatException("Conversion to Decimal128 would require inexact rounding of " + bigDecimal);
            }
        }
        return max;
    }

    public final byte[] l() {
        byte[] bArr = new byte[15];
        long j2 = 255;
        long j3 = 255;
        for (int i2 = 14; i2 >= 7; i2--) {
            bArr[i2] = (byte) ((int) ((this.f44038A & j3) >>> ((14 - i2) << 3)));
            j3 <<= 8;
        }
        for (int i3 = 6; i3 >= 1; i3--) {
            bArr[i3] = (byte) ((int) ((this.f44039z & j2) >>> ((6 - i3) << 3)));
            j2 <<= 8;
        }
        bArr[0] = (byte) ((int) ((this.f44039z & 281474976710656L) >>> 48));
        return bArr;
    }

    public long longValue() {
        return (long) doubleValue();
    }

    public final int m() {
        long j2;
        char c2;
        if (B()) {
            j2 = this.f44039z & 2305807824841605120L;
            c2 = '/';
        } else {
            j2 = this.f44039z & 9223231299366420480L;
            c2 = '1';
        }
        return ((int) (j2 >>> c2)) - 6176;
    }

    public long n() {
        return this.f44039z;
    }

    public long o() {
        return this.f44038A;
    }

    public final boolean p(BigDecimal bigDecimal) {
        return x() && bigDecimal.signum() == 0;
    }

    public boolean r() {
        return (this.f44039z & 8646911284551352320L) == 8646911284551352320L;
    }

    public boolean t() {
        return (this.f44039z & 8935141660703064064L) == 8935141660703064064L;
    }

    public String toString() {
        return t() ? "NaN" : r() ? x() ? "-Infinity" : "Infinity" : A();
    }

    public boolean x() {
        return (this.f44039z & Long.MIN_VALUE) == Long.MIN_VALUE;
    }

    public final boolean y(BigDecimal bigDecimal) {
        return !t() && !r() && bigDecimal.compareTo(BigDecimal.ZERO) == 0;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public Decimal128(BigDecimal bigDecimal) {
        this(bigDecimal, bigDecimal.signum() == -1);
    }

    public Decimal128(long j2, long j3) {
        this.f44039z = j2;
        this.f44038A = j3;
    }

    public Decimal128(BigDecimal bigDecimal, boolean z2) {
        int i2;
        long j2;
        BigDecimal h2 = h(bigDecimal);
        long j3 = (long) (-h2.scale());
        if (j3 < -6176 || j3 > 6111) {
            throw new AssertionError("Exponent is out of range for Decimal128 encoding: " + j3);
        } else if (h2.unscaledValue().bitLength() <= 113) {
            BigInteger abs = h2.unscaledValue().abs();
            int bitLength = abs.bitLength();
            long j4 = 0;
            int i3 = 0;
            long j5 = 0;
            while (true) {
                if (i3 >= Math.min(64, bitLength)) {
                    break;
                }
                if (abs.testBit(i3)) {
                    j5 |= 1 << i3;
                }
                i3++;
            }
            for (i2 = 64; i2 < bitLength; i2++) {
                if (abs.testBit(i2)) {
                    j4 |= 1 << (i2 - 64);
                }
            }
            this.f44039z = (h2.signum() == -1 || z2) ? ((j3 + 6176) << 49) | j4 | Long.MIN_VALUE : j2;
            this.f44038A = j5;
        } else {
            throw new AssertionError("Unscaled roundedValue is out of range for Decimal128 encoding:" + h2.unscaledValue());
        }
    }
}
