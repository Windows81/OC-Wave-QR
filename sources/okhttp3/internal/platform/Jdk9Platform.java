package okhttp3.internal.platform;

import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public class Jdk9Platform extends Platform {

    /* renamed from: d  reason: collision with root package name */
    public static final Companion f43195d = new Companion((DefaultConstructorMarker) null);

    /* renamed from: e  reason: collision with root package name */
    public static final boolean f43196e;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Jdk9Platform a() {
            if (b()) {
                return new Jdk9Platform();
            }
            return null;
        }

        public final boolean b() {
            return Jdk9Platform.f43196e;
        }

        public Companion() {
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0020, code lost:
        if (r0.intValue() >= 9) goto L_0x0022;
     */
    static {
        /*
            okhttp3.internal.platform.Jdk9Platform$Companion r0 = new okhttp3.internal.platform.Jdk9Platform$Companion
            r1 = 0
            r0.<init>(r1)
            f43195d = r0
            java.lang.String r0 = "java.specification.version"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            if (r0 == 0) goto L_0x0015
            java.lang.Integer r0 = kotlin.text.StringsKt.q(r0)
            goto L_0x0016
        L_0x0015:
            r0 = r1
        L_0x0016:
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x0024
            int r0 = r0.intValue()
            r1 = 9
            if (r0 < r1) goto L_0x002c
        L_0x0022:
            r2 = r3
            goto L_0x002c
        L_0x0024:
            java.lang.Class<javax.net.ssl.SSLSocket> r0 = javax.net.ssl.SSLSocket.class
            java.lang.String r4 = "getApplicationProtocol"
            r0.getMethod(r4, r1)     // Catch:{ NoSuchMethodException -> 0x002c }
            goto L_0x0022
        L_0x002c:
            f43196e = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.platform.Jdk9Platform.<clinit>():void");
    }

    public void e(SSLSocket sSLSocket, String str, List list) {
        Intrinsics.i(sSLSocket, "sslSocket");
        Intrinsics.i(list, "protocols");
        SSLParameters sSLParameters = sSLSocket.getSSLParameters();
        sSLParameters.setApplicationProtocols((String[]) Platform.f43200a.b(list).toArray(new String[0]));
        sSLSocket.setSSLParameters(sSLParameters);
    }

    public String h(SSLSocket sSLSocket) {
        Intrinsics.i(sSLSocket, "sslSocket");
        try {
            String a2 = sSLSocket.getApplicationProtocol();
            if (a2 == null ? true : Intrinsics.d(a2, "")) {
                return null;
            }
            return a2;
        } catch (UnsupportedOperationException unused) {
            return null;
        }
    }
}
