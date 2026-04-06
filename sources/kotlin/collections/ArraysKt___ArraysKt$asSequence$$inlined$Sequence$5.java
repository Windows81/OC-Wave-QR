package kotlin.collections;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.ArrayIteratorsKt;
import kotlin.sequences.Sequence;

@Metadata
public final class ArraysKt___ArraysKt$asSequence$$inlined$Sequence$5 implements Sequence<Long> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ long[] f40604a;

    public Iterator iterator() {
        return ArrayIteratorsKt.g(this.f40604a);
    }
}
