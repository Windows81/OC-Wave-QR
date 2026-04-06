package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlinx.coroutines.CoroutineScope;

@Metadata
public interface ActorScope<E> extends CoroutineScope, ReceiveChannel<E> {

    @Metadata
    public static final class DefaultImpls {
    }
}
