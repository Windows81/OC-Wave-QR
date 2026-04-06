package kotlin.collections;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.ArrayIteratorsKt;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata
public final class ArraysKt___ArraysKt$asIterable$$inlined$Iterable$8 implements Iterable<Boolean>, KMappedMarker {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ boolean[] f40598z;

    public Iterator iterator() {
        return ArrayIteratorsKt.a(this.f40598z);
    }
}
