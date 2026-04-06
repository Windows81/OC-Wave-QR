package androidx.compose.runtime;

import kotlin.Metadata;

@Metadata
public final class PreconditionsKt {
    public static final void a(String str) {
        throw new IllegalArgumentException(str);
    }

    public static final void b(String str) {
        throw new IllegalStateException(str);
    }
}
