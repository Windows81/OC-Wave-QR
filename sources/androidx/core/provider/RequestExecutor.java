package androidx.core.provider;

import android.os.Handler;
import android.os.Process;
import androidx.core.util.Consumer;
import androidx.core.util.Preconditions;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

class RequestExecutor {

    public static class DefaultThreadFactory implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        public String f20024a;

        /* renamed from: b  reason: collision with root package name */
        public int f20025b;

        public static class ProcessPriorityThread extends Thread {

            /* renamed from: z  reason: collision with root package name */
            public final int f20026z;

            public ProcessPriorityThread(Runnable runnable, String str, int i2) {
                super(runnable, str);
                this.f20026z = i2;
            }

            public void run() {
                Process.setThreadPriority(this.f20026z);
                super.run();
            }
        }

        public DefaultThreadFactory(String str, int i2) {
            this.f20024a = str;
            this.f20025b = i2;
        }

        public Thread newThread(Runnable runnable) {
            return new ProcessPriorityThread(runnable, this.f20024a, this.f20025b);
        }
    }

    public static class HandlerExecutor implements Executor {

        /* renamed from: z  reason: collision with root package name */
        public final Handler f20027z;

        public HandlerExecutor(Handler handler) {
            this.f20027z = (Handler) Preconditions.f(handler);
        }

        public void execute(Runnable runnable) {
            if (!this.f20027z.post((Runnable) Preconditions.f(runnable))) {
                throw new RejectedExecutionException(this.f20027z + " is shutting down");
            }
        }
    }

    public static class ReplyRunnable<T> implements Runnable {

        /* renamed from: A  reason: collision with root package name */
        public Consumer f20028A;

        /* renamed from: B  reason: collision with root package name */
        public Handler f20029B;

        /* renamed from: z  reason: collision with root package name */
        public Callable f20030z;

        public ReplyRunnable(Handler handler, Callable callable, Consumer consumer) {
            this.f20030z = callable;
            this.f20028A = consumer;
            this.f20029B = handler;
        }

        public void run() {
            final Object obj;
            try {
                obj = this.f20030z.call();
            } catch (Exception unused) {
                obj = null;
            }
            final Consumer consumer = this.f20028A;
            this.f20029B.post(new Runnable() {
                public void run() {
                    consumer.accept(obj);
                }
            });
        }
    }

    public static ThreadPoolExecutor a(String str, int i2, int i3) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, (long) i3, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new DefaultThreadFactory(str, i2));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    public static Executor b(Handler handler) {
        return new HandlerExecutor(handler);
    }

    public static void c(Executor executor, Callable callable, Consumer consumer) {
        executor.execute(new ReplyRunnable(CalleeHandler.a(), callable, consumer));
    }

    public static Object d(ExecutorService executorService, Callable callable, int i2) {
        try {
            return executorService.submit(callable).get((long) i2, TimeUnit.MILLISECONDS);
        } catch (ExecutionException e2) {
            throw new RuntimeException(e2);
        } catch (InterruptedException e3) {
            throw e3;
        } catch (TimeoutException unused) {
            throw new InterruptedException("timeout");
        }
    }
}
