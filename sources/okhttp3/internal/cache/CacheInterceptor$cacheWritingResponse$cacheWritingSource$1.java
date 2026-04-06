package okhttp3.internal.cache;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.Util;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.Source;
import okio.Timeout;

@Metadata
public final class CacheInterceptor$cacheWritingResponse$cacheWritingSource$1 implements Source {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ BufferedSource f42811A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ CacheRequest f42812B;
    public final /* synthetic */ BufferedSink C;

    /* renamed from: z  reason: collision with root package name */
    public boolean f42813z;

    public CacheInterceptor$cacheWritingResponse$cacheWritingSource$1(BufferedSource bufferedSource, CacheRequest cacheRequest, BufferedSink bufferedSink) {
        this.f42811A = bufferedSource;
        this.f42812B = cacheRequest;
        this.C = bufferedSink;
    }

    public void close() {
        if (!this.f42813z && !Util.s(this, 100, TimeUnit.MILLISECONDS)) {
            this.f42813z = true;
            this.f42812B.a();
        }
        this.f42811A.close();
    }

    public long o1(Buffer buffer, long j2) {
        Intrinsics.i(buffer, "sink");
        try {
            long o1 = this.f42811A.o1(buffer, j2);
            if (o1 == -1) {
                if (!this.f42813z) {
                    this.f42813z = true;
                    this.C.close();
                }
                return -1;
            }
            buffer.j(this.C.s(), buffer.n0() - o1, o1);
            this.C.u0();
            return o1;
        } catch (IOException e2) {
            if (!this.f42813z) {
                this.f42813z = true;
                this.f42812B.a();
            }
            throw e2;
        }
    }

    public Timeout u() {
        return this.f42811A.u();
    }
}
