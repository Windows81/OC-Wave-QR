package retrofit2;

import java.util.regex.Pattern;
import okhttp3.FormBody;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.Request;
import okhttp3.RequestBody;
import okio.Buffer;
import okio.BufferedSink;

final class RequestBuilder {

    /* renamed from: l  reason: collision with root package name */
    public static final char[] f44222l = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: m  reason: collision with root package name */
    public static final Pattern f44223m = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");

    /* renamed from: a  reason: collision with root package name */
    public final String f44224a;

    /* renamed from: b  reason: collision with root package name */
    public final HttpUrl f44225b;

    /* renamed from: c  reason: collision with root package name */
    public String f44226c;

    /* renamed from: d  reason: collision with root package name */
    public HttpUrl.Builder f44227d;

    /* renamed from: e  reason: collision with root package name */
    public final Request.Builder f44228e = new Request.Builder();

    /* renamed from: f  reason: collision with root package name */
    public final Headers.Builder f44229f;

    /* renamed from: g  reason: collision with root package name */
    public MediaType f44230g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f44231h;

    /* renamed from: i  reason: collision with root package name */
    public MultipartBody.Builder f44232i;

    /* renamed from: j  reason: collision with root package name */
    public FormBody.Builder f44233j;

    /* renamed from: k  reason: collision with root package name */
    public RequestBody f44234k;

    public static class ContentTypeOverridingRequestBody extends RequestBody {

        /* renamed from: b  reason: collision with root package name */
        public final RequestBody f44235b;

        /* renamed from: c  reason: collision with root package name */
        public final MediaType f44236c;

        public ContentTypeOverridingRequestBody(RequestBody requestBody, MediaType mediaType) {
            this.f44235b = requestBody;
            this.f44236c = mediaType;
        }

        public long a() {
            return this.f44235b.a();
        }

        public MediaType b() {
            return this.f44236c;
        }

        public void h(BufferedSink bufferedSink) {
            this.f44235b.h(bufferedSink);
        }
    }

    public RequestBuilder(String str, HttpUrl httpUrl, String str2, Headers headers, MediaType mediaType, boolean z2, boolean z3, boolean z4) {
        this.f44224a = str;
        this.f44225b = httpUrl;
        this.f44226c = str2;
        this.f44230g = mediaType;
        this.f44231h = z2;
        if (headers != null) {
            this.f44229f = headers.i();
        } else {
            this.f44229f = new Headers.Builder();
        }
        if (z3) {
            this.f44233j = new FormBody.Builder();
        } else if (z4) {
            MultipartBody.Builder builder = new MultipartBody.Builder();
            this.f44232i = builder;
            builder.d(MultipartBody.f42692l);
        }
    }

    public static String i(String str, boolean z2) {
        int length = str.length();
        int i2 = 0;
        while (i2 < length) {
            int codePointAt = str.codePointAt(i2);
            if (codePointAt < 32 || codePointAt >= 127 || " \"<>^`{}|\\?#".indexOf(codePointAt) != -1 || (!z2 && (codePointAt == 47 || codePointAt == 37))) {
                Buffer buffer = new Buffer();
                buffer.H1(str, 0, i2);
                j(buffer, str, i2, length, z2);
                return buffer.e0();
            }
            i2 += Character.charCount(codePointAt);
        }
        return str;
    }

    public static void j(Buffer buffer, String str, int i2, int i3, boolean z2) {
        Buffer buffer2 = null;
        while (i2 < i3) {
            int codePointAt = str.codePointAt(i2);
            if (!z2 || !(codePointAt == 9 || codePointAt == 10 || codePointAt == 12 || codePointAt == 13)) {
                if (codePointAt < 32 || codePointAt >= 127 || " \"<>^`{}|\\?#".indexOf(codePointAt) != -1 || (!z2 && (codePointAt == 47 || codePointAt == 37))) {
                    if (buffer2 == null) {
                        buffer2 = new Buffer();
                    }
                    buffer2.I1(codePointAt);
                    while (!buffer2.l0()) {
                        byte readByte = buffer2.readByte();
                        buffer.writeByte(37);
                        char[] cArr = f44222l;
                        buffer.writeByte(cArr[((readByte & 255) >> 4) & 15]);
                        buffer.writeByte(cArr[readByte & 15]);
                    }
                } else {
                    buffer.I1(codePointAt);
                }
            }
            i2 += Character.charCount(codePointAt);
        }
    }

    public void a(String str, String str2, boolean z2) {
        if (z2) {
            this.f44233j.b(str, str2);
        } else {
            this.f44233j.a(str, str2);
        }
    }

    public void b(String str, String str2, boolean z2) {
        if ("Content-Type".equalsIgnoreCase(str)) {
            try {
                this.f44230g = MediaType.e(str2);
            } catch (IllegalArgumentException e2) {
                throw new IllegalArgumentException("Malformed content type: " + str2, e2);
            }
        } else if (z2) {
            this.f44229f.e(str, str2);
        } else {
            this.f44229f.a(str, str2);
        }
    }

    public void c(Headers headers) {
        this.f44229f.b(headers);
    }

    public void d(Headers headers, RequestBody requestBody) {
        this.f44232i.a(headers, requestBody);
    }

    public void e(MultipartBody.Part part) {
        this.f44232i.b(part);
    }

    public void f(String str, String str2, boolean z2) {
        if (this.f44226c != null) {
            String i2 = i(str2, z2);
            String str3 = this.f44226c;
            String replace = str3.replace("{" + str + "}", i2);
            if (!f44223m.matcher(replace).matches()) {
                this.f44226c = replace;
                return;
            }
            throw new IllegalArgumentException("@Path parameters shouldn't perform path traversal ('.' or '..'): " + str2);
        }
        throw new AssertionError();
    }

    public void g(String str, String str2, boolean z2) {
        String str3 = this.f44226c;
        if (str3 != null) {
            HttpUrl.Builder l2 = this.f44225b.l(str3);
            this.f44227d = l2;
            if (l2 != null) {
                this.f44226c = null;
            } else {
                throw new IllegalArgumentException("Malformed URL. Base: " + this.f44225b + ", Relative: " + this.f44226c);
            }
        }
        if (z2) {
            this.f44227d.a(str, str2);
        } else {
            this.f44227d.b(str, str2);
        }
    }

    public void h(Class cls, Object obj) {
        this.f44228e.h(cls, obj);
    }

    public Request.Builder k() {
        HttpUrl httpUrl;
        HttpUrl.Builder builder = this.f44227d;
        if (builder != null) {
            httpUrl = builder.c();
        } else {
            httpUrl = this.f44225b.r(this.f44226c);
            if (httpUrl == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + this.f44225b + ", Relative: " + this.f44226c);
            }
        }
        ContentTypeOverridingRequestBody contentTypeOverridingRequestBody = this.f44234k;
        if (contentTypeOverridingRequestBody == null) {
            FormBody.Builder builder2 = this.f44233j;
            if (builder2 != null) {
                contentTypeOverridingRequestBody = builder2.c();
            } else {
                MultipartBody.Builder builder3 = this.f44232i;
                if (builder3 != null) {
                    contentTypeOverridingRequestBody = builder3.c();
                } else if (this.f44231h) {
                    contentTypeOverridingRequestBody = RequestBody.e((MediaType) null, new byte[0]);
                }
            }
        }
        MediaType mediaType = this.f44230g;
        if (mediaType != null) {
            if (contentTypeOverridingRequestBody != null) {
                contentTypeOverridingRequestBody = new ContentTypeOverridingRequestBody(contentTypeOverridingRequestBody, mediaType);
            } else {
                this.f44229f.a("Content-Type", mediaType.toString());
            }
        }
        return this.f44228e.k(httpUrl).e(this.f44229f.f()).f(this.f44224a, contentTypeOverridingRequestBody);
    }

    public void l(RequestBody requestBody) {
        this.f44234k = requestBody;
    }

    public void m(Object obj) {
        this.f44226c = obj.toString();
    }
}
