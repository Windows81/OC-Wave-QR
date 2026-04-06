package kotlin;

import kotlin.enums.EnumEntriesKt;

@Metadata
public enum DeprecationLevel {
    WARNING,
    ERROR,
    HIDDEN;

    static {
        DeprecationLevel[] d2;
        D = EnumEntriesKt.a(d2);
    }
}
