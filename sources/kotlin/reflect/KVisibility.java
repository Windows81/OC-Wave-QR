package kotlin.reflect;

import kotlin.Metadata;
import kotlin.enums.EnumEntriesKt;

@Metadata
public enum KVisibility {
    PUBLIC,
    PROTECTED,
    INTERNAL,
    PRIVATE;

    static {
        KVisibility[] d2;
        E = EnumEntriesKt.a(d2);
    }
}
