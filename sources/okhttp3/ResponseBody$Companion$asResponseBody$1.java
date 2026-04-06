package okhttp3;

import kotlin.Metadata;
import okio.BufferedSource;

@Metadata
public final class ResponseBody$Companion$asResponseBody$1 extends ResponseBody {

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ MediaType f42791B;
    public final /* synthetic */ long C;
    public final /* synthetic */ BufferedSource D;

    public ResponseBody$Companion$asResponseBody$1(MediaType mediaType, long j2, BufferedSource bufferedSource) {
        this.f42791B = mediaType;
        this.C = j2;
        this.D = bufferedSource;
    }

    public long d() {
        return this.C;
    }

    public MediaType f() {
        return this.f42791B;
    }

    public BufferedSource j() {
        return this.D;
    }
}
