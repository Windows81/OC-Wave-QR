package androidx.compose.foundation.text.input.internal.undo;

import kotlin.Metadata;
import kotlin.enums.EnumEntriesKt;

@Metadata
public enum TextEditType {
    Insert,
    Delete,
    Replace;

    static {
        TextEditType[] d2;
        D = EnumEntriesKt.a(d2);
    }
}
