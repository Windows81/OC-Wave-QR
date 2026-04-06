package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.Writer;
import java.util.Arrays;

public final class UnknownFieldSetLite {

    /* renamed from: f  reason: collision with root package name */
    public static final UnknownFieldSetLite f21171f = new UnknownFieldSetLite(0, new int[0], new Object[0], false);

    /* renamed from: a  reason: collision with root package name */
    public int f21172a;

    /* renamed from: b  reason: collision with root package name */
    public int[] f21173b;

    /* renamed from: c  reason: collision with root package name */
    public Object[] f21174c;

    /* renamed from: d  reason: collision with root package name */
    public int f21175d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f21176e;

    public UnknownFieldSetLite() {
        this(0, new int[8], new Object[8], true);
    }

    public static UnknownFieldSetLite c() {
        return f21171f;
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
        int i2 = unknownFieldSetLite.f21172a + unknownFieldSetLite2.f21172a;
        int[] copyOf = Arrays.copyOf(unknownFieldSetLite.f21173b, i2);
        System.arraycopy(unknownFieldSetLite2.f21173b, 0, copyOf, unknownFieldSetLite.f21172a, unknownFieldSetLite2.f21172a);
        Object[] copyOf2 = Arrays.copyOf(unknownFieldSetLite.f21174c, i2);
        System.arraycopy(unknownFieldSetLite2.f21174c, 0, copyOf2, unknownFieldSetLite.f21172a, unknownFieldSetLite2.f21172a);
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
            writer.a0(a2, (ByteString) obj);
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
        if (!this.f21176e) {
            throw new UnsupportedOperationException();
        }
    }

    public final void b(int i2) {
        int[] iArr = this.f21173b;
        if (i2 > iArr.length) {
            int i3 = this.f21172a;
            int i4 = i3 + (i3 / 2);
            if (i4 >= i2) {
                i2 = i4;
            }
            if (i2 < 8) {
                i2 = 8;
            }
            this.f21173b = Arrays.copyOf(iArr, i2);
            this.f21174c = Arrays.copyOf(this.f21174c, i2);
        }
    }

    public int d() {
        int P0;
        int i2 = this.f21175d;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.f21172a; i4++) {
            int i5 = this.f21173b[i4];
            int a2 = WireFormat.a(i5);
            int b2 = WireFormat.b(i5);
            if (b2 == 0) {
                P0 = CodedOutputStream.P0(a2, ((Long) this.f21174c[i4]).longValue());
            } else if (b2 == 1) {
                P0 = CodedOutputStream.g0(a2, ((Long) this.f21174c[i4]).longValue());
            } else if (b2 == 2) {
                P0 = CodedOutputStream.i(a2, (ByteString) this.f21174c[i4]);
            } else if (b2 == 3) {
                P0 = (CodedOutputStream.M0(a2) * 2) + ((UnknownFieldSetLite) this.f21174c[i4]).d();
            } else if (b2 == 5) {
                P0 = CodedOutputStream.e0(a2, ((Integer) this.f21174c[i4]).intValue());
            } else {
                throw new IllegalStateException(InvalidProtocolBufferException.e());
            }
            i3 += P0;
        }
        this.f21175d = i3;
        return i3;
    }

    public int e() {
        int i2 = this.f21175d;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.f21172a; i4++) {
            i3 += CodedOutputStream.B0(WireFormat.a(this.f21173b[i4]), (ByteString) this.f21174c[i4]);
        }
        this.f21175d = i3;
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
        int i2 = this.f21172a;
        return i2 == unknownFieldSetLite.f21172a && o(this.f21173b, unknownFieldSetLite.f21173b, i2) && l(this.f21174c, unknownFieldSetLite.f21174c, this.f21172a);
    }

    public void h() {
        if (this.f21176e) {
            this.f21176e = false;
        }
    }

    public int hashCode() {
        int i2 = this.f21172a;
        return ((((527 + i2) * 31) + f(this.f21173b, i2)) * 31) + g(this.f21174c, this.f21172a);
    }

    public UnknownFieldSetLite i(UnknownFieldSetLite unknownFieldSetLite) {
        if (unknownFieldSetLite.equals(c())) {
            return this;
        }
        a();
        int i2 = this.f21172a + unknownFieldSetLite.f21172a;
        b(i2);
        System.arraycopy(unknownFieldSetLite.f21173b, 0, this.f21173b, this.f21172a, unknownFieldSetLite.f21172a);
        System.arraycopy(unknownFieldSetLite.f21174c, 0, this.f21174c, this.f21172a, unknownFieldSetLite.f21172a);
        this.f21172a = i2;
        return this;
    }

    public final void m(StringBuilder sb, int i2) {
        for (int i3 = 0; i3 < this.f21172a; i3++) {
            MessageLiteToString.d(sb, i2, String.valueOf(WireFormat.a(this.f21173b[i3])), this.f21174c[i3]);
        }
    }

    public void n(int i2, Object obj) {
        a();
        b(this.f21172a + 1);
        int[] iArr = this.f21173b;
        int i3 = this.f21172a;
        iArr[i3] = i2;
        this.f21174c[i3] = obj;
        this.f21172a = i3 + 1;
    }

    public void p(Writer writer) {
        if (writer.x() == Writer.FieldOrder.DESCENDING) {
            for (int i2 = this.f21172a - 1; i2 >= 0; i2--) {
                writer.r(WireFormat.a(this.f21173b[i2]), this.f21174c[i2]);
            }
            return;
        }
        for (int i3 = 0; i3 < this.f21172a; i3++) {
            writer.r(WireFormat.a(this.f21173b[i3]), this.f21174c[i3]);
        }
    }

    public void r(Writer writer) {
        if (this.f21172a != 0) {
            if (writer.x() == Writer.FieldOrder.ASCENDING) {
                for (int i2 = 0; i2 < this.f21172a; i2++) {
                    q(this.f21173b[i2], this.f21174c[i2], writer);
                }
                return;
            }
            for (int i3 = this.f21172a - 1; i3 >= 0; i3--) {
                q(this.f21173b[i3], this.f21174c[i3], writer);
            }
        }
    }

    public UnknownFieldSetLite(int i2, int[] iArr, Object[] objArr, boolean z2) {
        this.f21175d = -1;
        this.f21172a = i2;
        this.f21173b = iArr;
        this.f21174c = objArr;
        this.f21176e = z2;
    }
}
