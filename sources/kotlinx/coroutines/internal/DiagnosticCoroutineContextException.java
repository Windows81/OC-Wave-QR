package kotlinx.coroutines.internal;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;

@Metadata
public final class DiagnosticCoroutineContextException extends RuntimeException {

    /* renamed from: z  reason: collision with root package name */
    public final transient CoroutineContext f41831z;

    public DiagnosticCoroutineContextException(CoroutineContext coroutineContext) {
        this.f41831z = coroutineContext;
    }

    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public String getLocalizedMessage() {
        return String.valueOf(this.f41831z);
    }
}
