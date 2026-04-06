package okhttp3.internal.http2;

import java.io.IOException;
import kotlin.Metadata;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.platform.Platform;

@Metadata
public final class Http2Connection$ReaderRunnable$headers$lambda$2$$inlined$execute$default$1 extends Task {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Http2Connection f43070e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Http2Stream f43071f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Http2Connection$ReaderRunnable$headers$lambda$2$$inlined$execute$default$1(String str, boolean z2, Http2Connection http2Connection, Http2Stream http2Stream) {
        super(str, z2);
        this.f43070e = http2Connection;
        this.f43071f = http2Stream;
    }

    public long f() {
        try {
            this.f43070e.O().c(this.f43071f);
            return -1;
        } catch (IOException e2) {
            Platform g2 = Platform.f43200a.g();
            g2.k("Http2Connection.Listener failure for " + this.f43070e.I(), 4, e2);
            try {
                this.f43071f.d(ErrorCode.PROTOCOL_ERROR, e2);
                return -1;
            } catch (IOException unused) {
                return -1;
            }
        }
    }
}
