package com.google.common.util.concurrent;

import com.google.common.base.Preconditions;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

@ElementTypesAreNonnullByDefault
public final class ExecutionList {

    /* renamed from: c  reason: collision with root package name */
    public static final Logger f29476c = Logger.getLogger(ExecutionList.class.getName());

    /* renamed from: a  reason: collision with root package name */
    public RunnableExecutorPair f29477a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f29478b;

    public static final class RunnableExecutorPair {

        /* renamed from: a  reason: collision with root package name */
        public final Runnable f29479a;

        /* renamed from: b  reason: collision with root package name */
        public final Executor f29480b;

        /* renamed from: c  reason: collision with root package name */
        public RunnableExecutorPair f29481c;

        public RunnableExecutorPair(Runnable runnable, Executor executor, RunnableExecutorPair runnableExecutorPair) {
            this.f29479a = runnable;
            this.f29480b = executor;
            this.f29481c = runnableExecutorPair;
        }
    }

    public static void c(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e2) {
            Logger logger = f29476c;
            Level level = Level.SEVERE;
            String valueOf = String.valueOf(runnable);
            String valueOf2 = String.valueOf(executor);
            StringBuilder sb = new StringBuilder(valueOf.length() + 57 + valueOf2.length());
            sb.append("RuntimeException while executing runnable ");
            sb.append(valueOf);
            sb.append(" with executor ");
            sb.append(valueOf2);
            logger.log(level, sb.toString(), e2);
        }
    }

    public void a(Runnable runnable, Executor executor) {
        Preconditions.r(runnable, "Runnable was null.");
        Preconditions.r(executor, "Executor was null.");
        synchronized (this) {
            try {
                if (!this.f29478b) {
                    this.f29477a = new RunnableExecutorPair(runnable, executor, this.f29477a);
                } else {
                    c(runnable, executor);
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0012, code lost:
        if (r0 == null) goto L_0x001b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0014, code lost:
        r2 = r0.f29481c;
        r0.f29481c = r1;
        r1 = r0;
        r0 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001b, code lost:
        if (r1 == null) goto L_0x0027;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001d, code lost:
        c(r1.f29479a, r1.f29480b);
        r1 = r1.f29481c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0027, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b() {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.f29478b     // Catch:{ all -> 0x0007 }
            if (r0 == 0) goto L_0x0009
            monitor-exit(r3)     // Catch:{ all -> 0x0007 }
            return
        L_0x0007:
            r0 = move-exception
            goto L_0x0028
        L_0x0009:
            r0 = 1
            r3.f29478b = r0     // Catch:{ all -> 0x0007 }
            com.google.common.util.concurrent.ExecutionList$RunnableExecutorPair r0 = r3.f29477a     // Catch:{ all -> 0x0007 }
            r1 = 0
            r3.f29477a = r1     // Catch:{ all -> 0x0007 }
            monitor-exit(r3)     // Catch:{ all -> 0x0007 }
        L_0x0012:
            if (r0 == 0) goto L_0x001b
            com.google.common.util.concurrent.ExecutionList$RunnableExecutorPair r2 = r0.f29481c
            r0.f29481c = r1
            r1 = r0
            r0 = r2
            goto L_0x0012
        L_0x001b:
            if (r1 == 0) goto L_0x0027
            java.lang.Runnable r0 = r1.f29479a
            java.util.concurrent.Executor r2 = r1.f29480b
            c(r0, r2)
            com.google.common.util.concurrent.ExecutionList$RunnableExecutorPair r1 = r1.f29481c
            goto L_0x001b
        L_0x0027:
            return
        L_0x0028:
            monitor-exit(r3)     // Catch:{ all -> 0x0007 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.util.concurrent.ExecutionList.b():void");
    }
}
