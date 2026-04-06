package kotlin.jdk7;

import kotlin.ExceptionsKt;
import kotlin.Metadata;

@Metadata
public final class AutoCloseableKt {
    public static final void a(AutoCloseable autoCloseable, Throwable th) {
        if (autoCloseable == null) {
            return;
        }
        if (th == null) {
            autoCloseable.close();
            return;
        }
        try {
            autoCloseable.close();
        } catch (Throwable th2) {
            ExceptionsKt.a(th, th2);
        }
    }
}
