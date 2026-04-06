package kotlin.collections;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.ArrayIteratorsKt;
import kotlin.sequences.Sequence;

@Metadata
public final class ArraysKt___ArraysKt$asSequence$$inlined$Sequence$2 implements Sequence<Byte> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ byte[] f40601a;

    public Iterator iterator() {
        return ArrayIteratorsKt.b(this.f40601a);
    }
}
