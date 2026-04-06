package kotlinx.coroutines.internal;

import kotlin.Metadata;

@Metadata
public final class UndeliveredElementException extends RuntimeException {
    public UndeliveredElementException(String str, Throwable th) {
        super(str, th);
    }
}
