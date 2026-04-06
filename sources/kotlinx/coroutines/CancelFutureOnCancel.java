package kotlinx.coroutines;

import java.util.concurrent.Future;
import kotlin.Metadata;

@Metadata
final class CancelFutureOnCancel implements CancelHandler {

    /* renamed from: z  reason: collision with root package name */
    public final Future f41366z;

    public CancelFutureOnCancel(Future future) {
        this.f41366z = future;
    }

    public void e(Throwable th) {
        this.f41366z.cancel(false);
    }

    public String toString() {
        return "CancelFutureOnCancel[" + this.f41366z + ']';
    }
}
