package androidx.emoji2.text.flatbuffer;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.google.api.Service;

public class FlexBuffers {

    /* renamed from: a  reason: collision with root package name */
    public static final ReadBuf f21367a = new ArrayReadWriteBuf(new byte[]{0}, 1);

    public static class Blob extends Sized {

        /* renamed from: e  reason: collision with root package name */
        public static final Blob f21368e = new Blob(FlexBuffers.f21367a, 1, 1);

        public Blob(ReadBuf readBuf, int i2, int i3) {
            super(readBuf, i2, i3);
        }

        public static Blob c() {
            return f21368e;
        }

        public StringBuilder a(StringBuilder sb) {
            sb.append('\"');
            sb.append(this.f21372a.a(this.f21373b, b()));
            sb.append('\"');
            return sb;
        }

        public /* bridge */ /* synthetic */ int b() {
            return super.b();
        }

        public String toString() {
            return this.f21372a.a(this.f21373b, b());
        }
    }

    public static class FlexBufferException extends RuntimeException {
        public FlexBufferException(String str) {
            super(str);
        }
    }

    public static class Key extends Object {

        /* renamed from: d  reason: collision with root package name */
        public static final Key f21369d = new Key(FlexBuffers.f21367a, 0, 0);

        public Key(ReadBuf readBuf, int i2, int i3) {
            super(readBuf, i2, i3);
        }

        public static Key c() {
            return f21369d;
        }

        public StringBuilder a(StringBuilder sb) {
            sb.append(toString());
            return sb;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof Key)) {
                return false;
            }
            Key key = (Key) obj;
            return key.f21373b == this.f21373b && key.f21374c == this.f21374c;
        }

        public int hashCode() {
            return this.f21373b ^ this.f21374c;
        }

        public String toString() {
            int i2 = this.f21373b;
            while (this.f21372a.get(i2) != 0) {
                i2++;
            }
            int i3 = this.f21373b;
            return this.f21372a.a(i3, i2 - i3);
        }
    }

    public static class KeyVector {

        /* renamed from: a  reason: collision with root package name */
        public final TypedVector f21370a;

        public KeyVector(TypedVector typedVector) {
            this.f21370a = typedVector;
        }

        public Key a(int i2) {
            if (i2 >= b()) {
                return Key.f21369d;
            }
            TypedVector typedVector = this.f21370a;
            TypedVector typedVector2 = this.f21370a;
            ReadBuf readBuf = typedVector2.f21372a;
            return new Key(readBuf, FlexBuffers.g(readBuf, typedVector.f21373b + (i2 * typedVector.f21374c), typedVector2.f21374c), 1);
        }

        public int b() {
            return this.f21370a.b();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append('[');
            for (int i2 = 0; i2 < this.f21370a.b(); i2++) {
                this.f21370a.d(i2).q(sb);
                if (i2 != this.f21370a.b() - 1) {
                    sb.append(", ");
                }
            }
            sb.append("]");
            return sb.toString();
        }
    }

    public static class Map extends Vector {

        /* renamed from: f  reason: collision with root package name */
        public static final Map f21371f = new Map(FlexBuffers.f21367a, 1, 1);

        public Map(ReadBuf readBuf, int i2, int i3) {
            super(readBuf, i2, i3);
        }

        public static Map e() {
            return f21371f;
        }

        public StringBuilder a(StringBuilder sb) {
            sb.append("{ ");
            KeyVector f2 = f();
            int b2 = b();
            Vector g2 = g();
            for (int i2 = 0; i2 < b2; i2++) {
                sb.append('\"');
                sb.append(f2.a(i2).toString());
                sb.append("\" : ");
                sb.append(g2.d(i2).toString());
                if (i2 != b2 - 1) {
                    sb.append(", ");
                }
            }
            sb.append(" }");
            return sb;
        }

        public KeyVector f() {
            int i2 = this.f21373b - (this.f21374c * 3);
            ReadBuf readBuf = this.f21372a;
            int c2 = FlexBuffers.g(readBuf, i2, this.f21374c);
            ReadBuf readBuf2 = this.f21372a;
            int i3 = this.f21374c;
            return new KeyVector(new TypedVector(readBuf, c2, FlexBuffers.j(readBuf2, i2 + i3, i3), 4));
        }

        public Vector g() {
            return new Vector(this.f21372a, this.f21373b, this.f21374c);
        }
    }

    public static abstract class Object {

        /* renamed from: a  reason: collision with root package name */
        public ReadBuf f21372a;

        /* renamed from: b  reason: collision with root package name */
        public int f21373b;

        /* renamed from: c  reason: collision with root package name */
        public int f21374c;

        public Object(ReadBuf readBuf, int i2, int i3) {
            this.f21372a = readBuf;
            this.f21373b = i2;
            this.f21374c = i3;
        }

        public abstract StringBuilder a(StringBuilder sb);

        public String toString() {
            return a(new StringBuilder(128)).toString();
        }
    }

    public static class Reference {

        /* renamed from: f  reason: collision with root package name */
        public static final Reference f21375f = new Reference(FlexBuffers.f21367a, 0, 1, 0);

        /* renamed from: a  reason: collision with root package name */
        public ReadBuf f21376a;

        /* renamed from: b  reason: collision with root package name */
        public int f21377b;

        /* renamed from: c  reason: collision with root package name */
        public int f21378c;

        /* renamed from: d  reason: collision with root package name */
        public int f21379d;

        /* renamed from: e  reason: collision with root package name */
        public int f21380e;

        public Reference(ReadBuf readBuf, int i2, int i3, int i4) {
            this(readBuf, i2, i3, 1 << (i4 & 3), i4 >> 2);
        }

        public Blob b() {
            if (!k() && !o()) {
                return Blob.c();
            }
            ReadBuf readBuf = this.f21376a;
            return new Blob(readBuf, FlexBuffers.g(readBuf, this.f21377b, this.f21378c), this.f21379d);
        }

        public boolean c() {
            return l() ? this.f21376a.get(this.f21377b) != 0 : i() != 0;
        }

        public double d() {
            int i2 = this.f21380e;
            if (i2 == 3) {
                return FlexBuffers.i(this.f21376a, this.f21377b, this.f21378c);
            }
            if (i2 == 1) {
                return (double) FlexBuffers.j(this.f21376a, this.f21377b, this.f21378c);
            }
            if (i2 != 2) {
                if (i2 == 5) {
                    return Double.parseDouble(h());
                }
                if (i2 == 6) {
                    ReadBuf readBuf = this.f21376a;
                    return (double) FlexBuffers.j(readBuf, FlexBuffers.g(readBuf, this.f21377b, this.f21378c), this.f21379d);
                } else if (i2 == 7) {
                    ReadBuf readBuf2 = this.f21376a;
                    return (double) FlexBuffers.l(readBuf2, FlexBuffers.g(readBuf2, this.f21377b, this.f21378c), this.f21379d);
                } else if (i2 == 8) {
                    ReadBuf readBuf3 = this.f21376a;
                    return FlexBuffers.i(readBuf3, FlexBuffers.g(readBuf3, this.f21377b, this.f21378c), this.f21379d);
                } else if (i2 == 10) {
                    return (double) j().b();
                } else {
                    if (i2 != 26) {
                        return 0.0d;
                    }
                }
            }
            return (double) FlexBuffers.l(this.f21376a, this.f21377b, this.f21378c);
        }

        public Key e() {
            if (!m()) {
                return Key.c();
            }
            ReadBuf readBuf = this.f21376a;
            return new Key(readBuf, FlexBuffers.g(readBuf, this.f21377b, this.f21378c), this.f21379d);
        }

        public long f() {
            int i2 = this.f21380e;
            if (i2 == 1) {
                return FlexBuffers.k(this.f21376a, this.f21377b, this.f21378c);
            }
            if (i2 == 2) {
                return FlexBuffers.l(this.f21376a, this.f21377b, this.f21378c);
            }
            if (i2 == 3) {
                return (long) FlexBuffers.i(this.f21376a, this.f21377b, this.f21378c);
            }
            if (i2 == 5) {
                try {
                    return Long.parseLong(h());
                } catch (NumberFormatException unused) {
                    return 0;
                }
            } else if (i2 == 6) {
                ReadBuf readBuf = this.f21376a;
                return FlexBuffers.k(readBuf, FlexBuffers.g(readBuf, this.f21377b, this.f21378c), this.f21379d);
            } else if (i2 == 7) {
                ReadBuf readBuf2 = this.f21376a;
                return FlexBuffers.l(readBuf2, FlexBuffers.g(readBuf2, this.f21377b, this.f21378c), this.f21378c);
            } else if (i2 == 8) {
                ReadBuf readBuf3 = this.f21376a;
                return (long) FlexBuffers.i(readBuf3, FlexBuffers.g(readBuf3, this.f21377b, this.f21378c), this.f21379d);
            } else if (i2 == 10) {
                return (long) j().b();
            } else {
                if (i2 != 26) {
                    return 0;
                }
                return (long) FlexBuffers.j(this.f21376a, this.f21377b, this.f21378c);
            }
        }

        public Map g() {
            if (!n()) {
                return Map.e();
            }
            ReadBuf readBuf = this.f21376a;
            return new Map(readBuf, FlexBuffers.g(readBuf, this.f21377b, this.f21378c), this.f21379d);
        }

        public String h() {
            if (o()) {
                int c2 = FlexBuffers.g(this.f21376a, this.f21377b, this.f21378c);
                ReadBuf readBuf = this.f21376a;
                int i2 = this.f21379d;
                return this.f21376a.a(c2, (int) FlexBuffers.l(readBuf, c2 - i2, i2));
            } else if (!m()) {
                return "";
            } else {
                int c3 = FlexBuffers.g(this.f21376a, this.f21377b, this.f21379d);
                int i3 = c3;
                while (this.f21376a.get(i3) != 0) {
                    i3++;
                }
                return this.f21376a.a(c3, i3 - c3);
            }
        }

        public long i() {
            int i2 = this.f21380e;
            if (i2 == 2) {
                return FlexBuffers.l(this.f21376a, this.f21377b, this.f21378c);
            }
            if (i2 == 1) {
                return FlexBuffers.k(this.f21376a, this.f21377b, this.f21378c);
            }
            if (i2 == 3) {
                return (long) FlexBuffers.i(this.f21376a, this.f21377b, this.f21378c);
            }
            if (i2 == 10) {
                return (long) j().b();
            }
            if (i2 == 26) {
                return (long) FlexBuffers.j(this.f21376a, this.f21377b, this.f21378c);
            }
            if (i2 == 5) {
                return Long.parseLong(h());
            }
            if (i2 == 6) {
                ReadBuf readBuf = this.f21376a;
                return FlexBuffers.k(readBuf, FlexBuffers.g(readBuf, this.f21377b, this.f21378c), this.f21379d);
            } else if (i2 == 7) {
                ReadBuf readBuf2 = this.f21376a;
                return FlexBuffers.l(readBuf2, FlexBuffers.g(readBuf2, this.f21377b, this.f21378c), this.f21379d);
            } else if (i2 != 8) {
                return 0;
            } else {
                ReadBuf readBuf3 = this.f21376a;
                return (long) FlexBuffers.i(readBuf3, FlexBuffers.g(readBuf3, this.f21377b, this.f21378c), this.f21378c);
            }
        }

        public Vector j() {
            if (p()) {
                ReadBuf readBuf = this.f21376a;
                return new Vector(readBuf, FlexBuffers.g(readBuf, this.f21377b, this.f21378c), this.f21379d);
            }
            int i2 = this.f21380e;
            if (i2 == 15) {
                ReadBuf readBuf2 = this.f21376a;
                return new TypedVector(readBuf2, FlexBuffers.g(readBuf2, this.f21377b, this.f21378c), this.f21379d, 4);
            } else if (!FlexBuffers.h(i2)) {
                return Vector.c();
            } else {
                ReadBuf readBuf3 = this.f21376a;
                return new TypedVector(readBuf3, FlexBuffers.g(readBuf3, this.f21377b, this.f21378c), this.f21379d, FlexBuffers.m(this.f21380e));
            }
        }

        public boolean k() {
            return this.f21380e == 25;
        }

        public boolean l() {
            return this.f21380e == 26;
        }

        public boolean m() {
            return this.f21380e == 4;
        }

        public boolean n() {
            return this.f21380e == 9;
        }

        public boolean o() {
            return this.f21380e == 5;
        }

        public boolean p() {
            int i2 = this.f21380e;
            return i2 == 10 || i2 == 9;
        }

        public StringBuilder q(StringBuilder sb) {
            int i2 = this.f21380e;
            if (i2 != 36) {
                switch (i2) {
                    case 0:
                        sb.append("null");
                        return sb;
                    case 1:
                    case 6:
                        sb.append(f());
                        return sb;
                    case 2:
                    case 7:
                        sb.append(i());
                        return sb;
                    case 3:
                    case 8:
                        sb.append(d());
                        return sb;
                    case 4:
                        Key e2 = e();
                        sb.append('\"');
                        StringBuilder a2 = e2.a(sb);
                        a2.append('\"');
                        return a2;
                    case 5:
                        sb.append('\"');
                        sb.append(h());
                        sb.append('\"');
                        return sb;
                    case 9:
                        return g().a(sb);
                    case 10:
                        return j().a(sb);
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                        break;
                    case 16:
                    case 17:
                    case 18:
                    case DescriptorProtos.FieldOptions.TARGETS_FIELD_NUMBER:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case Service.METRICS_FIELD_NUMBER /*24*/:
                        throw new FlexBufferException("not_implemented:" + this.f21380e);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /*25*/:
                        return b().a(sb);
                    case Service.BILLING_FIELD_NUMBER /*26*/:
                        sb.append(c());
                        return sb;
                    default:
                        return sb;
                }
            }
            sb.append(j());
            return sb;
        }

        public String toString() {
            return q(new StringBuilder(128)).toString();
        }

        public Reference(ReadBuf readBuf, int i2, int i3, int i4, int i5) {
            this.f21376a = readBuf;
            this.f21377b = i2;
            this.f21378c = i3;
            this.f21379d = i4;
            this.f21380e = i5;
        }
    }

    public static abstract class Sized extends Object {

        /* renamed from: d  reason: collision with root package name */
        public final int f21381d;

        public Sized(ReadBuf readBuf, int i2, int i3) {
            super(readBuf, i2, i3);
            this.f21381d = FlexBuffers.j(this.f21372a, i2 - i3, i3);
        }

        public int b() {
            return this.f21381d;
        }
    }

    public static class TypedVector extends Vector {

        /* renamed from: g  reason: collision with root package name */
        public static final TypedVector f21382g = new TypedVector(FlexBuffers.f21367a, 1, 1, 1);

        /* renamed from: f  reason: collision with root package name */
        public final int f21383f;

        public TypedVector(ReadBuf readBuf, int i2, int i3, int i4) {
            super(readBuf, i2, i3);
            this.f21383f = i4;
        }

        public Reference d(int i2) {
            if (i2 >= b()) {
                return Reference.f21375f;
            }
            return new Reference(this.f21372a, this.f21373b + (i2 * this.f21374c), this.f21374c, 1, this.f21383f);
        }
    }

    public static class Unsigned {
        public static int a(byte b2) {
            return b2 & 255;
        }

        public static long b(int i2) {
            return ((long) i2) & 4294967295L;
        }

        public static int c(short s2) {
            return s2 & 65535;
        }
    }

    public static class Vector extends Sized {

        /* renamed from: e  reason: collision with root package name */
        public static final Vector f21384e = new Vector(FlexBuffers.f21367a, 1, 1);

        public Vector(ReadBuf readBuf, int i2, int i3) {
            super(readBuf, i2, i3);
        }

        public static Vector c() {
            return f21384e;
        }

        public StringBuilder a(StringBuilder sb) {
            sb.append("[ ");
            int b2 = b();
            for (int i2 = 0; i2 < b2; i2++) {
                d(i2).q(sb);
                if (i2 != b2 - 1) {
                    sb.append(", ");
                }
            }
            sb.append(" ]");
            return sb;
        }

        public /* bridge */ /* synthetic */ int b() {
            return super.b();
        }

        public Reference d(int i2) {
            long b2 = (long) b();
            long j2 = (long) i2;
            if (j2 >= b2) {
                return Reference.f21375f;
            }
            int a2 = Unsigned.a(this.f21372a.get((int) (((long) this.f21373b) + (b2 * ((long) this.f21374c)) + j2)));
            return new Reference(this.f21372a, this.f21373b + (i2 * this.f21374c), this.f21374c, a2);
        }

        public /* bridge */ /* synthetic */ String toString() {
            return super.toString();
        }
    }

    public static int g(ReadBuf readBuf, int i2, int i3) {
        return (int) (((long) i2) - l(readBuf, i2, i3));
    }

    public static boolean h(int i2) {
        return (i2 >= 11 && i2 <= 15) || i2 == 36;
    }

    public static double i(ReadBuf readBuf, int i2, int i3) {
        if (i3 == 4) {
            return (double) readBuf.getFloat(i2);
        }
        if (i3 != 8) {
            return -1.0d;
        }
        return readBuf.getDouble(i2);
    }

    public static int j(ReadBuf readBuf, int i2, int i3) {
        return (int) k(readBuf, i2, i3);
    }

    public static long k(ReadBuf readBuf, int i2, int i3) {
        int i4;
        if (i3 == 1) {
            i4 = readBuf.get(i2);
        } else if (i3 == 2) {
            i4 = readBuf.getShort(i2);
        } else if (i3 == 4) {
            i4 = readBuf.getInt(i2);
        } else if (i3 != 8) {
            return -1;
        } else {
            return readBuf.getLong(i2);
        }
        return (long) i4;
    }

    public static long l(ReadBuf readBuf, int i2, int i3) {
        if (i3 == 1) {
            return (long) Unsigned.a(readBuf.get(i2));
        }
        if (i3 == 2) {
            return (long) Unsigned.c(readBuf.getShort(i2));
        }
        if (i3 == 4) {
            return Unsigned.b(readBuf.getInt(i2));
        }
        if (i3 != 8) {
            return -1;
        }
        return readBuf.getLong(i2);
    }

    public static int m(int i2) {
        return i2 - 10;
    }
}
