package okhttp3.internal.http2;

import kotlin.Metadata;
import kotlin.Unit;
import okhttp3.internal.concurrent.Task;

@Metadata
public final class Http2Connection$pushResetLater$$inlined$execute$default$1 extends Task {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Http2Connection f43090e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f43091f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ ErrorCode f43092g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Http2Connection$pushResetLater$$inlined$execute$default$1(String str, boolean z2, Http2Connection http2Connection, int i2, ErrorCode errorCode) {
        super(str, z2);
        this.f43090e = http2Connection;
        this.f43091f = i2;
        this.f43092g = errorCode;
    }

    public long f() {
        this.f43090e.K.c(this.f43091f, this.f43092g);
        synchronized (this.f43090e) {
            this.f43090e.a0.remove(Integer.valueOf(this.f43091f));
            Unit unit = Unit.f40552a;
        }
        return -1;
    }
}
