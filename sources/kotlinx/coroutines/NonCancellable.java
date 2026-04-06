package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

@Metadata
public final class NonCancellable extends AbstractCoroutineContextElement implements Job {

    /* renamed from: A  reason: collision with root package name */
    public static final NonCancellable f41432A = new NonCancellable();

    public NonCancellable() {
        super(Job.f41415x);
    }

    public Object D(Continuation continuation) {
        throw new UnsupportedOperationException("This job is always active");
    }

    public DisposableHandle E(boolean z2, boolean z3, Function1 function1) {
        return NonDisposableHandle.f41433z;
    }

    public CancellationException F() {
        throw new IllegalStateException("This job is always active");
    }

    public DisposableHandle S(Function1 function1) {
        return NonDisposableHandle.f41433z;
    }

    public boolean b() {
        return true;
    }

    public void c(CancellationException cancellationException) {
    }

    public boolean isCancelled() {
        return false;
    }

    public ChildHandle s0(ChildJob childJob) {
        return NonDisposableHandle.f41433z;
    }

    public boolean start() {
        return false;
    }

    public boolean t() {
        return false;
    }

    public String toString() {
        return "NonCancellable";
    }
}
