package kotlin.streams.jdk8;

import java.util.Iterator;
import java.util.stream.Stream;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

@Metadata
public final class StreamsKt$asSequence$$inlined$Sequence$1 implements Sequence<Object> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Stream f41107a;

    public Iterator iterator() {
        Iterator it = this.f41107a.iterator();
        Intrinsics.h(it, "iterator(...)");
        return it;
    }
}
