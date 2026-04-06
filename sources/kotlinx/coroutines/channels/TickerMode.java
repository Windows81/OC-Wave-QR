package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.enums.EnumEntriesKt;

@Metadata
public enum TickerMode {
    FIXED_PERIOD,
    FIXED_DELAY;

    static {
        TickerMode[] d2;
        C = EnumEntriesKt.a(d2);
    }
}
