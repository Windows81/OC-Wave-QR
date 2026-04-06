package kotlin.random;

import java.util.Random;
import kotlin.Metadata;

@Metadata
public final class FallbackThreadLocalRandom$implStorage$1 extends ThreadLocal<Random> {
    /* renamed from: a */
    public Random initialValue() {
        return new Random();
    }
}
