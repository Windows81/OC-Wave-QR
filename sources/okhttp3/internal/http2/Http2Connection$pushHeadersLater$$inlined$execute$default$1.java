package okhttp3.internal.http2;

import java.util.List;
import kotlin.Metadata;
import okhttp3.internal.concurrent.Task;

@Metadata
public final class Http2Connection$pushHeadersLater$$inlined$execute$default$1 extends Task {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Http2Connection f43083e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f43084f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ List f43085g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ boolean f43086h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Http2Connection$pushHeadersLater$$inlined$execute$default$1(String str, boolean z2, Http2Connection http2Connection, int i2, List list, boolean z3) {
        super(str, z2);
        this.f43083e = http2Connection;
        this.f43084f = i2;
        this.f43085g = list;
        this.f43086h = z3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        return -1;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long f() {
        /*
            r4 = this;
            okhttp3.internal.http2.Http2Connection r0 = r4.f43083e
            okhttp3.internal.http2.PushObserver r0 = r0.K
            int r1 = r4.f43084f
            java.util.List r2 = r4.f43085g
            boolean r3 = r4.f43086h
            boolean r0 = r0.b(r1, r2, r3)
            if (r0 == 0) goto L_0x001f
            okhttp3.internal.http2.Http2Connection r1 = r4.f43083e     // Catch:{ IOException -> 0x003c }
            okhttp3.internal.http2.Http2Writer r1 = r1.f0()     // Catch:{ IOException -> 0x003c }
            int r2 = r4.f43084f     // Catch:{ IOException -> 0x003c }
            okhttp3.internal.http2.ErrorCode r3 = okhttp3.internal.http2.ErrorCode.CANCEL     // Catch:{ IOException -> 0x003c }
            r1.r(r2, r3)     // Catch:{ IOException -> 0x003c }
        L_0x001f:
            if (r0 != 0) goto L_0x0025
            boolean r0 = r4.f43086h     // Catch:{ IOException -> 0x003c }
            if (r0 == 0) goto L_0x003c
        L_0x0025:
            okhttp3.internal.http2.Http2Connection r0 = r4.f43083e     // Catch:{ IOException -> 0x003c }
            monitor-enter(r0)     // Catch:{ IOException -> 0x003c }
            okhttp3.internal.http2.Http2Connection r1 = r4.f43083e     // Catch:{ all -> 0x0039 }
            java.util.Set r1 = r1.a0     // Catch:{ all -> 0x0039 }
            int r2 = r4.f43084f     // Catch:{ all -> 0x0039 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0039 }
            r1.remove(r2)     // Catch:{ all -> 0x0039 }
            monitor-exit(r0)     // Catch:{ IOException -> 0x003c }
            goto L_0x003c
        L_0x0039:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ IOException -> 0x003c }
            throw r1     // Catch:{ IOException -> 0x003c }
        L_0x003c:
            r0 = -1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2Connection$pushHeadersLater$$inlined$execute$default$1.f():long");
    }
}
