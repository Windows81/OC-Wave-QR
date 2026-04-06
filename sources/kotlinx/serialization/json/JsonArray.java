package kotlinx.serialization.json;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;

@Metadata
@Serializable(with = JsonArraySerializer.class)
public final class JsonArray extends JsonElement implements List<JsonElement>, KMappedMarker {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    /* renamed from: z  reason: collision with root package name */
    public final List f42265z;

    @Metadata
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<JsonArray> serializer() {
            return JsonArraySerializer.f42266a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JsonArray(List list) {
        super((DefaultConstructorMarker) null);
        Intrinsics.i(list, "content");
        this.f42265z = list;
    }

    public /* bridge */ /* synthetic */ void add(int i2, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(int i2, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof JsonElement)) {
            return false;
        }
        return e((JsonElement) obj);
    }

    public boolean containsAll(Collection collection) {
        Intrinsics.i(collection, "elements");
        return this.f42265z.containsAll(collection);
    }

    public boolean e(JsonElement jsonElement) {
        Intrinsics.i(jsonElement, "element");
        return this.f42265z.contains(jsonElement);
    }

    public boolean equals(Object obj) {
        return Intrinsics.d(this.f42265z, obj);
    }

    /* renamed from: g */
    public JsonElement get(int i2) {
        return (JsonElement) this.f42265z.get(i2);
    }

    public int h() {
        return this.f42265z.size();
    }

    public int hashCode() {
        return this.f42265z.hashCode();
    }

    public int i(JsonElement jsonElement) {
        Intrinsics.i(jsonElement, "element");
        return this.f42265z.indexOf(jsonElement);
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof JsonElement)) {
            return -1;
        }
        return i((JsonElement) obj);
    }

    public boolean isEmpty() {
        return this.f42265z.isEmpty();
    }

    public Iterator iterator() {
        return this.f42265z.iterator();
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof JsonElement)) {
            return -1;
        }
        return m((JsonElement) obj);
    }

    public ListIterator listIterator() {
        return this.f42265z.listIterator();
    }

    public int m(JsonElement jsonElement) {
        Intrinsics.i(jsonElement, "element");
        return this.f42265z.lastIndexOf(jsonElement);
    }

    public /* bridge */ /* synthetic */ Object remove(int i2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void replaceAll(UnaryOperator unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ Object set(int i2, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return h();
    }

    public void sort(Comparator comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public List subList(int i2, int i3) {
        return this.f42265z.subList(i2, i3);
    }

    public Object[] toArray() {
        return CollectionToArray.a(this);
    }

    public String toString() {
        return CollectionsKt.n0(this.f42265z, ",", "[", "]", 0, (CharSequence) null, (Function1) null, 56, (Object) null);
    }

    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public ListIterator listIterator(int i2) {
        return this.f42265z.listIterator(i2);
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Object[] toArray(Object[] objArr) {
        Intrinsics.i(objArr, "array");
        return CollectionToArray.b(this, objArr);
    }
}
