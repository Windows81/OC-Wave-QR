package okio;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class SocketAsyncTimeout extends AsyncTimeout {

    /* renamed from: p  reason: collision with root package name */
    public final Socket f43444p;

    public SocketAsyncTimeout(Socket socket) {
        Intrinsics.i(socket, "socket");
        this.f43444p = socket;
    }

    public void D() {
        try {
            this.f43444p.close();
        } catch (Exception e2) {
            Logger a2 = Okio__JvmOkioKt.f43399a;
            Level level = Level.WARNING;
            a2.log(level, "Failed to close timed out socket " + this.f43444p, e2);
        } catch (AssertionError e3) {
            if (Okio.e(e3)) {
                Logger a3 = Okio__JvmOkioKt.f43399a;
                Level level2 = Level.WARNING;
                a3.log(level2, "Failed to close timed out socket " + this.f43444p, e3);
                return;
            }
            throw e3;
        }
    }

    public IOException z(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }
}
