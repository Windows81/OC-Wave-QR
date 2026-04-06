package kotlin.collections;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.ArrayIteratorsKt;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata
public final class ArraysKt___ArraysKt$asIterable$$inlined$Iterable$5 implements Iterable<Long>, KMappedMarker {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ long[] f40595z;

    public Iterator iterator() {
        return ArrayIteratorsKt.g(this.f40595z);
    }
}
