package kotlinx.serialization.internal;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.descriptors.StructureKind;

@Metadata
public final class MapEntrySerializer<K, V> extends KeyValueSerializer<K, V, Map.Entry<? extends K, ? extends V>> {

    /* renamed from: c  reason: collision with root package name */
    public final SerialDescriptor f42144c;

    @Metadata
    public static final class MapEntry<K, V> implements Map.Entry<K, V>, KMappedMarker {

        /* renamed from: A  reason: collision with root package name */
        public final Object f42145A;

        /* renamed from: z  reason: collision with root package name */
        public final Object f42146z;

        public MapEntry(Object obj, Object obj2) {
            this.f42146z = obj;
            this.f42145A = obj2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MapEntry)) {
                return false;
            }
            MapEntry mapEntry = (MapEntry) obj;
            return Intrinsics.d(this.f42146z, mapEntry.f42146z) && Intrinsics.d(this.f42145A, mapEntry.f42145A);
        }

        public Object getKey() {
            return this.f42146z;
        }

        public Object getValue() {
            return this.f42145A;
        }

        public int hashCode() {
            Object obj = this.f42146z;
            int i2 = 0;
            int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
            Object obj2 = this.f42145A;
            if (obj2 != null) {
                i2 = obj2.hashCode();
            }
            return hashCode + i2;
        }

        public Object setValue(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public String toString() {
            return "MapEntry(key=" + this.f42146z + ", value=" + this.f42145A + ')';
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MapEntrySerializer(KSerializer kSerializer, KSerializer kSerializer2) {
        super(kSerializer, kSerializer2, (DefaultConstructorMarker) null);
        Intrinsics.i(kSerializer, "keySerializer");
        Intrinsics.i(kSerializer2, "valueSerializer");
        this.f42144c = SerialDescriptorsKt.g("kotlin.collections.Map.Entry", StructureKind.MAP.f42060a, new SerialDescriptor[0], new d(kSerializer, kSerializer2));
    }

    public static final Unit l(KSerializer kSerializer, KSerializer kSerializer2, ClassSerialDescriptorBuilder classSerialDescriptorBuilder) {
        Intrinsics.i(classSerialDescriptorBuilder, "$this$buildSerialDescriptor");
        ClassSerialDescriptorBuilder classSerialDescriptorBuilder2 = classSerialDescriptorBuilder;
        ClassSerialDescriptorBuilder.b(classSerialDescriptorBuilder2, "key", kSerializer.a(), (List) null, false, 12, (Object) null);
        ClassSerialDescriptorBuilder.b(classSerialDescriptorBuilder2, "value", kSerializer2.a(), (List) null, false, 12, (Object) null);
        return Unit.f40552a;
    }

    public SerialDescriptor a() {
        return this.f42144c;
    }

    /* renamed from: m */
    public Object f(Map.Entry entry) {
        Intrinsics.i(entry, "<this>");
        return entry.getKey();
    }

    /* renamed from: n */
    public Object h(Map.Entry entry) {
        Intrinsics.i(entry, "<this>");
        return entry.getValue();
    }

    /* renamed from: o */
    public Map.Entry j(Object obj, Object obj2) {
        return new MapEntry(obj, obj2);
    }
}
