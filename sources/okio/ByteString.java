package okio;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata
public class ByteString implements Serializable, Comparable<ByteString> {
    public static final Companion C = new Companion((DefaultConstructorMarker) null);
    public static final ByteString D = new ByteString(new byte[0]);

    /* renamed from: A  reason: collision with root package name */
    public transient int f43345A;

    /* renamed from: B  reason: collision with root package name */
    public transient String f43346B;

    /* renamed from: z  reason: collision with root package name */
    public final byte[] f43347z;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ ByteString f(Companion companion, byte[] bArr, int i2, int i3, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                i2 = 0;
            }
            if ((i4 & 2) != 0) {
                i3 = SegmentedByteString.c();
            }
            return companion.e(bArr, i2, i3);
        }

        public final ByteString a(String str) {
            Intrinsics.i(str, "<this>");
            byte[] a2 = Base64.a(str);
            if (a2 != null) {
                return new ByteString(a2);
            }
            return null;
        }

        public final ByteString b(String str) {
            Intrinsics.i(str, "<this>");
            if (str.length() % 2 == 0) {
                int length = str.length() / 2;
                byte[] bArr = new byte[length];
                for (int i2 = 0; i2 < length; i2++) {
                    int i3 = i2 * 2;
                    bArr[i2] = (byte) ((okio.internal.ByteString.e(str.charAt(i3)) << 4) + okio.internal.ByteString.e(str.charAt(i3 + 1)));
                }
                return new ByteString(bArr);
            }
            throw new IllegalArgumentException(("Unexpected hex string: " + str).toString());
        }

        public final ByteString c(String str, Charset charset) {
            Intrinsics.i(str, "<this>");
            Intrinsics.i(charset, "charset");
            byte[] bytes = str.getBytes(charset);
            Intrinsics.h(bytes, "getBytes(...)");
            return new ByteString(bytes);
        }

        public final ByteString d(String str) {
            Intrinsics.i(str, "<this>");
            ByteString byteString = new ByteString(_JvmPlatformKt.a(str));
            byteString.H(str);
            return byteString;
        }

        public final ByteString e(byte[] bArr, int i2, int i3) {
            Intrinsics.i(bArr, "<this>");
            int f2 = SegmentedByteString.f(bArr, i3);
            SegmentedByteString.b((long) bArr.length, (long) i2, (long) f2);
            return new ByteString(ArraysKt.r(bArr, i2, f2 + i2));
        }

        public Companion() {
        }
    }

    public ByteString(byte[] bArr) {
        Intrinsics.i(bArr, "data");
        this.f43347z = bArr;
    }

    public static /* synthetic */ int C(ByteString byteString, ByteString byteString2, int i2, int i3, Object obj) {
        if (obj == null) {
            if ((i3 & 2) != 0) {
                i2 = SegmentedByteString.c();
            }
            return byteString.A(byteString2, i2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lastIndexOf");
    }

    public static /* synthetic */ ByteString S(ByteString byteString, int i2, int i3, int i4, Object obj) {
        if (obj == null) {
            if ((i4 & 1) != 0) {
                i2 = 0;
            }
            if ((i4 & 2) != 0) {
                i3 = SegmentedByteString.c();
            }
            return byteString.R(i2, i3);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: substring");
    }

    public static /* synthetic */ int x(ByteString byteString, ByteString byteString2, int i2, int i3, Object obj) {
        if (obj == null) {
            if ((i3 & 2) != 0) {
                i2 = 0;
            }
            return byteString.r(byteString2, i2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: indexOf");
    }

    public final int A(ByteString byteString, int i2) {
        Intrinsics.i(byteString, "other");
        return B(byteString.y(), i2);
    }

    public int B(byte[] bArr, int i2) {
        Intrinsics.i(bArr, "other");
        for (int min = Math.min(SegmentedByteString.e(this, i2), l().length - bArr.length); -1 < min; min--) {
            if (SegmentedByteString.a(l(), min, bArr, 0, bArr.length)) {
                return min;
            }
        }
        return -1;
    }

    public final ByteString D() {
        return h("MD5");
    }

    public boolean E(int i2, ByteString byteString, int i3, int i4) {
        Intrinsics.i(byteString, "other");
        return byteString.F(i3, l(), i2, i4);
    }

    public boolean F(int i2, byte[] bArr, int i3, int i4) {
        Intrinsics.i(bArr, "other");
        return i2 >= 0 && i2 <= l().length - i4 && i3 >= 0 && i3 <= bArr.length - i4 && SegmentedByteString.a(l(), i2, bArr, i3, i4);
    }

    public final void G(int i2) {
        this.f43345A = i2;
    }

    public final void H(String str) {
        this.f43346B = str;
    }

    public final ByteString I() {
        return h("SHA-1");
    }

    public final ByteString M() {
        return h("SHA-256");
    }

    public final int N() {
        return n();
    }

    public final boolean Q(ByteString byteString) {
        Intrinsics.i(byteString, "prefix");
        return E(0, byteString, 0, byteString.N());
    }

    public ByteString R(int i2, int i3) {
        int e2 = SegmentedByteString.e(this, i3);
        if (i2 < 0) {
            throw new IllegalArgumentException("beginIndex < 0");
        } else if (e2 > l().length) {
            throw new IllegalArgumentException(("endIndex > length(" + l().length + ')').toString());
        } else if (e2 - i2 >= 0) {
            return (i2 == 0 && e2 == l().length) ? this : new ByteString(ArraysKt.r(l(), i2, e2));
        } else {
            throw new IllegalArgumentException("endIndex < beginIndex");
        }
    }

    public ByteString T() {
        int i2 = 0;
        while (i2 < l().length) {
            byte b2 = l()[i2];
            if (b2 < 65 || b2 > 90) {
                i2++;
            } else {
                byte[] l2 = l();
                byte[] copyOf = Arrays.copyOf(l2, l2.length);
                Intrinsics.h(copyOf, "copyOf(...)");
                copyOf[i2] = (byte) (b2 + 32);
                for (int i3 = i2 + 1; i3 < copyOf.length; i3++) {
                    byte b3 = copyOf[i3];
                    if (b3 >= 65 && b3 <= 90) {
                        copyOf[i3] = (byte) (b3 + 32);
                    }
                }
                return new ByteString(copyOf);
            }
        }
        return this;
    }

    public String U() {
        String o2 = o();
        if (o2 != null) {
            return o2;
        }
        String c2 = _JvmPlatformKt.c(y());
        H(c2);
        return c2;
    }

    public void V(Buffer buffer, int i2, int i3) {
        Intrinsics.i(buffer, "buffer");
        okio.internal.ByteString.d(this, buffer, i2, i3);
    }

    public String d() {
        return Base64.c(l(), (byte[]) null, 1, (Object) null);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            if (byteString.N() == l().length && byteString.F(0, l(), 0, l().length)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0031, code lost:
        if (r0 < r1) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        return -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        return 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0028, code lost:
        if (r7 < r8) goto L_0x002a;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int compareTo(okio.ByteString r10) {
        /*
            r9 = this;
            java.lang.String r0 = "other"
            kotlin.jvm.internal.Intrinsics.i(r10, r0)
            int r0 = r9.N()
            int r1 = r10.N()
            int r2 = java.lang.Math.min(r0, r1)
            r3 = 0
            r4 = r3
        L_0x0013:
            r5 = -1
            r6 = 1
            if (r4 >= r2) goto L_0x002e
            byte r7 = r9.k(r4)
            r7 = r7 & 255(0xff, float:3.57E-43)
            byte r8 = r10.k(r4)
            r8 = r8 & 255(0xff, float:3.57E-43)
            if (r7 != r8) goto L_0x0028
            int r4 = r4 + 1
            goto L_0x0013
        L_0x0028:
            if (r7 >= r8) goto L_0x002c
        L_0x002a:
            r3 = r5
            goto L_0x0034
        L_0x002c:
            r3 = r6
            goto L_0x0034
        L_0x002e:
            if (r0 != r1) goto L_0x0031
            goto L_0x0034
        L_0x0031:
            if (r0 >= r1) goto L_0x002c
            goto L_0x002a
        L_0x0034:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.ByteString.compareTo(okio.ByteString):int");
    }

    public ByteString h(String str) {
        Intrinsics.i(str, "algorithm");
        MessageDigest instance = MessageDigest.getInstance(str);
        instance.update(this.f43347z, 0, N());
        byte[] digest = instance.digest();
        Intrinsics.f(digest);
        return new ByteString(digest);
    }

    public int hashCode() {
        int m2 = m();
        if (m2 != 0) {
            return m2;
        }
        int hashCode = Arrays.hashCode(l());
        G(hashCode);
        return hashCode;
    }

    public final boolean j(ByteString byteString) {
        Intrinsics.i(byteString, "suffix");
        return E(N() - byteString.N(), byteString, 0, byteString.N());
    }

    public final byte k(int i2) {
        return z(i2);
    }

    public final byte[] l() {
        return this.f43347z;
    }

    public final int m() {
        return this.f43345A;
    }

    public int n() {
        return l().length;
    }

    public final String o() {
        return this.f43346B;
    }

    public String p() {
        char[] cArr = new char[(l().length * 2)];
        int i2 = 0;
        for (byte b2 : l()) {
            int i3 = i2 + 1;
            cArr[i2] = okio.internal.ByteString.f()[(b2 >> 4) & 15];
            i2 += 2;
            cArr[i3] = okio.internal.ByteString.f()[b2 & 15];
        }
        return StringsKt.u(cArr);
    }

    public final int r(ByteString byteString, int i2) {
        Intrinsics.i(byteString, "other");
        return t(byteString.y(), i2);
    }

    public int t(byte[] bArr, int i2) {
        Intrinsics.i(bArr, "other");
        int length = l().length - bArr.length;
        int max = Math.max(i2, 0);
        if (max <= length) {
            while (!SegmentedByteString.a(l(), max, bArr, 0, bArr.length)) {
                if (max != length) {
                    max++;
                }
            }
            return max;
        }
        return -1;
    }

    public String toString() {
        String str;
        if (l().length == 0) {
            str = "[size=0]";
        } else {
            int a2 = okio.internal.ByteString.c(l(), 64);
            if (a2 != -1) {
                String U = U();
                String substring = U.substring(0, a2);
                Intrinsics.h(substring, "substring(...)");
                String K = StringsKt.K(StringsKt.K(StringsKt.K(substring, "\\", "\\\\", false, 4, (Object) null), "\n", "\\n", false, 4, (Object) null), "\r", "\\r", false, 4, (Object) null);
                if (a2 < U.length()) {
                    return "[size=" + l().length + " text=" + K + "…]";
                }
                return "[text=" + K + ']';
            } else if (l().length <= 64) {
                str = "[hex=" + p() + ']';
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("[size=");
                sb.append(l().length);
                sb.append(" hex=");
                int e2 = SegmentedByteString.e(this, 64);
                if (e2 > l().length) {
                    throw new IllegalArgumentException(("endIndex > length(" + l().length + ')').toString());
                } else if (e2 >= 0) {
                    sb.append((e2 == l().length ? this : new ByteString(ArraysKt.r(l(), 0, e2))).p());
                    sb.append("…]");
                    return sb.toString();
                } else {
                    throw new IllegalArgumentException("endIndex < beginIndex");
                }
            }
        }
        return str;
    }

    public byte[] y() {
        return l();
    }

    public byte z(int i2) {
        return l()[i2];
    }
}
