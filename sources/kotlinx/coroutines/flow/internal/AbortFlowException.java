package kotlinx.coroutines.flow.internal;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;

@Metadata
public final class AbortFlowException extends CancellationException {

    /* renamed from: z  reason: collision with root package name */
    public final transient Object f41778z;

    public AbortFlowException(Object obj) {
        super("Flow was aborted, no more elements needed");
        this.f41778z = obj;
    }

    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
