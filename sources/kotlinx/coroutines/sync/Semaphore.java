package kotlinx.coroutines.sync;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;

@Metadata
public interface Semaphore {
    Object c(Continuation continuation);

    void g();
}
