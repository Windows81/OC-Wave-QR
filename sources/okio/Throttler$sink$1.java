package okio;

import java.io.InterruptedIOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class Throttler$sink$1 extends ForwardingSink {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Throttler f43451A;

    public void N0(Buffer buffer, long j2) {
        Intrinsics.i(buffer, "source");
        while (j2 > 0) {
            try {
                long d2 = this.f43451A.d(j2);
                super.N0(buffer, d2);
                j2 -= d2;
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                throw new InterruptedIOException("interrupted");
            }
        }
    }
}
