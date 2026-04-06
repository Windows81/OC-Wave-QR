package kotlin.streams.jdk8;

import java.util.Iterator;
import java.util.PrimitiveIterator;
import java.util.stream.LongStream;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

@Metadata
public final class StreamsKt$asSequence$$inlined$Sequence$3 implements Sequence<Long> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ LongStream f41109a;

    public Iterator iterator() {
        PrimitiveIterator.OfLong it = this.f41109a.iterator();
        Intrinsics.h(it, "iterator(...)");
        return it;
    }
}
