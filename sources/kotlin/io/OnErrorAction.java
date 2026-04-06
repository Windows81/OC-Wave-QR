package kotlin.io;

import kotlin.Metadata;
import kotlin.enums.EnumEntriesKt;

@Metadata
public enum OnErrorAction {
    SKIP,
    TERMINATE;

    static {
        OnErrorAction[] d2;
        C = EnumEntriesKt.a(d2);
    }
}
