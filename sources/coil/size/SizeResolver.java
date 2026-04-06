package coil.size;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;

@Metadata
public interface SizeResolver {
    Object c(Continuation continuation);
}
