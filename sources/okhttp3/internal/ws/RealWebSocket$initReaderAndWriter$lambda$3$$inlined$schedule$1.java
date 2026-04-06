package okhttp3.internal.ws;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.internal.concurrent.Task;

@Metadata
public final class RealWebSocket$initReaderAndWriter$lambda$3$$inlined$schedule$1 extends Task {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ RealWebSocket f43279e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ long f43280f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RealWebSocket$initReaderAndWriter$lambda$3$$inlined$schedule$1(String str, RealWebSocket realWebSocket, long j2) {
        super(str, false, 2, (DefaultConstructorMarker) null);
        this.f43279e = realWebSocket;
        this.f43280f = j2;
    }

    public long f() {
        this.f43279e.u();
        return this.f43280f;
    }
}
