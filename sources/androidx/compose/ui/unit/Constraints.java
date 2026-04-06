package androidx.compose.ui.unit;

import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
@JvmInline
public final class Constraints {

    /* renamed from: b  reason: collision with root package name */
    public static final Companion f19137b = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final long f19138a;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a(int i2, int i3, int i4, int i5) {
            int i6 = 262142;
            int min = Math.min(i4, 262142);
            int i7 = Integer.MAX_VALUE;
            int min2 = i5 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i5, 262142);
            int i8 = min2 == Integer.MAX_VALUE ? min : min2;
            if (i8 >= 8191) {
                if (i8 < 32767) {
                    i6 = 65534;
                } else if (i8 < 65535) {
                    i6 = 32766;
                } else if (i8 < 262143) {
                    i6 = 8190;
                } else {
                    ConstraintsKt.l(i8);
                    throw new KotlinNothingValueException();
                }
            }
            if (i3 != Integer.MAX_VALUE) {
                i7 = Math.min(i6, i3);
            }
            return ConstraintsKt.a(Math.min(i6, i2), i7, min, min2);
        }

        public final long b(int i2, int i3, int i4, int i5) {
            int i6 = 262142;
            int min = Math.min(i2, 262142);
            int i7 = Integer.MAX_VALUE;
            int min2 = i3 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i3, 262142);
            int i8 = min2 == Integer.MAX_VALUE ? min : min2;
            if (i8 >= 8191) {
                if (i8 < 32767) {
                    i6 = 65534;
                } else if (i8 < 65535) {
                    i6 = 32766;
                } else if (i8 < 262143) {
                    i6 = 8190;
                } else {
                    ConstraintsKt.l(i8);
                    throw new KotlinNothingValueException();
                }
            }
            if (i5 != Integer.MAX_VALUE) {
                i7 = Math.min(i6, i5);
            }
            return ConstraintsKt.a(min, min2, Math.min(i6, i4), i7);
        }

        public final long c(int i2, int i3) {
            boolean z2 = false;
            boolean z3 = i2 >= 0;
            if (i3 >= 0) {
                z2 = true;
            }
            if (!z2 || !z3) {
                InlineClassHelperKt.a("width and height must be >= 0");
            }
            return ConstraintsKt.h(i2, i2, i3, i3);
        }

        public final long d(int i2) {
            if (!(i2 >= 0)) {
                InlineClassHelperKt.a("height must be >= 0");
            }
            return ConstraintsKt.h(0, Integer.MAX_VALUE, i2, i2);
        }

        public final long e(int i2) {
            if (!(i2 >= 0)) {
                InlineClassHelperKt.a("width must be >= 0");
            }
            return ConstraintsKt.h(i2, i2, 0, Integer.MAX_VALUE);
        }

        public Companion() {
        }
    }

    public /* synthetic */ Constraints(long j2) {
        this.f19138a = j2;
    }

    public static final /* synthetic */ Constraints a(long j2) {
        return new Constraints(j2);
    }

    public static long b(long j2) {
        return j2;
    }

    public static final long c(long j2, int i2, int i3, int i4, int i5) {
        if (!(i3 >= i2 && i5 >= i4 && i2 >= 0 && i4 >= 0)) {
            InlineClassHelperKt.a("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
        }
        return ConstraintsKt.h(i2, i3, i4, i5);
    }

    public static /* synthetic */ long d(long j2, int i2, int i3, int i4, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i2 = n(j2);
        }
        int i7 = i2;
        if ((i6 & 2) != 0) {
            i3 = l(j2);
        }
        int i8 = i3;
        if ((i6 & 4) != 0) {
            i4 = m(j2);
        }
        int i9 = i4;
        if ((i6 & 8) != 0) {
            i5 = k(j2);
        }
        return c(j2, i7, i8, i9, i5);
    }

    public static boolean e(long j2, Object obj) {
        return (obj instanceof Constraints) && j2 == ((Constraints) obj).r();
    }

    public static final boolean f(long j2, long j3) {
        return j2 == j3;
    }

    public static final boolean g(long j2) {
        int i2 = (int) (3 & j2);
        int i3 = ((i2 & 1) << 1) + (((i2 & 2) >> 1) * 3);
        return (((int) (j2 >> (i3 + 46))) & ((1 << (18 - i3)) - 1)) != 0;
    }

    public static final boolean h(long j2) {
        int i2 = (int) (3 & j2);
        return (((int) (j2 >> 33)) & ((1 << ((((i2 & 1) << 1) + (((i2 & 2) >> 1) * 3)) + 13)) - 1)) != 0;
    }

    public static final boolean i(long j2) {
        int i2 = (int) (3 & j2);
        int i3 = ((i2 & 1) << 1) + (((i2 & 2) >> 1) * 3);
        int i4 = (1 << (18 - i3)) - 1;
        int i5 = ((int) (j2 >> (i3 + 15))) & i4;
        int i6 = ((int) (j2 >> (i3 + 46))) & i4;
        return i5 == (i6 == 0 ? Integer.MAX_VALUE : i6 - 1);
    }

    public static final boolean j(long j2) {
        int i2 = (int) (3 & j2);
        int i3 = (1 << ((((i2 & 1) << 1) + (((i2 & 2) >> 1) * 3)) + 13)) - 1;
        int i4 = ((int) (j2 >> 2)) & i3;
        int i5 = ((int) (j2 >> 33)) & i3;
        return i4 == (i5 == 0 ? Integer.MAX_VALUE : i5 - 1);
    }

    public static final int k(long j2) {
        int i2 = (int) (3 & j2);
        int i3 = ((i2 & 1) << 1) + (((i2 & 2) >> 1) * 3);
        int i4 = ((int) (j2 >> (i3 + 46))) & ((1 << (18 - i3)) - 1);
        if (i4 == 0) {
            return Integer.MAX_VALUE;
        }
        return i4 - 1;
    }

    public static final int l(long j2) {
        int i2 = (int) (3 & j2);
        int i3 = ((int) (j2 >> 33)) & ((1 << ((((i2 & 1) << 1) + (((i2 & 2) >> 1) * 3)) + 13)) - 1);
        if (i3 == 0) {
            return Integer.MAX_VALUE;
        }
        return i3 - 1;
    }

    public static final int m(long j2) {
        int i2 = (int) (3 & j2);
        int i3 = ((i2 & 1) << 1) + (((i2 & 2) >> 1) * 3);
        return ((int) (j2 >> (i3 + 15))) & ((1 << (18 - i3)) - 1);
    }

    public static final int n(long j2) {
        int i2 = (int) (3 & j2);
        return ((int) (j2 >> 2)) & ((1 << ((((i2 & 1) << 1) + (((i2 & 2) >> 1) * 3)) + 13)) - 1);
    }

    public static int o(long j2) {
        return Long.hashCode(j2);
    }

    public static final boolean p(long j2) {
        int i2 = (int) (3 & j2);
        boolean z2 = true;
        int i3 = ((i2 & 1) << 1) + (((i2 & 2) >> 1) * 3);
        int i4 = (((int) (j2 >> 33)) & ((1 << (i3 + 13)) - 1)) - 1;
        int i5 = (((int) (j2 >> (i3 + 46))) & ((1 << (18 - i3)) - 1)) - 1;
        boolean z3 = i4 == 0;
        if (i5 != 0) {
            z2 = false;
        }
        return z3 | z2;
    }

    public static String q(long j2) {
        int l2 = l(j2);
        String str = "Infinity";
        String valueOf = l2 == Integer.MAX_VALUE ? str : String.valueOf(l2);
        int k2 = k(j2);
        if (k2 != Integer.MAX_VALUE) {
            str = String.valueOf(k2);
        }
        return "Constraints(minWidth = " + n(j2) + ", maxWidth = " + valueOf + ", minHeight = " + m(j2) + ", maxHeight = " + str + ')';
    }

    public boolean equals(Object obj) {
        return e(this.f19138a, obj);
    }

    public int hashCode() {
        return o(this.f19138a);
    }

    public final /* synthetic */ long r() {
        return this.f19138a;
    }

    public String toString() {
        return q(this.f19138a);
    }
}
