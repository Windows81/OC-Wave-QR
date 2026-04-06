package kotlinx.collections.immutable.adapters;

import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlinx.collections.immutable.ImmutableCollection;
import kotlinx.collections.immutable.ImmutableMap;
import kotlinx.collections.immutable.ImmutableSet;

@Metadata
public final class ImmutableMapAdapter<K, V> implements ImmutableMap<K, V>, Map<K, V>, KMappedMarker {

    /* renamed from: A  reason: collision with root package name */
    public final ImmutableSet f41238A;

    /* renamed from: B  reason: collision with root package name */
    public final ImmutableCollection f41239B;
    public final ImmutableSet C;

    /* renamed from: z  reason: collision with root package name */
    public final Map f41240z;

    /* renamed from: a */
    public final /* bridge */ ImmutableSet entrySet() {
        return b();
    }

    public ImmutableSet b() {
        return this.C;
    }

    public ImmutableSet c() {
        return this.f41238A;
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
        return this.f41240z.containsKey(obj);
    }

    public boolean containsValue(Object obj) {
        return this.f41240z.containsValue(obj);
    }

    public int e() {
        return this.f41240z.size();
    }

    public boolean equals(Object obj) {
        return this.f41240z.equals(obj);
    }

    public ImmutableCollection f() {
        return this.f41239B;
    }

    /* renamed from: g */
    public final /* bridge */ ImmutableSet keySet() {
        return c();
    }

    public Object get(Object obj) {
        return this.f41240z.get(obj);
    }

    /* renamed from: h */
    public final /* bridge */ ImmutableCollection values() {
        return f();
    }

    public int hashCode() {
        return this.f41240z.hashCode();
    }

    public boolean isEmpty() {
        return this.f41240z.isEmpty();
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
        return e();
    }

    public String toString() {
        return this.f41240z.toString();
    }

    public boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean replace(Object obj, Object obj2, Object obj3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
