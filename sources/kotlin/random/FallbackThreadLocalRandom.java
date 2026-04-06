package kotlin.random;

import java.util.Random;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class FallbackThreadLocalRandom extends AbstractPlatformRandom {

    /* renamed from: B  reason: collision with root package name */
    public final FallbackThreadLocalRandom$implStorage$1 f40934B = new FallbackThreadLocalRandom$implStorage$1();

    public Random l() {
        Object obj = this.f40934B.get();
        Intrinsics.h(obj, "get(...)");
        return (Random) obj;
    }
}
