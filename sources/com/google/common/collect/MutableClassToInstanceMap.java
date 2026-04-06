package com.google.common.collect;

import com.google.common.primitives.Primitives;
import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

@ElementTypesAreNonnullByDefault
public final class MutableClassToInstanceMap<B> extends ForwardingMap<Class<? extends B>, B> implements ClassToInstanceMap<B>, Serializable {

    /* renamed from: z  reason: collision with root package name */
    public final Map f28470z;

    public static final class SerializedForm<B> implements Serializable {
    }

    public static Object U(Class cls, Object obj) {
        return Primitives.b(cls).cast(obj);
    }

    public static Map.Entry V(final Map.Entry entry) {
        return new ForwardingMapEntry<Class<Object>, Object>() {
            /* renamed from: Q */
            public Map.Entry M() {
                return entry;
            }

            public Object setValue(Object obj) {
                return super.setValue(MutableClassToInstanceMap.U((Class) getKey(), obj));
            }
        };
    }

    /* renamed from: Q */
    public Map M() {
        return this.f28470z;
    }

    /* renamed from: W */
    public Object put(Class cls, Object obj) {
        return super.put(cls, U(cls, obj));
    }

    public Set entrySet() {
        return new ForwardingSet<Map.Entry<Class<? extends B>, B>>() {
            /* renamed from: Z */
            public Set Q() {
                return MutableClassToInstanceMap.this.M().entrySet();
            }

            public Iterator iterator() {
                return new TransformedIterator<Map.Entry<Class<? extends B>, B>, Map.Entry<Class<? extends B>, B>>(this, Q().iterator()) {
                    /* renamed from: c */
                    public Map.Entry b(Map.Entry entry) {
                        return MutableClassToInstanceMap.V(entry);
                    }
                };
            }

            public Object[] toArray() {
                return V();
            }

            public Object[] toArray(Object[] objArr) {
                return W(objArr);
            }
        };
    }

    public void putAll(Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            U((Class) entry.getKey(), entry.getValue());
        }
        super.putAll(linkedHashMap);
    }
}
