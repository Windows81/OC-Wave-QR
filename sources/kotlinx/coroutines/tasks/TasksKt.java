package kotlinx.coroutines.tasks;

import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlinx.coroutines.CancellableContinuationImpl;

@Metadata
public final class TasksKt {
    public static final Object a(Task task, Continuation continuation) {
        return b(task, (CancellationTokenSource) null, continuation);
    }

    public static final Object b(Task task, CancellationTokenSource cancellationTokenSource, Continuation continuation) {
        if (task.m()) {
            Exception j2 = task.j();
            if (j2 != null) {
                throw j2;
            } else if (!task.l()) {
                return task.k();
            } else {
                throw new CancellationException("Task " + task + " was cancelled normally.");
            }
        } else {
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.c(continuation), 1);
            cancellableContinuationImpl.G();
            task.c(DirectExecutor.f41989z, new TasksKt$awaitImpl$2$1(cancellableContinuationImpl));
            if (cancellationTokenSource != null) {
                cancellableContinuationImpl.u(new TasksKt$awaitImpl$2$2(cancellationTokenSource));
            }
            Object A2 = cancellableContinuationImpl.A();
            if (A2 == IntrinsicsKt.f()) {
                DebugProbesKt.c(continuation);
            }
            return A2;
        }
    }
}
