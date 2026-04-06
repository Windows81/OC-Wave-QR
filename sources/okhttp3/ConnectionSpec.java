package okhttp3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.Util;

@Metadata
public final class ConnectionSpec {

    /* renamed from: e  reason: collision with root package name */
    public static final Companion f42594e = new Companion((DefaultConstructorMarker) null);

    /* renamed from: f  reason: collision with root package name */
    public static final CipherSuite[] f42595f;

    /* renamed from: g  reason: collision with root package name */
    public static final CipherSuite[] f42596g;

    /* renamed from: h  reason: collision with root package name */
    public static final ConnectionSpec f42597h;

    /* renamed from: i  reason: collision with root package name */
    public static final ConnectionSpec f42598i;

    /* renamed from: j  reason: collision with root package name */
    public static final ConnectionSpec f42599j;

    /* renamed from: k  reason: collision with root package name */
    public static final ConnectionSpec f42600k = new Builder(false).a();

    /* renamed from: a  reason: collision with root package name */
    public final boolean f42601a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f42602b;

    /* renamed from: c  reason: collision with root package name */
    public final String[] f42603c;

    /* renamed from: d  reason: collision with root package name */
    public final String[] f42604d;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    static {
        CipherSuite cipherSuite = CipherSuite.o1;
        CipherSuite cipherSuite2 = CipherSuite.p1;
        CipherSuite cipherSuite3 = CipherSuite.q1;
        CipherSuite cipherSuite4 = CipherSuite.a1;
        CipherSuite cipherSuite5 = CipherSuite.e1;
        CipherSuite cipherSuite6 = CipherSuite.b1;
        CipherSuite cipherSuite7 = CipherSuite.f1;
        CipherSuite cipherSuite8 = CipherSuite.l1;
        CipherSuite cipherSuite9 = CipherSuite.k1;
        CipherSuite cipherSuite10 = cipherSuite;
        CipherSuite cipherSuite11 = cipherSuite2;
        CipherSuite cipherSuite12 = cipherSuite3;
        CipherSuite cipherSuite13 = cipherSuite4;
        CipherSuite cipherSuite14 = cipherSuite5;
        CipherSuite cipherSuite15 = cipherSuite6;
        CipherSuite cipherSuite16 = cipherSuite7;
        CipherSuite cipherSuite17 = cipherSuite8;
        CipherSuite[] cipherSuiteArr = {cipherSuite10, cipherSuite11, cipherSuite12, cipherSuite13, cipherSuite14, cipherSuite15, cipherSuite16, cipherSuite17, cipherSuite9};
        f42595f = cipherSuiteArr;
        CipherSuite[] cipherSuiteArr2 = cipherSuiteArr;
        CipherSuite[] cipherSuiteArr3 = {cipherSuite10, cipherSuite11, cipherSuite12, cipherSuite13, cipherSuite14, cipherSuite15, cipherSuite16, cipherSuite17, cipherSuite9, CipherSuite.L0, CipherSuite.M0, CipherSuite.j0, CipherSuite.k0, CipherSuite.H, CipherSuite.L, CipherSuite.f42577l};
        f42596g = cipherSuiteArr3;
        Builder c2 = new Builder(true).c((CipherSuite[]) Arrays.copyOf(cipherSuiteArr2, cipherSuiteArr2.length));
        TlsVersion tlsVersion = TlsVersion.TLS_1_3;
        TlsVersion tlsVersion2 = TlsVersion.TLS_1_2;
        f42597h = c2.f(tlsVersion, tlsVersion2).d(true).a();
        f42598i = new Builder(true).c((CipherSuite[]) Arrays.copyOf(cipherSuiteArr3, cipherSuiteArr3.length)).f(tlsVersion, tlsVersion2).d(true).a();
        f42599j = new Builder(true).c((CipherSuite[]) Arrays.copyOf(cipherSuiteArr3, cipherSuiteArr3.length)).f(tlsVersion, tlsVersion2, TlsVersion.TLS_1_1, TlsVersion.TLS_1_0).d(true).a();
    }

    public ConnectionSpec(boolean z2, boolean z3, String[] strArr, String[] strArr2) {
        this.f42601a = z2;
        this.f42602b = z3;
        this.f42603c = strArr;
        this.f42604d = strArr2;
    }

    public final void c(SSLSocket sSLSocket, boolean z2) {
        Intrinsics.i(sSLSocket, "sslSocket");
        ConnectionSpec g2 = g(sSLSocket, z2);
        if (g2.i() != null) {
            sSLSocket.setEnabledProtocols(g2.f42604d);
        }
        if (g2.d() != null) {
            sSLSocket.setEnabledCipherSuites(g2.f42603c);
        }
    }

    public final List d() {
        String[] strArr = this.f42603c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String b2 : strArr) {
            arrayList.add(CipherSuite.f42567b.b(b2));
        }
        return CollectionsKt.M0(arrayList);
    }

    public final boolean e(SSLSocket sSLSocket) {
        Intrinsics.i(sSLSocket, "socket");
        if (!this.f42601a) {
            return false;
        }
        String[] strArr = this.f42604d;
        if (strArr != null && !Util.u(strArr, sSLSocket.getEnabledProtocols(), ComparisonsKt.g())) {
            return false;
        }
        String[] strArr2 = this.f42603c;
        return strArr2 == null || Util.u(strArr2, sSLSocket.getEnabledCipherSuites(), CipherSuite.f42567b.c());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ConnectionSpec)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        boolean z2 = this.f42601a;
        ConnectionSpec connectionSpec = (ConnectionSpec) obj;
        if (z2 != connectionSpec.f42601a) {
            return false;
        }
        return !z2 || (Arrays.equals(this.f42603c, connectionSpec.f42603c) && Arrays.equals(this.f42604d, connectionSpec.f42604d) && this.f42602b == connectionSpec.f42602b);
    }

    public final boolean f() {
        return this.f42601a;
    }

    public final ConnectionSpec g(SSLSocket sSLSocket, boolean z2) {
        String[] strArr;
        String[] strArr2;
        if (this.f42603c != null) {
            String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
            Intrinsics.h(enabledCipherSuites, "sslSocket.enabledCipherSuites");
            strArr = Util.E(enabledCipherSuites, this.f42603c, CipherSuite.f42567b.c());
        } else {
            strArr = sSLSocket.getEnabledCipherSuites();
        }
        if (this.f42604d != null) {
            String[] enabledProtocols = sSLSocket.getEnabledProtocols();
            Intrinsics.h(enabledProtocols, "sslSocket.enabledProtocols");
            strArr2 = Util.E(enabledProtocols, this.f42604d, ComparisonsKt.g());
        } else {
            strArr2 = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        Intrinsics.h(supportedCipherSuites, "supportedCipherSuites");
        int x2 = Util.x(supportedCipherSuites, "TLS_FALLBACK_SCSV", CipherSuite.f42567b.c());
        if (z2 && x2 != -1) {
            Intrinsics.h(strArr, "cipherSuitesIntersection");
            String str = supportedCipherSuites[x2];
            Intrinsics.h(str, "supportedCipherSuites[indexOfFallbackScsv]");
            strArr = Util.o(strArr, str);
        }
        Builder builder = new Builder(this);
        Intrinsics.h(strArr, "cipherSuitesIntersection");
        Builder b2 = builder.b((String[]) Arrays.copyOf(strArr, strArr.length));
        Intrinsics.h(strArr2, "tlsVersionsIntersection");
        return b2.e((String[]) Arrays.copyOf(strArr2, strArr2.length)).a();
    }

    public final boolean h() {
        return this.f42602b;
    }

    public int hashCode() {
        if (!this.f42601a) {
            return 17;
        }
        String[] strArr = this.f42603c;
        int i2 = 0;
        int hashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.f42604d;
        if (strArr2 != null) {
            i2 = Arrays.hashCode(strArr2);
        }
        return ((hashCode + i2) * 31) + (this.f42602b ^ true ? 1 : 0);
    }

    public final List i() {
        String[] strArr = this.f42604d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String a2 : strArr) {
            arrayList.add(TlsVersion.f42795A.a(a2));
        }
        return CollectionsKt.M0(arrayList);
    }

    public String toString() {
        if (!this.f42601a) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + Objects.toString(d(), "[all enabled]") + ", tlsVersions=" + Objects.toString(i(), "[all enabled]") + ", supportsTlsExtensions=" + this.f42602b + ')';
    }

    @Metadata
    public static final class Builder {

        /* renamed from: a  reason: collision with root package name */
        public boolean f42605a;

        /* renamed from: b  reason: collision with root package name */
        public String[] f42606b;

        /* renamed from: c  reason: collision with root package name */
        public String[] f42607c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f42608d;

        public Builder(boolean z2) {
            this.f42605a = z2;
        }

        public final ConnectionSpec a() {
            return new ConnectionSpec(this.f42605a, this.f42608d, this.f42606b, this.f42607c);
        }

        public final Builder b(String... strArr) {
            Intrinsics.i(strArr, "cipherSuites");
            if (this.f42605a) {
                if (!(strArr.length == 0)) {
                    this.f42606b = (String[]) strArr.clone();
                    return this;
                }
                throw new IllegalArgumentException("At least one cipher suite is required");
            }
            throw new IllegalArgumentException("no cipher suites for cleartext connections");
        }

        public final Builder c(CipherSuite... cipherSuiteArr) {
            Intrinsics.i(cipherSuiteArr, "cipherSuites");
            if (this.f42605a) {
                ArrayList arrayList = new ArrayList(cipherSuiteArr.length);
                for (CipherSuite c2 : cipherSuiteArr) {
                    arrayList.add(c2.c());
                }
                String[] strArr = (String[]) arrayList.toArray(new String[0]);
                return b((String[]) Arrays.copyOf(strArr, strArr.length));
            }
            throw new IllegalArgumentException("no cipher suites for cleartext connections");
        }

        public final Builder d(boolean z2) {
            if (this.f42605a) {
                this.f42608d = z2;
                return this;
            }
            throw new IllegalArgumentException("no TLS extensions for cleartext connections");
        }

        public final Builder e(String... strArr) {
            Intrinsics.i(strArr, "tlsVersions");
            if (this.f42605a) {
                if (!(strArr.length == 0)) {
                    this.f42607c = (String[]) strArr.clone();
                    return this;
                }
                throw new IllegalArgumentException("At least one TLS version is required");
            }
            throw new IllegalArgumentException("no TLS versions for cleartext connections");
        }

        public final Builder f(TlsVersion... tlsVersionArr) {
            Intrinsics.i(tlsVersionArr, "tlsVersions");
            if (this.f42605a) {
                ArrayList arrayList = new ArrayList(tlsVersionArr.length);
                for (TlsVersion f2 : tlsVersionArr) {
                    arrayList.add(f2.f());
                }
                String[] strArr = (String[]) arrayList.toArray(new String[0]);
                return e((String[]) Arrays.copyOf(strArr, strArr.length));
            }
            throw new IllegalArgumentException("no TLS versions for cleartext connections");
        }

        public Builder(ConnectionSpec connectionSpec) {
            Intrinsics.i(connectionSpec, "connectionSpec");
            this.f42605a = connectionSpec.f();
            this.f42606b = connectionSpec.f42603c;
            this.f42607c = connectionSpec.f42604d;
            this.f42608d = connectionSpec.h();
        }
    }
}
