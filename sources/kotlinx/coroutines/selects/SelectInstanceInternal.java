package kotlinx.coroutines.selects;

import kotlin.Metadata;
import kotlinx.coroutines.Waiter;

@Metadata
public interface SelectInstanceInternal<R> extends SelectInstance<R>, Waiter {
}
