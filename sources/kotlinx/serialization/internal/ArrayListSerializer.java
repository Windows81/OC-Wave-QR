package kotlinx.serialization.internal;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.InternalSerializationApi;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@Metadata
@InternalSerializationApi
public final class ArrayListSerializer<E> extends CollectionSerializer<E, List<? extends E>, ArrayList<E>> {

    /* renamed from: b  reason: collision with root package name */
    public final SerialDescriptor f42069b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ArrayListSerializer(KSerializer kSerializer) {
        super(kSerializer);
        Intrinsics.i(kSerializer, "element");
        this.f42069b = new ArrayListClassDesc(kSerializer.a());
    }

    /* renamed from: A */
    public List q(ArrayList arrayList) {
        Intrinsics.i(arrayList, "<this>");
        return arrayList;
    }

    public SerialDescriptor a() {
        return this.f42069b;
    }

    /* renamed from: v */
    public ArrayList f() {
        return new ArrayList();
    }

    /* renamed from: w */
    public int g(ArrayList arrayList) {
        Intrinsics.i(arrayList, "<this>");
        return arrayList.size();
    }

    /* renamed from: x */
    public void h(ArrayList arrayList, int i2) {
        Intrinsics.i(arrayList, "<this>");
        arrayList.ensureCapacity(i2);
    }

    /* renamed from: y */
    public void s(ArrayList arrayList, int i2, Object obj) {
        Intrinsics.i(arrayList, "<this>");
        arrayList.add(i2, obj);
    }

    /* renamed from: z */
    public ArrayList p(List list) {
        Intrinsics.i(list, "<this>");
        ArrayList arrayList = list instanceof ArrayList ? (ArrayList) list : null;
        return arrayList == null ? new ArrayList(list) : arrayList;
    }
}
