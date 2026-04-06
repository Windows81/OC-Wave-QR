package kotlin.reflect;

import kotlin.Function;
import kotlin.Metadata;

@Metadata
public interface KFunction<R> extends KCallable<R>, Function<R> {

    @Metadata
    public static final class DefaultImpls {
    }
}
