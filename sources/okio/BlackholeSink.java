package okio;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class BlackholeSink implements Sink {
    public void N0(Buffer buffer, long j2) {
        Intrinsics.i(buffer, "source");
        buffer.skip(j2);
    }

    public void close() {
    }

    public void flush() {
    }

    public Timeout u() {
        return Timeout.f43454f;
    }
}
