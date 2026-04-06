package androidx.compose.ui.input.pointer;

import kotlin.Metadata;
import kotlin.enums.EnumEntriesKt;

@Metadata
public enum PointerEventPass {
    Initial,
    Main,
    Final;

    static {
        PointerEventPass[] d2;
        D = EnumEntriesKt.a(d2);
    }
}
