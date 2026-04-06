package com.google.protobuf;

import com.google.protobuf.Writer;
import java.util.Arrays;

public final class UnknownFieldSetLite {

    /* renamed from: f  reason: collision with root package name */
    public static final UnknownFieldSetLite f32324f = new UnknownFieldSetLite(0, new int[0], new Object[0], false);

    /* renamed from: a  reason: collision with root package name */
    public int f32325a;

    /* renamed from: b  reason: collision with root package name */
    public int[] f32326b;

    /* renamed from: c  reason: collision with root package name */
    public Object[] f32327c;

    /* renamed from: d  reason: collision with root package name */
    public int f32328d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f32329e;

    public UnknownFieldSetLite() {
        this(0, new int[8], new Object[8], true);
    }

    public static UnknownFieldSetLite c() {
        return f32324f;
    }

    public static int f(int[] iArr, int i2) {
        int i3 = 17;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 = (i3 * 31) + iArr[i4];
        }
        return i3;
    }

    public static int g(Object[] objArr, int i2) {
        int i3 = 17;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 = (i3 * 31) + objArr[i4].hashCode();
        }
        return i3;
    }

    public static UnknownFieldSetLite j(UnknownFieldSetLite unknownFieldSetLite, UnknownFieldSetLite unknownFieldSetLite2) {
        int i2 = unknownFieldSetLite.f32325a + unknownFieldSetLite2.f32325a;
        int[] copyOf = Arrays.copyOf(unknownFieldSetLite.f32326b, i2);
        System.arraycopy(unknownFieldSetLite2.f32326b, 0, copyOf, unknownFieldSetLite.f32325a, unknownFieldSetLite2.f32325a);
        Object[] copyOf2 = Arrays.copyOf(unknownFieldSetLite.f32327c, i2);
        System.arraycopy(unknownFieldSetLite2.f32327c, 0, copyOf2, unknownFieldSetLite.f32325a, unknownFieldSetLite2.f32325a);
        return new UnknownFieldSetLite(i2, copyOf, copyOf2, true);
    }

    public static UnknownFieldSetLite k() {
        return new UnknownFieldSetLite();
    }

    public static boolean l(Object[] objArr, Object[] objArr2, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            if (!objArr[i3].equals(objArr2[i3])) {
                return false;
            }
        }
        return true;
    }

    public static boolean o(int[] iArr, int[] iArr2, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            if (iArr[i3] != iArr2[i3]) {
                return false;
            }
        }
        return true;
    }

    public static void q(int i2, Object obj, Writer writer) {
        int a2 = WireFormat.a(i2);
        int b2 = WireFormat.b(i2);
        if (b2 == 0) {
            writer.D(a2, ((Long) obj).longValue());
        } else if (b2 == 1) {
            writer.w(a2, ((Long) obj).longValue());
        } else if (b2 == 2) {
            writer.e(a2, (ByteString) obj);
        } else if (b2 != 3) {
            if (b2 == 5) {
                writer.s(a2, ((Integer) obj).intValue());
                return;
            }
            throw new RuntimeException(InvalidProtocolBufferException.e());
        } else if (writer.x() == Writer.FieldOrder.ASCENDING) {
            writer.G(a2);
            ((UnknownFieldSetLite) obj).r(writer);
            writer.Q(a2);
        } else {
            writer.Q(a2);
            ((UnknownFieldSetLite) obj).r(writer);
            writer.G(a2);
        }
    }

    public void a() {
        if (!this.f32329e) {
            throw new UnsupportedOperationException();
        }
    }

    public final void b(int i2) {
        int[] iArr = this.f32326b;
        if (i2 > iArr.length) {
            int i3 = this.f32325a;
            int i4 = i3 + (i3 / 2);
            if (i4 >= i2) {
                i2 = i4;
            }
            if (i2 < 8) {
                i2 = 8;
            }
            this.f32326b = Arrays.copyOf(iArr, i2);
            this.f32327c = Arrays.copyOf(this.f32327c, i2);
        }
    }

    public int d() {
        int O0;
        int i2 = this.f32328d;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.f32325a; i4++) {
            int i5 = this.f32326b[i4];
            int a2 = WireFormat.a(i5);
            int b2 = WireFormat.b(i5);
            if (b2 == 0) {
                O0 = CodedOutputStream.O0(a2, ((Long) this.f32327c[i4]).longValue());
            } else if (b2 == 1) {
                O0 = CodedOutputStream.g0(a2, ((Long) this.f32327c[i4]).longValue());
            } else if (b2 == 2) {
                O0 = CodedOutputStream.Y(a2, (ByteString) this.f32327c[i4]);
            } else if (b2 == 3) {
                O0 = (CodedOutputStream.L0(a2) * 2) + ((UnknownFieldSetLite) this.f32327c[i4]).d();
            } else if (b2 == 5) {
                O0 = CodedOutputStream.e0(a2, ((Integer) this.f32327c[i4]).intValue());
            } else {
                throw new IllegalStateException(InvalidProtocolBufferException.e());
            }
            i3 += O0;
        }
        this.f32328d = i3;
        return i3;
    }

    public int e() {
        int i2 = this.f32328d;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.f32325a; i4++) {
            i3 += CodedOutputStream.A0(WireFormat.a(this.f32326b[i4]), (ByteString) this.f32327c[i4]);
        }
        this.f32328d = i3;
        return i3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof UnknownFieldSetLite)) {
            return false;
        }
        UnknownFieldSetLite unknownFieldSetLite = (UnknownFieldSetLite) obj;
        int i2 = this.f32325a;
        return i2 == unknownFieldSetLite.f32325a && o(this.f32326b, unknownFieldSetLite.f32326b, i2) && l(this.f32327c, unknownFieldSetLite.f32327c, this.f32325a);
    }

    public void h() {
        this.f32329e = false;
    }

    public int hashCode() {
        int i2 = this.f32325a;
        return ((((527 + i2) * 31) + f(this.f32326b, i2)) * 31) + g(this.f32327c, this.f32325a);
    }

    public UnknownFieldSetLite i(UnknownFieldSetLite unknownFieldSetLite) {
        if (unknownFieldSetLite.equals(c())) {
            return this;
        }
        a();
        int i2 = this.f32325a + unknownFieldSetLite.f32325a;
        b(i2);
        System.arraycopy(unknownFieldSetLite.f32326b, 0, this.f32326b, this.f32325a, unknownFieldSetLite.f32325a);
        System.arraycopy(unknownFieldSetLite.f32327c, 0, this.f32327c, this.f32325a, unknownFieldSetLite.f32325a);
        this.f32325a = i2;
        return this;
    }

    public final void m(StringBuilder sb, int i2) {
        for (int i3 = 0; i3 < this.f32325a; i3++) {
            MessageLiteToString.d(sb, i2, String.valueOf(WireFormat.a(this.f32326b[i3])), this.f32327c[i3]);
        }
    }

    public void n(int i2, Object obj) {
        a();
        b(this.f32325a + 1);
        int[] iArr = this.f32326b;
        int i3 = this.f32325a;
        iArr[i3] = i2;
        this.f32327c[i3] = obj;
        this.f32325a = i3 + 1;
    }

    public void p(Writer writer) {
        if (writer.x() == Writer.FieldOrder.DESCENDING) {
            for (int i2 = this.f32325a - 1; i2 >= 0; i2--) {
                writer.r(WireFormat.a(this.f32326b[i2]), this.f32327c[i2]);
            }
            return;
        }
        for (int i3 = 0; i3 < this.f32325a; i3++) {
            writer.r(WireFormat.a(this.f32326b[i3]), this.f32327c[i3]);
        }
    }

    public void r(Writer writer) {
        if (this.f32325a != 0) {
            if (writer.x() == Writer.FieldOrder.ASCENDING) {
                for (int i2 = 0; i2 < this.f32325a; i2++) {
                    q(this.f32326b[i2], this.f32327c[i2], writer);
                }
                return;
            }
            for (int i3 = this.f32325a - 1; i3 >= 0; i3--) {
                q(this.f32326b[i3], this.f32327c[i3], writer);
            }
        }
    }

    public UnknownFieldSetLite(int i2, int[] iArr, Object[] objArr, boolean z2) {
        this.f32328d = -1;
        this.f32325a = i2;
        this.f32326b = iArr;
        this.f32327c = objArr;
        this.f32329e = z2;
    }
}
