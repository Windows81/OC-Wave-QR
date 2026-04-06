package com.google.gson.stream;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;

public class JsonWriter implements Closeable, Flushable {
    public static final Pattern I = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");
    public static final String[] J = new String[128];
    public static final String[] K;

    /* renamed from: A  reason: collision with root package name */
    public int[] f31897A = new int[32];

    /* renamed from: B  reason: collision with root package name */
    public int f31898B = 0;
    public String C;
    public String D;
    public boolean E;
    public boolean F;
    public String G;
    public boolean H;

    /* renamed from: z  reason: collision with root package name */
    public final Writer f31899z;

    static {
        for (int i2 = 0; i2 <= 31; i2++) {
            J[i2] = String.format("\\u%04x", new Object[]{Integer.valueOf(i2)});
        }
        String[] strArr = J;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        K = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public JsonWriter(Writer writer) {
        D(6);
        this.D = ":";
        this.H = true;
        Objects.requireNonNull(writer, "out == null");
        this.f31899z = writer;
    }

    public static boolean r(Class cls) {
        return cls == Integer.class || cls == Long.class || cls == Double.class || cls == Float.class || cls == Byte.class || cls == Short.class || cls == BigDecimal.class || cls == BigInteger.class || cls == AtomicInteger.class || cls == AtomicLong.class;
    }

    public final JsonWriter A(int i2, char c2) {
        b();
        D(i2);
        this.f31899z.write(c2);
        return this;
    }

    public final int C() {
        int i2 = this.f31898B;
        if (i2 != 0) {
            return this.f31897A[i2 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public final void D(int i2) {
        int i3 = this.f31898B;
        int[] iArr = this.f31897A;
        if (i3 == iArr.length) {
            this.f31897A = Arrays.copyOf(iArr, i3 * 2);
        }
        int[] iArr2 = this.f31897A;
        int i4 = this.f31898B;
        this.f31898B = i4 + 1;
        iArr2[i4] = i2;
    }

    public final void E(int i2) {
        this.f31897A[this.f31898B - 1] = i2;
    }

    public final void F(boolean z2) {
        this.F = z2;
    }

    public final void G(String str) {
        if (str.length() == 0) {
            this.C = null;
            this.D = ":";
            return;
        }
        this.C = str;
        this.D = ": ";
    }

    public final void H(boolean z2) {
        this.E = z2;
    }

    public final void I(boolean z2) {
        this.H = z2;
    }

    public final void N(String str) {
        String str2;
        String[] strArr = this.F ? K : J;
        this.f31899z.write(34);
        int length = str.length();
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            char charAt = str.charAt(i3);
            if (charAt < 128) {
                str2 = strArr[charAt];
                if (str2 == null) {
                }
            } else if (charAt == 8232) {
                str2 = "\\u2028";
            } else if (charAt == 8233) {
                str2 = "\\u2029";
            }
            if (i2 < i3) {
                this.f31899z.write(str, i2, i3 - i2);
            }
            this.f31899z.write(str2);
            i2 = i3 + 1;
        }
        if (i2 < length) {
            this.f31899z.write(str, i2, length - i2);
        }
        this.f31899z.write(34);
    }

    public JsonWriter O(double d2) {
        e0();
        if (this.E || (!Double.isNaN(d2) && !Double.isInfinite(d2))) {
            b();
            this.f31899z.append(Double.toString(d2));
            return this;
        }
        throw new IllegalArgumentException("Numeric values must be finite, but was " + d2);
    }

    public JsonWriter Q(long j2) {
        e0();
        b();
        this.f31899z.write(Long.toString(j2));
        return this;
    }

    public JsonWriter S(Boolean bool) {
        if (bool == null) {
            return y();
        }
        e0();
        b();
        this.f31899z.write(bool.booleanValue() ? "true" : "false");
        return this;
    }

    public JsonWriter T(Number number) {
        if (number == null) {
            return y();
        }
        e0();
        String obj = number.toString();
        if (!obj.equals("-Infinity") && !obj.equals("Infinity") && !obj.equals("NaN")) {
            Class<?> cls = number.getClass();
            if (!r(cls) && !I.matcher(obj).matches()) {
                throw new IllegalArgumentException("String created by " + cls + " is not a valid JSON number: " + obj);
            }
        } else if (!this.E) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + obj);
        }
        b();
        this.f31899z.append(obj);
        return this;
    }

    public JsonWriter X(String str) {
        if (str == null) {
            return y();
        }
        e0();
        b();
        N(str);
        return this;
    }

    public final void a() {
        int C2 = C();
        if (C2 == 5) {
            this.f31899z.write(44);
        } else if (C2 != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        x();
        E(4);
    }

    public final void b() {
        int C2 = C();
        if (C2 == 1) {
            E(2);
            x();
        } else if (C2 == 2) {
            this.f31899z.append(',');
            x();
        } else if (C2 != 4) {
            if (C2 != 6) {
                if (C2 != 7) {
                    throw new IllegalStateException("Nesting problem.");
                } else if (!this.E) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            E(7);
        } else {
            this.f31899z.append(this.D);
            E(5);
        }
    }

    public JsonWriter c() {
        e0();
        return A(1, '[');
    }

    public JsonWriter c0(boolean z2) {
        e0();
        b();
        this.f31899z.write(z2 ? "true" : "false");
        return this;
    }

    public void close() {
        this.f31899z.close();
        int i2 = this.f31898B;
        if (i2 > 1 || (i2 == 1 && this.f31897A[i2 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f31898B = 0;
    }

    public JsonWriter d() {
        e0();
        return A(3, '{');
    }

    public final void e0() {
        if (this.G != null) {
            a();
            N(this.G);
            this.G = null;
        }
    }

    public final JsonWriter f(int i2, int i3, char c2) {
        int C2 = C();
        if (C2 != i3 && C2 != i2) {
            throw new IllegalStateException("Nesting problem.");
        } else if (this.G == null) {
            this.f31898B--;
            if (C2 == i3) {
                x();
            }
            this.f31899z.write(c2);
            return this;
        } else {
            throw new IllegalStateException("Dangling name: " + this.G);
        }
    }

    public void flush() {
        if (this.f31898B != 0) {
            this.f31899z.flush();
            return;
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public JsonWriter g() {
        return f(1, 2, ']');
    }

    public JsonWriter j() {
        return f(3, 5, '}');
    }

    public final boolean k() {
        return this.H;
    }

    public final boolean l() {
        return this.F;
    }

    public boolean m() {
        return this.E;
    }

    public JsonWriter t(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.G != null) {
            throw new IllegalStateException();
        } else if (this.f31898B != 0) {
            this.G = str;
            return this;
        } else {
            throw new IllegalStateException("JsonWriter is closed.");
        }
    }

    public final void x() {
        if (this.C != null) {
            this.f31899z.write(10);
            int i2 = this.f31898B;
            for (int i3 = 1; i3 < i2; i3++) {
                this.f31899z.write(this.C);
            }
        }
    }

    public JsonWriter y() {
        if (this.G != null) {
            if (this.H) {
                e0();
            } else {
                this.G = null;
                return this;
            }
        }
        b();
        this.f31899z.write("null");
        return this;
    }
}
