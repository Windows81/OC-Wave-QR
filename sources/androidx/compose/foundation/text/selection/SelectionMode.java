package androidx.compose.foundation.text.selection;

import kotlin.Metadata;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public enum SelectionMode {
    ;

    @Metadata
    public static final class Horizontal extends SelectionMode {
        public Horizontal(String str, int i2) {
            super(str, i2, (DefaultConstructorMarker) null);
        }
    }

    @Metadata
    public static final class Vertical extends SelectionMode {
        public Vertical(String str, int i2) {
            super(str, i2, (DefaultConstructorMarker) null);
        }
    }

    static {
        SelectionMode[] d2;
        C = EnumEntriesKt.a(d2);
    }
}
