package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlinx.coroutines.Waiter;

@Metadata
final class WaiterEB {

    /* renamed from: a  reason: collision with root package name */
    public final Waiter f41504a;

    public WaiterEB(Waiter waiter) {
        this.f41504a = waiter;
    }

    public String toString() {
        return "WaiterEB(" + this.f41504a + ')';
    }
}
