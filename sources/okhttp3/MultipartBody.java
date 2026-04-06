package okhttp3;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.MediaType;
import okhttp3.internal.Util;
import okio.BufferedSink;
import okio.ByteString;

@Metadata
public final class MultipartBody extends RequestBody {

    /* renamed from: g  reason: collision with root package name */
    public static final Companion f42687g = new Companion((DefaultConstructorMarker) null);

    /* renamed from: h  reason: collision with root package name */
    public static final MediaType f42688h;

    /* renamed from: i  reason: collision with root package name */
    public static final MediaType f42689i;

    /* renamed from: j  reason: collision with root package name */
    public static final MediaType f42690j;

    /* renamed from: k  reason: collision with root package name */
    public static final MediaType f42691k;

    /* renamed from: l  reason: collision with root package name */
    public static final MediaType f42692l;

    /* renamed from: m  reason: collision with root package name */
    public static final byte[] f42693m = {58, 32};

    /* renamed from: n  reason: collision with root package name */
    public static final byte[] f42694n = {13, 10};

    /* renamed from: o  reason: collision with root package name */
    public static final byte[] f42695o = {45, 45};

    /* renamed from: b  reason: collision with root package name */
    public final ByteString f42696b;

    /* renamed from: c  reason: collision with root package name */
    public final MediaType f42697c;

    /* renamed from: d  reason: collision with root package name */
    public final List f42698d;

    /* renamed from: e  reason: collision with root package name */
    public final MediaType f42699e;

    /* renamed from: f  reason: collision with root package name */
    public long f42700f = -1;

    @Metadata
    public static final class Builder {

        /* renamed from: a  reason: collision with root package name */
        public final ByteString f42701a;

        /* renamed from: b  reason: collision with root package name */
        public MediaType f42702b;

        /* renamed from: c  reason: collision with root package name */
        public final List f42703c;

        public Builder() {
            this((String) null, 1, (DefaultConstructorMarker) null);
        }

        public final Builder a(Headers headers, RequestBody requestBody) {
            Intrinsics.i(requestBody, "body");
            b(Part.f42704c.a(headers, requestBody));
            return this;
        }

        public final Builder b(Part part) {
            Intrinsics.i(part, "part");
            this.f42703c.add(part);
            return this;
        }

        public final MultipartBody c() {
            if (!this.f42703c.isEmpty()) {
                return new MultipartBody(this.f42701a, this.f42702b, Util.V(this.f42703c));
            }
            throw new IllegalStateException("Multipart body must have at least one part.");
        }

        public final Builder d(MediaType mediaType) {
            Intrinsics.i(mediaType, "type");
            if (Intrinsics.d(mediaType.g(), "multipart")) {
                this.f42702b = mediaType;
                return this;
            }
            throw new IllegalArgumentException(("multipart != " + mediaType).toString());
        }

        public Builder(String str) {
            Intrinsics.i(str, "boundary");
            this.f42701a = ByteString.C.d(str);
            this.f42702b = MultipartBody.f42688h;
            this.f42703c = new ArrayList();
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ Builder(java.lang.String r1, int r2, kotlin.jvm.internal.DefaultConstructorMarker r3) {
            /*
                r0 = this;
                r2 = r2 & 1
                if (r2 == 0) goto L_0x0011
                java.util.UUID r1 = java.util.UUID.randomUUID()
                java.lang.String r1 = r1.toString()
                java.lang.String r2 = "randomUUID().toString()"
                kotlin.jvm.internal.Intrinsics.h(r1, r2)
            L_0x0011:
                r0.<init>(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.MultipartBody.Builder.<init>(java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }
    }

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    @Metadata
    public static final class Part {

        /* renamed from: c  reason: collision with root package name */
        public static final Companion f42704c = new Companion((DefaultConstructorMarker) null);

        /* renamed from: a  reason: collision with root package name */
        public final Headers f42705a;

        /* renamed from: b  reason: collision with root package name */
        public final RequestBody f42706b;

        @Metadata
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Part a(Headers headers, RequestBody requestBody) {
                Intrinsics.i(requestBody, "body");
                if ((headers != null ? headers.e("Content-Type") : null) == null) {
                    if ((headers != null ? headers.e("Content-Length") : null) == null) {
                        return new Part(headers, requestBody, (DefaultConstructorMarker) null);
                    }
                    throw new IllegalArgumentException("Unexpected header: Content-Length");
                }
                throw new IllegalArgumentException("Unexpected header: Content-Type");
            }

            public Companion() {
            }
        }

        public /* synthetic */ Part(Headers headers, RequestBody requestBody, DefaultConstructorMarker defaultConstructorMarker) {
            this(headers, requestBody);
        }

        public final RequestBody a() {
            return this.f42706b;
        }

        public final Headers b() {
            return this.f42705a;
        }

        public Part(Headers headers, RequestBody requestBody) {
            this.f42705a = headers;
            this.f42706b = requestBody;
        }
    }

    static {
        MediaType.Companion companion = MediaType.f42680e;
        f42688h = companion.a("multipart/mixed");
        f42689i = companion.a("multipart/alternative");
        f42690j = companion.a("multipart/digest");
        f42691k = companion.a("multipart/parallel");
        f42692l = companion.a("multipart/form-data");
    }

    public MultipartBody(ByteString byteString, MediaType mediaType, List list) {
        Intrinsics.i(byteString, "boundaryByteString");
        Intrinsics.i(mediaType, "type");
        Intrinsics.i(list, "parts");
        this.f42696b = byteString;
        this.f42697c = mediaType;
        this.f42698d = list;
        MediaType.Companion companion = MediaType.f42680e;
        this.f42699e = companion.a(mediaType + "; boundary=" + i());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v1, resolved type: okio.BufferedSink} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: okio.Buffer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: okio.Buffer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: okio.BufferedSink} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: okio.Buffer} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final long j(okio.BufferedSink r13, boolean r14) {
        /*
            r12 = this;
            if (r14 == 0) goto L_0x0009
            okio.Buffer r13 = new okio.Buffer
            r13.<init>()
            r0 = r13
            goto L_0x000a
        L_0x0009:
            r0 = 0
        L_0x000a:
            java.util.List r1 = r12.f42698d
            int r1 = r1.size()
            r2 = 0
            r3 = 0
            r5 = r2
        L_0x0014:
            if (r5 >= r1) goto L_0x00ae
            java.util.List r6 = r12.f42698d
            java.lang.Object r6 = r6.get(r5)
            okhttp3.MultipartBody$Part r6 = (okhttp3.MultipartBody.Part) r6
            okhttp3.Headers r7 = r6.b()
            okhttp3.RequestBody r6 = r6.a()
            kotlin.jvm.internal.Intrinsics.f(r13)
            byte[] r8 = f42695o
            r13.write(r8)
            okio.ByteString r8 = r12.f42696b
            r13.k1(r8)
            byte[] r8 = f42694n
            r13.write(r8)
            if (r7 == 0) goto L_0x005f
            int r8 = r7.size()
            r9 = r2
        L_0x003f:
            if (r9 >= r8) goto L_0x005f
            java.lang.String r10 = r7.h(r9)
            okio.BufferedSink r10 = r13.K0(r10)
            byte[] r11 = f42693m
            okio.BufferedSink r10 = r10.write(r11)
            java.lang.String r11 = r7.o(r9)
            okio.BufferedSink r10 = r10.K0(r11)
            byte[] r11 = f42694n
            r10.write(r11)
            int r9 = r9 + 1
            goto L_0x003f
        L_0x005f:
            okhttp3.MediaType r7 = r6.b()
            if (r7 == 0) goto L_0x0078
            java.lang.String r8 = "Content-Type: "
            okio.BufferedSink r8 = r13.K0(r8)
            java.lang.String r7 = r7.toString()
            okio.BufferedSink r7 = r8.K0(r7)
            byte[] r8 = f42694n
            r7.write(r8)
        L_0x0078:
            long r7 = r6.a()
            r9 = -1
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 == 0) goto L_0x0092
            java.lang.String r9 = "Content-Length: "
            okio.BufferedSink r9 = r13.K0(r9)
            okio.BufferedSink r9 = r9.x1(r7)
            byte[] r10 = f42694n
            r9.write(r10)
            goto L_0x009b
        L_0x0092:
            if (r14 == 0) goto L_0x009b
            kotlin.jvm.internal.Intrinsics.f(r0)
            r0.b()
            return r9
        L_0x009b:
            byte[] r9 = f42694n
            r13.write(r9)
            if (r14 == 0) goto L_0x00a4
            long r3 = r3 + r7
            goto L_0x00a7
        L_0x00a4:
            r6.h(r13)
        L_0x00a7:
            r13.write(r9)
            int r5 = r5 + 1
            goto L_0x0014
        L_0x00ae:
            kotlin.jvm.internal.Intrinsics.f(r13)
            byte[] r1 = f42695o
            r13.write(r1)
            okio.ByteString r2 = r12.f42696b
            r13.k1(r2)
            r13.write(r1)
            byte[] r1 = f42694n
            r13.write(r1)
            if (r14 == 0) goto L_0x00d0
            kotlin.jvm.internal.Intrinsics.f(r0)
            long r13 = r0.n0()
            long r3 = r3 + r13
            r0.b()
        L_0x00d0:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.MultipartBody.j(okio.BufferedSink, boolean):long");
    }

    public long a() {
        long j2 = this.f42700f;
        if (j2 != -1) {
            return j2;
        }
        long j3 = j((BufferedSink) null, true);
        this.f42700f = j3;
        return j3;
    }

    public MediaType b() {
        return this.f42699e;
    }

    public void h(BufferedSink bufferedSink) {
        Intrinsics.i(bufferedSink, "sink");
        j(bufferedSink, false);
    }

    public final String i() {
        return this.f42696b.U();
    }
}
