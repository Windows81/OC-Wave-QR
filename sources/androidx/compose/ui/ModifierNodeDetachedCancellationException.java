package androidx.compose.ui;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;

@Metadata
public final class ModifierNodeDetachedCancellationException extends CancellationException {
    public ModifierNodeDetachedCancellationException() {
        super("The Modifier.Node was detached");
    }

    public Throwable fillInStackTrace() {
        setStackTrace(Modifier_jvmKt.f15494a);
        return this;
    }
}
