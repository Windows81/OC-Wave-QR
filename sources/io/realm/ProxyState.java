package io.realm;

import io.realm.RealmModel;
import io.realm.internal.ObserverPairList;
import io.realm.internal.OsObject;
import io.realm.internal.OsSharedRealm;
import io.realm.internal.PendingRow;
import io.realm.internal.Row;
import io.realm.internal.UncheckedRow;
import java.util.List;

public final class ProxyState<E extends RealmModel> implements PendingRow.FrontEnd {

    /* renamed from: i  reason: collision with root package name */
    public static QueryCallback f39925i = new QueryCallback();

    /* renamed from: a  reason: collision with root package name */
    public RealmModel f39926a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f39927b = true;

    /* renamed from: c  reason: collision with root package name */
    public Row f39928c;

    /* renamed from: d  reason: collision with root package name */
    public OsObject f39929d;

    /* renamed from: e  reason: collision with root package name */
    public BaseRealm f39930e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f39931f;

    /* renamed from: g  reason: collision with root package name */
    public List f39932g;

    /* renamed from: h  reason: collision with root package name */
    public ObserverPairList f39933h = new ObserverPairList();

    public static class QueryCallback implements ObserverPairList.Callback<OsObject.ObjectObserverPair> {
        public QueryCallback() {
        }

        /* renamed from: b */
        public void a(OsObject.ObjectObserverPair objectObserverPair, Object obj) {
            objectObserverPair.a((RealmModel) obj, (ObjectChangeSet) null);
        }
    }

    public static class RealmChangeListenerWrapper<T extends RealmModel> implements RealmObjectChangeListener<T> {

        /* renamed from: a  reason: collision with root package name */
        public final RealmChangeListener f39934a;

        public RealmChangeListenerWrapper(RealmChangeListener realmChangeListener) {
            if (realmChangeListener != null) {
                this.f39934a = realmChangeListener;
                return;
            }
            throw new IllegalArgumentException("Listener should not be null");
        }

        public void a(RealmModel realmModel, ObjectChangeSet objectChangeSet) {
            this.f39934a.a(realmModel);
        }

        public boolean equals(Object obj) {
            return (obj instanceof RealmChangeListenerWrapper) && this.f39934a == ((RealmChangeListenerWrapper) obj).f39934a;
        }

        public int hashCode() {
            return this.f39934a.hashCode();
        }
    }

    public ProxyState(RealmModel realmModel) {
        this.f39926a = realmModel;
    }

    public void a(Row row) {
        this.f39928c = row;
        i();
        if (row.d()) {
            j();
        }
    }

    public void b(RealmObjectChangeListener realmObjectChangeListener) {
        Row row = this.f39928c;
        if (row instanceof PendingRow) {
            this.f39933h.a(new OsObject.ObjectObserverPair(this.f39926a, realmObjectChangeListener));
        } else if (row instanceof UncheckedRow) {
            j();
            OsObject osObject = this.f39929d;
            if (osObject != null) {
                osObject.addListener(this.f39926a, realmObjectChangeListener);
            }
        }
    }

    public boolean c() {
        return this.f39931f;
    }

    public BaseRealm d() {
        return this.f39930e;
    }

    public Row e() {
        return this.f39928c;
    }

    public boolean f() {
        return this.f39928c.isLoaded();
    }

    public boolean g() {
        return this.f39927b;
    }

    public void h() {
        Row row = this.f39928c;
        if (row instanceof PendingRow) {
            ((PendingRow) row).c();
        }
    }

    public final void i() {
        this.f39933h.c(f39925i);
    }

    public final void j() {
        OsSharedRealm osSharedRealm = this.f39930e.D;
        if (osSharedRealm != null && !osSharedRealm.isClosed() && this.f39928c.d() && this.f39929d == null) {
            OsObject osObject = new OsObject(this.f39930e.D, (UncheckedRow) this.f39928c);
            this.f39929d = osObject;
            osObject.setObserverPairs(this.f39933h);
            this.f39933h = null;
        }
    }

    public void k() {
        OsObject osObject = this.f39929d;
        if (osObject != null) {
            osObject.removeListener(this.f39926a);
        } else {
            this.f39933h.b();
        }
    }

    public void l(RealmObjectChangeListener realmObjectChangeListener) {
        OsObject osObject = this.f39929d;
        if (osObject != null) {
            osObject.removeListener(this.f39926a, realmObjectChangeListener);
        } else {
            this.f39933h.e(this.f39926a, realmObjectChangeListener);
        }
    }

    public void m(boolean z2) {
        this.f39931f = z2;
    }

    public void n() {
        this.f39927b = false;
        this.f39932g = null;
    }

    public void o(List list) {
        this.f39932g = list;
    }

    public void p(BaseRealm baseRealm) {
        this.f39930e = baseRealm;
    }

    public void q(Row row) {
        this.f39928c = row;
    }
}
