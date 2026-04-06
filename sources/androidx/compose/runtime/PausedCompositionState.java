package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.enums.EnumEntriesKt;

@Metadata
public enum PausedCompositionState {
    Invalid,
    Cancelled,
    InitialPending,
    RecomposePending,
    Recomposing,
    ApplyPending,
    Applied;

    static {
        PausedCompositionState[] d2;
        H = EnumEntriesKt.a(d2);
    }
}
