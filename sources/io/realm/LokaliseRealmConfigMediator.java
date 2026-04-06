package io.realm;

import com.lokalise.sdk.local_db.GlobalConfig;
import com.lokalise.sdk.local_db.LocaleConfig;
import com.lokalise.sdk.local_db.Translations;
import io.realm.BaseRealm;
import io.realm.annotations.RealmModule;
import io.realm.com_lokalise_sdk_local_db_GlobalConfigRealmProxy;
import io.realm.com_lokalise_sdk_local_db_LocaleConfigRealmProxy;
import io.realm.com_lokalise_sdk_local_db_TranslationsRealmProxy;
import io.realm.internal.ColumnInfo;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.RealmObjectProxy;
import io.realm.internal.RealmProxyMediator;
import io.realm.internal.Row;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

@RealmModule
class LokaliseRealmConfigMediator extends RealmProxyMediator {

    /* renamed from: a  reason: collision with root package name */
    public static final Set f39896a;

    static {
        HashSet hashSet = new HashSet(3);
        hashSet.add(Translations.class);
        hashSet.add(LocaleConfig.class);
        hashSet.add(GlobalConfig.class);
        f39896a = Collections.unmodifiableSet(hashSet);
    }

    public RealmModel c(Realm realm, RealmModel realmModel, boolean z2, Map map, Set set) {
        Class<?> superclass = realmModel instanceof RealmObjectProxy ? realmModel.getClass().getSuperclass() : realmModel.getClass();
        Class<Translations> cls = Translations.class;
        if (superclass.equals(cls)) {
            return (RealmModel) superclass.cast(com_lokalise_sdk_local_db_TranslationsRealmProxy.d(realm, (com_lokalise_sdk_local_db_TranslationsRealmProxy.TranslationsColumnInfo) realm.G().e(cls), (Translations) realmModel, z2, map, set));
        }
        Class<LocaleConfig> cls2 = LocaleConfig.class;
        if (superclass.equals(cls2)) {
            return (RealmModel) superclass.cast(com_lokalise_sdk_local_db_LocaleConfigRealmProxy.d(realm, (com_lokalise_sdk_local_db_LocaleConfigRealmProxy.LocaleConfigColumnInfo) realm.G().e(cls2), (LocaleConfig) realmModel, z2, map, set));
        }
        Class<GlobalConfig> cls3 = GlobalConfig.class;
        if (superclass.equals(cls3)) {
            return (RealmModel) superclass.cast(com_lokalise_sdk_local_db_GlobalConfigRealmProxy.d(realm, (com_lokalise_sdk_local_db_GlobalConfigRealmProxy.GlobalConfigColumnInfo) realm.G().e(cls3), (GlobalConfig) realmModel, z2, map, set));
        }
        throw RealmProxyMediator.h(superclass);
    }

    public ColumnInfo d(Class cls, OsSchemaInfo osSchemaInfo) {
        RealmProxyMediator.a(cls);
        if (cls.equals(Translations.class)) {
            return com_lokalise_sdk_local_db_TranslationsRealmProxy.e(osSchemaInfo);
        }
        if (cls.equals(LocaleConfig.class)) {
            return com_lokalise_sdk_local_db_LocaleConfigRealmProxy.e(osSchemaInfo);
        }
        if (cls.equals(GlobalConfig.class)) {
            return com_lokalise_sdk_local_db_GlobalConfigRealmProxy.e(osSchemaInfo);
        }
        throw RealmProxyMediator.h(cls);
    }

    public Class f(String str) {
        RealmProxyMediator.b(str);
        if (str.equals("Translations")) {
            return Translations.class;
        }
        if (str.equals("LocaleConfig")) {
            return LocaleConfig.class;
        }
        if (str.equals("GlobalConfig")) {
            return GlobalConfig.class;
        }
        throw RealmProxyMediator.i(str);
    }

    public Map g() {
        HashMap hashMap = new HashMap(3);
        hashMap.put(Translations.class, com_lokalise_sdk_local_db_TranslationsRealmProxy.g());
        hashMap.put(LocaleConfig.class, com_lokalise_sdk_local_db_LocaleConfigRealmProxy.g());
        hashMap.put(GlobalConfig.class, com_lokalise_sdk_local_db_GlobalConfigRealmProxy.g());
        return hashMap;
    }

    public Set j() {
        return f39896a;
    }

    public String m(Class cls) {
        RealmProxyMediator.a(cls);
        if (cls.equals(Translations.class)) {
            return "Translations";
        }
        if (cls.equals(LocaleConfig.class)) {
            return "LocaleConfig";
        }
        if (cls.equals(GlobalConfig.class)) {
            return "GlobalConfig";
        }
        throw RealmProxyMediator.h(cls);
    }

    public boolean o(Class cls) {
        return LocaleConfig.class.isAssignableFrom(cls) || GlobalConfig.class.isAssignableFrom(cls);
    }

    public long p(Realm realm, RealmModel realmModel, Map map) {
        Class<?> superclass = realmModel instanceof RealmObjectProxy ? realmModel.getClass().getSuperclass() : realmModel.getClass();
        if (superclass.equals(Translations.class)) {
            return com_lokalise_sdk_local_db_TranslationsRealmProxy.h(realm, (Translations) realmModel, map);
        }
        if (superclass.equals(LocaleConfig.class)) {
            return com_lokalise_sdk_local_db_LocaleConfigRealmProxy.h(realm, (LocaleConfig) realmModel, map);
        }
        if (superclass.equals(GlobalConfig.class)) {
            return com_lokalise_sdk_local_db_GlobalConfigRealmProxy.h(realm, (GlobalConfig) realmModel, map);
        }
        throw RealmProxyMediator.h(superclass);
    }

    public long q(Realm realm, RealmModel realmModel, Map map) {
        Class<?> superclass = realmModel instanceof RealmObjectProxy ? realmModel.getClass().getSuperclass() : realmModel.getClass();
        if (superclass.equals(Translations.class)) {
            return com_lokalise_sdk_local_db_TranslationsRealmProxy.i(realm, (Translations) realmModel, map);
        }
        if (superclass.equals(LocaleConfig.class)) {
            return com_lokalise_sdk_local_db_LocaleConfigRealmProxy.i(realm, (LocaleConfig) realmModel, map);
        }
        if (superclass.equals(GlobalConfig.class)) {
            return com_lokalise_sdk_local_db_GlobalConfigRealmProxy.i(realm, (GlobalConfig) realmModel, map);
        }
        throw RealmProxyMediator.h(superclass);
    }

    public void r(Realm realm, Collection collection) {
        Iterator it = collection.iterator();
        HashMap hashMap = new HashMap(collection.size());
        if (it.hasNext()) {
            RealmModel realmModel = (RealmModel) it.next();
            Class<?> superclass = realmModel instanceof RealmObjectProxy ? realmModel.getClass().getSuperclass() : realmModel.getClass();
            Class<Translations> cls = Translations.class;
            Class<GlobalConfig> cls2 = GlobalConfig.class;
            Class<LocaleConfig> cls3 = LocaleConfig.class;
            if (superclass.equals(cls)) {
                com_lokalise_sdk_local_db_TranslationsRealmProxy.i(realm, (Translations) realmModel, hashMap);
            } else if (superclass.equals(cls3)) {
                com_lokalise_sdk_local_db_LocaleConfigRealmProxy.i(realm, (LocaleConfig) realmModel, hashMap);
            } else if (superclass.equals(cls2)) {
                com_lokalise_sdk_local_db_GlobalConfigRealmProxy.i(realm, (GlobalConfig) realmModel, hashMap);
            } else {
                throw RealmProxyMediator.h(superclass);
            }
            if (!it.hasNext()) {
                return;
            }
            if (superclass.equals(cls)) {
                com_lokalise_sdk_local_db_TranslationsRealmProxy.j(realm, it, hashMap);
            } else if (superclass.equals(cls3)) {
                com_lokalise_sdk_local_db_LocaleConfigRealmProxy.j(realm, it, hashMap);
            } else if (superclass.equals(cls2)) {
                com_lokalise_sdk_local_db_GlobalConfigRealmProxy.j(realm, it, hashMap);
            } else {
                throw RealmProxyMediator.h(superclass);
            }
        }
    }

    public boolean s(Class cls) {
        if (cls.equals(Translations.class) || cls.equals(LocaleConfig.class) || cls.equals(GlobalConfig.class)) {
            return false;
        }
        throw RealmProxyMediator.h(cls);
    }

    public RealmModel t(Class cls, Object obj, Row row, ColumnInfo columnInfo, boolean z2, List list) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.J.get();
        try {
            realmObjectContext.g((BaseRealm) obj, row, columnInfo, z2, list);
            RealmProxyMediator.a(cls);
            if (cls.equals(Translations.class)) {
                return (RealmModel) cls.cast(new com_lokalise_sdk_local_db_TranslationsRealmProxy());
            }
            if (cls.equals(LocaleConfig.class)) {
                RealmModel realmModel = (RealmModel) cls.cast(new com_lokalise_sdk_local_db_LocaleConfigRealmProxy());
                realmObjectContext.a();
                return realmModel;
            } else if (cls.equals(GlobalConfig.class)) {
                RealmModel realmModel2 = (RealmModel) cls.cast(new com_lokalise_sdk_local_db_GlobalConfigRealmProxy());
                realmObjectContext.a();
                return realmModel2;
            } else {
                throw RealmProxyMediator.h(cls);
            }
        } finally {
            realmObjectContext.a();
        }
    }

    public boolean u() {
        return true;
    }

    public void v(Realm realm, RealmModel realmModel, RealmModel realmModel2, Map map, Set set) {
        Class<? super Object> superclass = realmModel2.getClass().getSuperclass();
        if (superclass.equals(Translations.class)) {
            throw RealmProxyMediator.k("com.lokalise.sdk.local_db.Translations");
        } else if (superclass.equals(LocaleConfig.class)) {
            throw RealmProxyMediator.k("com.lokalise.sdk.local_db.LocaleConfig");
        } else if (superclass.equals(GlobalConfig.class)) {
            throw RealmProxyMediator.k("com.lokalise.sdk.local_db.GlobalConfig");
        } else {
            throw RealmProxyMediator.h(superclass);
        }
    }
}
