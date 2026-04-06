package kotlinx.serialization.internal;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@Metadata
public final class LinkedHashSetSerializer<E> extends CollectionSerializer<E, Set<? extends E>, LinkedHashSet<E>> {

    /* renamed from: b  reason: collision with root package name */
    public final SerialDescriptor f42136b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LinkedHashSetSerializer(KSerializer kSerializer) {
        super(kSerializer);
        Intrinsics.i(kSerializer, "eSerializer");
        this.f42136b = new LinkedHashSetClassDesc(kSerializer.a());
    }

    /* renamed from: A */
    public Set q(LinkedHashSet linkedHashSet) {
        Intrinsics.i(linkedHashSet, "<this>");
        return linkedHashSet;
    }

    public SerialDescriptor a() {
        return this.f42136b;
    }

    /* renamed from: v */
    public LinkedHashSet f() {
        return new LinkedHashSet();
    }

    /* renamed from: w */
    public int g(LinkedHashSet linkedHashSet) {
        Intrinsics.i(linkedHashSet, "<this>");
        return linkedHashSet.size();
    }

    /* renamed from: x */
    public void h(LinkedHashSet linkedHashSet, int i2) {
        Intrinsics.i(linkedHashSet, "<this>");
    }

    /* renamed from: y */
    public void s(LinkedHashSet linkedHashSet, int i2, Object obj) {
        Intrinsics.i(linkedHashSet, "<this>");
        linkedHashSet.add(obj);
    }

    /* renamed from: z */
    public LinkedHashSet p(Set set) {
        Intrinsics.i(set, "<this>");
        LinkedHashSet linkedHashSet = set instanceof LinkedHashSet ? (LinkedHashSet) set : null;
        return linkedHashSet == null ? new LinkedHashSet(set) : linkedHashSet;
    }
}
