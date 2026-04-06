package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;

@Metadata
public interface Deferred<T> extends Job {

    @Metadata
    public static final class DefaultImpls {
    }

    Object G(Continuation continuation);

    Object m();
}
