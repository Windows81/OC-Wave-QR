package kotlinx.coroutines.selects;

import kotlin.Metadata;
import kotlinx.coroutines.CancellableContinuationImpl;

@Metadata
public final class UnbiasedSelectBuilderImpl<R> extends UnbiasedSelectImplementation<R> {
    public final CancellableContinuationImpl G;
}
