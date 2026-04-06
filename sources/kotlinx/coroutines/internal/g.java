package kotlinx.coroutines.internal;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.ThreadContextElement;

public final /* synthetic */ class g implements Function2 {
    public final Object m(Object obj, Object obj2) {
        return ThreadContextKt.e((ThreadContextElement) obj, (CoroutineContext.Element) obj2);
    }
}
