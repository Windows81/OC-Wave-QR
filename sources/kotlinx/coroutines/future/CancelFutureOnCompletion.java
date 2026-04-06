package kotlinx.coroutines.future;

import java.util.concurrent.Future;
import kotlin.Metadata;
import kotlinx.coroutines.JobNode;

@Metadata
final class CancelFutureOnCompletion extends JobNode {
    public final Future D;

    public boolean w() {
        return false;
    }

    public void x(Throwable th) {
        if (th != null && !this.D.isDone()) {
            this.D.cancel(false);
        }
    }
}
