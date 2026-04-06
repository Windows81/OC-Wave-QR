package okhttp3.internal.ws;

import java.io.Closeable;
import java.util.zip.Inflater;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okio.Buffer;
import okio.InflaterSource;
import okio.Source;

@Metadata
public final class MessageInflater implements Closeable {

    /* renamed from: A  reason: collision with root package name */
    public final Buffer f43250A;

    /* renamed from: B  reason: collision with root package name */
    public final Inflater f43251B;
    public final InflaterSource C;

    /* renamed from: z  reason: collision with root package name */
    public final boolean f43252z;

    public MessageInflater(boolean z2) {
        this.f43252z = z2;
        Buffer buffer = new Buffer();
        this.f43250A = buffer;
        Inflater inflater = new Inflater(true);
        this.f43251B = inflater;
        this.C = new InflaterSource((Source) buffer, inflater);
    }

    public final void a(Buffer buffer) {
        Intrinsics.i(buffer, "buffer");
        if (this.f43250A.n0() == 0) {
            if (this.f43252z) {
                this.f43251B.reset();
            }
            this.f43250A.P0(buffer);
            this.f43250A.writeInt(65535);
            long bytesRead = this.f43251B.getBytesRead() + this.f43250A.n0();
            do {
                this.C.a(buffer, Long.MAX_VALUE);
            } while (this.f43251B.getBytesRead() < bytesRead);
            return;
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    public void close() {
        this.C.close();
    }
}
