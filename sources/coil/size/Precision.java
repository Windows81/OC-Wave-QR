package coil.size;

import kotlin.Metadata;
import kotlin.enums.EnumEntriesKt;

@Metadata
public enum Precision {
    EXACT,
    INEXACT,
    AUTOMATIC;

    static {
        Precision[] d2;
        D = EnumEntriesKt.a(d2);
    }
}
