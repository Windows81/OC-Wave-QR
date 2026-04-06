package androidx.loader.content;

import android.os.Binder;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.util.Log;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

abstract class ModernAsyncTask<Params, Progress, Result> {
    public static final ThreadFactory E;
    public static final BlockingQueue F;
    public static final Executor G;
    public static InternalHandler H;
    public static volatile Executor I;

    /* renamed from: A  reason: collision with root package name */
    public final FutureTask f22131A;

    /* renamed from: B  reason: collision with root package name */
    public volatile Status f22132B = Status.PENDING;
    public final AtomicBoolean C = new AtomicBoolean();
    public final AtomicBoolean D = new AtomicBoolean();

    /* renamed from: z  reason: collision with root package name */
    public final WorkerRunnable f22133z;

    /* renamed from: androidx.loader.content.ModernAsyncTask$4  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass4 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f22137a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                androidx.loader.content.ModernAsyncTask$Status[] r0 = androidx.loader.content.ModernAsyncTask.Status.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f22137a = r0
                androidx.loader.content.ModernAsyncTask$Status r1 = androidx.loader.content.ModernAsyncTask.Status.RUNNING     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f22137a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.loader.content.ModernAsyncTask$Status r1 = androidx.loader.content.ModernAsyncTask.Status.FINISHED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.loader.content.ModernAsyncTask.AnonymousClass4.<clinit>():void");
        }
    }

    public static class AsyncTaskResult<Data> {

        /* renamed from: a  reason: collision with root package name */
        public final ModernAsyncTask f22138a;

        /* renamed from: b  reason: collision with root package name */
        public final Object[] f22139b;

        public AsyncTaskResult(ModernAsyncTask modernAsyncTask, Object... objArr) {
            this.f22138a = modernAsyncTask;
            this.f22139b = objArr;
        }
    }

    public static class InternalHandler extends Handler {
        public InternalHandler() {
            super(Looper.getMainLooper());
        }

        public void handleMessage(Message message) {
            AsyncTaskResult asyncTaskResult = (AsyncTaskResult) message.obj;
            int i2 = message.what;
            if (i2 == 1) {
                asyncTaskResult.f22138a.d(asyncTaskResult.f22139b[0]);
            } else if (i2 == 2) {
                asyncTaskResult.f22138a.k(asyncTaskResult.f22139b);
            }
        }
    }

    public enum Status {
        PENDING,
        RUNNING,
        FINISHED
    }

    public static abstract class WorkerRunnable<Params, Result> implements Callable<Result> {

        /* renamed from: a  reason: collision with root package name */
        public Object[] f22143a;
    }

    static {
        AnonymousClass1 r7 = new ThreadFactory() {

            /* renamed from: a  reason: collision with root package name */
            public final AtomicInteger f22134a = new AtomicInteger(1);

            public Thread newThread(Runnable runnable) {
                return new Thread(runnable, "ModernAsyncTask #" + this.f22134a.getAndIncrement());
            }
        };
        E = r7;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue(10);
        F = linkedBlockingQueue;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 128, 1, TimeUnit.SECONDS, linkedBlockingQueue, r7);
        G = threadPoolExecutor;
        I = threadPoolExecutor;
    }

    public ModernAsyncTask() {
        AnonymousClass2 r0 = new WorkerRunnable<Params, Result>() {
            public Object call() {
                ModernAsyncTask.this.D.set(true);
                Object obj = null;
                try {
                    Process.setThreadPriority(10);
                    obj = ModernAsyncTask.this.b(this.f22143a);
                    Binder.flushPendingCommands();
                    ModernAsyncTask.this.l(obj);
                    return obj;
                } catch (Throwable th) {
                    ModernAsyncTask.this.l(obj);
                    throw th;
                }
            }
        };
        this.f22133z = r0;
        this.f22131A = new FutureTask<Result>(r0) {
            public void done() {
                try {
                    ModernAsyncTask.this.m(get());
                } catch (InterruptedException e2) {
                    Log.w("AsyncTask", e2);
                } catch (ExecutionException e3) {
                    throw new RuntimeException("An error occurred while executing doInBackground()", e3.getCause());
                } catch (CancellationException unused) {
                    ModernAsyncTask.this.m((Object) null);
                } catch (Throwable th) {
                    throw new RuntimeException("An error occurred while executing doInBackground()", th);
                }
            }
        };
    }

    public static Handler e() {
        InternalHandler internalHandler;
        synchronized (ModernAsyncTask.class) {
            try {
                if (H == null) {
                    H = new InternalHandler();
                }
                internalHandler = H;
            } catch (Throwable th) {
                throw th;
            }
        }
        return internalHandler;
    }

    public final boolean a(boolean z2) {
        this.C.set(true);
        return this.f22131A.cancel(z2);
    }

    public abstract Object b(Object... objArr);

    public final ModernAsyncTask c(Executor executor, Object... objArr) {
        if (this.f22132B != Status.PENDING) {
            int i2 = AnonymousClass4.f22137a[this.f22132B.ordinal()];
            if (i2 == 1) {
                throw new IllegalStateException("Cannot execute task: the task is already running.");
            } else if (i2 != 2) {
                throw new IllegalStateException("We should never reach this state");
            } else {
                throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
            }
        } else {
            this.f22132B = Status.RUNNING;
            j();
            this.f22133z.f22143a = objArr;
            executor.execute(this.f22131A);
            return this;
        }
    }

    public void d(Object obj) {
        if (f()) {
            h(obj);
        } else {
            i(obj);
        }
        this.f22132B = Status.FINISHED;
    }

    public final boolean f() {
        return this.C.get();
    }

    public void g() {
    }

    public void h(Object obj) {
        g();
    }

    public void i(Object obj) {
    }

    public void j() {
    }

    public void k(Object... objArr) {
    }

    public Object l(Object obj) {
        e().obtainMessage(1, new AsyncTaskResult(this, obj)).sendToTarget();
        return obj;
    }

    public void m(Object obj) {
        if (!this.D.get()) {
            l(obj);
        }
    }
}
