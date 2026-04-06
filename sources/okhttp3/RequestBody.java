package okhttp3;

import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import okhttp3.MediaType;
import okhttp3.internal.Util;
import okio.BufferedSink;
import okio.ByteString;

@Metadata
public abstract class RequestBody {

    /* renamed from: a  reason: collision with root package name */
    public static final Companion f42761a = new Companion((DefaultConstructorMarker) null);

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ RequestBody h(Companion companion, MediaType mediaType, byte[] bArr, int i2, int i3, int i4, Object obj) {
            if ((i4 & 4) != 0) {
                i2 = 0;
            }
            if ((i4 & 8) != 0) {
                i3 = bArr.length;
            }
            return companion.e(mediaType, bArr, i2, i3);
        }

        public static /* synthetic */ RequestBody i(Companion companion, byte[] bArr, MediaType mediaType, int i2, int i3, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                mediaType = null;
            }
            if ((i4 & 2) != 0) {
                i2 = 0;
            }
            if ((i4 & 4) != 0) {
                i3 = bArr.length;
            }
            return companion.g(bArr, mediaType, i2, i3);
        }

        public final RequestBody a(String str, MediaType mediaType) {
            Intrinsics.i(str, "<this>");
            Charset charset = Charsets.f41118b;
            if (mediaType != null) {
                Charset d2 = MediaType.d(mediaType, (Charset) null, 1, (Object) null);
                if (d2 == null) {
                    MediaType.Companion companion = MediaType.f42680e;
                    mediaType = companion.b(mediaType + "; charset=utf-8");
                } else {
                    charset = d2;
                }
            }
            byte[] bytes = str.getBytes(charset);
            Intrinsics.h(bytes, "this as java.lang.String).getBytes(charset)");
            return g(bytes, mediaType, 0, bytes.length);
        }

        public final RequestBody b(MediaType mediaType, String str) {
            Intrinsics.i(str, "content");
            return a(str, mediaType);
        }

        public final RequestBody c(MediaType mediaType, ByteString byteString) {
            Intrinsics.i(byteString, "content");
            return f(byteString, mediaType);
        }

        public final RequestBody d(MediaType mediaType, byte[] bArr) {
            Intrinsics.i(bArr, "content");
            return h(this, mediaType, bArr, 0, 0, 12, (Object) null);
        }

        public final RequestBody e(MediaType mediaType, byte[] bArr, int i2, int i3) {
            Intrinsics.i(bArr, "content");
            return g(bArr, mediaType, i2, i3);
        }

        public final RequestBody f(ByteString byteString, MediaType mediaType) {
            Intrinsics.i(byteString, "<this>");
            return new RequestBody$Companion$toRequestBody$1(mediaType, byteString);
        }

        public final RequestBody g(byte[] bArr, MediaType mediaType, int i2, int i3) {
            Intrinsics.i(bArr, "<this>");
            Util.l((long) bArr.length, (long) i2, (long) i3);
            return new RequestBody$Companion$toRequestBody$2(mediaType, i3, bArr, i2);
        }

        public Companion() {
        }
    }

    public static final RequestBody c(MediaType mediaType, String str) {
        return f42761a.b(mediaType, str);
    }

    public static final RequestBody d(MediaType mediaType, ByteString byteString) {
        return f42761a.c(mediaType, byteString);
    }

    public static final RequestBody e(MediaType mediaType, byte[] bArr) {
        return f42761a.d(mediaType, bArr);
    }

    public long a() {
        return -1;
    }

    public abstract MediaType b();

    public boolean f() {
        return false;
    }

    public boolean g() {
        return false;
    }

    public abstract void h(BufferedSink bufferedSink);
}
