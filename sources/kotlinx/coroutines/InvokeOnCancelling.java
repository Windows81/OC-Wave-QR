package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata
final class InvokeOnCancelling extends JobNode {
    public static final /* synthetic */ AtomicIntegerFieldUpdater E = AtomicIntegerFieldUpdater.newUpdater(InvokeOnCancelling.class, "_invoked$volatile");
    public final Function1 D;
    private volatile /* synthetic */ int _invoked$volatile;

    public InvokeOnCancelling(Function1 function1) {
        this.D = function1;
    }

    public boolean w() {
        return true;
    }

    public void x(Throwable th) {
        if (E.compareAndSet(this, 0, 1)) {
            this.D.invoke(th);
        }
    }
}
