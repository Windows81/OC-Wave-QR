package okhttp3;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.text.StringsKt;
import okhttp3.internal.tls.CertificateChainCleaner;
import okio.ByteString;

@Metadata
public final class CertificatePinner {

    /* renamed from: c  reason: collision with root package name */
    public static final Companion f42552c = new Companion((DefaultConstructorMarker) null);

    /* renamed from: d  reason: collision with root package name */
    public static final CertificatePinner f42553d = new Builder().a();

    /* renamed from: a  reason: collision with root package name */
    public final Set f42554a;

    /* renamed from: b  reason: collision with root package name */
    public final CertificateChainCleaner f42555b;

    @Metadata
    public static final class Builder {

        /* renamed from: a  reason: collision with root package name */
        public final List f42556a = new ArrayList();

        public final CertificatePinner a() {
            return new CertificatePinner(CollectionsKt.R0(this.f42556a), (CertificateChainCleaner) null, 2, (DefaultConstructorMarker) null);
        }
    }

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a(Certificate certificate) {
            Intrinsics.i(certificate, "certificate");
            if (certificate instanceof X509Certificate) {
                return "sha256/" + c((X509Certificate) certificate).d();
            }
            throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
        }

        public final ByteString b(X509Certificate x509Certificate) {
            Intrinsics.i(x509Certificate, "<this>");
            ByteString.Companion companion = ByteString.C;
            byte[] encoded = x509Certificate.getPublicKey().getEncoded();
            Intrinsics.h(encoded, "publicKey.encoded");
            return ByteString.Companion.f(companion, encoded, 0, 0, 3, (Object) null).I();
        }

        public final ByteString c(X509Certificate x509Certificate) {
            Intrinsics.i(x509Certificate, "<this>");
            ByteString.Companion companion = ByteString.C;
            byte[] encoded = x509Certificate.getPublicKey().getEncoded();
            Intrinsics.h(encoded, "publicKey.encoded");
            return ByteString.Companion.f(companion, encoded, 0, 0, 3, (Object) null).M();
        }

        public Companion() {
        }
    }

    @Metadata
    public static final class Pin {

        /* renamed from: a  reason: collision with root package name */
        public final String f42557a;

        /* renamed from: b  reason: collision with root package name */
        public final String f42558b;

        /* renamed from: c  reason: collision with root package name */
        public final ByteString f42559c;

        public final ByteString a() {
            return this.f42559c;
        }

        public final String b() {
            return this.f42558b;
        }

        public final boolean c(String str) {
            Intrinsics.i(str, "hostname");
            if (StringsKt.Q(this.f42557a, "**.", false, 2, (Object) null)) {
                int length = this.f42557a.length() - 3;
                int length2 = str.length() - length;
                if (!StringsKt.F(str, str.length() - length, this.f42557a, 3, length, false, 16, (Object) null)) {
                    return false;
                }
                if (!(length2 == 0 || str.charAt(length2 - 1) == '.')) {
                    return false;
                }
            } else if (!StringsKt.Q(this.f42557a, "*.", false, 2, (Object) null)) {
                return Intrinsics.d(str, this.f42557a);
            } else {
                int length3 = this.f42557a.length() - 1;
                int length4 = str.length() - length3;
                if (!StringsKt.F(str, str.length() - length3, this.f42557a, 1, length3, false, 16, (Object) null)) {
                    return false;
                }
                if (StringsKt.p0(str, '.', length4 - 1, false, 4, (Object) null) != -1) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Pin)) {
                return false;
            }
            Pin pin = (Pin) obj;
            return Intrinsics.d(this.f42557a, pin.f42557a) && Intrinsics.d(this.f42558b, pin.f42558b) && Intrinsics.d(this.f42559c, pin.f42559c);
        }

        public int hashCode() {
            return (((this.f42557a.hashCode() * 31) + this.f42558b.hashCode()) * 31) + this.f42559c.hashCode();
        }

        public String toString() {
            return this.f42558b + '/' + this.f42559c.d();
        }
    }

    public CertificatePinner(Set set, CertificateChainCleaner certificateChainCleaner) {
        Intrinsics.i(set, "pins");
        this.f42554a = set;
        this.f42555b = certificateChainCleaner;
    }

    public final void a(String str, List list) {
        Intrinsics.i(str, "hostname");
        Intrinsics.i(list, "peerCertificates");
        b(str, new CertificatePinner$check$1(this, list, str));
    }

    public final void b(String str, Function0 function0) {
        Intrinsics.i(str, "hostname");
        Intrinsics.i(function0, "cleanedPeerCertificatesFn");
        List<Pin> c2 = c(str);
        if (!c2.isEmpty()) {
            List<X509Certificate> list = (List) function0.invoke();
            for (X509Certificate x509Certificate : list) {
                Iterator it = c2.iterator();
                ByteString byteString = null;
                ByteString byteString2 = null;
                while (true) {
                    if (it.hasNext()) {
                        Pin pin = (Pin) it.next();
                        String b2 = pin.b();
                        if (Intrinsics.d(b2, "sha256")) {
                            if (byteString == null) {
                                byteString = f42552c.c(x509Certificate);
                            }
                            if (Intrinsics.d(pin.a(), byteString)) {
                                return;
                            }
                        } else if (Intrinsics.d(b2, "sha1")) {
                            if (byteString2 == null) {
                                byteString2 = f42552c.b(x509Certificate);
                            }
                            if (Intrinsics.d(pin.a(), byteString2)) {
                                return;
                            }
                        } else {
                            throw new AssertionError("unsupported hashAlgorithm: " + pin.b());
                        }
                    }
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Certificate pinning failure!");
            sb.append("\n  Peer certificate chain:");
            for (X509Certificate x509Certificate2 : list) {
                sb.append("\n    ");
                sb.append(f42552c.a(x509Certificate2));
                sb.append(": ");
                sb.append(x509Certificate2.getSubjectDN().getName());
            }
            sb.append("\n  Pinned certificates for ");
            sb.append(str);
            sb.append(":");
            for (Pin append : c2) {
                sb.append("\n    ");
                sb.append(append);
            }
            String sb2 = sb.toString();
            Intrinsics.h(sb2, "StringBuilder().apply(builderAction).toString()");
            throw new SSLPeerUnverifiedException(sb2);
        }
    }

    public final List c(String str) {
        Intrinsics.i(str, "hostname");
        List m2 = CollectionsKt.m();
        for (Object next : this.f42554a) {
            if (((Pin) next).c(str)) {
                if (m2.isEmpty()) {
                    m2 = new ArrayList();
                }
                Intrinsics.g(m2, "null cannot be cast to non-null type kotlin.collections.MutableList<T of okhttp3.internal.Util.filterList>");
                TypeIntrinsics.c(m2).add(next);
            }
        }
        return m2;
    }

    public final CertificateChainCleaner d() {
        return this.f42555b;
    }

    public final CertificatePinner e(CertificateChainCleaner certificateChainCleaner) {
        Intrinsics.i(certificateChainCleaner, "certificateChainCleaner");
        return Intrinsics.d(this.f42555b, certificateChainCleaner) ? this : new CertificatePinner(this.f42554a, certificateChainCleaner);
    }

    public boolean equals(Object obj) {
        if (obj instanceof CertificatePinner) {
            CertificatePinner certificatePinner = (CertificatePinner) obj;
            return Intrinsics.d(certificatePinner.f42554a, this.f42554a) && Intrinsics.d(certificatePinner.f42555b, this.f42555b);
        }
    }

    public int hashCode() {
        int hashCode = (1517 + this.f42554a.hashCode()) * 41;
        CertificateChainCleaner certificateChainCleaner = this.f42555b;
        return hashCode + (certificateChainCleaner != null ? certificateChainCleaner.hashCode() : 0);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CertificatePinner(Set set, CertificateChainCleaner certificateChainCleaner, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(set, (i2 & 2) != 0 ? null : certificateChainCleaner);
    }
}
