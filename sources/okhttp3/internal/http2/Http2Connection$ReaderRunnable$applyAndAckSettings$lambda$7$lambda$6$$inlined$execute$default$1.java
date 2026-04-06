package okhttp3.internal.http2;

import kotlin.Metadata;
import kotlin.jvm.internal.Ref;
import okhttp3.internal.concurrent.Task;

@Metadata
public final class Http2Connection$ReaderRunnable$applyAndAckSettings$lambda$7$lambda$6$$inlined$execute$default$1 extends Task {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Http2Connection f43068e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f43069f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Http2Connection$ReaderRunnable$applyAndAckSettings$lambda$7$lambda$6$$inlined$execute$default$1(String str, boolean z2, Http2Connection http2Connection, Ref.ObjectRef objectRef) {
        super(str, z2);
        this.f43068e = http2Connection;
        this.f43069f = objectRef;
    }

    public long f() {
        this.f43068e.O().b(this.f43068e, (Settings) this.f43069f.f40908z);
        return -1;
    }
}
