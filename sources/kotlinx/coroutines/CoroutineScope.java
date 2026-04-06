package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;

@Metadata
public interface CoroutineScope {
    CoroutineContext getCoroutineContext();
}
