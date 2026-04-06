package coil.util;

import kotlin.Metadata;

@Metadata
/* renamed from: coil.util.-Logs  reason: invalid class name */
public final class Logs {
    public static final void a(Logger logger, String str, Throwable th) {
        if (logger.a() <= 6) {
            logger.b(str, 6, (String) null, th);
        }
    }
}
