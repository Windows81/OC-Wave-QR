package io.realm.internal;

import android.content.Context;
import io.realm.Realm;
import io.realm.RealmConfiguration;
import io.realm.exceptions.RealmException;
import java.lang.reflect.InvocationTargetException;

public class ObjectServerFacade {

    /* renamed from: a  reason: collision with root package name */
    public static final ObjectServerFacade f40137a = new ObjectServerFacade();

    /* renamed from: b  reason: collision with root package name */
    public static ObjectServerFacade f40138b;

    public interface RealmCacheAccessor {
    }

    public interface RealmInstanceFactory {
    }

    static {
        f40138b = null;
        try {
            f40138b = (ObjectServerFacade) Class.forName("io.realm.internal.SyncObjectServerFacade").getDeclaredConstructor((Class[]) null).newInstance((Object[]) null);
        } catch (ClassNotFoundException unused) {
        } catch (InstantiationException e2) {
            throw new RealmException("Failed to init SyncObjectServerFacade", e2);
        } catch (IllegalAccessException e3) {
            throw new RealmException("Failed to init SyncObjectServerFacade", e3);
        } catch (NoSuchMethodException e4) {
            throw new RealmException("Failed to init SyncObjectServerFacade", e4);
        } catch (InvocationTargetException e5) {
            throw new RealmException("Failed to init SyncObjectServerFacade", e5.getTargetException());
        }
    }

    public static ObjectServerFacade c(boolean z2) {
        return z2 ? f40138b : f40137a;
    }

    public static ObjectServerFacade e() {
        ObjectServerFacade objectServerFacade = f40138b;
        return objectServerFacade != null ? objectServerFacade : f40137a;
    }

    public void a(Realm realm, RealmConfiguration realmConfiguration) {
    }

    public void b(RealmConfiguration realmConfiguration) {
    }

    public Object[] d(RealmConfiguration realmConfiguration) {
        return new Object[19];
    }

    public String f(RealmConfiguration realmConfiguration) {
        return null;
    }

    public String g(RealmConfiguration realmConfiguration) {
        return null;
    }

    public void h(Context context, String str, RealmCacheAccessor realmCacheAccessor, RealmInstanceFactory realmInstanceFactory) {
    }

    public void i(RealmConfiguration realmConfiguration) {
    }

    public boolean j(Throwable th) {
        return false;
    }

    public void k(OsRealmConfig osRealmConfig) {
    }
}
