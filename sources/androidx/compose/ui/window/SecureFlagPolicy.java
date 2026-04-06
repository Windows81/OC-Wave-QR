package androidx.compose.ui.window;

import kotlin.Metadata;
import kotlin.enums.EnumEntriesKt;

@Metadata
public enum SecureFlagPolicy {
    Inherit,
    SecureOn,
    SecureOff;

    static {
        SecureFlagPolicy[] d2;
        D = EnumEntriesKt.a(d2);
    }
}
