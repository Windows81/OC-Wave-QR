package kotlinx.coroutines;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineDispatcher;

public final /* synthetic */ class e implements Function1 {
    public final Object invoke(Object obj) {
        return CoroutineDispatcher.Key.d((CoroutineContext.Element) obj);
    }
}
