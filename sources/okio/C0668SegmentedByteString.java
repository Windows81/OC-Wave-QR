package okio;

import java.security.MessageDigest;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import okio.internal.SegmentedByteString;

@Metadata
/* renamed from: okio.SegmentedByteString  reason: case insensitive filesystem */
public final class C0668SegmentedByteString extends ByteString {
    public final transient byte[][] E;
    public final transient int[] F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0668SegmentedByteString(byte[][] bArr, int[] iArr) {
        super(ByteString.D.l());
        Intrinsics.i(bArr, "segments");
        Intrinsics.i(iArr, "directory");
        this.E = bArr;
        this.F = iArr;
    }

    public int B(byte[] bArr, int i2) {
        Intrinsics.i(bArr, "other");
        return Z().B(bArr, i2);
    }

    public boolean E(int i2, ByteString byteString, int i3, int i4) {
        Intrinsics.i(byteString, "other");
        if (i2 < 0 || i2 > N() - i4) {
            return false;
        }
        int i5 = i4 + i2;
        int b2 = SegmentedByteString.b(this, i2);
        while (i2 < i5) {
            int i6 = b2 == 0 ? 0 : W()[b2 - 1];
            int i7 = W()[X().length + b2];
            int min = Math.min(i5, (W()[b2] - i6) + i6) - i2;
            if (!byteString.F(i3, X()[b2], i7 + (i2 - i6), min)) {
                return false;
            }
            i3 += min;
            i2 += min;
            b2++;
        }
        return true;
    }

    public boolean F(int i2, byte[] bArr, int i3, int i4) {
        Intrinsics.i(bArr, "other");
        if (i2 < 0 || i2 > N() - i4 || i3 < 0 || i3 > bArr.length - i4) {
            return false;
        }
        int i5 = i4 + i2;
        int b2 = SegmentedByteString.b(this, i2);
        while (i2 < i5) {
            int i6 = b2 == 0 ? 0 : W()[b2 - 1];
            int i7 = W()[X().length + b2];
            int min = Math.min(i5, (W()[b2] - i6) + i6) - i2;
            if (!SegmentedByteString.a(X()[b2], i7 + (i2 - i6), bArr, i3, min)) {
                return false;
            }
            i3 += min;
            i2 += min;
            b2++;
        }
        return true;
    }

    public ByteString R(int i2, int i3) {
        int e2 = SegmentedByteString.e(this, i3);
        if (i2 < 0) {
            throw new IllegalArgumentException(("beginIndex=" + i2 + " < 0").toString());
        } else if (e2 <= N()) {
            int i4 = e2 - i2;
            if (i4 < 0) {
                throw new IllegalArgumentException(("endIndex=" + e2 + " < beginIndex=" + i2).toString());
            } else if (i2 == 0 && e2 == N()) {
                return this;
            } else {
                if (i2 == e2) {
                    return ByteString.D;
                }
                int b2 = SegmentedByteString.b(this, i2);
                int b3 = SegmentedByteString.b(this, e2 - 1);
                byte[][] bArr = (byte[][]) ArraysKt.t(X(), b2, b3 + 1);
                int[] iArr = new int[(bArr.length * 2)];
                int i5 = 0;
                if (b2 <= b3) {
                    int i6 = b2;
                    int i7 = 0;
                    while (true) {
                        iArr[i7] = Math.min(W()[i6] - i2, i4);
                        int i8 = i7 + 1;
                        iArr[i7 + bArr.length] = W()[X().length + i6];
                        if (i6 == b3) {
                            break;
                        }
                        i6++;
                        i7 = i8;
                    }
                }
                if (b2 != 0) {
                    i5 = W()[b2 - 1];
                }
                int length = bArr.length;
                iArr[length] = iArr[length] + (i2 - i5);
                return new C0668SegmentedByteString(bArr, iArr);
            }
        } else {
            throw new IllegalArgumentException(("endIndex=" + e2 + " > length(" + N() + ')').toString());
        }
    }

    public ByteString T() {
        return Z().T();
    }

    public void V(Buffer buffer, int i2, int i3) {
        Intrinsics.i(buffer, "buffer");
        int i4 = i2 + i3;
        int b2 = SegmentedByteString.b(this, i2);
        while (i2 < i4) {
            int i5 = b2 == 0 ? 0 : W()[b2 - 1];
            int i6 = W()[X().length + b2];
            int min = Math.min(i4, (W()[b2] - i5) + i5) - i2;
            int i7 = i6 + (i2 - i5);
            Segment segment = new Segment(X()[b2], i7, i7 + min, true, false);
            Segment segment2 = buffer.f43339z;
            if (segment2 == null) {
                segment.f43438g = segment;
                segment.f43437f = segment;
                buffer.f43339z = segment;
            } else {
                Intrinsics.f(segment2);
                Segment segment3 = segment2.f43438g;
                Intrinsics.f(segment3);
                segment3.c(segment);
            }
            i2 += min;
            b2++;
        }
        buffer.m0(buffer.n0() + ((long) i3));
    }

    public final int[] W() {
        return this.F;
    }

    public final byte[][] X() {
        return this.E;
    }

    public byte[] Y() {
        byte[] bArr = new byte[N()];
        int length = X().length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i2 < length) {
            int i5 = W()[length + i2];
            int i6 = W()[i2];
            int i7 = i6 - i3;
            ArraysKt.g(X()[i2], bArr, i4, i5, i5 + i7);
            i4 += i7;
            i2++;
            i3 = i6;
        }
        return bArr;
    }

    public final ByteString Z() {
        return new ByteString(Y());
    }

    public String d() {
        return Z().d();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            if (byteString.N() == N() && E(0, byteString, 0, N())) {
                return true;
            }
        }
        return false;
    }

    public ByteString h(String str) {
        Intrinsics.i(str, "algorithm");
        MessageDigest instance = MessageDigest.getInstance(str);
        int length = X().length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int i4 = W()[length + i2];
            int i5 = W()[i2];
            instance.update(X()[i2], i4, i5 - i3);
            i2++;
            i3 = i5;
        }
        byte[] digest = instance.digest();
        Intrinsics.f(digest);
        return new ByteString(digest);
    }

    public int hashCode() {
        int m2 = m();
        if (m2 != 0) {
            return m2;
        }
        int length = X().length;
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        while (i2 < length) {
            int i5 = W()[length + i2];
            int i6 = W()[i2];
            byte[] bArr = X()[i2];
            int i7 = (i6 - i4) + i5;
            while (i5 < i7) {
                i3 = (i3 * 31) + bArr[i5];
                i5++;
            }
            i2++;
            i4 = i6;
        }
        G(i3);
        return i3;
    }

    public int n() {
        return W()[X().length - 1];
    }

    public String p() {
        return Z().p();
    }

    public int t(byte[] bArr, int i2) {
        Intrinsics.i(bArr, "other");
        return Z().t(bArr, i2);
    }

    public String toString() {
        return Z().toString();
    }

    public byte[] y() {
        return Y();
    }

    public byte z(int i2) {
        SegmentedByteString.b((long) W()[X().length - 1], (long) i2, 1);
        int b2 = SegmentedByteString.b(this, i2);
        return X()[b2][(i2 - (b2 == 0 ? 0 : W()[b2 - 1])) + W()[X().length + b2]];
    }
}
