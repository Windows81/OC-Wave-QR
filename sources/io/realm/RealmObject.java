package io.realm;

import io.reactivex.Flowable;
import io.reactivex.Observable;
import io.realm.ProxyState;
import io.realm.annotations.RealmClass;
import io.realm.internal.InvalidRow;
import io.realm.internal.ManageableObject;
import io.realm.internal.RealmObjectProxy;
import io.realm.internal.Row;
import io.realm.log.RealmLog;
import io.realm.rx.ObjectChange;
import java.util.Collections;
import javax.annotation.Nullable;

@RealmClass
public abstract class RealmObject implements RealmModel, ManageableObject {
    static final String MSG_DELETED_OBJECT = "the object is already deleted.";
    static final String MSG_DYNAMIC_OBJECT = "the object is an instance of DynamicRealmObject. Use DynamicRealmObject.getDynamicRealm() instead.";
    static final String MSG_NULL_OBJECT = "'model' is null.";

    public final <E extends RealmModel> void addChangeListener(RealmObjectChangeListener<E> realmObjectChangeListener) {
        addChangeListener(this, realmObjectChangeListener);
    }

    public final <E extends RealmObject> Observable<ObjectChange<E>> asChangesetObservable() {
        return asChangesetObservable(this);
    }

    public final <E extends RealmObject> Flowable<E> asFlowable() {
        return asFlowable(this);
    }

    public final void deleteFromRealm() {
        deleteFromRealm(this);
    }

    public final <E extends RealmModel> E freeze() {
        return freeze(this);
    }

    public Realm getRealm() {
        return getRealm(this);
    }

    public final boolean isFrozen() {
        return isFrozen(this);
    }

    public final boolean isLoaded() {
        return isLoaded(this);
    }

    public boolean isManaged() {
        return isManaged(this);
    }

    public final boolean isValid() {
        return isValid(this);
    }

    public final boolean load() {
        return load(this);
    }

    public final void removeAllChangeListeners() {
        removeAllChangeListeners(this);
    }

    public final void removeChangeListener(RealmObjectChangeListener realmObjectChangeListener) {
        removeChangeListener(this, realmObjectChangeListener);
    }

    public static <E extends RealmModel> Observable<ObjectChange<E>> asChangesetObservable(E e2) {
        if (e2 instanceof RealmObjectProxy) {
            BaseRealm d2 = ((RealmObjectProxy) e2).b().d();
            if (d2 instanceof Realm) {
                return d2.f39852B.n().c((Realm) d2, e2);
            }
            if (d2 instanceof DynamicRealm) {
                return d2.f39852B.n().a((DynamicRealm) d2, (DynamicRealmObject) e2);
            }
            throw new UnsupportedOperationException(d2.getClass() + " does not support RxJava. See https://realm.io/docs/java/latest/#rxjava for more details.");
        }
        throw new IllegalArgumentException("Cannot create Observables from unmanaged RealmObjects");
    }

    public static <E extends RealmModel> Flowable<E> asFlowable(E e2) {
        if (e2 instanceof RealmObjectProxy) {
            BaseRealm d2 = ((RealmObjectProxy) e2).b().d();
            if (d2 instanceof Realm) {
                return d2.f39852B.n().b((Realm) d2, e2);
            }
            if (d2 instanceof DynamicRealm) {
                return d2.f39852B.n().d((DynamicRealm) d2, (DynamicRealmObject) e2);
            }
            throw new UnsupportedOperationException(d2.getClass() + " does not support RxJava. See https://realm.io/docs/java/latest/#rxjava for more details.");
        }
        throw new IllegalArgumentException("Cannot create Observables from unmanaged RealmObjects");
    }

    public static <E extends RealmModel> void deleteFromRealm(E e2) {
        if (e2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) e2;
            if (realmObjectProxy.b().e() == null) {
                throw new IllegalStateException("Object malformed: missing object in Realm. Make sure to instantiate RealmObjects with Realm.createObject()");
            } else if (realmObjectProxy.b().d() != null) {
                realmObjectProxy.b().d().j();
                Row e3 = realmObjectProxy.b().e();
                e3.j().v(e3.S());
                realmObjectProxy.b().q(InvalidRow.INSTANCE);
            } else {
                throw new IllegalStateException("Object malformed: missing Realm. Make sure to instantiate RealmObjects with Realm.createObject()");
            }
        } else {
            throw new IllegalArgumentException("Object not managed by Realm, so it cannot be removed.");
        }
    }

    public static <E extends RealmModel> E freeze(E e2) {
        if (e2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) e2;
            BaseRealm d2 = realmObjectProxy.b().d();
            BaseRealm y2 = d2.N() ? d2 : d2.y();
            Row R = realmObjectProxy.b().e().R(y2.D);
            if (y2 instanceof DynamicRealm) {
                return new DynamicRealmObject(y2, R);
            }
            if (y2 instanceof Realm) {
                Class<? super Object> superclass = e2.getClass().getSuperclass();
                return y2.E().o().t(superclass, y2, R, d2.G().e(superclass), false, Collections.emptyList());
            }
            throw new UnsupportedOperationException("Unknown Realm type: " + y2.getClass().getName());
        }
        throw new IllegalArgumentException("It is only possible to freeze valid managed Realm objects.");
    }

    public static Realm getRealm(RealmModel realmModel) {
        if (realmModel == null) {
            throw new IllegalArgumentException(MSG_NULL_OBJECT);
        } else if (realmModel instanceof DynamicRealmObject) {
            throw new IllegalStateException(MSG_DYNAMIC_OBJECT);
        } else if (!(realmModel instanceof RealmObjectProxy)) {
            return null;
        } else {
            BaseRealm d2 = ((RealmObjectProxy) realmModel).b().d();
            d2.j();
            if (isValid(realmModel)) {
                return (Realm) d2;
            }
            throw new IllegalStateException(MSG_DELETED_OBJECT);
        }
    }

    public static <E extends RealmModel> boolean isFrozen(E e2) {
        if (e2 instanceof RealmObjectProxy) {
            return ((RealmObjectProxy) e2).b().d().N();
        }
        return false;
    }

    public static <E extends RealmModel> boolean isLoaded(E e2) {
        if (!(e2 instanceof RealmObjectProxy)) {
            return true;
        }
        RealmObjectProxy realmObjectProxy = (RealmObjectProxy) e2;
        realmObjectProxy.b().d().j();
        return realmObjectProxy.b().f();
    }

    public static <E extends RealmModel> boolean isManaged(E e2) {
        return e2 instanceof RealmObjectProxy;
    }

    public static <E extends RealmModel> boolean isValid(@Nullable E e2) {
        if (e2 instanceof RealmObjectProxy) {
            Row e3 = ((RealmObjectProxy) e2).b().e();
            if (e3 == null || !e3.d()) {
                return false;
            }
            return true;
        } else if (e2 != null) {
            return true;
        } else {
            return false;
        }
    }

    public static <E extends RealmModel> boolean load(E e2) {
        if (isLoaded(e2)) {
            return true;
        }
        if (!(e2 instanceof RealmObjectProxy)) {
            return false;
        }
        ((RealmObjectProxy) e2).b().h();
        return true;
    }

    public static <E extends RealmModel> void removeAllChangeListeners(E e2) {
        if (e2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) e2;
            BaseRealm d2 = realmObjectProxy.b().d();
            if (d2.isClosed()) {
                RealmLog.g("Calling removeChangeListener on a closed Realm %s, make sure to close all listeners before closing the Realm.", d2.f39852B.k());
            }
            realmObjectProxy.b().k();
            return;
        }
        throw new IllegalArgumentException("Cannot remove listeners from this unmanaged RealmObject (created outside of Realm)");
    }

    public final <E extends RealmModel> void addChangeListener(RealmChangeListener<E> realmChangeListener) {
        addChangeListener(this, realmChangeListener);
    }

    public final void removeChangeListener(RealmChangeListener realmChangeListener) {
        removeChangeListener(this, realmChangeListener);
    }

    public static <E extends RealmModel> void addChangeListener(E e2, RealmObjectChangeListener<E> realmObjectChangeListener) {
        if (e2 == null) {
            throw new IllegalArgumentException("Object should not be null");
        } else if (realmObjectChangeListener == null) {
            throw new IllegalArgumentException("Listener should not be null");
        } else if (e2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) e2;
            BaseRealm d2 = realmObjectProxy.b().d();
            d2.j();
            d2.D.capabilities.c("Listeners cannot be used on current thread.");
            realmObjectProxy.b().b(realmObjectChangeListener);
        } else {
            throw new IllegalArgumentException("Cannot add listener from this unmanaged RealmObject (created outside of Realm)");
        }
    }

    public static <E extends RealmModel> void removeChangeListener(E e2, RealmObjectChangeListener realmObjectChangeListener) {
        if (e2 == null) {
            throw new IllegalArgumentException("Object should not be null");
        } else if (realmObjectChangeListener == null) {
            throw new IllegalArgumentException("Listener should not be null");
        } else if (e2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) e2;
            BaseRealm d2 = realmObjectProxy.b().d();
            if (d2.isClosed()) {
                RealmLog.g("Calling removeChangeListener on a closed Realm %s, make sure to close all listeners before closing the Realm.", d2.f39852B.k());
            }
            realmObjectProxy.b().l(realmObjectChangeListener);
        } else {
            throw new IllegalArgumentException("Cannot remove listener from this unmanaged RealmObject (created outside of Realm)");
        }
    }

    public static <E extends RealmModel> void addChangeListener(E e2, RealmChangeListener<E> realmChangeListener) {
        addChangeListener(e2, new ProxyState.RealmChangeListenerWrapper(realmChangeListener));
    }

    public static <E extends RealmModel> void removeChangeListener(E e2, RealmChangeListener<E> realmChangeListener) {
        removeChangeListener(e2, (RealmObjectChangeListener) new ProxyState.RealmChangeListenerWrapper(realmChangeListener));
    }
}
