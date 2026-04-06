package okio.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okio.Buffer;
import okio.Options;
import okio.Segment;
import okio.SegmentedByteString;
import okio._JvmPlatformKt;

@Metadata
/* renamed from: okio.internal.-Buffer  reason: invalid class name */
public final class Buffer {

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f43467a = _JvmPlatformKt.a("0123456789abcdef");

    public static final Buffer.UnsafeCursor a(okio.Buffer buffer, Buffer.UnsafeCursor unsafeCursor) {
        Intrinsics.i(buffer, "<this>");
        Intrinsics.i(unsafeCursor, "unsafeCursor");
        Buffer.UnsafeCursor g2 = SegmentedByteString.g(unsafeCursor);
        if (g2.f43342z == null) {
            g2.f43342z = buffer;
            g2.f43340A = true;
            return g2;
        }
        throw new IllegalStateException("already attached to a buffer");
    }

    public static final byte[] b() {
        return f43467a;
    }

    public static final boolean c(Segment segment, int i2, byte[] bArr, int i3, int i4) {
        Intrinsics.i(segment, "segment");
        Intrinsics.i(bArr, "bytes");
        int i5 = segment.f43434c;
        byte[] bArr2 = segment.f43432a;
        while (i3 < i4) {
            if (i2 == i5) {
                segment = segment.f43437f;
                Intrinsics.f(segment);
                byte[] bArr3 = segment.f43432a;
                int i6 = segment.f43433b;
                bArr2 = bArr3;
                i2 = i6;
                i5 = segment.f43434c;
            }
            if (bArr2[i2] != bArr[i3]) {
                return false;
            }
            i2++;
            i3++;
        }
        return true;
    }

    public static final String d(okio.Buffer buffer, long j2) {
        Intrinsics.i(buffer, "<this>");
        if (j2 > 0) {
            long j3 = j2 - 1;
            if (buffer.r(j3) == 13) {
                String M = buffer.M(j3);
                buffer.skip(2);
                return M;
            }
        }
        String M2 = buffer.M(j2);
        buffer.skip(1);
        return M2;
    }

    public static final int e(okio.Buffer buffer, Options options, boolean z2) {
        int i2;
        int i3;
        int i4;
        Segment segment;
        int i5;
        okio.Buffer buffer2 = buffer;
        Intrinsics.i(buffer2, "<this>");
        Intrinsics.i(options, "options");
        Segment segment2 = buffer2.f43339z;
        if (segment2 == null) {
            return z2 ? -2 : -1;
        }
        byte[] bArr = segment2.f43432a;
        int i6 = segment2.f43433b;
        int i7 = segment2.f43434c;
        int[] o2 = options.o();
        Segment segment3 = segment2;
        int i8 = -1;
        int i9 = 0;
        loop0:
        while (true) {
            int i10 = i9 + 1;
            int i11 = o2[i9];
            int i12 = i9 + 2;
            int i13 = o2[i10];
            if (i13 != -1) {
                i8 = i13;
            }
            if (segment3 == null) {
                break;
            }
            if (i11 < 0) {
                int i14 = i12 + (i11 * -1);
                while (true) {
                    int i15 = i6 + 1;
                    int i16 = i12 + 1;
                    if ((bArr[i6] & 255) != o2[i12]) {
                        return i8;
                    }
                    boolean z3 = i16 == i14;
                    if (i15 == i7) {
                        Intrinsics.f(segment3);
                        Segment segment4 = segment3.f43437f;
                        Intrinsics.f(segment4);
                        i5 = segment4.f43433b;
                        byte[] bArr2 = segment4.f43432a;
                        i4 = segment4.f43434c;
                        if (segment4 == segment2) {
                            if (!z3) {
                                break loop0;
                            }
                            bArr = bArr2;
                            segment = null;
                        } else {
                            byte[] bArr3 = bArr2;
                            segment = segment4;
                            bArr = bArr3;
                        }
                    } else {
                        segment = segment3;
                        i4 = i7;
                        i5 = i15;
                    }
                    if (z3) {
                        i3 = o2[i16];
                        i2 = i5;
                        i7 = i4;
                        segment3 = segment;
                        break;
                    }
                    i6 = i5;
                    i7 = i4;
                    segment3 = segment;
                    i12 = i16;
                }
            } else {
                i2 = i6 + 1;
                byte b2 = bArr[i6] & 255;
                int i17 = i12 + i11;
                while (i12 != i17) {
                    if (b2 == o2[i12]) {
                        i3 = o2[i12 + i11];
                        if (i2 == i7) {
                            segment3 = segment3.f43437f;
                            Intrinsics.f(segment3);
                            i2 = segment3.f43433b;
                            bArr = segment3.f43432a;
                            i7 = segment3.f43434c;
                            if (segment3 == segment2) {
                                segment3 = null;
                            }
                        }
                    } else {
                        i12++;
                    }
                }
                return i8;
            }
            if (i3 >= 0) {
                return i3;
            }
            i9 = -i3;
            i6 = i2;
        }
        if (z2) {
            return -2;
        }
        return i8;
    }

    public static /* synthetic */ int f(okio.Buffer buffer, Options options, boolean z2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        return e(buffer, options, z2);
    }
}
