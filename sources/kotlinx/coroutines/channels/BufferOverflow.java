package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.enums.EnumEntriesKt;

@Metadata
public enum BufferOverflow {
    SUSPEND,
    DROP_OLDEST,
    DROP_LATEST;

    static {
        BufferOverflow[] d2;
        D = EnumEntriesKt.a(d2);
    }
}
