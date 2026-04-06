package kotlin.io.path;

import kotlin.Metadata;
import kotlin.enums.EnumEntriesKt;

@Metadata
public enum PathWalkOption {
    INCLUDE_DIRECTORIES,
    BREADTH_FIRST,
    FOLLOW_LINKS;

    static {
        PathWalkOption[] d2;
        D = EnumEntriesKt.a(d2);
    }
}
