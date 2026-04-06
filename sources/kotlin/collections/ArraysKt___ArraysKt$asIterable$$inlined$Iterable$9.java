package kotlin.collections;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.ArrayIteratorsKt;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata
public final class ArraysKt___ArraysKt$asIterable$$inlined$Iterable$9 implements Iterable<Character>, KMappedMarker {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ char[] f40599z;

    public Iterator iterator() {
        return ArrayIteratorsKt.c(this.f40599z);
    }
}
