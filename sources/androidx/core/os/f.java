package androidx.core.os;

import java.util.concurrent.Executor;

public final /* synthetic */ class f implements Executor {
    public final void execute(Runnable runnable) {
        Profiling$registerForAllProfilingResults$1.E(runnable);
    }
}
