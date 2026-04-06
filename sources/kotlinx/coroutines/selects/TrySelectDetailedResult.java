package kotlinx.coroutines.selects;

import kotlin.Metadata;
import kotlin.enums.EnumEntriesKt;

@Metadata
public enum TrySelectDetailedResult {
    SUCCESSFUL,
    REREGISTER,
    CANCELLED,
    ALREADY_SELECTED;

    static {
        TrySelectDetailedResult[] d2;
        E = EnumEntriesKt.a(d2);
    }
}
