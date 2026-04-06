package kotlinx.coroutines.sync;

import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.selects.SelectInstance;

public final /* synthetic */ class a implements Function3 {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ MutexImpl f41981z;

    public /* synthetic */ a(MutexImpl mutexImpl) {
        this.f41981z = mutexImpl;
    }

    public final Object d(Object obj, Object obj2, Object obj3) {
        return MutexImpl.I(this.f41981z, (SelectInstance) obj, obj2, obj3);
    }
}
