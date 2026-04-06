package okhttp3.internal.tls;

import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.internal.HostnamesKt;
import okhttp3.internal.Util;
import okio.Utf8;

@Metadata
public final class OkHostnameVerifier implements HostnameVerifier {

    /* renamed from: a  reason: collision with root package name */
    public static final OkHostnameVerifier f43245a = new OkHostnameVerifier();

    public final List a(X509Certificate x509Certificate) {
        Intrinsics.i(x509Certificate, "certificate");
        return CollectionsKt.x0(c(x509Certificate, 7), c(x509Certificate, 2));
    }

    public final String b(String str) {
        if (!d(str)) {
            return str;
        }
        Locale locale = Locale.US;
        Intrinsics.h(locale, "US");
        String lowerCase = str.toLowerCase(locale);
        Intrinsics.h(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        return lowerCase;
    }

    public final List c(X509Certificate x509Certificate, int i2) {
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return CollectionsKt.m();
            }
            ArrayList arrayList = new ArrayList();
            for (List next : subjectAlternativeNames) {
                if (next != null) {
                    if (next.size() >= 2) {
                        if (Intrinsics.d(next.get(0), Integer.valueOf(i2))) {
                            Object obj = next.get(1);
                            if (obj != null) {
                                arrayList.add((String) obj);
                            }
                        }
                    }
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return CollectionsKt.m();
        }
    }

    public final boolean d(String str) {
        return str.length() == ((int) Utf8.b(str, 0, 0, 3, (Object) null));
    }

    public final boolean e(String str, X509Certificate x509Certificate) {
        Intrinsics.i(str, "host");
        Intrinsics.i(x509Certificate, "certificate");
        return Util.i(str) ? h(str, x509Certificate) : g(str, x509Certificate);
    }

    public final boolean f(String str, String str2) {
        if (str != null && str.length() != 0 && !StringsKt.Q(str, ".", false, 2, (Object) null) && !StringsKt.A(str, "..", false, 2, (Object) null) && str2 != null && str2.length() != 0 && !StringsKt.Q(str2, ".", false, 2, (Object) null) && !StringsKt.A(str2, "..", false, 2, (Object) null)) {
            if (!StringsKt.A(str, ".", false, 2, (Object) null)) {
                str = str + '.';
            }
            String str3 = str;
            if (!StringsKt.A(str2, ".", false, 2, (Object) null)) {
                str2 = str2 + '.';
            }
            String b2 = b(str2);
            if (!StringsKt.W(b2, "*", false, 2, (Object) null)) {
                return Intrinsics.d(str3, b2);
            }
            if (!StringsKt.Q(b2, "*.", false, 2, (Object) null) || StringsKt.i0(b2, '*', 1, false, 4, (Object) null) != -1 || str3.length() < b2.length() || Intrinsics.d("*.", b2)) {
                return false;
            }
            String substring = b2.substring(1);
            Intrinsics.h(substring, "this as java.lang.String).substring(startIndex)");
            if (!StringsKt.A(str3, substring, false, 2, (Object) null)) {
                return false;
            }
            int length = str3.length() - substring.length();
            return length <= 0 || StringsKt.p0(str3, '.', length + -1, false, 4, (Object) null) == -1;
        }
        return false;
    }

    public final boolean g(String str, X509Certificate x509Certificate) {
        String b2 = b(str);
        Iterable<String> c2 = c(x509Certificate, 2);
        if ((c2 instanceof Collection) && ((Collection) c2).isEmpty()) {
            return false;
        }
        for (String f2 : c2) {
            if (f43245a.f(b2, f2)) {
                return true;
            }
        }
        return false;
    }

    public final boolean h(String str, X509Certificate x509Certificate) {
        String e2 = HostnamesKt.e(str);
        Iterable<String> c2 = c(x509Certificate, 7);
        if ((c2 instanceof Collection) && ((Collection) c2).isEmpty()) {
            return false;
        }
        for (String e3 : c2) {
            if (Intrinsics.d(e2, HostnamesKt.e(e3))) {
                return true;
            }
        }
        return false;
    }

    public boolean verify(String str, SSLSession sSLSession) {
        Intrinsics.i(str, "host");
        Intrinsics.i(sSLSession, "session");
        if (!d(str)) {
            return false;
        }
        try {
            Certificate certificate = sSLSession.getPeerCertificates()[0];
            Intrinsics.g(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            return e(str, (X509Certificate) certificate);
        } catch (SSLException unused) {
            return false;
        }
    }
}
