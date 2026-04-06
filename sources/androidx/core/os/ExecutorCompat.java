package androidx.core.os;

import android.os.Handler;
import androidx.core.util.Preconditions;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

public final class ExecutorCompat {

    public static class HandlerExecutor implements Executor {

        /* renamed from: z  reason: collision with root package name */
        public final Handler f19955z;

        public void execute(Runnable runnable) {
            if (!this.f19955z.post((Runnable) Preconditions.f(runnable))) {
                throw new RejectedExecutionException(this.f19955z + " is shutting down");
            }
        }
    }
}
