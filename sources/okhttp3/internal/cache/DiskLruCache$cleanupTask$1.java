package okhttp3.internal.cache;

import kotlin.Metadata;
import okhttp3.internal.concurrent.Task;

@Metadata
public final class DiskLruCache$cleanupTask$1 extends Task {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ DiskLruCache f42853e;

    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r0.Q = true;
        r0.I = okio.Okio.c(okio.Okio.b());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003b, code lost:
        return -1;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0019 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x002a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long f() {
        /*
            r5 = this;
            okhttp3.internal.cache.DiskLruCache r0 = r5.f42853e
            monitor-enter(r0)
            boolean r1 = r0.N     // Catch:{ all -> 0x0017 }
            r2 = -1
            if (r1 == 0) goto L_0x003a
            boolean r1 = r0.A()     // Catch:{ all -> 0x0017 }
            if (r1 == 0) goto L_0x0012
            goto L_0x003a
        L_0x0012:
            r1 = 1
            r0.c0()     // Catch:{ IOException -> 0x0019 }
            goto L_0x001c
        L_0x0017:
            r1 = move-exception
            goto L_0x003c
        L_0x0019:
            r0.P = r1     // Catch:{ all -> 0x0017 }
        L_0x001c:
            boolean r4 = r0.G()     // Catch:{ IOException -> 0x002a }
            if (r4 == 0) goto L_0x0038
            r0.Q()     // Catch:{ IOException -> 0x002a }
            r4 = 0
            r0.K = r4     // Catch:{ IOException -> 0x002a }
            goto L_0x0038
        L_0x002a:
            r0.Q = r1     // Catch:{ all -> 0x0017 }
            okio.Sink r1 = okio.Okio.b()     // Catch:{ all -> 0x0017 }
            okio.BufferedSink r1 = okio.Okio.c(r1)     // Catch:{ all -> 0x0017 }
            r0.I = r1     // Catch:{ all -> 0x0017 }
        L_0x0038:
            monitor-exit(r0)
            return r2
        L_0x003a:
            monitor-exit(r0)
            return r2
        L_0x003c:
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache.DiskLruCache$cleanupTask$1.f():long");
    }
}
