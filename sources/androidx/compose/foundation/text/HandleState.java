package androidx.compose.foundation.text;

import kotlin.Metadata;
import kotlin.enums.EnumEntriesKt;

@Metadata
public enum HandleState {
    None,
    Selection,
    Cursor;

    static {
        HandleState[] d2;
        D = EnumEntriesKt.a(d2);
    }
}
