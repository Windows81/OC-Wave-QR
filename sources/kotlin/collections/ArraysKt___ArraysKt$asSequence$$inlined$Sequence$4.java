package kotlin.collections;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.ArrayIteratorsKt;
import kotlin.sequences.Sequence;

@Metadata
public final class ArraysKt___ArraysKt$asSequence$$inlined$Sequence$4 implements Sequence<Integer> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int[] f40603a;

    public Iterator iterator() {
        return ArrayIteratorsKt.f(this.f40603a);
    }
}
