package okio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.logging.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata
final /* synthetic */ class Okio__JvmOkioKt {

    /* renamed from: a  reason: collision with root package name */
    public static final Logger f43399a = Logger.getLogger("okio.Okio");

    public static final Sink b(File file) {
        Intrinsics.i(file, "<this>");
        return Okio.g(new FileOutputStream(file, true));
    }

    public static final boolean c(AssertionError assertionError) {
        Intrinsics.i(assertionError, "<this>");
        if (assertionError.getCause() == null) {
            return false;
        }
        String message = assertionError.getMessage();
        return message != null ? StringsKt.W(message, "getsockname failed", false, 2, (Object) null) : false;
    }

    public static final Sink d(File file, boolean z2) {
        Intrinsics.i(file, "<this>");
        return Okio.g(new FileOutputStream(file, z2));
    }

    public static final Sink e(OutputStream outputStream) {
        Intrinsics.i(outputStream, "<this>");
        return new OutputStreamSink(outputStream, new Timeout());
    }

    public static final Sink f(Socket socket) {
        Intrinsics.i(socket, "<this>");
        SocketAsyncTimeout socketAsyncTimeout = new SocketAsyncTimeout(socket);
        OutputStream outputStream = socket.getOutputStream();
        Intrinsics.h(outputStream, "getOutputStream(...)");
        return socketAsyncTimeout.B(new OutputStreamSink(outputStream, socketAsyncTimeout));
    }

    public static /* synthetic */ Sink g(File file, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z2 = false;
        }
        return Okio.f(file, z2);
    }

    public static final Source h(File file) {
        Intrinsics.i(file, "<this>");
        return new InputStreamSource(new FileInputStream(file), Timeout.f43454f);
    }

    public static final Source i(InputStream inputStream) {
        Intrinsics.i(inputStream, "<this>");
        return new InputStreamSource(inputStream, new Timeout());
    }

    public static final Source j(Socket socket) {
        Intrinsics.i(socket, "<this>");
        SocketAsyncTimeout socketAsyncTimeout = new SocketAsyncTimeout(socket);
        InputStream inputStream = socket.getInputStream();
        Intrinsics.h(inputStream, "getInputStream(...)");
        return socketAsyncTimeout.C(new InputStreamSource(inputStream, socketAsyncTimeout));
    }
}
