package kotlin.internal;

import kotlin.Metadata;
import kotlin.enums.EnumEntriesKt;

@Metadata
public enum RequireKotlinVersionKind {
    LANGUAGE_VERSION,
    COMPILER_VERSION,
    API_VERSION;

    static {
        RequireKotlinVersionKind[] d2;
        D = EnumEntriesKt.a(d2);
    }
}
