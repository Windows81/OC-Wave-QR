package androidx.compose.foundation.text.selection;

import kotlin.Metadata;
import kotlin.enums.EnumEntriesKt;

@Metadata
public enum CrossStatus {
    CROSSED,
    NOT_CROSSED,
    COLLAPSED;

    static {
        CrossStatus[] d2;
        D = EnumEntriesKt.a(d2);
    }
}
