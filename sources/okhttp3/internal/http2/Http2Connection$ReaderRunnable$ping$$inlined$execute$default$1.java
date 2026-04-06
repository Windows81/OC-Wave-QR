package okhttp3.internal.http2;

import kotlin.Metadata;
import okhttp3.internal.concurrent.Task;

@Metadata
public final class Http2Connection$ReaderRunnable$ping$$inlined$execute$default$1 extends Task {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Http2Connection f43072e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f43073f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ int f43074g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Http2Connection$ReaderRunnable$ping$$inlined$execute$default$1(String str, boolean z2, Http2Connection http2Connection, int i2, int i3) {
        super(str, z2);
        this.f43072e = http2Connection;
        this.f43073f = i2;
        this.f43074g = i3;
    }

    public long f() {
        this.f43072e.q1(true, this.f43073f, this.f43074g);
        return -1;
    }
}
