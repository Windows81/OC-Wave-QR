package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;

@Metadata
public interface CopyableThreadContextElement<S> extends ThreadContextElement<S> {

    @Metadata
    public static final class DefaultImpls {
    }

    CopyableThreadContextElement T();

    CoroutineContext x(CoroutineContext.Element element);
}
