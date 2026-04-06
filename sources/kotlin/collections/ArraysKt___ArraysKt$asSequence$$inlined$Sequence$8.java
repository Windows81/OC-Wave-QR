package kotlin.collections;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.ArrayIteratorsKt;
import kotlin.sequences.Sequence;

@Metadata
public final class ArraysKt___ArraysKt$asSequence$$inlined$Sequence$8 implements Sequence<Boolean> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ boolean[] f40607a;

    public Iterator iterator() {
        return ArrayIteratorsKt.a(this.f40607a);
    }
}
