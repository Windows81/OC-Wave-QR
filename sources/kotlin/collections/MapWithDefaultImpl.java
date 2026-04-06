package kotlin.collections;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata
final class MapWithDefaultImpl<K, V> implements MapWithDefault<K, V> {

    /* renamed from: A  reason: collision with root package name */
    public final Function1 f40623A;

    /* renamed from: z  reason: collision with root package name */
    public final Map f40624z;

    public Set a() {
        return c().entrySet();
    }

    public Set b() {
        return c().keySet();
    }

    public Map c() {
        return this.f40624z;
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean containsKey(Object obj) {
        return c().containsKey(obj);
    }

    public boolean containsValue(Object obj) {
        return c().containsValue(obj);
    }

    public int e() {
        return c().size();
    }

    public final /* bridge */ Set entrySet() {
        return a();
    }

    public boolean equals(Object obj) {
        return c().equals(obj);
    }

    public Collection f() {
        return c().values();
    }

    public Object get(Object obj) {
        return c().get(obj);
    }

    public int hashCode() {
        return c().hashCode();
    }

    public boolean isEmpty() {
        return c().isEmpty();
    }

    public final /* bridge */ Set keySet() {
        return b();
    }

    public Object m0(Object obj) {
        Map c2 = c();
        Object obj2 = c2.get(obj);
        return (obj2 != null || c2.containsKey(obj)) ? obj2 : this.f40623A.invoke(obj);
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
        return e();
    }

    public String toString() {
        return c().toString();
    }

    public final /* bridge */ Collection values() {
        return f();
    }
}
