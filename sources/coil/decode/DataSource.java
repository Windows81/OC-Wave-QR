package coil.decode;

import kotlin.Metadata;
import kotlin.enums.EnumEntriesKt;

@Metadata
public enum DataSource {
    MEMORY_CACHE,
    MEMORY,
    DISK,
    NETWORK;

    static {
        DataSource[] d2;
        E = EnumEntriesKt.a(d2);
    }
}
