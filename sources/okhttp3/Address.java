package okhttp3;

import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import okhttp3.internal.Util;

@Metadata
public final class Address {

    /* renamed from: a  reason: collision with root package name */
    public final Dns f42485a;

    /* renamed from: b  reason: collision with root package name */
    public final SocketFactory f42486b;

    /* renamed from: c  reason: collision with root package name */
    public final SSLSocketFactory f42487c;

    /* renamed from: d  reason: collision with root package name */
    public final HostnameVerifier f42488d;

    /* renamed from: e  reason: collision with root package name */
    public final CertificatePinner f42489e;

    /* renamed from: f  reason: collision with root package name */
    public final Authenticator f42490f;

    /* renamed from: g  reason: collision with root package name */
    public final Proxy f42491g;

    /* renamed from: h  reason: collision with root package name */
    public final ProxySelector f42492h;

    /* renamed from: i  reason: collision with root package name */
    public final HttpUrl f42493i;

    /* renamed from: j  reason: collision with root package name */
    public final List f42494j;

    /* renamed from: k  reason: collision with root package name */
    public final List f42495k;

    public Address(String str, int i2, Dns dns, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, CertificatePinner certificatePinner, Authenticator authenticator, Proxy proxy, List list, List list2, ProxySelector proxySelector) {
        Intrinsics.i(str, "uriHost");
        Intrinsics.i(dns, "dns");
        Intrinsics.i(socketFactory, "socketFactory");
        Intrinsics.i(authenticator, "proxyAuthenticator");
        Intrinsics.i(list, "protocols");
        Intrinsics.i(list2, "connectionSpecs");
        Intrinsics.i(proxySelector, "proxySelector");
        this.f42485a = dns;
        this.f42486b = socketFactory;
        this.f42487c = sSLSocketFactory;
        this.f42488d = hostnameVerifier;
        this.f42489e = certificatePinner;
        this.f42490f = authenticator;
        this.f42491g = proxy;
        this.f42492h = proxySelector;
        this.f42493i = new HttpUrl.Builder().s(sSLSocketFactory != null ? "https" : "http").h(str).n(i2).c();
        this.f42494j = Util.V(list);
        this.f42495k = Util.V(list2);
    }

    public final CertificatePinner a() {
        return this.f42489e;
    }

    public final List b() {
        return this.f42495k;
    }

    public final Dns c() {
        return this.f42485a;
    }

    public final boolean d(Address address) {
        Intrinsics.i(address, "that");
        return Intrinsics.d(this.f42485a, address.f42485a) && Intrinsics.d(this.f42490f, address.f42490f) && Intrinsics.d(this.f42494j, address.f42494j) && Intrinsics.d(this.f42495k, address.f42495k) && Intrinsics.d(this.f42492h, address.f42492h) && Intrinsics.d(this.f42491g, address.f42491g) && Intrinsics.d(this.f42487c, address.f42487c) && Intrinsics.d(this.f42488d, address.f42488d) && Intrinsics.d(this.f42489e, address.f42489e) && this.f42493i.o() == address.f42493i.o();
    }

    public final HostnameVerifier e() {
        return this.f42488d;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Address) {
            Address address = (Address) obj;
            return Intrinsics.d(this.f42493i, address.f42493i) && d(address);
        }
    }

    public final List f() {
        return this.f42494j;
    }

    public final Proxy g() {
        return this.f42491g;
    }

    public final Authenticator h() {
        return this.f42490f;
    }

    public int hashCode() {
        return ((((((((((((((((((527 + this.f42493i.hashCode()) * 31) + this.f42485a.hashCode()) * 31) + this.f42490f.hashCode()) * 31) + this.f42494j.hashCode()) * 31) + this.f42495k.hashCode()) * 31) + this.f42492h.hashCode()) * 31) + Objects.hashCode(this.f42491g)) * 31) + Objects.hashCode(this.f42487c)) * 31) + Objects.hashCode(this.f42488d)) * 31) + Objects.hashCode(this.f42489e);
    }

    public final ProxySelector i() {
        return this.f42492h;
    }

    public final SocketFactory j() {
        return this.f42486b;
    }

    public final SSLSocketFactory k() {
        return this.f42487c;
    }

    public final HttpUrl l() {
        return this.f42493i;
    }

    public String toString() {
        StringBuilder sb;
        Object obj;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Address{");
        sb2.append(this.f42493i.i());
        sb2.append(':');
        sb2.append(this.f42493i.o());
        sb2.append(", ");
        if (this.f42491g != null) {
            sb = new StringBuilder();
            sb.append("proxy=");
            obj = this.f42491g;
        } else {
            sb = new StringBuilder();
            sb.append("proxySelector=");
            obj = this.f42492h;
        }
        sb.append(obj);
        sb2.append(sb.toString());
        sb2.append('}');
        return sb2.toString();
    }
}
