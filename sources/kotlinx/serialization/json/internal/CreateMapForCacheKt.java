package kotlinx.serialization.json.internal;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;

@Metadata
public final class CreateMapForCacheKt {
    public static final Map a(int i2) {
        return new ConcurrentHashMap(i2);
    }
}
