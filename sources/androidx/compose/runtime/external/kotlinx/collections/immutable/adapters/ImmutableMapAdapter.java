package androidx.compose.runtime.external.kotlinx.collections.immutable.adapters;

import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableCollection;
import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableSet;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata
public final class ImmutableMapAdapter<K, V> implements ImmutableMap<K, V>, Map<K, V>, KMappedMarker {

    /* renamed from: A  reason: collision with root package name */
    public final ImmutableSet f15022A;

    /* renamed from: B  reason: collision with root package name */
    public final ImmutableCollection f15023B;
    public final ImmutableSet C;

    /* renamed from: z  reason: collision with root package name */
    public final Map f15024z;

    /* renamed from: a */
    public final /* bridge */ ImmutableSet entrySet() {
        return b();
    }

    public ImmutableSet b() {
        return this.C;
    }

    public ImmutableSet c() {
        return this.f15022A;
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
        return this.f15024z.containsKey(obj);
    }

    public boolean containsValue(Object obj) {
        return this.f15024z.containsValue(obj);
    }

    public int e() {
        return this.f15024z.size();
    }

    public boolean equals(Object obj) {
        return this.f15024z.equals(obj);
    }

    public ImmutableCollection f() {
        return this.f15023B;
    }

    /* renamed from: g */
    public final /* bridge */ ImmutableSet keySet() {
        return c();
    }

    public Object get(Object obj) {
        return this.f15024z.get(obj);
    }

    /* renamed from: h */
    public final /* bridge */ ImmutableCollection values() {
        return f();
    }

    public int hashCode() {
        return this.f15024z.hashCode();
    }

    public boolean isEmpty() {
        return this.f15024z.isEmpty();
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
        return this.f15024z.toString();
    }

    public boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean replace(Object obj, Object obj2, Object obj3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
