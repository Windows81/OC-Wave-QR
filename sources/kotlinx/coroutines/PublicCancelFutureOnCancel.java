package kotlinx.coroutines;

import java.util.concurrent.Future;
import kotlin.Metadata;

@Metadata
final class PublicCancelFutureOnCancel implements CancelHandler {

    /* renamed from: z  reason: collision with root package name */
    public final Future f41434z;

    public void e(Throwable th) {
        if (th != null) {
            this.f41434z.cancel(false);
        }
    }

    public String toString() {
        return "CancelFutureOnCancel[" + this.f41434z + ']';
    }
}
