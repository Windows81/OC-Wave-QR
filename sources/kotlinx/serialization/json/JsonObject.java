package kotlinx.serialization.json;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.json.internal.StringOpsKt;

@Metadata
@Serializable(with = JsonObjectSerializer.class)
public final class JsonObject extends JsonElement implements Map<String, JsonElement>, KMappedMarker {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    /* renamed from: z  reason: collision with root package name */
    public final Map f42325z;

    @Metadata
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<JsonObject> serializer() {
            return JsonObjectSerializer.f42326a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JsonObject(Map map) {
        super((DefaultConstructorMarker) null);
        Intrinsics.i(map, "content");
        this.f42325z = map;
    }

    public static final CharSequence s(Map.Entry entry) {
        Intrinsics.i(entry, "<destruct>");
        StringBuilder sb = new StringBuilder();
        StringOpsKt.c(sb, (String) entry.getKey());
        sb.append(':');
        sb.append((JsonElement) entry.getValue());
        String sb2 = sb.toString();
        Intrinsics.h(sb2, "toString(...)");
        return sb2;
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ boolean containsKey(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        return g((String) obj);
    }

    public final /* bridge */ boolean containsValue(Object obj) {
        if (!(obj instanceof JsonElement)) {
            return false;
        }
        return h((JsonElement) obj);
    }

    public final /* bridge */ Set entrySet() {
        return m();
    }

    public boolean equals(Object obj) {
        return Intrinsics.d(this.f42325z, obj);
    }

    public boolean g(String str) {
        Intrinsics.i(str, "key");
        return this.f42325z.containsKey(str);
    }

    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        return i((String) obj);
    }

    public boolean h(JsonElement jsonElement) {
        Intrinsics.i(jsonElement, "value");
        return this.f42325z.containsValue(jsonElement);
    }

    public int hashCode() {
        return this.f42325z.hashCode();
    }

    public JsonElement i(String str) {
        Intrinsics.i(str, "key");
        return (JsonElement) this.f42325z.get(str);
    }

    public boolean isEmpty() {
        return this.f42325z.isEmpty();
    }

    public final /* bridge */ Set keySet() {
        return n();
    }

    public Set m() {
        return this.f42325z.entrySet();
    }

    public /* bridge */ /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Set n() {
        return this.f42325z.keySet();
    }

    public int o() {
        return this.f42325z.size();
    }

    public Collection p() {
        return this.f42325z.values();
    }

    public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: q */
    public JsonElement remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ Object replace(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void replaceAll(BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return o();
    }

    public String toString() {
        return CollectionsKt.n0(this.f42325z.entrySet(), ",", "{", "}", 0, (CharSequence) null, new g(), 24, (Object) null);
    }

    public final /* bridge */ Collection values() {
        return p();
    }

    public /* bridge */ /* synthetic */ boolean replace(Object obj, Object obj2, Object obj3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
