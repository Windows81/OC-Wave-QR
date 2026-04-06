package androidx.collection;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata
class MapWrapper<K, V> implements Map<K, V>, KMappedMarker {

    /* renamed from: A  reason: collision with root package name */
    public Entries f1866A;

    /* renamed from: B  reason: collision with root package name */
    public Keys f1867B;
    public Values C;

    /* renamed from: z  reason: collision with root package name */
    public final ScatterMap f1868z;

    public MapWrapper(ScatterMap scatterMap) {
        Intrinsics.i(scatterMap, "parent");
        this.f1868z = scatterMap;
    }

    public Set a() {
        Entries entries = this.f1866A;
        if (entries != null) {
            return entries;
        }
        Entries entries2 = new Entries(this.f1868z);
        this.f1866A = entries2;
        return entries2;
    }

    public Set b() {
        Keys keys = this.f1867B;
        if (keys != null) {
            return keys;
        }
        Keys keys2 = new Keys(this.f1868z);
        this.f1867B = keys2;
        return keys2;
    }

    public int c() {
        return this.f1868z.f1963e;
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Object compute(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Object computeIfAbsent(Object obj, Function function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Object computeIfPresent(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean containsKey(Object obj) {
        return this.f1868z.c(obj);
    }

    public boolean containsValue(Object obj) {
        return this.f1868z.d(obj);
    }

    public Collection e() {
        Values values = this.C;
        if (values != null) {
            return values;
        }
        Values values2 = new Values(this.f1868z);
        this.C = values2;
        return values2;
    }

    public final /* bridge */ Set entrySet() {
        return a();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Intrinsics.d(this.f1868z, ((MapWrapper) obj).f1868z);
    }

    public Object get(Object obj) {
        return this.f1868z.e(obj);
    }

    public int hashCode() {
        return this.f1868z.hashCode();
    }

    public boolean isEmpty() {
        return this.f1868z.h();
    }

    public final /* bridge */ Set keySet() {
        return b();
    }

    public Object merge(Object obj, Object obj2, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Object putIfAbsent(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Object replace(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void replaceAll(BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return c();
    }

    public String toString() {
        return this.f1868z.toString();
    }

    public final /* bridge */ Collection values() {
        return e();
    }

    public boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean replace(Object obj, Object obj2, Object obj3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
