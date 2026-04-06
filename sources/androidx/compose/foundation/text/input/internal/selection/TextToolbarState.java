package androidx.compose.foundation.text.input.internal.selection;

import kotlin.Metadata;
import kotlin.enums.EnumEntriesKt;

@Metadata
public enum TextToolbarState {
    None,
    Cursor,
    Selection;

    static {
        TextToolbarState[] d2;
        D = EnumEntriesKt.a(d2);
    }
}
