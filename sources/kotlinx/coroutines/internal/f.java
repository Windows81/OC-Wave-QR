package kotlinx.coroutines.internal;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class f implements Function2 {
    public final Object m(Object obj, Object obj2) {
        return ThreadContextKt.d(obj, (CoroutineContext.Element) obj2);
    }
}
