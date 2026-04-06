package okio;

import java.io.IOException;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class RealBufferedSource$inputStream$1 extends InputStream {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ RealBufferedSource f43430z;

    public RealBufferedSource$inputStream$1(RealBufferedSource realBufferedSource) {
        this.f43430z = realBufferedSource;
    }

    public int available() {
        RealBufferedSource realBufferedSource = this.f43430z;
        if (!realBufferedSource.f43428B) {
            return (int) Math.min(realBufferedSource.f43427A.n0(), (long) Integer.MAX_VALUE);
        }
        throw new IOException("closed");
    }

    public void close() {
        this.f43430z.close();
    }

    public int read() {
        RealBufferedSource realBufferedSource = this.f43430z;
        if (!realBufferedSource.f43428B) {
            if (realBufferedSource.f43427A.n0() == 0) {
                RealBufferedSource realBufferedSource2 = this.f43430z;
                if (realBufferedSource2.f43429z.o1(realBufferedSource2.f43427A, 8192) == -1) {
                    return -1;
                }
            }
            return this.f43430z.f43427A.readByte() & 255;
        }
        throw new IOException("closed");
    }

    public String toString() {
        return this.f43430z + ".inputStream()";
    }

    public int read(byte[] bArr, int i2, int i3) {
        Intrinsics.i(bArr, "data");
        if (!this.f43430z.f43428B) {
            SegmentedByteString.b((long) bArr.length, (long) i2, (long) i3);
            if (this.f43430z.f43427A.n0() == 0) {
                RealBufferedSource realBufferedSource = this.f43430z;
                if (realBufferedSource.f43429z.o1(realBufferedSource.f43427A, 8192) == -1) {
                    return -1;
                }
            }
            return this.f43430z.f43427A.read(bArr, i2, i3);
        }
        throw new IOException("closed");
    }
}
