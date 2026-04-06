package okhttp3.internal.connection;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.ConnectionSpec;

@Metadata
public final class ConnectionSpecSelector {

    /* renamed from: a  reason: collision with root package name */
    public final List f42903a;

    /* renamed from: b  reason: collision with root package name */
    public int f42904b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f42905c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f42906d;

    public ConnectionSpecSelector(List list) {
        Intrinsics.i(list, "connectionSpecs");
        this.f42903a = list;
    }

    public final ConnectionSpec a(SSLSocket sSLSocket) {
        ConnectionSpec connectionSpec;
        Intrinsics.i(sSLSocket, "sslSocket");
        int i2 = this.f42904b;
        int size = this.f42903a.size();
        while (true) {
            if (i2 >= size) {
                connectionSpec = null;
                break;
            }
            connectionSpec = (ConnectionSpec) this.f42903a.get(i2);
            if (connectionSpec.e(sSLSocket)) {
                this.f42904b = i2 + 1;
                break;
            }
            i2++;
        }
        if (connectionSpec != null) {
            this.f42905c = c(sSLSocket);
            connectionSpec.c(sSLSocket, this.f42906d);
            return connectionSpec;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unable to find acceptable protocols. isFallback=");
        sb.append(this.f42906d);
        sb.append(", modes=");
        sb.append(this.f42903a);
        sb.append(", supported protocols=");
        String[] enabledProtocols = sSLSocket.getEnabledProtocols();
        Intrinsics.f(enabledProtocols);
        String arrays = Arrays.toString(enabledProtocols);
        Intrinsics.h(arrays, "toString(this)");
        sb.append(arrays);
        throw new UnknownServiceException(sb.toString());
    }

    public final boolean b(IOException iOException) {
        Intrinsics.i(iOException, "e");
        this.f42906d = true;
        return this.f42905c && !(iOException instanceof ProtocolException) && !(iOException instanceof InterruptedIOException) && (!(iOException instanceof SSLHandshakeException) || !(iOException.getCause() instanceof CertificateException)) && !(iOException instanceof SSLPeerUnverifiedException) && (iOException instanceof SSLException);
    }

    public final boolean c(SSLSocket sSLSocket) {
        int size = this.f42903a.size();
        for (int i2 = this.f42904b; i2 < size; i2++) {
            if (((ConnectionSpec) this.f42903a.get(i2)).e(sSLSocket)) {
                return true;
            }
        }
        return false;
    }
}
