package kotlin.io.path;

import kotlin.Metadata;
import kotlin.enums.EnumEntriesKt;

@Metadata
public enum OnErrorResult {
    SKIP_SUBTREE,
    TERMINATE;

    static {
        OnErrorResult[] d2;
        C = EnumEntriesKt.a(d2);
    }
}
