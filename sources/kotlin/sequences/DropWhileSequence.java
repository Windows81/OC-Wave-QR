package kotlin.sequences;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata
public final class DropWhileSequence<T> implements Sequence<T> {

    /* renamed from: a  reason: collision with root package name */
    public final Sequence f41016a;

    /* renamed from: b  reason: collision with root package name */
    public final Function1 f41017b;

    public Iterator iterator() {
        return new DropWhileSequence$iterator$1(this);
    }
}
