package kotlin.sequences;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata
public final class FlatteningSequence<T, R, E> implements Sequence<E> {

    /* renamed from: a  reason: collision with root package name */
    public final Sequence f41028a;

    /* renamed from: b  reason: collision with root package name */
    public final Function1 f41029b;

    /* renamed from: c  reason: collision with root package name */
    public final Function1 f41030c;

    @Metadata
    public static final class State {

        /* renamed from: a  reason: collision with root package name */
        public static final State f41031a = new State();
    }

    public Iterator iterator() {
        return new FlatteningSequence$iterator$1(this);
    }
}
