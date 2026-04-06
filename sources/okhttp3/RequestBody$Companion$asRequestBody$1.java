package okhttp3;

import java.io.File;
import kotlin.Metadata;

@Metadata
public final class RequestBody$Companion$asRequestBody$1 extends RequestBody {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ MediaType f42762b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ File f42763c;

    public long a() {
        return this.f42763c.length();
    }

    public MediaType b() {
        return this.f42762b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0019, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0015, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0016, code lost:
        kotlin.io.CloseableKt.a(r0, r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void h(okio.BufferedSink r3) {
        /*
            r2 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.Intrinsics.i(r3, r0)
            java.io.File r0 = r2.f42763c
            okio.Source r0 = okio.Okio.j(r0)
            r3.P0(r0)     // Catch:{ all -> 0x0013 }
            r3 = 0
            kotlin.io.CloseableKt.a(r0, r3)
            return
        L_0x0013:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x0015 }
        L_0x0015:
            r1 = move-exception
            kotlin.io.CloseableKt.a(r0, r3)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.RequestBody$Companion$asRequestBody$1.h(okio.BufferedSink):void");
    }
}
