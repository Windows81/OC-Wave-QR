package com.google.common.collect;

import com.google.common.base.Function;
import com.google.common.collect.MapMaker;
import com.google.common.collect.MapMakerInternalMap;

@ElementTypesAreNonnullByDefault
public final class Interners {

    public static class InternerBuilder {
    }

    public static class InternerFunction<E> implements Function<E, E> {

        /* renamed from: z  reason: collision with root package name */
        public final Interner f28220z;

        public Object apply(Object obj) {
            return this.f28220z.a(obj);
        }

        public boolean equals(Object obj) {
            if (obj instanceof InternerFunction) {
                return this.f28220z.equals(((InternerFunction) obj).f28220z);
            }
            return false;
        }

        public int hashCode() {
            return this.f28220z.hashCode();
        }
    }

    public static final class InternerImpl<E> implements Interner<E> {

        /* renamed from: a  reason: collision with root package name */
        public final MapMakerInternalMap f28221a;

        public Object a(Object obj) {
            Object key;
            do {
                MapMakerInternalMap.InternalEntry e2 = this.f28221a.e(obj);
                if (e2 != null && (key = e2.getKey()) != null) {
                    return key;
                }
            } while (((MapMaker.Dummy) this.f28221a.putIfAbsent(obj, MapMaker.Dummy.VALUE)) != null);
            return obj;
        }
    }
}
