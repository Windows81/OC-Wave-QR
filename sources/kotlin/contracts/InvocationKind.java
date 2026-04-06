package kotlin.contracts;

import kotlin.Metadata;
import kotlin.enums.EnumEntriesKt;

@Metadata
public enum InvocationKind {
    AT_MOST_ONCE,
    AT_LEAST_ONCE,
    EXACTLY_ONCE,
    UNKNOWN;

    static {
        InvocationKind[] d2;
        E = EnumEntriesKt.a(d2);
    }
}
