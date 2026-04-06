package kotlinx.coroutines;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class b implements Function2 {
    public final Object m(Object obj, Object obj2) {
        return Boolean.valueOf(CoroutineContextKt.i(((Boolean) obj).booleanValue(), (CoroutineContext.Element) obj2));
    }
}
