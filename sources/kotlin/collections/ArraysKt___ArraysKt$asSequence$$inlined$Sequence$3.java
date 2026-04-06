package kotlin.collections;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.ArrayIteratorsKt;
import kotlin.sequences.Sequence;

@Metadata
public final class ArraysKt___ArraysKt$asSequence$$inlined$Sequence$3 implements Sequence<Short> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ short[] f40602a;

    public Iterator iterator() {
        return ArrayIteratorsKt.h(this.f40602a);
    }
}
