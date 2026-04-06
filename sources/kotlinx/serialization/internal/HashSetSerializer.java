package kotlinx.serialization.internal;

import java.util.HashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@Metadata
public final class HashSetSerializer<E> extends CollectionSerializer<E, Set<? extends E>, HashSet<E>> {

    /* renamed from: b  reason: collision with root package name */
    public final SerialDescriptor f42123b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HashSetSerializer(KSerializer kSerializer) {
        super(kSerializer);
        Intrinsics.i(kSerializer, "eSerializer");
        this.f42123b = new HashSetClassDesc(kSerializer.a());
    }

    /* renamed from: A */
    public Set q(HashSet hashSet) {
        Intrinsics.i(hashSet, "<this>");
        return hashSet;
    }

    public SerialDescriptor a() {
        return this.f42123b;
    }

    /* renamed from: v */
    public HashSet f() {
        return new HashSet();
    }

    /* renamed from: w */
    public int g(HashSet hashSet) {
        Intrinsics.i(hashSet, "<this>");
        return hashSet.size();
    }

    /* renamed from: x */
    public void h(HashSet hashSet, int i2) {
        Intrinsics.i(hashSet, "<this>");
    }

    /* renamed from: y */
    public void s(HashSet hashSet, int i2, Object obj) {
        Intrinsics.i(hashSet, "<this>");
        hashSet.add(obj);
    }

    /* renamed from: z */
    public HashSet p(Set set) {
        Intrinsics.i(set, "<this>");
        HashSet hashSet = set instanceof HashSet ? (HashSet) set : null;
        return hashSet == null ? new HashSet(set) : hashSet;
    }
}
