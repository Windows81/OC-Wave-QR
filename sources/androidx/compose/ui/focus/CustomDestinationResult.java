package androidx.compose.ui.focus;

import kotlin.Metadata;
import kotlin.enums.EnumEntriesKt;

@Metadata
public enum CustomDestinationResult {
    None,
    Cancelled,
    Redirected,
    RedirectCancelled;

    static {
        CustomDestinationResult[] d2;
        E = EnumEntriesKt.a(d2);
    }
}
