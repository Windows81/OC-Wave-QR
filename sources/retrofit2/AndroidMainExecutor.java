package retrofit2;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

final class AndroidMainExecutor implements Executor {

    /* renamed from: z  reason: collision with root package name */
    public final Handler f44117z = new Handler(Looper.getMainLooper());

    public void execute(Runnable runnable) {
        this.f44117z.post(runnable);
    }
}
