package okio;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public abstract class ForwardingSource implements Source {

    /* renamed from: z  reason: collision with root package name */
    public final Source f43381z;

    public ForwardingSource(Source source) {
        Intrinsics.i(source, "delegate");
        this.f43381z = source;
    }

    public final Source a() {
        return this.f43381z;
    }

    public void close() {
        this.f43381z.close();
    }

    public long o1(Buffer buffer, long j2) {
        Intrinsics.i(buffer, "sink");
        return this.f43381z.o1(buffer, j2);
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.f43381z + ')';
    }

    public Timeout u() {
        return this.f43381z.u();
    }
}
