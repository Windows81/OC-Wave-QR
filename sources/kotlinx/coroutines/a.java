package kotlinx.coroutines;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

public final /* synthetic */ class a implements Function3 {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function1 f41444z;

    public /* synthetic */ a(Function1 function1) {
        this.f41444z = function1;
    }

    public final Object d(Object obj, Object obj2, Object obj3) {
        return CancellableContinuationImpl.T(this.f41444z, (Throwable) obj, obj2, (CoroutineContext) obj3);
    }
}
