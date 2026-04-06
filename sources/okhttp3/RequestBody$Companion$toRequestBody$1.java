package okhttp3;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okio.BufferedSink;
import okio.ByteString;

@Metadata
public final class RequestBody$Companion$toRequestBody$1 extends RequestBody {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ MediaType f42764b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ ByteString f42765c;

    public RequestBody$Companion$toRequestBody$1(MediaType mediaType, ByteString byteString) {
        this.f42764b = mediaType;
        this.f42765c = byteString;
    }

    public long a() {
        return (long) this.f42765c.N();
    }

    public MediaType b() {
        return this.f42764b;
    }

    public void h(BufferedSink bufferedSink) {
        Intrinsics.i(bufferedSink, "sink");
        bufferedSink.k1(this.f42765c);
    }
}
