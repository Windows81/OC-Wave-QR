package kotlin.jvm.internal.markers;

import kotlin.Metadata;

@Metadata
public interface KMutableMap extends KMappedMarker {

    @Metadata
    public interface Entry extends KMappedMarker {
    }
}
