package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot;

@Metadata
public final class SharedFlowSlot extends AbstractSharedFlowSlot<SharedFlowImpl<?>> {

    /* renamed from: a  reason: collision with root package name */
    public long f41752a = -1;

    /* renamed from: b  reason: collision with root package name */
    public Continuation f41753b;

    /* renamed from: c */
    public boolean a(SharedFlowImpl sharedFlowImpl) {
        if (this.f41752a >= 0) {
            return false;
        }
        this.f41752a = sharedFlowImpl.Z();
        return true;
    }

    /* renamed from: d */
    public Continuation[] b(SharedFlowImpl sharedFlowImpl) {
        long j2 = this.f41752a;
        this.f41752a = -1;
        this.f41753b = null;
        return sharedFlowImpl.Y(j2);
    }
}
