package kotlinx.serialization.internal;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@Metadata
public final class HashMapSerializer<K, V> extends MapLikeSerializer<K, V, Map<K, ? extends V>, HashMap<K, V>> {

    /* renamed from: c  reason: collision with root package name */
    public final SerialDescriptor f42122c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HashMapSerializer(KSerializer kSerializer, KSerializer kSerializer2) {
        super(kSerializer, kSerializer2, (DefaultConstructorMarker) null);
        Intrinsics.i(kSerializer, "kSerializer");
        Intrinsics.i(kSerializer2, "vSerializer");
        this.f42122c = new HashMapClassDesc(kSerializer.a(), kSerializer2.a());
    }

    /* renamed from: A */
    public HashMap p(Map map) {
        Intrinsics.i(map, "<this>");
        HashMap hashMap = map instanceof HashMap ? (HashMap) map : null;
        return hashMap == null ? new HashMap(map) : hashMap;
    }

    /* renamed from: B */
    public Map q(HashMap hashMap) {
        Intrinsics.i(hashMap, "<this>");
        return hashMap;
    }

    public SerialDescriptor a() {
        return this.f42122c;
    }

    /* renamed from: v */
    public HashMap f() {
        return new HashMap();
    }

    /* renamed from: w */
    public int g(HashMap hashMap) {
        Intrinsics.i(hashMap, "<this>");
        return hashMap.size() * 2;
    }

    /* renamed from: x */
    public void h(HashMap hashMap, int i2) {
        Intrinsics.i(hashMap, "<this>");
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
