package kotlin.sequences;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.EmptyIterator;

@Metadata
final class EmptySequence implements Sequence, DropTakeSequence {

    /* renamed from: a  reason: collision with root package name */
    public static final EmptySequence f41021a = new EmptySequence();

    /* renamed from: b */
    public EmptySequence a(int i2) {
        return f41021a;
    }

    public Iterator iterator() {
        return EmptyIterator.f40614z;
    }
}
