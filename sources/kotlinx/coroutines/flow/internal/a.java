package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class a implements Function2 {
    public final Object m(Object obj, Object obj2) {
        return Integer.valueOf(SafeCollector.C(((Integer) obj).intValue(), (CoroutineContext.Element) obj2));
    }
}
