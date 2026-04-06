package kotlinx.coroutines.sync;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function3;

public final /* synthetic */ class b implements Function3 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Object f41982A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ MutexImpl f41983z;

    public /* synthetic */ b(MutexImpl mutexImpl, Object obj) {
        this.f41983z = mutexImpl;
        this.f41982A = obj;
    }

    public final Object d(Object obj, Object obj2, Object obj3) {
        return MutexImpl.J(this.f41983z, this.f41982A, (Throwable) obj, obj2, (CoroutineContext) obj3);
    }
}
