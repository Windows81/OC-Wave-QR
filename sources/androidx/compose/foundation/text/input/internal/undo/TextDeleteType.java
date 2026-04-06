package androidx.compose.foundation.text.input.internal.undo;

import kotlin.Metadata;
import kotlin.enums.EnumEntriesKt;

@Metadata
public enum TextDeleteType {
    Start,
    End,
    Inner,
    NotByUser;

    static {
        TextDeleteType[] d2;
        E = EnumEntriesKt.a(d2);
    }
}
