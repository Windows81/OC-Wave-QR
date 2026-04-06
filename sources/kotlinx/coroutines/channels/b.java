package kotlinx.coroutines.channels;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

public final /* synthetic */ class b implements Function3 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Object f41506A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function1 f41507z;

    public /* synthetic */ b(Function1 function1, Object obj) {
        this.f41507z = function1;
        this.f41506A = obj;
    }

    public final Object d(Object obj, Object obj2, Object obj3) {
        return BufferedChannel.T(this.f41507z, this.f41506A, (Throwable) obj, obj2, (CoroutineContext) obj3);
    }
}
