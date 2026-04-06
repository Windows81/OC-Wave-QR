package com.google.common.graph;

import java.util.Iterator;
import java.util.Set;

@ElementTypesAreNonnullByDefault
interface GraphConnections<N, V> {
    Set a();

    Set b();

    Set c();

    Object d(Object obj);

    Iterator e(Object obj);
}
