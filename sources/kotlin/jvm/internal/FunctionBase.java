package kotlin.jvm.internal;

import kotlin.Function;
import kotlin.Metadata;

@Metadata
public interface FunctionBase<R> extends Function<R> {
    int getArity();
}
