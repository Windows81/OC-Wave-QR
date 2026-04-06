package kotlin.collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata
public abstract class AbstractMap<K, V> implements Map<K, V>, KMappedMarker {

    /* renamed from: B  reason: collision with root package name */
    public static final Companion f40570B = new Companion((DefaultConstructorMarker) null);

    /* renamed from: A  reason: collision with root package name */
    public volatile Collection f40571A;

    /* renamed from: z  reason: collision with root package name */
    public volatile Set f40572z;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public static final CharSequence m(AbstractMap abstractMap, Map.Entry entry) {
        Intrinsics.i(entry, "it");
        return abstractMap.k(entry);
    }

    public final boolean c(Map.Entry entry) {
        if (entry == null) {
            return false;
        }
        Object key = entry.getKey();
        Object value = entry.getValue();
        Intrinsics.g(this, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
        Object obj = get(key);
        if (!Intrinsics.d(value, obj)) {
            return false;
        }
        if (obj != null) {
            return true;
        }
        Intrinsics.g(this, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.containsKey, *>");
        return containsKey(key);
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean containsKey(Object obj) {
        return i(obj) != null;
    }

    public boolean containsValue(Object obj) {
        Iterable<Map.Entry> entrySet = entrySet();
        if ((entrySet instanceof Collection) && ((Collection) entrySet).isEmpty()) {
            return false;
        }
        for (Map.Entry value : entrySet) {
            if (Intrinsics.d(value.getValue(), obj)) {
                return true;
            }
        }
        return false;
    }

    public abstract Set e();

    public final /* bridge */ Set entrySet() {
        return e();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (size() != map.size()) {
            return false;
        }
        Iterable<Map.Entry> entrySet = map.entrySet();
        if ((entrySet instanceof Collection) && ((Collection) entrySet).isEmpty()) {
            return true;
        }
        for (Map.Entry c2 : entrySet) {
            if (!c(c2)) {
                return false;
            }
        }
        return true;
    }

    public Set f() {
        if (this.f40572z == null) {
            this.f40572z = new AbstractMap$keys$1(this);
        }
        Set set = this.f40572z;
        Intrinsics.f(set);
        return set;
    }

    public int g() {
        return entrySet().size();
    }

    public Object get(Object obj) {
        Map.Entry i2 = i(obj);
        if (i2 != null) {
            return i2.getValue();
        }
        return null;
    }

    public Collection h() {
        if (this.f40571A == null) {
            this.f40571A = new AbstractMap$values$1(this);
        }
        Collection collection = this.f40571A;
        Intrinsics.f(collection);
        return collection;
    }

    public int hashCode() {
        return entrySet().hashCode();
    }

    public final Map.Entry i(Object obj) {
        Object obj2;
        Iterator it = entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (Intrinsics.d(((Map.Entry) obj2).getKey(), obj)) {
                break;
            }
        }
        return (Map.Entry) obj2;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public final String j(Object obj) {
        return obj == this ? "(this Map)" : String.valueOf(obj);
    }

    public final String k(Map.Entry entry) {
        return j(entry.getKey()) + '=' + j(entry.getValue());
    }

    public final /* bridge */ Set keySet() {
        return f();
    }

    public Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return g();
    }

    public String toString() {
        return CollectionsKt.n0(entrySet(), ", ", "{", "}", 0, (CharSequence) null, new b(this), 24, (Object) null);
    }

    public final /* bridge */ Collection values() {
        return h();
    }
}
