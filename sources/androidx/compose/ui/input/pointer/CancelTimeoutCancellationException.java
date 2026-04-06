package androidx.compose.ui.input.pointer;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;

@Metadata
public final class CancelTimeoutCancellationException extends CancellationException {

    /* renamed from: z  reason: collision with root package name */
    public static final CancelTimeoutCancellationException f16805z = new CancelTimeoutCancellationException();

    public Throwable fillInStackTrace() {
        setStackTrace(SuspendingPointerInputFilter_jvmKt.f16950a);
        return this;
    }
}
