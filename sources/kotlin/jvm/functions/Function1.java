package kotlin.jvm.functions;

import kotlin.Function;
import kotlin.Metadata;

@Metadata
public interface Function1<P1, R> extends Function<R> {
    Object invoke(Object obj);
}
