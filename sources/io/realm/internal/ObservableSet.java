package io.realm.internal;

import io.realm.RealmSet;
import io.realm.SetChangeListener;
import io.realm.SetChangeSet;
import io.realm.internal.ObserverPairList;

public interface ObservableSet {

    public static class Callback<T> implements ObserverPairList.Callback<SetObserverPair<T>> {

        /* renamed from: a  reason: collision with root package name */
        public final SetChangeSet f40143a;

        public Callback(SetChangeSet setChangeSet) {
            this.f40143a = setChangeSet;
        }

        /* renamed from: b */
        public void a(SetObserverPair setObserverPair, Object obj) {
            setObserverPair.a(obj, this.f40143a);
        }
    }

    public static class SetObserverPair<T> extends ObserverPairList.ObserverPair<RealmSet<T>, Object> {
        public void a(Object obj, SetChangeSet setChangeSet) {
            ((SetChangeListener) this.f40147b).a((RealmSet) obj, setChangeSet);
        }
    }

    void notifyChangeListeners(long j2);
}
