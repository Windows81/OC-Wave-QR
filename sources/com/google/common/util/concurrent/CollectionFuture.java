package com.google.common.util.concurrent;

import com.google.common.util.concurrent.AggregateFuture;
import java.util.List;

@ElementTypesAreNonnullByDefault
abstract class CollectionFuture<V, C> extends AggregateFuture<V, C> {
    public List M;

    public static final class ListFuture<V> extends CollectionFuture<V, List<V>> {
    }

    public static final class Present<V> {
    }

    public void G(AggregateFuture.ReleaseResourcesReason releaseResourcesReason) {
        super.G(releaseResourcesReason);
        this.M = null;
    }
}
