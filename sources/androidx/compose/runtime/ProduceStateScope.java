package androidx.compose.runtime;

import kotlin.Metadata;
import kotlinx.coroutines.CoroutineScope;

@Metadata
public interface ProduceStateScope<T> extends MutableState<T>, CoroutineScope {
}
