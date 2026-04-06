package okhttp3.internal.http2;

import kotlin.Metadata;
import okhttp3.internal.concurrent.Task;
import okio.Buffer;

@Metadata
public final class Http2Connection$pushDataLater$$inlined$execute$default$1 extends Task {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Http2Connection f43078e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f43079f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Buffer f43080g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ int f43081h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ boolean f43082i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Http2Connection$pushDataLater$$inlined$execute$default$1(String str, boolean z2, Http2Connection http2Connection, int i2, Buffer buffer, int i3, boolean z3) {
        super(str, z2);
        this.f43078e = http2Connection;
        this.f43079f = i2;
        this.f43080g = buffer;
        this.f43081h = i3;
        this.f43082i = z3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        return -1;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long f() {
        /*
            r5 = this;
            okhttp3.internal.http2.Http2Connection r0 = r5.f43078e     // Catch:{ IOException -> 0x003e }
            okhttp3.internal.http2.PushObserver r0 = r0.K     // Catch:{ IOException -> 0x003e }
            int r1 = r5.f43079f     // Catch:{ IOException -> 0x003e }
            okio.Buffer r2 = r5.f43080g     // Catch:{ IOException -> 0x003e }
            int r3 = r5.f43081h     // Catch:{ IOException -> 0x003e }
            boolean r4 = r5.f43082i     // Catch:{ IOException -> 0x003e }
            boolean r0 = r0.d(r1, r2, r3, r4)     // Catch:{ IOException -> 0x003e }
            if (r0 == 0) goto L_0x0021
            okhttp3.internal.http2.Http2Connection r1 = r5.f43078e     // Catch:{ IOException -> 0x003e }
            okhttp3.internal.http2.Http2Writer r1 = r1.f0()     // Catch:{ IOException -> 0x003e }
            int r2 = r5.f43079f     // Catch:{ IOException -> 0x003e }
            okhttp3.internal.http2.ErrorCode r3 = okhttp3.internal.http2.ErrorCode.CANCEL     // Catch:{ IOException -> 0x003e }
            r1.r(r2, r3)     // Catch:{ IOException -> 0x003e }
        L_0x0021:
            if (r0 != 0) goto L_0x0027
            boolean r0 = r5.f43082i     // Catch:{ IOException -> 0x003e }
            if (r0 == 0) goto L_0x003e
        L_0x0027:
            okhttp3.internal.http2.Http2Connection r0 = r5.f43078e     // Catch:{ IOException -> 0x003e }
            monitor-enter(r0)     // Catch:{ IOException -> 0x003e }
            okhttp3.internal.http2.Http2Connection r1 = r5.f43078e     // Catch:{ all -> 0x003b }
            java.util.Set r1 = r1.a0     // Catch:{ all -> 0x003b }
            int r2 = r5.f43079f     // Catch:{ all -> 0x003b }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x003b }
            r1.remove(r2)     // Catch:{ all -> 0x003b }
            monitor-exit(r0)     // Catch:{ IOException -> 0x003e }
            goto L_0x003e
        L_0x003b:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ IOException -> 0x003e }
            throw r1     // Catch:{ IOException -> 0x003e }
        L_0x003e:
            r0 = -1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2Connection$pushDataLater$$inlined$execute$default$1.f():long");
    }
}
