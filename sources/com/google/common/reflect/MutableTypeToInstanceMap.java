package com.google.common.reflect;

import com.google.common.base.Preconditions;
import com.google.common.collect.ForwardingMap;
import com.google.common.collect.ForwardingMapEntry;
import com.google.common.collect.ForwardingSet;
import com.google.common.collect.Iterators;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

@ElementTypesAreNonnullByDefault
public final class MutableTypeToInstanceMap<B> extends ForwardingMap<TypeToken<? extends B>, B> implements TypeToInstanceMap<B> {

    /* renamed from: z  reason: collision with root package name */
    public final Map f29217z;

    public static final class UnmodifiableEntry<K, V> extends ForwardingMapEntry<K, V> {

        /* renamed from: z  reason: collision with root package name */
        public final Map.Entry f29218z;

        public UnmodifiableEntry(Map.Entry entry) {
            this.f29218z = (Map.Entry) Preconditions.q(entry);
        }

        public static /* synthetic */ UnmodifiableEntry S(Map.Entry entry) {
            return new UnmodifiableEntry(entry);
        }

        public static Iterator V(Iterator it) {
            return Iterators.J(it, new a());
        }

        public static Set W(final Set set) {
            return new ForwardingSet<Map.Entry<Object, Object>>() {
                /* renamed from: Z */
                public Set Q() {
                    return set;
                }

                public Iterator iterator() {
                    return UnmodifiableEntry.V(super.iterator());
                }

                public Object[] toArray() {
                    return V();
                }

                public Object[] toArray(Object[] objArr) {
                    return W(objArr);
                }
            };
        }

        /* renamed from: Q */
        public Map.Entry M() {
            return this.f29218z;
        }

        public Object setValue(Object obj) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: Q */
    public Map M() {
        return this.f29217z;
    }

    /* renamed from: S */
    public Object put(TypeToken typeToken, Object obj) {
        throw new UnsupportedOperationException("Please use putInstance() instead.");
    }

    public Set entrySet() {
        return UnmodifiableEntry.W(super.entrySet());
    }

    public void putAll(Map map) {
        throw new UnsupportedOperationException("Please use putInstance() instead.");
    }
}
