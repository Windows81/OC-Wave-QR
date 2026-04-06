package kotlinx.coroutines.internal;

import kotlin.Metadata;

@Metadata
public final class ThreadLocalKt {
    public static final ThreadLocal a(Symbol symbol) {
        return new ThreadLocal();
    }
}
