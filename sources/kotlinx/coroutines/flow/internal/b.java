package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class b implements Function2 {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ SafeCollector f41819z;

    public /* synthetic */ b(SafeCollector safeCollector) {
        this.f41819z = safeCollector;
    }

    public final Object m(Object obj, Object obj2) {
        return Integer.valueOf(SafeCollector_commonKt.c(this.f41819z, ((Integer) obj).intValue(), (CoroutineContext.Element) obj2));
    }
}
