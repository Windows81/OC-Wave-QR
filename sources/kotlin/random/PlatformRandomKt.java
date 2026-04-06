package kotlin.random;

import kotlin.Metadata;

@Metadata
public final class PlatformRandomKt {
    public static final double a(int i2, int i3) {
        return ((double) ((((long) i2) << 27) + ((long) i3))) / 9.007199254740992E15d;
    }
}
