package io.realm;

import io.realm.internal.OsMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

abstract class TypeSelectorForMap<K, V> {

    /* renamed from: a  reason: collision with root package name */
    public final BaseRealm f40087a;

    /* renamed from: b  reason: collision with root package name */
    public final OsMap f40088b;

    public Map.Entry a(BaseRealm baseRealm, long j2, Object obj) {
        throw new UnsupportedOperationException("Function 'getModelEntry' can only be called from 'LinkSelectorForMap' instances.");
    }

    public Object b(BaseRealm baseRealm, long j2) {
        throw new UnsupportedOperationException("Function 'getRealmModel' can only be called from 'LinkSelectorForMap' instances.");
    }

    public abstract Collection c();

    public abstract Set d();

    public Object e(BaseRealm baseRealm, OsMap osMap, Object obj, Object obj2) {
        throw new UnsupportedOperationException("Function 'putRealmModel' can only be called from 'LinkSelectorForMap' instances.");
    }
}
