package kotlinx.coroutines.channels;

import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.selects.SelectInstance;

public final /* synthetic */ class a implements Function3 {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ BufferedChannel f41505z;

    public /* synthetic */ a(BufferedChannel bufferedChannel) {
        this.f41505z = bufferedChannel;
    }

    public final Object d(Object obj, Object obj2, Object obj3) {
        return BufferedChannel.Y0(this.f41505z, (SelectInstance) obj, obj2, obj3);
    }
}
