package okhttp3.internal.http2;

import java.io.IOException;
import kotlin.Metadata;
import okhttp3.internal.concurrent.Task;

@Metadata
public final class Http2Connection$writeWindowUpdateLater$$inlined$execute$default$1 extends Task {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Http2Connection f43099e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f43100f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ long f43101g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Http2Connection$writeWindowUpdateLater$$inlined$execute$default$1(String str, boolean z2, Http2Connection http2Connection, int i2, long j2) {
        super(str, z2);
        this.f43099e = http2Connection;
        this.f43100f = i2;
        this.f43101g = j2;
    }

    public long f() {
        try {
            this.f43099e.f0().x(this.f43100f, this.f43101g);
            return -1;
        } catch (IOException e2) {
            this.f43099e.G(e2);
            return -1;
        }
    }
}
