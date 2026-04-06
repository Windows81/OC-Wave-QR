package kotlinx.serialization.internal;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@Metadata
public final class LinkedHashMapSerializer<K, V> extends MapLikeSerializer<K, V, Map<K, ? extends V>, LinkedHashMap<K, V>> {

    /* renamed from: c  reason: collision with root package name */
    public final SerialDescriptor f42135c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LinkedHashMapSerializer(KSerializer kSerializer, KSerializer kSerializer2) {
        super(kSerializer, kSerializer2, (DefaultConstructorMarker) null);
        Intrinsics.i(kSerializer, "kSerializer");
        Intrinsics.i(kSerializer2, "vSerializer");
        this.f42135c = new LinkedHashMapClassDesc(kSerializer.a(), kSerializer2.a());
    }

    /* renamed from: A */
    public LinkedHashMap p(Map map) {
        Intrinsics.i(map, "<this>");
        LinkedHashMap linkedHashMap = map instanceof LinkedHashMap ? (LinkedHashMap) map : null;
        return linkedHashMap == null ? new LinkedHashMap(map) : linkedHashMap;
    }

    /* renamed from: B */
    public Map q(LinkedHashMap linkedHashMap) {
        Intrinsics.i(linkedHashMap, "<this>");
        return linkedHashMap;
    }

    public SerialDescriptor a() {
        return this.f42135c;
    }

    /* renamed from: v */
    public LinkedHashMap f() {
        return new LinkedHashMap();
    }

    /* renamed from: w */
    public int g(LinkedHashMap linkedHashMap) {
        Intrinsics.i(linkedHashMap, "<this>");
        return linkedHashMap.size() * 2;
    }

    /* renamed from: x */
    public void h(LinkedHashMap linkedHashMap, int i2) {
        Intrinsics.i(linkedHashMap, "<this>");
    }

    /* renamed from: y */
    public Iterator i(Map map) {
        Intrinsics.i(map, "<this>");
        return map.entrySet().iterator();
    }

    /* renamed from: z */
    public int j(Map map) {
        Intrinsics.i(map, "<this>");
        return map.size();
    }
}
