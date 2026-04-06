package okio;

import java.io.InputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class Buffer$inputStream$1 extends InputStream {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Buffer f43343z;

    public Buffer$inputStream$1(Buffer buffer) {
        this.f43343z = buffer;
    }

    public int available() {
        return (int) Math.min(this.f43343z.n0(), (long) Integer.MAX_VALUE);
    }

    public void close() {
    }

    public int read() {
        if (this.f43343z.n0() > 0) {
            return this.f43343z.readByte() & 255;
        }
        return -1;
    }

    public String toString() {
        return this.f43343z + ".inputStream()";
    }

    public int read(byte[] bArr, int i2, int i3) {
        Intrinsics.i(bArr, "sink");
        return this.f43343z.read(bArr, i2, i3);
    }
}
