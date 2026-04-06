package androidx.compose.material3.internal;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;

@Metadata
public abstract class PlatformOptimizedCancellationException extends CancellationException {
    public PlatformOptimizedCancellationException(String str) {
        super(str);
    }

    public Throwable fillInStackTrace() {
        setStackTrace(PlatformOptimizedCancellationException_jvmKt.f12314a);
        return this;
    }
}
