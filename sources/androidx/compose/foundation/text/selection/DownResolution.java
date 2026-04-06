package androidx.compose.foundation.text.selection;

import kotlin.Metadata;
import kotlin.enums.EnumEntriesKt;

@Metadata
enum DownResolution {
    Up,
    Drag,
    Timeout,
    Cancel;

    static {
        DownResolution[] d2;
        E = EnumEntriesKt.a(d2);
    }
}
