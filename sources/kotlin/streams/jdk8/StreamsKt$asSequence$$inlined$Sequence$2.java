package kotlin.streams.jdk8;

import java.util.Iterator;
import java.util.PrimitiveIterator;
import java.util.stream.IntStream;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

@Metadata
public final class StreamsKt$asSequence$$inlined$Sequence$2 implements Sequence<Integer> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ IntStream f41108a;

    public Iterator iterator() {
        PrimitiveIterator.OfInt it = this.f41108a.iterator();
        Intrinsics.h(it, "iterator(...)");
        return it;
    }
}
