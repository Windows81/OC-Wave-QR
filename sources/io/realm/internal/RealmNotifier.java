package io.realm.internal;

import io.realm.RealmChangeListener;
import io.realm.internal.ObserverPairList;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;

public abstract class RealmNotifier implements Closeable {
    private List<Runnable> finishedSendingNotificationsCallbacks = new ArrayList();
    private final ObserverPairList.Callback<RealmObserverPair> onChangeCallBack = new ObserverPairList.Callback<RealmObserverPair>() {
        /* renamed from: b */
        public void a(RealmObserverPair realmObserverPair, Object obj) {
            if (RealmNotifier.this.sharedRealm != null && !RealmNotifier.this.sharedRealm.isClosed()) {
                realmObserverPair.b(obj);
            }
        }
    };
    private ObserverPairList<RealmObserverPair> realmObserverPairs = new ObserverPairList<>();
    /* access modifiers changed from: private */
    public OsSharedRealm sharedRealm;
    private List<Runnable> startSendingNotificationsCallbacks = new ArrayList();
    private List<Runnable> transactionCallbacks = new ArrayList();

    public static class RealmObserverPair<T> extends ObserverPairList.ObserverPair<T, RealmChangeListener<T>> {
        public RealmObserverPair(Object obj, RealmChangeListener realmChangeListener) {
            super(obj, realmChangeListener);
        }

        public final void b(Object obj) {
            if (obj != null) {
                ((RealmChangeListener) this.f40147b).a(obj);
            }
        }
    }

    public RealmNotifier(@Nullable OsSharedRealm osSharedRealm) {
        this.sharedRealm = osSharedRealm;
    }

    private void removeAllChangeListeners() {
        this.realmObserverPairs.b();
    }

    public void addBeginSendingNotificationsCallback(Runnable runnable) {
        this.startSendingNotificationsCallbacks.add(runnable);
    }

    public <T> void addChangeListener(T t2, RealmChangeListener<T> realmChangeListener) {
        this.realmObserverPairs.a(new RealmObserverPair(t2, realmChangeListener));
    }

    public void addFinishedSendingNotificationsCallback(Runnable runnable) {
        this.finishedSendingNotificationsCallbacks.add(runnable);
    }

    public void addTransactionCallback(Runnable runnable) {
        this.transactionCallbacks.add(runnable);
    }

    public void beforeNotify() {
        this.sharedRealm.invalidateIterators();
    }

    public void close() {
        removeAllChangeListeners();
        this.startSendingNotificationsCallbacks.clear();
        this.finishedSendingNotificationsCallbacks.clear();
    }

    public void didChange() {
        this.realmObserverPairs.c(this.onChangeCallBack);
        if (!this.transactionCallbacks.isEmpty()) {
            List<Runnable> list = this.transactionCallbacks;
            this.transactionCallbacks = new ArrayList();
            for (Runnable run : list) {
                run.run();
            }
        }
    }

    public void didSendNotifications() {
        for (int i2 = 0; i2 < this.startSendingNotificationsCallbacks.size(); i2++) {
            this.finishedSendingNotificationsCallbacks.get(i2).run();
        }
    }

    public int getListenersListSize() {
        return this.realmObserverPairs.g();
    }

    public abstract boolean post(Runnable runnable);

    public <E> void removeChangeListener(E e2, RealmChangeListener<E> realmChangeListener) {
        this.realmObserverPairs.e(e2, realmChangeListener);
    }

    public <E> void removeChangeListeners(E e2) {
        this.realmObserverPairs.f(e2);
    }

    public void willSendNotifications() {
        for (int i2 = 0; i2 < this.startSendingNotificationsCallbacks.size(); i2++) {
            this.startSendingNotificationsCallbacks.get(i2).run();
        }
    }
}
