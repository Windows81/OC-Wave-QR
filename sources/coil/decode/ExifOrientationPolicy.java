package coil.decode;

import kotlin.Metadata;
import kotlin.enums.EnumEntriesKt;

@Metadata
public enum ExifOrientationPolicy {
    IGNORE,
    RESPECT_PERFORMANCE,
    RESPECT_ALL;

    static {
        ExifOrientationPolicy[] d2;
        D = EnumEntriesKt.a(d2);
    }
}
