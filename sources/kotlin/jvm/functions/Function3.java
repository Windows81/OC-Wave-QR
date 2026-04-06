package kotlin.jvm.functions;

import kotlin.Function;
import kotlin.Metadata;

@Metadata
public interface Function3<P1, P2, P3, R> extends Function<R> {
    Object d(Object obj, Object obj2, Object obj3);
}
