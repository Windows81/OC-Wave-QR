package kotlin.random;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.internal.PlatformImplementationsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public abstract class Random {

    /* renamed from: A  reason: collision with root package name */
    public static final Random f40939A = PlatformImplementationsKt.f40751a.b();

    /* renamed from: z  reason: collision with root package name */
    public static final Default f40940z = new Default((DefaultConstructorMarker) null);

    @Metadata
    public static final class Default extends Random implements Serializable {

        @Metadata
        public static final class Serialized implements Serializable {

            /* renamed from: z  reason: collision with root package name */
            public static final Serialized f40941z = new Serialized();
        }

        public /* synthetic */ Default(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public int b(int i2) {
            return Random.f40939A.b(i2);
        }

        public boolean c() {
            return Random.f40939A.c();
        }

        public byte[] d(byte[] bArr) {
            Intrinsics.i(bArr, "array");
            return Random.f40939A.d(bArr);
        }

        public byte[] e(byte[] bArr, int i2, int i3) {
            Intrinsics.i(bArr, "array");
            return Random.f40939A.e(bArr, i2, i3);
        }

        public double f() {
            return Random.f40939A.f();
        }

        public float g() {
            return Random.f40939A.g();
        }

        public int h() {
            return Random.f40939A.h();
        }

        public int i(int i2) {
            return Random.f40939A.i(i2);
        }

        public int j(int i2, int i3) {
            return Random.f40939A.j(i2, i3);
        }

        public long k() {
            return Random.f40939A.k();
        }

        public Default() {
        }
    }

    public abstract int b(int i2);

    public boolean c() {
        return b(1) != 0;
    }

    public byte[] d(byte[] bArr) {
        Intrinsics.i(bArr, "array");
        return e(bArr, 0, bArr.length);
    }

    public byte[] e(byte[] bArr, int i2, int i3) {
        Intrinsics.i(bArr, "array");
        if (i2 < 0 || i2 > bArr.length || i3 < 0 || i3 > bArr.length) {
            throw new IllegalArgumentException(("fromIndex (" + i2 + ") or toIndex (" + i3 + ") are out of range: 0.." + bArr.length + '.').toString());
        } else if (i2 <= i3) {
            int i4 = (i3 - i2) / 4;
            for (int i5 = 0; i5 < i4; i5++) {
                int h2 = h();
                bArr[i2] = (byte) h2;
                bArr[i2 + 1] = (byte) (h2 >>> 8);
                bArr[i2 + 2] = (byte) (h2 >>> 16);
                bArr[i2 + 3] = (byte) (h2 >>> 24);
                i2 += 4;
            }
            int i6 = i3 - i2;
            int b2 = b(i6 * 8);
            for (int i7 = 0; i7 < i6; i7++) {
                bArr[i2 + i7] = (byte) (b2 >>> (i7 * 8));
            }
            return bArr;
        } else {
            throw new IllegalArgumentException(("fromIndex (" + i2 + ") must be not greater than toIndex (" + i3 + ").").toString());
        }
    }

    public double f() {
        return PlatformRandomKt.a(b(26), b(27));
    }

    public float g() {
        return ((float) b(24)) / 1.6777216E7f;
    }

    public int h() {
        return b(32);
    }

    public int i(int i2) {
        return j(0, i2);
    }

    public int j(int i2, int i3) {
        int i4;
        int h2;
        int i5;
        RandomKt.b(i2, i3);
        int i6 = i3 - i2;
        if (i6 > 0 || i6 == Integer.MIN_VALUE) {
            if (((-i6) & i6) == i6) {
                i4 = b(RandomKt.c(i6));
            } else {
                do {
                    h2 = h() >>> 1;
                    i5 = h2 % i6;
                } while ((h2 - i5) + (i6 - 1) < 0);
                i4 = i5;
            }
            return i2 + i4;
        }
        while (true) {
            int h3 = h();
            if (i2 <= h3 && h3 < i3) {
                return h3;
            }
        }
    }

    public long k() {
        return (((long) h()) << 32) + ((long) h());
    }
}
