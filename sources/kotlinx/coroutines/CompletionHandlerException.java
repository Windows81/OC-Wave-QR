package kotlinx.coroutines;

import kotlin.Metadata;

@Metadata
public final class CompletionHandlerException extends RuntimeException {
    public CompletionHandlerException(String str, Throwable th) {
        super(str, th);
    }
}
