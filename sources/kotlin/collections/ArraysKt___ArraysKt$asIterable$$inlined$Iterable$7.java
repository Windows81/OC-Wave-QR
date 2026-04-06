package kotlin.collections;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.ArrayIteratorsKt;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata
public final class ArraysKt___ArraysKt$asIterable$$inlined$Iterable$7 implements Iterable<Double>, KMappedMarker {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ double[] f40597z;

    public Iterator iterator() {
        return ArrayIteratorsKt.d(this.f40597z);
    }
}
