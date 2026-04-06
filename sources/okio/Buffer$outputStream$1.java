package okio;

import java.io.OutputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class Buffer$outputStream$1 extends OutputStream {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Buffer f43344z;

    public Buffer$outputStream$1(Buffer buffer) {
        this.f43344z = buffer;
    }

    public void close() {
    }

    public void flush() {
    }

    public String toString() {
        return this.f43344z + ".outputStream()";
    }

    public void write(int i2) {
        this.f43344z.writeByte(i2);
    }

    public void write(byte[] bArr, int i2, int i3) {
        Intrinsics.i(bArr, "data");
        this.f43344z.write(bArr, i2, i3);
    }
}
