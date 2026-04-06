package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.enums.EnumEntriesKt;

@Metadata
public enum SharingCommand {
    START,
    STOP,
    STOP_AND_RESET_REPLAY_CACHE;

    static {
        SharingCommand[] d2;
        D = EnumEntriesKt.a(d2);
    }
}
