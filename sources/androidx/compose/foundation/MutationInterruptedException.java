package androidx.compose.foundation;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;

@Metadata
public final class MutationInterruptedException extends CancellationException {
    public MutationInterruptedException() {
        super("Mutation interrupted");
    }

    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
