package kotlinx.coroutines.internal;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class h implements Function2 {
    public final Object m(Object obj, Object obj2) {
        return ThreadContextKt.h((ThreadState) obj, (CoroutineContext.Element) obj2);
    }
}
