package kotlinx.coroutines.tasks;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlinx.coroutines.CancellableContinuation;

@Metadata
public final class TasksKt$awaitImpl$2$1<TResult> implements OnCompleteListener {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ CancellableContinuation f41991z;

    public TasksKt$awaitImpl$2$1(CancellableContinuation cancellableContinuation) {
        this.f41991z = cancellableContinuation;
    }

    public final void a(Task task) {
        Exception j2 = task.j();
        if (j2 != null) {
            CancellableContinuation cancellableContinuation = this.f41991z;
            Result.Companion companion = Result.f40519A;
            cancellableContinuation.q(Result.b(ResultKt.a(j2)));
        } else if (task.l()) {
            CancellableContinuation.DefaultImpls.a(this.f41991z, (Throwable) null, 1, (Object) null);
        } else {
            CancellableContinuation cancellableContinuation2 = this.f41991z;
            Result.Companion companion2 = Result.f40519A;
            cancellableContinuation2.q(Result.b(task.k()));
        }
    }
}
