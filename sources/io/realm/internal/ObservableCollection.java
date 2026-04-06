package io.realm.internal;

import io.realm.OrderedCollectionChangeSet;
import io.realm.OrderedRealmCollectionChangeListener;
import io.realm.RealmChangeListener;
import io.realm.internal.ObserverPairList;

public interface ObservableCollection {

    public static class Callback implements ObserverPairList.Callback<CollectionObserverPair> {

        /* renamed from: a  reason: collision with root package name */
        public final OsCollectionChangeSet f40139a;

        public Callback(OsCollectionChangeSet osCollectionChangeSet) {
            this.f40139a = osCollectionChangeSet;
        }

        /* renamed from: b */
        public void a(CollectionObserverPair collectionObserverPair, Object obj) {
            collectionObserverPair.a(obj, this.f40139a);
        }
    }

    public static class CollectionObserverPair<T> extends ObserverPairList.ObserverPair<T, Object> {
        public CollectionObserverPair(Object obj, Object obj2) {
            super(obj, obj2);
        }

        public void a(Object obj, OsCollectionChangeSet osCollectionChangeSet) {
            Object obj2 = this.f40147b;
            if (obj2 instanceof OrderedRealmCollectionChangeListener) {
                ((OrderedRealmCollectionChangeListener) obj2).a(obj, new StatefulCollectionChangeSet(osCollectionChangeSet));
            } else if (obj2 instanceof RealmChangeListener) {
                ((RealmChangeListener) obj2).a(obj);
            } else {
                throw new RuntimeException("Unsupported listener type: " + this.f40147b);
            }
        }
    }

    public static class RealmChangeListenerWrapper<T> implements OrderedRealmCollectionChangeListener<T> {

        /* renamed from: a  reason: collision with root package name */
        public final RealmChangeListener f40140a;

        public RealmChangeListenerWrapper(RealmChangeListener realmChangeListener) {
            this.f40140a = realmChangeListener;
        }

        public void a(Object obj, OrderedCollectionChangeSet orderedCollectionChangeSet) {
            this.f40140a.a(obj);
        }

        public boolean equals(Object obj) {
            return (obj instanceof RealmChangeListenerWrapper) && this.f40140a == ((RealmChangeListenerWrapper) obj).f40140a;
        }

        public int hashCode() {
            return this.f40140a.hashCode();
        }
    }

    void notifyChangeListeners(long j2);
}
