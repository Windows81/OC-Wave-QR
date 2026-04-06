package kotlinx.coroutines.tasks;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.ChildHandle;
import kotlinx.coroutines.ChildJob;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.DisposableHandle;

@Metadata
public final class TasksKt$asDeferredImpl$3 implements Deferred<Object> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ CompletableDeferred f41990z;

    public Object D(Continuation continuation) {
        return this.f41990z.D(continuation);
    }

    public DisposableHandle E(boolean z2, boolean z3, Function1 function1) {
        return this.f41990z.E(z2, z3, function1);
    }

    public CancellationException F() {
        return this.f41990z.F();
    }

    public Object G(Continuation continuation) {
        return this.f41990z.G(continuation);
    }

    public DisposableHandle S(Function1 function1) {
        return this.f41990z.S(function1);
    }

    public boolean b() {
        return this.f41990z.b();
    }

    public void c(CancellationException cancellationException) {
        this.f41990z.c(cancellationException);
    }

    public CoroutineContext.Element d(CoroutineContext.Key key) {
        return this.f41990z.d(key);
    }

    public CoroutineContext g(CoroutineContext.Key key) {
        return this.f41990z.g(key);
    }

    public CoroutineContext.Key getKey() {
        return this.f41990z.getKey();
    }

    public boolean isCancelled() {
        return this.f41990z.isCancelled();
    }

    public Object k(Object obj, Function2 function2) {
        return this.f41990z.k(obj, function2);
    }

    public Object m() {
        return this.f41990z.m();
    }

    public ChildHandle s0(ChildJob childJob) {
        return this.f41990z.s0(childJob);
    }

    public boolean start() {
        return this.f41990z.start();
    }

    public boolean t() {
        return this.f41990z.t();
    }

    public CoroutineContext y(CoroutineContext coroutineContext) {
        return this.f41990z.y(coroutineContext);
    }
}
