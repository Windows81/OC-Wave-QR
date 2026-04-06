package kotlinx.serialization.internal;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@Metadata
public final class ReferenceArraySerializer<ElementKlass, Element extends ElementKlass> extends CollectionLikeSerializer<Element, Element[], ArrayList<Element>> {

    /* renamed from: b  reason: collision with root package name */
    public final KClass f42187b;

    /* renamed from: c  reason: collision with root package name */
    public final SerialDescriptor f42188c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReferenceArraySerializer(KClass kClass, KSerializer kSerializer) {
        super(kSerializer, (DefaultConstructorMarker) null);
        Intrinsics.i(kClass, "kClass");
        Intrinsics.i(kSerializer, "eSerializer");
        this.f42187b = kClass;
        this.f42188c = new ArrayClassDesc(kSerializer.a());
    }

    /* renamed from: A */
    public Object[] q(ArrayList arrayList) {
        Intrinsics.i(arrayList, "<this>");
        return PlatformKt.r(arrayList, this.f42187b);
    }

    public SerialDescriptor a() {
        return this.f42188c;
    }

    /* renamed from: t */
    public ArrayList f() {
        return new ArrayList();
    }

    /* renamed from: u */
    public int g(ArrayList arrayList) {
        Intrinsics.i(arrayList, "<this>");
        return arrayList.size();
    }

    /* renamed from: v */
    public void h(ArrayList arrayList, int i2) {
        Intrinsics.i(arrayList, "<this>");
        arrayList.ensureCapacity(i2);
    }

    /* renamed from: w */
    public Iterator i(Object[] objArr) {
        Intrinsics.i(objArr, "<this>");
        return ArrayIteratorKt.a(objArr);
    }

    /* renamed from: x */
    public int j(Object[] objArr) {
        Intrinsics.i(objArr, "<this>");
        return objArr.length;
    }

    /* renamed from: y */
    public void s(ArrayList arrayList, int i2, Object obj) {
        Intrinsics.i(arrayList, "<this>");
        arrayList.add(i2, obj);
    }

    /* renamed from: z */
    public ArrayList p(Object[] objArr) {
        Intrinsics.i(objArr, "<this>");
        return new ArrayList(ArraysKt.d(objArr));
    }
}
