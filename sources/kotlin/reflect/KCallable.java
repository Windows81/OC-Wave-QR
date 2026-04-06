package kotlin.reflect;

import kotlin.Metadata;

@Metadata
public interface KCallable<R> extends KAnnotatedElement {

    @Metadata
    public static final class DefaultImpls {
    }

    String getName();

    Object k(Object... objArr);
}
