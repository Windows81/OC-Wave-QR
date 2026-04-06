package com.google.firebase.perf.network;

import com.google.firebase.perf.metrics.NetworkRequestMetricBuilder;
import com.google.firebase.perf.util.Timer;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.Permission;
import java.util.Map;

public final class InstrHttpURLConnection extends HttpURLConnection {

    /* renamed from: a  reason: collision with root package name */
    public final InstrURLConnectionBase f31014a;

    public InstrHttpURLConnection(HttpURLConnection httpURLConnection, Timer timer, NetworkRequestMetricBuilder networkRequestMetricBuilder) {
        super(httpURLConnection.getURL());
        this.f31014a = new InstrURLConnectionBase(httpURLConnection, timer, networkRequestMetricBuilder);
    }

    public void addRequestProperty(String str, String str2) {
        this.f31014a.a(str, str2);
    }

    public void connect() {
        this.f31014a.b();
    }

    public void disconnect() {
        this.f31014a.c();
    }

    public boolean equals(Object obj) {
        return this.f31014a.equals(obj);
    }

    public boolean getAllowUserInteraction() {
        return this.f31014a.d();
    }

    public int getConnectTimeout() {
        return this.f31014a.e();
    }

    public Object getContent() {
        return this.f31014a.f();
    }

    public String getContentEncoding() {
        return this.f31014a.h();
    }

    public int getContentLength() {
        return this.f31014a.i();
    }

    public long getContentLengthLong() {
        return this.f31014a.j();
    }

    public String getContentType() {
        return this.f31014a.k();
    }

    public long getDate() {
        return this.f31014a.l();
    }

    public boolean getDefaultUseCaches() {
        return this.f31014a.m();
    }

    public boolean getDoInput() {
        return this.f31014a.n();
    }

    public boolean getDoOutput() {
        return this.f31014a.o();
    }

    public InputStream getErrorStream() {
        return this.f31014a.p();
    }

    public long getExpiration() {
        return this.f31014a.q();
    }

    public String getHeaderField(int i2) {
        return this.f31014a.r(i2);
    }

    public long getHeaderFieldDate(String str, long j2) {
        return this.f31014a.t(str, j2);
    }

    public int getHeaderFieldInt(String str, int i2) {
        return this.f31014a.u(str, i2);
    }

    public String getHeaderFieldKey(int i2) {
        return this.f31014a.v(i2);
    }

    public long getHeaderFieldLong(String str, long j2) {
        return this.f31014a.w(str, j2);
    }

    public Map getHeaderFields() {
        return this.f31014a.x();
    }

    public long getIfModifiedSince() {
        return this.f31014a.y();
    }

    public InputStream getInputStream() {
        return this.f31014a.z();
    }

    public boolean getInstanceFollowRedirects() {
        return this.f31014a.A();
    }

    public long getLastModified() {
        return this.f31014a.B();
    }

    public OutputStream getOutputStream() {
        return this.f31014a.C();
    }

    public Permission getPermission() {
        return this.f31014a.D();
    }

    public int getReadTimeout() {
        return this.f31014a.E();
    }

    public String getRequestMethod() {
        return this.f31014a.F();
    }

    public Map getRequestProperties() {
        return this.f31014a.G();
    }

    public String getRequestProperty(String str) {
        return this.f31014a.H(str);
    }

    public int getResponseCode() {
        return this.f31014a.I();
    }

    public String getResponseMessage() {
        return this.f31014a.J();
    }

    public URL getURL() {
        return this.f31014a.K();
    }

    public boolean getUseCaches() {
        return this.f31014a.L();
    }

    public int hashCode() {
        return this.f31014a.hashCode();
    }

    public void setAllowUserInteraction(boolean z2) {
        this.f31014a.M(z2);
    }

    public void setChunkedStreamingMode(int i2) {
        this.f31014a.N(i2);
    }

    public void setConnectTimeout(int i2) {
        this.f31014a.O(i2);
    }

    public void setDefaultUseCaches(boolean z2) {
        this.f31014a.P(z2);
    }

    public void setDoInput(boolean z2) {
        this.f31014a.Q(z2);
    }

    public void setDoOutput(boolean z2) {
        this.f31014a.R(z2);
    }

    public void setFixedLengthStreamingMode(int i2) {
        this.f31014a.S(i2);
    }

    public void setIfModifiedSince(long j2) {
        this.f31014a.U(j2);
    }

    public void setInstanceFollowRedirects(boolean z2) {
        this.f31014a.V(z2);
    }

    public void setReadTimeout(int i2) {
        this.f31014a.W(i2);
    }

    public void setRequestMethod(String str) {
        this.f31014a.X(str);
    }

    public void setRequestProperty(String str, String str2) {
        this.f31014a.Y(str, str2);
    }

    public void setUseCaches(boolean z2) {
        this.f31014a.Z(z2);
    }

    public String toString() {
        return this.f31014a.toString();
    }

    public boolean usingProxy() {
        return this.f31014a.b0();
    }

    public Object getContent(Class[] clsArr) {
        return this.f31014a.g(clsArr);
    }

    public String getHeaderField(String str) {
        return this.f31014a.s(str);
    }

    public void setFixedLengthStreamingMode(long j2) {
        this.f31014a.T(j2);
    }
}
