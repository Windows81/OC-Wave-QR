package kotlin.io;

import kotlin.Metadata;
import kotlin.enums.EnumEntriesKt;

@Metadata
public enum FileWalkDirection {
    TOP_DOWN,
    BOTTOM_UP;

    static {
        FileWalkDirection[] d2;
        C = EnumEntriesKt.a(d2);
    }
}
