package androidx.compose.material;

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
