package okhttp3;

import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.Util;

@Metadata
public final class Handshake {

    /* renamed from: e  reason: collision with root package name */
    public static final Companion f42646e = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final TlsVersion f42647a;

    /* renamed from: b  reason: collision with root package name */
    public final CipherSuite f42648b;

    /* renamed from: c  reason: collision with root package name */
    public final List f42649c;

    /* renamed from: d  reason: collision with root package name */
    public final Lazy f42650d;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Handshake a(SSLSession sSLSession) {
            List list;
            Intrinsics.i(sSLSession, "<this>");
            String cipherSuite = sSLSession.getCipherSuite();
            if (cipherSuite != null) {
                if (!(Intrinsics.d(cipherSuite, "TLS_NULL_WITH_NULL_NULL") ? true : Intrinsics.d(cipherSuite, "SSL_NULL_WITH_NULL_NULL"))) {
                    CipherSuite b2 = CipherSuite.f42567b.b(cipherSuite);
                    String protocol = sSLSession.getProtocol();
                    if (protocol == null) {
                        throw new IllegalStateException("tlsVersion == null");
                    } else if (!Intrinsics.d("NONE", protocol)) {
                        TlsVersion a2 = TlsVersion.f42795A.a(protocol);
                        try {
                            list = c(sSLSession.getPeerCertificates());
                        } catch (SSLPeerUnverifiedException unused) {
                            list = CollectionsKt.m();
                        }
                        return new Handshake(a2, b2, c(sSLSession.getLocalCertificates()), new Handshake$Companion$handshake$1(list));
                    } else {
                        throw new IOException("tlsVersion == NONE");
                    }
                } else {
                    throw new IOException("cipherSuite == " + cipherSuite);
                }
            } else {
                throw new IllegalStateException("cipherSuite == null");
            }
        }

        public final Handshake b(TlsVersion tlsVersion, CipherSuite cipherSuite, List list, List list2) {
            Intrinsics.i(tlsVersion, "tlsVersion");
            Intrinsics.i(cipherSuite, "cipherSuite");
            Intrinsics.i(list, "peerCertificates");
            Intrinsics.i(list2, "localCertificates");
            return new Handshake(tlsVersion, cipherSuite, Util.V(list2), new Handshake$Companion$get$1(Util.V(list)));
        }

        public final List c(Certificate[] certificateArr) {
            return certificateArr != null ? Util.w(Arrays.copyOf(certificateArr, certificateArr.length)) : CollectionsKt.m();
        }

        public Companion() {
        }
    }

    public Handshake(TlsVersion tlsVersion, CipherSuite cipherSuite, List list, Function0 function0) {
        Intrinsics.i(tlsVersion, "tlsVersion");
        Intrinsics.i(cipherSuite, "cipherSuite");
        Intrinsics.i(list, "localCertificates");
        Intrinsics.i(function0, "peerCertificatesFn");
        this.f42647a = tlsVersion;
        this.f42648b = cipherSuite;
        this.f42649c = list;
        this.f42650d = LazyKt.b(new Handshake$peerCertificates$2(function0));
    }

    public final CipherSuite a() {
        return this.f42648b;
    }

    public final String b(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            return ((X509Certificate) certificate).getSubjectDN().toString();
        }
        String type = certificate.getType();
        Intrinsics.h(type, "type");
        return type;
    }

    public final List c() {
        return this.f42649c;
    }

    public final List d() {
        return (List) this.f42650d.getValue();
    }

    public final TlsVersion e() {
        return this.f42647a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Handshake) {
            Handshake handshake = (Handshake) obj;
            return handshake.f42647a == this.f42647a && Intrinsics.d(handshake.f42648b, this.f42648b) && Intrinsics.d(handshake.d(), d()) && Intrinsics.d(handshake.f42649c, this.f42649c);
        }
    }

    public int hashCode() {
        return ((((((527 + this.f42647a.hashCode()) * 31) + this.f42648b.hashCode()) * 31) + d().hashCode()) * 31) + this.f42649c.hashCode();
    }

    public String toString() {
        Iterable<Certificate> d2 = d();
        ArrayList arrayList = new ArrayList(CollectionsKt.x(d2, 10));
        for (Certificate b2 : d2) {
            arrayList.add(b(b2));
        }
        String obj = arrayList.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("Handshake{tlsVersion=");
        sb.append(this.f42647a);
        sb.append(" cipherSuite=");
        sb.append(this.f42648b);
        sb.append(" peerCertificates=");
        sb.append(obj);
        sb.append(" localCertificates=");
        Iterable<Certificate> iterable = this.f42649c;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.x(iterable, 10));
        for (Certificate b3 : iterable) {
            arrayList2.add(b(b3));
        }
        sb.append(arrayList2);
        sb.append('}');
        return sb.toString();
    }
}
