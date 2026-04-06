package kotlin.collections;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata
interface MapWithDefault<K, V> extends Map<K, V>, KMappedMarker {
    Object m0(Object obj);
}
