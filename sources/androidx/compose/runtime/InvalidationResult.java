package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.enums.EnumEntriesKt;

@Metadata
public enum InvalidationResult {
    IGNORED,
    SCHEDULED,
    DEFERRED,
    IMMINENT;

    static {
        InvalidationResult[] d2;
        E = EnumEntriesKt.a(d2);
    }
}
