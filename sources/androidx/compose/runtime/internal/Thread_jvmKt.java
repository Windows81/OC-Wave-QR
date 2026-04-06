package androidx.compose.runtime.internal;

import kotlin.Metadata;

@Metadata
public final class Thread_jvmKt {
    public static final long a() {
        return Thread.currentThread().getId();
    }

    public static final String b() {
        return Thread.currentThread().getName();
    }
}
