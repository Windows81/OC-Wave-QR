package okio;

import java.io.OutputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class OutputStreamSink implements Sink {

    /* renamed from: A  reason: collision with root package name */
    public final Timeout f43402A;

    /* renamed from: z  reason: collision with root package name */
    public final OutputStream f43403z;

    public OutputStreamSink(OutputStream outputStream, Timeout timeout) {
        Intrinsics.i(outputStream, "out");
        Intrinsics.i(timeout, "timeout");
        this.f43403z = outputStream;
        this.f43402A = timeout;
    }

    public void N0(Buffer buffer, long j2) {
        Intrinsics.i(buffer, "source");
        SegmentedByteString.b(buffer.n0(), 0, j2);
        while (j2 > 0) {
            this.f43402A.g();
            Segment segment = buffer.f43339z;
            Intrinsics.f(segment);
            int min = (int) Math.min(j2, (long) (segment.f43434c - segment.f43433b));
            this.f43403z.write(segment.f43432a, segment.f43433b, min);
            segment.f43433b += min;
            long j3 = (long) min;
            j2 -= j3;
            buffer.m0(buffer.n0() - j3);
            if (segment.f43433b == segment.f43434c) {
                buffer.f43339z = segment.b();
                SegmentPool.b(segment);
            }
        }
    }

    public void close() {
        this.f43403z.close();
    }

    public void flush() {
        this.f43403z.flush();
    }

    public String toString() {
        return "sink(" + this.f43403z + ')';
    }

    public Timeout u() {
        return this.f43402A;
    }
}
