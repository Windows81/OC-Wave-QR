package kotlinx.coroutines;

import java.util.concurrent.Future;
import kotlin.Metadata;

@Metadata
final class DisposableFutureHandle implements DisposableHandle {

    /* renamed from: z  reason: collision with root package name */
    public final Future f41400z;

    public DisposableFutureHandle(Future future) {
        this.f41400z = future;
    }

    public void d() {
        this.f41400z.cancel(false);
    }

    public String toString() {
        return "DisposableFutureHandle[" + this.f41400z + ']';
    }
}
