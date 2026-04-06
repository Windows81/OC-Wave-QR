package io.realm.internal;

import io.realm.OrderedCollectionChangeSet;

public class StatefulCollectionChangeSet implements OrderedCollectionChangeSet {

    /* renamed from: A  reason: collision with root package name */
    public final Throwable f40227A;

    /* renamed from: B  reason: collision with root package name */
    public final OrderedCollectionChangeSet.State f40228B;

    /* renamed from: z  reason: collision with root package name */
    public final OrderedCollectionChangeSet f40229z;

    public StatefulCollectionChangeSet(OsCollectionChangeSet osCollectionChangeSet) {
        this.f40229z = osCollectionChangeSet;
        boolean f2 = osCollectionChangeSet.f();
        Throwable c2 = osCollectionChangeSet.c();
        this.f40227A = c2;
        if (c2 != null) {
            this.f40228B = OrderedCollectionChangeSet.State.ERROR;
        } else {
            this.f40228B = f2 ? OrderedCollectionChangeSet.State.INITIAL : OrderedCollectionChangeSet.State.UPDATE;
        }
    }
}
