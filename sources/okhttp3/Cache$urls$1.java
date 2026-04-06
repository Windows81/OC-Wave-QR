package okhttp3;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableIterator;

@Metadata
public final class Cache$urls$1 implements Iterator<String>, KMutableIterator {

    /* renamed from: A  reason: collision with root package name */
    public String f42525A;

    /* renamed from: B  reason: collision with root package name */
    public boolean f42526B;

    /* renamed from: z  reason: collision with root package name */
    public final Iterator f42527z;

    /* renamed from: b */
    public String next() {
        if (hasNext()) {
            String str = this.f42525A;
            Intrinsics.f(str);
            this.f42525A = null;
            this.f42526B = true;
            return str;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0031, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0032, code lost:
        continue;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        kotlin.io.CloseableKt.a(r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0035, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        continue;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean hasNext() {
        /*
            r5 = this;
            java.lang.String r0 = r5.f42525A
            r1 = 1
            if (r0 == 0) goto L_0x0006
            return r1
        L_0x0006:
            r0 = 0
            r5.f42526B = r0
        L_0x0009:
            java.util.Iterator r2 = r5.f42527z
            boolean r2 = r2.hasNext()
            if (r2 == 0) goto L_0x0036
            java.util.Iterator r2 = r5.f42527z     // Catch:{ IOException -> 0x0009 }
            java.lang.Object r2 = r2.next()     // Catch:{ IOException -> 0x0009 }
            java.io.Closeable r2 = (java.io.Closeable) r2     // Catch:{ IOException -> 0x0009 }
            r3 = r2
            okhttp3.internal.cache.DiskLruCache$Snapshot r3 = (okhttp3.internal.cache.DiskLruCache.Snapshot) r3     // Catch:{ all -> 0x002f }
            okio.Source r3 = r3.b(r0)     // Catch:{ all -> 0x002f }
            okio.BufferedSource r3 = okio.Okio.d(r3)     // Catch:{ all -> 0x002f }
            java.lang.String r3 = r3.a1()     // Catch:{ all -> 0x002f }
            r5.f42525A = r3     // Catch:{ all -> 0x002f }
            r3 = 0
            kotlin.io.CloseableKt.a(r2, r3)     // Catch:{ IOException -> 0x0009 }
            return r1
        L_0x002f:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x0031 }
        L_0x0031:
            r4 = move-exception
            kotlin.io.CloseableKt.a(r2, r3)     // Catch:{ IOException -> 0x0009 }
            throw r4     // Catch:{ IOException -> 0x0009 }
        L_0x0036:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.Cache$urls$1.hasNext():boolean");
    }

    public void remove() {
        if (this.f42526B) {
            this.f42527z.remove();
            return;
        }
        throw new IllegalStateException("remove() before next()");
    }
}
