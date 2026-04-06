package com.google.common.graph;

import java.util.Set;

@ElementTypesAreNonnullByDefault
interface NetworkConnections<N, E> {
    Set a();

    Set b();

    Set c();

    Object d(Object obj);
}
