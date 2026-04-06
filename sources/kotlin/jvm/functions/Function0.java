package kotlin.jvm.functions;

import kotlin.Function;
import kotlin.Metadata;

@Metadata
public interface Function0<R> extends Function<R> {
    Object invoke();
}
