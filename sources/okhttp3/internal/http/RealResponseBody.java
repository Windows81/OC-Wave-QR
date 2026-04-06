package okhttp3.internal.http;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.MediaType;
import okhttp3.ResponseBody;
import okio.BufferedSource;

@Metadata
public final class RealResponseBody extends ResponseBody {

    /* renamed from: B  reason: collision with root package name */
    public final String f42998B;
    public final long C;
    public final BufferedSource D;

    public RealResponseBody(String str, long j2, BufferedSource bufferedSource) {
        Intrinsics.i(bufferedSource, "source");
        this.f42998B = str;
        this.C = j2;
        this.D = bufferedSource;
    }

    public long d() {
        return this.C;
    }

    public MediaType f() {
        String str = this.f42998B;
        if (str != null) {
            return MediaType.f42680e.b(str);
        }
        return null;
    }

    public BufferedSource j() {
        return this.D;
    }
}
