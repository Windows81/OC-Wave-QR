package org.bson.util;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import org.bson.util.AbstractCopyOnWriteMap;

abstract class CopyOnWriteMap<K, V> extends AbstractCopyOnWriteMap<K, V, Map<K, V>> {

    public static class Builder<K, V> {

        /* renamed from: a  reason: collision with root package name */
        public AbstractCopyOnWriteMap.View.Type f44069a = AbstractCopyOnWriteMap.View.Type.STABLE;

        /* renamed from: b  reason: collision with root package name */
        public final Map f44070b = new HashMap();

        public CopyOnWriteMap a() {
            return new Hash(this.f44070b, this.f44069a);
        }
    }

    public static class Hash<K, V> extends CopyOnWriteMap<K, V> {
        public Hash(Map map, AbstractCopyOnWriteMap.View.Type type) {
            super(map, type);
        }

        public Map e(Map map) {
            return new HashMap(map);
        }
    }

    public static class Linked<K, V> extends CopyOnWriteMap<K, V> {
        public Map e(Map map) {
            return new LinkedHashMap(map);
        }
    }

    public CopyOnWriteMap(Map map, AbstractCopyOnWriteMap.View.Type type) {
        super(map, type);
    }

    public static Builder h() {
        return new Builder();
    }

    public static CopyOnWriteMap i() {
        return h().a();
    }
}
