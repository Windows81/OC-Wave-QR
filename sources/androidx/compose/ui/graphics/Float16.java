package androidx.compose.ui.graphics;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@JvmInline
@Metadata
public final class Float16 implements Comparable<Float16> {

    /* renamed from: A  reason: collision with root package name */
    public static final Companion f16009A = new Companion((DefaultConstructorMarker) null);

    /* renamed from: B  reason: collision with root package name */
    public static final short f16010B = h(5120);
    public static final short C = h(-1025);
    public static final short D = h(31743);
    public static final short E = h(1024);
    public static final short F = h(1);
    public static final short G = h(32256);
    public static final short H = h(-1024);
    public static final short I = h(Short.MIN_VALUE);
    public static final short J = h(31744);
    public static final short K = h(0);

    /* renamed from: z  reason: collision with root package name */
    public final short f16011z;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public static int f(short s2, short s3) {
        if (l(s2)) {
            return l(s3) ^ true ? 1 : 0;
        }
        if (l(s3)) {
            return -1;
        }
        return Intrinsics.k((s2 & 32768) != 0 ? 32768 - (s2 & 65535) : s2 & 65535, (s3 & 32768) != 0 ? 32768 - (s3 & 65535) : s3 & 65535);
    }

    public static short h(short s2) {
        return s2;
    }

    public static boolean j(short s2, Object obj) {
        return (obj instanceof Float16) && s2 == ((Float16) obj).o();
    }

    public static int k(short s2) {
        return Short.hashCode(s2);
    }

    public static final boolean l(short s2) {
        return (s2 & Short.MAX_VALUE) > 31744;
    }

    public static final float m(short s2) {
        int i2;
        int i3;
        int i4;
        short s3 = 32768 & s2;
        int i5 = ((65535 & s2) >>> 10) & 31;
        short s4 = s2 & 1023;
        if (i5 != 0) {
            int i6 = s4 << 13;
            if (i5 == 31) {
                i4 = 255;
                if (i6 != 0) {
                    i6 |= 4194304;
                }
            } else {
                i4 = i5 + 112;
            }
            int i7 = i4;
            i3 = i6;
            i2 = i7;
        } else if (s4 != 0) {
            float intBitsToFloat = Float.intBitsToFloat(s4 + 1056964608) - Float16Kt.f16012a;
            return s3 == 0 ? intBitsToFloat : -intBitsToFloat;
        } else {
            i2 = 0;
            i3 = 0;
        }
        return Float.intBitsToFloat((i2 << 23) | (s3 << 16) | i3);
    }

    public static String n(short s2) {
        return String.valueOf(m(s2));
    }

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return d(((Float16) obj).o());
    }

    public int d(short s2) {
        return f(this.f16011z, s2);
    }

    public boolean equals(Object obj) {
        return j(this.f16011z, obj);
    }

    public int hashCode() {
        return k(this.f16011z);
    }

    public final /* synthetic */ short o() {
        return this.f16011z;
    }

    public String toString() {
        return n(this.f16011z);
    }
}
