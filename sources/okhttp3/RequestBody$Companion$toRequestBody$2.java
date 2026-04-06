package okhttp3;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okio.BufferedSink;

@Metadata
public final class RequestBody$Companion$toRequestBody$2 extends RequestBody {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ MediaType f42766b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f42767c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ byte[] f42768d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ int f42769e;

    public RequestBody$Companion$toRequestBody$2(MediaType mediaType, int i2, byte[] bArr, int i3) {
        this.f42766b = mediaType;
        this.f42767c = i2;
        this.f42768d = bArr;
        this.f42769e = i3;
    }

    public long a() {
        return (long) this.f42767c;
    }

    public MediaType b() {
        return this.f42766b;
    }

    public void h(BufferedSink bufferedSink) {
        Intrinsics.i(bufferedSink, "sink");
        bufferedSink.write(this.f42768d, this.f42769e, this.f42767c);
    }
}
