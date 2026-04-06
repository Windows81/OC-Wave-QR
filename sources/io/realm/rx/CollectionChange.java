package io.realm.rx;

import io.realm.OrderedCollectionChangeSet;
import io.realm.OrderedRealmCollection;

public class CollectionChange<E extends OrderedRealmCollection> {

    /* renamed from: a  reason: collision with root package name */
    public final OrderedRealmCollection f40378a;

    /* renamed from: b  reason: collision with root package name */
    public final OrderedCollectionChangeSet f40379b;

    public CollectionChange(OrderedRealmCollection orderedRealmCollection, OrderedCollectionChangeSet orderedCollectionChangeSet) {
        this.f40378a = orderedRealmCollection;
        this.f40379b = orderedCollectionChangeSet;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CollectionChange collectionChange = (CollectionChange) obj;
        if (!this.f40378a.equals(collectionChange.f40378a)) {
            return false;
        }
        OrderedCollectionChangeSet orderedCollectionChangeSet = this.f40379b;
        OrderedCollectionChangeSet orderedCollectionChangeSet2 = collectionChange.f40379b;
        return orderedCollectionChangeSet != null ? orderedCollectionChangeSet.equals(orderedCollectionChangeSet2) : orderedCollectionChangeSet2 == null;
    }

    public int hashCode() {
        int hashCode = this.f40378a.hashCode() * 31;
        OrderedCollectionChangeSet orderedCollectionChangeSet = this.f40379b;
        return hashCode + (orderedCollectionChangeSet != null ? orderedCollectionChangeSet.hashCode() : 0);
    }
}
