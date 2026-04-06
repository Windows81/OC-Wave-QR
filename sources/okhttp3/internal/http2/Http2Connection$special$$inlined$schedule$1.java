package okhttp3.internal.http2;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.internal.concurrent.Task;

@Metadata
public final class Http2Connection$special$$inlined$schedule$1 extends Task {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Http2Connection f43094e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ long f43095f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Http2Connection$special$$inlined$schedule$1(String str, Http2Connection http2Connection, long j2) {
        super(str, false, 2, (DefaultConstructorMarker) null);
        this.f43094e = http2Connection;
        this.f43095f = j2;
    }

    public long f() {
        boolean z2;
        synchronized (this.f43094e) {
            if (this.f43094e.M < this.f43094e.L) {
                z2 = true;
            } else {
                this.f43094e.L = this.f43094e.L + 1;
                z2 = false;
            }
        }
        if (z2) {
            this.f43094e.G((IOException) null);
            return -1;
        }
        this.f43094e.q1(false, 1, 0);
        return this.f43095f;
    }
}
