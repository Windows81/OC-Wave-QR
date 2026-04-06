package io.realm.internal;

import io.realm.MapChangeListener;
import io.realm.MapChangeSet;
import io.realm.RealmChangeListener;
import io.realm.RealmMap;
import io.realm.internal.ObserverPairList;

public interface ObservableMap {

    public static class Callback<K, V> implements ObserverPairList.Callback<MapObserverPair<K, V>> {

        /* renamed from: a  reason: collision with root package name */
        public final MapChangeSet f40141a;

        public Callback(MapChangeSet mapChangeSet) {
            this.f40141a = mapChangeSet;
        }

        /* renamed from: b */
        public void a(MapObserverPair mapObserverPair, Object obj) {
            mapObserverPair.a(obj, this.f40141a);
        }
    }

    public static class MapObserverPair<K, V> extends ObserverPairList.ObserverPair<RealmMap<K, V>, Object> {
        public void a(Object obj, MapChangeSet mapChangeSet) {
            ((MapChangeListener) this.f40147b).a((RealmMap) obj, mapChangeSet);
        }
    }

    public static class RealmChangeListenerWrapper<K, V> implements MapChangeListener<K, V> {

        /* renamed from: a  reason: collision with root package name */
        public final RealmChangeListener f40142a;

        public void a(RealmMap realmMap, MapChangeSet mapChangeSet) {
            this.f40142a.a(realmMap);
        }

        public boolean equals(Object obj) {
            return (obj instanceof RealmChangeListenerWrapper) && this.f40142a == ((RealmChangeListenerWrapper) obj).f40142a;
        }

        public int hashCode() {
            return this.f40142a.hashCode();
        }
    }

    void notifyChangeListeners(long j2);
}
