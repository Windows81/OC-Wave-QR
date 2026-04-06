package com.google.common.graph;

import com.google.common.collect.BiMap;
import java.util.Collections;
import java.util.Set;

@ElementTypesAreNonnullByDefault
final class DirectedNetworkConnections<N, E> extends AbstractDirectedNetworkConnections<N, E> {
    public Set b() {
        return Collections.unmodifiableSet(((BiMap) this.f28723b).values());
    }

    public Set c() {
        return Collections.unmodifiableSet(((BiMap) this.f28722a).values());
    }
}
