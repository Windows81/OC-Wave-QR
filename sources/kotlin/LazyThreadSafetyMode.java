package kotlin;

import kotlin.enums.EnumEntriesKt;

@Metadata
public enum LazyThreadSafetyMode {
    SYNCHRONIZED,
    PUBLICATION,
    NONE;

    static {
        LazyThreadSafetyMode[] d2;
        D = EnumEntriesKt.a(d2);
    }
}
