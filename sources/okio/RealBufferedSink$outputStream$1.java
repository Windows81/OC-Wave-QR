package okio;

import java.io.IOException;
import java.io.OutputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class RealBufferedSink$outputStream$1 extends OutputStream {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ RealBufferedSink f43426z;

    public RealBufferedSink$outputStream$1(RealBufferedSink realBufferedSink) {
        this.f43426z = realBufferedSink;
    }

    public void close() {
        this.f43426z.close();
    }

    public void flush() {
        RealBufferedSink realBufferedSink = this.f43426z;
        if (!realBufferedSink.f43424B) {
            realBufferedSink.flush();
        }
    }

    public String toString() {
        return this.f43426z + ".outputStream()";
    }

    public void write(int i2) {
        RealBufferedSink realBufferedSink = this.f43426z;
        if (!realBufferedSink.f43424B) {
            realBufferedSink.f43423A.writeByte((byte) i2);
            this.f43426z.u0();
            return;
        }
        throw new IOException("closed");
    }

    public void write(byte[] bArr, int i2, int i3) {
        Intrinsics.i(bArr, "data");
        RealBufferedSink realBufferedSink = this.f43426z;
        if (!realBufferedSink.f43424B) {
            realBufferedSink.f43423A.write(bArr, i2, i3);
            this.f43426z.u0();
            return;
        }
        throw new IOException("closed");
    }
}
