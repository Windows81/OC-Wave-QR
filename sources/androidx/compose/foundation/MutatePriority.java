package androidx.compose.foundation;

import kotlin.Metadata;
import kotlin.enums.EnumEntriesKt;

@Metadata
public enum MutatePriority {
    Default,
    UserInput,
    PreventUserInput;

    static {
        MutatePriority[] d2;
        D = EnumEntriesKt.a(d2);
    }
}
