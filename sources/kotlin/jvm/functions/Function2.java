package kotlin.jvm.functions;

import kotlin.Function;
import kotlin.Metadata;

@Metadata
public interface Function2<P1, P2, R> extends Function<R> {
    Object m(Object obj, Object obj2);
}
