package com.google.firebase.perf.network;

import com.google.firebase.perf.logging.AndroidLogger;
import com.google.firebase.perf.metrics.NetworkRequestMetricBuilder;
import com.google.firebase.perf.util.Timer;
import com.lokalise.sdk.api.Params;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.Permission;
import java.util.Map;

class InstrURLConnectionBase {

    /* renamed from: f  reason: collision with root package name */
    public static final AndroidLogger f31017f = AndroidLogger.e();

    /* renamed from: a  reason: collision with root package name */
    public final HttpURLConnection f31018a;

    /* renamed from: b  reason: collision with root package name */
    public final NetworkRequestMetricBuilder f31019b;

    /* renamed from: c  reason: collision with root package name */
    public long f31020c = -1;

    /* renamed from: d  reason: collision with root package name */
    public long f31021d = -1;

    /* renamed from: e  reason: collision with root package name */
    public final Timer f31022e;

    public InstrURLConnectionBase(HttpURLConnection httpURLConnection, Timer timer, NetworkRequestMetricBuilder networkRequestMetricBuilder) {
        this.f31018a = httpURLConnection;
        this.f31019b = networkRequestMetricBuilder;
        this.f31022e = timer;
        networkRequestMetricBuilder.u(httpURLConnection.getURL().toString());
    }

    public boolean A() {
        return this.f31018a.getInstanceFollowRedirects();
    }

    public long B() {
        a0();
        return this.f31018a.getLastModified();
    }

    public OutputStream C() {
        try {
            OutputStream outputStream = this.f31018a.getOutputStream();
            return outputStream != null ? new InstrHttpOutputStream(outputStream, this.f31019b, this.f31022e) : outputStream;
        } catch (IOException e2) {
            this.f31019b.s(this.f31022e.c());
            NetworkRequestMetricBuilderUtil.d(this.f31019b);
            throw e2;
        }
    }

    public Permission D() {
        try {
            return this.f31018a.getPermission();
        } catch (IOException e2) {
            this.f31019b.s(this.f31022e.c());
            NetworkRequestMetricBuilderUtil.d(this.f31019b);
            throw e2;
        }
    }

    public int E() {
        return this.f31018a.getReadTimeout();
    }

    public String F() {
        return this.f31018a.getRequestMethod();
    }

    public Map G() {
        return this.f31018a.getRequestProperties();
    }

    public String H(String str) {
        return this.f31018a.getRequestProperty(str);
    }

    public int I() {
        a0();
        if (this.f31021d == -1) {
            long c2 = this.f31022e.c();
            this.f31021d = c2;
            this.f31019b.t(c2);
        }
        try {
            int responseCode = this.f31018a.getResponseCode();
            this.f31019b.k(responseCode);
            return responseCode;
        } catch (IOException e2) {
            this.f31019b.s(this.f31022e.c());
            NetworkRequestMetricBuilderUtil.d(this.f31019b);
            throw e2;
        }
    }

    public String J() {
        a0();
        if (this.f31021d == -1) {
            long c2 = this.f31022e.c();
            this.f31021d = c2;
            this.f31019b.t(c2);
        }
        try {
            String responseMessage = this.f31018a.getResponseMessage();
            this.f31019b.k(this.f31018a.getResponseCode());
            return responseMessage;
        } catch (IOException e2) {
            this.f31019b.s(this.f31022e.c());
            NetworkRequestMetricBuilderUtil.d(this.f31019b);
            throw e2;
        }
    }

    public URL K() {
        return this.f31018a.getURL();
    }

    public boolean L() {
        return this.f31018a.getUseCaches();
    }

    public void M(boolean z2) {
        this.f31018a.setAllowUserInteraction(z2);
    }

    public void N(int i2) {
        this.f31018a.setChunkedStreamingMode(i2);
    }

    public void O(int i2) {
        this.f31018a.setConnectTimeout(i2);
    }

    public void P(boolean z2) {
        this.f31018a.setDefaultUseCaches(z2);
    }

    public void Q(boolean z2) {
        this.f31018a.setDoInput(z2);
    }

    public void R(boolean z2) {
        this.f31018a.setDoOutput(z2);
    }

    public void S(int i2) {
        this.f31018a.setFixedLengthStreamingMode(i2);
    }

    public void T(long j2) {
        this.f31018a.setFixedLengthStreamingMode(j2);
    }

    public void U(long j2) {
        this.f31018a.setIfModifiedSince(j2);
    }

    public void V(boolean z2) {
        this.f31018a.setInstanceFollowRedirects(z2);
    }

    public void W(int i2) {
        this.f31018a.setReadTimeout(i2);
    }

    public void X(String str) {
        this.f31018a.setRequestMethod(str);
    }

    public void Y(String str, String str2) {
        if (Params.Headers.USER_AGENT.equalsIgnoreCase(str)) {
            this.f31019b.v(str2);
        }
        this.f31018a.setRequestProperty(str, str2);
    }

    public void Z(boolean z2) {
        this.f31018a.setUseCaches(z2);
    }

    public void a(String str, String str2) {
        this.f31018a.addRequestProperty(str, str2);
    }

    public final void a0() {
        if (this.f31020c == -1) {
            this.f31022e.g();
            long e2 = this.f31022e.e();
            this.f31020c = e2;
            this.f31019b.o(e2);
        }
        String F = F();
        if (F != null) {
            this.f31019b.j(F);
        } else if (o()) {
            this.f31019b.j("POST");
        } else {
            this.f31019b.j("GET");
        }
    }

    public void b() {
        if (this.f31020c == -1) {
            this.f31022e.g();
            long e2 = this.f31022e.e();
            this.f31020c = e2;
            this.f31019b.o(e2);
        }
        try {
            this.f31018a.connect();
        } catch (IOException e3) {
            this.f31019b.s(this.f31022e.c());
            NetworkRequestMetricBuilderUtil.d(this.f31019b);
            throw e3;
        }
    }

    public boolean b0() {
        return this.f31018a.usingProxy();
    }

    public void c() {
        this.f31019b.s(this.f31022e.c());
        this.f31019b.b();
        this.f31018a.disconnect();
    }

    public boolean d() {
        return this.f31018a.getAllowUserInteraction();
    }

    public int e() {
        return this.f31018a.getConnectTimeout();
    }

    public boolean equals(Object obj) {
        return this.f31018a.equals(obj);
    }

    public Object f() {
        a0();
        this.f31019b.k(this.f31018a.getResponseCode());
        try {
            Object content = this.f31018a.getContent();
            if (content instanceof InputStream) {
                this.f31019b.p(this.f31018a.getContentType());
                return new InstrHttpInputStream((InputStream) content, this.f31019b, this.f31022e);
            }
            this.f31019b.p(this.f31018a.getContentType());
            this.f31019b.q((long) this.f31018a.getContentLength());
            this.f31019b.s(this.f31022e.c());
            this.f31019b.b();
            return content;
        } catch (IOException e2) {
            this.f31019b.s(this.f31022e.c());
            NetworkRequestMetricBuilderUtil.d(this.f31019b);
            throw e2;
        }
    }

    public Object g(Class[] clsArr) {
        a0();
        this.f31019b.k(this.f31018a.getResponseCode());
        try {
            Object content = this.f31018a.getContent(clsArr);
            if (content instanceof InputStream) {
                this.f31019b.p(this.f31018a.getContentType());
                return new InstrHttpInputStream((InputStream) content, this.f31019b, this.f31022e);
            }
            this.f31019b.p(this.f31018a.getContentType());
            this.f31019b.q((long) this.f31018a.getContentLength());
            this.f31019b.s(this.f31022e.c());
            this.f31019b.b();
            return content;
        } catch (IOException e2) {
            this.f31019b.s(this.f31022e.c());
            NetworkRequestMetricBuilderUtil.d(this.f31019b);
            throw e2;
        }
    }

    public String h() {
        a0();
        return this.f31018a.getContentEncoding();
    }

    public int hashCode() {
        return this.f31018a.hashCode();
    }

    public int i() {
        a0();
        return this.f31018a.getContentLength();
    }

    public long j() {
        a0();
        return this.f31018a.getContentLengthLong();
    }

    public String k() {
        a0();
        return this.f31018a.getContentType();
    }

    public long l() {
        a0();
        return this.f31018a.getDate();
    }

    public boolean m() {
        return this.f31018a.getDefaultUseCaches();
    }

    public boolean n() {
        return this.f31018a.getDoInput();
    }

    public boolean o() {
        return this.f31018a.getDoOutput();
    }

    public InputStream p() {
        a0();
        try {
            this.f31019b.k(this.f31018a.getResponseCode());
        } catch (IOException unused) {
            f31017f.a("IOException thrown trying to obtain the response code");
        }
        InputStream errorStream = this.f31018a.getErrorStream();
        return errorStream != null ? new InstrHttpInputStream(errorStream, this.f31019b, this.f31022e) : errorStream;
    }

    public long q() {
        a0();
        return this.f31018a.getExpiration();
    }

    public String r(int i2) {
        a0();
        return this.f31018a.getHeaderField(i2);
    }

    public String s(String str) {
        a0();
        return this.f31018a.getHeaderField(str);
    }

    public long t(String str, long j2) {
        a0();
        return this.f31018a.getHeaderFieldDate(str, j2);
    }

    public String toString() {
        return this.f31018a.toString();
    }

    public int u(String str, int i2) {
        a0();
        return this.f31018a.getHeaderFieldInt(str, i2);
    }

    public String v(int i2) {
        a0();
        return this.f31018a.getHeaderFieldKey(i2);
    }

    public long w(String str, long j2) {
        a0();
        return this.f31018a.getHeaderFieldLong(str, j2);
    }

    public Map x() {
        a0();
        return this.f31018a.getHeaderFields();
    }

    public long y() {
        return this.f31018a.getIfModifiedSince();
    }

    public InputStream z() {
        a0();
        this.f31019b.k(this.f31018a.getResponseCode());
        this.f31019b.p(this.f31018a.getContentType());
        try {
            InputStream inputStream = this.f31018a.getInputStream();
            return inputStream != null ? new InstrHttpInputStream(inputStream, this.f31019b, this.f31022e) : inputStream;
        } catch (IOException e2) {
            this.f31019b.s(this.f31022e.c());
            NetworkRequestMetricBuilderUtil.d(this.f31019b);
            throw e2;
        }
    }
}
