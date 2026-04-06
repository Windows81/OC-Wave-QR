package okhttp3.internal.http2;

import java.io.IOException;
import kotlin.Metadata;
import okhttp3.internal.concurrent.Task;

@Metadata
public final class Http2Connection$writeSynResetLater$$inlined$execute$default$1 extends Task {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Http2Connection f43096e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f43097f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ ErrorCode f43098g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Http2Connection$writeSynResetLater$$inlined$execute$default$1(String str, boolean z2, Http2Connection http2Connection, int i2, ErrorCode errorCode) {
        super(str, z2);
        this.f43096e = http2Connection;
        this.f43097f = i2;
        this.f43098g = errorCode;
    }

    public long f() {
        try {
            this.f43096e.w1(this.f43097f, this.f43098g);
            return -1;
        } catch (IOException e2) {
            this.f43096e.G(e2);
            return -1;
        }
    }
}
