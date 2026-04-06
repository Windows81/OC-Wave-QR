package androidx.compose.foundation.gestures;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;

@Metadata
public final class FlingCancellationException extends CancellationException {
    public FlingCancellationException() {
        super("The fling animation was cancelled");
    }

    public Throwable fillInStackTrace() {
        setStackTrace(Scrollable_jvmKt.f3579a);
        return this;
    }
}
