package kotlin.collections;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.ArrayIteratorsKt;
import kotlin.sequences.Sequence;

@Metadata
public final class ArraysKt___ArraysKt$asSequence$$inlined$Sequence$7 implements Sequence<Double> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ double[] f40606a;

    public Iterator iterator() {
        return ArrayIteratorsKt.d(this.f40606a);
    }
}
