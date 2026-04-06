package androidx.compose.foundation.text.input.internal.undo;

import kotlin.Metadata;
import kotlin.enums.EnumEntriesKt;

@Metadata
public enum TextFieldEditUndoBehavior {
    MergeIfPossible,
    ClearHistory,
    NeverMerge;

    static {
        TextFieldEditUndoBehavior[] d2;
        D = EnumEntriesKt.a(d2);
    }
}
