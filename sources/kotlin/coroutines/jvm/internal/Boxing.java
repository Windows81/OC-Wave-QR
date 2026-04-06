package kotlin.coroutines.jvm.internal;

import kotlin.Metadata;

@Metadata
public final class Boxing {
    public static final Boolean a(boolean z2) {
        return Boolean.valueOf(z2);
    }

    public static final Float b(float f2) {
        return new Float(f2);
    }

    public static final Integer c(int i2) {
        return new Integer(i2);
    }

    public static final Long d(long j2) {
        return new Long(j2);
    }
}
