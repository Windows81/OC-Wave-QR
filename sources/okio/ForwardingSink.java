package okio;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public abstract class ForwardingSink implements Sink {

    /* renamed from: z  reason: collision with root package name */
    public final Sink f43380z;

    public ForwardingSink(Sink sink) {
        Intrinsics.i(sink, "delegate");
        this.f43380z = sink;
    }

    public void N0(Buffer buffer, long j2) {
        Intrinsics.i(buffer, "source");
        this.f43380z.N0(buffer, j2);
    }

    public void close() {
        this.f43380z.close();
    }

    public void flush() {
        this.f43380z.flush();
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.f43380z + ')';
    }

    public Timeout u() {
        return this.f43380z.u();
    }
}
