package okhttp3.internal.http2;

import kotlin.Metadata;
import okhttp3.internal.concurrent.Task;

@Metadata
public final class Http2Connection$sendDegradedPingLater$$inlined$execute$default$1 extends Task {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Http2Connection f43093e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Http2Connection$sendDegradedPingLater$$inlined$execute$default$1(String str, boolean z2, Http2Connection http2Connection) {
        super(str, z2);
        this.f43093e = http2Connection;
    }

    public long f() {
        this.f43093e.q1(false, 2, 0);
        return -1;
    }
}
