package androidx.profileinstaller;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import androidx.compose.foundation.text.UndoManagerKt;
import androidx.startup.Initializer;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ProfileInstallerInitializer implements Initializer<Result> {

    public static class Handler28Impl {
        public static Handler a(Looper looper) {
            return Handler.createAsync(looper);
        }
    }

    public static class Result {
    }

    public static void k(Context context) {
        new ThreadPoolExecutor(0, 1, 0, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new e(context));
    }

    public List a() {
        return Collections.emptyList();
    }

    /* renamed from: f */
    public Result b(Context context) {
        Choreographer.getInstance().postFrameCallback(new c(this, context.getApplicationContext()));
        return new Result();
    }

    public void g(Context context) {
        (Build.VERSION.SDK_INT >= 28 ? Handler28Impl.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new d(context), (long) (new Random().nextInt(Math.max(1000, 1)) + UndoManagerKt.f6027a));
    }

    public final /* synthetic */ void h(Context context, long j2) {
        g(context);
    }
}
