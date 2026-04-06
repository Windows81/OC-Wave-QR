package okhttp3.internal.http2;

import kotlin.Metadata;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.http2.Http2Connection;

@Metadata
public final class Http2Connection$ReaderRunnable$settings$$inlined$execute$default$1 extends Task {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Http2Connection.ReaderRunnable f43075e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ boolean f43076f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Settings f43077g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Http2Connection$ReaderRunnable$settings$$inlined$execute$default$1(String str, boolean z2, Http2Connection.ReaderRunnable readerRunnable, boolean z3, Settings settings) {
        super(str, z2);
        this.f43075e = readerRunnable;
        this.f43076f = z3;
        this.f43077g = settings;
    }

    public long f() {
        this.f43075e.s(this.f43076f, this.f43077g);
        return -1;
    }
}
