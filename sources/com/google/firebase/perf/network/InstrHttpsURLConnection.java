package com.google.firebase.perf.network;

import com.google.firebase.perf.metrics.NetworkRequestMetricBuilder;
import com.google.firebase.perf.util.Timer;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.security.Permission;
import java.security.Principal;
import java.security.cert.Certificate;
import java.util.Map;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

public final class InstrHttpsURLConnection extends HttpsURLConnection {

    /* renamed from: a  reason: collision with root package name */
    public final InstrURLConnectionBase f31015a;

    /* renamed from: b  reason: collision with root package name */
    public final HttpsURLConnection f31016b;

    public InstrHttpsURLConnection(HttpsURLConnection httpsURLConnection, Timer timer, NetworkRequestMetricBuilder networkRequestMetricBuilder) {
        super(httpsURLConnection.getURL());
        this.f31016b = httpsURLConnection;
        this.f31015a = new InstrURLConnectionBase(httpsURLConnection, timer, networkRequestMetricBuilder);
    }

    public void addRequestProperty(String str, String str2) {
        this.f31015a.a(str, str2);
    }

    public void connect() {
        this.f31015a.b();
    }

    public void disconnect() {
        this.f31015a.c();
    }

    public boolean equals(Object obj) {
        return this.f31015a.equals(obj);
    }

    public boolean getAllowUserInteraction() {
        return this.f31015a.d();
    }

    public String getCipherSuite() {
        return this.f31016b.getCipherSuite();
    }

    public int getConnectTimeout() {
        return this.f31015a.e();
    }

    public Object getContent() {
        return this.f31015a.f();
    }

    public String getContentEncoding() {
        return this.f31015a.h();
    }

    public int getContentLength() {
        return this.f31015a.i();
    }

    public long getContentLengthLong() {
        return this.f31015a.j();
    }

    public String getContentType() {
        return this.f31015a.k();
    }

    public long getDate() {
        return this.f31015a.l();
    }

    public boolean getDefaultUseCaches() {
        return this.f31015a.m();
    }

    public boolean getDoInput() {
        return this.f31015a.n();
    }

    public boolean getDoOutput() {
        return this.f31015a.o();
    }

    public InputStream getErrorStream() {
        return this.f31015a.p();
    }

    public long getExpiration() {
        return this.f31015a.q();
    }

    public String getHeaderField(int i2) {
        return this.f31015a.r(i2);
    }

    public long getHeaderFieldDate(String str, long j2) {
        return this.f31015a.t(str, j2);
    }

    public int getHeaderFieldInt(String str, int i2) {
        return this.f31015a.u(str, i2);
    }

    public String getHeaderFieldKey(int i2) {
        return this.f31015a.v(i2);
    }

    public long getHeaderFieldLong(String str, long j2) {
        return this.f31015a.w(str, j2);
    }

    public Map getHeaderFields() {
        return this.f31015a.x();
    }

    public HostnameVerifier getHostnameVerifier() {
        return this.f31016b.getHostnameVerifier();
    }

    public long getIfModifiedSince() {
        return this.f31015a.y();
    }

    public InputStream getInputStream() {
        return this.f31015a.z();
    }

    public boolean getInstanceFollowRedirects() {
        return this.f31015a.A();
    }

    public long getLastModified() {
        return this.f31015a.B();
    }

    public Certificate[] getLocalCertificates() {
        return this.f31016b.getLocalCertificates();
    }

    public Principal getLocalPrincipal() {
        return this.f31016b.getLocalPrincipal();
    }

    public OutputStream getOutputStream() {
        return this.f31015a.C();
    }

    public Principal getPeerPrincipal() {
        return this.f31016b.getPeerPrincipal();
    }

    public Permission getPermission() {
        return this.f31015a.D();
    }

    public int getReadTimeout() {
        return this.f31015a.E();
    }

    public String getRequestMethod() {
        return this.f31015a.F();
    }

    public Map getRequestProperties() {
        return this.f31015a.G();
    }

    public String getRequestProperty(String str) {
        return this.f31015a.H(str);
    }

    public int getResponseCode() {
        return this.f31015a.I();
    }

    public String getResponseMessage() {
        return this.f31015a.J();
    }

    public SSLSocketFactory getSSLSocketFactory() {
        return this.f31016b.getSSLSocketFactory();
    }

    public Certificate[] getServerCertificates() {
        return this.f31016b.getServerCertificates();
    }

    public URL getURL() {
        return this.f31015a.K();
    }

    public boolean getUseCaches() {
        return this.f31015a.L();
    }

    public int hashCode() {
        return this.f31015a.hashCode();
    }

    public void setAllowUserInteraction(boolean z2) {
        this.f31015a.M(z2);
    }

    public void setChunkedStreamingMode(int i2) {
        this.f31015a.N(i2);
    }

    public void setConnectTimeout(int i2) {
        this.f31015a.O(i2);
    }

    public void setDefaultUseCaches(boolean z2) {
        this.f31015a.P(z2);
    }

    public void setDoInput(boolean z2) {
        this.f31015a.Q(z2);
    }

    public void setDoOutput(boolean z2) {
        this.f31015a.R(z2);
    }

    public void setFixedLengthStreamingMode(int i2) {
        this.f31015a.S(i2);
    }

    public void setHostnameVerifier(HostnameVerifier hostnameVerifier) {
        this.f31016b.setHostnameVerifier(hostnameVerifier);
    }

    public void setIfModifiedSince(long j2) {
        this.f31015a.U(j2);
    }

    public void setInstanceFollowRedirects(boolean z2) {
        this.f31015a.V(z2);
    }

    public void setReadTimeout(int i2) {
        this.f31015a.W(i2);
    }

    public void setRequestMethod(String str) {
        this.f31015a.X(str);
    }

    public void setRequestProperty(String str, String str2) {
        this.f31015a.Y(str, str2);
    }

    public void setSSLSocketFactory(SSLSocketFactory sSLSocketFactory) {
        this.f31016b.setSSLSocketFactory(sSLSocketFactory);
    }

    public void setUseCaches(boolean z2) {
        this.f31015a.Z(z2);
    }

    public String toString() {
        return this.f31015a.toString();
    }

    public boolean usingProxy() {
        return this.f31015a.b0();
    }

    public Object getContent(Class[] clsArr) {
        return this.f31015a.g(clsArr);
    }

    public String getHeaderField(String str) {
        return this.f31015a.s(str);
    }

    public void setFixedLengthStreamingMode(long j2) {
        this.f31015a.T(j2);
    }
}
