package okhttp3;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.Util;
import okio.Buffer;
import okio.BufferedSource;

@Metadata
public abstract class ResponseBody implements Closeable {

    /* renamed from: A  reason: collision with root package name */
    public static final Companion f42786A = new Companion((DefaultConstructorMarker) null);

    /* renamed from: z  reason: collision with root package name */
    public Reader f42787z;

    @Metadata
    public static final class BomAwareReader extends Reader {

        /* renamed from: A  reason: collision with root package name */
        public final Charset f42788A;

        /* renamed from: B  reason: collision with root package name */
        public boolean f42789B;
        public Reader C;

        /* renamed from: z  reason: collision with root package name */
        public final BufferedSource f42790z;

        public BomAwareReader(BufferedSource bufferedSource, Charset charset) {
            Intrinsics.i(bufferedSource, "source");
            Intrinsics.i(charset, "charset");
            this.f42790z = bufferedSource;
            this.f42788A = charset;
        }

        public void close() {
            Unit unit;
            this.f42789B = true;
            Reader reader = this.C;
            if (reader != null) {
                reader.close();
                unit = Unit.f40552a;
            } else {
                unit = null;
            }
            if (unit == null) {
                this.f42790z.close();
            }
        }

        public int read(char[] cArr, int i2, int i3) {
            Intrinsics.i(cArr, "cbuf");
            if (!this.f42789B) {
                Reader reader = this.C;
                if (reader == null) {
                    reader = new InputStreamReader(this.f42790z.B1(), Util.J(this.f42790z, this.f42788A));
                    this.C = reader;
                }
                return reader.read(cArr, i2, i3);
            }
            throw new IOException("Stream closed");
        }
    }

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ ResponseBody d(Companion companion, byte[] bArr, MediaType mediaType, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                mediaType = null;
            }
            return companion.c(bArr, mediaType);
        }

        public final ResponseBody a(MediaType mediaType, long j2, BufferedSource bufferedSource) {
            Intrinsics.i(bufferedSource, "content");
            return b(bufferedSource, mediaType, j2);
        }

        public final ResponseBody b(BufferedSource bufferedSource, MediaType mediaType, long j2) {
            Intrinsics.i(bufferedSource, "<this>");
            return new ResponseBody$Companion$asResponseBody$1(mediaType, j2, bufferedSource);
        }

        public final ResponseBody c(byte[] bArr, MediaType mediaType) {
            Intrinsics.i(bArr, "<this>");
            return b(new Buffer().write(bArr), mediaType, (long) bArr.length);
        }

        public Companion() {
        }
    }

    public static final ResponseBody g(MediaType mediaType, long j2, BufferedSource bufferedSource) {
        return f42786A.a(mediaType, j2, bufferedSource);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004b, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004c, code lost:
        kotlin.io.CloseableKt.a(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004f, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final byte[] a() {
        /*
            r6 = this;
            long r0 = r6.d()
            r2 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 > 0) goto L_0x0050
            okio.BufferedSource r2 = r6.j()
            byte[] r3 = r2.h0()     // Catch:{ all -> 0x0049 }
            r4 = 0
            kotlin.io.CloseableKt.a(r2, r4)
            int r2 = r3.length
            r4 = -1
            int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r4 == 0) goto L_0x0048
            long r4 = (long) r2
            int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r4 != 0) goto L_0x0024
            goto L_0x0048
        L_0x0024:
            java.io.IOException r3 = new java.io.IOException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Content-Length ("
            r4.append(r5)
            r4.append(r0)
            java.lang.String r0 = ") and stream length ("
            r4.append(r0)
            r4.append(r2)
            java.lang.String r0 = ") disagree"
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            r3.<init>(r0)
            throw r3
        L_0x0048:
            return r3
        L_0x0049:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x004b }
        L_0x004b:
            r1 = move-exception
            kotlin.io.CloseableKt.a(r2, r0)
            throw r1
        L_0x0050:
            java.io.IOException r2 = new java.io.IOException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Cannot buffer entire body for content length: "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.ResponseBody.a():byte[]");
    }

    public final Reader b() {
        Reader reader = this.f42787z;
        if (reader != null) {
            return reader;
        }
        BomAwareReader bomAwareReader = new BomAwareReader(j(), c());
        this.f42787z = bomAwareReader;
        return bomAwareReader;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r0.c(kotlin.text.Charsets.f41118b);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.nio.charset.Charset c() {
        /*
            r2 = this;
            okhttp3.MediaType r0 = r2.f()
            if (r0 == 0) goto L_0x000e
            java.nio.charset.Charset r1 = kotlin.text.Charsets.f41118b
            java.nio.charset.Charset r0 = r0.c(r1)
            if (r0 != 0) goto L_0x0010
        L_0x000e:
            java.nio.charset.Charset r0 = kotlin.text.Charsets.f41118b
        L_0x0010:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.ResponseBody.c():java.nio.charset.Charset");
    }

    public void close() {
        Util.m(j());
    }

    public abstract long d();

    public abstract MediaType f();

    public abstract BufferedSource j();

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001b, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0017, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0018, code lost:
        kotlin.io.CloseableKt.a(r0, r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String k() {
        /*
            r3 = this;
            okio.BufferedSource r0 = r3.j()
            java.nio.charset.Charset r1 = r3.c()     // Catch:{ all -> 0x0015 }
            java.nio.charset.Charset r1 = okhttp3.internal.Util.J(r0, r1)     // Catch:{ all -> 0x0015 }
            java.lang.String r1 = r0.M0(r1)     // Catch:{ all -> 0x0015 }
            r2 = 0
            kotlin.io.CloseableKt.a(r0, r2)
            return r1
        L_0x0015:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0017 }
        L_0x0017:
            r2 = move-exception
            kotlin.io.CloseableKt.a(r0, r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.ResponseBody.k():java.lang.String");
    }
}
