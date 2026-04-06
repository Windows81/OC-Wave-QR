package kotlinx.coroutines.channels;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.selects.SelectInstance;

public final /* synthetic */ class c implements Function3 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ BufferedChannel f41508A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ SelectInstance f41509B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Object f41510z;

    public /* synthetic */ c(Object obj, BufferedChannel bufferedChannel, SelectInstance selectInstance) {
        this.f41510z = obj;
        this.f41508A = bufferedChannel;
        this.f41509B = selectInstance;
    }

    public final Object d(Object obj, Object obj2, Object obj3) {
        return BufferedChannel.Z0(this.f41510z, this.f41508A, this.f41509B, (Throwable) obj, obj2, (CoroutineContext) obj3);
    }
}
