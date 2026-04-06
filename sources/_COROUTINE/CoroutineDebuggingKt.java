package _COROUTINE;

import kotlin.Metadata;

@Metadata
public final class CoroutineDebuggingKt {

    /* renamed from: a  reason: collision with root package name */
    public static final String f2a = "_COROUTINE";

    public static final StackTraceElement b(Throwable th, String str) {
        StackTraceElement stackTraceElement = th.getStackTrace()[0];
        return new StackTraceElement(f2a + '.' + str, "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
    }
}
