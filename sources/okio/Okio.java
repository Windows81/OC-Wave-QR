package okio;

import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import kotlin.Metadata;

@Metadata
public final class Okio {
    public static final Sink a(File file) {
        return Okio__JvmOkioKt.b(file);
    }

    public static final Sink b() {
        return Okio__OkioKt.a();
    }

    public static final BufferedSink c(Sink sink) {
        return Okio__OkioKt.b(sink);
    }

    public static final BufferedSource d(Source source) {
        return Okio__OkioKt.c(source);
    }

    public static final boolean e(AssertionError assertionError) {
        return Okio__JvmOkioKt.c(assertionError);
    }

    public static final Sink f(File file, boolean z2) {
        return Okio__JvmOkioKt.d(file, z2);
    }

    public static final Sink g(OutputStream outputStream) {
        return Okio__JvmOkioKt.e(outputStream);
    }

    public static final Sink h(Socket socket) {
        return Okio__JvmOkioKt.f(socket);
    }

    public static final Source j(File file) {
        return Okio__JvmOkioKt.h(file);
    }

    public static final Source k(InputStream inputStream) {
        return Okio__JvmOkioKt.i(inputStream);
    }

    public static final Source l(Socket socket) {
        return Okio__JvmOkioKt.j(socket);
    }
}
