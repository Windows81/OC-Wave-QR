package okio;

import java.io.InterruptedIOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class Throttler$source$1 extends ForwardingSource {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Throttler f43452A;

    public long o1(Buffer buffer, long j2) {
        Intrinsics.i(buffer, "sink");
        try {
            return super.o1(buffer, this.f43452A.d(j2));
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        }
    }
}
