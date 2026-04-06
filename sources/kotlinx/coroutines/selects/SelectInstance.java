package kotlinx.coroutines.selects;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.DisposableHandle;

@Metadata
public interface SelectInstance<R> {
    void a(DisposableHandle disposableHandle);

    boolean d(Object obj, Object obj2);

    CoroutineContext f();

    void h(Object obj);
}
