package kotlin.streams.jdk8;

import java.util.Iterator;
import java.util.PrimitiveIterator;
import java.util.stream.DoubleStream;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

@Metadata
public final class StreamsKt$asSequence$$inlined$Sequence$4 implements Sequence<Double> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ DoubleStream f41110a;

    public Iterator iterator() {
        PrimitiveIterator.OfDouble it = this.f41110a.iterator();
        Intrinsics.h(it, "iterator(...)");
        return it;
    }
}
