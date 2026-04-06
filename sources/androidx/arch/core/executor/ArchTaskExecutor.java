package androidx.arch.core.executor;

import java.util.concurrent.Executor;

public class ArchTaskExecutor extends TaskExecutor {

    /* renamed from: c  reason: collision with root package name */
    public static volatile ArchTaskExecutor f1379c;

    /* renamed from: d  reason: collision with root package name */
    public static final Executor f1380d = new a();

    /* renamed from: e  reason: collision with root package name */
    public static final Executor f1381e = new b();

    /* renamed from: a  reason: collision with root package name */
    public TaskExecutor f1382a;

    /* renamed from: b  reason: collision with root package name */
    public final TaskExecutor f1383b;

    public ArchTaskExecutor() {
        DefaultTaskExecutor defaultTaskExecutor = new DefaultTaskExecutor();
        this.f1383b = defaultTaskExecutor;
        this.f1382a = defaultTaskExecutor;
    }

    public static ArchTaskExecutor f() {
        if (f1379c != null) {
            return f1379c;
        }
        synchronized (ArchTaskExecutor.class) {
            try {
                if (f1379c == null) {
                    f1379c = new ArchTaskExecutor();
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        return f1379c;
    }

    public void a(Runnable runnable) {
        this.f1382a.a(runnable);
    }

    public boolean b() {
        return this.f1382a.b();
    }

    public void c(Runnable runnable) {
        this.f1382a.c(runnable);
    }
}
