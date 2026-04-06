package kotlinx.coroutines.internal;

import kotlin.Metadata;
import kotlinx.coroutines.CoroutineDispatcher;

@Metadata
public final class LimitedDispatcherKt {
    public static final void a(int i2) {
        if (i2 < 1) {
            throw new IllegalArgumentException(("Expected positive parallelism level, but got " + i2).toString());
        }
    }

    public static final CoroutineDispatcher b(CoroutineDispatcher coroutineDispatcher, String str) {
        return str != null ? new NamedDispatcher(coroutineDispatcher, str) : coroutineDispatcher;
    }
}
