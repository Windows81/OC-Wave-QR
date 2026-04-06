package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.lang.Enum;
import java.util.Map;
import java.util.Set;

@ElementTypesAreNonnullByDefault
public final class EnumHashBiMap<K extends Enum<K>, V> extends AbstractBiMap<K, V> {
    public /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    public /* bridge */ /* synthetic */ boolean containsValue(Object obj) {
        return super.containsValue(obj);
    }

    public /* bridge */ /* synthetic */ Set entrySet() {
        return super.entrySet();
    }

    /* renamed from: j0 */
    public Enum Y(Enum enumR) {
        return (Enum) Preconditions.q(enumR);
    }

    /* renamed from: k0 */
    public Object put(Enum enumR, Object obj) {
        return super.put(enumR, obj);
    }

    public /* bridge */ /* synthetic */ Set keySet() {
        return super.keySet();
    }

    public /* bridge */ /* synthetic */ void putAll(Map map) {
        super.putAll(map);
    }

    public /* bridge */ /* synthetic */ BiMap q1() {
        return super.q1();
    }

    public /* bridge */ /* synthetic */ Object remove(Object obj) {
        return super.remove(obj);
    }

    public /* bridge */ /* synthetic */ Set values() {
        return super.values();
    }
}
