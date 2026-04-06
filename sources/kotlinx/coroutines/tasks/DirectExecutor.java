package kotlinx.coroutines.tasks;

import java.util.concurrent.Executor;
import kotlin.Metadata;

@Metadata
final class DirectExecutor implements Executor {

    /* renamed from: z  reason: collision with root package name */
    public static final DirectExecutor f41989z = new DirectExecutor();

    public void execute(Runnable runnable) {
        runnable.run();
    }
}
