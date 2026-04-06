package androidx.lifecycle;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;

@Metadata
public final class LifecycleDestroyedException extends CancellationException {
    public LifecycleDestroyedException() {
        super((String) null);
    }
}
