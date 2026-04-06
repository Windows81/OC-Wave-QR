package kotlinx.coroutines;

import kotlin.Metadata;

@Metadata
public final class CoroutinesInternalError extends Error {
    public CoroutinesInternalError(String str, Throwable th) {
        super(str, th);
    }
}
