package kotlin.random.jdk8;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.AbstractPlatformRandom;

@Metadata
public final class PlatformThreadLocalRandom extends AbstractPlatformRandom {
    public int j(int i2, int i3) {
        return ThreadLocalRandom.current().nextInt(i2, i3);
    }

    public Random l() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        Intrinsics.h(current, "current(...)");
        return current;
    }
}
