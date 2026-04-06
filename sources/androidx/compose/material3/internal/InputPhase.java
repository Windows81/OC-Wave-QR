package androidx.compose.material3.internal;

import kotlin.Metadata;
import kotlin.enums.EnumEntriesKt;

@Metadata
enum InputPhase {
    Focused,
    UnfocusedEmpty,
    UnfocusedNotEmpty;

    static {
        InputPhase[] d2;
        D = EnumEntriesKt.a(d2);
    }
}
