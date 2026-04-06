package kotlin.collections;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.ArrayIteratorsKt;
import kotlin.sequences.Sequence;

@Metadata
public final class ArraysKt___ArraysKt$asSequence$$inlined$Sequence$9 implements Sequence<Character> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ char[] f40608a;

    public Iterator iterator() {
        return ArrayIteratorsKt.c(this.f40608a);
    }
}
