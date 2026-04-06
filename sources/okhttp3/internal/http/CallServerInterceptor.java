package okhttp3.internal.http;

import kotlin.Metadata;
import okhttp3.Interceptor;

@Metadata
public final class CallServerInterceptor implements Interceptor {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f42981a;

    public CallServerInterceptor(boolean z2) {
        this.f42981a = z2;
    }

    public final boolean a(int i2) {
        if (i2 == 100) {
            return true;
        }
        return 102 <= i2 && i2 < 200;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0097, code lost:
        if (r3.f() == false) goto L_0x0099;
     */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00aa A[SYNTHETIC, Splitter:B:41:0x00aa] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00e5 A[Catch:{ IOException -> 0x00b8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0120 A[Catch:{ IOException -> 0x00b8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x012f A[Catch:{ IOException -> 0x00b8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0169 A[Catch:{ IOException -> 0x00b8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x016e A[Catch:{ IOException -> 0x00b8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0176 A[Catch:{ IOException -> 0x00b8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01ac  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public okhttp3.Response intercept(okhttp3.Interceptor.Chain r14) {
        /*
            r13 = this;
            java.lang.String r0 = "Connection"
            java.lang.String r1 = "close"
            java.lang.String r2 = "chain"
            kotlin.jvm.internal.Intrinsics.i(r14, r2)
            okhttp3.internal.http.RealInterceptorChain r14 = (okhttp3.internal.http.RealInterceptorChain) r14
            okhttp3.internal.connection.Exchange r2 = r14.i()
            kotlin.jvm.internal.Intrinsics.f(r2)
            okhttp3.Request r14 = r14.k()
            okhttp3.RequestBody r3 = r14.a()
            long r4 = java.lang.System.currentTimeMillis()
            r6 = 0
            r7 = 1
            r8 = 0
            r2.w(r14)     // Catch:{ IOException -> 0x004d }
            java.lang.String r9 = r14.h()     // Catch:{ IOException -> 0x004d }
            boolean r9 = okhttp3.internal.http.HttpMethod.b(r9)     // Catch:{ IOException -> 0x004d }
            if (r9 == 0) goto L_0x008c
            if (r3 == 0) goto L_0x008c
            java.lang.String r9 = "100-continue"
            java.lang.String r10 = "Expect"
            java.lang.String r10 = r14.d(r10)     // Catch:{ IOException -> 0x004d }
            boolean r9 = kotlin.text.StringsKt.B(r9, r10, r7)     // Catch:{ IOException -> 0x004d }
            if (r9 == 0) goto L_0x0051
            r2.f()     // Catch:{ IOException -> 0x004d }
            okhttp3.Response$Builder r9 = r2.r(r7)     // Catch:{ IOException -> 0x004d }
            r2.t()     // Catch:{ IOException -> 0x004a }
            r10 = r6
            goto L_0x0053
        L_0x004a:
            r3 = move-exception
            r10 = r7
            goto L_0x009e
        L_0x004d:
            r3 = move-exception
            r10 = r7
            r9 = r8
            goto L_0x009e
        L_0x0051:
            r10 = r7
            r9 = r8
        L_0x0053:
            if (r9 != 0) goto L_0x007b
            boolean r11 = r3.f()     // Catch:{ IOException -> 0x006a }
            if (r11 == 0) goto L_0x006c
            r2.f()     // Catch:{ IOException -> 0x006a }
            okio.Sink r11 = r2.c(r14, r7)     // Catch:{ IOException -> 0x006a }
            okio.BufferedSink r11 = okio.Okio.c(r11)     // Catch:{ IOException -> 0x006a }
            r3.h(r11)     // Catch:{ IOException -> 0x006a }
            goto L_0x0091
        L_0x006a:
            r3 = move-exception
            goto L_0x009e
        L_0x006c:
            okio.Sink r11 = r2.c(r14, r6)     // Catch:{ IOException -> 0x006a }
            okio.BufferedSink r11 = okio.Okio.c(r11)     // Catch:{ IOException -> 0x006a }
            r3.h(r11)     // Catch:{ IOException -> 0x006a }
            r11.close()     // Catch:{ IOException -> 0x006a }
            goto L_0x0091
        L_0x007b:
            r2.p()     // Catch:{ IOException -> 0x006a }
            okhttp3.internal.connection.RealConnection r11 = r2.h()     // Catch:{ IOException -> 0x006a }
            boolean r11 = r11.w()     // Catch:{ IOException -> 0x006a }
            if (r11 != 0) goto L_0x0091
            r2.o()     // Catch:{ IOException -> 0x006a }
            goto L_0x0091
        L_0x008c:
            r2.p()     // Catch:{ IOException -> 0x004d }
            r10 = r7
            r9 = r8
        L_0x0091:
            if (r3 == 0) goto L_0x0099
            boolean r3 = r3.f()     // Catch:{ IOException -> 0x006a }
            if (r3 != 0) goto L_0x009c
        L_0x0099:
            r2.e()     // Catch:{ IOException -> 0x006a }
        L_0x009c:
            r3 = r8
            goto L_0x00a8
        L_0x009e:
            boolean r11 = r3 instanceof okhttp3.internal.http2.ConnectionShutdownException
            if (r11 != 0) goto L_0x01ac
            boolean r11 = r2.k()
            if (r11 == 0) goto L_0x01ab
        L_0x00a8:
            if (r9 != 0) goto L_0x00bb
            okhttp3.Response$Builder r9 = r2.r(r6)     // Catch:{ IOException -> 0x00b8 }
            kotlin.jvm.internal.Intrinsics.f(r9)     // Catch:{ IOException -> 0x00b8 }
            if (r10 == 0) goto L_0x00bb
            r2.t()     // Catch:{ IOException -> 0x00b8 }
            r10 = r6
            goto L_0x00bb
        L_0x00b8:
            r14 = move-exception
            goto L_0x01a4
        L_0x00bb:
            okhttp3.Response$Builder r9 = r9.r(r14)     // Catch:{ IOException -> 0x00b8 }
            okhttp3.internal.connection.RealConnection r11 = r2.h()     // Catch:{ IOException -> 0x00b8 }
            okhttp3.Handshake r11 = r11.s()     // Catch:{ IOException -> 0x00b8 }
            okhttp3.Response$Builder r9 = r9.i(r11)     // Catch:{ IOException -> 0x00b8 }
            okhttp3.Response$Builder r9 = r9.s(r4)     // Catch:{ IOException -> 0x00b8 }
            long r11 = java.lang.System.currentTimeMillis()     // Catch:{ IOException -> 0x00b8 }
            okhttp3.Response$Builder r9 = r9.q(r11)     // Catch:{ IOException -> 0x00b8 }
            okhttp3.Response r9 = r9.c()     // Catch:{ IOException -> 0x00b8 }
            int r11 = r9.f()     // Catch:{ IOException -> 0x00b8 }
            boolean r12 = r13.a(r11)     // Catch:{ IOException -> 0x00b8 }
            if (r12 == 0) goto L_0x0115
            okhttp3.Response$Builder r6 = r2.r(r6)     // Catch:{ IOException -> 0x00b8 }
            kotlin.jvm.internal.Intrinsics.f(r6)     // Catch:{ IOException -> 0x00b8 }
            if (r10 == 0) goto L_0x00f1
            r2.t()     // Catch:{ IOException -> 0x00b8 }
        L_0x00f1:
            okhttp3.Response$Builder r14 = r6.r(r14)     // Catch:{ IOException -> 0x00b8 }
            okhttp3.internal.connection.RealConnection r6 = r2.h()     // Catch:{ IOException -> 0x00b8 }
            okhttp3.Handshake r6 = r6.s()     // Catch:{ IOException -> 0x00b8 }
            okhttp3.Response$Builder r14 = r14.i(r6)     // Catch:{ IOException -> 0x00b8 }
            okhttp3.Response$Builder r14 = r14.s(r4)     // Catch:{ IOException -> 0x00b8 }
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ IOException -> 0x00b8 }
            okhttp3.Response$Builder r14 = r14.q(r4)     // Catch:{ IOException -> 0x00b8 }
            okhttp3.Response r9 = r14.c()     // Catch:{ IOException -> 0x00b8 }
            int r11 = r9.f()     // Catch:{ IOException -> 0x00b8 }
        L_0x0115:
            r2.s(r9)     // Catch:{ IOException -> 0x00b8 }
            boolean r14 = r13.f42981a     // Catch:{ IOException -> 0x00b8 }
            if (r14 == 0) goto L_0x012f
            r14 = 101(0x65, float:1.42E-43)
            if (r11 != r14) goto L_0x012f
            okhttp3.Response$Builder r14 = r9.y()     // Catch:{ IOException -> 0x00b8 }
            okhttp3.ResponseBody r4 = okhttp3.internal.Util.f42800c     // Catch:{ IOException -> 0x00b8 }
            okhttp3.Response$Builder r14 = r14.b(r4)     // Catch:{ IOException -> 0x00b8 }
            okhttp3.Response r14 = r14.c()     // Catch:{ IOException -> 0x00b8 }
            goto L_0x013f
        L_0x012f:
            okhttp3.Response$Builder r14 = r9.y()     // Catch:{ IOException -> 0x00b8 }
            okhttp3.ResponseBody r4 = r2.q(r9)     // Catch:{ IOException -> 0x00b8 }
            okhttp3.Response$Builder r14 = r14.b(r4)     // Catch:{ IOException -> 0x00b8 }
            okhttp3.Response r14 = r14.c()     // Catch:{ IOException -> 0x00b8 }
        L_0x013f:
            okhttp3.Request r4 = r14.E()     // Catch:{ IOException -> 0x00b8 }
            java.lang.String r4 = r4.d(r0)     // Catch:{ IOException -> 0x00b8 }
            boolean r4 = kotlin.text.StringsKt.B(r1, r4, r7)     // Catch:{ IOException -> 0x00b8 }
            if (r4 != 0) goto L_0x0158
            r4 = 2
            java.lang.String r0 = okhttp3.Response.l(r14, r0, r8, r4, r8)     // Catch:{ IOException -> 0x00b8 }
            boolean r0 = kotlin.text.StringsKt.B(r1, r0, r7)     // Catch:{ IOException -> 0x00b8 }
            if (r0 == 0) goto L_0x015b
        L_0x0158:
            r2.o()     // Catch:{ IOException -> 0x00b8 }
        L_0x015b:
            r0 = 204(0xcc, float:2.86E-43)
            if (r11 == r0) goto L_0x0163
            r0 = 205(0xcd, float:2.87E-43)
            if (r11 != r0) goto L_0x01a3
        L_0x0163:
            okhttp3.ResponseBody r0 = r14.a()     // Catch:{ IOException -> 0x00b8 }
            if (r0 == 0) goto L_0x016e
            long r0 = r0.d()     // Catch:{ IOException -> 0x00b8 }
            goto L_0x0170
        L_0x016e:
            r0 = -1
        L_0x0170:
            r4 = 0
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x01a3
            java.net.ProtocolException r0 = new java.net.ProtocolException     // Catch:{ IOException -> 0x00b8 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00b8 }
            r1.<init>()     // Catch:{ IOException -> 0x00b8 }
            java.lang.String r2 = "HTTP "
            r1.append(r2)     // Catch:{ IOException -> 0x00b8 }
            r1.append(r11)     // Catch:{ IOException -> 0x00b8 }
            java.lang.String r2 = " had non-zero Content-Length: "
            r1.append(r2)     // Catch:{ IOException -> 0x00b8 }
            okhttp3.ResponseBody r14 = r14.a()     // Catch:{ IOException -> 0x00b8 }
            if (r14 == 0) goto L_0x0198
            long r4 = r14.d()     // Catch:{ IOException -> 0x00b8 }
            java.lang.Long r8 = java.lang.Long.valueOf(r4)     // Catch:{ IOException -> 0x00b8 }
        L_0x0198:
            r1.append(r8)     // Catch:{ IOException -> 0x00b8 }
            java.lang.String r14 = r1.toString()     // Catch:{ IOException -> 0x00b8 }
            r0.<init>(r14)     // Catch:{ IOException -> 0x00b8 }
            throw r0     // Catch:{ IOException -> 0x00b8 }
        L_0x01a3:
            return r14
        L_0x01a4:
            if (r3 == 0) goto L_0x01aa
            kotlin.ExceptionsKt.a(r3, r14)
            throw r3
        L_0x01aa:
            throw r14
        L_0x01ab:
            throw r3
        L_0x01ac:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http.CallServerInterceptor.intercept(okhttp3.Interceptor$Chain):okhttp3.Response");
    }
}
