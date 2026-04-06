package androidx.compose.runtime.external.kotlinx.collections.immutable;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMutableMap;

@Metadata
public interface PersistentMap<K, V> extends ImmutableMap<K, V> {

    @Metadata
    public interface Builder<K, V> extends Map<K, V>, KMutableMap {
        PersistentMap d();
    }

    Builder l();
}
