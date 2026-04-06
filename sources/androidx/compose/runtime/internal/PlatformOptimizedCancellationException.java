package androidx.compose.runtime.internal;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;

@Metadata
public abstract class PlatformOptimizedCancellationException extends CancellationException {
    public PlatformOptimizedCancellationException(String str) {
        super(str);
    }

    public Throwable fillInStackTrace() {
        setStackTrace(PlatformOptimizedCancellationException_jvmKt.f15136a);
        return this;
    }
}
