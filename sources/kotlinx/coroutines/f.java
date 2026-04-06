package kotlinx.coroutines;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;

public final /* synthetic */ class f implements Function1 {
    public final Object invoke(Object obj) {
        return ExecutorCoroutineDispatcher.Key.d((CoroutineContext.Element) obj);
    }
}
