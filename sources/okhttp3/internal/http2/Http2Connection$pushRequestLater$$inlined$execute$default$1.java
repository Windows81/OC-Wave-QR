package okhttp3.internal.http2;

import java.util.List;
import kotlin.Metadata;
import okhttp3.internal.concurrent.Task;

@Metadata
public final class Http2Connection$pushRequestLater$$inlined$execute$default$1 extends Task {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Http2Connection f43087e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f43088f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ List f43089g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Http2Connection$pushRequestLater$$inlined$execute$default$1(String str, boolean z2, Http2Connection http2Connection, int i2, List list) {
        super(str, z2);
        this.f43087e = http2Connection;
        this.f43088f = i2;
        this.f43089g = list;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        return -1;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long f() {
        /*
            r3 = this;
            okhttp3.internal.http2.Http2Connection r0 = r3.f43087e
            okhttp3.internal.http2.PushObserver r0 = r0.K
            int r1 = r3.f43088f
            java.util.List r2 = r3.f43089g
            boolean r0 = r0.a(r1, r2)
            if (r0 == 0) goto L_0x0034
            okhttp3.internal.http2.Http2Connection r0 = r3.f43087e     // Catch:{ IOException -> 0x0034 }
            okhttp3.internal.http2.Http2Writer r0 = r0.f0()     // Catch:{ IOException -> 0x0034 }
            int r1 = r3.f43088f     // Catch:{ IOException -> 0x0034 }
            okhttp3.internal.http2.ErrorCode r2 = okhttp3.internal.http2.ErrorCode.CANCEL     // Catch:{ IOException -> 0x0034 }
            r0.r(r1, r2)     // Catch:{ IOException -> 0x0034 }
            okhttp3.internal.http2.Http2Connection r0 = r3.f43087e     // Catch:{ IOException -> 0x0034 }
            monitor-enter(r0)     // Catch:{ IOException -> 0x0034 }
            okhttp3.internal.http2.Http2Connection r1 = r3.f43087e     // Catch:{ all -> 0x0031 }
            java.util.Set r1 = r1.a0     // Catch:{ all -> 0x0031 }
            int r2 = r3.f43088f     // Catch:{ all -> 0x0031 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0031 }
            r1.remove(r2)     // Catch:{ all -> 0x0031 }
            monitor-exit(r0)     // Catch:{ IOException -> 0x0034 }
            goto L_0x0034
        L_0x0031:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ IOException -> 0x0034 }
            throw r1     // Catch:{ IOException -> 0x0034 }
        L_0x0034:
            r0 = -1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2Connection$pushRequestLater$$inlined$execute$default$1.f():long");
    }
}
