package kotlin.reflect;

import kotlin.Metadata;
import kotlin.enums.EnumEntriesKt;

@Metadata
public enum KVariance {
    INVARIANT,
    IN,
    OUT;

    static {
        KVariance[] d2;
        D = EnumEntriesKt.a(d2);
    }
}
