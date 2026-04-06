package kotlin.collections;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata
public final class ArraysKt___ArraysKt$asIterable$$inlined$Iterable$1 implements Iterable<Object>, KMappedMarker {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Object[] f40591z;

    public ArraysKt___ArraysKt$asIterable$$inlined$Iterable$1(Object[] objArr) {
        this.f40591z = objArr;
    }

    public Iterator iterator() {
        return ArrayIteratorKt.a(this.f40591z);
    }
}
