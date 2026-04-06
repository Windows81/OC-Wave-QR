package kotlin.io.path;

import kotlin.Metadata;
import kotlin.enums.EnumEntriesKt;

@Metadata
public enum CopyActionResult {
    CONTINUE,
    SKIP_SUBTREE,
    TERMINATE;

    static {
        CopyActionResult[] d2;
        D = EnumEntriesKt.a(d2);
    }
}
